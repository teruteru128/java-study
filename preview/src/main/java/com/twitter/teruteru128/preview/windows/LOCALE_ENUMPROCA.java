// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*LOCALE_ENUMPROCA)(char*);
 * }
 */
public interface LOCALE_ENUMPROCA {

    int apply(java.lang.foreign.MemorySegment hAsyncRetrieve);
    static MemorySegment allocate(LOCALE_ENUMPROCA fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1418.const$0, fi, constants$18.const$5, scope);
    }
    static LOCALE_ENUMPROCA ofAddress(MemorySegment addr, Arena arena) {
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


