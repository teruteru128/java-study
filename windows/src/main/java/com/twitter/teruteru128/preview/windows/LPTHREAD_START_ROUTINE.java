// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned long (*LPTHREAD_START_ROUTINE)(void*);
 * }
 */
public interface LPTHREAD_START_ROUTINE {

    int apply(java.lang.foreign.MemorySegment pvParameter);
    static MemorySegment allocate(LPTHREAD_START_ROUTINE fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$561.const$2, fi, constants$18.const$5, scope);
    }
    static LPTHREAD_START_ROUTINE ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pvParameter) -> {
            try {
                return (int)constants$495.const$0.invokeExact(symbol, _pvParameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

