// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _cl_command_buffer_khr* (*clCreateCommandBufferKHR_fn)(unsigned int num_queues,struct _cl_command_queue** queues,unsigned long long* properties,int* errcode_ret);
 * }
 */
public interface clCreateCommandBufferKHR_fn {

    java.lang.foreign.MemorySegment apply(int num_queues, java.lang.foreign.MemorySegment queues, java.lang.foreign.MemorySegment properties, java.lang.foreign.MemorySegment errcode_ret);
    static MemorySegment allocate(clCreateCommandBufferKHR_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$211.const$1, fi, constants$211.const$0, scope);
    }
    static clCreateCommandBufferKHR_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _num_queues, java.lang.foreign.MemorySegment _queues, java.lang.foreign.MemorySegment _properties, java.lang.foreign.MemorySegment _errcode_ret) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$211.const$2.invokeExact(symbol, _num_queues, _queues, _properties, _errcode_ret);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

