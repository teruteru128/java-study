package com.github.teruteru128.primesearch.search;

import com.github.teruteru128.primesearch.gmp.Gmp;
import com.github.teruteru128.primesearch.gmp.Mr2fs;
import com.github.teruteru128.primesearch.gmp.Pfgw;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.random.RandomGenerator;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "search", description = {"うんち！"})
public class PrimeSearch implements Callable<Integer> {

  public static final Pattern UUID_PATTERN = Pattern.compile(
      "\\p{XDigit}{8}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{12}");
  private static final Logger logger = LoggerFactory.getLogger(PrimeSearch.class);
  private static final Arena auto = Arena.ofAuto();
  private static final String dbURL;

  static {
    dbURL = Objects.requireNonNull(System.getenv("DB_URL"), "$DB_URL NOT FOUND");
    if (dbURL.isEmpty()) {
      throw new ExceptionInInitializerError("$DB_URL IS EMPTY");
    }
  }

  @Option(names = {"--threads", "-t"}, paramLabel = "threads")
  private int threads = Math.max(1, Runtime.getRuntime().availableProcessors() - 1);

  @Parameters(description = "even number (text) file", paramLabel = "even number Path")
  private Path evenNumberPath;

  @Option(names = {"--shuffle", "-S"}, defaultValue = "false", paramLabel = "doShuffle")
  private boolean doShuffle;

  @Option(names = {"--stale-hours"}, paramLabel = "staleHours",
      description = "claimしてからこの時間(時間単位)結果が書き込まれない候補は、他クライアントが再claimできるようになる")
  private int staleHours = 24;

  @Option(names = {"--prime-check-minutes"}, paramLabel = "minutes",
      description = "この間隔(分)で、他のクライアントが素数を見つけていないかDBを確かめる。見つかっていれば終了する")
  private int primeCheckMinutes = 10;

  /** この偶数で素数(probably/definitely)が見つかっていれば、そのstep。 */
  private static OptionalInt findPrimeStep(long id) throws SQLException {
    try (var connection = DriverManager.getConnection(dbURL); var statement = connection.prepareStatement(
        "SELECT step from candidates where id = ? and (probably_prime != 0 or definitely_prime != 0) limit 1;")) {
      statement.setLong(1, id);
      try (var set = statement.executeQuery()) {
        return set.next() ? OptionalInt.of(set.getInt("step")) : OptionalInt.empty();
      }
    }
  }

  @Override
  public Integer call()
      throws IOException, ClassNotFoundException, InterruptedException, ExecutionException, SQLException {
    logger.info("initialize...");
    var matcher = UUID_PATTERN.matcher(evenNumberPath.getFileName().toString());
    if (!matcher.find()) {
      logger.error("ファイル名にUUIDが含まれていません");
      return ExitCode.SOFTWARE;
    }
    var uuid = UUID.fromString(matcher.group());
    var id = uuid.getMostSignificantBits();

    // 素数が見つかった時、その場でキャンセルされた候補はcomposite/probably_prime/
    // definitely_primeがすべて0のまま未テスト扱いで残る。再起動などで再度この
    // idに対して呼ばれたとき、既に見つかっている素数を無視して延々と探索を
    // 再開しないよう、先にチェックして見つかっていればここで抜ける。
    var alreadyFound = findPrimeStep(id);
    if (alreadyFound.isPresent()) {
      logger.info("id {} は既にstep {} で素数が見つかっています。探索をスキップします。", id,
          alreadyFound.getAsInt());
      return ExitCode.OK;
    }

    var hexText = Files.readAllLines(evenNumberPath).getFirst();
    // 16進数としてa-fを一切含まない場合、10進数のファイルを誤って16進として
    // 読み込んだ可能性が高い(桁数が多いほど偶然a-fを含まない確率は天文学的に低い)
    if (hexText.chars().noneMatch(c -> (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
      logger.warn("{} にa-fが1つも含まれていません。"
          + "10進数のファイルを誤って16進として読み込んでいませんか？", evenNumberPath);
    }
    var even = Gmp.allocateUninitialized(auto);
    var parseResult = Gmp.initSetStr(even, auto.allocateFrom(hexText), 16);
    if (parseResult != 0) {
      logger.error("偶数ファイルの16進数パースに失敗しました: {}", evenNumberPath);
      return ExitCode.SOFTWARE;
    }
    var inputList = new ArrayList<Integer>();
    try (var connection = DriverManager.getConnection(dbURL); var statement = connection.prepareStatement(
        "SELECT step from candidates where composite = 0 and probably_prime = 0 and definitely_prime = 0 and id = ? order by step;")) {
      statement.setLong(1, id);
      try (var set = statement.executeQuery()) {
        while (set.next()) {
          inputList.add(set.getInt("step"));
        }
      }
    }
    logger.info("start");
    if (Pfgw.isAvailable()) {
      logger.info("pfgw高速経路: 有効({}、{}スレッド/候補、作業ディレクトリ{})", Pfgw.executable(),
          Pfgw.threads(), Pfgw.workDir());
    } else {
      logger.warn("pfgw高速経路: 無効(mr2fsかGMPで判定します): {}", Pfgw.unavailableReason());
    }
    if (Mr2fs.isAvailable()) {
      logger.info("mr2fs高速経路: 有効");
    } else {
      logger.warn("mr2fs高速経路: 無効(GMPのみで判定します): {}", Mr2fs.unavailableReason());
    }
    var size = inputList.size();
    logger.debug("Number of prime number candidates: {}", size);
    if (doShuffle) {
      Collections.shuffle(inputList, RandomGenerator.of("SecureRandom"));
    }
    var found = false;
    logger.debug("threads: {}", threads);
    String hostname;
    try {
      hostname = InetAddress.getLocalHost().getHostName();
    } catch (UnknownHostException e) {
      hostname = "unknown";
    }
    final var hostnameFinal = hostname;
    var list = inputList.stream()
        .map(step -> new PrimeSearchTask2(even, step, dbURL, id, hostnameFinal, staleHours))
        .collect(Collectors.toCollection(() -> new ArrayList<>(size)));
    // 他のクライアントが素数を見つけたステップ。見張り役のスレッドが書き込む
    var foundElsewhere = new AtomicReference<Integer>();
    try (final var pool = WorkerPool.create(threads);
        final var watcher = Executors.newSingleThreadScheduledExecutor()) {
      final var service = new ExecutorCompletionService<Result>(pool);
      var futures = new ArrayList<Future<Result>>();
      list.forEach(task -> futures.add(service.submit(task)));
      // 両台で同じ偶数を共有しているので、片方が素数を見つけても、もう片方は起動時にしか
      // 確かめておらず、手で止めるまで計算を続けていた。一定間隔でDBを見て、見つかって
      // いれば判定中の候補をキャンセルして(PFGWも止まる)終了する
      watcher.scheduleWithFixedDelay(() -> {
        try {
          var step = findPrimeStep(id);
          if (step.isPresent() && foundElsewhere.compareAndSet(null, step.getAsInt())) {
            logger.info("step {} で素数が見つかっています。判定中の候補を止めて終了します。",
                step.getAsInt());
            pool.shutdown();
            futures.forEach(f -> f.cancel(true));
          }
        } catch (SQLException e) {
          logger.warn("素数が見つかったかの確認に失敗しました。{}分後にもう一度確かめます。",
              primeCheckMinutes, e);
        }
      }, primeCheckMinutes, primeCheckMinutes, TimeUnit.MINUTES);
      var updateSql =
          "update candidates set composite = composite + ?, probably_prime = probably_prime + ?, "
              + "definitely_prime = definitely_prime + ?, timeresult = CURRENT_TIMESTAMP, "
              + "resultclient = ? where id = ? and step = ?;";
      for (int j = size; j > 0; j--) {
        if (foundElsewhere.get() != null) {
          break;
        }
        try {
          var foundStep = service.take().get();
          var step = foundStep.step();
          var result = foundStep.result();
          if (result == Result.SKIP) {
            logger.debug("step {}: skip(既に他クライアントが処理中)", step);
            continue;
          }
          var start = foundStep.start();
          var finish = foundStep.finish();
          logger.info("step {}: {}({} hours)", step, result, (finish - start) / 3.6e12);
          if (result < 0 || result > 2) {
            logger.error("step {}: 未知のresultコード({})。この候補の結果は破棄します。", step, result);
            continue;
          }
          // ここでのDB書き込み失敗(SQLException)は、このループ全体を道連れにして
          // 以降の完了候補すべてを未書き込みのまま握りつぶしてしまう事故が過去にあった
          // (2026-08-21、synchronize_seqscans調査の続きで発覚)。1件の失敗が全体に
          // 波及しないよう、書き込みはここでcatchしログを残して次の候補へ進む。
          // この候補は次回起動時にDBがcomposite=0のままなので再判定される。
          // ただし接続できないだけなら、結果を捨てずにつながるまで待つ(DbRetry)。
          try {
            DbRetry.run("step " + step + " の結果の書き込み", () -> {
              try (var connection = DriverManager.getConnection(dbURL);
                  var ps = connection.prepareStatement(updateSql)) {
                ps.setInt(1, result == 0 ? 1 : 0);
                ps.setInt(2, result == 1 ? 1 : 0);
                ps.setInt(3, result == 2 ? 1 : 0);
                ps.setString(4, hostnameFinal);
                ps.setLong(5, id);
                ps.setInt(6, step);
                return ps.execute();
              }
            });
          } catch (SQLException e) {
            logger.error("step {} の結果(result={})のDB書き込みに失敗しました。この候補は次回起動時に再判定されます。",
                step, result, e);
            continue;
          }
          if (result != 0) {
            pool.shutdown();
            found = true;
            logger.info("find prime: step {}", foundStep.step());
            futures.stream().filter(f -> !f.isDone()).forEach(f -> f.cancel(true));
            System.err.println('\007');
            break;
          }
        } catch (CancellationException e) {
          // 他のクライアントが素数を見つけ、見張り役がキャンセルした。ループの頭で抜ける
        } catch (ExecutionException e) {
          // 以前はここで黙って捨てており、DBの回線断で全候補が一瞬で消化済み扱いになった
          logger.error("候補の処理が例外で終わりました。この候補は次回起動時に再判定されます。",
              e.getCause());
        }
      }
    }
    if (found) {
      logger.info("find prime");
      return ExitCode.OK;
    } else if (foundElsewhere.get() != null) {
      logger.info("他のクライアントがstep {} で素数を見つけたので終了しました", foundElsewhere.get());
      return ExitCode.OK;
    } else {
      logger.error("prime not found");
      return ExitCode.SOFTWARE;
    }
  }

}
