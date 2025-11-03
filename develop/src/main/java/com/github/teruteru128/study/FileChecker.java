package com.github.teruteru128.study;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "filechecker")
public class FileChecker {

  @Command(name = "zgrep")
  static void zgrep(Path p, String patternArg) throws IOException {
    Files.walkFileTree(p, new ZGrepFileVisitor(Pattern.compile(patternArg)));
  }

  static void extracted(String arg) throws IOException {
    Files.walkFileTree(Path.of(arg), new FileCollisionFileVisitor());
  }

  @Command(name = "f")
  static void extracted1(@Parameters Path path) throws IOException {
    var owner = Files.getOwner(path);
    System.out.println(owner);
    var service = path.getFileSystem().getUserPrincipalLookupService();
    var computerName = System.getenv("COMPUTERNAME");
    var p = service.lookupPrincipalByName(computerName + "\\terut");
    var p2 = service.lookupPrincipalByGroupName("BUILTIN\\Administrators");
    var p3 = service.lookupPrincipalByName(computerName + "\\Administrator");
  }

}
