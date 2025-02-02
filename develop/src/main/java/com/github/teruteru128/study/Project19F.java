package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.__gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.gmp_randseed;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_import;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_2exp;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_prevprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;
import static com.github.teruteru128.study.Factory.ARRAY_ELEMENTS_MAX;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;

import com.github.teruteru128.gmp.__gmp_randstate_struct;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Parameters;

@Command(name = "project19f")
public class Project19F implements Callable<Integer> {

  @Parameters
  private Path out;

  @Override
  public Integer call() throws Exception {
    var array = new Long[ARRAY_ELEMENTS_MAX];
    var auto = Arena.ofAuto();
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 18);
    var max = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(max, 0xffffffff);
    mpz_mul_2exp(max, max, 32);
    mpz_add_ui(max, max, 0xffffffff);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(window, 10);
    mpz_pow_ui(window, window, 19);
    mpz_prevprime(window, window);
    mpz_sub(window, window, min);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    __gmp_randinit_default(state);
    {
      var seed = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init(seed);
      var elementCount = 2493;
      var seedNativeSegment = auto.allocate(JAVA_BYTE, elementCount);
      MemorySegment.copy(
          ((SecureRandom) Factory.SECURE_RANDOM_GENERATOR).generateSeed(elementCount), 0,
          seedNativeSegment, JAVA_BYTE, 0, elementCount);
      mpz_import(seed, elementCount, 1, 1, 0, 0, seedNativeSegment);
      gmp_randseed(state, seed);
    }
    int j = 10000000;
    for (int i = 0; i < ARRAY_ELEMENTS_MAX; i++) {
      mpz_urandomm(p, state, window);
      mpz_nextprime(p, p);
      array[i] = PrimeSearch.mpz_get_ui(p);
      if (i < 10) {
        System.err.printf("%d%n", i);
      }
      if (i == j) {
        System.err.printf("%d%n", i);
        j += 10000000;
      }
    }
    Arrays.sort(array, Long::compareUnsigned);
    try (var os = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(out)))) {
      for (long l : array) {
        os.writeLong(l);
      }
    }
    return ExitCode.OK;
  }
}
