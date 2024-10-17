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
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "e")
public class E implements Callable<Integer> {

  private static final Logger log = LoggerFactory.getLogger(E.class);
  @Option(names = "prefix", converter = BigIntegerHexConverter.class)
  BigInteger prefixNumber = new BigInteger(1024, new SecureRandom());

  @Override
  public Integer call() throws Exception {
    long start;
    long finish;
    try (var arena = Arena.ofConfined()) {
      var mpzStructLayout = __mpz_struct.layout();
      var mpzArrayLayout = MemoryLayout.sequenceLayout(2, mpzStructLayout);
      var offset = mpzArrayLayout.byteOffset(PathElement.sequenceElement(1));
      MemorySegment prefixSegment;
      MemorySegment candidateSegment;
      {
        var segment = arena.allocate(mpzArrayLayout);
        prefixSegment = segment.asSlice(0, mpzStructLayout);
        candidateSegment = segment.asSlice(offset, mpzStructLayout);
      }
      var byteArray = prefixNumber.toByteArray();
      __gmpz_inits.makeInvoker(ADDRESS, ADDRESS).apply(prefixSegment, candidateSegment, NULL);
      // set
      __gmpz_import(prefixSegment, byteArray.length, 1, JAVA_BYTE.byteSize(), 1, 0,
          arena.allocateFrom(JAVA_BYTE, byteArray));
      int ret;
      final var shiftWidth = 1047552;
      while (true) {
        var prefixLength = __gmpz_sizeinbase(prefixSegment, 16) + 2;
        var prefixStr = arena.allocate(prefixLength);
        __gmpz_get_str(prefixStr, 16, prefixSegment);
        log.info("prefix: {}", prefixStr.getString(0));
        __gmpz_mul_2exp(candidateSegment, prefixSegment, shiftWidth);
        __gmpz_setbit(candidateSegment, 0);
        start = System.nanoTime();
        ret = __gmpz_probab_prime_p(candidateSegment, 15);
        finish = System.nanoTime();
        log.debug("{} seconds", (finish - start) / 1e9);
        if (ret == 2 || ret == 1) {
          break;
        }
        __gmpz_add_ui(prefixSegment, prefixSegment, 1);
      }
      var decimalSize = __gmpz_sizeinbase(candidateSegment, 10) + 2;
      var decimalFormattedPrime = arena.allocate(decimalSize);
      __gmpz_get_str(decimalFormattedPrime, 10, prefixSegment);
      log.info("({} << {}) | 1: {}", decimalFormattedPrime.getString(0), shiftWidth, ret);
      __gmpz_clears.makeInvoker(ADDRESS, ADDRESS).apply(prefixSegment, candidateSegment, NULL);
    }
    return 0;
  }
}
