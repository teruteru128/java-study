// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1425 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1425() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "FoldStringW",
        constants$1354.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "GetStringTypeExW",
        constants$1425.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetStringTypeW",
        constants$1425.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "MultiByteToWideChar",
        constants$1424.const$5
    );
}


