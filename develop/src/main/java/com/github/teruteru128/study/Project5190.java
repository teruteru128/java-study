package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_2exp;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static com.github.teruteru128.study.PrimeSearch.loadSmallSieve;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_fits_ulong_p;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_get_u64;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.study.CreateLargeSieveTask.MemorySegmentCallable;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.nio.file.Path;
import java.util.BitSet;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;

/**
 * 5190digitsの素数探そうぜ！プロジェクト
 */
@Command(name = "project5190", description = "5190digitsの素数探そうぜ！プロジェクト")
public class Project5190 implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(Project5190.class);

  @Option(names = {"--small-sieve",
      "-S"}, defaultValue = "small-sieve-524288bit.obj")
  Path smallSievepath;
  @Option(names = {"--bits"}, defaultValue = "5189")
  private int bits;
  @Option(names = {"--offset"}, defaultValue = "0")
  private long offset;

  /**
   *
   * @return ExitCode
   * @throws IOException
   * @throws ClassNotFoundException
   */
  @Override
  public Integer call() throws IOException, ClassNotFoundException {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(n, 10);
    mpz_pow_ui(n, n, bits);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set(p, n);
    var diff = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(diff);
    long start;
    long finish;
    if (offset != 0) {
      var tmp = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init_set_ui(tmp, (int) (offset >>> 32));
      mpz_mul_2exp(tmp, tmp, 32);
      mpz_add_ui(tmp, tmp, (int) (offset & 0xffffffffL));
      mpz_add(p, p, tmp);
    }

    var bitset = loadSmallSieve(smallSievepath);
    var largeSieve = BitSet.valueOf(
        new MemorySegmentCallable(auto, p, bitset, 0, bitset.length, bitset.length * 5,
            bitset.length * 320L).call().toArray(ValueLayout.JAVA_LONG));
    var notSet = new BitSet(largeSieve.length());
    notSet.set(0, largeSieve.length());
    notSet.andNot(largeSieve);
    notSet.stream().filter(i -> false).forEach(System.out::println);

    for (int i = 0; i < 126; i++) {
      start = System.nanoTime();
      mpz_nextprime(p, p);
      finish = System.nanoTime();
      mpz_sub(diff, p, n);
      var timeDiff1 = (finish - start) / 3.6e12;
      String string;
      if (mpz_fits_ulong_p(diff)) {
        string = Long.toString(mpz_get_u64(diff));
      } else {
        var len = mpz_sizeinbase(diff, 10) + 2;
        var buf = auto.allocate(len);
        mpz_get_str(buf, 10, diff);
        string = buf.getString(0);
      }
      logger.info("10^{} + {}, {}", bits, string, timeDiff1);
    }
    return ExitCode.OK;
  }
}
