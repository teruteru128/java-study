// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * typedef void (*PTP_WAIT_CALLBACK)(PTP_CALLBACK_INSTANCE, PVOID, PTP_WAIT, TP_WAIT_RESULT) __attribute__((stdcall))
 * }
 */
public class PTP_WAIT_CALLBACK {

    PTP_WAIT_CALLBACK() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment Instance, MemorySegment Context, MemorySegment Wait, int WaitResult);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        Windows_h.C_POINTER,
        Windows_h.C_POINTER,
        Windows_h.C_POINTER,
        Windows_h.C_LONG
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = Windows_h.upcallHandle(PTP_WAIT_CALLBACK.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PTP_WAIT_CALLBACK.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment Instance, MemorySegment Context, MemorySegment Wait, int WaitResult) {
        try {
             DOWN$MH.invokeExact(funcPtr, Instance, Context, Wait, WaitResult);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}
