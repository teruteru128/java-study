package com.twitter.teruteru128.study.password;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import jakarta.xml.bind.DatatypeConverter;

/**
 * 分割可能.
 * 
 * @see <a href="http://d.hatena.ne.jp/penult/20120612/1339515650"
 *      target="_blank">source</a>
 * */
public class PBKDF2 {

    public static void main(String[] args) throws InvalidKeySpecException {
        String p1 = "孫に囲まれながら老衰で死ね";
        String p2 = "null";
        printfln("password 1: %s", p1);
        printfln("password 2: %s", p2);
        byte[] salt=null;
        //salt = createSalt();
        salt = new byte[] { 46, -84, -92, -32, -32, 98, 68, 102, -96,
                -121, -43, 67, 105, -68, -7, 54, -95, 85, 116, -46, -39, -58,
                15, 76, -92, 86, -105, 124, -93, 109, -20, -42 };
        printfln("salt: %s", Arrays.toString(salt));
        printfln("salt: %n%s", DatatypeConverter.printHexBinary(salt));

        byte[] d1 = pbkdf2(p1.toCharArray(), salt);
        System.out.println(Base64.getEncoder().encodeToString(d1));
        /*
        printfln("length : %d", d1.length);
        printfln("derived 1: %s", Arrays.toString(d1));
        printfln("%s", DatatypeConverter.printHexBinary(d1));
        */
        byte[] d2 = pbkdf2(p2.toCharArray(), salt);
        System.out.println(Base64.getEncoder().encodeToString(d2));
        /*
        printfln("length : %d", d2.length);
        printfln("derived 2: %s", Arrays.toString(d2));
        printfln("%s", DatatypeConverter.printHexBinary(d2));
        */
    }

    /**
     * ランダムなsaltを生成
     * 
     * @return 64byte,256bitのソルトの{@code byte}配列。
     * */
    static byte[] createSalt() {
        return createSalt(64);
    }

    public static byte[] createSalt(int saltlength) {
        if (saltlength < 1) {
            throw new IllegalArgumentException();
        }
        byte[] salt = new byte[saltlength];
        createSalt(salt);
        return salt;
    }

    public static void createSalt(byte[] salt) {
        SecureRandomCache.getInstance().nextBytes(salt);
    }

    static byte[] pbkdf2(char[] password, byte[] salt)
            throws InvalidKeySpecException {
        // 繰り返し回数：65535回、結果の長さ：256bit
        KeySpec ks = new PBEKeySpec(password, salt, 0xffff,512);
        SecretKey sk = SecretKeyFactoryCache.getCache().generateSecret(ks);
        return sk.getEncoded();
    }

    // 補助
    private static void printfln(String format, Object... args) {
        System.out.printf(format + "%n", args);
    }

    private static class SecretKeyFactoryCache {
        private static SecretKeyFactory cache;

        private SecretKeyFactoryCache() {
        }

        public static SecretKeyFactory getCache() {
            if (cache == null) {
                try {
                    cache = SecretKeyFactory
                            .getInstance("PBKDF2WithHmacSHA512");
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
            return cache;
        }
    }

}