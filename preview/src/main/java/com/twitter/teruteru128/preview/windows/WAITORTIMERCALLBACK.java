// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*WAITORTIMERCALLBACK)(void*,unsigned char);
 * }
 */
public interface WAITORTIMERCALLBACK {

    void apply(java.lang.foreign.MemorySegment _x0, byte _x1);
    static MemorySegment allocate(WAITORTIMERCALLBACK fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$497.const$0, fi, constants$495.const$4, scope);
    }
    static WAITORTIMERCALLBACK ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, byte __x1) -> {
            try {
                constants$496.const$0.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


