package com.github.teruteru128.sample.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ForwardStep2Servlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setCharacterEncoding(StandardCharsets.UTF_8);
    resp.setContentType("text/html");
    req.getRequestDispatcher("/api/header").include(req, resp);
    var writer = resp.getWriter();
    writer.println("<p>フォワード先のサーブレットです</p>");
    req.getRequestDispatcher("/api/footer").include(req, resp);
  }
}
