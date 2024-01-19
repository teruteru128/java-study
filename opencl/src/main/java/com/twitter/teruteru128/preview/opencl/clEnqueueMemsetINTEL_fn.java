// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*clEnqueueMemsetINTEL_fn)(struct _cl_command_queue* command_queue,void* dst_ptr,int value,unsigned long long size,unsigned int num_events_in_wait_list,struct _cl_event** event_wait_list,struct _cl_event** event);
 * }
 */
public interface clEnqueueMemsetINTEL_fn {

    int apply(java.lang.foreign.MemorySegment command_queue, java.lang.foreign.MemorySegment dst_ptr, int value, long size, int num_events_in_wait_list, java.lang.foreign.MemorySegment event_wait_list, java.lang.foreign.MemorySegment event);
    static MemorySegment allocate(clEnqueueMemsetINTEL_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$253.const$0, fi, constants$252.const$5, scope);
    }
    static clEnqueueMemsetINTEL_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _command_queue, java.lang.foreign.MemorySegment _dst_ptr, int _value, long _size, int _num_events_in_wait_list, java.lang.foreign.MemorySegment _event_wait_list, java.lang.foreign.MemorySegment _event) -> {
            try {
                return (int)constants$253.const$1.invokeExact(symbol, _command_queue, _dst_ptr, _value, _size, _num_events_in_wait_list, _event_wait_list, _event);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

