// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * DWORD (*PM_OPEN_PROC)(LPWSTR pContext);
 * }
 */
public interface PM_OPEN_PROC {

    int apply(java.lang.foreign.MemorySegment pContext);
    static MemorySegment allocate(PM_OPEN_PROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1896.const$2, fi, constants$18.const$5, scope);
    }
    static PM_OPEN_PROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pContext) -> {
            try {
                return (int)constants$495.const$0.invokeExact(symbol, _pContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

