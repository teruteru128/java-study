// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1366 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1366() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "InternalGetWindowText",
        constants$570.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CancelShutdown",
        constants$1.const$5
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y")
        ).withName("tagPOINT"),
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "MonitorFromPoint",
        constants$1366.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "MonitorFromRect",
        constants$30.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "MonitorFromWindow",
        constants$30.const$0
    );
}


