package com.github.teruteru128.foreign.prime.search;

import com.github.teruteru128.foreign.gmp.Gmp;
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
  private static final ThreadLocal<MemorySegment> THREAD_CANDIDATES = ThreadLocal.withInitial(
      () -> Gmp.newMpz(auto));
  private final MemorySegment even;
  private final int step;

  public PrimeSearchTask2(MemorySegment even, int step) {
    this.even = even;
    this.step = step;
  }

  @Override
  public Result call() throws SQLException {
    var candidate = THREAD_CANDIDATES.get();
    Gmp.addUi(candidate, even, step);
    Gmp.addUi(candidate, candidate, step);
    Gmp.addUi(candidate, candidate, 1);
    int result;
    long start;
    long finish;
    start = System.nanoTime();
    result = Gmp.probabPrimeP(candidate, 24);
    finish = System.nanoTime();
    // {@code result != 0} で十分だと思うんだが
    // return result == 1 || result == 2 ? Optional.of(step) : Optional.empty();
    return new Result(step, result, start, finish);
  }

}
