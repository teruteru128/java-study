// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*PENCLAVE_TARGET_FUNCTION)(void*);
 * }
 */
public interface PENCLAVE_TARGET_FUNCTION {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(PENCLAVE_TARGET_FUNCTION fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$250.const$4, fi, constants$33.const$3, scope);
    }
    static PENCLAVE_TARGET_FUNCTION ofAddress(MemorySegment addr, Arena arena) {
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

