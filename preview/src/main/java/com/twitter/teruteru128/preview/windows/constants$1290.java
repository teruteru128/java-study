// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1290 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1290() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "GetMenuContextHelpId",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "MessageBoxA",
        constants$607.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "MessageBoxW",
        constants$607.const$3
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_SHORT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "MessageBoxExA",
        constants$1290.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "MessageBoxExW",
        constants$1290.const$3
    );
}


