// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$47 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$47() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_DOUBLE,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "_ecvt",
        constants$47.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_fcvt_s",
        constants$46.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_fcvt",
        constants$47.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_DOUBLE,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "_gcvt_s",
        constants$47.const$4
    );
}


