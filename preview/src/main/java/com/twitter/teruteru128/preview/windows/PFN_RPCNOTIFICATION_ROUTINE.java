// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_RPCNOTIFICATION_ROUTINE)(struct _RPC_ASYNC_STATE*,void*,enum _RPC_ASYNC_EVENT);
 * }
 */
public interface PFN_RPCNOTIFICATION_ROUTINE {

    void apply(java.lang.foreign.MemorySegment pAsync, java.lang.foreign.MemorySegment Context, int Event);
    static MemorySegment allocate(PFN_RPCNOTIFICATION_ROUTINE fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1819.const$5, fi, constants$605.const$2, scope);
    }
    static PFN_RPCNOTIFICATION_ROUTINE ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pAsync, java.lang.foreign.MemorySegment _Context, int _Event) -> {
            try {
                constants$1777.const$3.invokeExact(symbol, _pAsync, _Context, _Event);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


