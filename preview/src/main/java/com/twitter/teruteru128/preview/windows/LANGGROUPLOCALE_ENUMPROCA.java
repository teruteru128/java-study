// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*LANGGROUPLOCALE_ENUMPROCA)(unsigned long,unsigned long,char*,long long);
 * }
 */
public interface LANGGROUPLOCALE_ENUMPROCA {

    int apply(int _x0, int _x1, java.lang.foreign.MemorySegment _x2, long _x3);
    static MemorySegment allocate(LANGGROUPLOCALE_ENUMPROCA fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1419.const$0, fi, constants$1418.const$5, scope);
    }
    static LANGGROUPLOCALE_ENUMPROCA ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int __x0, int __x1, java.lang.foreign.MemorySegment __x2, long __x3) -> {
            try {
                return (int)constants$1419.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

