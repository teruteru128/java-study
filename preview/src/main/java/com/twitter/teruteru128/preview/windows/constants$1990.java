// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1990 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1990() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "NCryptEnumKeys",
        constants$1990.const$0
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pszName"),
        RuntimeHelper.POINTER.withName("pszComment")
    ).withName("NCryptProviderName");
    static final VarHandle const$3 = constants$1990.const$2.varHandle(MemoryLayout.PathElement.groupElement("pszName"));
    static final VarHandle const$4 = constants$1990.const$2.varHandle(MemoryLayout.PathElement.groupElement("pszComment"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "NCryptEnumStorageProviders",
        constants$570.const$5
    );
}

