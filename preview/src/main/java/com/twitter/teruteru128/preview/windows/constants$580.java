// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$580 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$580() {}
    static final VarHandle const$0 = constants$578.const$3.varHandle(MemoryLayout.PathElement.groupElement("VolumeStorageReserveAllocationUnits"));
    static final VarHandle const$1 = constants$578.const$3.varHandle(MemoryLayout.PathElement.groupElement("AvailableCommittedAllocationUnits"));
    static final VarHandle const$2 = constants$578.const$3.varHandle(MemoryLayout.PathElement.groupElement("PoolAvailableAllocationUnits"));
    static final VarHandle const$3 = constants$578.const$3.varHandle(MemoryLayout.PathElement.groupElement("SectorsPerAllocationUnit"));
    static final VarHandle const$4 = constants$578.const$3.varHandle(MemoryLayout.PathElement.groupElement("BytesPerSector"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "GetDiskSpaceInformationA",
        constants$34.const$0
    );
}


