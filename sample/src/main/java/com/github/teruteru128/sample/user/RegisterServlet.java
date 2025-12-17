package com.github.teruteru128.sample.user;

import com.github.teruteru128.sample.ThymeleafConfiguration;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HexFormat;
import java.util.random.RandomGenerator;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class RegisterServlet extends HttpServlet {

  private final RandomGenerator generator = RandomGenerator.of("SecureRandom");
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
    writer.println("<title>register page</title>");
    writer.println("</head>");
    writer.println("<body>");
    writer.println("<h1>register page</h1>");
    writer.println("<form method=\"post\" action=\"/user/register\">");
    writer.println("<div>");
    writer.println("<label for=\"email\">メールアドレス</label>");
    writer.print("<input type=\"email\" name=\"email\" id=\"email\"");
    writer.println(" autocomplete=\"email\" required>");
    writer.println("</div>");
    writer.println("<div>");
    writer.println("<label for=\"password\">パスワード</label>");
    writer.print("<input type=\"password\" name=\"password\"");
    writer.println(" autocomplete=\"new-password\" required>");
    writer.println("</div>");
    writer.println("<div>");
    writer.println("<label for=\"password_confirmation\">確認用パスワード</label>");
    writer.print("<input type=\"password\" name=\"password_confirmation\"");
    writer.println(" id=\"password_confirmation\" autocomplete=\"new-password\" required>");
    writer.println("</div>");
    writer.println("<button type=\"submit\">登録</button>");
    writer.println("</div>");
    writer.println("</form>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var parameter = new UserRegisterParameter();
    var emailParam = req.getParameter("email");
    parameter.setEmail(req.getParameter("email"));
    var passwordParam = req.getParameter("password");
    parameter.setPassword(req.getParameter("password"));
    var passwordConfirmationParam = req.getParameter("password_confirmation");
    parameter.setPasswordConfirmation(req.getParameter("password_confirmation"));
    var servletContext = getServletContext();
    var templateEngine = (TemplateEngine) servletContext.getAttribute(
        ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
    var application = (JakartaServletWebApplication) servletContext.getAttribute(
        ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);
    var webExchange =  application.buildExchange(req, resp);
    var context = new WebContext(webExchange);
    if (emailParam == null || passwordParam == null || !passwordParam.equals(
        passwordConfirmationParam)) {

      context.setVariable("parameter", parameter);
      resp.setContentType("text/html");
      templateEngine.process("user/register/failed", context, resp.getWriter());
      return;
    }
    var salt = new byte[16];
    generator.nextBytes(salt);
    var hash = new byte[64];
    var generator = new Argon2BytesGenerator();
    var builder = new Argon2Parameters.Builder(Argon2Parameters.ARGON2_id).withIterations(1)
        .withMemoryAsKB(2097152).withParallelism(1).withSalt(salt);
    generator.init(builder.build());
    generator.generateBytes(passwordParam.getBytes(StandardCharsets.UTF_8), hash);
    try (var connection = dataSource.getConnection()) {
      connection.setAutoCommit(false);
      long user_id;
      try {
        try (var userPrepStmt = connection.prepareStatement(
            "insert into user(username, email) values(?,?);", Statement.RETURN_GENERATED_KEYS)) {
          // 今のところ未使用なので空欄に設定
          userPrepStmt.setString(1, "");
          userPrepStmt.setString(2, emailParam);
          userPrepStmt.execute();
          try (var generatedKeys = userPrepStmt.getGeneratedKeys()) {
            if (generatedKeys.next()) {
              user_id = generatedKeys.getLong(1);
            } else {
              // ID が生成されなかった場合は致命的なエラーとして扱う
              throw new SQLException("Failed to retrieve generated user ID.");
            }
          }
        }
        try (var passCredPrepStmt = connection.prepareStatement(
            "insert into PasswordCredentials(user_id, hash, salt) VALUES (?, ?, ?);")) {
          passCredPrepStmt.setLong(1, user_id);
          var format = HexFormat.of();
          // argon2由来のhashとsalt
          passCredPrepStmt.setString(2, format.formatHex(hash));
          passCredPrepStmt.setString(3, format.formatHex(salt));
          passCredPrepStmt.execute();
        }
        connection.commit();
      } catch (SQLException e) { // 例外発生時はロールバックする
        try {
          connection.rollback();
        } catch (SQLException rollbackEx) {
          // ロールバック失敗時のログ出力など
          log("Rollback failed: " + rollbackEx.getMessage());
        }
        throw new ServletException(e);
      }
    } catch (SQLException e) {
      throw new ServletException(e);
    }
    resp.setContentType("text/html");
    templateEngine.process("user/register/success", context, resp.getWriter());
  }
}
