package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.gmp_randseed;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_import;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;
import static com.github.teruteru128.study.Factory.ARRAY_ELEMENTS_MAX;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru128.gmp.__gmp_randstate_struct;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

/**
 * 素数をファイルに大量に吐き出す。
 * <p>
 * 最初の素数(long)とそれ以降の素数の間隔のリストの形式のほうがいいんだろうか……
 * </p>
 */
@Command(name = "project19f")
public class Project19F implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(Project19F.class);
  @Option(names = {"--num-of-elements", "-n"})
  private long numOfElements = 0x80000000L;
  @Parameters
  private Path out;

  @Override
  public Integer call() throws Exception {
    var auto = Arena.ofAuto();
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 18);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    // 10^19未満で最大の素数 9999999999999999961 - min = 8999999999999999961
    mpz_init_set_str(window, auto.allocateFrom("8999999999999999961"), 10);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    var array2 = auto.allocate(JAVA_LONG, numOfElements);
    logger.info("variables initialized.");
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
    logger.info("random state initialized.");
    int j = 10000000;
    long prime;
    for (long i = 0L; i < numOfElements; i++) {
      mpz_urandomm(p, state, window);
      mpz_add(p, p, min);
      mpz_nextprime(p, p);
      prime = PrimeSearch.mpz_get_ui(p);
      array2.setAtIndex(JAVA_LONG, i, prime);
      if (i == j) {
        logger.info("{}, {}", i, Long.toUnsignedString(prime));
        j += 10000000;
      }
    }
    logger.info("generate done");
    // TreeSetでやるのとどっちがいいんやろな
    // Integer.MAX_VALUE以上の要素を扱う場合TreeSetは候補から外れる
    /*qsort(array2, numOfElements, 8, _CoreCrtNonSecureSearchSortCompareFunction.allocate(
        (a, b) -> Long.compareUnsigned(a.getAtIndex(JAVA_LONG, 0), b.getAtIndex(JAVA_LONG, 0)),
        auto));*/
    try (var os = new DataOutputStream(
        new BufferedOutputStream(Files.newOutputStream(out), ARRAY_ELEMENTS_MAX))) {
      array2.elements(JAVA_LONG).mapToLong(e -> e.getAtIndex(JAVA_LONG, 0)).forEach(v -> {
        try {
          os.writeLong(v);
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      });
    }
    return ExitCode.OK;
  }
}
