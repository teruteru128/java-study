// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4389 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4389() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("Lo"),
                JAVA_INT.withName("Hi")
            ).withName("$anon$0"),
            JAVA_LONG.withName("int64")
        ).withName("tagCY"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("Lo"),
                JAVA_INT.withName("Hi")
            ).withName("$anon$0"),
            JAVA_LONG.withName("int64")
        ).withName("tagCY")
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "VarCyCmp",
        constants$4389.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("Lo"),
                JAVA_INT.withName("Hi")
            ).withName("$anon$0"),
            JAVA_LONG.withName("int64")
        ).withName("tagCY"),
        JAVA_DOUBLE
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "VarCyCmpR8",
        constants$4389.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "VarBstrCat",
        constants$37.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "VarBstrCmp",
        constants$584.const$5
    );
}

