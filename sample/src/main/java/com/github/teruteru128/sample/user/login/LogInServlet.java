package com.github.teruteru128.sample.user.login;

import com.github.teruteru128.sample.ThymeleafConfiguration;
import com.github.teruteru128.sample.user.LogInStatus;
import com.github.teruteru128.sample.user.PasswordCredentialsDao;
import com.github.teruteru128.sample.user.User;
import com.github.teruteru128.sample.user.UserDao;
import com.github.teruteru128.sample.user.login.AuthResult.Status;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class LogInServlet extends HttpServlet {

  public static final int DEFAULT_ITERATIONS = 1;
  public static final int DEFAULT_PARALLELISM = 1;
  public static final int DEFAULT_USING_MEMORY_AS_KB = 2097152;
  private static Logger log = Logger.getLogger(LogInServlet.class.getName());
  private volatile DataSource dataSource = null;
  private LoginService loginService = null;
  private UserDao userDao;

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    try {
      var initialContext = new InitialContext();
      var envContext = (Context) initialContext.lookup("java:comp/env");
      dataSource = (DataSource) envContext.lookup("jdbc/SQLiteDataSource");
      userDao = new UserDao(dataSource);
      var passwordCredentialsDao = new PasswordCredentialsDao(dataSource);
      this.loginService = new LoginService(userDao, passwordCredentialsDao, dataSource);
    } catch (NamingException e) {
      throw new ServletException(e);
    }
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var servletContext = this.getServletContext();
    var templateEngine = (TemplateEngine) servletContext.getAttribute(
        ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
    var application = (JakartaServletWebApplication) getServletContext().getAttribute(
        ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);
    var webExchange = application.buildExchange(req, resp);
    var context = new WebContext(webExchange);
    var user = (User) req.getSession().getAttribute("user");
    resp.setContentType("text/html");
    templateEngine.process("user/login/form", context, resp.getWriter());
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var emailParam = req.getParameter("email");
    var passwordParam = req.getParameter("password");
    AuthResult authResult;
    try {
      // ユーザーが登録されてないかパスワード認証が失敗したのかパスキー認証しか登録してないのかわからない
      authResult = loginService.authenticate(emailParam, passwordParam);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    var servletContext = getServletContext();
    var templateEngine = (TemplateEngine) servletContext.getAttribute(
        ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
    var application = (JakartaServletWebApplication) servletContext.getAttribute(
        ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);
    var webExchange = application.buildExchange(req, resp);
    var context = new WebContext(webExchange);
    resp.setContentType("text/html");
    if (authResult.status() == AuthResult.Status.SUCCESS) {// 既存のセッションを無効化して新しいセッションを作成
      req.getSession(false); // 念のため取得
      req.changeSessionId(); // セッションIDのみ変更（Jakarta Servlet 4.0以降推奨）
      var session = req.getSession(true);
      // UserBeanFilter で user インスタンスをセットしているため常に使用可能(のはず)
      var user = (User) session.getAttribute("user");
      user.setEmail(emailParam);
      user.setLogInStatus(LogInStatus.LOGIN_SUCCESS);
      session.setAttribute("user", user);
      resp.sendRedirect(req.getContextPath() + "user/login-success");
    }
    var writer = resp.getWriter();
    context.setVariable("isPasskeyRequired", authResult.status() == Status.PASSKEY_REQUIRED);
    templateEngine.process("user/login/failed", context, writer);
  }
}
