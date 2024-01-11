// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*RTL_UMS_SCHEDULER_ENTRY_POINT)(RTL_UMS_SCHEDULER_REASON Reason,ULONG_PTR ActivationPayload,PVOID SchedulerParam);
 * }
 */
public interface RTL_UMS_SCHEDULER_ENTRY_POINT {

    void apply(int Reason, long ActivationPayload, java.lang.foreign.MemorySegment SchedulerParam);
    static MemorySegment allocate(RTL_UMS_SCHEDULER_ENTRY_POINT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$482.const$3, fi, constants$482.const$2, scope);
    }
    static RTL_UMS_SCHEDULER_ENTRY_POINT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _Reason, long _ActivationPayload, java.lang.foreign.MemorySegment _SchedulerParam) -> {
            try {
                constants$482.const$4.invokeExact(symbol, _Reason, _ActivationPayload, _SchedulerParam);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


