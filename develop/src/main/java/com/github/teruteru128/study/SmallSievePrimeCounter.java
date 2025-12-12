package com.github.teruteru128.study;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;

@Command(name = "countKnownPrimeNumbersFromSmallSieve")
public class SmallSievePrimeCounter implements Callable<Integer> {

  @Override
  public Integer call() throws IOException, ClassNotFoundException {
    long[] smallSieve;
    try (var ois = new ObjectInputStream(
        new BufferedInputStream(Files.newInputStream(Path.of("137438953280bit-small-sieve.obj")), Factory.ARRAY_ELEMENTS_MAX))) {
      try {
        smallSieve = (long[]) ois.readObject();
      } catch (OptionalDataException e) {
        if (!e.eof) {
          var length = ois.readLong();
          var i1 = PrimeSearch.unitIndex(length - 1) + 1;
          if (i1 == Factory.ARRAY_ELEMENTS_MAX) {
            smallSieve = new long[i1];
            for (int i = 0; i < i1; i++) {
              smallSieve[i] = ois.readLong();
            }
          } else {
            smallSieve = (long[]) ois.readObject();
          }
        } else {
          throw e;
        }
      }
    }
    var sieve = smallSieve;
    var primeCount = Arrays.stream(sieve).parallel().map(l -> Long.bitCount(~l)).sum();
    System.out.printf("%d primes%n", primeCount);
    return ExitCode.OK;
  }
}
