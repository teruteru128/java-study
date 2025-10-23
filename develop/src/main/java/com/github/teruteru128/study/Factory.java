package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.app.Spammer.requestBuilder;
import static com.github.teruteru128.gmp.gmp_h.gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.gmp_randseed;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_cmp_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_import;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_2exp;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_powm;
import static com.github.teruteru128.gmp.gmp_h.mpz_probab_prime_p;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.math.BigInteger.TWO;
import static java.math.BigInteger.valueOf;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.Message;
import com.github.teruteru128.encode.Base58;
import com.github.teruteru128.gmp.__gmp_randstate_struct;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.study.converters.UnsignedLongConverter;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.math.BigInteger;
import java.net.http.HttpClient;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HexFormat;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.random.RandomGenerator;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.rng.simple.RandomSource;
import org.apache.commons.statistics.descriptive.DoubleStatistics;
import org.apache.commons.statistics.descriptive.Statistic;
import org.apache.commons.statistics.distribution.LogNormalDistribution;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlite.SQLiteDataSource;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.HelpCommand;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

// FIXME サブコマンドをここに並べるのではなく、サービスローダーを使ってサービスとして読み込ませられないか？
@Command(subcommands = {AddressCalc4.class, AddressCalc5.class, CreateLargeSieveTask.class,
    ECIESSample.class, PrimeSearch.class, Updater.class, HelpCommand.class, SlimeSearch.class,
    OwnerCheck.class, CalcBustSize.class, Deterministic.class, CreateCandidateDB.class,
    SmallSievePrimeCounter.class, NewColorGenerator.class, InsertPrimeNumberVerifyTask.class,
    WindowsPathChecker.class}, mixinStandardHelpOptions = true)
public class Factory implements Callable<Integer> {

  public static final int ARRAY_ELEMENTS_MAX = 2147483645;
  public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
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

  public static void seedRandomState(MemorySegment state) {
    var auto = Arena.ofAuto();
    var seed = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(seed);
    var elementCount = 2493;
    var seedNativeSegment = auto.allocate(JAVA_BYTE, elementCount);
    MemorySegment.copy(((SecureRandom) SECURE_RANDOM_GENERATOR).generateSeed(elementCount), 0,
        seedNativeSegment, JAVA_BYTE, 0, elementCount);
    mpz_import(seed, elementCount, 1, 1, 0, 0, seedNativeSegment);
    gmp_randseed(state, seed);
  }

  // FIXME Bitmessageクライアントクラスに分割してclientをメソッド引数から消す
  public static void post(HttpClient client, Message message)
      throws IOException, InterruptedException {
    var encoder = Base64.getEncoder();
    // FIXME シリアライズの責任の分割
    var body = "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"%s\",\"%s\",\"%s\",\"%s\",%d,%d],\"id\":1}".formatted(
        message.to(), message.from(),
        encoder.encodeToString(message.subject().getBytes(StandardCharsets.UTF_8)),
        encoder.encodeToString(message.message().getBytes(StandardCharsets.UTF_8)),
        message.encodingType(), message.ttl());
    client.send(requestBuilder.POST(BodyPublishers.ofString(body)).build(),
        HttpResponse.BodyHandlers.ofString()).body();
  }

  private static TreeSet<String> filterBySentAddressSet(List<@NotNull String> addresses)
      throws SQLException {
    var addressTreeSet = new TreeSet<>(addresses);
    var source = new SQLiteDataSource();
    source.setUrl(Objects.requireNonNull(System.getenv("DB_URL")));
    try (var con = source.getConnection()) {
      try (var statement = con.createStatement()) {
        try (var resultSet = statement.executeQuery(
            "SELECT toAddress from sent where folder = 'sent' and datetime(senttime, 'unixepoch', 'localtime') >= '2025-09-21 18:00:00';")) {
          while (resultSet.next()) {
            addressTreeSet.remove(resultSet.getString("toAddress"));
          }
        }
      }
    }
    return addressTreeSet;
  }

  public static <T> Function<T, T> serializableIdentity() {
    return (Serializable & Function<T, T>) t -> t;
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
    var primeArray = new BigInteger[25000];
    primeArray[0] = BigInteger.valueOf(2);
    int primeArrayLength = primeArray.length;
    for (int i = 1; i < primeArrayLength; i++) {
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
          pSub1 = pSub1.multiply(primeArray[generator.nextInt(primeArrayLength)]);
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

  @Command
  public int exp() {
    var dist = LogNormalDistribution.of(Math.log(25), 1.442026886600883);
    var sampler = dist.createSampler(RandomSource.XO_RO_SHI_RO_128_PP.create());
    var array = sampler.samples(200).toArray();
    for (var ln : array) {
      System.out.println(Math.log(ln) + ", " + ln);
    }
    return ExitCode.OK;
  }

  /**
   * <a href="https://x.com/Pajoca_/status/1967072048259494084">一般化ヴィーフェリッヒ素数</a>
   * @return return code
   */
  @Command
  public int wieferich() {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var base = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(base, 47);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var pSub1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(pSub1);
    var pPow2 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(pPow2);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    seedRandomState(state);
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(min);
    mpz_set_u64(min, 200000000000000L);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(window, 10);
    mpz_pow_ui(window, window, 32);
    mpz_sub(window, window, min);
    do {
      mpz_urandomm(p, state, window);
      mpz_add(p, p, min);
      mpz_nextprime(p, p);

      mpz_sub_ui(pSub1, p, 1);
      mpz_pow_ui(pPow2, p, 2);

      mpz_powm(n, base, pSub1, pPow2);
      if (mpz_cmp_ui(n, 10) <= 0) {
        var length = mpz_sizeinbase(p, 10) + 2;
        var str = auto.allocate(length);
        mpz_get_str(str, 10, p);
        System.out.println("modが10以下: " + str.getString(0));
      }
    } while (mpz_cmp_ui(n, 1) != 0);
    var length = mpz_sizeinbase(p, 10) + 2;
    var str = auto.allocate(length);
    mpz_get_str(str, 10, n);
    System.out.println("modが1と等しい: " + str.getString(0));

    return EXIT_CODE_OK;
  }

  /**
   * 今回のスパム
   * タイトル: 10の37乗未満の素数(2の122乗未満)
   * 本文: 72桁の素数*n
   * @return exit code
   */
  @Command
  public int spam(@Parameters(arity = "1", paramLabel = "toAddress") String toAddress,
      @Parameters(arity = "0..1", paramLabel = "fromAddress") String fromAddress,
      @Option(names = {"--num",
          "-n"}, arity = "0..1", paramLabel = "num", defaultValue = "24") int num, @Option(names = {
          "--interval"}, arity = "0..1", paramLabel = "interval", defaultValue = "15") int interval)
      throws IOException, InterruptedException {
    if (fromAddress == null) {
      logger.warn("fromAddress is not set, fromAddress has been set to toAddress.");
      fromAddress = toAddress;
    }
    var auto = Arena.ofAuto();
    var subjectMax = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    //mpz_init_set_ui(subjectMax, 2);
    //mpz_mul_2exp(subjectMax, subjectMax, 122);
    // Largest prime number less than 2^122
    mpz_init_set_str(subjectMax, auto.allocateFrom("5316911983139663491615228241121378301"), 10);
    var subjectP = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(subjectP);
    var messageMin = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(messageMin, 10);
    mpz_pow_ui(messageMin, messageMin, 71);
    var messageMax = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(messageMax, auto.allocateFrom(
        "999999999999999999999999999999999999999999999999999999999999999999999883"), 10);
    var messageWindow = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(messageWindow);
    mpz_sub(messageWindow, messageMax, messageMin);
    var messageP = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(messageP);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    seedRandomState(state);

    try (var client = HttpClient.newHttpClient()) {
      var messages = new ArrayList<Message>();
      for (var i = 0L; i < num; i++) {
        mpz_urandomm(subjectP, state, subjectMax);
        mpz_nextprime(subjectP, subjectP);
        var subjectLength = mpz_sizeinbase(subjectP, 10) + 2;
        var subjectSegment = auto.allocate(subjectLength);
        mpz_get_str(subjectSegment, 10, subjectP);
        //
        mpz_urandomm(messageP, state, messageWindow);
        mpz_add(messageP, messageP, messageMin);
        mpz_nextprime(messageP, messageP);
        var messagePLength = mpz_sizeinbase(messageP, 10) + 2;
        var messageSegment = auto.allocate(messagePLength);
        mpz_get_str(messageSegment, 10, messageP);
        var message = new Message(toAddress, fromAddress, subjectSegment.getString(0),
            messageSegment.getString(0), 5400);
        logger.info("sent");
        logger.debug("{}, {}, {}, {}", message.to(), message.from(), message.subject(),
            message.message());
        //messages.add(message);
        post(client, message);
        Thread.sleep(Duration.ofSeconds(interval));
      }
      //post(client, messages);
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int spam2(Path toAddressFile, String fromAddress, @Option(names = {"--num",
          "-n"}, arity = "0..1", paramLabel = "num", defaultValue = "-1") long num,
      @Option(names = "--filter-sent-addresses", defaultValue = "false") boolean filterSentAddresses)
      throws IOException, InterruptedException, SQLException, ExecutionException {
    var auto = Arena.ofAuto();
    var subjectMax = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    //mpz_init_set_ui(subjectMax, 2);
    //mpz_mul_2exp(subjectMax, subjectMax, 122);
    // Largest prime number less than 2^122
    // usable to uuid v4
    mpz_init_set_str(subjectMax, auto.allocateFrom("5316911983139663491615228241121378301"), 10);
    var subjectP = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(subjectP);
    var messageMin = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(messageMin, 10);
    mpz_pow_ui(messageMin, messageMin, 71);
    var messageMax = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(messageMax, auto.allocateFrom(
        "999999999999999999999999999999999999999999999999999999999999999999999883"), 10);
    var messageWindow = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(messageWindow);
    mpz_sub(messageWindow, messageMax, messageMin);
    var messageP = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(messageP);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    seedRandomState(state);
    final var addresses = Files.readAllLines(toAddressFile);
    if (filterSentAddresses) {
      var beforeAddressesSize = addresses.size();
      var set = filterBySentAddressSet(addresses);
      addresses.clear();
      addresses.addAll(set);
      var afterAddressesSize = addresses.size();
      System.err.println("filtered");
      System.err.println("before: " + beforeAddressesSize + ", after: " + afterAddressesSize);
      System.err.println("diff: " + (beforeAddressesSize - afterAddressesSize));
    }
    Collections.shuffle(addresses, SECURE_RANDOM_GENERATOR);
    long i = 0;
    try (var client = HttpClient.newHttpClient()) {
      var size = addresses.size();
      var messages = new ArrayList<Message>((num > 0) ? (int) num : size);
      if (size < num) {
        System.err.println(
            "要求するメッセージ数を満たすことができませんでした。" + size + "件のみ送信します");
      }
      for (var address : addresses) {
        mpz_urandomm(subjectP, state, subjectMax);
        mpz_nextprime(subjectP, subjectP);
        var subjectLength = mpz_sizeinbase(subjectP, 10) + 2;
        var subjectSegment = auto.allocate(subjectLength);
        mpz_get_str(subjectSegment, 10, subjectP);
        //
        mpz_urandomm(messageP, state, messageWindow);
        mpz_add(messageP, messageP, messageMin);
        mpz_nextprime(messageP, messageP);
        var messagePLength = mpz_sizeinbase(messageP, 10) + 2;
        var messageSegment = auto.allocate(messagePLength);
        mpz_get_str(messageSegment, 10, messageP);
        var message = new Message(address, fromAddress, subjectSegment.getString(0),
            messageSegment.getString(0), 5400);
        messages.add(message);
        //post(client, message);
        i++;
        if (i % 1000 == 0) {
          System.err.println("create: " + i);
        }
        if (num > 0 && i >= num) {
          break;
        }
      }
      System.err.println("created");
      post(client, messages);
      System.err.println("posted");
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int sierpinski(@Option(names = "-k", defaultValue = "21181") int k, int nMin, int nMax) {
    var auto = Arena.ofAuto();
    var pSub1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(pSub1, k);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    mpz_mul_2exp(pSub1, pSub1, nMin);
    var startP = BigInteger.valueOf(53);
    var maxSmallP = BigInteger.valueOf(100000000);
    out:
    for (int i = nMin; i <= nMax; i++, mpz_mul_2exp(pSub1, pSub1, 1)) {
      mpz_add_ui(p, pSub1, 1);
      var start = System.nanoTime();
      if (i == 100000028) {
        for (var smallP = startP.nextProbablePrime(); smallP.compareTo(maxSmallP) < 0;
            smallP = smallP.nextProbablePrime()) {
          if (gmp_h.mpz_divisible_ui_p(p, smallP.intValue()) != 0) {
            System.err.println(i + " is divisible by " + smallP);
            continue out;
          }
        }
        System.err.println(i + ": 見つかりませんでした");
      }
      var result = mpz_probab_prime_p(p, 24);
      var finish = System.nanoTime();
      var seconds = (finish - start) / 1e9;
      if (seconds >= 3600.) {
        System.err.println(
            "[" + LocalDateTime.now() + "]" + i + ": " + result + "(" + seconds + " seconds)");
      } else {
        System.err.println(i + ": " + result + "(" + seconds + " seconds)");
      }
      if (result != 0) {
        break;
      }
    }
    return EXIT_CODE_OK;
  }

  private void post(HttpClient client, List<Message> messages)
      throws InterruptedException, ExecutionException {
    var joiner = new StringJoiner(",", "[", "]");
    var encoder = Base64.getEncoder();
    var id = 0L;
    for (var message : messages) {
      var body = "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"%s\",\"%s\",\"%s\",\"%s\",%d,%d],\"id\":%d}".formatted(
          message.to(), message.from(),
          encoder.encodeToString(message.subject().getBytes(StandardCharsets.UTF_8)),
          encoder.encodeToString(message.message().getBytes(StandardCharsets.UTF_8)),
          message.encodingType(), message.ttl(), id++);
      joiner.add(body);
    }
    var request = requestBuilder.POST(BodyPublishers.ofString(joiner.toString())).build();
    var handler = BodyHandlers.ofString();
    var future = client.sendAsync(request, handler);
    System.err.println("send async...");
    future.get().body();
  }

  @Command
  public int fictional(Path in) throws IOException, InterruptedException, ExecutionException {
    var encoder = Base64.getEncoder();
    var id = 0L;
    var addresses = Files.readAllLines(in);
    System.out.println("address list loaded");
    var body = new StringJoiner(",", "[", "]");
    for (var address : addresses) {
      var label = "fictional-" + address.substring(3, 9);
      var b = "{\"jsonrpc\":\"2.0\",\"method\":\"addAddressBookEntry\",\"params\":[\"%s\",\"%s\"],\"id\":%d}".formatted(
          address, encoder.encodeToString(label.getBytes(StandardCharsets.UTF_8)), id++);
      body.add(b);
    }
    System.out.println("request build done");
    try (var client = HttpClient.newHttpClient()) {
      var request = requestBuilder.POST(BodyPublishers.ofString(body.toString())).build();
      var handler = BodyHandlers.ofString();
      var future = client.sendAsync(request, handler);
      System.err.println("send async...");
      future.get().body();
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int repl(Path in, Path out) throws IOException {
    var joiner = new StringJoiner("," + System.lineSeparator(), "BEGIN TRANSACTION;\n"
                                                                + "insert into pubkeys(address, addressversion, transmitdata, time, usedpersonally) values",
        ";\n" + "COMMIT;");
    try (var lines = Files.lines(in)) {
      lines.map(l -> l.replaceAll("\\|", ",").replaceAll("^", "('").replaceAll("(?=,4,)", "'")
          .replaceAll("(?=040100000000)", "x'").replaceAll("(?<=FD03E8FD03E8)", "'")
          .replaceAll("yes$", "'$0')")).forEach(joiner::add);
    }
    Files.writeString(out, joiner.toString(), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
    return EXIT_CODE_OK;
  }

  @Command
  public int searchAddress(Path[] in)
      throws IOException, NoSuchAlgorithmException, DigestException {
    for (var file : in) {
      if (!Files.exists(file)) {
        System.err.println("not found: " + file);
        return EXIT_CODE_SOFTWARE;
      }
    }
    var auto = Arena.ofAuto();
    var keys = auto.allocate(65L * 16777216 * in.length);
    long offset = 0;
    for (var file : in) {
      try (var channel = Files.newByteChannel(file, StandardOpenOption.READ)) {
        var size = channel.size();
        var slice = keys.asSlice(offset, size, 1);
        channel.read(slice.asByteBuffer());
        offset += size;
      }
    }
    final int blockMax = in.length * 16;
    long selectedSignKeyOffset;
    long selectedEncKeyOffset;
    var provider = Security.getProvider("BC");
    Objects.requireNonNull(provider);
    var sha512 = MessageDigest.getInstance("SHA-512", provider);
    var ripemd160 = MessageDigest.getInstance("Ripemd160", provider);
    long signIndex;
    long encIndex;
    var hash = new byte[64];
    var hashSegment = ByteBuffer.wrap(hash);

    long count = 0;
    found:
    while (true) {
      selectedSignKeyOffset = SECURE_RANDOM_GENERATOR.nextInt(blockMax) * 1048576L * 65;
      selectedEncKeyOffset = SECURE_RANDOM_GENERATOR.nextInt(blockMax) * 1048576L * 65;
      signIndex = selectedSignKeyOffset;
      for (int i = 0; i < 1048576; i++) {
        signIndex += 65;
        var signByteBuffer = keys.asSlice(signIndex, 65, 1).asByteBuffer();
        encIndex = selectedEncKeyOffset;
        for (int j = 0; j < 1048576; j++) {
          encIndex += 65;
          sha512.update(signByteBuffer);
          signByteBuffer.rewind();
          // FIXME これコンストラクタ呼びまくってて絶対遅いンゴ
          sha512.update(keys.asSlice(encIndex, 65, 1).asByteBuffer());
          sha512.digest(hash, 0, 64);
          ripemd160.update(hash, 0, 64);
          ripemd160.digest(hash, 0, 20);
          if (Long.numberOfLeadingZeros(hashSegment.getLong(0)) >= 45) {
            System.err.println(
                "[" + LocalDateTime.now() + "]お前やー！！！！(" + Long.numberOfLeadingZeros(
                    hashSegment.getLong(0)) + ") sign: " + signIndex + ", enc: " + encIndex);
            count++;
            if (count >= 10) {
              break found;
            }
          }
        }
      }
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int h(BigInteger p) {
    var treeMap = new TreeMap<Long, Long>();
    Stream.iterate(p, n -> n.compareTo(BigInteger.ONE) > 0,
            n -> n.testBit(0) ? n.shiftLeft(1).add(n).add(BigInteger.ONE) : n.shiftRight(1))
        .forEach(n -> treeMap.compute((long) n.bitLength(), (k, l) -> l == null ? 1L : l + 1));
    treeMap.forEach((k, v) -> System.out.println("k = " + k + ", v = " + v));
    return EXIT_CODE_OK;
  }

  @Command
  public int epoch(long e) {
    var instant = Instant.ofEpochMilli(e);
    System.out.println(instant);
    return EXIT_CODE_OK;
  }

  @Command
  public int sex(String key, @Option(names = {"--public"}) boolean keyIsPublic, Path dir,
      @Option(names = {"--no-follow-links"}) boolean noFollowLinks)
      throws NoSuchAlgorithmException, IOException {
    var hexFormat = HexFormat.of();
    byte[] signaturePublicKey;
    if (keyIsPublic) {
      signaturePublicKey = hexFormat.parseHex(key);
    } else {
      var signaturePrivateKey = Base58.decode(key);
      signaturePublicKey = Const.SEC_P256_K1_G.multiply(
          new BigInteger(1, signaturePrivateKey, 1, 32)).getEncoded(false);
    }
    var bc = Security.getProvider("BC");
    var sha512_original = MessageDigest.getInstance("SHA-512", bc);
    sha512_original.update(signaturePublicKey, 0, 65);
    Path[] pathArray;
    try (var stream = Files.list(dir)) {
      var pattern = Pattern.compile("publicKeys\\d+\\.bin");
      // FIXME NOFOLLOW_LINKSを引数に加えるかどうかで三項演算子なんて使いたくない
      Predicate<Path> pathPredicate0 = path -> noFollowLinks ? Files.isRegularFile(path,
          LinkOption.NOFOLLOW_LINKS) : Files.isRegularFile(path);
      Predicate<Path> pathPredicate1 = path -> pattern.matcher(path.getFileName().toString())
          .matches();
      var comparator = Comparator.<Path>comparingInt(p -> p.getFileName().toString().length())
          .thenComparing(Function.identity());
      pathArray = stream.filter(pathPredicate0.and(pathPredicate1)).sorted(comparator)
          .toArray(Path[]::new);
    }
    System.out.println(pathArray.length);
    System.err.println("[" + LocalDateTime.now() + "] 開始します");
    for (var path : pathArray) {
      var k = Files.readAllBytes(path);
      int length = k.length;
      var result = IntStream.iterate(0, p -> p < length, p -> p + 65).parallel().filter(offset -> {
        var hash = new byte[64];
        MessageDigest sha512;
        try {
          sha512 = (MessageDigest) sha512_original.clone();
        } catch (CloneNotSupportedException e) {
          throw new RuntimeException(e);
        }
        sha512.update(k, offset, 65);
        try {
          sha512.digest(hash, 0, 64);
        } catch (DigestException e) {
          throw new RuntimeException(e);
        }
        MessageDigest ripemd160;
        try {
          ripemd160 = MessageDigest.getInstance("RIPEMD160", bc);
        } catch (NoSuchAlgorithmException e) {
          throw new RuntimeException(e);
        }
        ripemd160.update(hash, 0, 64);
        try {
          ripemd160.digest(hash, 0, 20);
        } catch (DigestException e) {
          throw new RuntimeException(e);
        }
        if (hash[0] == 0 && hash[1] == 0 && hash[2] == 0 && hash[3] == 0 && hash[4] == 0
            && hash[5] == 0) {
          System.out.println(
              "[" + LocalDateTime.now() + "] found: " + hexFormat.formatHex(hash, 0, 20));
          return true;
        }
        return false;
      }).findAny();
      if (result.isPresent()) {
        var offset = result.getAsInt();
        System.out.println("file is " + path);
        System.out.println("offset is " + offset);
        System.out.println("key number is " + (offset / 65));
      }
      System.err.println("[" + LocalDateTime.now() + "] file " + path + " is done");
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int scheduledPosting(Path toAddressFile, String fromAddress, @Option(names = {"--num",
      "-n"}, arity = "0..1", paramLabel = "num", defaultValue = "-1", description = "Number of messages to send at once") int num)
      throws IOException {
    var toSendList = Files.readAllLines(toAddressFile);
    Collections.shuffle(toSendList, SECURE_RANDOM_GENERATOR);
    // 未送信アドレスリスト
    var toSendAddressQueue = new ConcurrentLinkedQueue<>(toSendList);
    // 送信済みアドレスリスト
    var sentAddressQueue = new ConcurrentLinkedQueue<String>();
    try (var executor = new ScheduledThreadPoolExecutor(
        1); var client = HttpClient.newHttpClient()) {
      executor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
      var future = executor.scheduleWithFixedDelay(() -> {

        String address;
        // キューから今回のタスク分のアドレスを取り出す、足りなかったらそこまでで打ち切る
        var sendingWork = new ArrayList<String>();
        for (int i = 0; i < num && (address = toSendAddressQueue.poll()) != null; i++) {
          sendingWork.add(address);
        }
        var messages = new ArrayList<Message>();
        // 送信するメッセージを作成する
        for (var ad : sendingWork) {
          messages.add(new Message(ad, fromAddress, "", "", 86400));
        }
        // 送信
        try {
          post(client, messages);
        } catch (InterruptedException | ExecutionException e) {
          throw new RuntimeException(e);
        }
        // 送信済みキューにアドレスを入れる
        sentAddressQueue.addAll(sendingWork);
        // 未送信アドレスキューが空ならば送信済みキューから全て取り出しシャッフルして未送信アドレスキューに追加してリセット
        if (toSendAddressQueue.isEmpty()) {
          var resetWork = new ArrayList<String>();
          while ((address = sentAddressQueue.poll()) != null) {
            resetWork.add(address);
          }
          Collections.shuffle(resetWork, SECURE_RANDOM_GENERATOR);
          toSendAddressQueue.addAll(resetWork);
        }
      }, 0, 3, TimeUnit.HOURS);
    }
    return EXIT_CODE_OK;
  }

  private BigInteger babyStepGiantStep(BigInteger base, BigInteger b, BigInteger m) {
    // base、b、m が有効な入力であることを確認
    if (m.compareTo(BigInteger.ONE) <= 0) {
      throw new IllegalArgumentException("Modulus m must be greater than 1.");
    }
    if (base.gcd(m).compareTo(BigInteger.ONE) != 0) {
      // baseとmが互いに素でない場合、このアルゴリズムは動作しません。
      // 別のアルゴリズム（例：Pohlig-Hellman）が必要になることがあります。
      return null;
    }

    // ステップサイズ n を計算 (n = ceil(sqrt(m)))
    BigInteger n = m.sqrt().add(BigInteger.ONE);

    // ベビー・ステップを計算し、HashMapに格納 (base^j, j)
    var babySteps = new HashMap<BigInteger, BigInteger>();
    BigInteger baby = BigInteger.ONE;
    for (var j = BigInteger.ZERO; j.compareTo(n) < 0; j = j.add(BigInteger.ONE)) {
      babySteps.put(baby, j);
      baby = baby.multiply(base).mod(m);
    }

    // ジャイアント・ステップを計算
    // giantStepInverse = base^(-n) (mod m)
    BigInteger giantStep = base.modPow(n, m);
    BigInteger giantStepInverse = giantStep.modInverse(m);

    BigInteger giant = b;
    for (var i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
      // 現在のジャイアント・ステップがベビー・ステップのテーブルに含まれているかチェック
      if (babySteps.containsKey(giant)) {
        BigInteger j = babySteps.get(giant);
        // 解 x = i * n + j を計算
        return i.multiply(n).add(j);
      }
      // 次のジャイアント・ステップを計算
      giant = giant.multiply(giantStepInverse).mod(m);
    }

    // 解が見つからない場合は null を返す
    return null;
  }


  @Command
  public int sierpinski2(BigInteger m) {
    var inv = BigInteger.valueOf(21181).modInverse(m);
    var target = inv.negate().mod(m);
    System.out.println("inv: " + inv);
    System.out.println("2^n = " + target + " (mod " + m + ") を探します");
    long start = System.nanoTime();
    var n = babyStepGiantStep(BigInteger.TWO, target, m);
    long finish = System.nanoTime();
    System.out.println("n : " + n);
    System.out.println((finish - start) / 3.6e12 + " 時間");
    return EXIT_CODE_OK;
  }

  @Command
  public int sierpinski3(@Parameters(converter = UnsignedLongConverter.class) long val,
      @Parameters(converter = UnsignedLongConverter.class) long val1) {
    var auto = Arena.ofAuto();
    var rop = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(rop);
    var base = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(base, 2);
    var exp = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(exp);
    mpz_set_u64(exp, val);
    var mod = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(mod);
    mpz_set_u64(mod, val1);
    mpz_powm(rop, base, exp, mod);
    var length = mpz_sizeinbase(rop, 10) + 2;
    var buf = auto.allocate(length);
    mpz_get_str(buf, 10, rop);
    System.out.println(buf.getString(0));
    return EXIT_CODE_OK;
  }

  @Command
  public int sierpinski4() {
    LongStream.rangeClosed(1, 3960).filter(
            l -> !(l % 2 == 1 || l % 3 == 0 || l % 4 == 2 || l % 8 == 0 || l % 10 == 6 || l % 11 == 0
                   || l % 11 == 10 || l % 12 == 4 || l % 18 == 16 || l % 22 == 8 || l % 23 == 19
                   || l % 35 == 15 || l % 37 == 35 || l % 52 == 40 || l % 92 == 56 || l % 95 == 53
                   || l % 119 == 74 || l % 130 == 4 || l % 162 == 122 || l % 418 == 196 || l % 522 == 1
                   || l % 658 == 402 || l % 820 == 740 || l % 1400 == 988 || l % 1664 == 172
                   || l % 1932 == 20 || l % 2344 == 380 || l % 2676 == 212 || l % 2919 == 764
                   || l % 3036 == 1052 || l % 4242 == 452 || l % 14388 == 980 || l % 14648 == 1244
                   || l % 18131 == 1292 || l % 19258 == 1124 || l % 57802 == 188 || l % 61376 == 1004
                   || l % 342466 == 68 || l % 685460 == 500 || l % 110000116 == 644
                   || l % 1140196839 == 860 || l % 3234435810L == 3908 || l % 9145782796L == 620))
        .forEach(System.out::println);
    return EXIT_CODE_OK;
  }

  enum ReadMode {
    HEAD, TAIL
  }

  private static class PrimeGenerator {

    Arena auto = Arena.ofAuto();
    MemorySegment state;
    MemorySegment subjectMax;
    MemorySegment messageMin;
    MemorySegment messageMax;
    MemorySegment messageWindow;

    public PrimeGenerator() {
      subjectMax = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      messageMin = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init_set_ui(messageMin, 10);
      state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
      messageMax = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      messageWindow = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init(messageWindow);
      mpz_sub(messageWindow, messageMax, messageMin);
      mpz_init_set_str(messageMax, auto.allocateFrom(
          "999999999999999999999999999999999999999999999999999999999999999999999883"), 10);
      gmp_randinit_default(state);
      seedRandomState(state);
    }

  }

}
