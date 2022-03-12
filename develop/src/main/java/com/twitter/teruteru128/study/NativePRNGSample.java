package com.twitter.teruteru128.study;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class NativePRNGSample implements Runnable {
    public void run() {
        try {
            Random random = SecureRandom.getInstance("NativePRNG");
            System.out.print((char) random.nextInt('A', 'Z'));
            System.out.print((char) random.nextInt('A', 'Z'));
            System.out.print((char) random.nextInt('A', 'Z'));
            System.out.println((char) random.nextInt('A', 'Z'));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
