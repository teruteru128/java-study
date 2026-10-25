package com.github.teruteru128.primesearch.gmp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import com.github.teruteru128.gmp.linux.gmp_h;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;

/**
 * PFGWの判定結果を正しく読み取れること、割り込まれたらPFGWを止めることを確かめる。
 * {@code pfgw64}が無い環境ではスキップする。
 */
class PfgwTest {

  private static void requirePfgw() {
    assumeTrue(Pfgw.isAvailable(), () -> "PFGWが使えないためスキップします: " + Pfgw.unavailableReason());
  }

  /** 2^bits以上の最小の素数。800bit以上ならPFGWはGMPでなくgwnumを使う。 */
  private static MemorySegment nextPrime(Arena arena, long bits) {
    var n = Gmp.newMpz(arena);
    gmp_h.mpz_ui_pow_ui(n, 2, bits);
    gmp_h.mpz_nextprime(n, n);
    return n;
  }

  @Test
  void prime() throws Exception {
    requirePfgw();
    try (var arena = Arena.ofConfined()) {
      assertEquals(1, Pfgw.fermat(nextPrime(arena, 4000), "test-prime"));
      assertFalse(Files.exists(Pfgw.workDir().resolve("test-prime")), "判定が終われば作業ディレクトリは消える");
    }
  }

  @Test
  void composite() throws Exception {
    requirePfgw();
    try (var arena = Arena.ofConfined()) {
      var n = Gmp.newMpz(arena);
      gmp_h.mpz_mul(n, nextPrime(arena, 2000), nextPrime(arena, 2100));
      assertEquals(0, Pfgw.fermat(n, "test-composite"));
      assertFalse(Files.exists(Pfgw.workDir().resolve("test-composite")));
    }
  }

  /** 素数が見つかって他の候補をキャンセルしたとき、PFGWを最後まで走らせない。 */
  @Test
  void interruptStopsPfgw() throws Exception {
    requirePfgw();
    var thrown = new AtomicReference<Throwable>();
    var thread = new Thread(() -> {
      try (var arena = Arena.ofConfined()) {
        var n = Gmp.newMpz(arena);
        // 約2,097,000bitの奇数。最後まで計算すると1時間以上かかる
        gmp_h.mpz_ui_pow_ui(n, 3, 1_323_000);
        gmp_h.mpz_add_ui(n, n, 2);
        Pfgw.fermat(n, "test-interrupt");
      } catch (Throwable e) {
        thrown.set(e);
      }
    });
    thread.start();
    // PFGWが63万桁を読み込んでFFTの準備を終え、計算に入るまで待つ
    TimeUnit.SECONDS.sleep(10);
    assertTrue(ProcessHandle.current().children().findAny().isPresent(), "PFGWが動いている");
    thread.interrupt();
    thread.join(TimeUnit.SECONDS.toMillis(30));
    assertFalse(thread.isAlive());
    assertInstanceOf(InterruptedException.class, thrown.get());
    assertTrue(ProcessHandle.current().children().noneMatch(ProcessHandle::isAlive), "PFGWは止まっている");
    assertTrue(Files.exists(Pfgw.workDir().resolve("test-interrupt").resolve("n.txt")),
        "再開できるよう作業ディレクトリは残す");
  }
}
