package com.github.teruteru128.primesearch.search;

import static java.util.concurrent.ForkJoinPool.defaultForkJoinWorkerThreadFactory;

import com.github.teruteru128.primesearch.gmp.Gmp;
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
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
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
    try (var connection = DriverManager.getConnection(dbURL); var statement = connection.prepareStatement(
        "SELECT step from candidates where id = ? and (probably_prime != 0 or definitely_prime != 0) limit 1;")) {
      statement.setLong(1, id);
      try (var set = statement.executeQuery()) {
        if (set.next()) {
          logger.info("id {} は既にstep {} で素数が見つかっています。探索をスキップします。", id,
              set.getInt("step"));
          return ExitCode.OK;
        }
      }
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
        "SELECT step from candidates where composite == 0 and probably_prime == 0 and definitely_prime == 0 and id = ?;")) {
      statement.setLong(1, id);
      try (var set = statement.executeQuery()) {
        while (set.next()) {
          inputList.add(set.getInt("step"));
        }
      }
    }
    logger.info("start");
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
    try (final var pool = new ForkJoinPool(threads, defaultForkJoinWorkerThreadFactory, null,
        true)) {
      final var service = new ExecutorCompletionService<Result>(pool);
      var futures = new ArrayList<Future<Result>>();
      list.forEach(task -> futures.add(service.submit(task)));
      try (var connection = DriverManager.getConnection(dbURL)) {
        try (var ps = connection.prepareStatement(
            "update candidates set composite = composite + ?, probably_prime = probably_prime + ?, "
                + "definitely_prime = definitely_prime + ?, timeresult = CURRENT_TIMESTAMP, "
                + "resultclient = ? where id = ? and step = ?;")) {
          for (int j = size; j > 0; j--) {
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
                throw new RuntimeException("unknown result code: " + result);
              }
              ps.setInt(1, result == 0 ? 1 : 0);
              ps.setInt(2, result == 1 ? 1 : 0);
              ps.setInt(3, result == 2 ? 1 : 0);
              ps.setString(4, hostnameFinal);
              ps.setLong(5, id);
              ps.setInt(6, step);
              ps.execute();
              if (result != 0) {
                pool.shutdown();
                found = true;
                logger.info("find prime: step {}", foundStep.step());
                futures.stream().filter(f -> !f.isDone()).forEach(f -> f.cancel(true));
                System.err.println('\007');
                break;
              }
            } catch (ExecutionException ignored) {
            }
          }
        }
      }
    }
    if (found) {
      logger.info("find prime");
      return ExitCode.OK;
    } else {
      logger.error("prime not found");
      return ExitCode.SOFTWARE;
    }
  }

}
