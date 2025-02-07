package com.github.teruteru128.study;

import static com.github.teruteru128.foreign.opencl.opencl_h_1.qsort_s;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru128.foreign.opencl._CoreCrtSecureSearchSortCompareFunction;
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

@Command(name = "project19sort")
public class Project19Sort implements Callable<Integer> {

  public static final OfLong JAVA_LONG_WITH_BIG_ENDIAN = JAVA_LONG.withOrder(ByteOrder.BIG_ENDIAN);
  private static final Logger logger = LoggerFactory.getLogger(Project19Sort.class);
  @Parameters
  private Path path0;
  @Parameters
  private Path path1;
  @Parameters
  private Path path2;
  @Parameters
  private Path path3;
  @Parameters
  private Path pathOut0;
  @Parameters
  private Path pathOut1;
  @Parameters
  private Path pathOut2;
  @Parameters
  private Path pathOut3;

  @Override
  public Integer call() throws Exception {
    var auto = Arena.ofAuto();
    var numOfElements = 0x200000000L;
    var outSegment = auto.allocate(JAVA_LONG, numOfElements);
    var outOffset = 0L;
    outOffset = readPrimes(path0, auto, outSegment, outOffset);
    outOffset = readPrimes(path1, auto, outSegment, outOffset);
    outOffset = readPrimes(path2, auto, outSegment, outOffset);
    outOffset = readPrimes(path3, auto, outSegment, outOffset);
    logger.info("load done: {} bytes, {} elements", outOffset, outOffset / 8);
    Runtime.getRuntime().gc();
    logger.trace("garbage collect done");
    qsort_s(outSegment, numOfElements, 8, _CoreCrtSecureSearchSortCompareFunction.allocate(
        (_, b, c) -> Long.compareUnsigned(b.getAtIndex(JAVA_LONG_WITH_BIG_ENDIAN, 0),
            c.getAtIndex(JAVA_LONG_WITH_BIG_ENDIAN, 0)), auto), MemorySegment.NULL);
    logger.info("sort done");
    long outOffset1 = 0;
    outOffset1 = writePrimes(pathOut0, auto, outSegment, outOffset1);
    outOffset1 = writePrimes(pathOut1, auto, outSegment, outOffset1);
    outOffset1 = writePrimes(pathOut2, auto, outSegment, outOffset1);
    outOffset1 = writePrimes(pathOut3, auto, outSegment, outOffset1);
    logger.info("write done: {} bytes, {} elements", outOffset1, outOffset1 / 8);
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

  private long writePrimes(Path pathOut0, Arena auto, MemorySegment outSegment, long outOffset)
      throws IOException {
    try (var channel = (FileChannel) Files.newByteChannel(pathOut0, StandardOpenOption.CREATE,
        StandardOpenOption.READ, StandardOpenOption.WRITE)) {
      var size = 0x80000000L * 8;
      var mapped = channel.map(MapMode.READ_WRITE, 0, size, auto);
      MemorySegment.copy(outSegment, outOffset, mapped, 0, size);
      outOffset += size;
    }
    return outOffset;
  }
}
