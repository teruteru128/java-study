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
  public void testOne() {
    assertTrue(Collatz5.isPowerOf2(BigInteger.valueOf(1)));
  }

  @Test
  public void testPowerOf2() {
    assertTrue(Collatz5.isPowerOf2(BigInteger.valueOf(2)));
    assertTrue(Collatz5.isPowerOf2(BigInteger.valueOf(4)));
    assertTrue(Collatz5.isPowerOf2(BigInteger.valueOf(8)));
    assertTrue(Collatz5.isPowerOf2(BigInteger.valueOf(16)));
    assertTrue(Collatz5.isPowerOf2(BigInteger.valueOf(32)));
    assertTrue(Collatz5.isPowerOf2(BigInteger.valueOf(64)));
  }
  
  @Test
  public void testOddPrimes(){
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(3)));
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(5)));
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(7)));
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(11)));
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(13)));
  }
  
  @Test
  public void testNonPowerOf2Multiple() {
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(10)));
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(14)));
  }
  
  @Test
  public void testMultipleOf3(){
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(6)));
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(9)));
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(12)));
    assertFalse(Collatz5.isPowerOf2(BigInteger.valueOf(15)));
  }
}
