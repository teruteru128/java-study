// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$968 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$968() {}
    static final VarHandle const$0 = constants$967.const$5.varHandle(MemoryLayout.PathElement.groupElement("SDRWhiteLevel"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            JAVA_INT.withName("size"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("adapterId"),
            JAVA_INT.withName("id")
        ).withName("header"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$0"),
            JAVA_INT.withName("value")
        ).withName("$anon$0")
    ).withName("_DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION");
    static final VarHandle const$2 = constants$968.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("value"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            JAVA_INT.withName("size"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("adapterId"),
            JAVA_INT.withName("id")
        ).withName("header"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$0"),
            JAVA_INT.withName("value")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("specializationType"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("specializationSubType"),
        MemoryLayout.sequenceLayout(128, JAVA_SHORT).withName("specializationApplicationName")
    ).withName("_DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION");
    static final VarHandle const$4 = constants$968.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("value"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwSize"),
        JAVA_INT.withName("iType"),
        JAVA_INT.withName("nCount"),
        JAVA_INT.withName("nRgnSize"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("left"),
            JAVA_INT.withName("top"),
            JAVA_INT.withName("right"),
            JAVA_INT.withName("bottom")
        ).withName("rcBound")
    ).withName("_RGNDATAHEADER");
}


