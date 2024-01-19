// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned long (*PQUERYHANDLER)(void*,struct val_context*,unsigned long,void*,unsigned long*,unsigned long);
 * }
 */
public interface PQUERYHANDLER {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, int _x5);
    static MemorySegment allocate(PQUERYHANDLER fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1482.const$5, fi, constants$626.const$3, scope);
    }
    static PQUERYHANDLER ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, int __x5) -> {
            try {
                return (int)constants$1482.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

