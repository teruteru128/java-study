package com.github.teruteru128.primesearch.search;

/**
 * @param result -1:他クライアントがclaim済みのためskip, 0:合成数, 1:probably prime, 2:definitely prime
 */
public record Result(int step, int result, long start, long finish) {

  public static final int SKIP = -1;
  public static final int COMPOSITE = 0;
  public static final int PROBABLY_PRIME = 1;
  public static final int DEFINITELY_PRIME = 2;
}
