// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*PENCLAVE_ROUTINE)(void* lpThreadParameter);
 * }
 */
public interface PENCLAVE_ROUTINE {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(PENCLAVE_ROUTINE fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$561.const$3, fi, constants$33.const$3, scope);
    }
    static PENCLAVE_ROUTINE ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$250.const$3.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


