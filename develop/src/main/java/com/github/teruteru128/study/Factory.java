package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_prevprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_probab_prime_p;
import static com.github.teruteru128.gmp.gmp_h.mpz_set;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;
import static com.github.teruteru128.mpfr.mpfr_h.MPFR_RNDZ;
import static com.github.teruteru128.mpfr.mpfr_h.mpfr_get_d;
import static com.github.teruteru128.mpfr.mpfr_h.mpfr_init2;
import static com.github.teruteru128.mpfr.mpfr_h.mpfr_log;
import static com.github.teruteru128.mpfr.mpfr_h.mpfr_set_z;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_get_u64;

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
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.lang.foreign.Arena;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.function.DoubleConsumer;
import java.util.random.RandomGenerator;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.statistics.descriptive.DoubleStatistics;
import org.apache.commons.statistics.descriptive.Statistic;
import org.apache.commons.statistics.distribution.LogNormalDistribution;
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
      long pos = size - 8;
      long count = 0;
      while (true) {
        file.seek(pos);
        var v = file.readDouble();
        if (v < 5702.83517135657) {
          break;
        }
        System.out.println(v);
        pos -= 8;
        count++;
      }
      System.out.println("count: " + count);
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
    try (var fout3 = new PrintWriter(
        new BufferedWriter(new FileWriter(outTxtPath.toFile()), 0x7fffffff - 2), false)) {
      for (var v : array) {
        fout3.println(v);
      }
      fout3.flush();
    }
    System.err.println("text output done");
    var outBinPath = dir.resolve(Path.of(prefix + ".bin"));
    System.err.println("bin output...");
    try (var fout2 = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(outBinPath.toFile()), 0x7fffffff - 2))) {
      for (var v : array) {
        fout2.writeDouble(v);
      }
    }
    System.err.println("bin output done");
    System.err.println("sort");
    Arrays.parallelSort(array);
    System.err.println("sort done");
    var outSortedBinPath = dir.resolve(Path.of(prefix + "-sorted.bin"));
    System.err.println("sorted bin output");
    try (var fout2 = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(outSortedBinPath.toFile()),
            0x7fffffff - 2))) {
      for (var v : array) {
        fout2.writeDouble(v);
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
    try (var fout1 = new PrintWriter(
        Files.newBufferedWriter(outConfigPath, StandardOpenOption.CREATE,
            StandardOpenOption.WRITE))) {
      var line1 = String.format("μ=log(%s), σ=%s", expMu, sigma);
      var line2 = String.format("min=%s, max=%s, mean=%s, median=%s, standard deviation=%s", min,
          max, mean, median, standardDeviation);
      System.out.println(line1);
      System.out.println(line2);
      fout1.println(line1);
      fout1.println(line2);
    }
    System.err.println("config output done");
    return ExitCode.OK;
  }

  @Command
  private int searchPrime() {
    var base = BigInteger.valueOf(107).pow(1000).multiply(BigInteger.TWO);
    var co = BigInteger.valueOf(10).pow(18);
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
    var n = BigInteger.valueOf(107).pow(1000).multiply(BigInteger.TEN.pow(18))
        .multiply(BigInteger.TWO);
    var i = n.add(BigInteger.valueOf(262));
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
      if (merit > max) {
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

  @Override
  public Integer call() throws Exception {
    return ExitCode.USAGE;
  }

}
