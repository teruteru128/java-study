// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1000 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1000() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CreateEllipticRgnIndirect",
        constants$33.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CreateFontIndirectA",
        constants$33.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CreateFontIndirectW",
        constants$33.const$3
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CreateFontA",
        constants$1000.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CreateFontW",
        constants$1000.const$3
    );
}


