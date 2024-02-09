package com.twitter.teruteru128.study;

import java.security.SecureRandom;

/**
 * とらのあな専用パスワードジェネレータ
 * とらのあな絶対許さねえ
 */
public class ToranoanaPasswordGenerator implements PasswordGenerator {

    @Override
    public char[] generatePassword(int length) {
        byte[] buf = new byte[length];
        char[] buff = new char[length];
        new SecureRandom().nextBytes(buf);
        final char[] p = "-_.".toCharArray();
        for (int iter = 0; iter < length; iter++) {
            int i = (buf[iter] & 0xff) % 65;
            if (i < 10) {
                buff[iter] = (char) ('0' + i);
            } else if (i < 36) {
                buff[iter] = (char) ('A' + i - 10);
            } else if (i < 62) {
                buff[iter] = (char) ('a' + i - 36);
            } else {
                buff[iter] = p[i - 62];
            }
        }
        return buff;
    }

}
