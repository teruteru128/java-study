package com.github.teruteru128.foreign;

import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_probab_prime_p;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.foreign.converters.PathConverter;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlite.SQLiteDataSource;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "gmp", description = {"うんち！"})
public class GMP implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(GMP.class);
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
    largeSieve.clear(0, fromIndex);
    largeSieve.clear(toIndex, Integer.MAX_VALUE);
    logger.info("start");
    final var cardinality = largeSieve.cardinality();
    logger.debug("Number of prime number candidates: {}", cardinality);
    var list = new ArrayList<PrimeSearchTask2>(cardinality);
    boolean found = false;
    var threads = Math.max(1, availableProcessors - 1);
    var barrier = new CyclicBarrier(threads);
    var source = new SQLiteDataSource();
    source.setUrl(dbURL);
    /*
     * Stream版
     * スレッド数はシステムプロパティ`java.util.concurrent.ForkJoinPool.common.parallelism`
     * で調整してクレメンス */
    var optionalResult = largeSieve.stream().parallel().asLongStream().mapToObj(step -> {
      var candidate = threadCandidates.get();
      mpz_add_ui(candidate, even, step * 2 + 1);
      int result;
      long start;
      long finish;
      logger.debug("current step: {}", step);
      start = System.nanoTime();
      result = mpz_probab_prime_p(candidate, 25);
      finish = System.nanoTime();
      logger.info("step {}: {}({} hours)", step, result, (finish - start) / 3.6e12);
      return new Result(step, result);
    }).filter(r -> r.result != 0).findAny();
    if (optionalResult.isPresent()) {
      logger.info("find prime: step {}", optionalResult.get().step());
      return ExitCode.OK;
    } else {
      logger.error("prime not found");
      return ExitCode.SOFTWARE;
    }
    /*final var s = cardinality / threads * threads;
    var i = 0;
    for (var step = largeSieve.nextSetBit(fromIndex); step >= 0;
        step = largeSieve.nextSetBit(step + 1), i++) {
      if (i < s) {
        list.add(new PrimeSearchTask2(even, step, barrier, null));
      } else {
        // 最後のタスクがbarrierでハングしないようにする
        list.add(new PrimeSearchTask2(even, step, null, null));
      }
    }
    try (var pool = new ForkJoinPool(threads, defaultForkJoinWorkerThreadFactory, null, true)) {
      if (list.isEmpty()) {
        return ExitCode.SOFTWARE;
      }
      for (var optionalFuture : pool.invokeAll(list)) {
        var foundStep = optionalFuture.get();
        if (foundStep.isPresent()) {
          found = true;
          logger.info("find prime: step {}", foundStep.get());
        }
      }
    }
    if (found) {
      logger.info("find prime");
      return ExitCode.OK;
    } else {
      logger.error("prime not found");
      return ExitCode.SOFTWARE;
    }*/
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

  record Result(long step, int result) {

  }
}
