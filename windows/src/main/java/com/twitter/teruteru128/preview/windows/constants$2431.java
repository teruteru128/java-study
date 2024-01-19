// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2431 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2431() {}
    static final VarHandle const$0 = constants$2430.const$3.varHandle(MemoryLayout.PathElement.groupElement("ZoneSize"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("DeviceType"),
        JAVA_INT.withName("ZoneCount"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("MaxOpenZoneCount"),
                JAVA_BYTE.withName("UnrestrictedRead"),
                MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("Reserved")
            ).withName("SequentialRequiredZone"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("OptimalOpenZoneCount"),
                JAVA_INT.withName("Reserved")
            ).withName("SequentialPreferredZone")
        ).withName("ZoneAttributes"),
        JAVA_INT.withName("ZoneGroupCount"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_INT.withName("ZoneCount"),
            JAVA_INT.withName("ZoneType"),
            JAVA_LONG.withName("ZoneSize")
        ).withName("_STORAGE_ZONE_GROUP")).withName("ZoneGroup")
    ).withName("_STORAGE_ZONED_DEVICE_DESCRIPTOR");
    static final VarHandle const$2 = constants$2431.const$1.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$3 = constants$2431.const$1.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$4 = constants$2431.const$1.varHandle(MemoryLayout.PathElement.groupElement("DeviceType"));
    static final VarHandle const$5 = constants$2431.const$1.varHandle(MemoryLayout.PathElement.groupElement("ZoneCount"));
}

