// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$623 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$623() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "ReleaseMutex",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "WaitForSingleObject",
        constants$65.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SleepEx",
        constants$12.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "WaitForSingleObjectEx",
        constants$67.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "WaitForMultipleObjectsEx",
        constants$623.const$4
    );
}


