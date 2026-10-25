package com.github.teruteru128.primesearch.gmp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.teruteru128.gmp.linux.gmp_h;
import java.lang.foreign.Arena;
import org.junit.jupiter.api.Test;

class GmpTest {

  /**
   * confinedなarenaで最初に確保したmpz_tを、arenaを閉じたときに安全に解放できる。
   * 以前は構造体の解放がmpz_clearより先に走り、free()で落ちることがあった。
   */
  @Test
  void closeConfinedArena() {
    for (int i = 0; i < 10_000; i++) {
      try (var arena = Arena.ofConfined()) {
        var n = Gmp.newMpz(arena);
        gmp_h.mpz_ui_pow_ui(n, 3, 1000 + i % 100);
        var m = Gmp.newMpz(arena);
        gmp_h.mpz_add_ui(m, n, 1);
      }
    }
  }

  @Test
  void toDecimalString() {
    try (var arena = Arena.ofConfined()) {
      var n = Gmp.newMpz(arena);
      gmp_h.mpz_ui_pow_ui(n, 10, 30);
      gmp_h.mpz_add_ui(n, n, 7);
      assertEquals("1000000000000000000000000000007", Gmp.toDecimalString(n));
      // mpz_sizeinbaseが1大きく返す値(10^k - 1 付近)でも余分な文字が付かない
      gmp_h.mpz_ui_pow_ui(n, 10, 30);
      gmp_h.mpz_sub_ui(n, n, 1);
      assertEquals("9".repeat(30), Gmp.toDecimalString(n));
    }
  }
}
