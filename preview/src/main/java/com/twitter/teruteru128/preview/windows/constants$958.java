// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$958 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$958() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cx"),
        JAVA_INT.withName("cy")
    ).withName("DISPLAYCONFIG_2DREGION");
    static final VarHandle const$1 = constants$958.const$0.varHandle(MemoryLayout.PathElement.groupElement("cx"));
    static final VarHandle const$2 = constants$958.const$0.varHandle(MemoryLayout.PathElement.groupElement("cy"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
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
    ).withName("DISPLAYCONFIG_VIDEO_SIGNAL_INFO");
    static final VarHandle const$4 = constants$958.const$3.varHandle(MemoryLayout.PathElement.groupElement("pixelRate"));
    static final VarHandle const$5 = constants$958.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("videoStandard"));
}


