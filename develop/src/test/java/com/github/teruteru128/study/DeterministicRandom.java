package com.github.teruteru128.study;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.random.RandomGenerator;

// テスト用のスタブ実装
class DeterministicRandom implements RandomGenerator {

  private final Queue<Long> longValues = new ArrayDeque<>();
  private final Queue<Boolean> booleanValues = new ArrayDeque<>();

  public void addLong(long... values) {
    for (long v : values) {
      longValues.add(v);
    }
  }

  public void addBoolean(boolean... values) {
    for (boolean v : values) {
      booleanValues.add(v);
    }
  }

  @Override
  public long nextLong() {
    return longValues.poll();
  }

  @Override
  public boolean nextBoolean() {
    return booleanValues.poll();
  }
}
