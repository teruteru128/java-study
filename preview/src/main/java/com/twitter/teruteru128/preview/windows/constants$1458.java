// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1458 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1458() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "ClosePseudoConsole",
        constants$0.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_BYTE,
        JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("X"),
            JAVA_SHORT.withName("Y")
        ).withName("_COORD"),
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "FillConsoleOutputCharacterA",
        constants$1458.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("X"),
            JAVA_SHORT.withName("Y")
        ).withName("_COORD"),
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "FillConsoleOutputCharacterW",
        constants$1458.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "FillConsoleOutputAttribute",
        constants$1458.const$3
    );
}

