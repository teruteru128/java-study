package com.github.teruteru128.sample;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

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
    var session = req.getSession();
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>BIG SISTER IS WATCHING YOU</title>");
    writer.println("</head>");
    writer.println("<body>");
    writer.println("<h1>BIG SISTER IS WATCHING YOU</h1>");
    writer.println("<div>");
    writer.println("<a href=\"/api/hello\">hello</a>");
    writer.println("</div>");
    writer.println("<div>");
    writer.println("<a href=\"/api/forward1\">forward sample page</a>");
    writer.println("</div>");
    writer.println("<div>");
    writer.println("<a href=\"/test/sqlite\">sqlite test</a>");
    writer.println("<a href=\"/test/ec\">ec test</a>");
    writer.println("<a href=\"/test/curve25519\">curve25519 test</a>");
    writer.println("</div>");
    writer.println("<div>");
    writer.println("<a href=\"/api/hash\">hash 1</a>");
    writer.println("<a href=\"/api/hash/\">hash 2</a>");
    writer.println("<a href=\"/api/hash/aaaaa\">hash 3</a>");
    writer.println("</div>");
    writer.println("<div>");
    writer.println("<a href=\"/api/primes/create?q=5\">create 5 primes</a>");
    writer.println("<a href=\"/api/primes/viewer\">primes viewer</a>");
    writer.println("<a href=\"/api/primes/counter\">primes counter</a>");
    writer.println("<a href=\"/api/primes/delete/all\">primes all delete</a>");
    writer.println("</div>");
    writer.println("<div>");
    writer.println("<a href=\"/api/pbkdf2\">pbkdf2 sample</a>");
    writer.println("</div>");
    writer.println("<div>");
    writer.println("<a href=\"/user/login\">login</a>");
    writer.println("<a href=\"/user/register\">register</a>");
    writer.println("</div>");
    writer.println("<ul>");
    for (var e = session.getAttributeNames(); e.hasMoreElements(); ) {
      writer.println("<li>");
      var attributeName = e.nextElement();
      writer.print(attributeName);
      writer.print("[");
      writer.print(session.getAttribute(attributeName).getClass().getName());
      writer.println("]</li>");
    }
    writer.println("<li>session id: " + session.getId() + "</li>");
    var offset = ZoneOffset.ofHours(9);
    writer.println("<li>getCreationTime:" + OffsetDateTime.ofInstant(
        Instant.ofEpochMilli(session.getCreationTime()), offset) + "</li>");
    writer.println("<li>getLastAccessedTime:" + OffsetDateTime.ofInstant(
        Instant.ofEpochMilli(session.getLastAccessedTime()), offset) + "</li>");
    writer.println("<li>getMaxInactiveInterval:" + session.getMaxInactiveInterval() + "</li>");
    writer.println("</ul>");
    writer.println("<footer>");
    writer.println("<a href=\"mailto:f0AeZ9QaiDvuIcoN6WEpRh7FEYs894Zi@protonmail.com\">contact</a>");
    writer.println("<a href=\"publickey.f0AeZ9QaiDvuIcoN6WEpRh7FEYs894Zi@protonmail.com-7d9493263cc58dbec9b059e1f85cc20d6564f30f.asc\">public key</a>");
    writer.println("</footer>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
