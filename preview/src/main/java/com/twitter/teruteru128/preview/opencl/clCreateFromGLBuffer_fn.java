// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _cl_mem* (*clCreateFromGLBuffer_fn)(struct _cl_context* context,unsigned long long flags,unsigned int bufobj,int* errcode_ret);
 * }
 */
public interface clCreateFromGLBuffer_fn {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment context, long flags, int renderbuffer, java.lang.foreign.MemorySegment errcode_ret);
    static MemorySegment allocate(clCreateFromGLBuffer_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$206.const$0, fi, constants$205.const$5, scope);
    }
    static clCreateFromGLBuffer_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _context, long _flags, int _renderbuffer, java.lang.foreign.MemorySegment _errcode_ret) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$206.const$1.invokeExact(symbol, _context, _flags, _renderbuffer, _errcode_ret);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


