// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$768 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$768() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "PowerCreateRequest",
        constants$33.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "PowerSetRequest",
        constants$65.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "PowerClearRequest",
        constants$65.const$2
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_BYTE
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SetFileCompletionNotificationModes",
        constants$768.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "Wow64GetThreadSelectorEntry",
        constants$485.const$5
    );
}

