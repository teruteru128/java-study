package com.twitter.teruteru128.study;

public class NLZSample {

    public static void main(String[] args) {
        var buf = new byte[32];
        var nlz = 0;
        var nlzbytes = 0;
        var nlzbits = 0;
        for (nlzbytes = 0; buf[nlzbytes] == 0 && nlzbytes < 64; nlzbytes++)
            ;
        nlzbits = Integer.numberOfLeadingZeros(buf[nlzbytes] & 0xff) - 24;
        nlz = nlzbytes * 8 + nlzbits;
        System.out.println(nlz);
    }
}
