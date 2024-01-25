package com.twitter.teruteru128.encode;

import java.math.BigInteger;

public class Base32 {
    private static final char[] Base32Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray();
    private static final BigInteger BASE = BigInteger.valueOf(32);

    public static String encode(byte[] a) {
        // FIXME 本当はビット演算でやるんだろうな
        StringBuilder sb = new StringBuilder();
        BigInteger i = new BigInteger(1, a);
        while (i.compareTo(BigInteger.ZERO) > 0) {
            var dr = i.divideAndRemainder(BASE);
            sb.append(Base32Alphabet[dr[1].intValue()]);
            i = dr[0];
        }
        return sb.reverse().toString();
    }


}
