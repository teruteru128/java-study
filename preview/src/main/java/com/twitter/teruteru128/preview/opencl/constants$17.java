// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$17 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$17() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_FLOAT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "wcstof",
        constants$17.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_FLOAT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_wcstof_l",
        constants$17.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_DOUBLE,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "_wtof",
        constants$17.const$4
    );
}


