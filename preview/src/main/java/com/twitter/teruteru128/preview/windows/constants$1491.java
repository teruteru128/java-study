// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1491 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1491() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "RegEnumKeyExA",
        constants$1491.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "RegEnumKeyExW",
        constants$1491.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "RegEnumValueA",
        constants$1491.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "RegEnumValueW",
        constants$1491.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "RegFlushKey",
        constants$18.const$5
    );
}


