package com.github.teruteru128.foreign;

import static com.github.teruteru.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru.gmp.gmp_h.mpz_clear;
import static com.github.teruteru.gmp.gmp_h.mpz_init2;
import static com.github.teruteru.gmp.gmp_h.mpz_probab_prime_p;

import com.github.teruteru.gmp.__mpz_struct;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Optional;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeSearchTask2 implements Callable<Optional<Integer>> {

  private static final Logger logger = LoggerFactory.getLogger(PrimeSearchTask2.class);
  private static final Arena auto = Arena.ofAuto();
  private static final ThreadLocal<MemorySegment> threadCandidate = ThreadLocal.withInitial(() -> {
    var candidate = auto.allocate(__mpz_struct.layout()).reinterpret(auto, x0 -> {
      logger.trace("Candidate have been released: {}", x0.address());
      mpz_clear(x0);
    });
    mpz_init2(candidate, 1048576);
    logger.trace("candidate storage have been initialized");
    return candidate;
  });
  private final MemorySegment even;
  private final int step;
  private final CyclicBarrier barrier;

  public PrimeSearchTask2(MemorySegment even, int step, CyclicBarrier barrier) {
    this.even = even;
    this.step = step;
    this.barrier = barrier;
  }

  @Override
  public Optional<Integer> call() {
    var candidate = threadCandidate.get();
    mpz_add_ui(candidate, even, step * 2L + 1);
    int result;
    long start;
    long finish;
    logger.debug("current step: {}", step);
    start = System.nanoTime();
    result = mpz_probab_prime_p(candidate, 25);
    finish = System.nanoTime();
    logger.info("step {}: {}({} hours)", step, result, (finish - start) / 3.6e12);
    try {
      barrier.await();
    } catch (InterruptedException | BrokenBarrierException e) {
      throw new RuntimeException(e);
    }
    return result == 1 || result == 2 ? Optional.of(step) : Optional.empty();
  }
}
