// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2726 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2726() {}
    static final VarHandle const$0 = constants$2725.const$3.varHandle(MemoryLayout.PathElement.groupElement("StartOffset"));
    static final VarHandle const$1 = constants$2725.const$3.varHandle(MemoryLayout.PathElement.groupElement("LengthInBytes"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("NumBadRanges"),
        JAVA_LONG.withName("NextOffsetToLookUp"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_INT.withName("Flags"),
            JAVA_INT.withName("Reserved"),
            JAVA_LONG.withName("StartOffset"),
            JAVA_LONG.withName("LengthInBytes")
        ).withName("_QUERY_BAD_RANGES_OUTPUT_RANGE")).withName("BadRanges")
    ).withName("_QUERY_BAD_RANGES_OUTPUT");
    static final VarHandle const$3 = constants$2726.const$2.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$4 = constants$2726.const$2.varHandle(MemoryLayout.PathElement.groupElement("NumBadRanges"));
    static final VarHandle const$5 = constants$2726.const$2.varHandle(MemoryLayout.PathElement.groupElement("NextOffsetToLookUp"));
}

