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
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
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
  private Path path;
  @Parameters(arity = "1", converter = PathConverter.class, description = "large sieve object file.")
  private Path sieve;
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
    try (var pool = new ForkJoinPool(availableProcessors / 2, defaultForkJoinWorkerThreadFactory,
        null, true)) {
      var p = arena.allocate(__mpz_struct.layout());
      __gmpz_init_set_str(p, arena.allocateFrom(Files.readAllLines(path).getFirst()), 10);
      var largeSieve = getBitSet();
      logger.info("start");
      logger.debug("prime candidates: {}", largeSieve.cardinality());
      var step = largeSieve.nextSetBit(fromIndex);
      var list = new ArrayList<PrimeSearchTask2>(availableProcessors);
      boolean found = false;
      List<Future<Optional<Integer>>> futureList;
      Optional<Integer> foundStep;
      while (step >= 0) {
        while (step >= 0 && list.size() < availableProcessors) {
          list.add(new PrimeSearchTask2(p, step));
          step = largeSieve.nextSetBit(step + 1);
        }
        if(!list.isEmpty()) {
          futureList = pool.invokeAll(list);
          for (var optionalFuture : futureList) {
            foundStep = optionalFuture.get();
            if (foundStep.isPresent()) {
              found = true;
              logger.info("find prime: step {}", foundStep.get());
            }
          }
          list.clear();
          if (found) {
            break;
          }
        }
      }
      __gmpz_clear(p);
      if (found) {
        logger.info("find prime");
        return 0;
      } else {
        logger.error("prime not found");
        return 1;
      }
    } catch (ExecutionException e) {
      throw new RuntimeException(e);
    }
  }

  private BitSet getBitSet() throws IOException, ClassNotFoundException {
    var setA = loadLargeSieve(sieve);
    var setB = new BitSet(setA.length());
    setB.set(0, setA.length());
    setB.andNot(setA);
    return setB;
  }
}
