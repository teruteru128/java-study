// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$658 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$658() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "GetThreadSelectedCpuSets",
        constants$586.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SetThreadSelectedCpuSets",
        constants$570.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CreateProcessAsUserA",
        constants$644.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "GetProcessShutdownParameters",
        constants$34.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "GetProcessDefaultCpuSetMasks",
        constants$658.const$4
    );
}

