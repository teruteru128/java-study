// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$648 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$648() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "GetCurrentThreadStackLimits",
        constants$469.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetThreadContext",
        constants$34.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "GetProcessMitigationPolicy",
        constants$614.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SetThreadContext",
        constants$34.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SetProcessMitigationPolicy",
        constants$648.const$4
    );
}


