package com.twitter.teruteru128.study;

import java.security.SecureRandom;

public class ToranoanaPasswordGenerator {

    public static char[] generatePassword(int length) {
        byte[] buf = new byte[length];
        char[] cbuf = new char[length];
        new SecureRandom().nextBytes(buf);
        final char[] p = "-_.".toCharArray();
        for (int iter = 0; iter < length; iter++) {
            int i = (int) ((buf[iter] & 0xff) % 65);
            if (i < 10) {
                cbuf[iter] = (char) ('0' + i);
            } else if (i < 36) {
                cbuf[iter] = (char) ('A' + i - 10);
            } else if (i < 62) {
                cbuf[iter] = (char) ('a' + i - 36);
            } else {
                cbuf[iter] = p[i - 62];
            }
        }
        return cbuf;
    }
    
}
