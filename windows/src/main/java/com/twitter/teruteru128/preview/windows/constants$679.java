// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$679 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$679() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("VirtualAddress"),
        JAVA_LONG.withName("NumberOfBytes")
    ).withName("_WIN32_MEMORY_RANGE_ENTRY");
    static final VarHandle const$1 = constants$679.const$0.varHandle(MemoryLayout.PathElement.groupElement("VirtualAddress"));
    static final VarHandle const$2 = constants$679.const$0.varHandle(MemoryLayout.PathElement.groupElement("NumberOfBytes"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "PrefetchVirtualMemory",
        constants$679.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "CreateFileMappingFromApp",
        constants$679.const$5
    );
}

