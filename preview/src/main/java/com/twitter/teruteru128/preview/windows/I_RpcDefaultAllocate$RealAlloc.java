// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*I_RpcDefaultAllocate$RealAlloc)(size_t);
 * }
 */
public interface I_RpcDefaultAllocate$RealAlloc {

    java.lang.foreign.MemorySegment apply(long Size);
    static MemorySegment allocate(I_RpcDefaultAllocate$RealAlloc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2260.const$5, fi, constants$1977.const$2, scope);
    }
    static I_RpcDefaultAllocate$RealAlloc ofAddress(MemorySegment addr, Arena arena) {
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


