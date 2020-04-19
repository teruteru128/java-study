package com.twitter.teruteru128.study.seven;

import java.nio.charset.Charset;

public class CoDec {

    public static String encode(String a) {
        byte[] b = a.getBytes(Charset.forName("SJIS"));
        StringBuilder c = new StringBuilder(b.length * 8);
        for (byte d : b) {
            for (int i = 0; i <= 7; i++) {
                c.append((char) ((d >> i & 0x01) + 0x30));
            }
        }
        return c.toString();
    }

    public static String decode(String a) {
        int length = a.length();
        byte[] b = new byte[length / 8];
        for (int i = 0; i < length; i++) {
            char d = a.charAt(i);
            b[i / 8] |= (d & 0x01) << (i % 8);
        }
        return new String(b, Charset.forName("SJIS"));
    }

}
