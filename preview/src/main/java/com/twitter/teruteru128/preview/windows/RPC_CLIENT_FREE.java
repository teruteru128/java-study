// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*RPC_CLIENT_FREE)(void* Ptr);
 * }
 */
public interface RPC_CLIENT_FREE {

    void apply(java.lang.foreign.MemorySegment pParameter);
    static MemorySegment allocate(RPC_CLIENT_FREE fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2326.const$2, fi, constants$0.const$0, scope);
    }
    static RPC_CLIENT_FREE ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pParameter) -> {
            try {
                constants$496.const$2.invokeExact(symbol, _pParameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


