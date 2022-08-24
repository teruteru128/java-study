package com.twitter.teruteru128.study;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import com.twitter.teruteru128.study.bitmessage.KeyPair;
import com.twitter.teruteru128.study.bitmessage.KeyPairComparator;

/**
 * Main
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ArrayList<KeyPair> keyPairs = new ArrayList<>(16777216 * 8);
        byte[] publicKey = new byte[65];
        byte[] privateKey = new byte[65];
        for (int i = 0; i < 8; i++) {
            try (BufferedInputStream pubStream = new BufferedInputStream(
                    new FileInputStream(new File("../publicKeys" + i + ".bin")), 1048576);
                    BufferedInputStream priStream = new BufferedInputStream(
                            new FileInputStream(new File("../privateKeys" + i + ".bin")), 1048576)) {
                for (int j = 0; j < 16777216; j++) {
                    pubStream.read(publicKey);
                    priStream.read(privateKey);
                    keyPairs.add(new KeyPair(privateKey, publicKey));
                }
            }
            System.out.printf("%d完%n", i);
        }
        keyPairs.sort(new KeyPairComparator());
        /*
         * for (KeyPair p : keyPairs) {
         * 
         * }
         */
    }
}
