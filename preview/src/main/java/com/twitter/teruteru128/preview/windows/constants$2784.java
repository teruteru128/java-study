// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2784 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2784() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "GetOpenCardNameA",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetOpenCardNameW",
        constants$18.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SCardDlgExtendedError",
        constants$1.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SCardReadCacheA",
        constants$2784.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SCardReadCacheW",
        constants$2784.const$3
    );
}


