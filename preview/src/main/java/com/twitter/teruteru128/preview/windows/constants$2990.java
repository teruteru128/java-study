// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2990 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2990() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "_mbstowcs_l",
        constants$41.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "wctomb",
        constants$1463.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_wctomb_l",
        constants$647.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_SHORT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "wctomb_s",
        constants$2990.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_SHORT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "_wctomb_s_l",
        constants$2990.const$5
    );
}


