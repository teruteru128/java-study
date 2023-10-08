package com.twitter.teruteru128.study;

import java.util.BitSet;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class SearchTask implements Callable<Optional<Result>> {

    @Override
    public Optional<Result> call() throws Exception {
        var bitSet = new BitSet(625 * 625);
        bitSet.clear();
        var oracle = new Random(0);
        for (long mcseed = ThreadLocalRandom.current()
                .nextLong(281474976710656L); mcseed < 281474976710656L; mcseed++) {
            for (int z = 0; z < 625; z++) {
                for (int x = 0; x < 625; x++) {
                    oracle.setSeed(calcSeed(mcseed, x - 312, z - 312));
                    bitSet.set(z * 625 + x, oracle.nextInt(10) == 0);
                }
            }
            for (int x = 0; x < 622; x++) {
                for (int z = 0; z < 622; z++) {
                    if (bitSet.get((z + 0) * 625 + x + 0) && bitSet.get((z + 0) * 625 + x + 1)
                            && bitSet.get((z + 0) * 625 + x + 2) && bitSet.get((z + 0) * 625 + x + 3)
                            && bitSet.get((z + 1) * 625 + x + 0) && bitSet.get((z + 1) * 625 + x + 1)
                            && bitSet.get((z + 1) * 625 + x + 2) && bitSet.get((z + 1) * 625 + x + 3)
                            && bitSet.get((z + 2) * 625 + x + 0) && bitSet.get((z + 2) * 625 + x + 1)
                            && bitSet.get((z + 2) * 625 + x + 2) && bitSet.get((z + 2) * 625 + x + 3)
                            && bitSet.get((z + 3) * 625 + x + 0) && bitSet.get((z + 3) * 625 + x + 1)
                            && bitSet.get((z + 3) * 625 + x + 2) && bitSet.get((z + 3) * 625 + x + 3)) {
                        return Optional.of(new Result(mcseed, x, z));
                    }
                }
            }
        }
        return Optional.empty();
    }

    private static long calcSeed(long mcseed, int x, int z) {
        return mcseed + (int) (x * x * 0x4c1906) + x * 0x5ac0db + (int) (z * z) * 0x4307a7L + (int) (z * 0x5f24f)
                ^ 0x3ad8025fL;
    }

}
