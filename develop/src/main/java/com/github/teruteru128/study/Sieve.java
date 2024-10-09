package com.github.teruteru128.study;

import static com.github.teruteru128.study.PrimeSearch.sieveSearch;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class Sieve {

  private static final VarHandle stepVarHandle;

  static {
    var lookup = MethodHandles.lookup();
    try {
      stepVarHandle = lookup.findVarHandle(Sieve.class, "step", long.class);
    } catch (NoSuchFieldException | IllegalAccessException e) {
      throw new ExceptionInInitializerError(e);
    }
  }

  private final long[] sieve;
  private final long limit;
  private long step;

  public Sieve(long[] sieve) {
    this(sieve, sieve.length * 64L, 0);
  }

  public Sieve(long[] sieve, long limit, long start) {
    this.sieve = sieve;
    this.limit = limit;
    this.step = start;
  }

  public synchronized long nextStep() {
    if (step < 0) {
      return -1;
    }
    if (step == 0) {
      return this.step = sieveSearch(sieve, limit, step);
    }
    return this.step = sieveSearch(sieve, limit, step + 1);
  }
}
