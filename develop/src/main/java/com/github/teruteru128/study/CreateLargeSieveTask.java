package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_cmp;
import static com.github.teruteru128.gmp.gmp_h.mpz_fdiv_q_2exp;
import static com.github.teruteru128.gmp.gmp_h.mpz_fdiv_r;
import static com.github.teruteru128.gmp.gmp_h.mpz_import;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init2;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_2exp;
import static com.github.teruteru128.gmp.gmp_h.mpz_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub_ui;
import static com.github.teruteru128.study.PrimeSearch.loadSmallSieve;
import static com.github.teruteru128.study.PrimeSearch.mpz_get_ui;
import static com.github.teruteru128.study.PrimeSearch.mpz_odd_p;
import static com.github.teruteru128.study.PrimeSearch.unitIndex;
import static java.lang.Math.max;
import static java.lang.foreign.MemorySegment.copy;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru128.foreign.converters.PathConverter;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.VarHandle;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlite.SQLiteDataSource;
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
  @Option(names = {"--small-sieve", "-S"}, defaultValue = "small-sieve-524288bit.obj")
  Path smallSievepath;

  public CreateLargeSieveTask() {
  }

  @Override
  public Void call()
      throws IOException, ClassNotFoundException, ExecutionException, InterruptedException, SQLException {
    // 小さなふるいを使って大きなふるいから合成数を除外
    // 大きな篩の長さ->1048576 / 20 * 64 = 3355444

    var auto = Arena.ofAuto();

    logger.debug("loading small sieve...");
    // 基地素数リスト読み込み
    logger.debug("small sieve has finished loading.");
    final var mpzBase1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    logger.trace("loading target even number...");
    var base = PrimeSearch.loadEvenNumber(inPath);
    logger.trace("target even number has finished loading from file.");
    int bitLength1 = base.bitLength();
    mpz_init2(mpzBase1, bitLength1);
    logger.trace("The memory area has been initialized.");
    var baseByteArray = base.toByteArray();
    final var baseCopied = auto.allocate(JAVA_BYTE, baseByteArray.length);
    copy(baseByteArray, 0, baseCopied, JAVA_BYTE, 0, baseByteArray.length);
    logger.trace("copied");
    mpz_import(mpzBase1, baseByteArray.length, 1, JAVA_BYTE.byteSize(), 0, 0, baseCopied);
    logger.trace("target even number has finished importing.");
    // 素数の数が多すぎてBitSet.cardinality()ではカウントしきれない
    logger.info("original base: {} bits, imported base: {} bits", bitLength1,
        mpz_sizeinbase(mpzBase1, 2));
    /*
      素数候補ふるいのサイズ
     */
    var searchLen = (long) (bitLength1 * 3.2);
    logger.info("search Length: {} bits", searchLen);
    final var searchLen1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(searchLen1, (int) (searchLen >>> 32 & 0xffffffffL));
    mpz_mul_2exp(searchLen1, searchLen1, 32);
    mpz_add_ui(searchLen1, searchLen1, (int) (searchLen & 0xffffffffL));
    // (mpz_t, sieve) -> long[]
    List<Future<MemorySegment>> list;
    // parallelism = max(1, Runtime.getRuntime().availableProcessors() - 1);
    var parallelism = 12;
    var largeSieveLength = unitIndex(searchLen - 1) + 1;
    logger.info("array size: {}", largeSieveLength);
    var handle = JAVA_LONG.varHandle();
    // タスク実行
    try (var pool = new ForkJoinPool(parallelism, ForkJoinPool.defaultForkJoinWorkerThreadFactory,
        null, true)) {
      var tasks = new ArrayList<MemorySegmentCallable>();
      {
        var bits = loadSmallSieve(smallSievepath);
        long sum = Arrays.stream(bits).parallel().map(l -> ~l).map(Long::bitCount).sum();
        logger.info("small sieve: {} elements, {} primes", bits.length, sum);
        var len = bits.length;
        for (int i = 0; i < parallelism; i++) {
          var bits1 = Arrays.copyOfRange(bits, (int) ((long) len * i / parallelism),
              (int) (len * (i + 1L) / parallelism));
          var smallSieve = new Sieve(bits1);
          tasks.add(new MemorySegmentCallable(auto, smallSieve, len * 64L / parallelism, largeSieveLength,
              (long) len * i / parallelism, mpzBase1, searchLen1, handle));
        }
      }
      Runtime.getRuntime().gc();
      logger.info("start");
      list = pool.invokeAll(tasks);
    }
    // 実行結果集計
    var largeSieve = auto.allocate(JAVA_LONG, largeSieveLength);
    for (var f : list) {
      var tmp = f.get();
      for (int i = 0; i < largeSieveLength; i++) {
        handle.getAndBitwiseOr(largeSieve, i << 3, tmp.getAtIndex(JAVA_LONG, i));
      }
    }
    var set = BitSet.valueOf(largeSieve.toArray(JAVA_LONG));
    var nextClearBit = set.nextClearBit(0);
    if (nextClearBit == searchLen || nextClearBit == -1) {
      logger.error("失敗！");
      return null;
    }
    var bis = set.toLongArray();
    var path = Path.of(outPath.formatted(searchLen));
    logger.info("write to {}", path);
    try (var oos = new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
      oos.writeLong(searchLen);
      oos.writeObject(bis);
    }
    var dataSource = new SQLiteDataSource();
    dataSource.setUrl(Objects.requireNonNull(System.getenv("DB_URL")));
    try (var connection = dataSource.getConnection()) {
      var notSet = new BitSet(set.length());
      notSet.set(0, set.length());
      notSet.andNot(set);
      logger.info("cardinality: {}", notSet.cardinality());
      connection.setAutoCommit(false);
      try (var prep = connection.prepareStatement(
          "INSERT INTO candidates(ID, step, composite, probably_prime, definitely_prime) values(?, ?, ?, ?, ?);")) {
        prep.setLong(1, 3669437087868473100L);
        prep.setInt(3, 0);
        prep.setInt(4, 0);
        prep.setInt(5, 0);
        notSet.stream().forEach(st -> {
          try {
            prep.setInt(2, st);
            prep.addBatch();
          } catch (SQLException e) {
            throw new RuntimeException(e);
          }
        });
        prep.executeBatch();
      }
      connection.commit();
    }
    logger.info("終わり！");
    return null;
  }

  private record MemorySegmentCallable(Arena auto, Sieve smallSieve, long sieveLimit, int largeSieveLength,
                                       long stepOffset, MemorySegment mpzBase,
                                       MemorySegment searchLen1, VarHandle handle) implements
      Callable<MemorySegment> {

    @Override
    public MemorySegment call() {
      final var start = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init(start);
      var step = smallSieve.sieveSearch(sieveLimit, 0);
      var tmpStep = step + stepOffset * 64;
      final var convertedStep = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      // convertedStep = step * 2L + 1
      // なんで32bitずつ入れなあかんのじゃい
      mpz_init_set_ui(convertedStep, (int) (0xffffffffL & tmpStep >>> 32));
      mpz_mul_2exp(convertedStep, convertedStep, 32);
      mpz_add_ui(convertedStep, convertedStep, (int) (0xffffffffL & tmpStep));
      mpz_mul_2exp(convertedStep, convertedStep, 1);
      mpz_add_ui(convertedStep, convertedStep, 1);
      final var start1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init(start1);
      var largeSieve = auto.allocate(JAVA_LONG, largeSieveLength);
      do {
        // start = mpzBase % convertedStep
        mpz_fdiv_r(start, mpzBase, convertedStep);

        // start = convertedStep - start
        mpz_sub(start, convertedStep, start);
        if (!mpz_odd_p(start)) {
          // start += convertedStep
          mpz_add(start, start, convertedStep);
        }
        // start1 = (start - 1) / 2
        mpz_sub_ui(start1, start, 1);
        mpz_fdiv_q_2exp(start1, start1, 1);
        // start < searchLen1
        while (mpz_cmp(start1, searchLen1) < 0) {
          var l = mpz_get_ui(start1);
          handle.getAndBitwiseOr(largeSieve, (l >>> 6) * 8, 1L << (l & 0x3f));
          // start1 += convertedStep
          mpz_add(start1, start1, convertedStep);
        }

        // 次の素数をルックアップする
        step = smallSieve.sieveSearch(sieveLimit, step + 1);
        tmpStep = step + stepOffset * 64;
        // convertedStep = step * 2L + 1;
        // なんで32bitずつ入れなあかんのじゃい
        mpz_set_ui(convertedStep, (int) (0xffffffffL & tmpStep >>> 32));
        mpz_mul_2exp(convertedStep, convertedStep, 32);
        mpz_add_ui(convertedStep, convertedStep, (int) (0xffffffffL & tmpStep));
        mpz_mul_2exp(convertedStep, convertedStep, 1);
        mpz_add_ui(convertedStep, convertedStep, 1);
      } while (step > 0);
      return largeSieve;
    }
  }
}
