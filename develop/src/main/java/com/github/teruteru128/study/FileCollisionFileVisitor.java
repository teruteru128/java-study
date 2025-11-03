package com.github.teruteru128.study;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.regex.Pattern;

class FileCollisionFileVisitor extends SimpleFileVisitor<Path> {

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
