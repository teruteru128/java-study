// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1368 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1368() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "GetMonitorInfoW",
        constants$34.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(MONITORENUMPROC.class, "apply", constants$707.const$4);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "EnumDisplayMonitors",
        constants$707.const$4
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "NotifyWinEvent",
        constants$1368.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
}


