// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$762 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$762() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "ConvertFiberToThread",
        constants$1.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CreateFiberEx",
        constants$762.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "ConvertThreadToFiberEx",
        constants$30.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CreateFiber",
        constants$469.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "ConvertThreadToFiber",
        constants$33.const$3
    );
}


