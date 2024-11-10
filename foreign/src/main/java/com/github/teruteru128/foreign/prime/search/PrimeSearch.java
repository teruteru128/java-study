package com.github.teruteru128.foreign.prime.search;

import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_str;
import static java.util.concurrent.ForkJoinPool.defaultForkJoinWorkerThreadFactory;

import com.github.teruteru128.foreign.converters.PathConverter;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
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

@Command(name = "search", description = {"うんち！"})
public class PrimeSearch implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(PrimeSearch.class);
  private static final Arena auto = Arena.ofAuto();
  private static final ThreadLocal<MemorySegment> threadCandidates = ThreadLocal.withInitial(() -> {
    var candidate = auto.allocate(__mpz_struct.layout()).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(candidate);
    return candidate;
  });
  @Parameters(arity = "1", converter = PathConverter.class, description = "even number (text) file")
  private Path evenNumberPath;
  @Parameters(arity = "1", converter = PathConverter.class, description = "large sieve object file.")
  private Path sievePath;
  @Option(names = "--from", description = "Specify the starting step.")
  private int fromIndex = 0;
  @Option(names = "--to", description = "Specify the starting step.")
  private int toIndex = Integer.MAX_VALUE;
  @Option(names = "--url")
  private String dbURL;

  public static BitSet loadLargeSieve2(Path path) throws IOException, ClassNotFoundException {
    long[] n;
    try (var ois = new ObjectInputStream(new ByteArrayInputStream(Files.readAllBytes(path)))) {
      ois.readInt();
      n = (long[]) ois.readObject();
    }
    return BitSet.valueOf(n);
  }

  public static LargeSieve loadLargeSieve(Path path) throws IOException, ClassNotFoundException {
    try (var ois = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(path)))) {
      return new LargeSieve(ois.readInt(), BitSet.valueOf((long[]) ois.readObject()));
    }
  }

  @Override
  public Integer call()
      throws IOException, ClassNotFoundException, InterruptedException, ExecutionException {
    var availableProcessors = Runtime.getRuntime().availableProcessors();
    var even = auto.allocate(__mpz_struct.layout()).reinterpret(auto, gmp_h::mpz_clear);
    {
      var evenStr = Files.readAllLines(evenNumberPath).getFirst();
      var str = auto.allocateFrom(evenStr);
      mpz_init_set_str(even, str, 10);
    }
    var largeSieve = getBitSet(sievePath);
    final var originalCardinality = largeSieve.cardinality();
    largeSieve.clear(0, fromIndex);
    largeSieve.clear(toIndex, Integer.MAX_VALUE);
    logger.info("start");
    final var cardinality = largeSieve.cardinality();
    logger.trace("Number of original prime number candidates: {}, diff: {}", originalCardinality,
        originalCardinality - cardinality);
    logger.debug("Number of prime number candidates: {}", cardinality);
    var list = new ArrayList<PrimeSearchTask2>(cardinality);
    var found = false;
    var threads = Math.max(1, availableProcessors - 1);
    var barrier = new CyclicBarrier(threads);
    var source = new SQLiteDataSource();
    source.setUrl(dbURL);
    final var threshold = cardinality / threads * threads;
    var i = 0;
    for (var step = largeSieve.nextSetBit(fromIndex); step >= 0;
        step = largeSieve.nextSetBit(step + 1), i++) {
      if (i < threshold) {
        list.add(new PrimeSearchTask2(even, step, barrier, null));
      } else {
        // 最後のタスクがbarrierでハングしないようにする
        list.add(new PrimeSearchTask2(even, step, null, null));
      }
    }
    try (var pool = new ForkJoinPool(threads, defaultForkJoinWorkerThreadFactory, null, true)) {
      var service = new ExecutorCompletionService<Result>(pool);
      var n = list.size();
      var futures = new ArrayList<Future<Result>>(n);
      try {
        list.forEach(sex -> futures.add(service.submit(sex)));
        for (int j = n; j > 0; j--) {
          try {
            var foundStep = service.take().get();
            var result = foundStep.result();
            if (result == 1 || result == 2) {
              found = true;
              logger.info("find prime: step {}", foundStep.step());
              break;
            }
          } catch (ExecutionException ignored) {
          }
        }
      } finally {
        futures.forEach(f -> f.cancel(true));
      }
    }
    if (found) {
      logger.info("find prime");
      return ExitCode.OK;
    } else {
      logger.error("prime not found");
      return ExitCode.SOFTWARE;
    }
  }

  private BitSet getBitSet(Path sievePath) throws IOException, ClassNotFoundException {
    var setA = loadLargeSieve2(sievePath);
    var setB = new BitSet(setA.length());
    setB.set(0, setA.length());
    setB.andNot(setA);
    return setB;
  }

  public record LargeSieve(int searchLength, BitSet sieve) {

  }

}
