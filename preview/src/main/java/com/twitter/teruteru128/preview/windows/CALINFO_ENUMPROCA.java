// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*CALINFO_ENUMPROCA)(char*);
 * }
 */
public interface CALINFO_ENUMPROCA {

    int apply(java.lang.foreign.MemorySegment hAsyncRetrieve);
    static MemorySegment allocate(CALINFO_ENUMPROCA fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1420.const$1, fi, constants$18.const$5, scope);
    }
    static CALINFO_ENUMPROCA ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _hAsyncRetrieve) -> {
            try {
                return (int)constants$495.const$0.invokeExact(symbol, _hAsyncRetrieve);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


