// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2756 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2756() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SCardLocateCardsByATRA",
        constants$2756.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SCardLocateCardsByATRW",
        constants$2756.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SCardGetStatusChangeA",
        constants$1931.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SCardGetStatusChangeW",
        constants$1931.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SCardCancel",
        constants$883.const$1
    );
}


