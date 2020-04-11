package com.twitter.teruteru128.test.password;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Main {
    /**
     * 鍵長(定数)
     * */
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
         * */
        int iterationCount = 0b11_1111_1111_1111;
        /*
         * salt = new byte[] { 46, -84, -92, -32, -32, 98, 68, 102, -96, -121,
         * -43, 67, 105, -68, -7, 54, -95, 85, 116, -46, -39, -58, 15, 76, -92,
         * 86, -105, 124, -93, 109, -20, -42 };
         */
        System.out.println("hi!1");
        PBEKeySpec keySpec = new PBEKeySpec(password, salt, iterationCount,
                KEY_LENGTH);
        System.out.println("hi!2");
        SecretKeyFactory factory = null;
        try {
            factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
        }
        System.out.println("hi!3");
        SecretKey secretKey = null;
        long start = System.currentTimeMillis();
        for(int i=0;i<100;i++){
        try {
            secretKey = factory.generateSecret(keySpec);
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        }
        long end = System.currentTimeMillis();
        System.out.println("合計: "+(end-start)+"ミリ秒");
        System.out.println("1回あたり: "+(end-start)/100d+"ミリ秒");
        System.out.println("hi!4");
        String hashedPassword = Base64.getEncoder().encodeToString(
                secretKey.getEncoded());
        System.out.println(hashedPassword);
    }
}