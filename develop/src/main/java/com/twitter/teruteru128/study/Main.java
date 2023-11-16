package com.twitter.teruteru128.study;

import java.util.HexFormat;
import java.util.StringJoiner;
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
    }

    /**
     * @see {@link String#join(String, String, String, String[], int)}
     * @param num
     * @param faces
     * @return
     */
    private static void _3d6(int num, int faces) {
        var p = ThreadLocalRandom.current().nextLong((long) Math.pow(faces, num));
        var array = new long[num];
        var sum = 0;
        var joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < num; i++) {
            array[i] = (p % faces) + 1;
            joiner.add(Long.toString(array[i]));
            p /= faces;
            sum += array[i];
        }
        System.out.printf("%s%n", joiner);
        System.out.printf("%d%n", sum);
    }
}
