package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul;
import static com.github.teruteru128.gmp.gmp_h.mpz_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.study.Layouts.JAVA_LONG_WITH_BIG_ENDIAN;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import javax.net.ssl.HttpsURLConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

/**
 * TODO 3段式の Producer-Consumer Patternにしてタスクの生成-実行-ロギングを全部分割する
 * @see <a href="https://www.hyuki.com/dp/dpinfo.html#ProducerConsumer">Producer-Consumerパターン - デザインパターンの紹介</a>
 */
@Command(name = "factor")
public class FactorDistribution implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(FactorDistribution.class);
  @Option(names = {"--num", "-n"})
  private long num = 300000;
  @Parameters
  private Path in;
  @Option(names = {"--factors", "-f"}, description = {"Specifies the number of factors."})
  private int factors = 5;

  public FactorDistribution() {
  }

  private static long getPrime(ArrayList<Path> paths, int file, long number) throws IOException {
    long prime;
    try (var f = new RandomAccessFile(paths.get(file).toFile(), "r")) {
      f.seek(number * 8);
      prime = f.readLong();
    }
    return prime;
  }

  @Override
  public Integer call() throws IOException, InterruptedException {
    var taskQueue = new LinkedBlockingQueue<String>(4);
    var resultQueue = new LinkedBlockingQueue<Result>();
    var random = RandomGenerator.of("L64X128MixRandom");
    ArrayList<Path> paths;
    try (var lines = Files.lines(in, StandardCharsets.UTF_8)) {
      paths = lines.map(String::trim).filter(l -> !l.startsWith("#")).map(Path::of)
          .collect(Collectors.toCollection(ArrayList<Path>::new));
    }
    var auto = Arena.ofAuto();
    var array = auto.allocate(JAVA_LONG_WITH_BIG_ENDIAN, 1L << 33);
    logger.info("allocated");
    for (int i = 0, pathsSize = paths.size(); i < pathsSize; i++) {
      Path path = paths.get(i);
      try (var channel = (FileChannel) Files.newByteChannel(path)) {
        for (int j = 0; j < 8; j++) {
          var map = channel.map(MapMode.READ_ONLY, 2147483648L * j, 2147483648L, auto);
          MemorySegment.copy(map, 0, array, (i * 8L + j) * 2147483648L, 2147483648L);
        }
      }
      logger.info("loaded {}", path.getFileName());
    }
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    final long max = num;
    final int fac = factors;
    for (long i = 0; i < max; i++) {
      mpz_set_ui(n, 1);
      for (int j = 0; j < fac; j++) {
        // 10^18*sqrt(10)未満の個数
        // 2063687771
        long index = random.nextBoolean() ? random.nextInt(2063687771)
            : random.nextLong(2063687771, 8589934592L);
//        var file = (index >> 31) & 0x03;
//        var number = index & 0x7fffffffL;
//        long prime = getPrime(paths, (int) file, number);
        long prime = array.getAtIndex(JAVA_LONG_WITH_BIG_ENDIAN, index);
        mpz_set_u64(p, prime);
        mpz_mul(n, n, p);
      }
      var length = mpz_sizeinbase(n, 10) + 2;
      var str = auto.allocate(length);
      mpz_get_str(str, 10, n);
      var unsignedString = str.getString(0);
      var url = URI.create(Factory.ENDPOINT + unsignedString).toURL();
      HttpsURLConnection urlConnection;
      int responseCode;
      do {
        urlConnection = (HttpsURLConnection) url.openConnection();
        urlConnection.setRequestProperty("Cookie", "fdbuser=410c610cccf69f308fd32aba309579a3");
        responseCode = urlConnection.getResponseCode();
        if (responseCode != 200) {
          logger.warn("{} {}: {}", responseCode, urlConnection.getResponseMessage(),
              unsignedString);
          if (responseCode == 429) {
            Thread.sleep(1000 * 60 * 5);
          }
        }
      } while (responseCode != 200);
      JsonNode root;
      try (var in = urlConnection.getInputStream()) {
        root = Factory.OBJECT_MAPPER.readTree(in);
      }
      var id = root.get("id");
      var status = root.get("status");
      var o = id.isTextual() ? id.textValue() : Long.toString(id.longValue());
      logger.info("{}<{}>: {}", o, unsignedString.length(), status.textValue());
    }
    return ExitCode.OK;
  }

  private interface PrimeAccess {

    long getPrime(long primeId);
  }

  private static class PrimeAccessFactory {

    public static PrimeAccess getInstance() {
      return null;
    }
  }

  private static class MemoryBufferedPrimeAccess implements PrimeAccess {

    MemoryBufferedPrimeAccess(List<Path> paths) {
    }

    @Override
    public long getPrime(long primeId) {
      return 0;
    }
  }

  private static class ReadFileEachTimePrimeAccess implements PrimeAccess {

    public ReadFileEachTimePrimeAccess(List<Path> paths) {
    }

    @Override
    public long getPrime(long primeId) {
      return 0;
    }
  }

  private static class Producer implements Runnable {

    public Producer(BlockingQueue<String> taskQueue, PrimeAccess primeSource) {
    }

    @Override
    public void run() {

    }
  }

  private static class Processor implements Runnable {

    public Processor(BlockingQueue<Result> results, BlockingQueue<String> tasks) {
    }

    @Override
    public void run() {

    }
  }

  private static class Consumer implements Runnable {

    public Consumer(BlockingQueue<Result> results) {
    }

    @Override
    public void run() {

    }
  }

  private record Result(String id, String status) {

  }
}
