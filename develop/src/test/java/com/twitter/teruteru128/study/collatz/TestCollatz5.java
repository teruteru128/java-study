package com.twitter.teruteru128.study.collatz;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;

import com.twitter.teruteru128.collatz.Collatz5;

import org.junit.jupiter.api.Test;

public class TestCollatz5 {
  public TestCollatz5() {
  }

  @Test
  public void testIsPowerOf2() {
    Collatz5 collatz5 = new Collatz5();
    assertTrue(collatz5.isPowerOf2(BigInteger.valueOf(1)));
    assertTrue(collatz5.isPowerOf2(BigInteger.valueOf(2)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(3)));
    assertTrue(collatz5.isPowerOf2(BigInteger.valueOf(4)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(5)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(6)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(7)));
    assertTrue(collatz5.isPowerOf2(BigInteger.valueOf(8)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(9)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(10)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(11)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(12)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(13)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(14)));
    assertFalse(collatz5.isPowerOf2(BigInteger.valueOf(15)));
    assertTrue(collatz5.isPowerOf2(BigInteger.valueOf(16)));
    assertTrue(collatz5.isPowerOf2(BigInteger.valueOf(32)));
    assertTrue(collatz5.isPowerOf2(BigInteger.valueOf(64)));
  }
}
