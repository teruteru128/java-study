package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.linux.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.linux.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.linux.gmp_h.mpz_init_set;
import static com.github.teruteru128.gmp.linux.gmp_h.mpz_init_set_str;
import static com.github.teruteru128.gmp.linux.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.linux.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;

import com.github.teruteru128.gmp.linux.__mpz_struct;
import com.github.teruteru128.gmp.linux.gmp_h;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class GMPWrapper {

  public static MemorySegment newMpz(Arena arena) {
    var b = __mpz_struct.allocate(arena).reinterpret(arena, gmp_h::mpz_clear);
    mpz_init(b);
    return b;
  }

  public static MemorySegment newMpzSet(Arena arena, MemorySegment n) {
    var b = __mpz_struct.allocate(arena).reinterpret(arena, gmp_h::mpz_clear);
    mpz_init_set(b, n);
    return b;
  }

  public static MemorySegment newMpzStr(Arena arena, String str, int base) {
    var b = __mpz_struct.allocate(arena).reinterpret(arena, gmp_h::mpz_clear);
    mpz_init_set_str(b, arena.allocateFrom(str), base);
    return b;
  }

  public static MemorySegment newMpzUi(Arena arena, int op) {
    var b = __mpz_struct.allocate(arena).reinterpret(arena, gmp_h::mpz_clear);
    mpz_init_set_ui(b, op);
    return b;
  }

  public static MemorySegment newMpzUi(Arena auto, long op) {
    var b = newMpz(auto);
    mpz_set_u64(b, op);
    return b;
  }

  public static String mpzToString(Arena auto, MemorySegment n2, int base) {
    var length2 = mpz_sizeinbase(n2, base) + 2;
    var buf2 = auto.allocate(length2);
    mpz_get_str(buf2, base, n2);
    return buf2.getString(0);
  }
}
