// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_RUNTIME_FUNCTION_ENTRY* (*PGET_RUNTIME_FUNCTION_CALLBACK)(unsigned long long,void*);
 * }
 */
public interface PGET_RUNTIME_FUNCTION_CALLBACK {

    java.lang.foreign.MemorySegment apply(long ControlPc, java.lang.foreign.MemorySegment Context);
    static MemorySegment allocate(PGET_RUNTIME_FUNCTION_CALLBACK fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$89.const$4, fi, constants$89.const$1, scope);
    }
    static PGET_RUNTIME_FUNCTION_CALLBACK ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (long _ControlPc, java.lang.foreign.MemorySegment _Context) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$89.const$3.invokeExact(symbol, _ControlPc, _Context);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

