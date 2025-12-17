package com.github.teruteru128.sample.user;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

public class PasswordCredentialsDao {

  public PasswordCredentialsDao(DataSource dataSource) {
  }

  public PasswordCredentialsDao() {
  }

  public void insert(Connection connection, long user_id, String hash, String salt)
      throws SQLException {
    try (var passCredPrepStmt = connection.prepareStatement(
        "insert into PasswordCredentials(user_id, hash, salt) VALUES (?, ?, ?);")) {
      passCredPrepStmt.setLong(1, user_id);
      // argon2由来のhashとsalt
      passCredPrepStmt.setString(2, hash);
      passCredPrepStmt.setString(3, salt);
      passCredPrepStmt.execute();
    }
  }
}
