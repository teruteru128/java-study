package com.github.teruteru128.sample.sql;

import com.github.teruteru128.sample.Sample;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.sqlite.SQLiteDataSource;

public class SQLiteConnectSample extends HttpServlet implements Sample {

  private DataSource dataSource = null;

  public SQLiteConnectSample() {
    super();
  }

  public static void sample(String url) throws SQLException {
    var dataSource = new SQLiteDataSource();
    dataSource.setUrl(url);
    try (var con = dataSource.getConnection()) {
      System.out.println("connected!");
    }
  }

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    try {
      var initialContext = new InitialContext();
      var envContext = (Context) initialContext.lookup("java:comp/env");
      dataSource = (DataSource) envContext.lookup("jdbc/SQLiteDataSource");
    } catch (NamingException e) {
      throw new ServletException(e);
    }
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>SQLite接続テストページ</title>");
    writer.println("</head>");
    writer.println("<body>");
    try {
      try (var con = dataSource.getConnection()) {
        writer.println("Success!");
      }
    } catch (SQLException e) {
      writer.println("Fail!");
      e.printStackTrace(writer);
    }
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }

  @Override
  public void sample() throws Exception {
    sample("");
  }
}
