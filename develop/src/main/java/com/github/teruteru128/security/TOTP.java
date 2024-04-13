package com.github.teruteru128.security;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Arrays;

class TOTP {
    private static final int[] DECIMAL_MASK = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000,
            1000000000};
    private final byte[] key;
    private final int returnDigits;
    private final String algorithm;
    private final long t0;
    private final long x;

    public TOTP(byte[] key, int returnDigits, String algorithm, long t0, long x) {
        this.key = key.clone();
        this.returnDigits = returnDigits;
        this.algorithm = algorithm;
        this.t0 = t0;
        this.x = x;
    }

    public TOTP(byte[] key, int returnDigits, String algorithm) {
        this(key, returnDigits, algorithm, 0, 30);
    }

    public TOTP(byte[] key) {
        this(key, 6, "HmacSHA1");
    }

    private static byte[] hmac(String algorithm, byte[] key, byte[] text) {
        try {
            Mac hmac = Mac.getInstance(algorithm);
            SecretKeySpec macKey = new SecretKeySpec(key, "RAW");
            hmac.init(macKey);
            return hmac.doFinal(text);
        } catch (NoSuchAlgorithmException | InvalidKeyException gse) {
            throw new UndeclaredThrowableException(gse);
        }
    }

    private static String padding(String val, int length, char pad) {
        int targetLength = val.length();
        if (targetLength >= length)
            return val;
        var paddingLength = length - targetLength;
        char[] array = new char[length];
        Arrays.fill(array, 0, paddingLength, pad);
        System.arraycopy(val.toCharArray(), 0, array, paddingLength, targetLength);
        return new String(array);
    }

    public String generate(long time) {
        byte[] msg = ByteBuffer.allocate(8).putLong((time - t0) / x).array();
        byte[] mac = hmac(algorithm, key, msg);
        int offset = mac[mac.length - 1] & 0xf;
        /* 
        int binary = ((mac[offset] & 0x7f) << 24) |
                ((mac[offset + 1] & 0xff) << 16) |
                ((mac[offset + 2] & 0xff) << 8) |
                (mac[offset + 3] & 0xff);
         */
        int binary = ByteBuffer.wrap(mac).getInt(offset) & 0x7fffffff;
        int otp = binary % DECIMAL_MASK[returnDigits];
        return padding(Integer.toString(otp), returnDigits, '0');
    }

    public String generate(Instant time) {
        return generate(time.getEpochSecond());
    }

}
