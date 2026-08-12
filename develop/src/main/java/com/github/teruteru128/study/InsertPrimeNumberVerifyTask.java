package com.github.teruteru128.study;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
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
          "insert into candidates(id, step, composite, probably_prime, definitely_prime, timecreated) "
              + "values(?, ?, 0, 0, 0, CURRENT_TIMESTAMP);")) {
        var matcher = UUID_PATTERN.matcher(largeSievePath.getFileName().toString());
        if (!matcher.find()) {
          return ExitCode.SOFTWARE;
        }
        var uuid = UUID.fromString(matcher.group());
        var id = uuid.getMostSignificantBits();
        System.err.println("id: " + id);
        prep.setLong(1, id);
        // large-sieveファイルの形式(src/large_sieve_io.cのwrite_large_sieveが書く形式):
        // 先頭8byteがbig-endianのsearchLength(有効bit数)ヘッダー、続けて
        // ceil(searchLength/64)個のbig-endian long(1bit=1候補、1なら合成数)。
        // DataInputStream#readLongはbig-endianとして読むのでバイト順の変換は不要。
        BitSet p;
        {
          long searchLength;
          long[] n;
          try (var din = new DataInputStream(
              new BufferedInputStream(Files.newInputStream(largeSievePath)))) {
            searchLength = din.readLong();
            if (searchLength < 0 || searchLength > Integer.MAX_VALUE) {
              throw new IOException("large sieve searchLength out of range: " + searchLength);
            }
            n = new long[(int) ((searchLength + 63L) / 64L)];
            for (int i = 0; i < n.length; i++) {
              n[i] = din.readLong();
            }
          }
          var largeSieve = BitSet.valueOf(n);
          p = new BitSet((int) searchLength);
          p.set(0, (int) searchLength);
          p.andNot(largeSieve);
        }
        System.err.printf("candidates: %d%n", p.cardinality());
        if (clearOff != null) {
          p.clear(0, clearOff);
        }
        if (!dryRun) {
          // autoCommitのままだとbatch内の各insertが個別にコミットされ、
          // 候補数十万件規模だと極端に遅くなる(SQLiteのロック競合の原因にもなる)。
          // 1トランザクションにまとめて最後に1回だけコミットする。
          con.setAutoCommit(false);
          p.stream().forEach(s -> {
            try {
              prep.setInt(2, s);
              prep.addBatch();
            } catch (SQLException e) {
              throw new RuntimeException(e);
            }
          });
          var sum = Arrays.stream(prep.executeBatch()).sum();
          con.commit();
          System.err.println("inserted: " + sum);
        }
      }
    }
    return 0;
  }
}
