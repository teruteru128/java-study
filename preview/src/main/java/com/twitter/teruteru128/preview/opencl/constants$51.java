// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$51 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$51() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "mbstowcs",
        constants$51.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_mbstowcs_s_l",
        constants$51.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "_mbstowcs_l",
        constants$51.const$4
    );
}


