// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$639 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$639() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "GetCurrentProcessId",
        constants$1.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "ExitProcess",
        constants$73.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "TerminateProcess",
        constants$65.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "GetExitCodeProcess",
        constants$34.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SwitchToThread",
        constants$1.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "CreateThread",
        constants$639.const$5
    );
}


