// Generated by jextract

package com.github.teruteru128.gmp;

import java.lang.invoke.*;
import java.lang.foreign.*;

/**
 * {@snippet lang=c :
 * void *(*)(void *, size_t, size_t)
 * }
 */
public class __gmp_set_memory_functions$x1 {

    __gmp_set_memory_functions$x1() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    @FunctionalInterface
    public interface Function {
        MemorySegment apply(MemorySegment _x0, long _x1, long _x2);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        gmp_h.C_POINTER,
        gmp_h.C_POINTER,
        gmp_h.C_LONG_LONG,
        gmp_h.C_LONG_LONG
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = gmp_h.upcallHandle(__gmp_set_memory_functions$x1.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(__gmp_set_memory_functions$x1.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, long _x1, long _x2) {
        try {
            return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

