package com.github.teruteru128.foreign;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

public class Locale {
    public static MemorySegment setlocale(int category, final MemorySegment locale) {
        MemorySegment address = Main.defaultLookup.find("setlocale").orElseThrow(()-> new UnsatisfiedLinkError("unresolved symbol: setlocale"));
        MethodHandle setlocale = Main.linker.downcallHandle(address, of(ADDRESS, JAVA_INT, ADDRESS));
        try {
            return (MemorySegment) setlocale.invokeExact(category, locale);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
