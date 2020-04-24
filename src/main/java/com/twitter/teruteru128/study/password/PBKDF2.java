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
 * @see <a href="http://d.hatena.ne.jp/penult/20120612/1339515650" target=
 *      "_blank">source</a>
 */
public class PBKDF2 {

    public static void main(String[] args) throws InvalidKeySpecException {
        String p1 = "孫に囲まれながら老衰で死ね";
        String p2 = "null";
        System.out.printf("password 1: %s%n", p1);
        System.out.printf("password 2: %s%n", p2);
        byte[] salt = null;
        // salt = createSalt();
        salt = DatatypeConverter.parseHexBinary("2EACA4E0E0624466A087D54369BCF936A15574D2D9C60F4CA456977CA36DECD6");
        System.out.printf("salt: %s%n", Arrays.toString(salt));
        System.out.printf("salt: %s%n", DatatypeConverter.printHexBinary(salt));

        byte[] d1 = pbkdf2(p1.toCharArray(), salt);
        System.out.println(Base64.getEncoder().encodeToString(d1));
        System.out.printf("length : %d%n", d1.length);
        System.out.printf("derived 1: %s%n", Arrays.toString(d1));
        System.out.printf("%s%n", DatatypeConverter.printHexBinary(d1));
        byte[] d2 = pbkdf2(p2.toCharArray(), salt);
        System.out.println(Base64.getEncoder().encodeToString(d2));
        System.out.printf("length : %d%n", d2.length);
        System.out.printf("derived 2: %s%n", Arrays.toString(d2));
        System.out.printf("%s%n", DatatypeConverter.printHexBinary(d2));
    }

    /**
     * ランダムなsaltを生成
     * 
     * @return 64byte,256bitのソルトの{@code byte}配列。
     */
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

    static byte[] pbkdf2(char[] password, byte[] salt) throws InvalidKeySpecException {
        // 繰り返し回数：65535回、結果の長さ：256bit
        KeySpec ks = new PBEKeySpec(password, salt, 0xffff, 512);
        SecretKey sk = SecretKeyFactoryCache.getCache().generateSecret(ks);
        return sk.getEncoded();
    }

    private static class SecretKeyFactoryCache {
        private static SecretKeyFactory cache;

        static {
            try {
                cache = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            } catch (NoSuchAlgorithmException e) {
            }
        }

        private SecretKeyFactoryCache() {
        }

        public static SecretKeyFactory getCache() {
            return cache;
        }
    }

}
