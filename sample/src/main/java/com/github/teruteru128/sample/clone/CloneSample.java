package com.github.teruteru128.sample.clone;

import com.github.teruteru128.math.CloneableBigInteger;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;

public class CloneSample extends HttpServlet {

  public static int cloneSample() {
    var signNumber = 0;
    var magnitude = new byte[0];
    var myZero = new CloneableBigInteger(signNumber, magnitude);
    var cloned = myZero.clone();
    var zero = BigInteger.ZERO;
    System.out.println(zero.equals(myZero));
    System.out.println(myZero.equals(cloned));
    System.out.println(zero.equals(cloned));
    System.out.println(zero.getClass() == myZero.getClass());
    return 0;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title></title>");
    writer.println("</head>");
    writer.println("<body>");
    var signNumber = 0;
    var magnitude = new byte[0];
    var cloneableZero = new CloneableBigInteger(signNumber, magnitude);
    var clonedZero = cloneableZero.clone();
    var originalZero = BigInteger.ZERO;
    writer.print("<p>originalZero: ");
    writer.print(originalZero);
    writer.println("</p>");
    writer.print("<p>cloneableZero: ");
    writer.print(cloneableZero);
    writer.println("</p>");
    writer.print("<p>clonedZero: ");
    writer.print(clonedZero);
    writer.println("</p>");
    writer.print("<p>cloneableZero.equals(clonedZero): ");
    writer.print(cloneableZero.equals(clonedZero));
    writer.println("</p>");
    writer.print("<p>originalZero.equals(clonedZero): ");
    writer.print(originalZero.equals(clonedZero));
    writer.println("</p>");
    writer.print("<p>originalZero.equals(cloneableZero): ");
    writer.print(originalZero.equals(cloneableZero));
    writer.println("</p>");
    writer.print("<p>originalZero.getClass(): ");
    writer.print(originalZero.getClass());
    writer.println("</p>");
    writer.print("<p>cloneableZero.getClass(): ");
    writer.print(cloneableZero.getClass());
    writer.println("</p>");
    writer.print("<p>originalZero.getClass() == cloneableZero.getClass(): ");
    writer.print(originalZero.getClass() == cloneableZero.getClass());
    writer.println("</p>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
