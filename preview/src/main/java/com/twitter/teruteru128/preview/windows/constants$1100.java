// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1100 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1100() {}
    static final VarHandle const$0 = constants$1097.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbBitsMask"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
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
        JAVA_INT.withName("xDest"),
        JAVA_INT.withName("yDest"),
        JAVA_INT.withName("xSrc"),
        JAVA_INT.withName("ySrc"),
        JAVA_INT.withName("cxSrc"),
        JAVA_INT.withName("cySrc"),
        JAVA_INT.withName("offBmiSrc"),
        JAVA_INT.withName("cbBmiSrc"),
        JAVA_INT.withName("offBitsSrc"),
        JAVA_INT.withName("cbBitsSrc"),
        JAVA_INT.withName("iUsageSrc"),
        JAVA_INT.withName("iStartScan"),
        JAVA_INT.withName("cScans")
    ).withName("tagEMRSETDIBITSTODEVICE");
    static final VarHandle const$2 = constants$1100.const$1.varHandle(MemoryLayout.PathElement.groupElement("xDest"));
    static final VarHandle const$3 = constants$1100.const$1.varHandle(MemoryLayout.PathElement.groupElement("yDest"));
    static final VarHandle const$4 = constants$1100.const$1.varHandle(MemoryLayout.PathElement.groupElement("xSrc"));
    static final VarHandle const$5 = constants$1100.const$1.varHandle(MemoryLayout.PathElement.groupElement("ySrc"));
}

