package com.twitter.teruteru128.study.bitmessage;

/**
 * ServiceLoaderで読み出せるよねこのクラス……
 */
public class SearchRangeFactoryImpl implements SearchRangeFactory {

  private long min = 0;
  private boolean finish = false;

  public SearchRangeFactoryImpl() {
    this(0);
  }

  public SearchRangeFactoryImpl(long min) {
    this.min = min;
  }

  public synchronized SearchRange getInstance() {
    if (finish)
      return null;
    SearchRange range = new SearchRange(min, min + 16777215);
    min += 16777216;
    // オーバーフローが前提
    // Long.compareUnsigned(min + 16777215L, -1L) == 0
    if ((min + 16777215L) == -1L) {
      finish = true;
    }
    return range;
  }
}
