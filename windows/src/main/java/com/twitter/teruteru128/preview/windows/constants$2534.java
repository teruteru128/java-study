// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2534 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2534() {}
    static final VarHandle const$0 = constants$2532.const$5.varHandle(MemoryLayout.PathElement.groupElement("SectorsPerTrack"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
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
        ).withName("Cylinders"),
        JAVA_INT.withName("MediaType"),
        JAVA_INT.withName("TracksPerCylinder"),
        JAVA_INT.withName("SectorsPerTrack"),
        JAVA_INT.withName("BytesPerSector")
    ).withName("_DISK_GEOMETRY");
    static final VarHandle const$2 = constants$2534.const$1.varHandle(MemoryLayout.PathElement.groupElement("MediaType"));
    static final VarHandle const$3 = constants$2534.const$1.varHandle(MemoryLayout.PathElement.groupElement("TracksPerCylinder"));
    static final VarHandle const$4 = constants$2534.const$1.varHandle(MemoryLayout.PathElement.groupElement("SectorsPerTrack"));
    static final VarHandle const$5 = constants$2534.const$1.varHandle(MemoryLayout.PathElement.groupElement("BytesPerSector"));
}

