package com.github.teruteru128.sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoSServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setBufferSize(131072);
    var qParam = req.getParameter("q");
    var lParam = req.getParameter("l");
    long q;
    try {
      q = Long.parseLong(qParam);
    } catch (NumberFormatException e) {
      q = 14170;
    }
    int l;
    if (lParam != null) {
      try {
        l = Integer.parseInt(lParam);
      } catch (NumberFormatException e) {
        l = 72;
      }
    } else {
      l = 72;
    }
    resp.setContentType("text/plain");
    var writer = resp.getWriter();
    var repeat = "1".repeat(l);
    for (var i = 0L; i < q; i++) {
      writer.println(repeat);
    }
  }
}
