package com.github.teruteru128.sample.primes;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class PrimesAllDeleteServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setCharacterEncoding(StandardCharsets.UTF_8);
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("</head>");
    writer.println("<body>");
    var session = req.getSession();
    @SuppressWarnings("unchecked")
    var savedPrimes = (List<String>) session.getAttribute("savedPrimes");
    savedPrimes.clear();
    session.setAttribute("savedPrimes", savedPrimes);
    writer.println("削除しました");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
