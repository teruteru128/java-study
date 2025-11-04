package com.github.teruteru128.study;

import com.github.teruteru128.foreign.prime.search.PrimeSearch.LargeSieve;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.lang.foreign.MemorySegment;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.BitSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

/**
 * TODO create prime (or math?) package
 */
@Command(name = "attack")
public class PrimeSearch implements Callable<Void> {

  private static final Logger logger = LoggerFactory.getLogger(PrimeSearch.class);
  @Parameters
  private Path base;
  @Parameters
  private Path largeSieve;

  @Command(name = "exportBigIntegerAsDecimalText")
  private static void exportBigIntegerAsDecimalText(Path inPath, Path outPath)
      throws IOException, ClassNotFoundException {
    var p = loadEvenNumber(inPath);
    Files.write(outPath, List.of(p.toString()), StandardOpenOption.CREATE,
        StandardOpenOption.WRITE);
  }

  @Command(name = "generateLargeEvenNumber")
  private static void generateLargeEven(int bitLength)
      throws NoSuchAlgorithmException, IOException {
    final var instanceStrong = SecureRandom.getInstanceStrong();
    BigInteger evenNumber;
    final var th = BigInteger.TEN.pow(99999999);
    do {
      evenNumber = new BigInteger(bitLength, instanceStrong).setBit(bitLength - 1).clearBit(0);
    } while (evenNumber.compareTo(th) < 0);
    var path = Path.of("even-number-" + bitLength + "bit-" + UUID.randomUUID() + ".obj");
    exportEvenNumberObj(path, evenNumber);
  }

  public static void getConvertedStep() throws IOException, ClassNotFoundException {
    getConvertedStep(0);
  }

  public static void getConvertedStep(int firstStep) throws IOException, ClassNotFoundException {
    var base = loadEvenNumber(
        Paths.get("even-number-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd.obj"));
    LargeSieve result;
    Path path = Paths.get(
        "large-sieve-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd-3355392bit-6.obj");
    try (var ois = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(path)))) {
      var searchLength = ois.readInt();
      var sieve1 = BitSet.valueOf((long[]) ois.readObject());
      result = new LargeSieve(searchLength, sieve1);
    }
    var largeSieve = result;
    var sieve = largeSieve.sieve();
    var a = new BitSet(sieve.length());
    a.set(0, largeSieve.searchLength());
    a.andNot(sieve);
    var q = a.stream().filter(i -> i >= firstStep).asLongStream().filter(i -> {
      logger.debug("start: {}", i);
      var probablePrime = base.add(BigInteger.valueOf(2 * i + 1)).isProbablePrime(1);
      logger.info("step {} is {}", i, probablePrime);
      return probablePrime;
    }).findFirst();
    if (q.isPresent()) {
      logger.info("prime: step is {}", q.getAsLong());
    } else {
      logger.error("prime not found:");
    }
  }

  /**
   * generate even number and export to file
   * @param path written path
   * @param evenNumber start point of prime search
   * @throws IOException exception
   */
  public static void exportEvenNumberObj(Path path, BigInteger evenNumber) throws IOException {
    outputObj(path, evenNumber);
  }

  static BigInteger loadEvenNumber(Path path) throws IOException, ClassNotFoundException {
    BigInteger base;
    try (var ois = new ObjectInputStream(new ByteArrayInputStream(Files.readAllBytes(path)))) {
      base = (BigInteger) ois.readObject();
    }
    return base;
  }

  static long[] loadSmallSieve(Path path) throws IOException, ClassNotFoundException {
    long[] smallSieve;
    try (var ois = new ObjectInputStream(
        new BufferedInputStream(Files.newInputStream(path), Factory.ARRAY_ELEMENTS_MAX))) {
      try {
        smallSieve = (long[]) ois.readObject();
      } catch (OptionalDataException e) {
        if (!e.eof) {
          var length = ois.readLong();
          var i1 = unitIndex(length - 1) + 1;
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
    return smallSieve;
  }

  static long[] setBitsForNonPrimeNumbers(long[] smallSieve, BigInteger base, int searchLen) {
    long[] bis = new long[unitIndex(searchLen - 1) + 1];
    long start = 0;
    final var limit = smallSieve.length * 64L;
    long step = sieveSearch(smallSieve, limit, start);
    long convertedStep = (step * 2) + 1;
    do {
      start = base.mod(BigInteger.valueOf(convertedStep)).longValueExact();

      start = convertedStep - start;
      if ((start & 1) == 0) {
        start += convertedStep;
      }
      sieveSingle(bis, searchLen, (start - 1) / 2, convertedStep);

      step = sieveSearch(smallSieve, limit, step + 1);
      convertedStep = (step * 2L) + 1;
    } while (step > 0);
    return bis;
  }

  private static void randomSample() throws NoSuchAlgorithmException {
    var start = new BigInteger(1024, SecureRandom.getInstanceStrong());
    var startBitLength = start.bitLength();
    var fixed = new BigInteger(new BigInteger(start.toString(13), 16).toString(15), 17);
    var fixedBitLength = fixed.bitLength();
    var done = fixed.shiftRight(fixedBitLength - startBitLength);
    int doneBitLength = done.bitLength();
    System.out.printf("%dbit: %0256x%n", startBitLength, start);
    System.out.printf("%dbit: %0256x%n", fixedBitLength, fixed);
    System.out.printf("%dbit: %0256x%n", doneBitLength, done);
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

  private static void sieveSingle(long[] bits, long limit, long start, long step) {
    while (start < limit) {
      set(bits, start);
      start += step;
    }
  }

  private static boolean get(long[] bits, long bitIndex) {
    return ((bits[unitIndex(bitIndex)] & bit(bitIndex)) != 0);
  }

  private static void set(long[] bits, long bitIndex) {
    bits[unitIndex(bitIndex)] |= bit(bitIndex);
  }

  static int unitIndex(long bitIndex) {
    return (int) (bitIndex >>> 6);
  }

  private static long bit(long bitIndex) {
    return 1L << (bitIndex & 0x3f);
  }

  private static void outputObj(Path path, Serializable s) throws IOException {
    var baos = new ByteArrayOutputStream();
    try (var oos = new ObjectOutputStream(baos)) {
      oos.writeObject(s);
    }
    Files.write(path, baos.toByteArray(), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
  }

  static long previousClearBit(long[] words, long fromIndex) {
    if (fromIndex < 0) {
      if (fromIndex == -1) {
        return -1;
      }
      throw new IndexOutOfBoundsException("fromIndex < -1: " + fromIndex);
    }

    var u = unitIndex(fromIndex);
    if (u >= words.length) {
      return fromIndex;
    }

    long word = ~words[u] & (0xffffffffffffffffL >>> -(fromIndex + 1));
    while (true) {
      if (word != 0) {
        return (u + 1) * 64L - 1 - Long.numberOfLeadingZeros(word);
      }
      if (u-- == 0) {
        return -1;
      }
      word = ~words[u];
    }
  }

  public static long nextClearBit(long[] words, long fromIndex) {
    if (fromIndex < 0) {
      throw new IndexOutOfBoundsException("fromIndex < 0: " + fromIndex);
    }
    int u = unitIndex(fromIndex);
    var wordsInUse = words.length;
    if (u >= wordsInUse) {
      return fromIndex;
    }

    long word = ~words[u] & (-1L << fromIndex);
    while (true) {
      if (word != 0) {
        return (u * 64L) + Long.numberOfTrailingZeros(word);
      }
      if (++u == wordsInUse) {
        return wordsInUse * 64L;
      }
      word = ~words[u];
    }
  }

  @Override
  public Void call() throws Exception {
    return null;
  }

  record Result(MemorySegment mpzBase, int bitLength) {

  }

}
