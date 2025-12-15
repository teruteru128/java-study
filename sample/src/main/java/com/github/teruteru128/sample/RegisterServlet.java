package com.github.teruteru128.sample;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.random.RandomGenerator;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;

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
    var emailParam = req.getParameter("email");
    var passwordParam = req.getParameter("password");
    var passwordConfirmationParam = req.getParameter("password_confirmation");
    var writer = resp.getWriter();
    if (emailParam == null || passwordParam == null || !passwordParam.equals(
        passwordConfirmationParam)) {
      resp.setContentType("text/html");
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
      if (emailParam != null) {
        writer.write(" value=\"");
        writer.write(emailParam);
        writer.write("\"");
      }
      writer.println(" autocomplete=\"email\" required>");
      writer.println("</div>");
      writer.println("<div>");
      writer.println("<label for=\"password\">パスワード</label>");
      writer.print("<input type=\"password\" name=\"password\"");
      if (passwordParam != null) {
        writer.write(" value=\"");
        writer.write(passwordParam);
        writer.write("\"");
      }
      writer.println(" autocomplete=\"new-password\" required>");
      writer.println("</div>");
      writer.println("<div>");
      writer.println("<label for=\"password_confirmation\">確認用パスワード</label>");
      writer.print("<input type=\"password\" name=\"password_confirmation\"");
      if (passwordConfirmationParam != null) {
        writer.write(" value=\"");
        writer.write(passwordConfirmationParam);
        writer.write("\"");
      }
      writer.println(" id=\"password_confirmation\" autocomplete=\"new-password\" required>");
      writer.println("</div>");
      writer.println("<button type=\"submit\">登録</button>");
      writer.println("</div>");
      writer.println("</form>");
      writer.println("<a href=\"/\">トップページに戻る</a>");
      writer.println("</body>");
      writer.println("</html>");
      return;
    }
    var salt = new byte[16];
    generator.nextBytes(salt);
    var hash = new byte[64];
    var builder = new Argon2Parameters.Builder(Argon2Parameters.ARGON2_id).withIterations(1)
        .withMemoryAsKB(2097152).withParallelism(1).withSalt(salt);
    var generator = new Argon2BytesGenerator();
    generator.init(builder.build());
    generator.generateBytes(passwordParam.getBytes(StandardCharsets.UTF_8), hash);
    try (var connection = dataSource.getConnection(); var prep = connection.prepareStatement(
        "insert into user(email, hash, salt) values(?,?,?);")) {
      prep.setString(1, emailParam);
      prep.setBytes(2, hash);
      prep.setBytes(3, salt);
      prep.execute();
    } catch (SQLException e) {
      throw new ServletException(e);
    }
    resp.setContentType("text/html");
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>register page</title>");
    writer.println("</head>");
    writer.println("<body>");
    writer.println("<h1>register page</h1>");
    writer.println("<p>登録しました</p>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
