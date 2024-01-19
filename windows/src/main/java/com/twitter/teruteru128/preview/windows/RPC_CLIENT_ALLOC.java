// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*RPC_CLIENT_ALLOC)(size_t Size);
 * }
 */
public interface RPC_CLIENT_ALLOC {

    java.lang.foreign.MemorySegment apply(long Size);
    static MemorySegment allocate(RPC_CLIENT_ALLOC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2326.const$1, fi, constants$1977.const$2, scope);
    }
    static RPC_CLIENT_ALLOC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (long _Size) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$1977.const$4.invokeExact(symbol, _Size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

