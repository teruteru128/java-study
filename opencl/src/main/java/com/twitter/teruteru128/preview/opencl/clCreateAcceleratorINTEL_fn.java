// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef cl_accelerator_intel (*clCreateAcceleratorINTEL_fn)(cl_context, cl_accelerator_type_intel, size_t, const void *, cl_int *) __attribute__((stdcall))
 * }
 */
public class clCreateAcceleratorINTEL_fn {

    clCreateAcceleratorINTEL_fn() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        MemorySegment apply(MemorySegment context, int accelerator_type, long descriptor_size, MemorySegment descriptor, MemorySegment errcode_ret);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        opencl_h.C_POINTER,
        opencl_h.C_POINTER,
        opencl_h.C_INT,
        opencl_h.C_LONG_LONG,
        opencl_h.C_POINTER,
        opencl_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = opencl_h.upcallHandle(clCreateAcceleratorINTEL_fn.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(clCreateAcceleratorINTEL_fn.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment context, int accelerator_type, long descriptor_size, MemorySegment descriptor, MemorySegment errcode_ret) {
        try {
            return (MemorySegment) DOWN$MH.invokeExact(funcPtr, context, accelerator_type, descriptor_size, descriptor, errcode_ret);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

