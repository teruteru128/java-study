package com.github.teruteru128.foreign;

import static com.github.teruteru.gmp.gmp_h.__gmpz_add_ui;
import static com.github.teruteru.gmp.gmp_h.__gmpz_init_set;
import static com.github.teruteru.gmp.gmp_h.__gmpz_probab_prime_p;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru.gmp.gmp_h;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Optional;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeSearchTask2 implements Callable<Optional<Integer>> {

  private static final Logger log = LoggerFactory.getLogger(PrimeSearchTask2.class);
  private final MemorySegment even;
  private final int step;

  public PrimeSearchTask2(MemorySegment even, int step) {
    this.even = even;
    this.step = step;
  }

  @Override
  public Optional<Integer> call() {
    var arena = Arena.ofAuto();
    var candidate = arena.allocate(__mpz_struct.layout()).reinterpret(arena, gmp_h::__gmpz_clear);
    __gmpz_init_set(candidate, even);
    log.debug("current step: {}", step);
    __gmpz_add_ui(candidate, candidate, step * 2L + 1);
    int result;
    long start = System.nanoTime();
    result = __gmpz_probab_prime_p(candidate, 25);
    long finish = System.nanoTime();
    log.info("step {}: {}({} hours)", step, result, (finish - start) / 3.6e12);
    return result == 1 || result == 2 ? Optional.of(step) : Optional.empty();
  }
}
