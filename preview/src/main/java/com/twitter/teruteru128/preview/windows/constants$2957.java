// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2957 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2957() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "_lfind",
        constants$2957.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_lsearch_s",
        constants$2956.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_lsearch",
        constants$2957.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "lfind",
        constants$2957.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "lsearch",
        constants$2957.const$0
    );
}

