// Generated by jextract

package com.github.teruteru128.foreign.opencl;

import java.lang.invoke.*;
import java.lang.foreign.*;

/**
 * {@snippet lang=c :
 * void (*pfn_notify)(cl_event, cl_int, void *) __attribute__((stdcall))
 * }
 */
public class clSetEventCallback$pfn_notify {

    clSetEventCallback$pfn_notify() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment _x0, int _x1, MemorySegment _x2);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        opencl_h.C_POINTER,
        opencl_h.C_INT,
        opencl_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = opencl_h.upcallHandle(clSetEventCallback$pfn_notify.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(clSetEventCallback$pfn_notify.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2) {
        try {
             DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

