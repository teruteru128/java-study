package com.twitter.teruteru128.study;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Main
 */
public class Main {

    public static void main(String[] args)
            throws IOException, NoSuchAlgorithmException {
        SecureRandom random = SecureRandom.getInstance("Windows-PRNG");
        byte[] seedBuf = random.generateSeed(536870912);
        System.out.write(seedBuf);
    }
}
