// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PROPENUMPROCEXW)(struct HWND__*,unsigned short*,void*,unsigned long long);
 * }
 */
public interface PROPENUMPROCEXW {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, long _x3);
    static MemorySegment allocate(PROPENUMPROCEXW fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1134.const$5, fi, constants$707.const$4, scope);
    }
    static PROPENUMPROCEXW ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, long __x3) -> {
            try {
                return (int)constants$708.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


