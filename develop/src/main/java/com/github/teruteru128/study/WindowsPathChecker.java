package com.github.teruteru128.study;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;

@Command(name = "WindowsPathChecker")
public class WindowsPathChecker {

  @Command(name = "pathChecker")
  private int pathChecker() {
    String path = System.getenv("PATH") != null ? System.getenv("PATH") : "";
    String[] paths = path.split(";", -1);
    var uniquePaths = new HashSet<String>();
    for (var p : paths) {
      var path1 = Path.of(p);
      var exists = Files.exists(path1) && Files.isDirectory(path1);
      var isDuplicate = !uniquePaths.add(p);

      String result = "";
      if (!exists) {
        result += "X";
      }
      if (isDuplicate) {
        result += "D";
      }
      System.out.printf("%s\t%s%n", result, p);
    }
    return ExitCode.OK;
  }

}
