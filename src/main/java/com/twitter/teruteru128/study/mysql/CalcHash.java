package com.twitter.teruteru128.study.mysql;

import java.security.MessageDigest;

public class CalcHash{

    public static void main(String[] args) throws Exception {
        String password = "advanforce";
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        var hash = sha1.digest(sha1.digest(password.getBytes()));
        final var c = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder(41).append('*');
        for(byte b : hash){
            sb.append(c[(b>>4) & 0x0f]);
            sb.append(c[(b>>0) & 0x0f]);
        }
        System.out.println(sb.toString());
    }
}
