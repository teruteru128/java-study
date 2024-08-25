package com.github.teruteru128.foreign;

import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

public class Locale {

  private static final Linker linker = Linker.nativeLinker();
  private static final SymbolLookup defaultLookup = linker.defaultLookup();
  private static final MemorySegment address = defaultLookup.find("setlocale")
      .orElseThrow(() -> new UnsatisfiedLinkError("unresolved symbol: setlocale"));
  private static final MethodHandle setlocale = CL.linker.downcallHandle(address,
      of(ADDRESS, JAVA_INT, ADDRESS));

  public static MemorySegment setlocale(int category, final MemorySegment locale) {
    try {
      return (MemorySegment) setlocale.invokeExact(category, locale);
    } catch (Throwable e) {
      throw new AssertionError("should not reach here", e);
    }
  }
}
