// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _cl_command_buffer_khr* (*clRemapCommandBufferKHR_fn)(struct _cl_command_buffer_khr* command_buffer,unsigned int automatic,unsigned int num_queues,struct _cl_command_queue** queues,unsigned int num_handles,struct _cl_mutable_command_khr** handles,struct _cl_mutable_command_khr** handles_ret,int* errcode_ret);
 * }
 */
public interface clRemapCommandBufferKHR_fn {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment command_buffer, int automatic, int num_queues, java.lang.foreign.MemorySegment queues, int num_handles, java.lang.foreign.MemorySegment handles, java.lang.foreign.MemorySegment handles_ret, java.lang.foreign.MemorySegment errcode_ret);
    static MemorySegment allocate(clRemapCommandBufferKHR_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$219.const$4, fi, constants$219.const$3, scope);
    }
    static clRemapCommandBufferKHR_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _command_buffer, int _automatic, int _num_queues, java.lang.foreign.MemorySegment _queues, int _num_handles, java.lang.foreign.MemorySegment _handles, java.lang.foreign.MemorySegment _handles_ret, java.lang.foreign.MemorySegment _errcode_ret) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$219.const$5.invokeExact(symbol, _command_buffer, _automatic, _num_queues, _queues, _num_handles, _handles, _handles_ret, _errcode_ret);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


