// Generated by jextract

package com.github.teruteru128.foreign.opencl;

import java.lang.invoke.*;
import java.lang.foreign.*;

/**
 * {@snippet lang=c :
 * void (*pfn_free_func)(cl_command_queue, cl_uint, void **, void *) __attribute__((stdcall))
 * }
 */
public class clEnqueueSVMFree$pfn_free_func {

    clEnqueueSVMFree$pfn_free_func() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        opencl_h.C_POINTER,
        opencl_h.C_INT,
        opencl_h.C_POINTER,
        opencl_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = opencl_h.upcallHandle(clEnqueueSVMFree$pfn_free_func.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(clEnqueueSVMFree$pfn_free_func.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3) {
        try {
             DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

