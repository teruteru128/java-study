// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1118 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1118() {}
    static final VarHandle const$0 = constants$1116.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbBmiSrc"));
    static final VarHandle const$1 = constants$1116.const$1.varHandle(MemoryLayout.PathElement.groupElement("offBitsSrc"));
    static final VarHandle const$2 = constants$1116.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbBitsSrc"));
    static final VarHandle const$3 = constants$1116.const$1.varHandle(MemoryLayout.PathElement.groupElement("cxSrc"));
    static final VarHandle const$4 = constants$1116.const$1.varHandle(MemoryLayout.PathElement.groupElement("cySrc"));
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
        JAVA_INT.withName("nVer"),
        JAVA_INT.withName("nTri"),
        JAVA_INT.withName("ulMode"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y"),
            JAVA_SHORT.withName("Red"),
            JAVA_SHORT.withName("Green"),
            JAVA_SHORT.withName("Blue"),
            JAVA_SHORT.withName("Alpha")
        ).withName("_TRIVERTEX")).withName("Ver")
    ).withName("tagEMRGRADIENTFILL");
}


