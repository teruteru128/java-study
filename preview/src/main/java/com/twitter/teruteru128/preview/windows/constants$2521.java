// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2521 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2521() {}
    static final VarHandle const$0 = constants$2520.const$5.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$1 = constants$2520.const$5.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$2 = constants$2520.const$5.varHandle(MemoryLayout.PathElement.groupElement("NumberOfProperties"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_BYTE.withName("SlotNumber"),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.sequenceLayout(6, JAVA_BYTE).withName("Reserved1"),
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("Revision")
    ).withName("_SCM_PD_FIRMWARE_SLOT_INFO");
    static final VarHandle const$4 = constants$2521.const$3.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$5 = constants$2521.const$3.varHandle(MemoryLayout.PathElement.groupElement("Size"));
}


