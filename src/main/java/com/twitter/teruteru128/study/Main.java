package com.twitter.teruteru128.study;

import java.util.Random;

/**
 * Main
 * Slime miner(作りかけ)
 */
public class Main {

    static boolean isSlimeChunk(Random random, long seed, int x, int z) {
        random.setSeed(seed + memoX[x + 625] + memoZ[z + 625]);
        return random.nextInt(10) == 0;
    }

    private static final int[] memoX = new int[1250];
    private static final int[] memoZ = new int[1250];

    static {
        for (int i = 0, offsetI, i2; i < 1250; i++) {
            offsetI = i - 625;
            i2 = offsetI * offsetI;
            memoX[i] = i2 * 0x4c1906 + offsetI * 0x5ac0db;
            memoZ[i] = (int) (i2 * 0x4307a7L) + (offsetI * 0x5f24f) ^ 0x3ad8025f;
        }
    }

    /**
     * @param random
     * @param seed
     * @param x
     * @param z
     * @param sign -1 -> north, 1 -> south
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
        long prevseed1 = 0;
        long prevseed2 = 0;
        seed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL;
        System.out.printf("%d%n", seed);
        seed = 246345201500483L ^ 0x5DEECE66DL;
        seed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL;
        System.out.printf("%012x%n", seed);
        seed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL;
        System.out.printf("%012x%n", seed);
        seed = 0;
        seed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
        System.out.printf("%d%n", seed);
        System.out.printf("%d%n", seed ^ 0x5DEECE66DL);
        seed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
        seed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
        System.out.printf("%d%n", seed ^ 0x5DEECE66DL);
        seed = 0x4498;
        seed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
        seed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
        System.out.printf("0x4498 -> %d%n", seed);
        System.out.printf("0x4498 -> %d%n", seed ^ 0x5DEECE66DL);
        System.out.printf("0x4498 -> %012x%n", seed);
        System.out.printf("0x4498 -> %012x%n", seed & 0x0000ffff0000L);
        System.out.printf("0x4498 -> %012x%n", seed ^ 0x5DEECE66DL);
        Random random = new Random();
        random.setSeed(246345201500483L);
        System.out.printf("%x%n", random.nextLong());
        System.out.printf("%x%n", random.nextLong());
        random.setSeed(164311266871034L);
        System.out.printf("%a%n", random.nextDouble());
        System.out.printf("%a%n", random.nextDouble());
        random.setSeed(74803317123181L);
        System.out.printf("74803317123181: %012x%n", random.nextLong());
        System.out.printf("74803317123181: %012x%n", random.nextLong());
        random.setSeed(74803317123181L);
        System.out.printf("74803317123181: %f%n", random.nextDouble());
        System.out.printf("74803317123181: %f%n", random.nextDouble());

        for (long i = 0x0000_0000_0000L; i < 0x0000_0001_0000L; i++) {
            seed = 0xffff_ffff_0000L + i;
            prevseed1 = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
            if ((prevseed1 & 0x0000_ffff_0000L) == 0x0000_0000_0000L) {
                prevseed2 = (prevseed1 - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
                System.out.printf("d : %d%n", prevseed2 ^ 0x5DEECE66DL);
                random.setSeed(prevseed2 ^ 0x5DEECE66DL);
                System.out.printf("d : %012x%n", random.nextLong());
                System.out.printf("d : %012x%n", random.nextLong());
                random.setSeed(prevseed2 ^ 0x5DEECE66DL);
                System.out.printf("d : %a%n", random.nextDouble());
                System.out.printf("d : %a%n", random.nextDouble());
            }
        }
        /** -626 ~ 625 */
        int world_cursol_x;
        /** -626 ~ 625 */
        int world_cursol_z;
        int count = 0;
        // ブランチマイニング
        for (world_cursol_z = -625; world_cursol_z < 625; world_cursol_z += 5) {
            for (world_cursol_x = -625; world_cursol_x < 625; world_cursol_x++) {

                if (isSlimeChunk(random, seed, world_cursol_x, world_cursol_z)) {
                    count++;
                    if (count == 5) {
                        searchBranch(random, seed, world_cursol_x, world_cursol_z, 1);
                        searchBranch(random, seed, world_cursol_x, world_cursol_z, -1);
                    }
                } else {
                    count = 0;
                }
            }
        }
    }
}
