package com.twitter.teruteru128.study;

import java.util.Arrays;
import java.util.HexFormat;
import java.util.Random;
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

    private static long calcSeed(long worldSeed, int x, int z) {
        return worldSeed + (int) (x * x * 0x4c1906) + x * 0x5ac0db + (int) (z * z) * 0x4307a7L + (int) (z * 0x5f24f)
                ^ 0x3ad8025fL;
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var random = new Random();
        for (int z = -48; z < -44; z++) {
            for (int x = 129; x < 133; x++) {
                long seed = calcSeed(263622805221400L, x, z);
                random.setSeed(seed);
                System.out.printf("%d, %d, %d, %b%n", x, z, seed, random.nextInt(10) == 0);
            }
        }
    }

    /**
     * スライムチャンク探索におけるシード開始位置抽選
     */
    public static void choice() {
        for (long seed : choiceSeeds(16, 0x100000000L)) {
            System.out.println(seed);
        }
    }

    private static long[] choiceSeeds(int seedNum, long minToExclude) {
        var seeds = new long[seedNum];
        for (int i = 0; i < seedNum; i++) {
            do {
                seeds[i] = (long) ThreadLocalRandom.current().nextInt(65536) << 32;
            } while (seeds[i] < minToExclude);
        }
        Arrays.sort(seeds);
        return seeds;
    }

    /**
     * @see {@link String#join(String, String, String, String[], int)}
     * @param num
     * @param faces
     * @return
     */
    public static void _3d6(int num, int faces) {
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
