package com.github.teruteru128.study;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;

@Command(name = "countKnownPrimeNumbersFromSmallSieve")
public class SmallSievePrimeCounter implements Callable<Integer> {

  @Override
  public Integer call() throws IOException, ClassNotFoundException {
    var sieve = com.github.teruteru128.study.PrimeSearch.loadSmallSieve(
        Path.of("137438953280bit-small-sieve.obj"));
    var primeCount = Arrays.stream(sieve).parallel().map(l -> Long.bitCount(~l)).sum();
    System.out.printf("%d primes%n", primeCount);
    return ExitCode.OK;
  }
}
