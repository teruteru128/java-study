// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned int (*LPFNDEVMODE)(struct HWND__*,struct HINSTANCE__*,struct _devicemodeA*,char*,char*,struct _devicemodeA*,char*,unsigned int);
 * }
 */
public interface LPFNDEVMODE {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6, int _x7);
    static MemorySegment allocate(LPFNDEVMODE fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1004.const$5, fi, constants$1004.const$4, scope);
    }
    static LPFNDEVMODE ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6, int __x7) -> {
            try {
                return (int)constants$1005.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

