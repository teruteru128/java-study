package com.twitter.teruteru128.study;

import java.security.SecureRandom;
import java.util.Random;

public class Study {
    public static void main(String[] args) throws Exception {
        Random random = SecureRandom.getInstance("NativePRNG");
        System.out.print('A' + random.nextInt(26));
        System.out.print('A' + random.nextInt(26));
        System.out.print('A' + random.nextInt(26));
        System.out.println('A' + random.nextInt(26));
    }
}
