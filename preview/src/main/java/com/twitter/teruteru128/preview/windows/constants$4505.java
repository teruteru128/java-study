// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4505 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4505() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "ChangeServiceConfigW",
        constants$4504.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "ChangeServiceConfig2A",
        constants$485.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ChangeServiceConfig2W",
        constants$485.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CloseServiceHandle",
        constants$18.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "ControlService",
        constants$485.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "CreateServiceA",
        constants$4505.const$5
    );
}


