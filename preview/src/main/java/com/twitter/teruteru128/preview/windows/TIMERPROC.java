// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*TIMERPROC)(struct HWND__*,unsigned int,unsigned long long,unsigned long);
 * }
 */
public interface TIMERPROC {

    void apply(java.lang.foreign.MemorySegment _x0, int _x1, long _x2, int _x3);
    static MemorySegment allocate(TIMERPROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1132.const$3, fi, constants$1132.const$2, scope);
    }
    static TIMERPROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, int __x1, long __x2, int __x3) -> {
            try {
                constants$1132.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


