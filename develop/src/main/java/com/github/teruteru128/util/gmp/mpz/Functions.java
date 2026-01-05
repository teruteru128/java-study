package com.github.teruteru128.util.gmp.mpz;

import com.github.teruteru128.gmp.msys2.__mpz_struct;
import com.github.teruteru128.gmp.msys2.gmp_h;
import java.lang.foreign.MemorySegment;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

public final class Functions {

  private Functions() {
  }


  private static MemorySegment MPZ_NEWALLOC(MemorySegment z, int n) {
    return n > __mpz_struct._mp_alloc(z) ? gmp_h.mpz_realloc(z, n) : __mpz_struct._mp_d(z);
  }

  /**
   * @param destination set to destination
   * @param val         val
   */
  public static void mpz_set_u64(MemorySegment destination, long val) {
    MPZ_NEWALLOC(destination, 1).setAtIndex(JAVA_LONG, 0, val);
    __mpz_struct._mp_size(destination, val != 0 ? 1 : 0);
  }

  public static long mpz_get_u64(MemorySegment z) {
    var p = __mpz_struct._mp_d(z);
    var n = __mpz_struct._mp_size(z);
    var l = p.getAtIndex(JAVA_LONG, 0);
    return n != 0 ? l : 0;
  }

  public static boolean mpz_odd_p(MemorySegment z) {
    return (__mpz_struct._mp_d(z).getAtIndex(JAVA_LONG, 0) & 1) != 0;
  }

  public static boolean mpz_even_p(MemorySegment z) {
    return !mpz_odd_p(z);
  }

  public static boolean mpz_fits_utype_p(MemorySegment z, long maxVal) {
    var n = __mpz_struct._mp_size(z);
    var p = __mpz_struct._mp_d(z);
    return (n == 0 || (n == 1 && Long.compareUnsigned(p.getAtIndex(JAVA_LONG, 0), maxVal) <= 0));
  }

  public static boolean mpz_fits_ulong_p(MemorySegment z) {
    return mpz_fits_utype_p(z, -1L);
  }

  static boolean mpz_fits_uint_p(MemorySegment z) {
    return mpz_fits_utype_p(z, 0xffffffffL);
  }
}
