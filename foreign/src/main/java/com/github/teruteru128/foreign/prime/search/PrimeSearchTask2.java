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
import java.util.concurrent.CyclicBarrier;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@code even + step * 2L + 1}の素数判定を行うタスククラス。
 */
public class PrimeSearchTask2 implements Callable<Result> {

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
  private final long id;

  public PrimeSearchTask2(MemorySegment even, int step, DataSource source, long id) {
    this(even, step, source, id, null);
  }

  /**
   * @param even    even
   * @param step    step
   * @param source
   * @param id
   * @param barrier テストが終わったあとに同期を取るためのサイクリックバリア。nullable
   */
  public PrimeSearchTask2(MemorySegment even, int step, DataSource source, long id,
      CyclicBarrier barrier) {
    this.even = even;
    this.id = id;
    this.step = step;
    this.source = source;
  }

  @Override
  public Result call() throws SQLException {
    var candidate = threadCandidates.get();
    mpz_add_ui(candidate, even, step * 2L + 1);
    int result;
    long start;
    long finish;
    logger.debug("current step: {}", step);
    start = System.nanoTime();
    result = mpz_probab_prime_p(candidate, 25);
    finish = System.nanoTime();
    updateDB(result);
    logger.info("step {}: {}({} hours)", step, result, (finish - start) / 3.6e12);
    // {@code result != 0} で十分だと思うんだが
    // return result == 1 || result == 2 ? Optional.of(step) : Optional.empty();
    return new Result(step, result);
  }

  private void updateDB(int result) throws SQLException {
    try (var connection = source.getConnection()) {
      if (result == 0) {
        try (var ps = connection.prepareStatement(
            "update candidates set composite = composite + 1 where id = ? and step = ?;")) {
          ps.setLong(1, id);
          ps.setInt(2, step);
          ps.execute();
        }
      } else if (result == 1) {
        try (var ps = connection.prepareStatement(
            "update candidates set probably_prime = probably_prime + 1 where id = ? and step = ?;")) {
          ps.setLong(1, id);
          ps.setInt(2, step);
          ps.execute();
        }
      } else if (result == 2) {
        try (var ps = connection.prepareStatement(
            "update candidates set definitely_prime = definitely_prime + 1 where id = ? and step = ?;")) {
          ps.setLong(1, id);
          ps.setInt(2, step);
          ps.execute();
        }
      }
    }
  }
}
