// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2386 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2386() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_BYTE.withName("DeviceType"),
        JAVA_BYTE.withName("DeviceTypeModifier"),
        JAVA_BYTE.withName("RemovableMedia"),
        JAVA_BYTE.withName("CommandQueueing"),
        JAVA_INT.withName("VendorIdOffset"),
        JAVA_INT.withName("ProductIdOffset"),
        JAVA_INT.withName("ProductRevisionOffset"),
        JAVA_INT.withName("SerialNumberOffset"),
        JAVA_INT.withName("BusType"),
        JAVA_INT.withName("RawPropertiesLength"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("RawDeviceProperties"),
        MemoryLayout.paddingLayout(3)
    ).withName("_STORAGE_DEVICE_DESCRIPTOR");
    static final VarHandle const$1 = constants$2386.const$0.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$2 = constants$2386.const$0.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$3 = constants$2386.const$0.varHandle(MemoryLayout.PathElement.groupElement("DeviceType"));
    static final VarHandle const$4 = constants$2386.const$0.varHandle(MemoryLayout.PathElement.groupElement("DeviceTypeModifier"));
    static final VarHandle const$5 = constants$2386.const$0.varHandle(MemoryLayout.PathElement.groupElement("RemovableMedia"));
}


