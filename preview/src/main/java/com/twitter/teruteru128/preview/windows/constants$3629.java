// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3629 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3629() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CoGetSystemSecurityPermissions",
        constants$12.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CoLoadLibrary",
        constants$30.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CoFreeLibrary",
        constants$0.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CoFreeAllLibraries",
        constants$0.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CoGetInstanceFromFile",
        constants$3629.const$4
    );
}

