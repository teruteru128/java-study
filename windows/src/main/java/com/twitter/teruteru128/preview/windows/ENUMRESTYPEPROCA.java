// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*ENUMRESTYPEPROCA)(struct HINSTANCE__* hModule,char* lpType,long long lParam);
 * }
 */
public interface ENUMRESTYPEPROCA {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2);
    static MemorySegment allocate(ENUMRESTYPEPROCA fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$708.const$2, fi, constants$29.const$0, scope);
    }
    static ENUMRESTYPEPROCA ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2) -> {
            try {
                return (int)constants$708.const$3.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

