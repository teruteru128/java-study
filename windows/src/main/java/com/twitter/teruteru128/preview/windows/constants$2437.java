// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2437 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2437() {}
    static final VarHandle const$0 = constants$2436.const$5.varHandle(MemoryLayout.PathElement.groupElement("ValidFields"));
    static final VarHandle const$1 = constants$2436.const$5.varHandle(MemoryLayout.PathElement.groupElement("GroupId"));
    static final VarHandle const$2 = constants$2436.const$5.varHandle(MemoryLayout.PathElement.groupElement("LifePercentage"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("ValidFields"),
            JAVA_INT.withName("GroupId"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("Flags"),
            JAVA_INT.withName("LifePercentage"),
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("BytesReadCount"),
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("ByteWriteCount")
        ).withName("EnduranceInfo")
    ).withName("_STORAGE_HW_ENDURANCE_DATA_DESCRIPTOR");
    static final VarHandle const$4 = constants$2437.const$3.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$5 = constants$2437.const$3.varHandle(MemoryLayout.PathElement.groupElement("Size"));
}

