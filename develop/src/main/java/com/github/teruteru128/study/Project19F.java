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
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
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
  @Parameters
  private Path out0;
  @Parameters
  private Path out1;

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
    {
      var seed = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init(seed);
      var numOfElements = 2493;
      var seedNativeSegment = auto.allocate(numOfElements);
      MemorySegment.copy(
          ((SecureRandom) Factory.SECURE_RANDOM_GENERATOR).generateSeed(numOfElements), 0,
          seedNativeSegment, JAVA_BYTE, 0, numOfElements);
      mpz_import(seed, numOfElements, 1, 1, 0, 0, seedNativeSegment);
      gmp_randseed(state, seed);
    }
    logger.info("random state initialized.");
    long prime;
    var paths = new Path[]{out0, out1};
    for (int k = 0; k < paths.length; k++) {
      var path = paths[k];
      try (var os = new DataOutputStream(
          new BufferedOutputStream(Files.newOutputStream(path), ARRAY_ELEMENTS_MAX))) {
        long j = 0x1000000L;
        for (long i = 0; i < 0x80000000L; i++) {
          mpz_urandomm(p, state, window);
          mpz_add(p, p, min);
          mpz_nextprime(p, p);
          prime = PrimeSearch.mpz_get_ui(p);
          os.writeLong(prime);
          if (i == j) {
            logger.info("file {}, {}: {}", k, i, Long.toUnsignedString(prime));
            j += 0x1000000L;
          }
        }
      }
      logger.info("file {} done", k + 1);
    }
    logger.info("generate done");
    return ExitCode.OK;
  }
}
