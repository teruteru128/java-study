// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned char* (*USER_MARSHAL_UNMARSHALLING_ROUTINE)(unsigned long*,unsigned char*,void*);
 * }
 */
public interface USER_MARSHAL_UNMARSHALLING_ROUTINE {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
    static MemorySegment allocate(USER_MARSHAL_UNMARSHALLING_ROUTINE fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2279.const$5, fi, constants$33.const$1, scope);
    }
    static USER_MARSHAL_UNMARSHALLING_ROUTINE ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$2279.const$4.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


