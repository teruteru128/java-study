// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*clMemBlockingFreeINTEL_fn)(struct _cl_context* context,void* ptr);
 * }
 */
public interface clMemBlockingFreeINTEL_fn {

    int apply(java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment content_size_buffer);
    static MemorySegment allocate(clMemBlockingFreeINTEL_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$249.const$1, fi, constants$9.const$3, scope);
    }
    static clMemBlockingFreeINTEL_fn ofAddress(MemorySegment addr, Arena arena) {
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

