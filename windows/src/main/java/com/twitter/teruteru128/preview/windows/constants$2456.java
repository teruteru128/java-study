// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2456 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2456() {}
    static final VarHandle const$0 = constants$2455.const$1.varHandle(MemoryLayout.PathElement.groupElement("Alignment"));
    static final VarHandle const$1 = constants$2455.const$1.varHandle(MemoryLayout.PathElement.groupElement("TotalNumberOfRegions"));
    static final VarHandle const$2 = constants$2455.const$1.varHandle(MemoryLayout.PathElement.groupElement("NumberOfRegionsReturned"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Size"),
        JAVA_BYTE.withName("TargetPriority"),
        MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("Reserved")
    ).withName("_DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS");
    static final VarHandle const$4 = constants$2456.const$3.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$5 = constants$2456.const$3.varHandle(MemoryLayout.PathElement.groupElement("TargetPriority"));
}

