package com.github.teruteru128.sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HashServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/html");
    var writer =  resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>フォワードテスト</title>");
    writer.println("</head>");
    writer.println("<body>");
    writer.println("<ul>");
    writer.print("<li>");
    writer.print(req.getPathInfo());
    writer.println("</li>");
    writer.print("<li>");
    writer.println(req.getRequestURI());
    writer.println("</li>");
    writer.print("<li>");
    writer.println(req.getServletPath());
    writer.println("</li>");
    writer.println("</ul>");
    writer.println("<a href=\"../../\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
    writer.flush();
  }
}
