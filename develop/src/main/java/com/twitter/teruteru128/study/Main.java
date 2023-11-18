package com.twitter.teruteru128.study;

import static java.time.ZoneId.SHORT_IDS;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
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
        var cst = ZoneId.of("CST", SHORT_IDS);
        var launchtime = ZonedDateTime.of(2023, 11, 18, 7, 0, 0, 0, cst);
        var jst = ZoneId.of("JST", SHORT_IDS);
        var launchinjst = launchtime.withZoneSameInstant(jst);
        System.out.println(launchtime);
        System.out.println(launchinjst);
        var now = ZonedDateTime.now();
        System.out.println(Duration.between(now, launchinjst));
        choice();
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
