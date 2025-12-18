package com.github.teruteru128.sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class HashServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var pathInfo = req.getPathInfo();
    var requestURI = req.getRequestURI();
    var servletPath = req.getServletPath();
    resp.setContentType("text/html");
    var writer =  resp.getWriter();
    var servletContext = getServletContext();
    var templateEngine = (TemplateEngine) servletContext.getAttribute(
        ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
    var application = (JakartaServletWebApplication) servletContext.getAttribute(
        ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);
    var webExchange = application.buildExchange(req, resp);
    var context = new WebContext(webExchange);
    context.setVariable("pathInfo", "PathInfo: " + pathInfo);
    context.setVariable("requestURI", "RequestURI: " + requestURI);
    context.setVariable("servletPath", "ServletPath:" + servletPath);
    templateEngine.process("hash", context, writer);
  }
}
