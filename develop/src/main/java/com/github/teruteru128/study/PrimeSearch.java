package com.github.teruteru128.study;

import static com.github.teruteru.gmp.gmp_h.mpz_fdiv_ui;
import static com.github.teruteru.gmp.gmp_h.mpz_import;
import static com.github.teruteru.gmp.gmp_h.mpz_init2;
import static com.github.teruteru.gmp.gmp_h.mpz_sizeinbase;
import static java.lang.foreign.MemorySegment.copy;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru.gmp.gmp_h;
import com.github.teruteru128.foreign.GMP;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
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
import java.util.Map;
import java.util.TreeMap;
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
    var largeSieve = GMP.loadLargeSieve(
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

  private static long mpz_get_ui(MemorySegment z) {
    var p = __mpz_struct._mp_d(z);
    var n = __mpz_struct._mp_size(z);
    var l = p.getAtIndex(JAVA_LONG, 0);
    return n != 0 ? l : 0;
  }

  public static void createLargeSieve(Path inPath, String outPath, Path smallSievepath,
      Path oldInPath)
      throws IOException, ClassNotFoundException, ExecutionException, InterruptedException {
    // 小さなふるいを使って大きなふるいから合成数を除外
    // 大きな篩の長さ->1048576 / 20 * 64 = 3355444

    logger.debug("loading small sieve...");
    var smallSieve = loadSmallSieve(smallSievepath);
    logger.debug("small sieve has finished loading.");
    var arena = Arena.ofAuto();
    var layout = __mpz_struct.layout();
    var result = getResult(inPath, arena, layout);
    var mpzBase = result.mpzBase();
    var bitLength = result.bitLength();
    // 素数の数が多すぎてBitSet.cardinality()ではカウントしきれない
    long sum = Arrays.stream(smallSieve).parallel().map(l -> Long.bitCount(~l)).sum();
    logger.info("original base: {} bits, imported base: {} bits", bitLength,
        mpz_sizeinbase(mpzBase, 2));
    var searchLen = bitLength * 5;
    logger.info("search Length: {} bits", searchLen);
    var l1 = (long) smallSieve.length * Long.SIZE;
    logger.info("small sieve: {} elements, {} bits, {} primes", smallSieve.length, l1, sum);
    var sieve = new Sieve(smallSieve);
    List<Future<Void>> list;
    var processors = Runtime.getRuntime().availableProcessors();
    var parallelism = processors >> 1;
    var largeSieve = arena.allocate(JAVA_LONG, (unitIndex(searchLen - 1) + 1));
    if (oldInPath != null) {
      var s = GMP.loadLargeSieve(oldInPath);
      var sieve1 = s.sieve();
      var sieveArray = sieve1.toLongArray();
      var tmp = Arrays.stream(sieveArray).map(l -> Long.bitCount(~l)).sum();
      logger.trace("old cardinality: {}", tmp);
      //MemorySegment.copy(sieveArray, 0, largeSieve, JAVA_LONG, 0, sieveArray.length);
    }
    final Map<Long, Long> pSet;
    if (logger.isInfoEnabled()) {
      var tmpSet = new TreeMap<Long, Long>();
      tmpSet.put(2147483647L, 0L);
      int n = 16;
      // i * l1 * 2 / 16
      for (int i = 1; i < n; i++) {
        tmpSet.put((previousClearBit(smallSieve, l1 * i / n) << 1) + 1, (long) i);
      }
      pSet = Collections.unmodifiableMap(tmpSet);
    } else {
      pSet = null;
    }
    try (var pool = new ForkJoinPool(parallelism, ForkJoinPool.defaultForkJoinWorkerThreadFactory,
        null, true)) {
      var handle = JAVA_LONG.arrayElementVarHandle();
      logger.info("start");
      list = pool.invokeAll(Collections.nCopies(parallelism,
          () -> setBitsForNonPrimeNumbers(largeSieve, searchLen, mpzBase, sieve, handle, pSet)));
    }
    for (var f : list) {
      f.get();
    }
    var set = BitSet.valueOf(largeSieve.toArray(JAVA_LONG));
    var nextClearBit = set.nextClearBit(0);
    if (nextClearBit == searchLen || nextClearBit == -1) {
      logger.error("失敗！");
      return;
    }
    var bis = set.toLongArray();
    {
      var setB = new BitSet(set.length());
      setB.set(0, set.length());
      setB.andNot(set);
      logger.info("cardinality: {}", setB.cardinality());
    }
    var path = Path.of(outPath.formatted(searchLen));
    logger.info("write to {}", path);
    try (var oos = new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
      oos.writeInt(searchLen);
      oos.writeObject(bis);
    }
    logger.info("終わり！");
  }

  private static Result getResult(Path inPath, Arena arena, GroupLayout layout)
      throws IOException, ClassNotFoundException {
    var mpzBase = arena.allocate(layout).reinterpret(arena, gmp_h::mpz_clear);
    int bitLength;
    logger.trace("loading target even number...");
    var base = loadEvenNumber(inPath);
    logger.trace("target even number has finished loading from file.");
    bitLength = base.bitLength();
    mpz_init2(mpzBase, bitLength);
    logger.trace("The memory area has been initialized.");
    var baseByteArray = base.toByteArray();
    var baseCopied = arena.allocate(JAVA_BYTE, baseByteArray.length);
    copy(baseByteArray, 0, baseCopied, JAVA_BYTE, 0, baseByteArray.length);
    logger.trace("copied");
    mpz_import(mpzBase, baseByteArray.length, 1, JAVA_BYTE.byteSize(), 0, 0, baseCopied);
    logger.trace("target even number has finished importing.");
    return new Result(mpzBase, bitLength);
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
        new BufferedInputStream(Files.newInputStream(path), 2147483645))) {
      var length = ois.readLong();
      var i1 = unitIndex(length - 1) + 1;
      if (i1 == 2147483645) {
        smallSieve = new long[i1];
        for (int i = 0; i < i1; i++) {
          smallSieve[i] = ois.readLong();
        }
      } else {
        smallSieve = (long[]) ois.readObject();
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

  /**
   * @param ms               large Sieve
   * @param searchLen        size of large sieve (bits)
   * @param mpzBase          base
   * @param sieve            small sieve
   * @param handle           var handle of large sieve elements
   * @param loggingPrimesSet ロギングする素数のセット
   * @return large sieve long array
   */
  static Void setBitsForNonPrimeNumbers(final MemorySegment ms, final long searchLen,
      final MemorySegment mpzBase, final Sieve sieve, VarHandle handle,
      Map<Long, Long> loggingPrimesSet) {
    long start;
    long step = sieve.nextStep();
    long convertedStep = step * 2L + 1;
    long start1;
    do {
      if (loggingPrimesSet != null && loggingPrimesSet.containsKey(convertedStep)) {
        logger.info("prime: {}, {}", loggingPrimesSet.get(convertedStep), convertedStep);
      }
      start = mpz_fdiv_ui(mpzBase, convertedStep);

      start = convertedStep - start;
      if ((start & 1) == 0) {
        start += convertedStep;
      }
      start1 = (start - 1) / 2;
      while (start1 < searchLen) {
        handle.getAndBitwiseOr(ms, 0, start1 >>> 6, 1L << (start1 & 0x3f));
        start1 += convertedStep;
      }

      step = sieve.nextStep();
      convertedStep = step * 2L + 1;
    } while (step > 0);
    return null;
  }

  // FIXME Cで書かないと遅すぎてダメかもしれねえ
  static long[] createSmallSieve(long length) {
    var sieve = new long[unitIndex(length - 1) + 1];
    logger.info("sieve.length = {}", sieve.length);
    sieve[0] = 1;
    long nextIndex = 1;
    long nextPrime = 3;
    long p = Long.highestOneBit(nextPrime);

    do {
      if ((nextPrime & p) != 0) {
        logger.info("prime: {}", nextPrime);
        p <<= 1;
      }
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
   * @param bits bits
   * @param limit bitsのリミット。bit単位
   * @param start start
   * @return next step
   */
  static long sieveSearch(long[] bits, long limit, long start) {
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

  private static int unitIndex(long bitIndex) {
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

  private static long previousClearBit(long[] words, long fromIndex) {
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

  private static long nextClearBit(long[] words, long fromIndex) {
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

  private record Result(MemorySegment mpzBase, int bitLength) {

  }

}
