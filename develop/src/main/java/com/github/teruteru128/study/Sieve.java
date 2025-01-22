package com.github.teruteru128.study;

public class Sieve {

  private final long[] bits;

  public Sieve(long[] bits) {
    this.bits = bits;
  }

  /**
   *
   * @see java.math.BitSieve#sieveSearch(int, int)
   * @see java.util.BitSet#nextClearBit(int)
   * @param limit bitsのリミット。bit単位
   * @param start start
   * @return next step
   */
  public long sieveSearch(long limit, long start) {
    if (start >= limit) {
      return -1;
    }
    var index = (int) unitIndex(start);
    final var wordLimit = unitIndex(limit - 1) + 1;
    long word = ~bits[index] & (0xffffffffffffffffL << start);
    while (true) {
      if (word != 0) {
        return index * 64L + Long.numberOfTrailingZeros(word);
      }
      if (++index == wordLimit) {
        return -1L;
      }
      word = ~bits[index];
    }
  }

  static long unitIndex(long bitIndex) {
    return bitIndex >>> 6;
  }
}
