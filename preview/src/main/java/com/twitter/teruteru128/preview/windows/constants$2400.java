// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2400 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2400() {}
    static final VarHandle const$0 = constants$2399.const$2.varHandle(MemoryLayout.PathElement.groupElement("UsedMappingResources"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_BYTE.withName("DeviceAttentionSupported"),
        JAVA_BYTE.withName("AsynchronousNotificationSupported"),
        JAVA_BYTE.withName("IdlePowerManagementEnabled"),
        JAVA_BYTE.withName("D3ColdEnabled"),
        JAVA_BYTE.withName("D3ColdSupported"),
        JAVA_BYTE.withName("NoVerifyDuringIdlePower"),
        MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("Reserved"),
        JAVA_INT.withName("IdleTimeoutInMS")
    ).withName("_DEVICE_POWER_DESCRIPTOR");
    static final VarHandle const$2 = constants$2400.const$1.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$3 = constants$2400.const$1.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$4 = constants$2400.const$1.varHandle(MemoryLayout.PathElement.groupElement("DeviceAttentionSupported"));
    static final VarHandle const$5 = constants$2400.const$1.varHandle(MemoryLayout.PathElement.groupElement("AsynchronousNotificationSupported"));
}

