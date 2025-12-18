package com.github.teruteru128.sample.primes;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * これセッションで作ったはいいけど本来はDBに作るやつだよな
 */
public class PrimesViewerServlet extends HttpServlet {

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
    @SuppressWarnings("unchecked")
    var savedPrimes = (List<String>) session.getAttribute("savedPrimes");
    if (savedPrimes.isEmpty()) {
      writer.println(
          "なんもあらんかったわ、<a href=\"./create?q=20\">あっち</a>で素数作ってきてな！");
    } else {
      writer.println("<ul>");
      for (String primeNumber : savedPrimes) {
        writer.print("<li><a href=\"https://factordb.com/index.php?query=");
        writer.print(primeNumber);
        writer.print("\" target=\"_blank\">");
        writer.print(primeNumber);
        writer.println("</a></li>");
      }
      writer.println("</ul>");
    }
    writer.println("<a href=\"../../\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
