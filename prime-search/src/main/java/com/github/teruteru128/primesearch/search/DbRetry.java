package com.github.teruteru128.primesearch.search;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.sql.SQLTransientConnectionException;
import java.time.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DBに接続できないときに、つながるまで待って再試行する。
 * <p>
 * server02はWi-Fiで1台目のPostgresにつないでおり、回線が切れると全タスクのclaimが
 * 一斉に失敗する。以前はそれを無視していたため、待っていた候補がすべて一瞬で
 * 消化済み扱いになり、走行中の候補が終わったところで「prime not found」で終了していた
 * (2026-10-23 16:24に回線断、19:19に終了)。接続の失敗(SQLStateが08系)だけを待ち、
 * それ以外の誤りはすぐ投げる(SQLの誤りなどで永久に待たないように)。
 */
final class DbRetry {

  private static final Logger logger = LoggerFactory.getLogger(DbRetry.class);
  private static final Duration FIRST_WAIT = Duration.ofSeconds(10);
  private static final Duration MAX_WAIT = Duration.ofMinutes(10);

  @FunctionalInterface
  interface SqlAction<T> {

    T run() throws SQLException;
  }

  private DbRetry() {
  }

  static <T> T run(String what, SqlAction<T> action) throws SQLException, InterruptedException {
    return run(what, action, FIRST_WAIT, MAX_WAIT);
  }

  static <T> T run(String what, SqlAction<T> action, Duration firstWait, Duration maxWait)
      throws SQLException, InterruptedException {
    var wait = firstWait;
    for (int failures = 1; ; failures++) {
      try {
        return action.run();
      } catch (SQLException e) {
        if (!isConnectionFailure(e)) {
          throw e;
        }
        if (failures == 1) {
          logger.warn("{}: DBにつながりません。{}秒後に再試行します", what, wait.toSeconds(), e);
        } else {
          logger.warn("{}: DBにつながりません({}回目)。{}秒後に再試行します: {}", what, failures,
              wait.toSeconds(), e.toString());
        }
        Thread.sleep(wait);
        wait = wait.multipliedBy(2);
        if (wait.compareTo(maxWait) > 0) {
          wait = maxWait;
        }
      }
    }
  }

  static boolean isConnectionFailure(SQLException e) {
    var state = e.getSQLState();
    return e instanceof SQLTransientConnectionException || e instanceof SQLRecoverableException
        || (state != null && state.startsWith("08"));
  }
}
