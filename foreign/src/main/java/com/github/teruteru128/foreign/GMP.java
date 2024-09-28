package com.github.teruteru128.foreign;

import static com.github.teruteru.gmp.gmp_h.__gmpz_add_ui;
import static com.github.teruteru.gmp.gmp_h.__gmpz_clears;
import static com.github.teruteru.gmp.gmp_h.__gmpz_get_str;
import static com.github.teruteru.gmp.gmp_h.__gmpz_inits;
import static com.github.teruteru.gmp.gmp_h.__gmpz_probab_prime_p;
import static com.github.teruteru.gmp.gmp_h.__gmpz_set_str;
import static com.github.teruteru.gmp.gmp_h.__gmpz_sizeinbase;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru128.foreign.converters.PathConverter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "gmp", description = {"うんち！"})
public class GMP implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(GMP.class);
  private final Arena arena = Arena.ofConfined();

  @Parameters(arity = "1", converter = PathConverter.class, description = "even number (text) file")
  private Path path;
  @Parameters(arity = "1", converter = PathConverter.class, description = "large sieve object file.")
  private Path sieve;
  @Option(names = "--from", description = "Specify the starting step.")
  private int fromIndex = 0;
  @Parameters(arity = "1", converter = PathConverter.class)
  private Path outPath = null;

  static BitSet loadLargeSieve(Path path) throws IOException, ClassNotFoundException {
    long[] n = null;
    try (var ois = new ObjectInputStream(new ByteArrayInputStream(Files.readAllBytes(path)))) {
      ois.readInt();
      n = (long[]) ois.readObject();
    }
    return BitSet.valueOf(n);
  }

  @Override
  public Integer call() throws Exception {
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
    long step = -1;
    long start;
    long finish;
    int checkResult;
    logger.info("start");
    for (int i = setB.nextSetBit(fromIndex); i >= 0; i = setB.nextSetBit(i + 1)) {
      logger.debug("current step : {}", i);
      __gmpz_add_ui(q, p, i * 2L + 1);
      start = System.nanoTime();
      checkResult = __gmpz_probab_prime_p(q, 100);
      finish = System.nanoTime();
      logger.info("step {}: {}({} hours)", i, checkResult, (finish - start) / 3.6e12);
      if (checkResult == 2 || checkResult == 1) {
        step = i;
        var qLength = __gmpz_sizeinbase(q, 10) + 2;
        var segment = arena.allocate(qLength, 1);
        __gmpz_get_str(segment, 10, q);
        if (outPath != null) {
          Files.write(outPath, List.of(segment.getString(0)), StandardOpenOption.CREATE,
              StandardOpenOption.WRITE);
        } else {
          System.out.println(segment.getString(0));
        }
        break;
      }
    }
    __gmpz_clears.makeInvoker(ADDRESS, ADDRESS).apply(p, q, NULL);
    if (step != -1) {
      logger.info("find prime, step is {}", step);
      return 0;
    } else {
      logger.error("prime not found");
      return 1;
    }
  }
}
