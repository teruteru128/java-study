// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$959 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$959() {}
    static final VarHandle const$0 = constants$958.const$3.varHandle(MemoryLayout.PathElement.groupElement("scanLineOrdering"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height"),
        JAVA_INT.withName("pixelFormat"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y")
        ).withName("position")
    ).withName("DISPLAYCONFIG_SOURCE_MODE");
    static final VarHandle const$2 = constants$959.const$1.varHandle(MemoryLayout.PathElement.groupElement("width"));
    static final VarHandle const$3 = constants$959.const$1.varHandle(MemoryLayout.PathElement.groupElement("height"));
    static final VarHandle const$4 = constants$959.const$1.varHandle(MemoryLayout.PathElement.groupElement("pixelFormat"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("pixelRate"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("Numerator"),
                JAVA_INT.withName("Denominator")
            ).withName("hSyncFreq"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("Numerator"),
                JAVA_INT.withName("Denominator")
            ).withName("vSyncFreq"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cx"),
                JAVA_INT.withName("cy")
            ).withName("activeSize"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cx"),
                JAVA_INT.withName("cy")
            ).withName("totalSize"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(4)
                ).withName("AdditionalSignalInfo"),
                JAVA_INT.withName("videoStandard")
            ).withName("$anon$0"),
            JAVA_INT.withName("scanLineOrdering")
        ).withName("targetVideoSignalInfo")
    ).withName("DISPLAYCONFIG_TARGET_MODE");
}

