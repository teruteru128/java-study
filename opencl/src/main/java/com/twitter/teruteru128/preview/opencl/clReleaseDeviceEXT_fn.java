// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*clReleaseDeviceEXT_fn)(struct _cl_device_id* device);
 * }
 */
public interface clReleaseDeviceEXT_fn {

    int apply(java.lang.foreign.MemorySegment accelerator);
    static MemorySegment allocate(clReleaseDeviceEXT_fn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$228.const$4, fi, constants$18.const$1, scope);
    }
    static clReleaseDeviceEXT_fn ofAddress(MemorySegment addr, Arena arena) {
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

