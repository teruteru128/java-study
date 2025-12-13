package com.github.teruteru128.sample.kdf;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HexFormat;
import java.util.random.RandomGenerator;
import java.util.regex.Pattern;
import javax.crypto.SecretKeyFactory;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;

public class PBKDF2Servlet extends HttpServlet {

  @Serial
  private static final long serialVersionUID = 1L;
  private static final HexFormat format = HexFormat.of();
  private static final RandomGenerator RANDOM = RandomGenerator.of("SecureRandom");
  private static final Pattern HEX_PATTERN = Pattern.compile("^[0-9a-fA-F]+$");
  private static final Pattern INTEGER_PATTERN = Pattern.compile("^[0-9]+$");

  public PBKDF2Servlet() {
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>PBKDF2 sample</title>");
    writer.println("</head>");
    writer.println("<body>");
    writer.println("<h1>PBKDF2 sample</h1>");
    writer.println("<p><form method=\"post\">");
    writer.println("<input type=\"text\" name=\"username\">");
    writer.println("<input type=\"password\" name=\"password\">");
    writer.print("<input type=\"text\" name=\"salt\" pattern=\"^[0-9a-fA-F]+$\" value=\"");
    var salt = new byte[16];
    RANDOM.nextBytes(salt);
    writer.print(format.formatHex(salt));
    writer.println(
        "\" placeholder=\"0123456789abcdef0123456789abcdef\" title=\"ソルト(16進数文字列)\">");
    writer.println(
        "<input type=\"number\" name=\"iterationCount\" min=\"0\" max=\"1000000\" value=\"1000\">");
    writer.println("<input type=\"submit\" name=\"submit\">");
    writer.println("</form></p>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    SecretKeyFactory factory;
    try {
      factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
    var passwordParam = req.getParameter("password");
    var saltParam = req.getParameter("salt");
    var iterationCountParam = req.getParameter("iterationCount");
    var password = passwordParam == null ? null : passwordParam.toCharArray();
    byte[] salt = null;
    Integer iterationCount = 0;
    boolean validateSuccess = true;
    try {
      salt = saltParam == null ? null : format.parseHex(saltParam);
      iterationCount = iterationCountParam == null ? null : Integer.parseInt(iterationCountParam);
    } catch (IllegalArgumentException _) {
    }
    if (salt == null || iterationCount == null || iterationCount < 0 || 1000000 < iterationCount) {
      validateSuccess = false;
    }
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>PBKDF2 sample</title>");
    writer.println("</head>");
    writer.println("<body>");
    writer.println("<h1>PBKDF2 sample</h1>");
    if (validateSuccess) {
      var spec = new PBEKeySpec(password, salt, iterationCount, 512);
      PBEKey secret;
      long start = System.nanoTime();
      try {
        secret = (PBEKey) factory.generateSecret(spec);
      } catch (InvalidKeySpecException e) {
        throw new RuntimeException(e);
      }
      long end = System.nanoTime();
      var algorithm = secret.getAlgorithm();
      var encoded = secret.getEncoded();
      writer.print("<p>Algorithm: ");
      writer.print(algorithm);
      writer.println("</p>");
      writer.print("<p>iterationCount: ");
      writer.print(iterationCount);
      writer.println("</p>");
      writer.print("<p>time: ");
      writer.print((end - start) / 1e9);
      writer.println(" seconds</p>");
      writer.print("<p>Key: ");
      writer.print(format.formatHex(encoded));
      writer.println("</p>");
    }
    writer.println("<p><form method=\"post\">");
    writer.print(passwordParam);
    writer.println("<input type=\"text\" name=\"username\">");
    writer.print("<input type=\"password\" name=\"password\"");
    if (passwordParam != null && !passwordParam.isEmpty()) {
      writer.print(" value=\"");
      writer.print(passwordParam);
      writer.print("\"");
    }
    writer.println(">");
    writer.print("<input type=\"text\" name=\"salt\" pattern=\"^[0-9a-fA-F]+$\" value=\"");
    if (saltParam != null && !saltParam.isEmpty()) {
      writer.print(saltParam);
    } else {
      var salt2 = new byte[16];
      RANDOM.nextBytes(salt2);
      writer.print(format.formatHex(salt2));
    }
    writer.println(
        "\" placeholder=\"0123456789abcdef0123456789abcdef\" title=\"ソルト(16進数文字列)\">");
    writer.print(
        "<input type=\"number\" name=\"iterationCount\" min=\"0\" max=\"1000000\" value=\"");
    if (iterationCountParam != null && !iterationCountParam.isEmpty()) {
      writer.print(iterationCountParam);
    } else {
      writer.print("1000");
    }
    writer.println("\">");
    writer.println("<input type=\"submit\" name=\"submit\">");
    writer.println("</form></p>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
