package com.github.teruteru128.foreign.prime.search;

import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_probab_prime_p;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.sql.SQLException;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@code even + step * 2L + 1}の素数判定を行うタスククラス。
 */
public class PrimeSearchTask2 implements Callable<Result> {

  private static final Logger logger = LoggerFactory.getLogger(PrimeSearchTask2.class);
  private static final Arena auto = Arena.ofAuto();
  private static final ThreadLocal<MemorySegment> THREAD_CANDIDATES = ThreadLocal.withInitial(() -> {
    var candidate = auto.allocate(__mpz_struct.layout()).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(candidate);
    return candidate;
  });
  private final MemorySegment even;
  private final int step;

  public PrimeSearchTask2(MemorySegment even, int step) {
    this.even = even;
    this.step = step;
  }

  @Override
  public Result call() throws SQLException {
    var candidate = THREAD_CANDIDATES.get();
//    mpz_add_ui(candidate, even, (int) (step * 2L + 1));
    mpz_add_ui(candidate, even, step);
    mpz_add_ui(candidate, candidate, step);
    mpz_add_ui(candidate, candidate, 1);
    int result;
    long start;
    long finish;
    logger.debug("current step: {}", step);
    start = System.nanoTime();
    result = mpz_probab_prime_p(candidate, 25);
    finish = System.nanoTime();
    logger.info("step {}: {}({} hours)", step, result, (finish - start) / 3.6e12);
    // {@code result != 0} で十分だと思うんだが
    // return result == 1 || result == 2 ? Optional.of(step) : Optional.empty();
    return new Result(step, result);
  }

}
