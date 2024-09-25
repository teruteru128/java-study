package com.github.teruteru128.foreign;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru.gmp.gmp_h;
import java.lang.foreign.Arena;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "gmp", description = {"うんち！"})
public class GMP implements Callable<Integer> {

  private final Arena arena = Arena.ofConfined();

  @Parameters(arity = "1", converter = PathConverter.class)
  private Path path;

  @Override
  public Integer call() throws Exception {
    var layout = __mpz_struct.layout();
    var p = arena.allocate(layout);
    gmp_h.__gmpz_init(p);
    var first = Files.readAllLines(path).getFirst();
    int ret = gmp_h.__gmpz_set_str(p, arena.allocateFrom(first), 10);
    if (ret != 0) {
      throw new IllegalArgumentException("!");
    }
    System.out.println("size: " + gmp_h.__gmpz_sizeinbase(p, 2));
    gmp_h.__gmpz_add_ui(p, p, 3);
    long start = System.nanoTime();
    ret = gmp_h.__gmpz_probab_prime_p(p, 1);
    long finish = System.nanoTime();
    System.out.printf("prob: %d(%fdays)%n", ret, (finish - start) / 8.64e13);
    gmp_h.__gmpz_clear(p);
    return 0;
  }
}
