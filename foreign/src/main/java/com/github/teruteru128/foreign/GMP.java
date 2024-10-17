package com.github.teruteru128.foreign;

import static com.github.teruteru.gmp.gmp_h.__gmpz_clear;
import static com.github.teruteru.gmp.gmp_h.__gmpz_init_set_str;
import static java.util.concurrent.ForkJoinPool.defaultForkJoinWorkerThreadFactory;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru128.foreign.converters.PathConverter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.foreign.Arena;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "gmp", description = {"うんち！"})
public class GMP implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(GMP.class);
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
    __gmpz_init_set_str(p,
        arena.allocateFrom(Files.readAllLines(evenNumberPath).getFirst(), StandardCharsets.UTF_8),
        10);
    var largeSieve = getBitSet(sievePath);
    if (fromIndex != 0) {
      largeSieve.set(0, fromIndex - 1, false);
    }
    logger.info("start");
    logger.debug("Number of prime number candidates: {}", largeSieve.cardinality());
    var list = new ArrayList<PrimeSearchTask2>(availableProcessors);
    boolean found = false;
    var threads = availableProcessors / 2;
    for (var step = largeSieve.nextSetBit(fromIndex); step >= 0;
        step = largeSieve.nextSetBit(step + 1)) {
      list.add(new PrimeSearchTask2(p, step));
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
    __gmpz_clear(p);
    if (found) {
      logger.info("find prime");
      return 0;
    } else {
      logger.error("prime not found");
      return 1;
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
