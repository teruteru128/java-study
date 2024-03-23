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
 * typedef cl_int (*clGetMutableCommandInfoKHR_fn)(cl_mutable_command_khr, cl_mutable_command_info_khr, size_t, void *, size_t *) __attribute__((stdcall))
 * }
 */
public class clGetMutableCommandInfoKHR_fn {

    clGetMutableCommandInfoKHR_fn() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment command, int param_name, long param_value_size, MemorySegment param_value, MemorySegment param_value_size_ret);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        opencl_h.C_INT,
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

    private static final MethodHandle UP$MH = opencl_h.upcallHandle(clGetMutableCommandInfoKHR_fn.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(clGetMutableCommandInfoKHR_fn.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment command, int param_name, long param_value_size, MemorySegment param_value, MemorySegment param_value_size_ret) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, command, param_name, param_value_size, param_value, param_value_size_ret);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

