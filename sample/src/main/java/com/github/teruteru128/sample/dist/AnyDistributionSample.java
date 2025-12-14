package com.github.teruteru128.sample.dist;

import com.github.teruteru128.sample.Sample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

/**
 * AnyDistributionSample
 */
public class AnyDistributionSample extends HttpServlet implements Sample {

    /**
     * @see org.apache.commons.statistics.distribution.ExponentialDistribution
     */
    @Override
    public void sample() {
        double r;
        double s;
        for (int i = 0; i < 10; i++) {
            // ここ指数分布
            r = -Math.log(1 - ThreadLocalRandom.current().nextDouble());
            s = Math.sqrt(r);
            System.out.printf("%f, %f%n", r * 600, s * 600);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.setContentType("text/html");
        var writer = resp.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"ja\">");
        writer.println("<head>");
        writer.println("<title>AnyDistributionSample</title>");
        writer.println("</head>");
        writer.println("<body>");
        double r;
        double s;
        for (int i = 0; i < 10; i++) {
            // ここ指数分布
            r = -Math.log(1 - ThreadLocalRandom.current().nextDouble());
            s = Math.sqrt(r);
            writer.println("<p>");
            writer.printf("%f, %f%n", r * 600, s * 600);
            writer.println("</p>");
        }
        writer.println("<a href=\"/\">トップページに戻る</a>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
