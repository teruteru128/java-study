package com.twitter.teruteru128.study;

import java.lang.reflect.UndeclaredThrowableException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

class TOTP {
    private byte[] key;
    private int returnDigits;
    private String algorithm;
    private long x;

    private static byte[] hmac(String algorithm, byte[] key, byte[] text) {
        try {
            Mac hmac = Mac.getInstance(algorithm);
            SecretKeySpec macKey = new SecretKeySpec(key, "RAW");
            hmac.init(macKey);
            return hmac.doFinal(text);
        } catch (GeneralSecurityException gse) {
            throw new UndeclaredThrowableException(gse);
        }
    }

    private static final int[] DIGITS_POWER = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000,
            1000000000 };

    public TOTP(byte[] key, int returnDigits, String algorithm, long x) {
        this.key = key.clone();
        this.returnDigits = returnDigits;
        this.algorithm = algorithm;
        this.x = x;
    }

    public TOTP(byte[] key, int returnDigits, String algorithm) {
        this(key, returnDigits, algorithm, 30);
    }

    public TOTP(byte[] key) {
        this(key, 6, "HmacSHA1");
    }

    public String generate(long time) {
        byte[] msg = ByteBuffer.allocate(8).putLong(time).array();
        byte[] mac = hmac(algorithm, key, msg);
        int offset = mac[mac.length - 1] & 0xf;
        int binary = ((mac[offset] & 0x7f) << 24) |
                ((mac[offset + 1] & 0xff) << 16) |
                ((mac[offset + 2] & 0xff) << 8) |
                (mac[offset + 3] & 0xff);
        int otp = binary % DIGITS_POWER[returnDigits];
        return String.format("%%0%dd", returnDigits).formatted(otp);
    }

}
