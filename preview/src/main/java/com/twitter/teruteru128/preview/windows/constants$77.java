// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$77 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$77() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_BYTE
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "__shiftleft128",
        constants$77.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "__shiftright128",
        constants$77.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_mul128",
        constants$77.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "UnsignedMultiply128",
        constants$77.const$3
    );
}


