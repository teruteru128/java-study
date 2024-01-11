// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2517 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2517() {}
    static final VarHandle const$0 = constants$2516.const$3.varHandle(MemoryLayout.PathElement.groupElement("DeviceHandle"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("DeviceGuid"),
        JAVA_INT.withName("UnsafeShutdownCount"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("PersistentMemorySizeInBytes"),
        JAVA_LONG.withName("VolatileMemorySizeInBytes"),
        JAVA_LONG.withName("TotalMemorySizeInBytes"),
        JAVA_INT.withName("SlotNumber"),
        JAVA_INT.withName("DeviceHandle"),
        JAVA_SHORT.withName("PhysicalId"),
        JAVA_BYTE.withName("NumberOfFormatInterfaceCodes"),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.sequenceLayout(8, JAVA_SHORT).withName("FormatInterfaceCodes"),
        JAVA_INT.withName("VendorId"),
        JAVA_INT.withName("ProductId"),
        JAVA_INT.withName("SubsystemDeviceId"),
        JAVA_INT.withName("SubsystemVendorId"),
        JAVA_BYTE.withName("ManufacturingLocation"),
        JAVA_BYTE.withName("ManufacturingWeek"),
        JAVA_BYTE.withName("ManufacturingYear"),
        MemoryLayout.paddingLayout(1),
        JAVA_INT.withName("SerialNumber4Byte"),
        JAVA_INT.withName("SerialNumberLengthInChars"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("SerialNumber"),
        MemoryLayout.paddingLayout(7)
    ).withName("_SCM_PD_DEVICE_INFO");
    static final VarHandle const$2 = constants$2517.const$1.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$3 = constants$2517.const$1.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$4 = constants$2517.const$1.varHandle(MemoryLayout.PathElement.groupElement("UnsafeShutdownCount"));
    static final VarHandle const$5 = constants$2517.const$1.varHandle(MemoryLayout.PathElement.groupElement("PersistentMemorySizeInBytes"));
}

