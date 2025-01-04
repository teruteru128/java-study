package com.github.teruteru128.study;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.BitSet;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.sqlite.SQLiteDataSource;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "createPrimeNumberCandidateDB")
public class CreatePrimeNumberCandidateDB implements Callable<Integer> {

  @Parameters
  String largeSievePath;
  @Parameters
  private long id;
  @Option(names = "start")
  private Integer clearOff = null;

  /**
   * Create a database of prime number candidates
   * @throws SQLException
   * @throws IOException
   * @throws ClassNotFoundException
   */
  public Integer call() throws SQLException, IOException, ClassNotFoundException {
    var source = new SQLiteDataSource();
    source.setUrl(Objects.requireNonNull(System.getenv("DB_URL")));
    try (var con = source.getConnection()) {
      try (var st = con.createStatement()) {
        st.execute(
            "create table if not exists candidates(id long, step int, composite int, probably_prime int, definitely_prime int, primary key(id, step));");
      }

      try (var prep = con.prepareStatement(
          "insert into candidates(id, step, composite, probably_prime, definitely_prime) values(?, ?, 0, 0, 0);")) {
        prep.setLong(1, id);
        BitSet p;
        {
          long[] n;
          try (var ois = new ObjectInputStream(new ByteArrayInputStream(
              Files.readAllBytes(Path.of(largeSievePath))))) {
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
        p.stream().forEach(s -> {
          try {
            prep.setInt(2, s);
            prep.addBatch();
          } catch (SQLException e) {
            throw new RuntimeException(e);
          }
        });
        prep.executeBatch();
      }
    }
    return ExitCode.OK;
  }

}
