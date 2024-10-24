package com.github.teruteru128.study;

import static com.github.teruteru.gmp.gmp_h.mpz_fdiv_ui;
import static com.github.teruteru.gmp.gmp_h.mpz_import;
import static com.github.teruteru.gmp.gmp_h.mpz_init2;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru.gmp.gmp_h;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeSearch {

  private static final Logger logger = LoggerFactory.getLogger(PrimeSearch.class);

  public static void getConvertedStep() throws IOException, ClassNotFoundException {
    getConvertedStep(0);
  }

  public static void getConvertedStep(int firstStep) throws IOException, ClassNotFoundException {
    var base = loadEvenNumber(
        Paths.get("even-number-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd.obj"));
    var largeSieve = loadLargeSieve(
        Paths.get("large-sieve-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd-3355392bit-6.obj"));
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

  public static void createLargeSieve(Path inPath, String outPath)
      throws IOException, ClassNotFoundException, ExecutionException, InterruptedException {
    // 小さなふるいを使って大きなふるいから合成数を除外
    // 大きな篩の長さ->1048576 / 20 * 64 = 3355444

    var smallSieve = loadSmallSieve();
    var base = loadEvenNumber(inPath);
    var arena = Arena.ofAuto();
    var mpzBase = arena.allocate(__mpz_struct.layout());
    var bitLength = base.bitLength();
    var baseByteArray = base.toByteArray();
    var baseCopied = arena.allocate(JAVA_BYTE, baseByteArray.length);
    MemorySegment.copy(baseByteArray, 1, baseCopied, JAVA_BYTE, 0, baseByteArray.length - 1);
    mpz_init2(mpzBase, bitLength);
    mpz_import(mpzBase, baseByteArray.length, 1, 1, 1, 0, baseCopied);
    long sum = Arrays.stream(smallSieve).parallel().map(l -> Long.bitCount(~l)).sum();
    logger.debug("base: {} bits, {}", bitLength, gmp_h.mpz_sizeinbase(mpzBase, 2));
    var searchLen = (int) (bitLength * 5L);
    logger.debug("search Length: {} bits", searchLen);
    logger.debug("small sieve: {} elements, {} bits, {} primes", smallSieve.length,
        (long) smallSieve.length * Long.SIZE, sum);
    var sieve = new Sieve(smallSieve);
    List<Future<long[]>> list;
    var parallelism = Runtime.getRuntime().availableProcessors() / 2;
    var largeSieve = arena.allocate(JAVA_LONG, (unitIndex(searchLen - 1) + 1));
    try (var pool = new ForkJoinPool(parallelism, ForkJoinPool.defaultForkJoinWorkerThreadFactory,
        null, true)) {
      var handle = JAVA_LONG.arrayElementVarHandle();
      list = pool.invokeAll(Collections.nCopies(parallelism,
          () -> setBitsForNonPrimeNumbers(largeSieve, searchLen, mpzBase, sieve, handle)));
    }
    list.getFirst().get();
    var set = BitSet.valueOf(largeSieve.toArray(JAVA_LONG));
    var nextClearBit = set.nextClearBit(0);
    if (nextClearBit == searchLen || nextClearBit == -1) {
      logger.error("失敗！");
      return;
    }
    var bis = set.toLongArray();
    var setB = new BitSet(set.length());
    setB.set(0, set.length());
    setB.andNot(set);
    logger.info("cardinality: {}", setB.cardinality());
    try (var oos = new ObjectOutputStream(
        new BufferedOutputStream(Files.newOutputStream(Path.of(outPath.formatted(searchLen)))))) {
      oos.writeInt(searchLen);
      oos.writeObject(bis);
    }
    logger.info("終わり！");
  }

  public static void getSieve(long bitLength, String outputPath) throws IOException {
    // 小さな既知素数ふるいを作成、もしくは読み込む
    var sieve = createSmallSieve(bitLength);
    Path path = Paths.get(outputPath);
    var bas = new ByteArrayOutputStream();
    try (var oos = new ObjectOutputStream(bas)) {
      oos.writeLong(bitLength);
      oos.writeObject(sieve);
    }
    Files.write(path, bas.toByteArray(), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
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

  static LargeSieve loadLargeSieve(Path path) throws IOException, ClassNotFoundException {
    int searchLength;
    long[] n;
    try (var ois = new ObjectInputStream(new ByteArrayInputStream(Files.readAllBytes(path)))) {
      searchLength = ois.readInt();
      n = (long[]) ois.readObject();
    }
    return new LargeSieve(searchLength, BitSet.valueOf(n));
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

  /**
   * @param ms        large Sieve
   * @param searchLen size of large sieve (bits)
   * @param mpzBase   base
   * @param sieve     small sieve
   * @param handle    var handle of large sieve elements
   * @return large sieve long array
   */
  static long[] setBitsForNonPrimeNumbers(MemorySegment ms, int searchLen, MemorySegment mpzBase,
      Sieve sieve, VarHandle handle) {
    long start;
    long step = sieve.nextStep();
    long convertedStep = step * 2 + 1;
    long start1;
    do {
      start = mpz_fdiv_ui(mpzBase, convertedStep);

      start = convertedStep - start;
      if ((start & 1) == 0) {
        start += convertedStep;
      }
      start1 = (start - 1) / 2;
      while (start1 < (long) searchLen) {
        handle.getAndBitwiseOr(ms, 0, unitIndex(start1), bit(start1));
        start1 += convertedStep;
      }

      step = sieve.nextStep();
      convertedStep = step * 2 + 1;
    } while (step > 0);
    return ms.toArray(JAVA_LONG);
  }

  static long[] createSmallSieve(long length) {
    var sieve = new long[(unitIndex(length - 1) + 1)];
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
   * @see java.util.BitSet#nextClearBit(int)
   * @param bits
   * @param limit bitsのリミット。bit単位
   * @param start
   * @return
   */
  static long sieveSearch(long[] bits, long limit, long start) {
    if (start >= limit) {
      return -2;
    }
    int u = unitIndex(start);
    long wordLimit = unitIndex(limit - 1) + 1;
    long word = ~bits[u] & (0xffffffffffffffffL << start);
    while (true) {
      if (word != 0) {
        return (long) u * 64 + Long.numberOfTrailingZeros(word);
      }
      if (++u == wordLimit) {
        return -2;
      }
      word = ~bits[u];
    }
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
    return 1L << (bitIndex & 0x3f);
  }

  static void outputObj(Path path, Serializable s) throws IOException {
    var baos = new ByteArrayOutputStream();
    try (var oos = new ObjectOutputStream(baos)) {
      oos.writeObject(s);
    }
    Files.write(path, baos.toByteArray(), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
  }

  record LargeSieve(int searchLength, BitSet sieve) {

  }
}
