// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2507 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2507() {}
    static final VarHandle const$0 = constants$2505.const$5.varHandle(MemoryLayout.PathElement.groupElement("StartingDPA"));
    static final VarHandle const$1 = constants$2505.const$5.varHandle(MemoryLayout.PathElement.groupElement("BaseSPA"));
    static final VarHandle const$2 = constants$2505.const$5.varHandle(MemoryLayout.PathElement.groupElement("SPAOffset"));
    static final VarHandle const$3 = constants$2505.const$5.varHandle(MemoryLayout.PathElement.groupElement("RegionOffset"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("RegionCount"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_INT.withName("Version"),
            JAVA_INT.withName("Size"),
            JAVA_INT.withName("Flags"),
            JAVA_INT.withName("NfitHandle"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("Data1"),
                JAVA_SHORT.withName("Data2"),
                JAVA_SHORT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
            ).withName("LogicalDeviceGuid"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("Data1"),
                JAVA_SHORT.withName("Data2"),
                JAVA_SHORT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
            ).withName("AddressRangeType"),
            JAVA_INT.withName("AssociatedId"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("Length"),
            JAVA_LONG.withName("StartingDPA"),
            JAVA_LONG.withName("BaseSPA"),
            JAVA_LONG.withName("SPAOffset"),
            JAVA_LONG.withName("RegionOffset")
        ).withName("_SCM_REGION")).withName("Regions")
    ).withName("_SCM_REGIONS");
    static final VarHandle const$5 = constants$2507.const$4.varHandle(MemoryLayout.PathElement.groupElement("Version"));
}

