package com.twitter.teruteru128.study.rsa.gen005;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) throws Exception {
        SecureRandom random = SecureRandom.getInstanceStrong();
        byte[] key = new byte[1 << 24];
        key[0] = (byte)0x80;
        System.out.println(new BigInteger(1, key).bitLength());
        random.nextBytes(key);
        key[0] |= 0x80;
        var p = new BigInteger(1, key);
        random.nextBytes(key);
        System.out.println(p.bitLength());
        key[0] |= 0x80;
        var q = new BigInteger(1, key);
        System.out.println(q.bitLength());
        var n = p.multiply(q);
        System.out.println(n.bitLength());
    }

}
