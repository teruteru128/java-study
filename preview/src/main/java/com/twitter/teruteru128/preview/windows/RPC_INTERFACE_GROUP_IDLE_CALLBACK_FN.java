// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN)(RPC_INTERFACE_GROUP IfGroup,void* IdleCallbackContext,unsigned long IsGroupIdle);
 * }
 */
public interface RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN {

    void apply(java.lang.foreign.MemorySegment IfGroup, java.lang.foreign.MemorySegment IdleCallbackContext, int IsGroupIdle);
    static MemorySegment allocate(RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1777.const$2, fi, constants$605.const$2, scope);
    }
    static RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _IfGroup, java.lang.foreign.MemorySegment _IdleCallbackContext, int _IsGroupIdle) -> {
            try {
                constants$1777.const$3.invokeExact(symbol, _IfGroup, _IdleCallbackContext, _IsGroupIdle);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

