// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2427 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2427() {}
    static final VarHandle const$0 = constants$2426.const$4.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$1 = constants$2426.const$4.varHandle(MemoryLayout.PathElement.groupElement("Reason"));
    static final UnionLayout const$2 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("SenseKey"),
            JAVA_BYTE.withName("ASC"),
            JAVA_BYTE.withName("ASCQ"),
            JAVA_BYTE.withName("Reserved")
        ).withName("ScsiSenseKey"),
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("CriticalHealth"),
            MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("ModuleHealth"),
            JAVA_BYTE.withName("ErrorThresholdStatus")
        ).withName("NVDIMM_N"),
        JAVA_INT.withName("AsUlong")
    ).withName("");
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("SenseKey"),
        JAVA_BYTE.withName("ASC"),
        JAVA_BYTE.withName("ASCQ"),
        JAVA_BYTE.withName("Reserved")
    ).withName("");
    static final VarHandle const$4 = constants$2427.const$3.varHandle(MemoryLayout.PathElement.groupElement("SenseKey"));
    static final VarHandle const$5 = constants$2427.const$3.varHandle(MemoryLayout.PathElement.groupElement("ASC"));
}


