// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * DWORD (*PM_CLOSE_PROC)();
 * }
 */
public interface PM_CLOSE_PROC {

    int apply();
    static MemorySegment allocate(PM_CLOSE_PROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1896.const$4, fi, constants$1.const$5, scope);
    }
    static PM_CLOSE_PROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return () -> {
            try {
                return (int)constants$1896.const$5.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


