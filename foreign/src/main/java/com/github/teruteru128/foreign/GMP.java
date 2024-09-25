package com.github.teruteru128.foreign;

import static com.github.teruteru.gmp.gmp_h.*;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru.gmp.gmp_h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.BitSet;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "gmp", description = {"うんち！"})
public class GMP implements Callable<Integer> {

  private final Arena arena = Arena.ofConfined();

  @Parameters(arity = "1", converter = PathConverter.class)
  private Path path;
  @Option(names = {"--from"})
  private int fromIndex = 0;

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
    var setA = loadLargeSieve(Path.of(
        "../develop/largesieve-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd-3355392bit-5.obj"));
    long step = -1;
    long start;
    long finish;
    int checkResult;
    for (int i = setA.nextClearBit(fromIndex); i >= 0; i = setA.nextSetBit(i + 1)) {
      System.err.println("current step : " + i);
      __gmpz_add_ui(q, p, i * 2L + 1);
      start = System.nanoTime();
      checkResult = __gmpz_probab_prime_p(q, 1);
      finish = System.nanoTime();
      System.err.printf("step %d: %d(%f hours)%n", i, checkResult, (finish - start) / 3.6e12);
      if (checkResult == 2 || checkResult == 1) {
        step = i;
        break;
      }
    }
    __gmpz_clears.makeInvoker(ADDRESS, ADDRESS).apply(p, q, NULL);
    if (step != -1) {
      System.err.println("find prime, step is " + step);
      return 0;
    } else {
      System.err.println("not found");
      return 1;
    }
  }
}
