// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$31 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$31() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "wcsrchr",
        constants$30.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "wcsstr",
        constants$30.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_memicmp",
        constants$29.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_memicmp_l",
        constants$31.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "memccpy",
        constants$31.const$5
    );
}


