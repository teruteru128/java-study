package com.github.teruteru128.sample.dist;

import com.github.teruteru128.sample.Sample;
import com.github.teruteru128.sample.ThymeleafConfiguration;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.security.SecureRandom;
import java.util.Arrays;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.statistics.distribution.LogNormalDistribution;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

/**
 * 対数正規分布のサンプル
 *
 * @see <a href="https://qiita.com/t_uehara/items/460e04ba7d2b19fdd497">Javaで正規分布・対数正規分布の乱数を生成する</a>
 */
public class LogNormalDistributionSample extends HttpServlet implements Sample {

  @Override
  public void sample() throws IOException {
    // ln(x)の平均μ 大きいほどグラフの右側が伸びる
    // ln(x)の標準偏差σ 大きいほどグラフが横に広がる

    var expMu = 21.0;
    var sigma = 1;
    var distribution = LogNormalDistribution.of(Math.log(expMu), sigma);
    var sampler = distribution.createSampler(new JDKRandomWrapper(new SecureRandom()));

    // var results = sampler.samples(60000000).toArray();
    var samples = sampler.samples(2_000_000_000).toArray();
    var name = "out8";
    System.out.println(name);
    try (var stream1 = new PrintStream(new BufferedOutputStream(
        new FileOutputStream(name + ".properties.txt"))); var stream = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(name + ".bin"), 1024 * 1024 * 1024))) {
      System.out.printf("μ=log(%f), σ=%s%n", expMu, sigma);
      stream1.printf("μ=log(%f), σ=%s%n", expMu, sigma);
      Arrays.stream(samples).forEach(v -> {
        try {
          stream.writeDouble(v);
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      });
      Arrays.stream(samples).average().ifPresent(a -> {
        System.out.printf("avg: %s%n", a);
        stream1.printf("avg: %s%n", a);
      });
    }
    try (var stream = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(name + "-sorted.bin"),
            1024 * 1024 * 1024))) {
      Arrays.sort(samples);
      Arrays.stream(samples).forEach(v -> {
        try {
          stream.writeDouble(v);
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      });
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
    var writer = resp.getWriter();
    templateEngine.process("dist/logNormal", context, writer);
  }
}
