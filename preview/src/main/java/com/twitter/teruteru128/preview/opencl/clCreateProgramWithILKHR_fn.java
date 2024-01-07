// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _cl_program* (*clCreateProgramWithILKHR_fn)(struct _cl_context* context,void* il,unsigned long long length,int* errcode_ret);
 * }
 */
public interface clCreateProgramWithILKHR_fn {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment context, java.lang.foreign.MemorySegment il, long length, java.lang.foreign.MemorySegment errcode_ret);
    static MemorySegment allocate(clCreateProgramWithILKHR_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$227.const$2, fi, constants$187.const$1, scope);
    }
    static clCreateProgramWithILKHR_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _context, java.lang.foreign.MemorySegment _il, long _length, java.lang.foreign.MemorySegment _errcode_ret) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$227.const$3.invokeExact(symbol, _context, _il, _length, _errcode_ret);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


