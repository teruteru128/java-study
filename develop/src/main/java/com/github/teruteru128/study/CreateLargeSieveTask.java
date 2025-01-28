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
import static java.lang.foreign.MemorySegment.copy;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru128.foreign.converters.PathConverter;
import com.github.teruteru128.foreign.prime.search.Result;
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
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlite.SQLiteDataSource;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "createLargeSieve")
public class CreateLargeSieveTask implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(CreateLargeSieveTask.class);
  @Parameters(converter = PathConverter.class)
  Path inPath;
  @Parameters
  String outPath;
  @Option(names = {"--small-sieve", "-S"}, defaultValue = "small-sieve-524288bit.obj")
  Path smallSievepath;

  public CreateLargeSieveTask() {
  }

  private static final VarHandle JAVA_LONG_VAR_HANDLE = JAVA_LONG.varHandle();

  @Override
  public Integer call()
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

    // (mpz_t, sieve) -> long[]
    List<Future<MemorySegment>> list;
    // parallelism = max(1, Runtime.getRuntime().availableProcessors() - 1);
    var parallelism = 12;
    // 出力long配列の要素数
    var outputLength = unitIndex(searchLen - 1) + 1;
    logger.info("array size: {}", outputLength);
    // タスク実行
    try (var pool = new ForkJoinPool(parallelism, ForkJoinPool.defaultForkJoinWorkerThreadFactory,
        null, true)) {
      final var service = new ExecutorCompletionService<Result>(pool);
      var tasks = new ArrayList<MemorySegmentCallable>();
      {
        var bits = loadSmallSieve(smallSievepath);
        long sum = Arrays.stream(bits).parallel().map(l -> ~l).map(Long::bitCount).sum();
        var inputSieveLength = bits.length;
        logger.info("small sieve: {} elements, {} primes", inputSieveLength, sum);
        for (int i = 0; i < parallelism; i++) {
          tasks.add(new MemorySegmentCallable(auto, mpzBase1, bits,
              (long) inputSieveLength * i / parallelism, inputSieveLength * (i + 1L) / parallelism,
              outputLength, searchLen));
        }
      }
      Runtime.getRuntime().gc();
      logger.info("start");
      list = pool.invokeAll(tasks);
    }
    logger.info("すべてのタスクが完了しました。集計します......");
    // 実行結果集計
    var largeSieve = auto.allocate(JAVA_LONG, outputLength);
    for (var f : list) {
      var tmp = f.get();
      for (int i = 0; i < outputLength; i++) {
        JAVA_LONG_VAR_HANDLE.getAndBitwiseOr(largeSieve, i << 3, tmp.getAtIndex(JAVA_LONG, i));
      }
    }
    logger.info("集計が終わりました");
    var set = BitSet.valueOf(largeSieve.toArray(JAVA_LONG));
    var nextClearBit = set.nextClearBit(0);
    if (nextClearBit == searchLen || nextClearBit == -1) {
      logger.error("失敗！");
      return ExitCode.SOFTWARE;
    }
    var notSet = new BitSet(set.length());
    notSet.set(0, set.length());
    notSet.andNot(set);
    logger.info("cardinality: {}", notSet.cardinality());
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
    return ExitCode.OK;
  }

  /**
   * @param auto 作業用メモリ領域を確保するために使用されるArena
   * @param mpzBase n
   * @param bits 既知素数リスト
   * @param sieveOffset このタスクで使用するふるいのオフセット
   * @param sieveLimit このタスクで使用するふるいのリミット
   * @param outputLength 出力サイズ(long配列要素数)
   * @param searchLen 出力サイズ(ビット単位)
   */
  public record MemorySegmentCallable(Arena auto, MemorySegment mpzBase, long[] bits,
                                       long sieveOffset, long sieveLimit, int outputLength,
                                       long searchLen) implements
      Callable<MemorySegment> {
    private static final Logger logger = LoggerFactory.getLogger(MemorySegmentCallable.class);

    @Override
    public MemorySegment call() {
      final var searchLen1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init_set_ui(searchLen1, (int) (searchLen >>> 32 & 0xffffffffL));
      mpz_mul_2exp(searchLen1, searchLen1, 32);
      mpz_add_ui(searchLen1, searchLen1, (int) (searchLen & 0xffffffffL));
      final var start = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init(start);
      var smallSieve = new Sieve(bits, sieveLimit * 64);
      var step = smallSieve.sieveSearch(sieveLimit, sieveOffset * 64);
      logger.info("first prime: {}", step * 2L + 1);
      final var convertedStep = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      // convertedStep = step * 2L + 1
      // なんで32bitずつ入れなあかんのじゃい
      mpz_init_set_ui(convertedStep, (int) (0xffffffffL & step >>> 32));
      mpz_mul_2exp(convertedStep, convertedStep, 32);
      mpz_add_ui(convertedStep, convertedStep, (int) (0xffffffffL & step));
      mpz_mul_2exp(convertedStep, convertedStep, 1);
      mpz_add_ui(convertedStep, convertedStep, 1);
      var largeSieve = auto.allocate(JAVA_LONG, outputLength);
      do {
        // start = mpzBase % convertedStep
        mpz_fdiv_r(start, mpzBase, convertedStep);

        // start = convertedStep - start
        mpz_sub(start, convertedStep, start);
        if (!mpz_odd_p(start)) {
          // start += convertedStep
          mpz_add(start, start, convertedStep);
        }
        // start = (start - 1) / 2
        mpz_sub_ui(start, start, 1);
        mpz_fdiv_q_2exp(start, start, 1);
        // start < searchLen1
        while (mpz_cmp(start, searchLen1) < 0) {
          var l = mpz_get_ui(start);
          JAVA_LONG_VAR_HANDLE.getAndBitwiseOr(largeSieve, (l >>> 6) * 8, 1L << (l & 0x3f));
          // start += convertedStep
          mpz_add(start, start, convertedStep);
        }

        // 次の素数をルックアップする
        step = smallSieve.sieveSearch(sieveLimit * 64, step + 1);
        // convertedStep = step * 2L + 1;
        // なんで32bitずつ入れなあかんのじゃい
        mpz_set_ui(convertedStep, (int) (0xffffffffL & step >>> 32));
        mpz_mul_2exp(convertedStep, convertedStep, 32);
        mpz_add_ui(convertedStep, convertedStep, (int) (0xffffffffL & step));
        mpz_mul_2exp(convertedStep, convertedStep, 1);
        mpz_add_ui(convertedStep, convertedStep, 1);
      } while (step > 0);
      logger.info("task done");
      return largeSieve;
    }
  }
}
