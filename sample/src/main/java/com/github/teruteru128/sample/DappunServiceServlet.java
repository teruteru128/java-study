package com.github.teruteru128.sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.regex.Pattern;

public class DappunServiceServlet extends HttpServlet {

  @Serial
  private static final long serialVersionUID = 1L;
  private static final Pattern pattern = Pattern.compile("\\d+");
  private final Random random = new Random();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var len = req.getParameter("len");
    resp.setCharacterEncoding(StandardCharsets.UTF_8);
    var writer = resp.getWriter();
    if (len == null || !pattern.matcher(len).matches()) {
      resp.setContentType("text/plain");
      writer.println("セーフにゃ！");
      writer.flush();
    } else {
      resp.setContentType("text/html");
      writer.println("<!DOCTYPE html>");
      writer.println("<html>");
      writer.println("<head>");
      writer.println("<meta charset=\"utf-8\">");
      writer.println("<title></title>");
      writer.println("</head>");
      writer.println("<body>");
      writer.println(
          "<p>ﾌﾞﾘﾌﾞﾘﾌﾞﾘﾌﾞﾘｭﾘｭﾘｭﾘｭﾘｭﾘｭ！！！！！！ﾌﾞﾂﾁﾁﾌﾞﾌﾞﾌﾞﾁﾁﾁﾁﾌﾞﾘﾘｲﾘﾌﾞﾌﾞﾌﾞﾌﾞｩｩｩｩｯｯｯ！！！！！！！</p>");
      try {
        long len2 = Long.parseLong(len);
        writer.println(
            "<p>" + Math.pow(len2, random.nextDouble()) + "キログラムのうんちが漏れました……</p>");
      } catch (NumberFormatException e) {
        writer.println("<p>うんちが溢れてしまいました……</p>");
      }
      writer.println("</body>");
      writer.println("</html>");
    }
  }
}
