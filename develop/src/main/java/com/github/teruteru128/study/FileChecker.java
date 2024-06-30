package com.github.teruteru128.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

public class FileChecker {

  static void extracted(String arg, String targetOwnerName) throws IOException {
    var dirPath = Path.of(arg);
    var targetOwner = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(
        targetOwnerName);
    var checker = new FileOwnerChecker(targetOwner);
    System.err.printf("target path: %s%n", dirPath);
    System.err.printf("target owner: %s%n", targetOwner);
    Files.walkFileTree(dirPath, checker);
  }

  static void extracted(Path p, String patternArg) throws IOException {
    Files.walkFileTree(p, new ZGrepFileVisitor(Pattern.compile(patternArg)));
  }

  static void extracted(String arg) throws IOException {
    Files.walkFileTree(Path.of(arg), new FileCollisionFileVisitor());
  }

  static void extracted1(String arg) throws IOException {
    var path = Path.of(arg);
    var owner = Files.getOwner(path);
    System.out.println(owner);
    var service = path.getFileSystem().getUserPrincipalLookupService();
    var p = service.lookupPrincipalByName("DESKTOP-S2SMNNQ\\terut");
    var p2 = service.lookupPrincipalByGroupName("BUILTIN\\Administrators");
    var p3 = service.lookupPrincipalByName("DESKTOP-S2SMNNQ\\Administrator");
  }

  private static class FileOwnerChecker extends SimpleFileVisitor<Path> {

    private final UserPrincipal principal;

    public FileOwnerChecker(UserPrincipal principal) {
      this.principal = principal;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      var thatOwner = Files.getOwner(file);
      if (!thatOwner.equals(principal)) {
        System.out.printf("not match!: %s(%s)%n", file, thatOwner);
      }
      return super.visitFile(file, attrs);
    }
  }

  private static class ZGrepFileVisitor extends SimpleFileVisitor<Path> {

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

  private static class FileCollisionFileVisitor extends SimpleFileVisitor<Path> {

    private static final Pattern jpegExtensionPattern = Pattern.compile("jpe?g$",
        Pattern.CASE_INSENSITIVE);

    private final HashMap<String, Path> map = new HashMap<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
      var fileName = file.getFileName().toString();
      var matcher = jpegExtensionPattern.matcher(fileName);
      if (matcher.find()) {
        if (matcher.group(0).equalsIgnoreCase("jpeg")) {
          fileName = matcher.replaceAll("jpg");
        }
        var oldFile = map.put(fileName, file);
        if (oldFile != null) {
          System.err.println(fileName);
          System.out.println("collision!: " + file + ", " + oldFile);
        }
      }
      return FileVisitResult.CONTINUE;
    }
  }
}
