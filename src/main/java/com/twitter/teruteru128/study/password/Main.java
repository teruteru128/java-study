package com.twitter.teruteru128.study.password;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Main {
    /**
     * 鍵長(定数)
     */
    private static final int KEY_LENGTH = 512;

    public static void main(String[] args) {
        /** パスワード(引数) */
        String password_str = "null";
        char[] password = password_str.toCharArray();
        /** ソルト(引数) */
        String base64_salt = "Lqyk4OBiRGagh9VDabz5NqFVdNLZxg9MpFaXfKNt7NY=";
        byte[] salt = Base64.getDecoder().decode(base64_salt);
        /**
         * ストレッチング繰り返し回数(引数)
         */
        int iterationCount = (1 << 14) - 1;
        PBEKeySpec keySpec = new PBEKeySpec(password, salt, iterationCount, KEY_LENGTH);
        SecretKeyFactory factory = null;
        try {
            factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
        }
        SecretKey secretKey = null;
        long start = System.nanoTime();
        final int loopCount = 100;
        for (int i = 0; i < loopCount; i++) {
            try {
                secretKey = factory.generateSecret(keySpec);
            } catch (InvalidKeySpecException e) {
                e.printStackTrace();
            }
        }
        long end = System.nanoTime();
        System.out.printf("合計: %.6f秒%n", (end - start) / 1000000000d);
        System.out.printf("1回あたり: %.10f秒%n", (end - start) / (loopCount * 1000000000d));
        String hashedPassword = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        System.out.println(hashedPassword);
    }
}