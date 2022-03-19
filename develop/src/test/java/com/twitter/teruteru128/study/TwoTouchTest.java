package com.twitter.teruteru128.study;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoTouchTest {

  @Test
  public void getTest() {
    assertEquals(TwoTouch.get(1, 1), 'あ');
    assertEquals(TwoTouch.get(9, 9), '４');
    assertEquals(TwoTouch.get(0, 0), '０');
  }
}
