package com.github.teruteru128.sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogInServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>LOGIN PAGE</title>");
    writer.println("</head>");
    writer.println("<body>");
    writer.println("<form  method=\"post\" action=\"/user/login\">");
    writer.println("<label for=\"email\">メールアドレス</label>");
    writer.println("<input type=\"email\" name=\"email\" id=\"email\" autocomplete=\"email\" required>");
    writer.println("<label for=\"password\">パスワード</label>");
    writer.println("<input type=\"password\" name=\"password\" autocomplete=\"password\" required>");
    writer.println("<button type=\"submit\">ログイン</button>");
    writer.println("</form>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>LOGIN PAGE</title>");
    writer.println("</head>");
    writer.println("<body>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
