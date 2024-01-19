// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2710 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2710() {}
    static final VarHandle const$0 = constants$2709.const$4.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$1 = constants$2709.const$4.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$2 = constants$2709.const$4.varHandle(MemoryLayout.PathElement.groupElement("TotalNumberOfTiers"));
    static final VarHandle const$3 = constants$2709.const$4.varHandle(MemoryLayout.PathElement.groupElement("NumberOfTiersReturned"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Flags"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("Class"),
                JAVA_INT.withName("Flags")
            ).withName("DesiredStorageClass"),
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("Length"),
                JAVA_SHORT.withName("Flags"),
                JAVA_INT.withName("Reserved"),
                JAVA_LONG.withName("Vdl")
            ).withName("DataStream"),
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("Length"),
                JAVA_SHORT.withName("Flags"),
                JAVA_INT.withName("ReparseDataSize"),
                JAVA_INT.withName("ReparseDataOffset")
            ).withName("Reparse"),
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("Length"),
                JAVA_SHORT.withName("Flags"),
                JAVA_INT.withName("EaSize"),
                JAVA_INT.withName("EaInformationOffset")
            ).withName("Ea")
        ).withName("StreamInformation")
    ).withName("_STREAM_INFORMATION_ENTRY");
    static final VarHandle const$5 = constants$2710.const$4.varHandle(MemoryLayout.PathElement.groupElement("Version"));
}

