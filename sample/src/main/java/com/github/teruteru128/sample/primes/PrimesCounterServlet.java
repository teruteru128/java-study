package com.github.teruteru128.sample.primes;

import com.github.teruteru128.sample.HashServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class PrimesCounterServlet extends HashServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("</head>");
    writer.println("<body>");
    var session = req.getSession();
    @SuppressWarnings("unchecked") var savedPrimes = (List<String>) session.getAttribute(
        "savedPrimes");
    writer.println("<h1>Primes Counter</h1>");
    writer.println("<p>" + savedPrimes.size() + "</p>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
