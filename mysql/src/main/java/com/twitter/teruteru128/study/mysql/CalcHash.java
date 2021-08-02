package com.twitter.teruteru128.study.mysql;

import java.security.MessageDigest;

public class CalcHash {

    private static final char[] C = "0123456789ABCDEF".toCharArray();

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var password = "Advanforce";
        var sha1 = MessageDigest.getInstance("SHA-1");
        var hash = sha1.digest(sha1.digest(password.getBytes()));
        StringBuilder sb = new StringBuilder(41).append('*');
        for (byte b : hash) {
            sb.append(C[(b >> 4) & 0x0f]);
            sb.append(C[(b >> 0) & 0x0f]);
        }
        System.out.println(sb.toString());
    }
}
