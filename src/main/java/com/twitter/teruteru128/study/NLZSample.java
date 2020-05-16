package com.twitter.teruteru128.study;

class NLZSample {

    public static void main(String[] args) {
        byte[] buf = new byte[32];
        int nlz = 0;
        int nlzbytes = 0;
        int nlzbits = 0;
        for (nlzbytes = 0; buf[nlzbytes] == 0 && nlzbytes < 64; nlzbytes++) {
        }
        nlzbits = Integer.numberOfLeadingZeros(buf[nlzbytes] & 0xff) - 24;
        nlz = nlzbytes * 8 + nlzbits;
        System.out.println(nlz);
    }
}
