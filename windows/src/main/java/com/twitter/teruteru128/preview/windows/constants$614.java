// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$614 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$614() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "HeapSetInformation",
        constants$614.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "HeapValidate",
        constants$485.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "HeapSummary",
        constants$485.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetProcessHeaps",
        constants$12.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "HeapLock",
        constants$18.const$5
    );
}

