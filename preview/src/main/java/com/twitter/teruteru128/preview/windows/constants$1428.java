// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1428 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1428() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "LCMapStringA",
        constants$1424.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetLocaleInfoW",
        constants$669.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "GetLocaleInfoA",
        constants$669.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SetLocaleInfoA",
        constants$12.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SetLocaleInfoW",
        constants$12.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "GetCalendarInfoA",
        constants$1428.const$5
    );
}


