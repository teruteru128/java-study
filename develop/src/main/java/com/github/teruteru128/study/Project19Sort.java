package com.github.teruteru128.study;

import static com.github.teruteru128.foreign.opencl.opencl_h_1.qsort;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru128.foreign.opencl._CoreCrtNonSecureSearchSortCompareFunction;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
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

  private static final Logger logger = LoggerFactory.getLogger(Project19Sort.class);
  @Parameters
  private Path path0;
  @Parameters
  private Path path1;
  @Parameters
  private Path pathOut0;
  @Parameters
  private Path pathOut1;

  @Override
  public Integer call() throws Exception {
    var auto = Arena.ofAuto();
    var numOfElements = 0x100000000L;
    var outSegment = auto.allocate(JAVA_LONG, numOfElements);
    logger.info("outSegment allocate done");
    var outOffset = 0L;
    try (var channel = (FileChannel) Files.newByteChannel(path0, StandardOpenOption.READ)) {
      var size = channel.size();
      var mapped = channel.map(MapMode.READ_ONLY, 0, size, auto);
      MemorySegment.copy(mapped, 0, outSegment, outOffset, size);
      outOffset += size;
    }
    logger.info("load 1 done");
    try (var channel = (FileChannel) Files.newByteChannel(path1, StandardOpenOption.READ)) {
      var size = channel.size();
      var mapped = channel.map(MapMode.READ_ONLY, 0, size, auto);
      MemorySegment.copy(mapped, 0, outSegment, outOffset, size);
      outOffset += size;
    }
    logger.info("load done: {} bytes, {} elements", outOffset, outOffset / 8);
    Runtime.getRuntime().gc();
    logger.trace("garbage collect done");
    qsort(outSegment, numOfElements, 8, _CoreCrtNonSecureSearchSortCompareFunction.allocate(
        (a, b) -> Long.compareUnsigned(a.getAtIndex(JAVA_LONG, 0), b.getAtIndex(JAVA_LONG, 0)),
        auto));
    logger.info("sort done");
    outOffset = 0;
    try (var channel = (FileChannel) Files.newByteChannel(pathOut0, StandardOpenOption.CREATE,
        StandardOpenOption.READ, StandardOpenOption.WRITE)) {
      var size = 0x80000000L * 8;
      var mapped = channel.map(MapMode.READ_WRITE, 0, size, auto);
      MemorySegment.copy(outSegment, outOffset, mapped, 0, size);
      outOffset += size;
    }
    try (var channel = (FileChannel) Files.newByteChannel(pathOut1, StandardOpenOption.CREATE,
        StandardOpenOption.READ, StandardOpenOption.WRITE)) {
      var size = 0x80000000L * 8;
      var mapped = channel.map(MapMode.READ_WRITE, 0, size, auto);
      MemorySegment.copy(outSegment, outOffset, mapped, 0, size);
    }
    logger.info("done");
    return ExitCode.OK;
  }
}
