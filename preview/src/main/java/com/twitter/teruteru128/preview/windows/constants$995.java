// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$995 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$995() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(LINEDDAPROC.class, "apply", constants$994.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$994.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "AddFontResourceA",
        constants$18.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "AddFontResourceW",
        constants$18.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "AnimatePalette",
        constants$644.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "Arc",
        constants$995.const$5
    );
}


