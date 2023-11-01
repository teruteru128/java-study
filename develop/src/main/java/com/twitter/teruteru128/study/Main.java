package com.twitter.teruteru128.study;

import java.security.PrivateKey;
import java.util.HexFormat;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * Main
 */
public class Main {

    static final char[] HEAD_SUFFIX = "^o^)┐".toCharArray();
    static final char[] TAIL_PREFIX = "┌(".toCharArray();

    static {
        try {
            Class.forName("com.twitter.teruteru128.study.BCProviderLoader");
        } catch (ClassNotFoundException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // PBKDF2で署名秘密鍵を生成とかでいいのかね……？生成結果が生バイナリで使いやすいし
        var formatter = HexFormat.of();
        var salt = formatter.parseHex("bde8d63e2c47380556a9f1b71d7a5388");
        var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
        var spec = new PBEKeySpec(args[0].toCharArray(), salt, 10000, 512);
        var secret = factory.generateSecret(spec);
        var algorithm = secret.getAlgorithm();
        var encoded = secret.getEncoded();
        var formatName = secret.getFormat();
        System.out.printf("Algorithm: %s%n", algorithm);
        System.out.printf("Encoded: %s%n", formatter.formatHex(encoded));
        System.out.printf("Format: %s%n", formatName);
        System.out.printf("Salt: %s%n", formatter.formatHex(salt));
        System.out.println(secret.getClass());
    }
}
