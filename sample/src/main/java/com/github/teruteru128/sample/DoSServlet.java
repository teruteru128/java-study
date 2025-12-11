package com.github.teruteru128.sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class DoSServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setBufferSize(8192);
    var h = req.getParameter("q");
    var s = req.getParameter("l");
    long n;
    try {
      n = Long.parseLong(h);
    } catch (NumberFormatException e) {
      return;
    }
    int l;
    if (s != null) {
      try {
        l = Integer.parseInt(s);
      } catch (NumberFormatException e) {
        l = 72;
      }
    } else {
      l = 72;
    }
    resp.setCharacterEncoding(StandardCharsets.UTF_8);
    resp.setContentType("text/plain");
    var writer = resp.getWriter();
    var repeat = "1".repeat(l);
    for (var i = 0L; i < n; i++) {
      writer.println(repeat);
    }
  }
}
