package com.github.teruteru128.sample;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class TopPageServlet extends HttpServlet {

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
    var webExchange = JakartaServletWebApplication.buildApplication(getServletContext())
        .buildExchange(req, resp);
    var context = new WebContext(webExchange);
    var session = req.getSession();
    var list = new ArrayList<String>();
    for (var e = session.getAttributeNames(); e.hasMoreElements(); ) {
      var elem = e.nextElement();
      list.add(elem + "[" + session.getAttribute(elem).getClass().getName() + "]");
    }
    list.add("session id: " + req.getSession().getId());
    var offset = ZoneOffset.ofHours(9);
    list.add("getCreationTime: " + OffsetDateTime.ofInstant(Instant.ofEpochMilli(session.getCreationTime()), offset));
    list.add("getLastAccessedTime: " + OffsetDateTime.ofInstant(Instant.ofEpochMilli(session.getLastAccessedTime()), offset));
    list.add("getMaxInactiveInterval: " + session.getMaxInactiveInterval());
    context.setVariable("list", list);
    templateEngine.process("index", context, resp.getWriter());
  }
}
