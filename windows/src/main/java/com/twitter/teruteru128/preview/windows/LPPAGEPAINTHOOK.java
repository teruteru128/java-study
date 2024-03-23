// Generated by jextract

package com.twitter.teruteru128.preview.windows;

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
 * typedef UINT_PTR (*LPPAGEPAINTHOOK)(HWND, UINT, WPARAM, LPARAM) __attribute__((stdcall))
 * }
 */
public class LPPAGEPAINTHOOK {

    LPPAGEPAINTHOOK() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        long apply(MemorySegment _x0, int _x1, long _x2, long _x3);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        Windows_h.C_LONG_LONG,
        Windows_h.C_POINTER,
        Windows_h.C_INT,
        Windows_h.C_LONG_LONG,
        Windows_h.C_LONG_LONG
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = Windows_h.upcallHandle(LPPAGEPAINTHOOK.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(LPPAGEPAINTHOOK.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static long invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, long _x2, long _x3) {
        try {
            return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

