package com.github.teruteru128.study;

import java.lang.foreign.ValueLayout;
import java.lang.foreign.ValueLayout.OfLong;
import java.nio.ByteOrder;

public final class Layouts {

  public static final OfLong JAVA_LONG_WITH_BIG_ENDIAN = ValueLayout.JAVA_LONG.withOrder(
      ByteOrder.BIG_ENDIAN);

  private Layouts() {
  }

}
