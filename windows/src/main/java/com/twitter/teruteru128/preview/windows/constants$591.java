// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$591 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$591() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SetFileValidData",
        constants$39.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "UnlockFile",
        constants$587.const$5
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "UnlockFileEx",
        constants$591.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "WriteFile",
        constants$588.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "WriteFileEx",
        constants$588.const$3
    );
}

