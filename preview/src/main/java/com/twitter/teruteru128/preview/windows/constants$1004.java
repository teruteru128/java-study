// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1004 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1004() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "DeleteDC",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "DeleteMetaFile",
        constants$18.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "DeleteObject",
        constants$18.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "DescribePixelFormat",
        constants$644.const$5
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(LPFNDEVMODE.class, "apply", constants$1004.const$4);
}


