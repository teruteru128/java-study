// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$709 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$709() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_SHORT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "FindResourceExW",
        constants$709.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "FindStringOrdinal",
        constants$709.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "FreeLibrary",
        constants$18.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "FreeLibraryAndExitThread",
        constants$72.const$3
    );
}


