package com.github.teruteru128.foreign;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru.gmp.gmp_h;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.RecursiveTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeSearchTask extends RecursiveTask<Set<Integer>> {

  private static final Logger log = LoggerFactory.getLogger(PrimeSearchTask.class);
  private final MemorySegment even;
  private final int[] sieve;
  private final int from;
  private final int to;

  public PrimeSearchTask(MemorySegment even, int[] sieve, int from, int to) {
    this.even = even;
    this.sieve = sieve;
    this.from = from;
    this.to = to;
  }

  @Override
  protected Set<Integer> compute() {
    var range = to - from;
    if (range == 0) {
      var arena = Arena.ofAuto();
      // generate prime number candidate
      var candidate = arena.allocate(__mpz_struct.layout());
      gmp_h.__gmpz_init_set(candidate, even);
      gmp_h.__gmpz_add_ui(candidate, candidate, sieve[from] * 2L + 1);
      int ret;
      log.debug("start step: {}", sieve[from]);
      long start = System.nanoTime();
      ret = gmp_h.__gmpz_probab_prime_p(candidate, 15);
      long finish = System.nanoTime();
      gmp_h.__gmpz_clear(candidate);
      log.info("step {}: {}({} hours)", sieve[from], ret, (finish - start) / 3.6e12);
      if (ret == 0) {
        return Set.of();
      } else {
        // insert result
        return Set.of(sieve[from]);
      }
    } else {
      int mid = from + range / 2;
      var leftTask = new PrimeSearchTask(even, sieve, from, mid);
      var rightTask = new PrimeSearchTask(even, sieve, mid + 1, to);
      leftTask.fork();
      var resultSet = new TreeSet<Integer>();
      resultSet.addAll(rightTask.compute());
      resultSet.addAll(leftTask.join());
      return resultSet;
    }
  }
}
