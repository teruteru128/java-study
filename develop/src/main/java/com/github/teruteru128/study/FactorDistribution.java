package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.ValueLayout.OfLong;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.random.RandomGenerator;
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
  @Option(names = {"--offset"})
  private long offset;
  @Parameters
  private Path in;
  @Option(names = {"--period", "-p"})
  private int period = 800;

  public FactorDistribution() {
  }

  @Override
  public Integer call() throws IOException, InterruptedException {
    ArrayList<Path> paths;
    try (var lines = Files.lines(in, StandardCharsets.UTF_8)) {
      paths = ((ArrayList<Path>) lines.filter(l -> !l.startsWith("#")).map(Path::of).toList());
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
    var randomGenerator = RandomGenerator.of("SecureRandom");
    var numOfElements = sumOfSize / 8L;
    for (int i = 0; i < 5; i++) {
      var index = randomGenerator.nextLong(numOfElements);
      int fileNumber = 0;
    }
    return ExitCode.OK;
  }
}
