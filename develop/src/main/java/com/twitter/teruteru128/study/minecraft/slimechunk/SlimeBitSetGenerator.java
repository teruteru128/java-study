package com.twitter.teruteru128.study.minecraft.slimechunk;

import java.util.BitSet;

public class SlimeBitSetGenerator {
  private final int lengthofsideofsquare;
  private final int offset;
  private final SlimeChunkOracle oracle = new SlimeChunkOracle();

  public SlimeBitSetGenerator(int lengthofsideofsquare) {
    super();
    if (lengthofsideofsquare <= 0) {
      throw new IllegalArgumentException("");
    }

    this.lengthofsideofsquare = lengthofsideofsquare;
    this.offset = lengthofsideofsquare / 2;
  }

  void generate(long seed, BitSet chunkSet) {
    oracle.setSeed(seed);
    chunkSet.clear();

    for (int z = -offset; z <= offset; z++) {
      for (int x = -offset; x <= offset; x++) {
        if (oracle.isSlimeChunk(x, z))
          chunkSet.set((x + offset) * lengthofsideofsquare + z + offset);
      }
    }
  }
}
