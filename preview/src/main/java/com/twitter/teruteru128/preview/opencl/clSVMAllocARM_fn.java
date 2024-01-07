// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*clSVMAllocARM_fn)(struct _cl_context* context,unsigned long long flags,unsigned long long size,unsigned int alignment);
 * }
 */
public interface clSVMAllocARM_fn {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment context, long flags, long size, int alignment);
    static MemorySegment allocate(clSVMAllocARM_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$241.const$0, fi, constants$185.const$2, scope);
    }
    static clSVMAllocARM_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _context, long _flags, long _size, int _alignment) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$241.const$1.invokeExact(symbol, _context, _flags, _size, _alignment);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

