// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1332 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1332() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "DefMDIChildProcW",
        constants$1131.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "TranslateMDISysAccel",
        constants$34.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ArrangeIconicWindows",
        constants$18.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CreateMDIWindowA",
        constants$1332.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CreateMDIWindowW",
        constants$1332.const$3
    );
}


