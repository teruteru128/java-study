package com.github.teruteru128.sample.user;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

public class UserDao {

  public UserDao(DataSource dataSource) {}
  public UserDao() {}

  public long insert(Connection connection, String email) throws SQLException {
    long user_id;
    try (var userPrepStmt = connection.prepareStatement(
        "insert into user(username, email) values(?,?);", Statement.RETURN_GENERATED_KEYS)) {
      // 今のところ未使用なので空欄に設定
      userPrepStmt.setString(1, "");
      userPrepStmt.setString(2, email);
      userPrepStmt.execute();
      try (var generatedKeys = userPrepStmt.getGeneratedKeys()) {
        if (generatedKeys.next()) {
          user_id = generatedKeys.getLong(1);
          return user_id;
        } else {
          // ID が生成されなかった場合は致命的なエラーとして扱う
          throw new SQLException("Failed to retrieve generated user ID.");
        }
      }
    }
  }
}
