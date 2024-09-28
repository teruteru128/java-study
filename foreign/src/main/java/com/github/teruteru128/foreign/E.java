package com.github.teruteru128.foreign;

import static com.github.teruteru.gmp.gmp_h.__gmpz_add_ui;
import static com.github.teruteru.gmp.gmp_h.__gmpz_get_str;
import static com.github.teruteru.gmp.gmp_h.__gmpz_import;
import static com.github.teruteru.gmp.gmp_h.__gmpz_mul_2exp;
import static com.github.teruteru.gmp.gmp_h.__gmpz_probab_prime_p;
import static com.github.teruteru.gmp.gmp_h.__gmpz_setbit;
import static com.github.teruteru.gmp.gmp_h.__gmpz_sizeinbase;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru.gmp.gmp_h.__gmpz_clears;
import com.github.teruteru.gmp.gmp_h.__gmpz_inits;
import com.github.teruteru128.foreign.converters.BigIntegerHexConverter;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "e")
public class E implements Callable<Integer> {

  @Option(names = "prefix", converter = BigIntegerHexConverter.class)
  BigInteger prefixNumber = new BigInteger(1024, new SecureRandom());

  @Override
  public Integer call() throws Exception {
    long start;
    long finish;
    try (var arena = Arena.ofConfined()) {
      MemorySegment prefixSegment = arena.allocate(__mpz_struct.layout(), 2);
      MemorySegment primeSegment = prefixSegment.asSlice(__mpz_struct.sizeof(),
          __mpz_struct.sizeof());
      var byteArray = prefixNumber.toByteArray();
      __gmpz_inits.makeInvoker(ADDRESS, ADDRESS).apply(prefixSegment, primeSegment, NULL);
      // set
      __gmpz_import(prefixSegment, byteArray.length, 1, JAVA_BYTE.byteSize(), 1, 0,
          arena.allocateFrom(JAVA_BYTE, byteArray));
      long prefixLength;
      while (true) {
        prefixLength = __gmpz_sizeinbase(prefixSegment, 16) + 2;
        var prefixStr = arena.allocate(prefixLength);
        __gmpz_get_str(prefixStr, 16, prefixSegment);
        System.out.println("prefix: " + prefixStr.getString(0));
        __gmpz_mul_2exp(primeSegment, prefixSegment, 1047552);
        __gmpz_setbit(primeSegment, 0);
        start = System.nanoTime();
        var ret = __gmpz_probab_prime_p(primeSegment, 15);
        finish = System.nanoTime();
        System.err.println((finish - start) / 1e9 + " seconds");
        if (ret == 2 || ret == 1) {
          break;
        }
        __gmpz_add_ui(prefixSegment, prefixSegment, 1);
      }
      var e = __gmpz_sizeinbase(primeSegment, 10) + 2;
      MemorySegment formatedPrime = arena.allocate(e);
      __gmpz_get_str(formatedPrime, 10, prefixSegment);
      System.out.println(prefixNumber.toString().equals(formatedPrime.getString(0)));
      __gmpz_clears.makeInvoker(ADDRESS, ADDRESS).apply(prefixSegment, primeSegment, NULL);
    }
    return 0;
  }
}
