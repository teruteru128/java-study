// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$836 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$836() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "GetUserNameA",
        constants$34.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetUserNameW",
        constants$34.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "LogonUserA",
        constants$836.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "LogonUserW",
        constants$836.const$2
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "LogonUserExA",
        constants$836.const$5
    );
}

