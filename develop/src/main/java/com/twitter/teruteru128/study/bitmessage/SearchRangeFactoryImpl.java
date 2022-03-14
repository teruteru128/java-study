package com.twitter.teruteru128.study.bitmessage;

/**
 * ServiceLoaderで読み出せるよねこのクラス……
 */
public class SearchRangeFactoryImpl implements SearchRangeFactory {

  private long min = 0;
  private long max = 0;
  private long diff = 0;
  private long diffMinus1 = 0;
  private boolean finish = false;

  public SearchRangeFactoryImpl() {
    this(0, -1, 16777216);
  }

  public SearchRangeFactoryImpl(long min) {
    this(min, -1, 16777216);
  }

  /**
   * 
   * @param min unsigned long
   * @param max unsigned long
   */
  public SearchRangeFactoryImpl(long min, long max) {
    this(min, max, 16777216);
  }

  public SearchRangeFactoryImpl(long min, long max, long diff) {
    this.min = min;
    this.max = max;
    this.diff = diff;
    this.diffMinus1 = diff - 1L;
  }

  public synchronized SearchRange getInstance() {
    if (finish)
      return null;
    SearchRange range = new SearchRange(min, min + diffMinus1);
    min += diff;
    // オーバーフローが前提
    if (Long.compareUnsigned(min + diffMinus1, max) >= 0) {
      finish = true;
    }
    return range;
  }
}
