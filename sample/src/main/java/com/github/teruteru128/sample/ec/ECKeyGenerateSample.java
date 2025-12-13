package com.github.teruteru128.sample.ec;

import com.github.teruteru128.sample.Sample;
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
    resp.setContentType("text/html");
    var writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"ja\">");
    writer.println("<head>");
    writer.println("<title>ECテストページ</title>");
    writer.println("</head>");
    writer.println("<body>");
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
    writer.print("<p>Algorithm: ");
    writer.print(pubKey.getAlgorithm());
    writer.println("</p>");
    writer.print("<p>Format: ");
    writer.print(pubKey.getFormat());
    writer.println("</p>");
    var q = pubKey.getQ();
    writer.print("<p>Class: ");
    writer.print(q.getXCoord().getClass());
    writer.println("</p>");
    writer.print("<p>Encoded1: ");
    var hexFormat = HexFormat.of();
    writer.print(hexFormat.formatHex(pubKey.getQ().getEncoded(false)));
    writer.println("</p>");
    writer.print("<p>Encoded2: ");
    writer.print(hexFormat.formatHex(pubKey.getEncoded()));
    writer.println("</p>");
    writer.println("<a href=\"/\">トップページに戻る</a>");
    writer.println("</body>");
    writer.println("</html>");
  }
}
