package com.github.teruteru128.sample.clone;

import com.github.teruteru128.math.CloneableBigInteger;
import com.github.teruteru128.sample.ThymeleafConfiguration;
import jakarta.annotation.Nonnull;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

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
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    var servletContext = this.getServletContext();
    var templateEngine = (TemplateEngine) servletContext
        .getAttribute(ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
    var application = (JakartaServletWebApplication) getServletContext().getAttribute(
        ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);
    var webExchange = application
        .buildExchange(req, resp);
    var context = new WebContext(webExchange);
    var textList = getTextList();
    context.setVariable("list", textList);
    templateEngine.process("clone", context, resp.getWriter());
  }

  @Nonnull
  private static ArrayList<String> getTextList() {
    var signNumber = 0;
    var magnitude = new byte[0];
    var cloneableZero = new CloneableBigInteger(signNumber, magnitude);
    var clonedZero = cloneableZero.clone();
    var originalZero = BigInteger.ZERO;
    var textList = new ArrayList<String>(3);
    textList.add("originalZero: " + originalZero);
    textList.add("cloneableZero: " + cloneableZero);
    textList.add("clonedZero: " + clonedZero);
    textList.add("cloneableZero.equals(clonedZero): " + cloneableZero.equals(clonedZero));
    textList.add("originalZero.equals(clonedZero): " + originalZero.equals(clonedZero));
    textList.add("originalZero.equals(cloneableZero): " + originalZero.equals(cloneableZero));
    textList.add("originalZero.getClass(): " + originalZero.getClass());
    textList.add("cloneableZero.getClass(): " + cloneableZero.getClass());
    textList.add("originalZero.getClass() == cloneableZero.getClass(): " + (originalZero.getClass()
                                                                            == cloneableZero.getClass()));
    return textList;
  }
}
