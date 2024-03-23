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
 * typedef int (*RPC_MGMT_AUTHORIZATION_FN)(RPC_BINDING_HANDLE, unsigned long, RPC_STATUS *) __attribute__((stdcall))
 * }
 */
public class RPC_MGMT_AUTHORIZATION_FN {

    RPC_MGMT_AUTHORIZATION_FN() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment ClientBinding, int RequestedMgmtOperation, MemorySegment Status);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        Windows_h.C_INT,
        Windows_h.C_POINTER,
        Windows_h.C_LONG,
        Windows_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = Windows_h.upcallHandle(RPC_MGMT_AUTHORIZATION_FN.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(RPC_MGMT_AUTHORIZATION_FN.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment ClientBinding, int RequestedMgmtOperation, MemorySegment Status) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, ClientBinding, RequestedMgmtOperation, Status);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

