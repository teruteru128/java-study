// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$240 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$240() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "clReleaseSemaphoreKHR",
        constants$18.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "clRetainSemaphoreKHR",
        constants$18.const$1
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(clImportMemoryARM_fn.class, "apply", constants$240.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$240.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "clImportMemoryARM",
        constants$240.const$2
    );
}


