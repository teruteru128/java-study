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
 * typedef void (*PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD)(LPVOID, PCWSTR) __attribute__((stdcall))
 * }
 */
public class PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD {

    PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment pPluginContext, MemorySegment pwszPassword);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        Windows_h.C_POINTER,
        Windows_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = Windows_h.upcallHandle(PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment pPluginContext, MemorySegment pwszPassword) {
        try {
             DOWN$MH.invokeExact(funcPtr, pPluginContext, pwszPassword);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

