// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2459 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2459() {}
    static final VarHandle const$0 = constants$2458.const$4.varHandle(MemoryLayout.PathElement.groupElement("ReportOption"));
    static final VarHandle const$1 = constants$2458.const$4.varHandle(MemoryLayout.PathElement.groupElement("Partial"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("ZoneType"),
        JAVA_INT.withName("ZoneCondition"),
        JAVA_BYTE.withName("ResetWritePointerRecommend"),
        MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("Reserved0"),
        JAVA_LONG.withName("ZoneSize"),
        JAVA_LONG.withName("WritePointerOffset")
    ).withName("_STORAGE_ZONE_DESCRIPTOR");
    static final VarHandle const$3 = constants$2459.const$2.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$4 = constants$2459.const$2.varHandle(MemoryLayout.PathElement.groupElement("ZoneType"));
    static final VarHandle const$5 = constants$2459.const$2.varHandle(MemoryLayout.PathElement.groupElement("ZoneCondition"));
}

