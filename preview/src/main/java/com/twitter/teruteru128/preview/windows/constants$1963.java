// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1963 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1963() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "BCryptFinishHash",
        constants$584.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "BCryptCreateMultiHash",
        constants$1963.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "BCryptProcessMultiOperations",
        constants$1258.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "BCryptDuplicateHash",
        constants$617.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "BCryptDestroyHash",
        constants$18.const$5
    );
}

