// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*clSetProgramReleaseCallback$pfn_notify)(cl_program,void*);
 * }
 */
public interface clSetProgramReleaseCallback$pfn_notify {

    void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
    static MemorySegment allocate(clSetProgramReleaseCallback$pfn_notify fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$189.const$2, fi, constants$180.const$3, scope);
    }
    static clSetProgramReleaseCallback$pfn_notify ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
            try {
                constants$180.const$5.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


