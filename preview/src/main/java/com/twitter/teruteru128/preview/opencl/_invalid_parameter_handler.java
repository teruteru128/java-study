// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*_invalid_parameter_handler)(unsigned short*,unsigned short*,unsigned short*,unsigned int,unsigned long long);
 * }
 */
public interface _invalid_parameter_handler {

    void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, long _x4);
    static MemorySegment allocate(_invalid_parameter_handler fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$28.const$2, fi, constants$1.const$5, scope);
    }
    static _invalid_parameter_handler ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, long __x4) -> {
            try {
                constants$28.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


