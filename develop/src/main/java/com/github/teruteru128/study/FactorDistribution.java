package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul;
import static com.github.teruteru128.gmp.gmp_h.mpz_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.ValueLayout.OfLong;
import java.net.URI;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.random.RandomGenerator;
import javax.net.ssl.HttpsURLConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "factor")
public class FactorDistribution implements Callable<Integer> {

  public static final OfLong JAVA_LONG_WITH_BIG_ENDIAN = ValueLayout.JAVA_LONG.withOrder(
      ByteOrder.BIG_ENDIAN);
  private static final Logger logger = LoggerFactory.getLogger(FactorDistribution.class);
  private static final Arena auto = Arena.ofAuto();
  private static final ThreadLocal<MemorySegment> N_THREAD_LOCAL = ThreadLocal.withInitial(() -> {
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(p, 1);
    return p;
  });
  private static final ThreadLocal<MemorySegment> PRIME_THREAD_LOCAL = ThreadLocal.withInitial(
      () -> {
        var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
        mpz_init_set_ui(p, 1);
        return p;
      });
  private final Object lock = new Object();
  @Option(names = {"--num", "-n"})
  private long num = 1000;
  @Parameters
  private Path in;
  @Option(names = {"--period", "-p"})
  private int period = 800;

  public FactorDistribution() {
  }

  @Override
  public Integer call() throws IOException, InterruptedException {
    List<Path> paths;
    try (var lines = Files.lines(in)) {
      paths = lines.filter(l -> !l.startsWith("#")).map(Path::of).toList();
    }
    logger.info("primes file loaded");
    long[] sizeArray = new long[paths.size()];
    long sumOfSize = 0L;
    // TODO 素数リソースを分離して依存性注入可能にする
    for (int i = 0, pathsSize = paths.size(); i < pathsSize; i++) {
      var path = paths.get(i);
      sizeArray[i] = path.getFileSystem().provider()
          .getFileAttributeView(path, BasicFileAttributeView.class).readAttributes().size();
      sumOfSize += sizeArray[i];
    }
    var primes = auto.allocate(sumOfSize, 8);
    long offsetOfPrimes = 0L;
    for (int i = 0, pathsSize = paths.size(); i < pathsSize; i++) {
      var path = paths.get(i);
      try (var channel = (FileChannel) Files.newByteChannel(path, StandardOpenOption.READ)) {
        var map = channel.map(MapMode.READ_ONLY, 0, sizeArray[i], auto);
        MemorySegment.copy(map, 0, primes, offsetOfPrimes, sizeArray[i]);
        offsetOfPrimes += sizeArray[i];
      }
    }
    var randomGenerator = RandomGenerator.of("SecureRandom");
    var numOfElements = sumOfSize / 8L;
    logger.info("{} primes loaded", numOfElements);
    var counter = new AtomicLong();
    try (var schedule = new ScheduledThreadPoolExecutor(1)) {
      var scheduledFuture = schedule.scheduleAtFixedRate(() -> {
        var q = counter.getAcquire();
        if (q >= num) {
          synchronized (lock) {
            lock.notify();
          }
          return;
        }
        counter.setRelease(q + 1);
        var n = N_THREAD_LOCAL.get();
        var prime = PRIME_THREAD_LOCAL.get();
        for (int j = 0; j < 4; j++) {
          mpz_set_u64(prime, primes.getAtIndex(JAVA_LONG_WITH_BIG_ENDIAN,
              randomGenerator.nextLong(numOfElements)));
          mpz_mul(n, n, prime);
        }
        var bufferSize = mpz_sizeinbase(n, 10) + 2;
        var strBuffer = auto.allocate(bufferSize, 1);
        mpz_get_str(strBuffer, 10, n);
        mpz_set_ui(n, 1);
        var composite = strBuffer.getString(0);
        try {
          var uri = URI.create(Factory.ENDPOINT + composite);
          var url = uri.toURL();
          var connection = (HttpsURLConnection) url.openConnection();
          connection.connect();
          logger.info("{}, {}", connection.getResponseCode(), composite);
        } catch (IOException e) {
          throw new UncheckedIOException("error in " + composite, e);
        }
      }, 0, period, TimeUnit.MILLISECONDS);
      synchronized (lock) {
        while (counter.getAcquire() < num) {
          lock.wait();
        }
      }
      scheduledFuture.cancel(false);
    }
    return ExitCode.OK;
  }
}
