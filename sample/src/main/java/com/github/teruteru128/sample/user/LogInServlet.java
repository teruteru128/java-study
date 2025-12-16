package com.github.teruteru128.sample.user;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.SQLException;
import java.util.HexFormat;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;
import org.bouncycastle.crypto.params.Argon2Parameters.Builder;

public class LogInServlet extends HttpServlet {

  public static final int DEFAULT_ITERATIONS = 1;
  public static final int DEFAULT_PARALLELISM = 1;
  public static final int DEFAULT_USING_MEMORY_AS_KB = 2097152;
  private volatile DataSource dataSource = null;

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
    writer.println("<title>LOGIN PAGE</title>");
    writer.println("</head>");
    writer.println("<body>");
    var user = (User) req.getSession().getAttribute("user");
    writer.printf("<p>%s</p>%n", user.getLogInStatus());
    writer.println("<form  method=\"post\" action=\"/user/login\">");
    writer.println("<label for=\"email\">メールアドレス</label>");
    writer.println(
        "<input type=\"email\" name=\"email\" id=\"email\" autocomplete=\"email\" required>");
    writer.println("<label for=\"password\">パスワード</label>");
    writer.println(
        "<input type=\"password\" name=\"password\" autocomplete=\"password\" required>");
    writer.println("<button type=\"submit\">ログイン</button>");
    writer.println("</form>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var emailParam = req.getParameter("email");
    var passwordParam = req.getParameter("password");
    String email = null;
    String storedHashString = null;
    String saltString = null;
    try (var connection = dataSource.getConnection(); var prep = connection.prepareStatement(
        "select email, hash, salt from user join PasswordCredentials on user.user_id = PasswordCredentials.user_id where email = ?;")) {
      prep.setString(1, emailParam);
      try (var resultSet = prep.executeQuery()) {
        if (resultSet.next()) {
          email = resultSet.getString("email");
          storedHashString = resultSet.getString("hash");
          saltString = resultSet.getString("salt");
        }
      }
    } catch (SQLException e) {
      throw new ServletException(e);
    }
    if (email == null) {
      return;
    }
    var format = HexFormat.of();
    var builder = new Builder(Argon2Parameters.ARGON2_id).withIterations(DEFAULT_ITERATIONS)
        .withMemoryAsKB(DEFAULT_USING_MEMORY_AS_KB).withParallelism(DEFAULT_PARALLELISM)
        .withSalt(format.parseHex(saltString));
    var generator = new Argon2BytesGenerator();
    generator.init(builder.build());
    var calcedHash = new byte[64];
    generator.generateBytes(passwordParam.getBytes(StandardCharsets.UTF_8), calcedHash);
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>LOGIN PAGE</title>");
    writer.println("</head>");
    writer.println("<body>");
    if (MessageDigest.isEqual(format.parseHex(storedHashString), calcedHash)) {
      writer.println("<p>ログインしました</p>");
      var user = (User) req.getSession().getAttribute("user");
      user.setEmail(email);
      user.setLogInStatus(LogInStatus.LOGIN_SUCCESS);
      req.setAttribute("user", user);
    } else {
      writer.println("<p>ログイン失敗しました</p>");
    }
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
