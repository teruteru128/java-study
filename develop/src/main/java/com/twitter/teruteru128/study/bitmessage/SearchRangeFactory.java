package com.twitter.teruteru128.study.bitmessage;

public class SearchRangeFactory {

  private long min = 0;

  public SearchRangeFactory() {
  }

  public synchronized SearchRange getInstance() {
    if ((min + 16777215) < Long.MAX_VALUE) {
      SearchRange range = new SearchRange(min, min + 16777215);
      min += 16777216;
      return range;
    } else {
      return null;
    }
  }
}
