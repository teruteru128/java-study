// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2576 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2576() {}
    static final VarHandle const$0 = constants$2575.const$1.varHandle(MemoryLayout.PathElement.groupElement("BytesPerSector"));
    static final VarHandle const$1 = constants$2575.const$1.varHandle(MemoryLayout.PathElement.groupElement("BytesPerCluster"));
    static final VarHandle const$2 = constants$2575.const$1.varHandle(MemoryLayout.PathElement.groupElement("FastTierDataFillRatio"));
    static final VarHandle const$3 = constants$2575.const$1.varHandle(MemoryLayout.PathElement.groupElement("SlowTierDataFillRatio"));
    static final VarHandle const$4 = constants$2575.const$1.varHandle(MemoryLayout.PathElement.groupElement("DestagesFastTierToSlowTierRate"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("u"),
            JAVA_LONG.withName("QuadPart")
        ).withName("StartingLcn")
    ).withName("");
}

