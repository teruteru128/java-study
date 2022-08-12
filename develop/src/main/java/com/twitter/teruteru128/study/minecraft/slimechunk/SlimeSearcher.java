package com.twitter.teruteru128.study.minecraft.slimechunk;

import java.util.BitSet;

public class SlimeSearcher {
  public static void main(String[] args) {
    long seed_MIN = 0;
    long seed_MAX = (1 << 48) - 1;
    int lengthofsideofsquare = 625;
    BitSet chunkset = new BitSet(lengthofsideofsquare * lengthofsideofsquare);
    SlimeBitSetGenerator generator = new SlimeBitSetGenerator(lengthofsideofsquare);
    for (long seed = 0; seed < seed_MAX; seed++) {
      //generator.generate(seed);
    }
  }
}
