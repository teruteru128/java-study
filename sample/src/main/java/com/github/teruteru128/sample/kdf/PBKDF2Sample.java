package com.github.teruteru128.sample.kdf;

import com.github.teruteru128.study.Factory;
import javax.crypto.SecretKeyFactory;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HexFormat;

public class PBKDF2Sample {

    public static final HexFormat format = HexFormat.of();

    public static void getFormatName(char[] password, byte[] salt)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        // PBKDF2で署名秘密鍵を生成とかでいいのかね……？生成結果が生バイナリで使いやすいし
        var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
        // 反復回数も記録して適当なタイミングでログイン時に更新できるようにすべき
        var spec = new PBEKeySpec(password, salt, 131072, 512);
        var secret = (PBEKey) factory.generateSecret(spec);
        var algorithm = secret.getAlgorithm();
        var encoded = secret.getEncoded();
        var formatName = secret.getFormat();
        System.out.printf("Algorithm: %s%n", algorithm);
        System.out.printf("Salt: %s%n", format.formatHex(salt));
        System.out.printf("Iteration Count: %s%n", secret.getIterationCount());
        System.out.printf("Encoded: %s%n", format.formatHex(encoded));
        System.out.printf("Format: %s%n", formatName);
    }

  public static void extracted1(String[] args)
      throws NoSuchAlgorithmException, InvalidKeySpecException {
    if (args.length >= 2) {
      byte[] salt;
      if (args.length == 2) {
        salt = new byte[16];
        Factory.SECURE_RANDOM_GENERATOR.nextBytes(salt);
      } else {
        salt = HexFormat.of().parseHex(args[2]);
      }
      getFormatName(args[1].toCharArray(), salt);
    }
  }

  public static void extracted2() throws NoSuchAlgorithmException {
    var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA3-512");
    System.out.printf("algo: %s(%s)%n", factory.getAlgorithm(), factory.getProvider());
    System.out.println(factory);
  }
}
