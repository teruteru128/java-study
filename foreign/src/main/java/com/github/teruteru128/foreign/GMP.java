package com.github.teruteru128.foreign;

import static com.github.teruteru.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru.gmp.gmp_h.mpz_clear;
import static com.github.teruteru.gmp.gmp_h.mpz_init2;
import static com.github.teruteru.gmp.gmp_h.mpz_init_set_str;
import static com.github.teruteru.gmp.gmp_h.mpz_probab_prime_p;
import static java.util.concurrent.ForkJoinPool.defaultForkJoinWorkerThreadFactory;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru128.foreign.converters.PathConverter;
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
import java.util.concurrent.ForkJoinPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "gmp", description = {"うんち！"})
public class GMP implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(GMP.class);
  private static final Arena auto = Arena.ofAuto();
  private static final ThreadLocal<MemorySegment> threadCandidate = ThreadLocal.withInitial(() -> {
    var candidate = auto.allocate(__mpz_struct.layout()).reinterpret(auto, x0 -> {
      logger.trace("Candidate have been released: {}", x0.address());
      mpz_clear(x0);
    });
    mpz_init2(candidate, 1048576);
    logger.trace("candidate storage have been initialized");
    return candidate;
  });
  private final Arena arena = Arena.ofAuto();
  @Parameters(arity = "1", converter = PathConverter.class, description = "even number (text) file")
  private Path evenNumberPath;
  @Parameters(arity = "1", converter = PathConverter.class, description = "large sieve object file.")
  private Path sievePath;
  @Option(names = "--from", description = "Specify the starting step.")
  private int fromIndex = 0;

  static BitSet loadLargeSieve(Path path) throws IOException, ClassNotFoundException {
    long[] n;
    try (var ois = new ObjectInputStream(new ByteArrayInputStream(Files.readAllBytes(path)))) {
      ois.readInt();
      n = (long[]) ois.readObject();
    }
    return BitSet.valueOf(n);
  }

  @Override
  public Integer call() throws IOException, ClassNotFoundException, InterruptedException {
    var availableProcessors = Runtime.getRuntime().availableProcessors();
    var p = arena.allocate(__mpz_struct.layout());
    {
      var evenStr = Files.readAllLines(evenNumberPath).getFirst();
      var str = arena.allocateFrom(evenStr);
      mpz_init_set_str(p, str, 10);
    }
    var largeSieve = getBitSet(sievePath);
    if (fromIndex != 0) {
      largeSieve.clear(0, fromIndex - 1);
    }
    logger.info("start");
    logger.debug("Number of prime number candidates: {}", largeSieve.cardinality());
    var list = new ArrayList<PrimeSearchTask2>(availableProcessors);
    boolean found = false;
    var threads = availableProcessors / 2;
    var barrier = new CyclicBarrier(threads);
    /* スレッド数はシステムプロパティ`java.util.concurrent.ForkJoinPool.common.parallelism`
     * で調整してクレメンス */
    /*
    var optionalStep = largeSieve.stream().parallel().asLongStream().filter(step -> {
      var candidate = threadCandidate.get();
      mpz_add_ui(candidate, p, step * 2 + 1);
      int result;
      long start;
      long finish;
      logger.debug("current step: {}", step);
      start = System.nanoTime();
      result = mpz_probab_prime_p(candidate, 25);
      finish = System.nanoTime();
      logger.info("step {}: {}({} hours)", step, result, (finish - start) / 3.6e12);
      return result != 0;
    }).findAny();
    mpz_clear(p);
    if (optionalStep.isPresent()) {
      logger.info("find prime: step {}", optionalStep.getAsLong());
      return ExitCode.OK;
    } else {
      logger.error("prime not found");
      return ExitCode.SOFTWARE;
    }
    */
    for (var step = largeSieve.nextSetBit(fromIndex); step >= 0;
        step = largeSieve.nextSetBit(step + 1)) {
      list.add(new PrimeSearchTask2(p, step, barrier));
    }
    try (var pool = new ForkJoinPool(threads, defaultForkJoinWorkerThreadFactory,
        null, true)) {
      if (!list.isEmpty()) {
        var futureList = pool.invokeAll(list);
        for (var optionalFuture : futureList) {
          var foundStep = optionalFuture.get();
          if (foundStep.isPresent()) {
            found = true;
            logger.info("find prime: step {}", foundStep.get());
          }
        }
      }
    } catch (ExecutionException e) {
      throw new RuntimeException(e);
    }
    mpz_clear(p);
    if (found) {
      logger.info("find prime");
      return ExitCode.OK;
    } else {
      logger.error("prime not found");
      return ExitCode.SOFTWARE;
    }
  }

  private BitSet getBitSet(Path sievePath) throws IOException, ClassNotFoundException {
    var setA = loadLargeSieve(sievePath);
    var setB = new BitSet(setA.length());
    setB.set(0, setA.length());
    setB.andNot(setA);
    return setB;
  }
}
