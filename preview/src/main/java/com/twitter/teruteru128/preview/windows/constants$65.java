// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$65 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$65() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_SHORT,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        JAVA_SHORT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "_InterlockedCompareExchange16",
        constants$65.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_InterlockedAnd",
        constants$65.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_InterlockedOr",
        constants$65.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "_InterlockedXor",
        constants$65.const$2
    );
}


