package com.github.teruteru128.sample.aes;

import com.github.teruteru128.sample.Sample;
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
    Cipher cipher = null;
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
    } catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
      throw new ServletException(e);
    }
    try {
      cipher.init(Cipher.DECRYPT_MODE, keySpec3);
      work = cipher.doFinal(encrypted);
      cipher.init(Cipher.ENCRYPT_MODE, keySpec2);
      work = cipher.doFinal(work);
      cipher.init(Cipher.DECRYPT_MODE, keySpec1);
      decrypted = cipher.doFinal(work);
    } catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
      throw new ServletException(e);
    }
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>AESテスト</title>");
    writer.println("</head>");
    writer.println("<body>");
    writer.print("<p>message: ");
    writer.print(format.formatHex(message));
    writer.println("</p>");
    writer.print("<p>key: ");
    writer.print(format.formatHex(key));
    writer.println("</p>");
    writer.print("<p>encrypted: ");
    writer.print(format.formatHex(encrypted));
    writer.println("</p>");
    writer.print("<p>decrypted: ");
    writer.print(format.formatHex(decrypted));
    writer.println("</p>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
