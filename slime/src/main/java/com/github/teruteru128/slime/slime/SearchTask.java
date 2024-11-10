package com.github.teruteru128.slime.slime;

import java.util.BitSet;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

public class SearchTask implements Callable<Result> {

  private final SearchContext context;

  public SearchTask(SearchContext context) {
    this.context = context;
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
    var i = z * 625 + x;
    return set.get(i + 1878) && set.get(i + 1877) && set.get(i + 1876) && set.get(i + 1875)
           && set.get(i + 1253) && set.get(i + 1252) && set.get(i + 1251) && set.get(i + 1250)
           && set.get(i + 628) && set.get(i + 627) && set.get(i + 626) && set.get(i + 625)
           && set.get(i + 3) && set.get(i + 2) && set.get(i + 1) && set.get(i);
  }

  public static boolean isSlimeChunk(Random random, long seed, long chunkX, long chunkZ) {
    random.setSeed(
        seed + (int) (chunkX * 0x5ac0db) + (int) (chunkX * chunkX * 0x4c1906) + (int) (chunkZ
                                                                                       * 0x5f24f)
        + (int) (chunkZ * chunkZ) * 0x4307a7L ^ 0x3ad8025fL);
    return random.nextInt(10) == 0;
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
    while (true) {
      worldSeed = worldSeedGenerator.getAndIncrement();
      // キャッシュを埋める
      for (z = 0; z < 625; z++) {
        for (x = 0; x < 625; x++) {
          bitSet.set(z * 625 + x, isSlimeChunk(random, worldSeed, x - 312, z - 312));
        }
      }
      for (z = 621; z >= 0; z--) {
        for (x = 621; x >= 0; x--) {
          if (extracted(bitSet, x, z)) {
            return new Result(worldSeed, x, z);
          }
        }
      }
      if ((worldSeed & 0xfffL) == 0xfffL) {
        System.err.printf("done: %d%n", worldSeed);
      }
    }
  }

}
