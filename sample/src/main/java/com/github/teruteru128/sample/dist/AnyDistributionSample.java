package com.github.teruteru128.sample.dist;

import com.github.teruteru128.sample.Sample;

import com.github.teruteru128.sample.ThymeleafConfiguration;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

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
        var templateEngine = (TemplateEngine) this.getServletContext()
            .getAttribute(ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
        var application = (JakartaServletWebApplication) getServletContext().getAttribute(
            ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);
        var webExchange = application.buildExchange(req, resp);
        var context = new WebContext(webExchange);
        resp.setContentType("text/html");
        double r;
        double s;
        var list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            // ここ指数分布
            r = -Math.log(1 - ThreadLocalRandom.current().nextDouble());
            s = Math.sqrt(r);
            list.add(String.format("%f, %f", r * 600, s * 600));
        }
        context.setVariable("list", list);
        var writer = resp.getWriter();
        templateEngine.process("dist/any", context, writer);
    }
}
