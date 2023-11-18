package com.twitter.teruteru128.slime;

import java.util.BitSet;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

public class SearchTask implements Callable<Result> {

    private SearchContext context;

    public SearchTask(SearchContext context) {
        this.context = context;
    }

    @Override
    public Result call() throws Exception {
        var bitSet = new BitSet(625 * 625);
        var random = new Random(0);
        int z = 0;
        int x = 0;
        Result r = null;
        AtomicLong worldSeedGenerator = context.getWorldSeed();
        long worldSeed = 0;
        boolean found = false;
        while (r == null) {
            worldSeed = worldSeedGenerator.getAndIncrement();
            for (z = 0; z < 625; z++) {
                for (x = 0; x < 625; x++) {
                    random.setSeed(calcSeed(worldSeed, x - 312, z - 312));
                    bitSet.set(z * 625 + x, random.nextInt(10) == 0);
                }
            }
            found = false;
            for (z = 622; z >= 0; z--) {
                for (x = 622; x >= 0; x--) {
                    found |= extracted(bitSet, x, z);
                }
            }
            if (found) {
                r = new Result(worldSeed, 0, 0);
            }
            if ((worldSeed & 0xfffL) == 0xfffL) {
                System.err.printf("done: %d%n", worldSeed);
            }
        }
        return r;
    }

    /**
     * Cだと long *とxとzなんだろうな
     * 
     * @param set
     * @param x
     * @param z
     * @return
     */
    private static boolean extracted(BitSet set, int x, int z) {
        return set.get((z + 3) * 625 + x + 3)
                && set.get((z + 3) * 625 + x + 2)
                && set.get((z + 3) * 625 + x + 1)
                && set.get((z + 3) * 625 + x + 0)
                && set.get((z + 2) * 625 + x + 3)
                && set.get((z + 2) * 625 + x + 2)
                && set.get((z + 2) * 625 + x + 1)
                && set.get((z + 2) * 625 + x + 0)
                && set.get((z + 1) * 625 + x + 3)
                && set.get((z + 1) * 625 + x + 2)
                && set.get((z + 1) * 625 + x + 1)
                && set.get((z + 1) * 625 + x + 0)
                && set.get((z + 0) * 625 + x + 3)
                && set.get((z + 0) * 625 + x + 2)
                && set.get((z + 0) * 625 + x + 1)
                && set.get((z + 0) * 625 + x + 0);
    }

    private static long calcSeed(long worldSeed, int x, int z) {
        return worldSeed + (int) (x * x * 0x4c1906) + x * 0x5ac0db + (int) (z * z) * 0x4307a7L + (int) (z * 0x5f24f)
                ^ 0x3ad8025fL;
    }

}
