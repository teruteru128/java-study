// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2566 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2566() {}
    static final VarHandle const$0 = constants$2562.const$2.varHandle(MemoryLayout.PathElement.groupElement("ExchangeFromSlot"));
    static final VarHandle const$1 = constants$2562.const$2.varHandle(MemoryLayout.PathElement.groupElement("ExchangeFromIePort"));
    static final VarHandle const$2 = constants$2562.const$2.varHandle(MemoryLayout.PathElement.groupElement("ExchangeFromDrive"));
    static final VarHandle const$3 = constants$2562.const$2.varHandle(MemoryLayout.PathElement.groupElement("LockUnlockCapabilities"));
    static final VarHandle const$4 = constants$2562.const$2.varHandle(MemoryLayout.PathElement.groupElement("PositionCapabilities"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("VendorId"),
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("ProductId"),
        MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("Revision"),
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("SerialNumber"),
        JAVA_BYTE.withName("DeviceType")
    ).withName("_CHANGER_PRODUCT_DATA");
}

