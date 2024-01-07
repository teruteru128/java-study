// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*clEnqueueReleaseExternalMemObjectsKHR_fn)(struct _cl_command_queue* command_queue,unsigned int num_mem_objects,struct _cl_mem** mem_objects,unsigned int num_events_in_wait_list,struct _cl_event** event_wait_list,struct _cl_event** event);
 * }
 */
public interface clEnqueueReleaseExternalMemObjectsKHR_fn {

    int apply(java.lang.foreign.MemorySegment command_queue, int num_mem_objects, java.lang.foreign.MemorySegment mem_objects, int num_events_in_wait_list, java.lang.foreign.MemorySegment event_wait_list, java.lang.foreign.MemorySegment event);
    static MemorySegment allocate(clEnqueueReleaseExternalMemObjectsKHR_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$237.const$0, fi, constants$207.const$5, scope);
    }
    static clEnqueueReleaseExternalMemObjectsKHR_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _command_queue, int _num_mem_objects, java.lang.foreign.MemorySegment _mem_objects, int _num_events_in_wait_list, java.lang.foreign.MemorySegment _event_wait_list, java.lang.foreign.MemorySegment _event) -> {
            try {
                return (int)constants$208.const$1.invokeExact(symbol, _command_queue, _num_mem_objects, _mem_objects, _num_events_in_wait_list, _event_wait_list, _event);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


