package com.github.teruteru128.sample.aes;

import com.github.teruteru128.sample.Sample;
import com.github.teruteru128.sample.ThymeleafConfiguration;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HexFormat;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

public class AESSample extends HttpServlet implements Sample {

  @Override
  public void sample()
      throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
    var cipher = Cipher.getInstance("AES/ECB/NoPadding");
    var key = new byte[96];
    new SecureRandom().nextBytes(key);
    var keySpec1 = new SecretKeySpec(key, 0, 32, "AES");
    var keySpec2 = new SecretKeySpec(key, 32, 32, "AES");
    var keySpec3 = new SecretKeySpec(key, 64, 32, "AES");
    var message = new byte[16];
    var format = HexFormat.of();
    cipher.init(Cipher.ENCRYPT_MODE, keySpec1);
    var work = cipher.doFinal(message);
    cipher.init(Cipher.DECRYPT_MODE, keySpec2);
    work = cipher.doFinal(work);
    cipher.init(Cipher.ENCRYPT_MODE, keySpec3);
    work = cipher.doFinal(work);
    System.out.println(format.formatHex(work));
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    Cipher cipher;
    try {
      cipher = Cipher.getInstance("AES/ECB/NoPadding");
    } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
      throw new ServletException(e);
    }
    var key = new byte[96];
    new SecureRandom().nextBytes(key);
    var keySpec1 = new SecretKeySpec(key, 0, 32, "AES");
    var keySpec2 = new SecretKeySpec(key, 32, 32, "AES");
    var keySpec3 = new SecretKeySpec(key, 64, 32, "AES");
    var message = " ".repeat(16).getBytes(StandardCharsets.UTF_8);
    var format = HexFormat.of();
    byte[] work;
    byte[] encrypted;
    byte[] decrypted;
    try {
      cipher.init(Cipher.ENCRYPT_MODE, keySpec1);
      work = cipher.doFinal(message);
      cipher.init(Cipher.DECRYPT_MODE, keySpec2);
      work = cipher.doFinal(work);
      cipher.init(Cipher.ENCRYPT_MODE, keySpec3);
      encrypted = cipher.doFinal(work);
      cipher.init(Cipher.DECRYPT_MODE, keySpec3);
      work = cipher.doFinal(encrypted);
      cipher.init(Cipher.ENCRYPT_MODE, keySpec2);
      work = cipher.doFinal(work);
      cipher.init(Cipher.DECRYPT_MODE, keySpec1);
      decrypted = cipher.doFinal(work);
    } catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
      throw new ServletException(e);
    }
    var formattedMessage = format.formatHex(message);
    var formattedKey = format.formatHex(key);
    var formattedEncrypted = format.formatHex(encrypted);
    var formattedDecrypted = format.formatHex(decrypted);

    var servletContext = this.getServletContext();
    var templateEngine = (TemplateEngine) servletContext
        .getAttribute(ThymeleafConfiguration.TEMPLATE_ENGINE_INSTANCE_KEY);
    var application = (JakartaServletWebApplication) servletContext.getAttribute(
        ThymeleafConfiguration.THYMELEAF_APPLICATION_INSTANCE_KEY);

    var webExchange = application.buildExchange(req, resp);
    var context = new WebContext(webExchange);
    context.setVariable("formattedMessage", formattedMessage);
    context.setVariable("formattedKey", formattedKey);
    context.setVariable("formattedEncrypted", formattedEncrypted);
    context.setVariable("formattedDecrypted", formattedDecrypted);
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    templateEngine.process("aes/sample", context, writer);
  }
}
