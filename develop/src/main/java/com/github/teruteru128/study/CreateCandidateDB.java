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

@Command(name = "createCandidateDB")
public class CreateCandidateDB implements Callable<Integer> {

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

    }
    return ExitCode.OK;
  }

}
