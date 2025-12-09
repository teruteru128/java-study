package com.github.teruteru128.sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DynamicServiceServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/plain");
    var writer = resp.getWriter();
    // Dynamic content generation
    writer.println("Hello from embedded Tomcat dynamic web service!");
    writer.println("Request URI: " + req.getRequestURI());
    writer.flush();
  }
}
