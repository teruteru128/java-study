package com.github.teruteru128.sample.ec;

import com.github.teruteru128.sample.Sample;
import com.github.teruteru128.sample.ThymeleafConfiguration;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.util.HexFormat;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class ECKeyGenerateSample extends HttpServlet implements Sample {

  @Serial
  private static final long serialVersionUID = 1L;
  private static final Provider BC_PROVIDER = Security.getProvider("BC");

  public void dosecp256k1GenerateSample()
      throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
    var generator1 = KeyPairGenerator.getInstance("EC", BC_PROVIDER);
    // secp256k1はJDK 16で削除されました。
    generator1.initialize(new ECGenParameterSpec("secp256k1"));
    var pubKey = (ECPublicKey) generator1.generateKeyPair().getPublic();
    System.out.println(pubKey.getAlgorithm());
    System.out.println(pubKey.getFormat());
    var q = pubKey.getQ();
    System.out.println(q.getXCoord().getClass());
    System.out.println(HexFormat.of().formatHex(pubKey.getQ().getEncoded(false)));
    System.out.println(HexFormat.of().formatHex(pubKey.getEncoded()));
  }

  public void sample()
      throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
    dosecp256k1GenerateSample();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    KeyPairGenerator generator1;
    try {
      generator1 = KeyPairGenerator.getInstance("EC", BC_PROVIDER);
    } catch (NoSuchAlgorithmException e) {
      throw new ServletException(e);
    }
    // secp256k1はJDK 16で削除されました。
    try {
      generator1.initialize(new ECGenParameterSpec("secp256k1"));
    } catch (InvalidAlgorithmParameterException e) {
      throw new ServletException(e);
    }
    var pubKey = (ECPublicKey) generator1.generateKeyPair().getPublic();
    var algorithm = pubKey.getAlgorithm();
    var q = pubKey.getQ();
    var aClass = q.getXCoord().getClass();
    var format = pubKey.getFormat();
    var hexFormat = HexFormat.of();
    var s1 = hexFormat.formatHex(q.getEncoded(false));
    var s2 = hexFormat.formatHex(pubKey.getEncoded());

    var servletContext = this.getServletContext();
    var templateEngine = (TemplateEngine) servletContext
        .getAttribute(ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
    var application = (JakartaServletWebApplication) servletContext.getAttribute(
        ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);

    var webExchange = application.buildExchange(req, resp);
    var context = new WebContext(webExchange);
    context.setVariable("algorithm", algorithm);
    context.setVariable("format", format);
    context.setVariable("aClass", aClass);
    context.setVariable("s1", s1);
    context.setVariable("s2", s2);
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    templateEngine.process("ec/keyGenerate", context, writer);
  }
}
