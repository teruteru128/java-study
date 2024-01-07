// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*clEnqueueSVMUnmapARM_fn)(struct _cl_command_queue* command_queue,void* svm_ptr,unsigned int num_events_in_wait_list,struct _cl_event** event_wait_list,struct _cl_event** event);
 * }
 */
public interface clEnqueueSVMUnmapARM_fn {

    int apply(java.lang.foreign.MemorySegment command_queue, java.lang.foreign.MemorySegment svm_ptr, int num_events_in_wait_list, java.lang.foreign.MemorySegment event_wait_list, java.lang.foreign.MemorySegment event);
    static MemorySegment allocate(clEnqueueSVMUnmapARM_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$242.const$5, fi, constants$177.const$3, scope);
    }
    static clEnqueueSVMUnmapARM_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _command_queue, java.lang.foreign.MemorySegment _svm_ptr, int _num_events_in_wait_list, java.lang.foreign.MemorySegment _event_wait_list, java.lang.foreign.MemorySegment _event) -> {
            try {
                return (int)constants$229.const$1.invokeExact(symbol, _command_queue, _svm_ptr, _num_events_in_wait_list, _event_wait_list, _event);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


