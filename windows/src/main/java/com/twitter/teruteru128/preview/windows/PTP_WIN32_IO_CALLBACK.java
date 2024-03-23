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
 * typedef void (*PTP_WIN32_IO_CALLBACK)(PTP_CALLBACK_INSTANCE, PVOID, PVOID, ULONG, ULONG_PTR, PTP_IO) __attribute__((stdcall))
 * }
 */
public class PTP_WIN32_IO_CALLBACK {

    PTP_WIN32_IO_CALLBACK() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment Instance, MemorySegment Context, MemorySegment Overlapped, int IoResult, long NumberOfBytesTransferred, MemorySegment Io);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        Windows_h.C_POINTER,
        Windows_h.C_POINTER,
        Windows_h.C_POINTER,
        Windows_h.C_LONG,
        Windows_h.C_LONG_LONG,
        Windows_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = Windows_h.upcallHandle(PTP_WIN32_IO_CALLBACK.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PTP_WIN32_IO_CALLBACK.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment Instance, MemorySegment Context, MemorySegment Overlapped, int IoResult, long NumberOfBytesTransferred, MemorySegment Io) {
        try {
             DOWN$MH.invokeExact(funcPtr, Instance, Context, Overlapped, IoResult, NumberOfBytesTransferred, Io);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

