// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$882 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$882() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "InitializeContext2",
        constants$882.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "GetEnabledXStateFeatures",
        constants$74.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "GetXStateFeaturesMask",
        constants$34.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "LocateXStateFeature",
        constants$624.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SetXStateFeaturesMask",
        constants$39.const$3
    );
}

