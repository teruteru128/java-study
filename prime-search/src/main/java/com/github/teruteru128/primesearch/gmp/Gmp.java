package com.github.teruteru128.primesearch.gmp;

import com.github.teruteru128.gmp.linux.__mpz_struct;
import com.github.teruteru128.gmp.linux.gmp_h;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

/**
 * gmp-linux/gmp-msys2バインディングの実体差異(Windowsのunsigned longが32bitに
 * なる問題など)を呼び出し側から隠すための最小限のファサード。
 * 現状はLinux実装のみ。Windows対応が必要になったら実装を切り替える。
 */
public final class Gmp {

  private Gmp() {
  }

  /**
   * 未初期化のmpz_t用領域を確保する(mpz_init_set_str等、自前で初期化する
   * 関数と組み合わせて使う)。
   */
  public static MemorySegment allocateUninitialized(Arena arena) {
    return __mpz_struct.allocate(arena).reinterpret(arena, gmp_h::mpz_clear);
  }

  public static MemorySegment newMpz(Arena arena) {
    var b = allocateUninitialized(arena);
    gmp_h.mpz_init(b);
    return b;
  }

  /**
   * @return 0:成功, -1:パース失敗
   */
  public static int initSetStr(MemorySegment rop, MemorySegment str, int base) {
    return gmp_h.mpz_init_set_str(rop, str, base);
  }

  public static void addUi(MemorySegment rop, MemorySegment op1, long op2) {
    gmp_h.mpz_add_ui(rop, op1, op2);
  }

  public static int probabPrimeP(MemorySegment n, int reps) {
    return gmp_h.mpz_probab_prime_p(n, reps);
  }
}
