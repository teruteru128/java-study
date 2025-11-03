package com.github.teruteru128.study;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;

public class CookieClickerSaveFileNameConverter {

  /**
   * Cookie Clicker for mobile のセーブデータファイル名を修正するためのマクロ
   * @param dir dir
   * @return status code
   * @throws IOException io error
   */
  @Command
  private int convert(Path dir) throws IOException {
    var pattern = Pattern.compile("CookieClickerSave-(\\d+...\\d\\d\\d\\d-\\d\\dh\\d\\d).txt");
    var originalFormatter = DateTimeFormatter.ofPattern("dMMMyyyy-HH'h'mm", Locale.ENGLISH);
    var newFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm", Locale.ENGLISH);
    record MatcherAndPath(Path file, Matcher matcher) {

    }
    try (var list = Files.list(dir)) {
      list.map(p -> new MatcherAndPath(p, pattern.matcher(p.getFileName().toString())))
          .filter(p -> p.matcher().matches()).forEach(p -> {
            var time = LocalDateTime.parse(p.matcher().group(1), originalFormatter);
            var newPath = p.file()
                .resolveSibling("CookieClickerSave-" + time.format(newFormatter) + ".txt");
            try {
              Files.move(p.file(), newPath);
            } catch (IOException e) {
              throw new UncheckedIOException(e);
            }
          });
    }
    return ExitCode.OK;
  }

}
