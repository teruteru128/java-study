package com.github.teruteru128.sample.user.register;

import com.github.teruteru128.sample.ThymeleafConfiguration;
import com.github.teruteru128.sample.user.PasskeyCredentialsDao;
import com.github.teruteru128.sample.user.PasswordCredentialsDao;
import com.github.teruteru128.sample.user.UserDao;
import com.github.teruteru128.sample.user.UserRegisterParameter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.random.RandomGenerator;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class RegisterServlet extends HttpServlet {

  private final RandomGenerator generator = RandomGenerator.of("SecureRandom");
  private volatile DataSource dataSource = null;
  private RegisterService registerService;

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    try {
      var initialContext = new InitialContext();
      var envContext = (Context) initialContext.lookup("java:comp/env");
      dataSource = (DataSource) envContext.lookup("jdbc/SQLiteDataSource");
      var userDao = new UserDao(dataSource);
      var passwordCredentialsDao = new PasswordCredentialsDao(dataSource);
      var passkeyCredentialDao = new PasskeyCredentialsDao(dataSource);
      this.registerService = new RegisterService(userDao, passwordCredentialsDao, passkeyCredentialDao,
          dataSource);
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
    parameter.setEmail(req.getParameter("email"));
    parameter.setPassword(req.getParameter("password"));
    parameter.setPasswordConfirmation(req.getParameter("password_confirmation"));
    var servletContext = getServletContext();
    var templateEngine = (TemplateEngine) servletContext.getAttribute(
        ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
    var application = (JakartaServletWebApplication) servletContext.getAttribute(
        ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);
    var webExchange = application.buildExchange(req, resp);
    var context = new WebContext(webExchange);
    try {
      registerService.register(parameter);
      resp.sendRedirect(req.getContextPath() + "user/register-success");
    } catch (UserAlreadyExistsException e) {
      resp.setContentType("text/html");
      templateEngine.process("user/register/failed", context, resp.getWriter());
    }
  }
}
