// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * typedef BOOL (*PFN_CRYPT_ENUM_KEYID_PROP)(const CRYPT_HASH_BLOB *, DWORD, void *, void *, DWORD, DWORD *, void **, DWORD *) __attribute__((stdcall))
 * }
 */
public class PFN_CRYPT_ENUM_KEYID_PROP {

    PFN_CRYPT_ENUM_KEYID_PROP() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment pKeyIdentifier, int dwFlags, MemorySegment pvReserved, MemorySegment pvArg, int cProp, MemorySegment rgdwPropId, MemorySegment rgpvData, MemorySegment rgcbData);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        Windows_h.C_INT,
        Windows_h.C_POINTER,
        Windows_h.C_LONG,
        Windows_h.C_POINTER,
        Windows_h.C_POINTER,
        Windows_h.C_LONG,
        Windows_h.C_POINTER,
        Windows_h.C_POINTER,
        Windows_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = Windows_h.upcallHandle(PFN_CRYPT_ENUM_KEYID_PROP.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFN_CRYPT_ENUM_KEYID_PROP.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment pKeyIdentifier, int dwFlags, MemorySegment pvReserved, MemorySegment pvArg, int cProp, MemorySegment rgdwPropId, MemorySegment rgpvData, MemorySegment rgcbData) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, pKeyIdentifier, dwFlags, pvReserved, pvArg, cProp, rgdwPropId, rgpvData, rgcbData);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}
