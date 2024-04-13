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
 * typedef BOOL (*PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY)(PCMSG_CNG_CONTENT_DECRYPT_INFO, DWORD, void *) __attribute__((stdcall))
 * }
 */
public class PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY {

    PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment pCNGContentDecryptInfo, int dwFlags, MemorySegment pvReserved);
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

    private static final MethodHandle UP$MH = Windows_h.upcallHandle(PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment pCNGContentDecryptInfo, int dwFlags, MemorySegment pvReserved) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, pCNGContentDecryptInfo, dwFlags, pvReserved);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}
