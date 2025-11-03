package com.github.teruteru128.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

class ZGrepFileVisitor extends SimpleFileVisitor<Path> {

  private final Pattern pattern;

  public ZGrepFileVisitor(Pattern pattern) {
    this.pattern = pattern;
  }

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    var fileName = file.getFileName().toString();
    if (fileName.endsWith(".gz")) {
      try (var s = new BufferedReader(new InputStreamReader(
          new GZIPInputStream(Files.newInputStream(file, StandardOpenOption.READ)),
          StandardCharsets.UTF_8))) {
        s.lines().filter(l -> pattern.matcher(l).find()).forEach(System.out::println);
      } catch (UncheckedIOException e) {
        System.err.println("ERROR: " + file);
        return FileVisitResult.CONTINUE;
      }
    }
    return FileVisitResult.CONTINUE;
  }
}
