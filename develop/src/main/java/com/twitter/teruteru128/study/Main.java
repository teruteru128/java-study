package com.twitter.teruteru128.study;

import java.io.RandomAccessFile;
import java.util.Base64;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        long index = 86285626;
        long fileindex = index / 16777216;
        long keyindex = index % 16777216;
        try (RandomAccessFile file = new RandomAccessFile(String.format("publicKeys%d.bin", fileindex), "r")) {
            file.seek(keyindex * 65);
            byte[] publicKey = new byte[65];
            file.read(publicKey);
            System.out.println(Base64.getEncoder().encodeToString(publicKey));
        }
        System.out.println(index);
    }
}
