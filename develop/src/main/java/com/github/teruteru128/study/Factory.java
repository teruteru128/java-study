package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_cmp;
import static com.github.teruteru128.gmp.gmp_h.mpz_divisible_p;
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
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;
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
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.math.BigInteger;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LongSummaryStatistics;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.DoubleConsumer;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.rng.simple.RandomSource;
import org.apache.commons.statistics.descriptive.DoubleStatistics;
import org.apache.commons.statistics.descriptive.LongStatistics;
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

@Command(subcommands = {AddressCalc4.class, AddressCalc5.class, CreateLargeSieveTask.class,
    ECIESSample.class, FileChecker.class, PrimeSearch.class, SiteChecker.class, Spam.class,
    TeamSpeak.class, Updater.class, HelpCommand.class, ListUp.class, Transform.class,
    CumShoot.class, SlimeSearch.class, Spam3.class, OwnerCheck.class, CalcBustSize.class,
    Deterministic.class, CreatePrimeNumberCandidateDB.class, SmallSievePrimeCounter.class,
    NewColorGenerator.class, Multi2.class, Project5190.class, Project19.class, Project19F.class,
    Project19Sort.class, Project19Unique.class, Spammer.class, Spam2.class,
    FactorDistribution.class, Project19G.class}, mixinStandardHelpOptions = true)
public class Factory implements Callable<Integer> {

  public static final int ARRAY_ELEMENTS_MAX = 2147483645;
  public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
  public static final String ENDPOINT = "https://factordb.com/api?query=";
  public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
  public static final long MASK = (1L << Double.PRECISION) - 1L;
  private static final Logger logger = LoggerFactory.getLogger(Factory.class);

  private Factory() {
  }

  /**
   * Callableをnewして返すファクトリにするはずだったんだけどなあ……
   *
   */
  static Callable<Integer> createInstance() {
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
  private int generatePenis(Path dir,
      @Option(names = {"--prefix", "-p"}, defaultValue = "out") String prefix,
      @Option(names = {"--exp-mu", "-m"}, defaultValue = "20") double expMu,
      @Option(names = {"--sigma", "-s"}, defaultValue = "1") double sigma) throws IOException {
    if (!Files.isDirectory(dir)) {
      System.err.println("dir must be directory!");
      return ExitCode.SOFTWARE;
    }
    var distribution = LogNormalDistribution.of(Math.log(expMu), sigma);
    var sampler = distribution.createSampler(
        new JDKRandomWrapper((SecureRandom) SECURE_RANDOM_GENERATOR));
    System.err.println("generate...");
    var array = sampler.samples(2000000000).parallel().toArray();
    System.err.println("generated");
    var builder = DoubleStatistics.builder(Statistic.MAX, Statistic.MIN, Statistic.MEAN,
        Statistic.STANDARD_DEVIATION);
    var outTxtPath = dir.resolve(Path.of(prefix + ".txt"));
    System.err.println("text output...");
    try (var writer3 = new PrintWriter(
        new BufferedWriter(new FileWriter(outTxtPath.toFile()), 0x7fffffff - 2), false)) {
      for (var v : array) {
        writer3.println(v);
      }
      writer3.flush();
    }
    System.err.println("text output done");
    var outBinPath = dir.resolve(Path.of(prefix + ".bin"));
    System.err.println("bin output...");
    try (var stream = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(outBinPath.toFile()), 0x7fffffff - 2))) {
      for (var v : array) {
        stream.writeDouble(v);
      }
    }
    System.err.println("bin output done");
    System.err.println("sort");
    Arrays.parallelSort(array);
    System.err.println("sort done");
    var outSortedBinPath = dir.resolve(Path.of(prefix + "-sorted.bin"));
    System.err.println("sorted bin output");
    try (var stream = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(outSortedBinPath.toFile()),
            0x7fffffff - 2))) {
      for (var v : array) {
        stream.writeDouble(v);
      }
    }
    System.err.println("sorted bin output done");
    System.err.println("statistics generate");
    var statistics = Arrays.stream(array).parallel()
        .collect(builder::build, DoubleConsumer::accept, DoubleStatistics::combine);
    var median = (array[999999999] + array[1000000000]) / 2;
    var max = statistics.getAsDouble(Statistic.MAX);
    var min = statistics.getAsDouble(Statistic.MIN);
    var mean = statistics.getAsDouble(Statistic.MEAN);
    var standardDeviation = statistics.getAsDouble(Statistic.STANDARD_DEVIATION);
    System.err.println("statistics generated");
    var outConfigPath = dir.resolve(Path.of(prefix + "-config.txt"));
    System.err.println("config output");
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
    System.err.println("config output done");
    return ExitCode.OK;
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
    var base = valueOf(107).pow(1000).multiply(BigInteger.TWO);
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
    var n = valueOf(107).pow(1000).multiply(BigInteger.TEN.pow(18)).multiply(BigInteger.TWO);
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

  @Command
  private int a(Path nIn, Path lSieveIn, @Option(names = {"--prime"}) long val)
      throws IOException, ClassNotFoundException {
    long[] longArray;
    try (var oin = new ObjectInputStream(
        new BufferedInputStream(Files.newInputStream(lSieveIn, StandardOpenOption.READ)))) {
      oin.readLong();
      var o = oin.readObject();
      if (!(o instanceof long[])) {
        System.err.println(o.getClass());
        return ExitCode.SOFTWARE;
      }
      longArray = (long[]) o;
      logger.info("読込できました");
    } catch (OptionalDataException e) {
      System.err.printf("%d, %b%n", e.length, e.eof);
      throw e;
    }
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(n, auto.allocateFrom(Files.readString(nIn)), 10);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    mpz_set_u64(p, val);
    var mod = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(mod);
    var th = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(th, 3355443 * 2 + 1);
    var start = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(start);
    int i = 0;
    while (i < 10) {
      mpz_nextprime(p, p);
      mpz_mod(mod, n, p);
      mpz_sub(start, p, mod);
      if (mpz_even_p(start)) {
        mpz_add(start, start, p);
      }
      if (mpz_cmp(start, th) < 0) {
        var lTmp = mpz_get_u64(start);
        var t = (lTmp - 1) / 2;
        var l = (longArray[(int) (t >>> 6)] >>> (t & 0x3f)) & 0x1;
        if (l == 0) {
          var length = mpz_sizeinbase(p, 10) + 2;
          var str = auto.allocate(length);
          mpz_get_str(str, 10, p);
          System.out.println(
              str.getString(0) + ": " + Long.toUnsignedString(mpz_get_u64(mod)) + ", "
              + Long.toUnsignedString(lTmp));
          i++;
        }
      }
    }
    return ExitCode.OK;
  }

  @Command
  private int verify(Path nIn, long step, String prime) throws IOException {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(n, auto.allocateFrom(Files.readString(nIn)), 10);
    var s = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(s);
    mpz_set_u64(s, step);
    mpz_add(n, n, s);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(p, auto.allocateFrom(prime), 10);
    var mod = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(mod);
    mpz_mod(mod, n, p);
    var length = mpz_sizeinbase(mod, 10) + 2;
    var str = auto.allocate(length);
    mpz_get_str(str, 10, mod);
    System.err.println(str.getString(0));
    if (mpz_divisible_p(n, p) != 0) {
      System.out.println("divisible");
    } else {
      System.out.println("not divisible");
    }
    return ExitCode.OK;
  }

  @Command
  private int deepSearch(Path in, long step) throws IOException {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(n, auto.allocateFrom(Files.readString(in)), 10);
    var s = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(s);
    mpz_set_u64(s, step * 2 + 1);
    mpz_add(n, n, s);
    var prime = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(prime, 2);
    while (mpz_divisible_p(n, prime) == 0) {
      mpz_nextprime(prime, prime);
    }
    var length = mpz_sizeinbase(prime, 10) + 2;
    var str = auto.allocate(length);
    mpz_get_str(str, 10, prime);
    System.err.println(str.getString(0));
    return ExitCode.OK;
  }

  @Command
  private int pag(String d2) {
    var auto = Arena.ofAuto();
    var co = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(co, 21181);
    int count = 0;
    long shift = 0;
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var d = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(d, auto.allocateFrom(d2), 10);
    while (count < 2) {
      mpz_add_ui(n, co, 1);
      mpz_divisible_p(n, d);
      if (mpz_divisible_p(n, d) != 0) {
        System.out.println(shift);
        count++;
      }
      mpz_mul_2exp(co, co, 1);
      shift++;
    }
    return ExitCode.OK;
  }

  @Command
  private int step(@Option(names = {"--num", "-n"}) int num) {
    var n = new BigInteger("36628253288426119320", 10);
    var _3 = valueOf(3);
    var _4 = valueOf(4);
    var _8 = valueOf(8);
    var _10 = valueOf(10);
    var _11 = valueOf(11);
    var _12 = valueOf(12);
    var _15 = valueOf(15);
    var _18 = valueOf(18);
    var _19 = valueOf(19);
    var _20 = valueOf(20);
    var _22 = valueOf(22);
    var _23 = valueOf(23);
    var _35 = valueOf(35);
    var _40 = valueOf(40);
    var _52 = valueOf(52);
    var _56 = valueOf(56);
    var _68 = valueOf(68);
    var _92 = valueOf(92);
    var _122 = valueOf(122);
    var _130 = valueOf(130);
    var _162 = valueOf(162);
    var _188 = valueOf(188);
    var _212 = valueOf(212);
    var _380 = valueOf(380);
    var _452 = valueOf(452);
    var _500 = valueOf(500);
    var _620 = valueOf(620);
    var _644 = valueOf(644);
    var _740 = valueOf(740);
    var _764 = valueOf(764);
    var _820 = valueOf(820);
    var _1932 = valueOf(1932);
    var _2344 = valueOf(2344);
    var _2676 = valueOf(2676);
    var _2919 = valueOf(2676);
    var _4242 = valueOf(4242);
    var _57802 = valueOf(57802);
    var _342466 = valueOf(342466);
    var _685460 = valueOf(685460);
    var i = BigInteger.ONE;
    int count = 0;
    while (count < num) {
      if (i.testBit(0)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_3).equals(BigInteger.ZERO)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_4).equals(BigInteger.TWO)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_8).equals(BigInteger.ZERO)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_10).equals(valueOf(6))) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      var mod = i.mod(_11);
      if (mod.equals(BigInteger.ZERO)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (mod.equals(BigInteger.TEN)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_12).equals(_4)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_22).equals(valueOf(8))) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_23).equals(_19)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_18).equals(valueOf(16))) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_35).equals(_15)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_52).equals(_40)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_92).equals(_56)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_130).equals(_4)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_162).equals(_122)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.equals(_620)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.equals(_644)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_820).equals(_740)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_1932).equals(_20)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_2344).equals(_380)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_2676).equals(_212)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_2919).equals(_764)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_4242).equals(_452)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_57802).equals(_188)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_342466).equals(_68)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      if (i.mod(_685460).equals(_500)) {
        i = i.add(BigInteger.ONE);
        continue;
      }
      System.out.println(i);
      i = i.add(BigInteger.ONE);
      count++;
    }
    return ExitCode.OK;
  }

  @Command
  private int primorial() {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(n, 2);
    var p = BigInteger.TWO;
    var nF = __mpfr_struct.allocate(auto).reinterpret(auto, mpfr_h::mpfr_clear);
    mpfr_init2(nF, 1024);
    var log10 = __mpfr_struct.allocate(auto).reinterpret(auto, mpfr_h::mpfr_clear);
    mpfr_init2(log10, 128);
    return ExitCode.OK;
  }

  @Command
  private int op(@Option(names = {"-n"}, defaultValue = "10") int streamSize) {
    var dist = NormalDistribution.of(Math.log(20), 1.44);
    var sampler = dist.createSampler(new JDKRandomWrapper((Random) SECURE_RANDOM_GENERATOR));
    sampler.samples(streamSize).forEach(l -> System.out.println(l + ", " + Math.exp(l)));
    return ExitCode.OK;
  }

  @Command
  private int op2(@Option(names = {"-n"}, defaultValue = "10") int streamSize) {
    var dist = NormalDistribution.of(Math.log(20), 1.44);
    var sampler = dist.createSampler(RandomSource.XO_RO_SHI_RO_128_PP.create());
    var array = sampler.samples(200).toArray();
    var builder = DoubleStatistics.builder(Statistic.MAX, Statistic.MIN, Statistic.MEAN,
        Statistic.STANDARD_DEVIATION);
    var statistics = Arrays.stream(array).parallel()
        .collect(builder::build, DoubleConsumer::accept, DoubleStatistics::combine);
    var median = (array[99] + array[100]) / 2;
    var max = statistics.getAsDouble(Statistic.MAX);
    var min = statistics.getAsDouble(Statistic.MIN);
    var mean = statistics.getAsDouble(Statistic.MEAN);
    var standardDeviation = statistics.getAsDouble(Statistic.STANDARD_DEVIATION);
    var line2 = String.format("min=%s, max=%s, mean=%s, median=%s, standard deviation=%s", min, max,
        mean, median, standardDeviation);
    System.out.println(line2);
    return ExitCode.OK;
  }

  @Command
  private int doTheIdol() {
    long count;
    var statistics = new LongSummaryStatistics();
    for (int i = 0; i < 6000000; i++) {
      count = 0;
      while (SECURE_RANDOM_GENERATOR.nextInt(10000) != 0) {
        count++;
      }
      //System.out.println(count);
      statistics.accept(count);
    }
    System.out.println("avg: " + statistics.getAverage());
    System.out.println("max: " + statistics.getMax());
    return ExitCode.OK;
  }

  @Override
  public Integer call() throws Exception {
    return ExitCode.USAGE;
  }

}
