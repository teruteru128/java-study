// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1084 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1084() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("left"),
            JAVA_INT.withName("top"),
            JAVA_INT.withName("right"),
            JAVA_INT.withName("bottom")
        ).withName("rclBounds"),
        JAVA_INT.withName("cpts"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_SHORT.withName("x"),
            JAVA_SHORT.withName("y")
        ).withName("tagPOINTS")).withName("apts"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("abTypes"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagEMRPOLYDRAW16");
    static final VarHandle const$1 = constants$1084.const$0.varHandle(MemoryLayout.PathElement.groupElement("cpts"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("left"),
            JAVA_INT.withName("top"),
            JAVA_INT.withName("right"),
            JAVA_INT.withName("bottom")
        ).withName("rclBounds"),
        JAVA_INT.withName("nPolys"),
        JAVA_INT.withName("cptl"),
        MemoryLayout.sequenceLayout(1, JAVA_INT).withName("aPolyCounts"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y")
        ).withName("_POINTL")).withName("aptl")
    ).withName("tagEMRPOLYPOLYLINE");
    static final VarHandle const$3 = constants$1084.const$2.varHandle(MemoryLayout.PathElement.groupElement("nPolys"));
    static final VarHandle const$4 = constants$1084.const$2.varHandle(MemoryLayout.PathElement.groupElement("cptl"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("left"),
            JAVA_INT.withName("top"),
            JAVA_INT.withName("right"),
            JAVA_INT.withName("bottom")
        ).withName("rclBounds"),
        JAVA_INT.withName("nPolys"),
        JAVA_INT.withName("cpts"),
        MemoryLayout.sequenceLayout(1, JAVA_INT).withName("aPolyCounts"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_SHORT.withName("x"),
            JAVA_SHORT.withName("y")
        ).withName("tagPOINTS")).withName("apts")
    ).withName("tagEMRPOLYPOLYLINE16");
}

