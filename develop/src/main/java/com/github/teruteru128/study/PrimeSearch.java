package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.mpz_import;
import static com.github.teruteru128.gmp.gmp_h.mpz_init2;
import static java.lang.foreign.MemorySegment.copy;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.foreign.converters.PathConverter;
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
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

/**
 * TODO create prime (or math?) package
 */
@Command(name = "attack")
public class PrimeSearch implements Callable<Void> {

  @Parameters(converter = PathConverter.class)
  private Path base;
  @Parameters(converter = PathConverter.class)
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

  @Command(name = "createSmallSieve", description = "既知素数リストを作成する")
  private static void createSmallSieve(
      @Parameters(description = "素数リストのビット長。(0x7ffffffdL << 6)ビットまで。") long bitLength)
      throws IOException {
    logger.info("create {}bit small sieve...", bitLength);
    // 小さな既知素数ふるいを作成、もしくは読み込む
    var sieve = createSmallSieve0(bitLength);
    var primeCount = Arrays.stream(sieve).parallel().map(l -> Long.bitCount(~l)).sum();
    logger.info("{} primes", primeCount);
    var path = Paths.get(bitLength + "bit-small-sieve.obj");
    logger.info("write to {}", path);
    try (var oos = new ObjectOutputStream(new BufferedOutputStream(
        Files.newOutputStream(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE),
        2147483645))) {
      oos.writeLong(bitLength);
      var length = sieve.length;
      if (length == 2147483645) {
        for (long l : sieve) {
          oos.writeLong(l);
        }
      } else {
        oos.writeObject(sieve);
      }
      logger.info("done. 1");
    }
    logger.info("done. 2");
  }

  @Override
  public Void call() throws Exception {
    return null;
  }

  private static final Logger logger = LoggerFactory.getLogger(PrimeSearch.class);

  public static void getConvertedStep() throws IOException, ClassNotFoundException {
    getConvertedStep(0);
  }

  public static void getConvertedStep(int firstStep) throws IOException, ClassNotFoundException {
    var base = loadEvenNumber(
        Paths.get("even-number-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd.obj"));
    var largeSieve = com.github.teruteru128.foreign.prime.search.PrimeSearch.loadLargeSieve(
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

  static long mpz_get_ui(MemorySegment z) {
    var p = __mpz_struct._mp_d(z);
    var n = __mpz_struct._mp_size(z);
    var l = p.getAtIndex(JAVA_LONG, 0);
    return n != 0 ? l : 0;
  }

  private static boolean mpz_fits_utype_p(MemorySegment z, long maxVal) {
    var n = __mpz_struct._mp_size(z);
    var p = __mpz_struct._mp_d(z);
    return (n == 0 || (n == 1 && Long.compareUnsigned(p.getAtIndex(JAVA_LONG, 0), maxVal) <= 0));
  }

  static boolean mpz_fits_ulong_p(MemorySegment z) {
    return mpz_fits_utype_p(z, -1L);
  }

  static boolean mpz_fits_uint_p(MemorySegment z) {
    return mpz_fits_utype_p(z, 0xffffffffL);
  }

  public static void createLargeSieve(Path inPath, String outPath, Path smallSievepath,
      Path oldInPath)
      throws IOException, ClassNotFoundException, ExecutionException, InterruptedException {
  }

  static Result getResult(Path inPath, Arena arena, GroupLayout layout)
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

  // FIXME Cで書かないと遅すぎてダメかもしれねえ
  static long[] createSmallSieve0(long length) {
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
   * @see java.math.BitSieve#sieveSearch(int,int)
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

  record Result(MemorySegment mpzBase, int bitLength) {

  }

}
