// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4507 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4507() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "EnumServicesStatusW",
        constants$4506.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "EnumServicesStatusExA",
        constants$4507.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "EnumServicesStatusExW",
        constants$4507.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetServiceKeyNameA",
        constants$1.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "GetServiceKeyNameW",
        constants$1.const$3
    );
}

