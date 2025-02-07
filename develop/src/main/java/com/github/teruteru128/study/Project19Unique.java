package com.github.teruteru128.study;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout.OfLong;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Parameters;

@Command
public class Project19Unique implements Callable<Integer> {

  private static final long NUM_OF_ELEMENTS = 0x200000000L;
  private static final Logger logger = LoggerFactory.getLogger(Project19Unique.class);
  private static final OfLong JAVA_LONG_WITH_BIG_ENDIAN = JAVA_LONG.withOrder(ByteOrder.BIG_ENDIAN);
  @Parameters
  private Path path0;
  @Parameters
  private Path path1;
  @Parameters
  private Path path2;
  @Parameters
  private Path path3;

  @Override
  public Integer call() throws Exception {
    var auto = Arena.ofAuto();
    var outSegment = auto.allocate(JAVA_LONG, NUM_OF_ELEMENTS);
    var outOffset = 0L;
    outOffset = readPrimes(path0, auto, outSegment, outOffset);
    outOffset = readPrimes(path1, auto, outSegment, outOffset);
    outOffset = readPrimes(path2, auto, outSegment, outOffset);
    outOffset = readPrimes(path3, auto, outSegment, outOffset);
    logger.info("load done: {} bytes, {} elements", outOffset, outOffset / 8);
    long previous_prime = 0;
    for (long i = 0; i < NUM_OF_ELEMENTS; i++) {
      var prime = outSegment.getAtIndex(JAVA_LONG_WITH_BIG_ENDIAN, i);
      if (previous_prime == prime) {
        System.out.printf("%d: %s%n", i, Long.toUnsignedString(prime));
      }
      previous_prime = prime;
    }
    return ExitCode.OK;
  }

  private long readPrimes(Path path1, Arena auto, MemorySegment outSegment, long outOffset)
      throws IOException {
    long size;
    try (var channel = (FileChannel) Files.newByteChannel(path1, StandardOpenOption.READ)) {
      size = channel.size();
      logger.info("load, size: {}, offset: {}", size, outOffset);
      var mapped = channel.map(MapMode.READ_ONLY, 0, size, auto);
      MemorySegment.copy(mapped, 0, outSegment, outOffset, size);
    }
    return outOffset + size;
  }
}
