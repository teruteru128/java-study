// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*clReleaseSemaphoreKHR_fn)(struct _cl_semaphore_khr* sema_object);
 * }
 */
public interface clReleaseSemaphoreKHR_fn {

    int apply(java.lang.foreign.MemorySegment accelerator);
    static MemorySegment allocate(clReleaseSemaphoreKHR_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$239.const$0, fi, constants$18.const$1, scope);
    }
    static clReleaseSemaphoreKHR_fn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _accelerator) -> {
            try {
                return (int)constants$211.const$4.invokeExact(symbol, _accelerator);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

