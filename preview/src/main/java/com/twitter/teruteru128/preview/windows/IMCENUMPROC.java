// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*IMCENUMPROC)(struct HIMC__*,long long);
 * }
 */
public interface IMCENUMPROC {

    int apply(java.lang.foreign.MemorySegment _x0, long _x1);
    static MemorySegment allocate(IMCENUMPROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$4529.const$5, fi, constants$39.const$3, scope);
    }
    static IMCENUMPROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
            try {
                return (int)constants$994.const$4.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


