// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2422 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2422() {}
    static final VarHandle const$0 = constants$2421.const$0.varHandle(MemoryLayout.PathElement.groupElement("Capacity"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("AdapterId"),
        JAVA_INT.withName("HealthStatus"),
        JAVA_INT.withName("CommandProtocol"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        JAVA_BYTE.withName("SubMinor"),
                        JAVA_BYTE.withName("Minor")
                    ).withName("$anon$0"),
                    JAVA_SHORT.withName("AsUshort")
                ).withName("MinorVersion"),
                JAVA_SHORT.withName("MajorVersion")
            ).withName("$anon$0"),
            JAVA_INT.withName("AsUlong")
        ).withName("SpecVersion"),
        MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Vendor"),
        MemoryLayout.sequenceLayout(40, JAVA_BYTE).withName("Model"),
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("FirmwareRevision"),
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("PhysicalLocation"),
        JAVA_BYTE.withName("ExpanderConnected"),
        MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("Reserved0"),
        MemoryLayout.sequenceLayout(3, JAVA_INT).withName("Reserved1")
    ).withName("_STORAGE_PHYSICAL_ADAPTER_DATA");
    static final VarHandle const$2 = constants$2422.const$1.varHandle(MemoryLayout.PathElement.groupElement("AdapterId"));
    static final VarHandle const$3 = constants$2422.const$1.varHandle(MemoryLayout.PathElement.groupElement("HealthStatus"));
    static final VarHandle const$4 = constants$2422.const$1.varHandle(MemoryLayout.PathElement.groupElement("CommandProtocol"));
    static final VarHandle const$5 = constants$2422.const$1.varHandle(MemoryLayout.PathElement.groupElement("ExpanderConnected"));
}


