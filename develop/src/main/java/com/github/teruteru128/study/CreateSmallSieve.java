package com.github.teruteru128.study;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "createSmallSieve")
public class CreateSmallSieve implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(CreateSmallSieve.class);

  @Parameters(description = "素数リストのビット長。(0x7ffffffdL << 6)ビットまで。")
  long bitLength;

  static long[] createSmallSieve0(long length) {
    var sieve = new long[unitIndex(length - 1) + 1];
    logger.info("sieve.length = {}", sieve.length);
    sieve[0] = 1;
    long nextIndex = 1;
    long nextPrime = 3;

    do {
      sieveSingle(sieve, length, nextIndex + nextPrime, nextPrime);
      nextIndex = sieveSearch(sieve, length, nextIndex + 1);
      nextPrime = 2 * nextIndex + 1;
    } while ((nextIndex > 0) && (nextPrime < length));
    return sieve;
  }

  /**
   *
   * @param bits bits
   * @param limit bitsのリミット。bit単位
   * @param start start
   * @return next step
   */
  private static long sieveSearch(long[] bits, long limit, long start) {
    if (start >= limit) {
      return -1;
    }
    var u = unitIndex(start);
    final var wordLimit = unitIndex(limit - 1) + 1;
    long word = ~bits[u] & (0xffffffffffffffffL << start);
    while (true) {
      if (word != 0) {
        return (long) u * 64 + Long.numberOfTrailingZeros(word);
      }
      if (++u == wordLimit) {
        return -1;
      }
      word = ~bits[u];
    }
  }

  private static int unitIndex(long bitIndex) {
    return (int) (bitIndex >>> 6);
  }

  private static void sieveSingle(long[] bits, long limit, long start, long step) {
    while (start < limit) {
      set(bits, start);
      start += step;
    }
  }

  private static void set(long[] bits, long bitIndex) {
    bits[unitIndex(bitIndex)] |= bit(bitIndex);
  }

  private static long bit(long bitIndex) {
    return 1L << (bitIndex & 0x3f);
  }

  @Override
  public Integer call() throws IOException {
    logger.info("create {}bit small sieve...", bitLength);
    // 小さな既知素数ふるいを作成、もしくは読み込む
    var sieve = createSmallSieve0(bitLength);
    var primeCount = Arrays.stream(sieve).parallel().map(l -> Long.bitCount(~l)).sum();
    logger.info("{} primes", primeCount);
    var path = Paths.get(bitLength + "bit-small-sieve.obj");
    logger.info("write to {}", path);
    try (var oos = new ObjectOutputStream(new BufferedOutputStream(
        Files.newOutputStream(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE),
        Factory.ARRAY_ELEMENTS_MAX))) {
      oos.writeLong(bitLength);
      var length = sieve.length;
      if (length == Factory.ARRAY_ELEMENTS_MAX) {
        for (long l : sieve) {
          oos.writeLong(l);
        }
      } else {
        oos.writeObject(sieve);
      }
    }
    return 0;
  }
}
