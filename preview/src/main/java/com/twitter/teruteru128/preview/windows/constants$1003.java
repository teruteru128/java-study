// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1003 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1003() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CreateRectRgnIndirect",
        constants$33.const$3
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CreateRoundRectRgn",
        constants$1003.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CreateScalableFontResourceA",
        constants$725.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CreateScalableFontResourceW",
        constants$725.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CreateSolidBrush",
        constants$36.const$2
    );
}


