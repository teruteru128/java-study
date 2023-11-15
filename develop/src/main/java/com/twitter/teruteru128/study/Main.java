package com.twitter.teruteru128.study;

import java.util.HexFormat;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Main
 */
public class Main {

    public static final HexFormat format = HexFormat.of();

    static {
        try {
            Class.forName("com.twitter.teruteru128.study.BCProviderLoader");
        } catch (ClassNotFoundException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var p = ThreadLocalRandom.current().nextInt(216);
        var array = new int[3];
        var sum = 0;
        for (int i = 0; i < 3; i++) {
            array[i] = (p % 6) + 1;
            p /= 6;
            sum += array[i];
        }
        System.out.printf("[%d, %d, %d]%n", array[0], array[1], array[2]);
        System.out.printf("%d%n", sum);
    }
}
