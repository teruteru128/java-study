// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$464 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$464() {}
    static final VarHandle const$0 = constants$463.const$2.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$1 = constants$463.const$2.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("EntryPointToken"));
    static final VarHandle const$2 = constants$463.const$2.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("EntryPointRVA"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_SHORT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "RtlCaptureStackBackTrace",
        constants$464.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "RtlCaptureContext",
        constants$0.const$0
    );
}

