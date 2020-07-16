package com.twitter.teruteru128.study;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Random;

/**
 * Main Slime miner(作りかけ)
 */
public class Main {

    private static long s(long seed, int x, int z) {
        return seed + (int) (x * x * 0x4c1906) + (int) (x * 0x5ac0db) + (int) (z * z) * 0x4307a7L + (int) (z * 0x5f24f)
                ^ 0x3ad8025f;
    }

    private static long s1(long seed, int x, int z) {
        return (seed + memoX[x + 625] + memoZ[z + 625]) ^ 0x3ad8025f;
    }

    private static boolean isSlimeChunk(Random random, long seed, int x, int z) {
        random.setSeed(s1(seed, x, z));
        // random.setSeed(seed + (int) (x * x * 0x4c1906) + (int) (x * 0x5ac0db) + (int)
        // (z * z) * 0x4307a7L + (int) (z * 0x5f24f) ^ 0x3ad8025f);
        return random.nextInt(10) == 0;
    }

    private static final int[] memoX = new int[1250];
    private static final long[] memoZ = new long[1250];

    static {
        int offsetI, i2;
        for (int i = 0; i < 1250; i++) {
            offsetI = i - 625;
            i2 = offsetI * offsetI;
            memoX[i] = i2 * 0x4c1906;
            memoX[i] += offsetI * 0x5ac0db;
            memoZ[i] = i2 * 0x4307a7L + offsetI * 0x5f24f;
        }
    }

    /**
     * @param random
     * @param seed
     * @param x      湧き層の北西チャンクのxチャンク座標
     * @param z      湧き層の北西チャンクのzチャンク座標
     * @param sign   -1 -> north, 1 -> south
     */
    private static void searchBranch(Random random, long seed, int x, int z, int sign) {
        int spawn_floor_x;
        int spawn_floor_z;
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // 0 ~ 0xFFFFFFFFFFFF;
        long seed = 0;
        int x, z;
        long prevseed1 = 0;
        long prevseed2 = 0;
        Path out = Paths.get("out.txt");
        LinkedList<String> list = new LinkedList<>();
        for (seed = 0; seed < 1; seed++) {
            for (z = -625; z < 625; z++) {
                for (x = -625; x < 625; x++) {
                    list.add(Long.toString(s(seed, x, z)));
                }
            }
        }
        Files.write(out, list);
    }
}
