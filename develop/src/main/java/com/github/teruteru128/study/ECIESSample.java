package com.github.teruteru128.study;

import com.github.teruteru128.bitmessage.EllipticCurveIntegratedEncryptionScheme;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;

public class ECIESSample {

  public static void ecIesSample() {
    var random = RandomGenerator.of("SecureRandom");
    var pair = EllipticCurveIntegratedEncryptionScheme.generateEcKeyPair();
    var prefix = "ｳｧｧ!!ｵﾚﾓｲｯﾁｬｳｩｩｩ!!!ｳｳｳｳｳｳｳｳｳｩｩｩｩｩｩｩｩｳｳｳｳｳｳｳｳ!ｲｨｨｲｨｨｨｲｲｲｨｲｲｲｲｲｲｲｲｲｲｲｲ!!"
        .getBytes(StandardCharsets.UTF_8);
    var length = ThreadLocalRandom.current().nextInt(234, 801);
    var suffixLength = length - prefix.length;
    var suffix = new byte[suffixLength];
    random.nextBytes(suffix);
    var message = new byte[length];
    System.arraycopy(prefix, 0, message, 0, prefix.length);
    System.arraycopy(suffix, 0, message, prefix.length, suffix.length);
    var ciphertext = EllipticCurveIntegratedEncryptionScheme.encrypt(message,
        (ECPublicKey) pair.getPublic());
    var clearText = EllipticCurveIntegratedEncryptionScheme.decrypt(ciphertext,
        (ECPrivateKey) pair.getPrivate());
    if (Arrays.equals(message, clearText)) {
      System.out.println("OK");
    } else {
      System.out.println("NG");
      var format = HexFormat.of();
      System.out.println(format.formatHex(message));
      System.out.println(clearText == null ? "null" : format.formatHex(clearText));
    }
  }

}
