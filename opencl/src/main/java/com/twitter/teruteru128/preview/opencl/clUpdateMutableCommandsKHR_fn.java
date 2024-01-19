// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*clUpdateMutableCommandsKHR_fn)(struct _cl_command_buffer_khr* command_buffer,struct _cl_mutable_base_config_khr* mutable_config);
 * }
 */
public interface clUpdateMutableCommandsKHR_fn {

    int apply(java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment content_size_buffer);
    static MemorySegment allocate(clUpdateMutableCommandsKHR_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$224.const$4, fi, constants$9.const$3, scope);
    }
    static clUpdateMutableCommandsKHR_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _buffer, java.lang.foreign.MemorySegment _content_size_buffer) -> {
            try {
                return (int)constants$9.const$5.invokeExact(symbol, _buffer, _content_size_buffer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

