// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1935 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1935() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CryptDestroyHash",
        constants$883.const$1
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CryptSignHashA",
        constants$1935.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CryptSignHashW",
        constants$1935.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CryptVerifySignatureA",
        constants$1935.const$4
    );
}


