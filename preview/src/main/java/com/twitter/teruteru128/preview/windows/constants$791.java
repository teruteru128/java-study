// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$791 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$791() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "FindResourceA",
        constants$33.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "FindResourceExA",
        constants$709.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "EnumResourceTypesA",
        constants$29.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "EnumResourceTypesW",
        constants$29.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "EnumResourceLanguagesA",
        constants$791.const$4
    );
}


