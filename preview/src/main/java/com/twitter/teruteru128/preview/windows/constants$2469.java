// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2469 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2469() {}
    static final VarHandle const$0 = constants$2468.const$2.varHandle(MemoryLayout.PathElement.groupElement("TargetType"));
    static final VarHandle const$1 = constants$2468.const$2.varHandle(MemoryLayout.PathElement.groupElement("Level"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("ProviderId"),
        JAVA_INT.withName("BufferSize"),
        JAVA_INT.withName("Reserved"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("DiagnosticDataBuffer"),
        MemoryLayout.paddingLayout(3)
    ).withName("_STORAGE_DIAGNOSTIC_DATA");
    static final VarHandle const$3 = constants$2469.const$2.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$4 = constants$2469.const$2.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$5 = constants$2469.const$2.varHandle(MemoryLayout.PathElement.groupElement("BufferSize"));
}

