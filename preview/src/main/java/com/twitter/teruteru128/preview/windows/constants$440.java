// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$440 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$440() {}
    static final VarHandle const$0 = constants$438.const$5.varHandle(MemoryLayout.PathElement.groupElement("ExtraPatchSize"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("SequenceNumber"),
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("OriginalTimeDateStamp"),
        JAVA_INT.withName("OriginalCheckSum"),
        JAVA_INT.withName("CodeIntegrityInfo"),
        JAVA_INT.withName("CodeIntegritySize"),
        JAVA_INT.withName("PatchTable"),
        JAVA_INT.withName("BufferOffset")
    ).withName("_IMAGE_HOT_PATCH_BASE");
    static final VarHandle const$2 = constants$440.const$1.varHandle(MemoryLayout.PathElement.groupElement("SequenceNumber"));
    static final VarHandle const$3 = constants$440.const$1.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$4 = constants$440.const$1.varHandle(MemoryLayout.PathElement.groupElement("OriginalTimeDateStamp"));
    static final VarHandle const$5 = constants$440.const$1.varHandle(MemoryLayout.PathElement.groupElement("OriginalCheckSum"));
}

