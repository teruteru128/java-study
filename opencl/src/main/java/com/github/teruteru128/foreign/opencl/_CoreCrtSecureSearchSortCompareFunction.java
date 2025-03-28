// Generated by jextract

package com.github.teruteru128.foreign.opencl;

import java.lang.invoke.*;
import java.lang.foreign.*;

/**
 * {@snippet lang=c :
 * typedef int (*_CoreCrtSecureSearchSortCompareFunction)(void *, const void *, const void *) __attribute__((cdecl))
 * }
 */
public class _CoreCrtSecureSearchSortCompareFunction {

    _CoreCrtSecureSearchSortCompareFunction() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    @FunctionalInterface
    public interface Function {
        int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        opencl_h.C_INT,
        opencl_h.C_POINTER,
        opencl_h.C_POINTER,
        opencl_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = opencl_h.upcallHandle(_CoreCrtSecureSearchSortCompareFunction.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(_CoreCrtSecureSearchSortCompareFunction.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

