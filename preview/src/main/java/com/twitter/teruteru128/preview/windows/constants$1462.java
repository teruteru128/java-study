// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1462 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1462() {}
    static final VarHandle const$0 = constants$1461.const$2.varHandle(MemoryLayout.PathElement.groupElement("bFullscreenSupported"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetConsoleScreenBufferInfoEx",
        constants$34.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SetConsoleScreenBufferInfoEx",
        constants$34.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SetConsoleScreenBufferSize",
        constants$1457.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SetConsoleCursorPosition",
        constants$1457.const$4
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_SHORT.withName("X"),
        JAVA_SHORT.withName("Y")
    ).withName("_COORD"),
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "GetLargestConsoleWindowSize",
        constants$1462.const$5
    );
}

