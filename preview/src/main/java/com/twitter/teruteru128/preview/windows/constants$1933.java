// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1933 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1933() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CryptGenRandom",
        constants$1907.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CryptGetUserKey",
        constants$1907.const$1
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CryptExportKey",
        constants$1933.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CryptImportKey",
        constants$1933.const$4
    );
}


