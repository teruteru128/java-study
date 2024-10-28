package com.github.teruteru128.study;

import static com.github.teruteru128.study.PrimeSearch.sieveSearch;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class Sieve {

  private static final VarHandle stepVarHandle;
  private static final Logger log = LoggerFactory.getLogger(Sieve.class);

  static {
    var lookup = MethodHandles.lookup();
    try {
      stepVarHandle = lookup.findVarHandle(Sieve.class, "step", long.class);
    } catch (NoSuchFieldException | IllegalAccessException e) {
      throw new ExceptionInInitializerError(e);
    }
  }

  private final long[] sieve;
  /**
   * sieveのリミット。bit単位。
   */
  private final long limit;
  private long step;

  public Sieve(long[] sieve) {
    this(sieve, sieve.length * 64L, 0);
  }

  public Sieve(long[] sieve, long limit, long start) {
    this.sieve = sieve;
    this.limit = limit;
    this.step = sieveSearch(sieve, limit, start);
  }

  // FIXME {@code VarHandle}を使って{@code synchronized}を外したい

  /**
   *
   * @return next step
   */
  public synchronized long nextStep() {
    var st = this.step;
    if (st < 0) {
      return -1;
    }
    this.step = sieveSearch(sieve, limit, st + 1);
    return st;
  }
}
