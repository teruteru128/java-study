package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.Const.PUBLIC_KEY_LENGTH;
import static com.github.teruteru128.foreign.bmhash.BmHash16.LANES;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.sql.SQLTransientConnectionException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HexFormat;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 1つの公開鍵ファイルのA×A総当たりを、複数のマシンで分担する。
 * <p>
 * 作業の単位は署名鍵の区間で、Postgresの行として持つ。各マシンは区間を1つclaimし、全スレッドで
 * 計算して、終わったら完了を書いて次をclaimする。速いマシンほど多く取るので、速度の差を気にして
 * 配分を決める必要が無い。接続はDBを使うときだけ張る(区間1つは16スレッドで約15分)ので、回線が
 * 切れていても計算は止まらず、書き戻しのときに待つだけで済む。
 * <p>
 * 時刻は常にDBのnow()を使う(マシン間の時計のずれの影響を受けない)。claimの期限切れで同じ区間を
 * 2台が計算しても、計算が無駄になるだけで、完了の書き込みも当たりの書き込みも何度やっても同じ結果になる。
 */
final class AddressSearchCluster {

  private static final Logger logger = LoggerFactory.getLogger(AddressSearchCluster.class);
  /** 進捗ビットマップから取り込んだ完了済み区間のfinished_by。速度の計算から除くのに使う */
  private static final String IMPORTED = "imported-bitmap";
  private static final Duration FIRST_RETRY_WAIT = Duration.ofSeconds(10);
  private static final Duration MAX_RETRY_WAIT = Duration.ofMinutes(10);
  /** 残りの区間がすべて他のマシンの計算中のとき、何秒ごとに見直すか */
  private static final Duration IDLE_POLL = Duration.ofSeconds(60);
  private static final int INSERT_BATCH = 500;
  private static final String UNDEFINED_TABLE = "42P01";

  private static final String[] SCHEMA = {
      """
      create table if not exists address_search_files (
        file_name text primary key,
        sha256 text not null,
        key_count integer not null,
        unit_size integer not null,
        created_at timestamptz not null default now()
      )""",
      """
      create table if not exists address_search_units (
        file_name text not null references address_search_files,
        start_key integer not null,
        end_key integer not null,
        claimed_by text,
        claimed_at timestamptz,
        finished_by text,
        finished_at timestamptz,
        primary key (file_name, start_key),
        check (start_key >= 0 and start_key < end_key)
      )""",
      """
      create table if not exists address_search_hits (
        file_name text not null references address_search_files,
        sign_index integer not null,
        enc_index integer not null,
        zero_bits integer not null,
        ripe text not null,
        found_by text not null,
        found_at timestamptz not null default now(),
        primary key (file_name, sign_index, enc_index)
      )""",
  };

  /**
   * 残りの区間のうち、誰も持っていないか、自分が持っているか(再起動した場合)、期限切れのものを1つ取る。
   * 自分の持ち分を優先するので、再起動すれば途中だった区間からやり直す。
   */
  private static final String CLAIM_SQL = """
      update address_search_units u
         set claimed_by = ?, claimed_at = now()
       where u.file_name = ?
         and u.start_key = (
           select start_key from address_search_units
            where file_name = ?
              and finished_at is null
              and (claimed_at is null
                   or claimed_by = ?
                   or claimed_at < now() - make_interval(secs => ?))
            order by (claimed_by is not distinct from ?) desc, start_key
            limit 1
            for update skip locked)
      returning u.start_key, u.end_key""";

  private AddressSearchCluster() {
  }

  /** 署名鍵の区間[start, end)。 */
  record Unit(int start, int end) {

    int size() {
      return end - start;
    }
  }

  private record Hit(int signIndex, int encIndex, int zeroBits, String ripe) {

  }

  private record Progress(long totalKeys, long finishedKeys, double keysPerSecond) {

  }

  @FunctionalInterface
  private interface SqlAction<T> {

    T run(Connection connection) throws SQLException;
  }

  /**
   * 完了済みビットマップを、区間の並びにする。未完了はunitSize以下に切り、完了済みはひと続きを1行にする。
   * 全体を隙間も重なりも無く覆う。
   */
  static List<Unit> splitRange(BitSet done, int num, int unitSize, boolean wantDone) {
    var units = new ArrayList<Unit>();
    var i = 0;
    while (i < num) {
      var isDone = done.get(i);
      var end = isDone ? done.nextClearBit(i) : done.nextSetBit(i);
      if (end < 0 || end > num) {
        end = num;
      }
      if (isDone == wantDone) {
        if (isDone) {
          units.add(new Unit(i, end));
        } else {
          for (var s = i; s < end; s += unitSize) {
            units.add(new Unit(s, Math.min(s + unitSize, end)));
          }
        }
      }
      i = end;
    }
    return units;
  }

  /**
   * 鍵ファイルを分担用に登録する。一度だけ実行する(すでに登録済みなら何も変更せずに失敗する)。
   * 単独実行の{@code addressSearch}から移るときは、そのサービスを止めてから進捗ファイルを渡す。
   */
  static int init(Path keys, Path progressFile, int unitSize)
      throws IOException, SQLException {
    if (unitSize <= 0) {
      throw new IllegalArgumentException("--unit-size は正の数にしてください: " + unitSize);
    }
    var num = keyCount(keys);
    var fileName = keys.getFileName().toString();
    var done = new BitSet(num);
    if (progressFile != null) {
      // 単独実行のloadProgressと違い、読めなければ止める。完了済みを捨ててやり直すことになるため
      done = BitSet.valueOf(Files.readAllBytes(progressFile));
      if (done.length() > num) {
        throw new IllegalArgumentException(
            "進捗ファイルに鍵の本数(" + num + ")を超えるビットがあります: " + done.length());
      }
      logger.info("進捗を読み込みました: {} / {} 本完了済み ({})", done.cardinality(), num, progressFile);
    }
    var todo = splitRange(done, num, unitSize, false);
    var finished = splitRange(done, num, unitSize, true);
    var sha256 = sha256(keys);
    logger.info("{}: {} 鍵, SHA-256 {}", fileName, num, sha256);
    try (var c = connect()) {
      c.setAutoCommit(false);
      try (var st = c.createStatement()) {
        for (var ddl : SCHEMA) {
          st.execute(ddl);
        }
      }
      try (var ps = c.prepareStatement(
          "insert into address_search_files (file_name, sha256, key_count, unit_size)"
          + " values (?, ?, ?, ?) on conflict do nothing")) {
        ps.setString(1, fileName);
        ps.setString(2, sha256);
        ps.setInt(3, num);
        ps.setInt(4, unitSize);
        if (ps.executeUpdate() != 1) {
          c.rollback();
          throw new IllegalStateException(fileName + " は登録済みです。何も変更していません");
        }
      }
      insertUnits(c, fileName, todo, false);
      insertUnits(c, fileName, finished, true);
      verifyCoverage(c, fileName, num);
      c.commit();
    }
    logger.info("登録しました: 未完了 {} 区間({} 本), 完了済み {} 区間({} 本)", todo.size(),
        todo.stream().mapToLong(Unit::size).sum(), finished.size(),
        finished.stream().mapToLong(Unit::size).sum());
    return 0;
  }

  /**
   * 区間をclaimしては計算する。全区間が完了したら0を返す。
   * 接続の失敗は回復するまで待ち、それ以外のSQLの誤りはそのまま投げる(異常終了してsystemdに任せる)。
   */
  static int work(Path keys, int minZeroBits, String worker, double staleHours)
      throws IOException, SQLException, InterruptedException {
    if (minZeroBits < Factory.SEARCH_GATE_ZERO_BITS) {
      throw new IllegalArgumentException(
          "--min-zero-bits は" + Factory.SEARCH_GATE_ZERO_BITS + "以上にしてください: " + minZeroBits);
    }
    var num = keyCount(keys);
    var fileName = keys.getFileName().toString();
    var workerName = worker != null ? worker : hostname();
    var staleSeconds = staleHours * 3600;
    var hitFile = Path.of("addressSearch-hits-" + fileName + ".txt");
    logger.info("16レーン実装: {}", RipeCalculator.batchImplementation());
    logger.info("ワーカー名: {}, claimの期限: {}時間, 先頭ゼロ{}bit以上を {} とDBに記録します", workerName,
        staleHours, minZeroBits, hitFile.toAbsolutePath());
    checkFile(keys, fileName, num);

    // 並列数の指定は単独実行のaddressSearchと揃える(共通プールの並列度+呼び出し元の1)
    var threads = ForkJoinPool.getCommonPoolParallelism() + 1;
    logger.info("{}スレッドで計算します", threads);
    try (var arena = Arena.ofShared();
        var channel = FileChannel.open(keys, StandardOpenOption.READ);
        var pool = Executors.newFixedThreadPool(threads)) {
      var segment = channel.map(MapMode.READ_ONLY, 0, Files.size(keys), arena);
      var waiting = false;
      while (true) {
        var unit = withRetry("区間のclaim",
            c -> claim(c, fileName, workerName, staleSeconds));
        if (unit == null) {
          var remaining = withRetry("残り区間の確認", c -> countUnfinished(c, fileName));
          if (remaining == 0) {
            var finalHits = withRetry("当たりの集計", c -> countHits(c, fileName));
            logger.info("全区間の走査が完了しました。当たりは全台で {} 件", finalHits);
            return 0;
          }
          if (!waiting) {
            logger.info("残り{}区間はすべて他のマシンの計算中です。完了か期限切れを待ちます", remaining);
            waiting = true;
          }
          Thread.sleep(IDLE_POLL);
          continue;
        }
        waiting = false;
        logger.debug("区間 [{}, {}) を開始", unit.start(), unit.end());
        var startNanos = System.nanoTime();
        var hits = new ConcurrentLinkedQueue<Hit>();
        searchUnit(pool, unit, i -> Factory.searchSignKey(segment, num, i, minZeroBits,
            (encIndex, zeroBits, ripes, base) -> {
              logger.info("★ 先頭ゼロ{}bit: offsetS = {}, offsetE = {}", zeroBits,
                  (long) i * PUBLIC_KEY_LENGTH, (long) encIndex * PUBLIC_KEY_LENGTH);
              // DBへの書き込みは区間の終わりにまとめて行うので、計算中に落ちても残るよう先に書く
              Factory.recordHit(hitFile, i, encIndex, zeroBits, ripes, base);
              hits.add(new Hit(i, encIndex, zeroBits, HexFormat.of()
                  .formatHex(ripes, base, base + Factory.SEARCH_RIPE_LENGTH)));
            }));
        var elapsed = (System.nanoTime() - startNanos) / 1e9;
        var hitList = List.copyOf(hits);
        var progress = withRetry("区間の完了の書き込み",
            c -> finish(c, fileName, unit, workerName, hitList));
        logProgress(unit, elapsed, num, progress);
      }
    }
  }

  /**
   * 区間の署名鍵を1本ずつスレッドへ配って、全部終わるまで待つ。
   * 並列ストリームは区間を64本ずつの塊に分けて配る(16スレッドで1塊約3分)。スレッドの速さが揃って
   * いれば塊はほぼ同時に終わるので差は出ない(server02で1区間733秒→735秒、2026-11-05)。1本ずつ配る
   * のは、他の計算と併走してスレッドの速さがばらついても、区間の終わりに最後の塊を待たないようにするため。
   */
  private static void searchUnit(ExecutorService pool, Unit unit, IntConsumer search)
      throws InterruptedException {
    var tasks = IntStream.range(unit.start(), unit.end()).<Callable<Void>>mapToObj(i -> () -> {
      search.accept(i);
      return null;
    }).toList();
    for (var future : pool.invokeAll(tasks)) {
      try {
        future.get();
      } catch (ExecutionException e) {
        throw new IllegalStateException("区間の計算に失敗しました: " + unit, e.getCause());
      }
    }
  }

  private static void logProgress(Unit unit, double elapsed, int num, Progress progress) {
    var remainingKeys = progress.totalKeys() - progress.finishedKeys();
    var eta = progress.keysPerSecond() > 0
        ? Factory.formatDuration(remainingKeys / progress.keysPerSecond()) : "不明";
    logger.info("区間 [{}, {}) 完了: {}秒, {} 組/秒。全体 {}/{} 本 ({}), 全台 {} 組/秒, 残り推定 {}",
        unit.start(), unit.end(), String.format("%.0f", elapsed),
        String.format("%.3e", unit.size() * (double) num / elapsed), progress.finishedKeys(),
        progress.totalKeys(),
        String.format("%.4f%%", 100.0 * progress.finishedKeys() / progress.totalKeys()),
        String.format("%.3e", progress.keysPerSecond() * num), eta);
  }

  /** 起動時に、DBに登録された鍵ファイルと手元のファイルが同じものか確かめる。 */
  private static void checkFile(Path keys, String fileName, int num)
      throws IOException, SQLException, InterruptedException {
    var actual = sha256(keys);
    var expected = withRetry("鍵ファイルの照合", c -> {
      try (var ps = c.prepareStatement(
          "select sha256, key_count from address_search_files where file_name = ?")) {
        ps.setString(1, fileName);
        try (var rs = ps.executeQuery()) {
          if (!rs.next()) {
            throw new IllegalStateException(
                fileName + " はDBに登録されていません。先に addressSearchInit を実行してください");
          }
          if (rs.getInt(2) != num) {
            throw new IllegalStateException(
                "鍵の本数がDBと違います: DB " + rs.getInt(2) + ", 手元 " + num);
          }
          return rs.getString(1);
        }
      } catch (SQLException e) {
        if (UNDEFINED_TABLE.equals(e.getSQLState())) {
          throw new IllegalStateException("分担用のテーブルがありません。先に addressSearchInit を実行してください",
              e);
        }
        throw e;
      }
    });
    if (!expected.equals(actual)) {
      // 別の内容のファイルで計算すると、当たりのオフセットが何の鍵か分からなくなる
      throw new IllegalStateException(
          "鍵ファイルの内容がDBの登録と違います: DB " + expected + ", 手元 " + actual);
    }
    logger.info("鍵ファイルはDBの登録と一致しました: {} ({})", fileName, actual);
  }

  private static Unit claim(Connection c, String fileName, String worker, double staleSeconds)
      throws SQLException {
    try (var ps = c.prepareStatement(CLAIM_SQL)) {
      ps.setString(1, worker);
      ps.setString(2, fileName);
      ps.setString(3, fileName);
      ps.setString(4, worker);
      ps.setDouble(5, staleSeconds);
      ps.setString(6, worker);
      try (var rs = ps.executeQuery()) {
        return rs.next() ? new Unit(rs.getInt(1), rs.getInt(2)) : null;
      }
    }
  }

  /**
   * 当たりと完了を1つのトランザクションで書く。回線断で結果が分からず再試行しても同じ結果になるよう、
   * 当たりは重複を無視し、完了は最初の記録を残す。
   */
  private static Progress finish(Connection c, String fileName, Unit unit, String worker,
      List<Hit> hits) throws SQLException {
    c.setAutoCommit(false);
    try (var ps = c.prepareStatement(
        "insert into address_search_hits"
        + " (file_name, sign_index, enc_index, zero_bits, ripe, found_by)"
        + " values (?, ?, ?, ?, ?, ?) on conflict do nothing")) {
      for (var hit : hits) {
        ps.setString(1, fileName);
        ps.setInt(2, hit.signIndex());
        ps.setInt(3, hit.encIndex());
        ps.setInt(4, hit.zeroBits());
        ps.setString(5, hit.ripe());
        ps.setString(6, worker);
        ps.addBatch();
      }
      ps.executeBatch();
    }
    try (var ps = c.prepareStatement(
        "update address_search_units set finished_by = ?, finished_at = now()"
        + " where file_name = ? and start_key = ? and end_key = ? and finished_at is null")) {
      ps.setString(1, worker);
      ps.setString(2, fileName);
      ps.setInt(3, unit.start());
      ps.setInt(4, unit.end());
      ps.executeUpdate();
    }
    var progress = readProgress(c, fileName);
    c.commit();
    return progress;
  }

  /** 全体の進捗と、直近1時間の全台の速度(本/秒)を返す。 */
  private static Progress readProgress(Connection c, String fileName) throws SQLException {
    try (var ps = c.prepareStatement("""
        select coalesce(sum(end_key - start_key), 0),
               coalesce(sum(end_key - start_key) filter (where finished_at is not null), 0),
               coalesce(sum(end_key - start_key) filter (
                 where finished_at > now() - interval '1 hour' and finished_by <> ?), 0),
               extract(epoch from
                 max(finished_at) filter (
                   where finished_at > now() - interval '1 hour' and finished_by <> ?)
                 - min(claimed_at) filter (
                   where finished_at > now() - interval '1 hour' and finished_by <> ?))
          from address_search_units where file_name = ?""")) {
      ps.setString(1, IMPORTED);
      ps.setString(2, IMPORTED);
      ps.setString(3, IMPORTED);
      ps.setString(4, fileName);
      try (var rs = ps.executeQuery()) {
        rs.next();
        var seconds = rs.getDouble(4);
        var rate = seconds > 0 ? rs.getLong(3) / seconds : 0;
        return new Progress(rs.getLong(1), rs.getLong(2), rate);
      }
    }
  }

  private static long countUnfinished(Connection c, String fileName) throws SQLException {
    try (var ps = c.prepareStatement(
        "select count(*) from address_search_units where file_name = ? and finished_at is null")) {
      ps.setString(1, fileName);
      try (var rs = ps.executeQuery()) {
        rs.next();
        return rs.getLong(1);
      }
    }
  }

  private static long countHits(Connection c, String fileName) throws SQLException {
    try (var ps = c.prepareStatement(
        "select count(*) from address_search_hits where file_name = ?")) {
      ps.setString(1, fileName);
      try (var rs = ps.executeQuery()) {
        rs.next();
        return rs.getLong(1);
      }
    }
  }

  private static void insertUnits(Connection c, String fileName, List<Unit> units,
      boolean finished) throws SQLException {
    try (var ps = c.prepareStatement(
        "insert into address_search_units (file_name, start_key, end_key, finished_by, finished_at)"
        + " values (?, ?, ?, ?, case when ? then now() end)")) {
      var pending = 0;
      for (var unit : units) {
        ps.setString(1, fileName);
        ps.setInt(2, unit.start());
        ps.setInt(3, unit.end());
        ps.setString(4, finished ? IMPORTED : null);
        ps.setBoolean(5, finished);
        ps.addBatch();
        if (++pending == INSERT_BATCH) {
          ps.executeBatch();
          pending = 0;
        }
      }
      if (pending > 0) {
        ps.executeBatch();
      }
    }
  }

  /** 区間が鍵の全範囲を、隙間も重なりも無く覆っていることを確かめる。 */
  private static void verifyCoverage(Connection c, String fileName, int num) throws SQLException {
    try (var ps = c.prepareStatement("""
        select count(*) filter (where start_key <> coalesce(prev_end, 0)),
               coalesce(max(end_key), 0)
          from (select start_key, end_key,
                       lag(end_key) over (order by start_key) as prev_end
                  from address_search_units where file_name = ?) s""")) {
      ps.setString(1, fileName);
      try (var rs = ps.executeQuery()) {
        rs.next();
        if (rs.getLong(1) != 0 || rs.getInt(2) != num) {
          c.rollback();
          throw new IllegalStateException("区間が全範囲を覆っていません: 不連続 " + rs.getLong(1)
                                          + " 箇所, 末尾 " + rs.getInt(2) + " (期待 " + num + ")");
        }
      }
    }
  }

  private static <T> T withRetry(String what, SqlAction<T> action)
      throws SQLException, InterruptedException {
    var wait = FIRST_RETRY_WAIT;
    for (var failures = 1; ; failures++) {
      try (var c = connect()) {
        return action.run(c);
      } catch (SQLException e) {
        if (!isConnectionFailure(e)) {
          throw e;
        }
        logger.warn("{}: DBにつながりません({}回目)。{}秒後に再試行します: {}", what, failures,
            wait.toSeconds(), e.toString());
        Thread.sleep(wait);
        wait = wait.multipliedBy(2);
        if (wait.compareTo(MAX_RETRY_WAIT) > 0) {
          wait = MAX_RETRY_WAIT;
        }
      }
    }
  }

  static boolean isConnectionFailure(SQLException e) {
    var state = e.getSQLState();
    return e instanceof SQLTransientConnectionException || e instanceof SQLRecoverableException
           || (state != null && state.startsWith("08"));
  }

  private static Connection connect() throws SQLException {
    // URLにパスワードが入っているので、ログには出さない
    var url = Objects.requireNonNull(System.getenv("DB_URL"), "環境変数 DB_URL がありません");
    var properties = new Properties();
    properties.setProperty("connectTimeout", "30");
    // 回線が無言で切れても、TCPの再送タイムアウト(約15分)まで固まらないようにする
    properties.setProperty("socketTimeout", "120");
    properties.setProperty("ApplicationName", "addressSearch");
    return DriverManager.getConnection(url, properties);
  }

  private static int keyCount(Path keys) throws IOException {
    var size = Files.size(keys);
    if (size % PUBLIC_KEY_LENGTH != 0) {
      throw new IllegalArgumentException(
          "ファイルサイズが" + PUBLIC_KEY_LENGTH + "の倍数ではありません: " + size);
    }
    var num = size / PUBLIC_KEY_LENGTH;
    if (num % LANES != 0 || num > Integer.MAX_VALUE) {
      throw new IllegalArgumentException("鍵の本数が" + LANES + "の倍数ではありません: " + num);
    }
    return (int) num;
  }

  private static String sha256(Path file) throws IOException {
    try (var channel = FileChannel.open(file, StandardOpenOption.READ)) {
      var digest = MessageDigest.getInstance("SHA-256");
      var buffer = ByteBuffer.allocate(1 << 20);
      while (channel.read(buffer) >= 0) {
        buffer.flip();
        digest.update(buffer);
        buffer.clear();
      }
      return HexFormat.of().formatHex(digest.digest());
    } catch (NoSuchAlgorithmException e) {
      throw new IllegalStateException(e);
    }
  }

  private static String hostname() throws IOException {
    return java.net.InetAddress.getLocalHost().getHostName();
  }
}
