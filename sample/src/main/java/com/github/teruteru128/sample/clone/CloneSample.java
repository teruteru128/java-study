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
        writer.println("<p>");
        var signNumber = 0;
        var magnitude = new byte[0];
        var myZero = new CloneableBigInteger(signNumber, magnitude);
        var cloned = myZero.clone();
        var zero = BigInteger.ZERO;
        writer.println(zero.equals(myZero));
        writer.println("</p>");
        writer.println("<p>");
        writer.println(myZero.equals(cloned));
        writer.println("</p>");
        writer.println("<p>");
        writer.println(zero.equals(cloned));
        writer.println("</p>");
        writer.println("<p>");
        writer.println(zero.getClass() == myZero.getClass());
        writer.println("</p>");
        writer.println("<a href=\"/\">トップページに戻る</a>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
