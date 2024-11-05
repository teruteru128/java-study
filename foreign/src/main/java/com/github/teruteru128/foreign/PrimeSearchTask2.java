package com.github.teruteru128.foreign;

import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_probab_prime_p;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.sql.SQLException;
import java.util.Optional;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@code even + step * 2L + 1}の素数判定を行うタスククラス。
 */
public class PrimeSearchTask2 implements Callable<Optional<Integer>> {

  private static final Logger logger = LoggerFactory.getLogger(PrimeSearchTask2.class);
  private static final Arena auto = Arena.ofAuto();
  private static final ThreadLocal<MemorySegment> threadCandidates = ThreadLocal.withInitial(() -> {
    var candidate = auto.allocate(__mpz_struct.layout()).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(candidate);
    return candidate;
  });
  private final MemorySegment even;
  private final int step;
  private final DataSource source;
  private CyclicBarrier barrier;

  public PrimeSearchTask2(MemorySegment even, int step) {
    this.even = even;
    this.step = step;
    this.barrier = null;
    this.source = null;
  }

  /**
   * @param even    even
   * @param step    step
   * @param barrier テストが終わったあとに同期を取るためのサイクリックバリア。
   * @param source
   */
  public PrimeSearchTask2(MemorySegment even, int step, CyclicBarrier barrier, DataSource source) {
    this.even = even;
    this.step = step;
    this.barrier = barrier;
    this.source = source;
  }

  public CyclicBarrier getBarrier() {
    return barrier;
  }

  public void setBarrier(CyclicBarrier barrier) {
    this.barrier = barrier;
  }

  @Override
  public Optional<Integer> call() throws SQLException {
    var candidate = threadCandidates.get();
    mpz_add_ui(candidate, even, step * 2L + 1);
    int result;
    long start;
    long finish;
    logger.debug("current step: {}", step);
    start = System.nanoTime();
    result = mpz_probab_prime_p(candidate, 25);
    finish = System.nanoTime();
    logger.info("step {}: {}({} hours)", step, result, (finish - start) / 3.6e12);
    if (barrier != null) {
      try {
        barrier.await();
      } catch (InterruptedException | BrokenBarrierException e) {
        throw new RuntimeException(e);
      }
    }
    // {@code result != 0} で十分だと思うんだが
    // return result == 1 || result == 2 ? Optional.of(step) : Optional.empty();
    return switch (result) {
      case 0 -> Optional.empty();
      case 1, 2 -> Optional.of(step);
      // おそらく有り得ない
      // FIXME 適切な{@code Exception}に変える
      default -> throw new RuntimeException("Illegal result " + result + " in " + step);
    };
  }
}
