// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4333 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4333() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SysStringByteLen",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SysAllocStringByteLen",
        constants$30.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "DosDateTimeToVariantTime",
        constants$11.const$3
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_DOUBLE,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "VariantTimeToDosDateTime",
        constants$4333.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SystemTimeToVariantTime",
        constants$34.const$0
    );
}


