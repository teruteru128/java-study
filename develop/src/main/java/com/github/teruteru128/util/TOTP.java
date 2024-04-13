package com.github.teruteru128.util;
/**
Copyright (c) 2011 IETF Trust and the persons identified as
authors of the code. All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, is permitted pursuant to, and subject to the license
terms contained in, the Simplified BSD License set forth in Section
4.c of the IETF Trust's Legal Provisions Relating to IETF Documents
(http://trustee.ietf.org/license-info).
*/

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HexFormat;

/**
 * This is an example implementation of the OATH
 * TOTP algorithm.
 * Visit www.openauthentication.org for more information.
 *
 * @author Johan Rydell, PortWise, Inc.
 */

public class TOTP {

    public static final HexFormat OF = HexFormat.of();

    private TOTP() {}

    /**
     * This method uses the JCE to provide the crypto algorithm.
     * HMAC computes a Hashed Message Authentication Code with the
     * crypto hash algorithm as a parameter.
     *
     * @param crypto: the crypto algorithm (HmacSHA1, HmacSHA256,
     *                             HmacSHA512)
     * @param keyBytes: the bytes to use for the HMAC key
     * @param text: the message or text to be authenticated
     */

    private static byte[] hmac_sha(String crypto, byte[] keyBytes,
            byte[] text){
        try {
            Mac hmac;
            hmac = Mac.getInstance(crypto);
            SecretKeySpec macKey =
                new SecretKeySpec(keyBytes, "RAW");
            hmac.init(macKey);
            return hmac.doFinal(text);
        } catch (GeneralSecurityException gse) {
            throw new UndeclaredThrowableException(gse);
        }
    }


    private static final int[] DIGITS_POWER
    // 0 1  2   3    4     5      6       7        8
    = {1,10,100,1000,10000,100000,1000000,10000000,100000000 };

    /**
     * This method generates a TOTP value for the given
     * set of parameters.
     *
     * @param key: the shared secret, HEX encoded
     * @param time: a value that reflects a time
     * @param returnDigits: number of digits to return
     *
     * @return: a numeric String in base 10 that includes
     *              {@link truncationDigits} digits
     */

    public static String generateTOTP(String key, long time, int returnDigits){
        return generateTOTP(key, time, returnDigits, "HmacSHA1");
    }

    /**
     * This method generates a TOTP value for the given
     * set of parameters.
     *
     * @param key: the shared secret, HEX encoded
     * @param time: a value that reflects a time
     * @param returnDigits: number of digits to return
     *
     * @return: a numeric String in base 10 that includes
     *              {@link truncationDigits} digits
     */
    public static String generateTOTP256(String key, long time, int returnDigits){
        return generateTOTP(key, time, returnDigits, "HmacSHA256");
    }

    /**
     * This method generates a TOTP value for the given
     * set of parameters.
     *
     * @param key: the shared secret, HEX encoded
     * @param time: a value that reflects a time
     * @param returnDigits: number of digits to return
     *
     * @return: a numeric String in base 10 that includes
     *              {@link truncationDigits} digits
     */

    public static String generateTOTP512(String key, long time, int returnDigits){
        return generateTOTP(key, time, returnDigits, "HmacSHA512");
    }

    private static String padding(String val, int length, char pad) {
        int targetLength = val.length();
        if(targetLength >= length)
            return val;
        var paddingLength = length - targetLength;
        char[] array = new char[length];
        Arrays.fill(array, 0, paddingLength, pad);
        System.arraycopy(val.toCharArray(), 0, array, paddingLength, targetLength);
        return new String(array);
    }

    /**
     * This method generates a TOTP value for the given
     * set of parameters.
     *
     * @param key: the shared secret, HEX encoded
     * @param time: a value that reflects a time
     * @param returnDigits: number of digits to return
     * @param crypto: the crypto function to use
     *
     * @return: a numeric String in base 10 that includes
     *              {@link truncationDigits} digits
     */

    public static String generateTOTP(String key, long time, int returnDigits, String crypto){

        byte[] msg = ByteBuffer.allocate(8).putLong(time).array();
        byte[] k = OF.parseHex(key);

        // 共有秘密をキーに、時刻をメッセージとしてhash macを計算する
        byte[] hash = hmac_sha(crypto, k, msg);

        // put selected bytes into result int
        int offset = hash[hash.length - 1] & 0xf;

        int binary = ByteBuffer.wrap(hash).getInt(offset) & 0x7fffffff;

        // otp = binary % (int) Math.pow(returnDigits)
        int otp = binary % DIGITS_POWER[returnDigits];

        return padding(Integer.toString(otp), returnDigits, '0');
    }

    public static void main(String[] args) {
        // Seed for HMAC-SHA1 - 20 bytes
        String seed = "3132333435363738393031323334353637383930";
        // Seed for HMAC-SHA256 - 32 bytes
        String seed32 = "3132333435363738393031323334353637383930" +
        "313233343536373839303132";
        // Seed for HMAC-SHA512 - 64 bytes
        String seed64 = "3132333435363738393031323334353637383930" +
        "3132333435363738393031323334353637383930" +
        "3132333435363738393031323334353637383930" +
        "31323334";
        String seed1 = "75656d657a643374706d356872356f6c63326e723766326d7833747578627734";
        long T0 = 0;
        long X = 30;
        long[] testTime = {59L, 1111111109L, 1111111111L,
                1234567890L, 2000000000L, 20000000000L, Instant.now().getEpochSecond()};

        var df2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneOffset.UTC);

        try {
            System.out.println("+---------------+-----------------------+------------------+----------+--------+");
            System.out.println("|  Time(sec)    |   Time (UTC format)   | Value of T(Hex)  |   TOTP   | Mode   |");
            System.out.println("+---------------+-----------------------+------------------+----------+--------+");

            for (long l : testTime) {
                long T = (l - T0) / X;
                String utcTime = df2.format(Instant.ofEpochSecond(l));
                System.out.printf("|  %-11s  |  %s  | %016X | ", l, utcTime, T);
                System.out.println(generateTOTP(seed, T, 8, "HmacSHA1") + " | SHA1   |");
                System.out.printf("|  %-11s  |  %s  | %016X | ", l, utcTime, T);
                System.out.printf("%8s | SHA1   |%n", generateTOTP(seed, T, 6, "HmacSHA1"));
                System.out.printf("|  %-11s  |  %s  | %016X | ", l, utcTime, T);
                System.out.printf("%8s | SHA1   |%n", generateTOTP(seed1, T, 6, "HmacSHA1"));
                System.out.printf("|  %-11s  |  %s  | %016X | ", l, utcTime, T);
                System.out.println(generateTOTP(seed32, T, 8, "HmacSHA256") + " | SHA256 |");
                System.out.printf("|  %-11s  |  %s  | %016X | ", l, utcTime, T);
                System.out.println(generateTOTP(seed64, T, 8, "HmacSHA512") + " | SHA512 |");
                System.out.println("+---------------+-----------------------+------------------+----------+--------+");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

