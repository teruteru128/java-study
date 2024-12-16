package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.mpz_fdiv_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.study.PrimeSearch.getResult;
import static com.github.teruteru128.study.PrimeSearch.loadSmallSieve;
import static com.github.teruteru128.study.PrimeSearch.previousClearBit;
import static com.github.teruteru128.study.PrimeSearch.unitIndex;
import static java.lang.Math.max;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
import static picocli.CommandLine.Parameters.NULL_VALUE;

import com.github.teruteru128.foreign.converters.PathConverter;
import com.github.teruteru128.foreign.prime.search.PrimeSearch;
import com.github.teruteru128.gmp.__mpz_struct;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.foreign.Arena;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "createLargeSieve")
public class CreateLargeSieveTask implements Callable<Void> {

  private static final Logger logger = LoggerFactory.getLogger(CreateLargeSieveTask.class);
  @Parameters(converter = PathConverter.class)
  Path inPath;
  @Parameters
  String outPath;
  @Option(names = "--small-sieve", defaultValue = "524288bit-small-sieve.obj")
  Path smallSievepath;
  @Option(names = "--oldSieve", defaultValue = NULL_VALUE)
  Path oldInPath;

  public CreateLargeSieveTask() {
  }

  public CreateLargeSieveTask(Path inPath, String outPath) {
    this.inPath = inPath;
    this.outPath = outPath;
  }

  public CreateLargeSieveTask(Path inPath, String outPath, Path oldInPath) {
    this.inPath = inPath;
    this.outPath = outPath;
    this.oldInPath = oldInPath;
  }

  public CreateLargeSieveTask(Path inPath, String outPath, Path smallSievepath, Path oldInPath) {
    this.inPath = inPath;
    this.outPath = outPath;
    this.smallSievepath = smallSievepath;
    this.oldInPath = oldInPath;
  }

  @Override
  public Void call()
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
    long sum = Arrays.stream(smallSieve).parallel().map(l -> ~l).map(Long::bitCount).sum();
    logger.info("original base: {} bits, imported base: {} bits", bitLength,
        mpz_sizeinbase(mpzBase, 2));
    var searchLen = bitLength * 5;
    logger.info("search Length: {} bits", searchLen);
    var l1 = (long) smallSieve.length * Long.SIZE;
    logger.info("small sieve: {} elements, {} bits, {} primes", smallSieve.length, l1, sum);
    var sieve = new Sieve(smallSieve);
    List<Future<Void>> list;
    var processors = Runtime.getRuntime().availableProcessors();
    var parallelism = max(1, processors - 1);
    var arraySize = unitIndex(searchLen - 1) + 1;
    var largeSieve = arena.allocate(JAVA_LONG, arraySize);
    if (oldInPath != null) {
      var s = PrimeSearch.loadLargeSieve(oldInPath);
      var sieve1 = s.sieve();
      var sieveArray = sieve1.toLongArray();
      var tmp = Arrays.stream(sieveArray).map(l -> ~l).map(Long::bitCount).sum();
      logger.trace("old cardinality: {}", tmp);
      //MemorySegment.copy(sieveArray, 0, largeSieve, JAVA_LONG, 0, sieveArray.length);
    }
    final Map<Long, Long> loggingPrimeSet;
    if (logger.isTraceEnabled()) {
      var tmpSet = new TreeMap<Long, Long>();
      tmpSet.put(2147483647L, 0L);
      int n = 16;
      // i * l1 * 2 / 16
      for (int i = 1; i < n; i++) {
        tmpSet.put((previousClearBit(smallSieve, l1 * i / n) << 1) + 1, (long) i);
      }
      loggingPrimeSet = Collections.unmodifiableMap(tmpSet);
    } else {
      loggingPrimeSet = null;
    }
    try (var pool = new ForkJoinPool(parallelism, ForkJoinPool.defaultForkJoinWorkerThreadFactory,
        null, true)) {
      var handle = JAVA_LONG.varHandle();
      logger.info("start");
      list = pool.invokeAll(Collections.nCopies(parallelism,
          () -> {
            long start;
            long step = sieve.nextStep();
            long convertedStep = step * 2L + 1;
            long start1;
            Long p;
            do {
              if (loggingPrimeSet != null && (p = loggingPrimeSet.get(convertedStep)) != null) {
                logger.trace("prime: {}, {}", p, convertedStep);
              }
              start = mpz_fdiv_ui(mpzBase, convertedStep);

              start = convertedStep - start;
              if ((start & 1) == 0) {
                start += convertedStep;
              }
              start1 = (start - 1) / 2;
              while (start1 < (long) searchLen) {
                handle.getAndBitwiseOr(largeSieve, start1 >>> 6, 1L << (start1 & 0x3f));
                start1 += convertedStep;
              }

              step = sieve.nextStep();
              convertedStep = step * 2L + 1;
            } while (step > 0);
            return null;
          }));
    }
    for (var f : list) {
      f.get();
    }
    var set = BitSet.valueOf(largeSieve.toArray(JAVA_LONG));
    var nextClearBit = set.nextClearBit(0);
    if (nextClearBit == searchLen || nextClearBit == -1) {
      logger.error("失敗！");
      return null;
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
    return null;
  }
}
