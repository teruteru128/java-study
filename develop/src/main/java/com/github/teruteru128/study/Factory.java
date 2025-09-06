package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_cmp;
import static com.github.teruteru128.gmp.gmp_h.mpz_divisible_p;
import static com.github.teruteru128.gmp.gmp_h.mpz_fdiv_q_2exp;
import static com.github.teruteru128.gmp.gmp_h.mpz_fdiv_r;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mod;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_2exp;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_prevprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_probab_prime_p;
import static com.github.teruteru128.gmp.gmp_h.mpz_set;
import static com.github.teruteru128.gmp.gmp_h.mpz_setbit;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;
import static com.github.teruteru128.mpfr.mpfr_h.MPFR_RNDZ;
import static com.github.teruteru128.mpfr.mpfr_h.mpfr_get_d;
import static com.github.teruteru128.mpfr.mpfr_h.mpfr_get_prec;
import static com.github.teruteru128.mpfr.mpfr_h.mpfr_init2;
import static com.github.teruteru128.mpfr.mpfr_h.mpfr_log;
import static com.github.teruteru128.mpfr.mpfr_h.mpfr_set_z;
import static com.github.teruteru128.study.FactorDatabase.FDB_USER_COOKIE;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_even_p;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_get_u64;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_odd_p;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;
import static java.math.BigInteger.TWO;
import static java.math.BigInteger.valueOf;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.gmp.__gmp_randstate_struct;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.mpfr.__mpfr_struct;
import com.github.teruteru128.mpfr.mpfr_h;
import com.github.teruteru128.ncv.xml.ListUp;
import com.github.teruteru128.ncv.xml.Transform;
import com.github.teruteru128.semen.CumShoot;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.math.BigInteger;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.SecureRandom;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.LongSummaryStatistics;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.DoubleConsumer;
import java.util.random.RandomGenerator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.rng.simple.RandomSource;
import org.apache.commons.statistics.descriptive.DoubleStatistics;
import org.apache.commons.statistics.descriptive.Statistic;
import org.apache.commons.statistics.distribution.LogNormalDistribution;
import org.apache.commons.statistics.distribution.NormalDistribution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.HelpCommand;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

// FIXME サブコマンドをここに並べるのではなく、サービスローダーを使ってサービスとして読み込ませられないか？
@Command(subcommands = {AddressCalc4.class, AddressCalc5.class, CreateLargeSieveTask.class,
    ECIESSample.class, FileChecker.class, PrimeSearch.class, SiteChecker.class, Spam.class,
    TeamSpeak.class, Updater.class, HelpCommand.class, ListUp.class, Transform.class,
    CumShoot.class, SlimeSearch.class, Spam3.class, OwnerCheck.class, CalcBustSize.class,
    Deterministic.class, CreateCandidateDB.class, SmallSievePrimeCounter.class,
    NewColorGenerator.class, Multi2.class, Project5190.class, Project19.class, Project19F.class,
    Project19Sort.class, Project19Unique.class, Spammer.class, Spam2.class,
    FactorDistribution.class, Project19G.class, InsertPrimeNumberVerifyTask.class,
    WindowsPathChecker.class}, mixinStandardHelpOptions = true)
public class Factory implements Callable<Integer> {

  public static final int ARRAY_ELEMENTS_MAX = 2147483645;
  public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
  public static final String ENDPOINT = "https://factordb.com/api?query=";
  public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
  public static final long MASK = (1L << Double.PRECISION) - 1L;
  private static final Logger logger = LoggerFactory.getLogger(Factory.class);
  private static final int EXIT_CODE_OK = ExitCode.OK;
  private static final int EXIT_CODE_SOFTWARE = ExitCode.SOFTWARE;
  private static final String ERROR_INVALID_FILE = "Error: File path is invalid or not a regular file";
  private static final String ERROR_TOO_MANY_ELEMENTS = "Error: Requested elements exceed file size: ";
  private static final String ERROR_BUFFER_TOO_LARGE = "Error: Requested elements (%d) cause buffer size overflow";
  private static final String ERROR_INCOMPLETE_READ = "Error: Failed to read requested bytes from file";

  private Factory() {
  }

  /**
   * Callableをnewして返すファクトリにするはずだったんだけどなあ……
   *
   */
  public static Callable<Integer> createInstance() {
    return new Factory();
  }

  @Command
  private int formatPenis(Path in) throws IOException {
    var size = Files.size(in);
    try (var file = new RandomAccessFile(in.toFile(), "r")) {

      for (long pos = size - 128; pos < size; pos += 8) {
        file.seek(pos);
        var v = file.readDouble();
        System.out.println(v);
      }
    }
    return ExitCode.OK;
  }

  @Command
  private int nextPrime(@Parameters(defaultValue = "3") BigInteger p,
      @Option(names = {"--num", "-n"}) final long n) {
    var in = new BigInteger(
        "4611756240828382812967274292517917001228992958125270097501539654664641060941176759286491947774023598030841271304984728055643767273150281284335312095375995180280200100287356406872860659980855307781201702790844711356164335297909731718740655702069241270868563302401068564405285349595141398612149976246394",
        10);
    var one = BigInteger.ONE;
    long count = 0;
    while (true) {
      var tmp = in.multiply(p);
      var sub = tmp.subtract(one);
      var probablePrime = sub.isProbablePrime(1);
      if (probablePrime) {
        System.out.println("n * " + p + " - 1 is prime");
        count++;
      }
      var add = tmp.add(one);
      var probablePrime1 = add.isProbablePrime(1);
      if (probablePrime1) {
        System.out.println("n * " + p + " + 1 is prime");
        count++;
      }
      if (count >= n) {
        break;
      }
      p = p.nextProbablePrime();
    }
    return ExitCode.OK;
  }

  @Command
  private int generatePenis(@Parameters(arity = "1") Path dir,
      @Option(names = {"--prefix", "-p"}, defaultValue = "out") String prefix,
      @Option(names = {"--exp-mu", "-m"}, defaultValue = "20") double expMu,
      @Option(names = {"--sigma", "-s"}, defaultValue = "1") double sigma) throws IOException {
    if (!Files.isDirectory(dir)) {
      logger.error("dir must be directory!");
      return ExitCode.SOFTWARE;
    }
    var distribution = LogNormalDistribution.of(Math.log(expMu), sigma);
    var sampler = distribution.createSampler(
        new JDKRandomWrapper((SecureRandom) SECURE_RANDOM_GENERATOR));
    logger.info("generate...");
    var array = sampler.samples(2000000000).parallel().toArray();
    logger.info("generated");
    var builder = DoubleStatistics.builder(Statistic.MAX, Statistic.MIN, Statistic.MEAN,
        Statistic.STANDARD_DEVIATION);
    var outTxtPath = dir.resolve(Path.of(prefix + ".txt"));
    logger.info("text output...");
    try (var writer3 = new PrintWriter(
        new BufferedWriter(new FileWriter(outTxtPath.toFile()), 0x7fffffff - 2), false)) {
      for (var v : array) {
        writer3.println(v);
      }
      writer3.flush();
    }
    logger.info("text output done");
    var outBinPath = dir.resolve(Path.of(prefix + ".bin"));
    logger.info("bin output...");
    try (var stream = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(outBinPath.toFile()), 0x7fffffff - 2))) {
      for (var v : array) {
        stream.writeDouble(v);
      }
    }
    logger.info("bin output done");
    logger.info("sort");
    Arrays.parallelSort(array);
    logger.info("sort done");
    var outSortedBinPath = dir.resolve(Path.of(prefix + "-sorted.bin"));
    logger.info("sorted bin output");
    try (var stream = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(outSortedBinPath.toFile()),
            0x7fffffff - 2))) {
      for (var v : array) {
        stream.writeDouble(v);
      }
    }
    logger.info("sorted bin output done");
    logger.info("statistics generate");
    var statistics = Arrays.stream(array).parallel()
        .collect(builder::build, DoubleConsumer::accept, DoubleStatistics::combine);
    var median = (array[999999999] + array[1000000000]) / 2;
    var max = statistics.getAsDouble(Statistic.MAX);
    var min = statistics.getAsDouble(Statistic.MIN);
    var mean = statistics.getAsDouble(Statistic.MEAN);
    var standardDeviation = statistics.getAsDouble(Statistic.STANDARD_DEVIATION);
    logger.info("statistics generated");
    var outConfigPath = dir.resolve(Path.of(prefix + "-config.txt"));
    logger.info("config output");
    try (var writer = new PrintWriter(
        Files.newBufferedWriter(outConfigPath, StandardOpenOption.CREATE,
            StandardOpenOption.WRITE))) {
      var line1 = String.format("μ=log(%s), σ=%s", expMu, sigma);
      var line2 = String.format("min=%s, max=%s, mean=%s, median=%s, standard deviation=%s", min,
          max, mean, median, standardDeviation);
      System.out.println(line1);
      System.out.println(line2);
      writer.println(line1);
      writer.println(line2);
    }
    logger.info("config output done");
    return ExitCode.OK;
  }

  @Command(name = "headDouble")
  public int headDouble(Path filePath, @Option(names = {"-n",
          "--elements"}, defaultValue = "20", description = "Number of double elements to read") long elements,
      @Option(names = {"-o", "--offset"}) long offset) throws IOException {
    return readDoubles(filePath, elements, offset, ReadMode.HEAD);
  }

  @Command(name = "tailDouble")
  public int tailDouble(Path filePath, @Option(names = {"-n",
          "--elements"}, defaultValue = "20", description = "Number of double elements to read") long elements,
      @Option(names = {"-o", "--offset"}) long offset) throws IOException {
    return readDoubles(filePath, elements, offset, ReadMode.TAIL);
  }

  @Command(name = "Format-Double")
  public int formatDouble(Path path, @Option(names = "--count") long count,
      @Option(names = "offset") long offset) {
    return ExitCode.OK;
  }

  private int readDoubles(Path filePath, long elements, long offset, ReadMode mode)
      throws IOException {
    // ファイルの検証
    if (!isValidFile(filePath)) {
      System.err.println(ERROR_INVALID_FILE);
      return EXIT_CODE_SOFTWARE;
    }

    // ファイルサイズの検証
    long fileSize = Files.size(filePath);
    long requiredBytes;
    try {
      requiredBytes = Math.multiplyExact(elements, Double.BYTES); // オーバーフロー検出
    } catch (ArithmeticException e) {
      System.err.printf(ERROR_BUFFER_TOO_LARGE, elements);
      System.err.println();
      return EXIT_CODE_SOFTWARE;
    }
    if (fileSize < requiredBytes + offset) {
      System.err.println(ERROR_TOO_MANY_ELEMENTS + fileSize);
      return EXIT_CODE_SOFTWARE;
    }

    // ファイルの読み込み
    try (var channel = (FileChannel) Files.newByteChannel(filePath,
        StandardOpenOption.READ); var arena = Arena.ofConfined()) {
      // 読み込み位置の設定
      if (mode == ReadMode.TAIL) {
        channel.position(fileSize - (requiredBytes + offset));
      } else if (mode == ReadMode.HEAD) {
        channel.position(offset);
      }

      // MemorySegment の割り当て
      var segment = arena.allocate(requiredBytes);
      // FileChannel から MemorySegment に直接読み込み
      if (channel.read(segment.asByteBuffer()) != requiredBytes) {
        System.err.println(ERROR_INCOMPLETE_READ);
        return EXIT_CODE_SOFTWARE;
      }

      // 結果の出力
      var layout = ValueLayout.JAVA_DOUBLE.withOrder(ByteOrder.BIG_ENDIAN);
      for (long i = 0; i < elements; i++) {
        var value = segment.get(layout, i * Double.BYTES);
        System.out.println(value);
      }
    }

    return EXIT_CODE_OK;
  }

  private boolean isValidFile(Path filePath) {
    return Files.exists(filePath) && Files.isRegularFile(filePath);
  }

  @Command
  private int sample(@Option(names = {"-n"}, defaultValue = "100") int n) {
    double expMu = 20;
    double sigma = 1.25;
    var distribution = LogNormalDistribution.of(Math.log(expMu), sigma);
    var sampler = distribution.createSampler(
        new JDKRandomWrapper((SecureRandom) SECURE_RANDOM_GENERATOR));
    IntStream.range(0, n).mapToDouble(_ -> sampler.sample()).sorted()
        .forEachOrdered(System.out::println);
    return ExitCode.OK;
  }

  @Command
  private int searchPrime() {
    var base = valueOf(107).pow(1000).multiply(TWO);
    var co = valueOf(10).pow(18);
    long count = 0;
    long num = 2;
    while (true) {
      var n = base.multiply(co);
      var nAdd1 = n.add(BigInteger.ONE);
      if (nAdd1.isProbablePrime(1)) {
        System.out.println("n * " + co + " + 1");
        count++;
      }
      var nSub1 = n.subtract(BigInteger.ONE);
      if (nSub1.isProbablePrime(1)) {
        System.out.println("n * " + co + " - 1");
        count++;
      }
      if (count >= num) {
        break;
      }
      co = co.add(BigInteger.ONE);
    }
    return ExitCode.OK;
  }

  @Command
  private int nextPrime2() {
    var n = valueOf(107).pow(1000).multiply(BigInteger.TEN.pow(18)).multiply(TWO);
    var i = n.add(valueOf(262));
    while (true) {
      if (i.isProbablePrime(1)) {
        System.out.println(i.subtract(n));
        break;
      }
      i = i.add(BigInteger.ONE);
    }
    return ExitCode.OK;
  }

  @Command
  private int primeGap(@Option(names = {"--max-start", "-m"}) double initialMax) {
    var auto = Arena.ofAuto();
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 20);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(window);
    mpz_mul_ui(window, min, 99);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    Project19.seedRandomState(state);
    var in1 = __mpfr_struct.allocate(auto).reinterpret(auto, mpfr_h::mpfr_clear);
    mpfr_init2(in1, 305);
    var out1 = __mpfr_struct.allocate(auto).reinterpret(auto, mpfr_h::mpfr_clear);
    mpfr_init2(out1, 25);
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var smallerPrime = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(smallerPrime);
    var largerPrime = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(largerPrime);
    var diff = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(diff);
    double max = initialMax;
    while (true) {
      mpz_urandomm(n, state, window);
      mpz_add(n, n, min);
      mpz_setbit(n, 0);
      if (mpz_probab_prime_p(n, 1) == 0) {
        mpz_prevprime(smallerPrime, n);
      } else {
        mpz_set(smallerPrime, n);
      }
      mpz_nextprime(largerPrime, n);
      mpz_sub(diff, largerPrime, smallerPrime);
      mpfr_set_z(in1, smallerPrime, 0);
      mpfr_log(out1, in1, MPFR_RNDZ());

      var merit = mpz_get_u64(diff) / mpfr_get_d(out1, MPFR_RNDZ());
      // これはまあ消してもいいかな、もしくはスレッドごとに計測
      if (max < merit) {
        System.err.println(LocalDateTime.now() + " 記録が更新されました: " + merit);
        max = merit;
      }
      if (30 <= merit) {
        var length = mpz_sizeinbase(smallerPrime, 10) + 2;
        var str = auto.allocate(length);
        mpz_get_str(str, 10, smallerPrime);
        var string = str.getString(0);
        logger.info("30 over merit!: {}", string);
        if (42 <= merit) {
          break;
        }
      }
    }
    return ExitCode.OK;
  }

  @Command
  private int sierpinskiProblem() {
    var auto = Arena.ofAuto();
    int k2 = 21181;
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(n, k2);
    var nAdd1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(nAdd1);
    var k = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(k);

    return ExitCode.OK;
  }

  @Command
  private int send(@Option(names = {"--cof"}, defaultValue = "50001") int i1,
      @Option(names = {"--max"}, defaultValue = "100000") int i2)
      throws IOException, InterruptedException {
    for (int i = i1; i < i2; i++) {
      var str = ENDPOINT + URLEncoder.encode("21181*2^" + i + "+1", StandardCharsets.UTF_8);
      var url = URI.create(str).toURL();
      HttpsURLConnection urlConnection;
      int code;
      do {
        urlConnection = (HttpsURLConnection) url.openConnection();
        urlConnection.setRequestProperty("Cookie", FDB_USER_COOKIE);
        code = urlConnection.getResponseCode();
        if (code == FactorDistribution.HTTP_TOO_MANY_REQUESTS) {
          Thread.sleep(1000 * 60 * 5);
        }
      } while (code != 200);
      JsonNode root;
      try (var inputStream = urlConnection.getInputStream()) {
        root = OBJECT_MAPPER.readTree(inputStream);
      }
      var id = root.get("id");
      var status = root.get("status");
      logger.info("{}: {}, {}", id.isTextual() ? id.textValue() : id.longValue(), i,
          status.textValue());
    }
    return ExitCode.OK;
  }

  @Command
  private int bom() throws IOException, InterruptedException {
    var auto = Arena.ofAuto();
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 18);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(window);
    mpz_set_u64(window, 8999999999999999961L);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    Project19.seedRandomState(state);
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var stringBuilder = new StringBuilder(20 * 21621);
    var str = auto.allocate(21);
    for (int i = 0; i < 1000; i++) {
      mpz_urandomm(n, state, window);
      mpz_add(n, n, min);
      mpz_nextprime(n, n);
      mpz_get_str(str, 10, n);
      if (i != 0) {
        stringBuilder.append('*');
      }
      stringBuilder.append(str.getString(0));
    }
    var url = URI.create(
        ENDPOINT + URLEncoder.encode(stringBuilder.toString(), StandardCharsets.UTF_8)).toURL();
    var urlConnection = (HttpsURLConnection) url.openConnection();
    int code;
    do {
      urlConnection = (HttpsURLConnection) url.openConnection();
      urlConnection.setRequestProperty("Cookie", FDB_USER_COOKIE);
      code = urlConnection.getResponseCode();
      if (code == FactorDistribution.HTTP_TOO_MANY_REQUESTS) {
        System.err.println("TOO MANY REQUEST");
        Thread.sleep(1000 * 60 * 5);
      } else if (code != 200) {
        System.err.println("code " + code);
      }
    } while (code != 200);
    JsonNode root;
    try (var inputStream = urlConnection.getInputStream()) {
      root = OBJECT_MAPPER.readTree(inputStream);
    }
    var id = root.get("id");
    var status = root.get("status");
    logger.info("{}: {}", id.isTextual() ? id.textValue() : id.longValue(), status.textValue());

    return ExitCode.OK;
  }

  @Command
  private int re(Path[] in) throws IOException {
    var treeMap = new TreeMap<Long, Double>();
    double value;
    long key;
    Double oldValue;
    for (var path : in) {
      var elements = Files.size(path) / 8;
      try (var stream = new DataInputStream(
          new BufferedInputStream(Files.newInputStream(path, StandardOpenOption.READ),
              0x7fffffff - 2))) {
        for (long i = 0; i < elements; i++) {
          value = stream.readDouble();
          key = Double.doubleToLongBits(value) & MASK;
          if ((oldValue = treeMap.put(key, value)) != null) {
            logger.info("Mantissa collision: {}, {} in 0x{}", oldValue, value,
                String.format("%014x", key));
          }
        }
      }
      System.err.println(path.getFileName() + " done");
    }
    System.err.println("size is " + treeMap.size());
    return ExitCode.OK;
  }

  @Command
  private int showIndex(double v, Path path) throws IOException {
    try (var da = new DataInputStream(
        new BufferedInputStream(Files.newInputStream(path, StandardOpenOption.READ)))) {
      long index = 0;
      while (v >= da.readDouble()) {
        index++;
      }
      System.out.println(index);
    }
    return ExitCode.OK;
  }

  @Command
  private int digitPrimes(Path out) throws IOException {
    var auto = Arena.ofAuto();
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 299);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set(window, min);
    mpz_mul_ui(window, window, 9);
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    Project19.seedRandomState(state);
    var str = auto.allocate(305);
    var list = new ArrayList<String>(300);
    long s = System.nanoTime();
    for (int i = 0; i < 300; i++) {
      mpz_urandomm(n, state, window);
      mpz_add(n, n, min);
      mpz_nextprime(n, n);
      mpz_get_str(str, 10, n);
      list.add(str.getString(0));
    }
    long e = System.nanoTime();
    System.err.println(((e - s) / 1e9) + " 秒");
    Collections.sort(list);
    Files.write(out, list, StandardOpenOption.CREATE, StandardOpenOption.WRITE,
        StandardOpenOption.APPEND);
    return ExitCode.OK;
  }

  @Command
  private int postFD(Path[] in) throws IOException {
    for (var path : in) {
      for (var line : Files.readAllLines(path)) {
        var url = URI.create(ENDPOINT + line).toURL();
        var connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestProperty("Cookie", FDB_USER_COOKIE);
        var responseCode = connection.getResponseCode();
        System.err.println(responseCode);
      }
    }
    return ExitCode.OK;
  }

  @Command
  private int bulkPostPrime(@Parameters(defaultValue = "1000000000000000000") BigInteger p,
      @Option(names = {"--num", "-n"}, defaultValue = "50000000") long n) {
    //if (!p.isProbablePrime(1)) {
    //  p = p.nextProbablePrime();
    //}
    // parallelにしたらスパム判定食らって死ゾ
    var queue = new LinkedBlockingQueue<BigInteger>(5);
    try (var pool = new ForkJoinPool(3)) {
      pool.submit(() -> Stream.iterate(p.isProbablePrime(1) ? p : p.nextProbablePrime(),
          BigInteger::nextProbablePrime).limit(n).forEach(q -> {
        try {
          queue.put(q);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }));
      pool.submit(() -> LongStream.range(0, n).parallel().forEach(_ -> {
        String prime;
        try {
          prime = queue.take().toString();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        try {
          var url = URI.create(ENDPOINT + prime).toURL();
          HttpsURLConnection connection;
          int re;
          do {
            connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestProperty("Cookie", FDB_USER_COOKIE);
            re = connection.getResponseCode();
            if (re == FactorDistribution.HTTP_TOO_MANY_REQUESTS) {
              logger.error("sleeping...");
              Thread.sleep(1000 * 60 * 5);
            }
          } while (re != 200);

          JsonNode root;
          try (var inputStream = connection.getInputStream()) {
            root = OBJECT_MAPPER.readTree(inputStream);
          }
          var id = root.get("id");
          var status = root.get("status");
          logger.info("{}, {}: {}", prime, id.isTextual() ? id.textValue() : id.longValue(),
              status.textValue());
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }));
    }
    return ExitCode.OK;
  }

  @Command
  private int log(Path in) throws IOException {
    var auto = Arena.ofAuto();
    var pZ = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(pZ, auto.allocateFrom(Files.readString(in)), 10);
    var bitLength = mpz_sizeinbase(pZ, 2);
    var pMpfr = __mpfr_struct.allocate(auto).reinterpret(auto, mpfr_h::mpfr_clear);
    System.err.println(bitLength);
    //mpfr_init2(pMpfr, (int) ((bitLength + 63) / 64 * 64));
    mpfr_init2(pMpfr, 53);
    mpfr_set_z(pMpfr, pZ, 0);
    System.err.println(mpfr_get_prec(pMpfr));
    var lnP = __mpfr_struct.allocate(auto).reinterpret(auto, mpfr_h::mpfr_clear);
    mpfr_init2(lnP, 53);
    mpfr_log(lnP, pMpfr, MPFR_RNDZ());
    var d = mpfr_get_d(lnP, MPFR_RNDZ());
    System.out.println(d);
    return ExitCode.OK;
  }

  @Override
  public Integer call() throws Exception {
    return ExitCode.USAGE;
  }

  /**
   * 22485桁で証明が容易な素数を探そう
   * @return s
   * @throws IOException s
   */
  @Command
  private int p22485() throws IOException {
    var primeArray = new BigInteger[2500];
    primeArray[0] = BigInteger.valueOf(2);
    int length = primeArray.length;
    for (int i = 1; i < length; i++) {
      primeArray[i] = primeArray[i - 1].nextProbablePrime();
    }
    var pMin = BigInteger.valueOf(10).pow(22484);
    var pMax = BigInteger.valueOf(10).pow(22485);
    var pSub1 = primeArray[0];
    var generator = RandomGenerator.getDefault();
    var p = primeArray[1];
    for (int i = 0; i < 10; i++) {
      outer:
      while (true) {
        while (p.compareTo(pMax) < 0) {
          if (p.compareTo(pMin) >= 0) {
            if (p.isProbablePrime(1)) {
              break outer;
            }
          }
          pSub1 = pSub1.multiply(primeArray[generator.nextInt(length)]);
          p = pSub1.add(BigInteger.ONE);
        }
        pSub1 = primeArray[0];
        p = primeArray[1];
      }
      var fileName = "prime-p22485-%d.txt".formatted(Instant.now().getEpochSecond());
      System.err.println(fileName);
      Files.writeString(Path.of(fileName), p + System.lineSeparator(), StandardCharsets.UTF_8,
          StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
    return ExitCode.OK;
  }

  enum ReadMode {
    HEAD, TAIL
  }

}
