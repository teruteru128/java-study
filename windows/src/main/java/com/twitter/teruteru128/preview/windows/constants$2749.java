// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2749 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2749() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SCardGetProviderIdW",
        constants$742.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SCardGetCardTypeProviderNameA",
        constants$2749.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SCardGetCardTypeProviderNameW",
        constants$2749.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SCardIntroduceReaderGroupA",
        constants$1897.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SCardIntroduceReaderGroupW",
        constants$1897.const$2
    );
}

