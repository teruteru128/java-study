package com.github.teruteru128.primesearch.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;

@Command(name = "createCandidateDB")
public class CreateCandidateDB implements Callable<Integer> {

  /**
   * Create a database of prime number candidates.
   * SQLite/Postgresどちらでも動くよう、型名はどちらの型アフィニティ規則でも
   * 破綻しないもの(BIGINT/INTEGER/TIMESTAMPTZ/TEXT)を使う。
   */
  @Override
  public Integer call() throws SQLException {
    var dbUrl = Objects.requireNonNull(System.getenv("DB_URL"));
    try (var con = DriverManager.getConnection(dbUrl)) {
      try (var st = con.createStatement()) {
        st.execute(
            "create table if not exists candidates(id BIGINT, step INTEGER, composite INTEGER, "
                + "probably_prime INTEGER, definitely_prime INTEGER, timecreated TIMESTAMPTZ, "
                + "timeassigned TIMESTAMPTZ, assignedclient TEXT, timeresult TIMESTAMPTZ, "
                + "resultclient TEXT, primary key(id, step));");
      }
    }
    return ExitCode.OK;
  }

}
