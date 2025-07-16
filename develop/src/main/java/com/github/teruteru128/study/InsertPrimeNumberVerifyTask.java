package com.github.teruteru128.study;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import org.sqlite.SQLiteDataSource;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "insertPrimeNumberVerifyTask")
public class InsertPrimeNumberVerifyTask implements Callable<Integer> {

  public static final Pattern UUID_PATTERN = Pattern.compile(
      "\\p{XDigit}{8}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{12}");
  @Parameters
  Path largeSievePath;
  @Option(names = "--start")
  private Integer clearOff = null;
  @Option(names = "--dry-run")
  private boolean dryRun = false;

  @Override
  public Integer call() throws Exception {
    var source = new SQLiteDataSource();
    var dbUrl = System.getenv("DB_URL");
    System.err.println("insert to " + dbUrl);
    source.setUrl(Objects.requireNonNull(dbUrl));
    try (var con = source.getConnection()) {
      try (var prep = con.prepareStatement(
          "insert into candidates(id, step, composite, probably_prime, definitely_prime) values(?, ?, 0, 0, 0);")) {
        var matcher = UUID_PATTERN.matcher(largeSievePath.getFileName().toString());
        if (!matcher.find()) {
          return ExitCode.SOFTWARE;
        }
        var uuid = UUID.fromString(matcher.group());
        var id = uuid.getMostSignificantBits();
        System.err.println("id: " + id);
        prep.setLong(1, id);
        BitSet p;
        {
          long[] n;
          try (var ois = new ObjectInputStream(
              new ByteArrayInputStream(Files.readAllBytes(largeSievePath)))) {
            ois.readInt();
            n = (long[]) ois.readObject();
          }
          var largeSieve = BitSet.valueOf(n);
          p = new BitSet(largeSieve.length());
          p.set(0, largeSieve.length());
          p.andNot(largeSieve);
        }
        System.err.printf("candidates: %d%n", p.cardinality());
        if (clearOff != null) {
          p.clear(0, clearOff);
        }
        if (!dryRun) {
          p.stream().forEach(s -> {
            try {
              prep.setInt(2, s);
              prep.addBatch();
            } catch (SQLException e) {
              throw new RuntimeException(e);
            }
          });
          var sum = Arrays.stream(prep.executeBatch()).sum();
          System.err.println("inserted: " + sum);
        }
      }
    }
    return 0;
  }
}
