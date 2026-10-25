package com.github.teruteru128.primesearch.gmp;

import com.github.teruteru128.gmp.linux.__mpz_struct;
import com.github.teruteru128.gmp.linux.gmp_h;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.nio.charset.StandardCharsets;

/**
 * gmp-linux/gmp-msys2バインディングの実体差異(Windowsのunsigned longが32bitに
 * なる問題など)を呼び出し側から隠すための最小限のファサード。
 * 現状はLinux実装のみ。Windows対応が必要になったら実装を切り替える。
 */
public final class Gmp {

  private static final MethodHandle MALLOC;
  private static final MethodHandle FREE;

  static {
    var linker = Linker.nativeLinker();
    var libc = linker.defaultLookup();
    MALLOC = linker.downcallHandle(libc.findOrThrow("malloc"),
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    FREE = linker.downcallHandle(libc.findOrThrow("free"),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
  }

  private Gmp() {
  }

  /**
   * 未初期化のmpz_t用領域を確保する(mpz_init_set_str等、自前で初期化する
   * 関数と組み合わせて使う)。arenaを閉じるとmpz_clearしてから領域を解放する。
   */
  public static MemorySegment allocateUninitialized(Arena arena) {
    // 構造体をarenaから確保してreinterpret(arena, mpz_clear)を付けると、arenaを閉じたとき
    // 構造体の解放とmpz_clearのどちらが先に走るかがAPI上決まっていない。JDK 25の
    // Arena.ofConfined()は最初に登録した後始末(=構造体の解放)を最初に実行するので、
    // mpz_clearが解放済みの構造体から_mp_dを読み、free()で落ちていた(2026-10-25)。
    // 順序に頼らないよう、構造体はmallocで取り、1つの後始末でclear→freeの順に呼ぶ。
    MemorySegment raw;
    try {
      raw = (MemorySegment) MALLOC.invokeExact(__mpz_struct.sizeof());
    } catch (Throwable e) {
      throw new IllegalStateException("mallocの呼び出しに失敗しました", e);
    }
    if (raw.equals(MemorySegment.NULL)) {
      throw new OutOfMemoryError("mpz_t用の領域を確保できません");
    }
    return raw.reinterpret(__mpz_struct.sizeof(), arena, s -> {
      gmp_h.mpz_clear(s);
      try {
        FREE.invokeExact(s);
      } catch (Throwable e) {
        throw new IllegalStateException("freeの呼び出しに失敗しました", e);
      }
    });
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

  /** nを10進数の文字列にする(2,097,152bitで約63万桁)。 */
  public static String toDecimalString(MemorySegment n) {
    try (var arena = Arena.ofConfined()) {
      // mpz_sizeinbaseは1大きく返すことがある。符号と終端NULの分を足す
      var buffer = arena.allocate(gmp_h.mpz_sizeinbase(n, 10) + 2);
      gmp_h.mpz_get_str(buffer, 10, n);
      return buffer.getString(0, StandardCharsets.US_ASCII);
    }
  }
}
