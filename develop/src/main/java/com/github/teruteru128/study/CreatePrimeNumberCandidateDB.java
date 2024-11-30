package com.github.teruteru128.study;

import static java.lang.Integer.parseInt;

import com.github.teruteru128.foreign.prime.search.PrimeSearch;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.BitSet;
import java.util.concurrent.Callable;
import org.sqlite.javax.SQLiteConnectionPoolDataSource;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

public class CreatePrimeNumberCandidateDB implements Callable<Integer> {

  @Parameters String url;
  @Parameters String largeSievePath;
  @Option(names = "start")
  private Integer clearOff = null;
  /**
   * Create a database of prime number candidates
   * @throws SQLException
   * @throws IOException
   * @throws ClassNotFoundException
   */
  @Command(name = "createPrimeNumberCandidateDB")
  public Integer call()
      throws SQLException, IOException, ClassNotFoundException {
    var source = new SQLiteConnectionPoolDataSource();
    source.setUrl(url);
    try (var con = source.getConnection()) {
      try (var st = con.createStatement()) {
        st.execute(
            "create table if not exists candidates(id long, step int, composite int, probably_prime int, definitely_prime int, primary key(id, step));");
      }

      try (var prep = con.prepareStatement(
          "insert into candidates(id, step, composite, probably_prime, definitely_prime) values(?, ?, 0, 0, 0);")) {
        prep.setLong(1, 0x32ec7597040b4f0cL);
        BitSet p;
        {
          var largeSieve = PrimeSearch.loadLargeSieve2(Path.of(largeSievePath));
          p = new BitSet(largeSieve.length());
          p.set(0, largeSieve.length());
          p.andNot(largeSieve);
        }
        if(clearOff != null) {
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
