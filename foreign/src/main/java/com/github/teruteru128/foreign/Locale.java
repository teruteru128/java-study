package com.github.teruteru128.foreign;

import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public class Locale {

  private static final MemorySegment address = Main.defaultLookup.find("setlocale")
      .orElseThrow(() -> new UnsatisfiedLinkError("unresolved symbol: setlocale"));
  private static final MethodHandle setlocale = Main.linker.downcallHandle(address,
      of(ADDRESS, JAVA_INT, ADDRESS));

  public static MemorySegment setlocale(int category, final MemorySegment locale) {
    try {
      return (MemorySegment) setlocale.invokeExact(category, locale);
    } catch (Throwable e) {
      throw new AssertionError("should not reach here", e);
    }
  }
}
