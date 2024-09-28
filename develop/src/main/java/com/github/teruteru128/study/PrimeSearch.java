package com.github.teruteru128.study;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.BitSet;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeSearch {

  private static final Logger logger = LoggerFactory.getLogger(PrimeSearch.class);

  public static void getConvertedStep() throws IOException, ClassNotFoundException {
    getConvertedStep(0);
  }

  public static void getConvertedStep(int firstStep) throws IOException, ClassNotFoundException {
    var base = PrimeSearch.loadEvenNumber(
        Paths.get("even-number-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd.obj"));
    var sieve = PrimeSearch.loadLargeSieve(
        Paths.get("large-sieve-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd-3355392bit-5.obj"));
    var a = new BitSet(sieve.length());
    a.set(0, sieve.length());
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

  public static void createLargeSieve(Path inPath)
      throws IOException, ClassNotFoundException, FileNotFoundException {
    // 小さなふるいを使って大きなふるいから合成数を除外
    // 大きな篩の長さ->1048576 / 20 * 64 = 3355444

    var smallSieve = PrimeSearch.loadSmallSieve();
    var base = PrimeSearch.loadEvenNumber(inPath);
    logger.debug("base: {} bits", base.bitLength());
    var searchLen = base.bitLength() / 20 * 64;
    logger.debug("search Length: {} bits", searchLen);
    logger.debug("small sieve: {} entries, {} bits", smallSieve.length, smallSieve.length * 64L);
    var bis = PrimeSearch.setABitForNonPrimeNumbers(smallSieve, base, searchLen);
    var set = BitSet.valueOf(bis);
    var nextClearBit = set.nextClearBit(0);
    if (nextClearBit == searchLen || nextClearBit == -1) {
      logger.error("失敗！");
      return;
    }
    var out = Path.of(
        "large-sieve-1048576bit-85c53395-9d78-44d2-9c95-9c53ff90f30a-" + searchLen + "bit-1.obj");
    try (var oos = new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(out)))) {
      oos.writeInt(searchLen);
      oos.writeObject(bis);
    }
  }

  public static void getSieve(long bitLength, String outputPath) throws IOException {
    // 小さな既知素数ふるいを作成、もしくは読み込む
    var sieve = PrimeSearch.createSmallSieve(bitLength);
    PrimeSearch.outputObj(Paths.get(outputPath), sieve);
  }

  /**
   * generate even number and export to file
   * @param path
   * @param evenNumber
   * @throws IOException
   */
  public static void exportEvenNumberObj(Path path, BigInteger evenNumber) throws IOException {
    outputObj(path, evenNumber);
  }

  static BitSet loadLargeSieve(Path path) throws IOException, ClassNotFoundException {
    long[] n = null;
    try (var ois = new ObjectInputStream(new ByteArrayInputStream(Files.readAllBytes(path)))) {
      ois.readInt();
      n = (long[]) ois.readObject();
    }
    return BitSet.valueOf(n);
  }

  static BigInteger loadEvenNumber(Path path) throws IOException, ClassNotFoundException {
    BigInteger base;
    try (var ois = new ObjectInputStream(new ByteArrayInputStream(Files.readAllBytes(path)))) {
      base = (BigInteger) ois.readObject();
    }
    return base;
  }

  static long[] loadSmallSieve() throws IOException, ClassNotFoundException {
    long[] smallSieve;
    try (var ois = new ObjectInputStream(
        new ByteArrayInputStream(Files.readAllBytes(Paths.get("8589934592bit-smallsieve.obj"))))) {
      smallSieve = (long[]) ois.readObject();
    }
    return smallSieve;
  }

  static long[] setABitForNonPrimeNumbers(long[] smallSieve, BigInteger base, int searchLen) {
    long[] bis = new long[unitIndex(searchLen - 1) + 1];
    long start = 0;
    long step = PrimeSearch.sieveSearch(smallSieve, smallSieve.length, start);
    long convertedStep = (step * 2) + 1;
    do {
      start = base.mod(BigInteger.valueOf(convertedStep)).intValue();

      start = convertedStep - start;
      if (start % 2 == 0) {
        start += convertedStep;
      }
      sieveSingle(bis, searchLen, (start - 1) / 2, convertedStep);

      step = sieveSearch(smallSieve, smallSieve.length, step + 1);
      convertedStep = (step * 2) + 1;
    } while (step > 0);
    return bis;
  }

  static long[] createSmallSieve(long length) {
    var sieve = new long[(unitIndex(length - 1) + 1)];
    sieve[0] = 1;
    long nextIndex = 1;
    long nextPrime = 3;

    do {
      PrimeSearch.sieveSingle(sieve, length, nextIndex + nextPrime, nextPrime);
      nextIndex = PrimeSearch.sieveSearch(sieve, length, nextIndex + 1);
      nextPrime = 2 * nextIndex + 1;
    } while ((nextIndex > 0) && (nextPrime < length));
    return sieve;
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

  static long sieveSearch(long[] bits, long limit, long start) {
    if (start >= limit) {
      return -1;
    }
    long index = start;
    do {
      if (!get(bits, index)) {
        return index;
      }
      index++;
    } while (index < limit - 1);
    return -1;
  }

  static void sieveSingle(long[] bits, long limit, long start, long step) {
    while (start < limit) {
      set(bits, start);
      start += step;
    }
  }

  static boolean get(long[] bits, long bitIndex) {
    return ((bits[unitIndex(bitIndex)] & bit(bitIndex)) != 0);
  }

  static void set(long[] bits, long bitIndex) {
    bits[unitIndex(bitIndex)] |= bit(bitIndex);
  }

  static int unitIndex(long bitIndex) {
    return (int) (bitIndex >>> 6);
  }

  static long bit(long bitIndex) {
    return 1L << (bitIndex & ((1 << 6) - 1));
  }

  static void outputObj(Path path, Serializable s) throws IOException {
    var baos = new ByteArrayOutputStream();
    try (var oos = new ObjectOutputStream(baos)) {
      oos.writeObject(s);
    }
    Files.write(path, baos.toByteArray(), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
  }

  public static BigInteger createEvenNumber(int bitLength, Random instanceStrong)
      throws NoSuchAlgorithmException {
    return new BigInteger(bitLength, instanceStrong).setBit(bitLength - 1).clearBit(0);
  }
}
