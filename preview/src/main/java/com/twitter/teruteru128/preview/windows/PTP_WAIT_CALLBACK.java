// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PTP_WAIT_CALLBACK)(struct _TP_CALLBACK_INSTANCE* Instance,void* Context,struct _TP_WAIT* Wait,unsigned long WaitResult);
 * }
 */
public interface PTP_WAIT_CALLBACK {

    void apply(java.lang.foreign.MemorySegment Instance, java.lang.foreign.MemorySegment Context, java.lang.foreign.MemorySegment Wait, int WaitResult);
    static MemorySegment allocate(PTP_WAIT_CALLBACK fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$535.const$2, fi, constants$535.const$1, scope);
    }
    static PTP_WAIT_CALLBACK ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _Instance, java.lang.foreign.MemorySegment _Context, java.lang.foreign.MemorySegment _Wait, int _WaitResult) -> {
            try {
                constants$535.const$3.invokeExact(symbol, _Instance, _Context, _Wait, _WaitResult);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

