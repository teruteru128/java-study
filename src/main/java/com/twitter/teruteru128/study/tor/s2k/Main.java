package com.twitter.teruteru128.study.tor.s2k;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import com.twitter.teruteru128.study.crypto.DataPrinter;

/**
 * test -> 16:17AEC9679C42F075600CF835CE02ECAB6D297F27D233E150D3EA71DB9A
 * 
 * @see https://gist.github.com/antitree/3962751/d7110ef3767f64b1f10750da6ddf0a7ad4337709
 * @see https://github.com/torproject/tor/blob/4f02812242d1fd90d859eb98ac3fb1ed182f18cf/src/lib/crypt_ops/crypto_s2k.c#L203
 */
class Main {

    public static void main(String[] args) {
        System.out.println(genHashedPassword("unchi".getBytes()));
    }
    private static final int EXPBIAS = 6;

    public static String genHashedPassword(byte[] secret) {
        SecureRandom random = new SecureRandom();
        char indicator = (char) 0x60;

        byte[] salt = new byte[9];
        random.nextBytes(salt);
        salt[8] = (byte) indicator;

        String prefix = "16:";
        int c = salt[8];
        int count = (16 + (c & 15)) << ((c >> 4) + EXPBIAS);
        System.out.println(count);
        MessageDigest d = null;
        try {
            d = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] tmp = new byte[8 + secret.length];
        System.arraycopy(salt, 0, tmp, 0, 8);
        System.arraycopy(secret, 0, tmp, 8, secret.length);

        int slen = tmp.length;
        while (count > 0) {
            if (count >= slen) {
                d.update(tmp);
                count -= slen;
            } else {
                d.update(tmp, 0, count);
                count = 0;
            }
        }
        byte[] hashed = new byte[9 + d.getDigestLength()];
        System.arraycopy(salt, 0, hashed, 0, 9);
        try {
            d.digest(hashed, 9, d.getDigestLength());
        } catch (DigestException e) {
            e.printStackTrace();
        }
        /*
         * #Convert to hex salt = binascii.b2a_hex(salt[:8]).upper() indicator =
         * binascii.b2a_hex(indicator) torhash = binascii.b2a_hex(hashed).upper()
         * 
         * #Put it all together into the proprietary Tor format. print(prefix + salt +
         * torhash)
         */
        return prefix + DataPrinter.printHexBinary(hashed).toUpperCase();
    }
}
