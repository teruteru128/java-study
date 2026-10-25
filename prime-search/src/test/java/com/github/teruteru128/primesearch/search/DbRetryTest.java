package com.github.teruteru128.primesearch.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;

class DbRetryTest {

  private static final Duration SHORT = Duration.ofMillis(10);

  /** PostgreSQLのJDBCドライバが回線断で投げるもの(SQLState 08001)。 */
  private static SQLException connectionFailure() {
    return new SQLException("The connection attempt failed.", "08001");
  }

  @Test
  void retriesUntilConnected() throws Exception {
    var calls = new AtomicInteger();
    var result = DbRetry.run("test", () -> {
      if (calls.incrementAndGet() < 4) {
        throw connectionFailure();
      }
      return "ok";
    }, SHORT, SHORT);
    assertEquals("ok", result);
    assertEquals(4, calls.get());
  }

  @Test
  void otherErrorsAreThrownImmediately() {
    var calls = new AtomicInteger();
    var error = new SQLException("syntax error", "42601");
    var thrown = assertThrows(SQLException.class, () -> DbRetry.run("test", () -> {
      calls.incrementAndGet();
      throw error;
    }, SHORT, SHORT));
    assertSame(error, thrown);
    assertEquals(1, calls.get());
  }

  @Test
  void interruptWhileWaiting() throws Exception {
    var thrown = new AtomicReference<Throwable>();
    var thread = new Thread(() -> {
      try {
        DbRetry.run("test", () -> {
          throw connectionFailure();
        }, Duration.ofHours(1), Duration.ofHours(1));
      } catch (Throwable e) {
        thrown.set(e);
      }
    });
    thread.start();
    TimeUnit.MILLISECONDS.sleep(200);
    thread.interrupt();
    thread.join(TimeUnit.SECONDS.toMillis(5));
    assertFalse(thread.isAlive());
    assertInstanceOf(InterruptedException.class, thrown.get());
  }
}
