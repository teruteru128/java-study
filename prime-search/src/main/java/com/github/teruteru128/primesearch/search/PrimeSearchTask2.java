package com.github.teruteru128.primesearch.search;

import com.github.teruteru128.primesearch.gmp.Gmp;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.concurrent.Callable;

/**
 * {@code even + step * 2L + 1}の素数判定を行うタスククラス。
 * 実行前にDB上の候補行をアトミックにclaimし、既に他クライアントがclaim済み
 * (かつstaleでない)場合はMiller-Rabinを回さずskipする。
 */
public class PrimeSearchTask2 implements Callable<Result> {

  private static final Arena auto = Arena.ofAuto();
  private static final ThreadLocal<MemorySegment> THREAD_CANDIDATES = ThreadLocal.withInitial(
      () -> Gmp.newMpz(auto));

  private final MemorySegment even;
  private final int step;
  private final String dbUrl;
  private final long id;
  private final String hostname;
  private final int staleHours;

  public PrimeSearchTask2(MemorySegment even, int step, String dbUrl, long id, String hostname,
      int staleHours) {
    this.even = even;
    this.step = step;
    this.dbUrl = dbUrl;
    this.id = id;
    this.hostname = hostname;
    this.staleHours = staleHours;
  }

  @Override
  public Result call() throws SQLException {
    if (!claim()) {
      return new Result(step, Result.SKIP, 0, 0);
    }
    var candidate = THREAD_CANDIDATES.get();
    Gmp.addUi(candidate, even, step);
    Gmp.addUi(candidate, candidate, step);
    Gmp.addUi(candidate, candidate, 1);
    long start;
    long finish;
    int result;
    start = System.nanoTime();
    result = Gmp.probabPrimeP(candidate, 24);
    finish = System.nanoTime();
    return new Result(step, result, start, finish);
  }

  /**
   * 候補行をアトミックに確保する。1行更新できればclaim成功。
   * staleHoursより古いtimeassigned、もしくは自分自身(hostname)がclaim済みの行は
   * 再取得できる(前者は他クライアントのプリエンプト等からの回復、後者はsystemd
   * 再起動時に自分のclaimを即座に再取得するため)。
   */
  private boolean claim() throws SQLException {
    // timeassignedの書き込み・比較は必ずsetTimestamp経由のバインド値同士で行う。
    // SQLite側でCURRENT_TIMESTAMP(TEXTとして格納される)とsetTimestampの
    // バインド値(ドライバ内部表現、TEXTとは異なるストレージクラス)を混在させると、
    // SQLiteのクロスストレージクラス比較規則(TEXTは常に数値より大きい)により
    // timeassigned < ? が実測で常にfalseになり、staleな行を再claimできなくなる。
    var now = Timestamp.from(Instant.now());
    var staleBefore = Timestamp.from(Instant.now().minusSeconds(staleHours * 3600L));
    try (var connection = DriverManager.getConnection(dbUrl);
        var ps = connection.prepareStatement(
            "update candidates set timeassigned = ?, assignedclient = ? "
                + "where id = ? and step = ? and composite = 0 and probably_prime = 0 "
                + "and definitely_prime = 0 "
                + "and (timeassigned is null or timeassigned < ? or assignedclient = ?);")) {
      ps.setTimestamp(1, now);
      ps.setString(2, hostname);
      ps.setLong(3, id);
      ps.setInt(4, step);
      ps.setTimestamp(5, staleBefore);
      ps.setString(6, hostname);
      return ps.executeUpdate() == 1;
    }
  }

}
