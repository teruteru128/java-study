package com.github.teruteru128.security;

import java.time.Instant;
import java.util.Base64;
import java.util.HexFormat;

public class RandomFromNanos {
    public static void main(String[] args) {
        if (args.length >= 1) {
            System.out.println(Base64.getEncoder().encodeToString(HexFormat.of().parseHex(args[0])));
        }
        var data = new byte[64];
        for (int i = 0; i < 64; i++) {
            data[i] = (byte) (Instant.now().getNano() & 0xff);
        }
        System.out.println(Base64.getEncoder().encodeToString(data));
        for (int i = 0; i < 64; i++) {
            data[i] = (byte) ((Instant.now().getNano() >> 1) & 0xff);
        }
        System.out.println(Base64.getEncoder().encodeToString(data));
    }
}
