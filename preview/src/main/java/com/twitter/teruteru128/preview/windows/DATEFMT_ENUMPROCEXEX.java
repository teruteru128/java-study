// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*DATEFMT_ENUMPROCEXEX)(unsigned short*,unsigned long,long long);
 * }
 */
public interface DATEFMT_ENUMPROCEXEX {

    int apply(java.lang.foreign.MemorySegment _x0, int _x1, long _x2);
    static MemorySegment allocate(DATEFMT_ENUMPROCEXEX fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1446.const$2, fi, constants$509.const$1, scope);
    }
    static DATEFMT_ENUMPROCEXEX ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, int __x1, long __x2) -> {
            try {
                return (int)constants$1446.const$3.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

