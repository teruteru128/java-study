// Generated by jextract

package com.github.teruteru128.foreign.opencl;

import java.lang.invoke.*;
import java.lang.foreign.*;

/**
 * {@snippet lang=c :
 * typedef cl_int (*clEnqueueReadHostPipeINTEL_fn)(cl_command_queue, cl_program, const char *, cl_bool, void *, size_t, cl_uint, const cl_event *, cl_event *) __attribute__((stdcall))
 * }
 */
public class clEnqueueReadHostPipeINTEL_fn {

    clEnqueueReadHostPipeINTEL_fn() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment command_queue, MemorySegment program, MemorySegment pipe_symbol, int blocking_read, MemorySegment ptr, long size, int num_events_in_wait_list, MemorySegment event_wait_list, MemorySegment event);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        opencl_h.C_INT,
        opencl_h.C_POINTER,
        opencl_h.C_POINTER,
        opencl_h.C_POINTER,
        opencl_h.C_INT,
        opencl_h.C_POINTER,
        opencl_h.C_LONG_LONG,
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

    private static final MethodHandle UP$MH = opencl_h.upcallHandle(clEnqueueReadHostPipeINTEL_fn.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(clEnqueueReadHostPipeINTEL_fn.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment command_queue, MemorySegment program, MemorySegment pipe_symbol, int blocking_read, MemorySegment ptr, long size, int num_events_in_wait_list, MemorySegment event_wait_list, MemorySegment event) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, command_queue, program, pipe_symbol, blocking_read, ptr, size, num_events_in_wait_list, event_wait_list, event);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

