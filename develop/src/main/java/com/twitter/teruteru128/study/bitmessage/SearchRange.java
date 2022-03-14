package com.twitter.teruteru128.study.bitmessage;

public class SearchRange {
  private long min;
  private long max;

  public SearchRange(long min, long max) {
    this.min = min;
    this.max = max;
  }

  public long getMin() {
    return min;
  }

  public long getMax() {
    return max;
  }
}
