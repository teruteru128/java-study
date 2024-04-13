package com.github.teruteru128.sample;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HexFormat;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class PBKDF2Sample {

    public static final HexFormat format = HexFormat.of();

    public static void getFormatName(char[] password, byte[] salt)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        // PBKDF2で署名秘密鍵を生成とかでいいのかね……？生成結果が生バイナリで使いやすいし
        var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
        // 反復回数も記録して適当なタイミングでログイン時に更新できるようにすべき
        var spec = new PBEKeySpec(password, salt, 10000, 512);
        var secret = factory.generateSecret(spec);
        var algorithm = secret.getAlgorithm();
        var encoded = secret.getEncoded();
        var formatName = secret.getFormat();
        System.out.printf("Algorithm: %s%n", algorithm);
        System.out.printf("Encoded: %s%n", format.formatHex(encoded));
        System.out.printf("Format: %s%n", formatName);
        System.out.printf("Salt: %s%n", format.formatHex(salt));
    }

}
