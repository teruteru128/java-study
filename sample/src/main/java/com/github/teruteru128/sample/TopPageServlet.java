package com.github.teruteru128.sample;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;
import java.util.random.RandomGenerator;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class TopPageServlet extends HttpServlet {

  @Serial
  private static final long serialVersionUID = 1L;
  private final RandomGenerator random = RandomGenerator.of("SecureRandom");

  public TopPageServlet() {
  }

  @Override
  public void init() throws ServletException {
    super.init();
  }

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
  }

  @Override
  public void destroy() {
    log("TopPageServlet destroy");
    super.destroy();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var templateEngine = (TemplateEngine) this.getServletContext()
        .getAttribute(ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
    var application = (JakartaServletWebApplication) getServletContext().getAttribute(
        ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);
    var webExchange = application.buildExchange(req, resp);
    var context = new WebContext(webExchange);
    context.setVariable("omikuji", random.nextInt(100));
    resp.setContentType("text/html");
    templateEngine.process("index", context, resp.getWriter());
  }
}
