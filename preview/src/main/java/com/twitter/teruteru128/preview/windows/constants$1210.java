// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1210 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1210() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CreateDialogIndirectParamW",
        constants$1209.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "DialogBoxParamA",
        constants$1210.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "DialogBoxParamW",
        constants$1210.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "DialogBoxIndirectParamA",
        constants$1210.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "DialogBoxIndirectParamW",
        constants$1210.const$1
    );
}

