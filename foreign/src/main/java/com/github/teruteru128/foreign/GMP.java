package com.github.teruteru128.foreign;

import static com.github.teruteru.gmp.gmp_h.__gmpz_clears;
import static com.github.teruteru.gmp.gmp_h.__gmpz_set_str;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.util.concurrent.ForkJoinPool.defaultForkJoinWorkerThreadFactory;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru.gmp.gmp_h;
import com.github.teruteru.gmp.gmp_h.__gmpz_inits;
import com.github.teruteru128.foreign.converters.PathConverter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
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
    try (var pool = new ForkJoinPool(8, defaultForkJoinWorkerThreadFactory, null, true)) {
      var layout = MemoryLayout.sequenceLayout(2, __mpz_struct.layout());
      var p = arena.allocate(layout);
      // 配列の2番目の要素のメモリーセグメントを取得する方法がわからない
      // var q = &p[1];
      var q = p.asSlice(__mpz_struct.sizeof(), __mpz_struct.sizeof());
      __gmpz_inits.makeInvoker(ADDRESS, ADDRESS).apply(p, q, NULL);
      __gmpz_set_str(p, arena.allocateFrom(Files.readAllLines(path).getFirst()), 10);
      BitSet setB;
      {
        var setA = loadLargeSieve(sieve);
        setB = new BitSet(setA.length());
        setB.set(0, setA.length());
        setB.andNot(setA);
      }
      logger.info("start");
      int i = setB.nextSetBit(fromIndex);
      var list = new ArrayList<PrimeSearchTask2>(16);
      boolean found = false;
      while (i >= 0) {
        while (i >= 0 && list.size() < 16) {
          list.add(new PrimeSearchTask2(p, i));
          i = setB.nextSetBit(i + 1);
        }
        var a = pool.invokeAll(list);
        for (var b : a) {
          var c = b.get();
          if (c.isPresent()) {
            found = true;
            logger.info("find prime: step {}", c.get());
          }
        }
        list.clear();
        if (found) {
          break;
        }
      }
      __gmpz_clears.makeInvoker(ADDRESS, ADDRESS).apply(p, q, NULL);
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
}
