// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4363 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4363() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "VarBstrFromI8",
        constants$1931.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        JAVA_FLOAT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "VarBstrFromR4",
        constants$4363.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_DOUBLE,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "VarBstrFromR8",
        constants$4363.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("Lo"),
                JAVA_INT.withName("Hi")
            ).withName("$anon$0"),
            JAVA_LONG.withName("int64")
        ).withName("tagCY"),
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "VarBstrFromCy",
        constants$4363.const$5
    );
}

