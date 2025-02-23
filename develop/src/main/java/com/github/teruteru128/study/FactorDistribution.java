package com.github.teruteru128.study;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.ValueLayout.OfLong;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
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
  private final Object lock = new Object();
  @Option(names = {"--num", "-n"})
  private int num = 1000;
  @Parameters
  private Path in;

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
    for (int i = 0, pathsSize = paths.size(); i < pathsSize; i++) {
      var path = paths.get(i);
      sizeArray[i] = path.getFileSystem().provider()
          .getFileAttributeView(path, BasicFileAttributeView.class).readAttributes().size();
      sumOfSize += sizeArray[i];
    }
    var auto = Arena.ofAuto();
    var a = auto.allocate(sumOfSize, 8);
    long offsetOfA = 0L;
    for (int i = 0, pathsSize = paths.size(); i < pathsSize; i++) {
      var path = paths.get(i);
      try (var channel = (FileChannel) Files.newByteChannel(path, StandardOpenOption.READ)) {
        var map = channel.map(MapMode.READ_ONLY, 0, sizeArray[i], auto);
        MemorySegment.copy(map, 0, a, offsetOfA, sizeArray[i]);
        offsetOfA += sizeArray[i];
      }
    }
    logger.info("primes loaded");
    var prime = __mpz_struct.allocate(auto);
    gmp_h.mpz_init_set_ui(prime, 114514);
    var p = __mpz_struct.allocate(auto);
    gmp_h.mpz_init_set_ui(p, 1);
    var randomGenerator = RandomGenerator.of("SecureRandom");
    var numOfElements = sumOfSize / 8L;
    var counter = new AtomicLong();
    try (var schedule = Executors.newScheduledThreadPool(1)) {
      schedule.scheduleAtFixedRate(() -> {
        var q = counter.getAcquire();
        if (q >= num) {
          synchronized (lock) {
            lock.notify();
          }
          return;
        }
        counter.setRelease(q + 1);
        for (int j = 0; j < 5; j++) {
          gmp_h.mpz_mul(p, p, Factory.mpz_set_u64(prime,
              a.getAtIndex(JAVA_LONG_WITH_BIG_ENDIAN, randomGenerator.nextLong(numOfElements))));
        }
        var bufferSize = gmp_h.mpz_sizeinbase(p, 10) + 2;
        var strBuffer = auto.allocate(bufferSize, 1);
        gmp_h.mpz_get_str(strBuffer, 10, p);
        gmp_h.mpz_set_ui(p, 1);
        var composite = strBuffer.getString(0);
        URL url;
        try {
          url = URI.create(Factory.ENDPOINT + composite).toURL();
        } catch (MalformedURLException e) {
          throw new RuntimeException(e);
        }
        HttpsURLConnection con;
        try {
          con = (HttpsURLConnection) url.openConnection();
          con.connect();
          logger.info("{}, {}", con.getResponseCode(), composite);
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      }, 0, 15, TimeUnit.SECONDS);
      synchronized (lock) {
        while (counter.getAcquire() < num) {
          lock.wait();
        }
      }
    }
    return ExitCode.OK;
  }
}
