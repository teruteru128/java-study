// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1467 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1467() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SetConsoleTitleA",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SetConsoleTitleW",
        constants$18.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "GetNumberOfConsoleMouseButtons",
        constants$18.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_SHORT.withName("X"),
        JAVA_SHORT.withName("Y")
    ).withName("_COORD"),
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetConsoleFontSize",
        constants$1467.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "GetCurrentConsoleFont",
        constants$485.const$5
    );
}

