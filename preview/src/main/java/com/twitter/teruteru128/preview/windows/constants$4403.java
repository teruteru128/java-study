// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4403 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4403() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "OleCreate",
        constants$2185.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "OleCreateEx",
        constants$4403.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "OleCreateFromData",
        constants$2185.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "OleCreateFromDataEx",
        constants$4403.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "OleCreateLinkFromData",
        constants$2185.const$2
    );
}


