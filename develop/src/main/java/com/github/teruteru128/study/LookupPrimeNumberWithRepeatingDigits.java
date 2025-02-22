package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Parameters;

/**
 * Lookup prime numbers with repeating digits
 */
public class LookupPrimeNumberWithRepeatingDigits implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(
      LookupPrimeNumberWithRepeatingDigits.class);

  @Parameters
  private Path in;

  @Override
  public Integer call() throws IOException {
    List<Path> files;
    try (var lines = Files.lines(in)) {
      files = lines.map(Path::of).toList();
    }
    files.forEach(f -> logger.info("input file: {}", f));
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(n, 114514);
    var javaLongBigEndian = JAVA_LONG.withOrder(ByteOrder.BIG_ENDIAN);
    var str = auto.allocate(32);
    var pattern = Pattern.compile(".*(\\d)\\1{11,}.*");
    var work = auto.allocate(1L << 34, 8);
    for (var file : files) {
      try (var channel = (FileChannel) Files.newByteChannel(file, StandardOpenOption.READ,
          StandardOpenOption.WRITE)) {
        var map = channel.map(MapMode.READ_ONLY, 0, 1L << 34, auto);
        MemorySegment.copy(map, 0, work, 0, 1L << 34);
      }
      logger.info("start: {}", file);
      /*work.elements(javaLongBigEndian).parallel()
          .map(m -> Long.toUnsignedString(m.getAtIndex(javaLongBigEndian, 0)))
          .filter(l -> pattern.matcher(l).matches()).forEach(System.out::println);*/
      for (long i = 0; i < 0x80000000L; i++) {
        Factory.mpz_set_u64(n, work.getAtIndex(javaLongBigEndian, i));
        mpz_get_str(str, 10, n);
        var matcher = pattern.matcher(str.getString(0));
        if (matcher.matches()) {
          System.out.println(matcher.group());
        }
      }
    }
    return ExitCode.OK;
  }

}
