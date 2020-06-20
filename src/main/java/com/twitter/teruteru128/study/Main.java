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
        /** -626 ~ 625 */
        int world_cursol_x;
        /** -626 ~ 625 */
        int world_cursol_z;
        // 0 ~ 0xFFFFFFFFFFFF;
        long seed = 0;
        int count = 0;
        Random random = new Random();
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
