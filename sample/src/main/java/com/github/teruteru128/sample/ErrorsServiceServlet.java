package com.github.teruteru128.sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;
import java.util.regex.Pattern;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class ErrorsServiceServlet extends HttpServlet {

  @Serial
  private static final long serialVersionUID = 1L;
  private static final Pattern STATUS_PATTERN = Pattern.compile("^/errors/(\\d{3})$");

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var servletPath = req.getServletPath();
    var matcher = STATUS_PATTERN.matcher(servletPath);
    if (!matcher.find()) {
      throw new ServletException("Servlet Path not found: " + servletPath);
    }
    var status = matcher.group(1);
    var templateEngine = (TemplateEngine) this.getServletContext()
        .getAttribute(ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
    var application = (JakartaServletWebApplication) getServletContext().getAttribute(
        ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);
    var webExchange = application.buildExchange(req, resp);
    var context = new WebContext(webExchange);
    context.setVariable("status", status);
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    templateEngine.process("error", context, writer);
  }
}
