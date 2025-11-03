package com.github.teruteru128.study;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserPrincipal;

class FileOwnerChecker extends SimpleFileVisitor<Path> {

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
