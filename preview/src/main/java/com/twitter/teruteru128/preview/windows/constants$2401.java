// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2401 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2401() {}
    static final VarHandle const$0 = constants$2400.const$1.varHandle(MemoryLayout.PathElement.groupElement("IdlePowerManagementEnabled"));
    static final VarHandle const$1 = constants$2400.const$1.varHandle(MemoryLayout.PathElement.groupElement("D3ColdEnabled"));
    static final VarHandle const$2 = constants$2400.const$1.varHandle(MemoryLayout.PathElement.groupElement("D3ColdSupported"));
    static final VarHandle const$3 = constants$2400.const$1.varHandle(MemoryLayout.PathElement.groupElement("NoVerifyDuringIdlePower"));
    static final VarHandle const$4 = constants$2400.const$1.varHandle(MemoryLayout.PathElement.groupElement("IdleTimeoutInMS"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("MaximumTokenLifetime"),
        JAVA_INT.withName("DefaultTokenLifetime"),
        JAVA_LONG.withName("MaximumTransferSize"),
        JAVA_LONG.withName("OptimalTransferCount"),
        JAVA_INT.withName("MaximumDataDescriptors"),
        JAVA_INT.withName("MaximumTransferLengthPerDescriptor"),
        JAVA_INT.withName("OptimalTransferLengthPerDescriptor"),
        JAVA_SHORT.withName("OptimalTransferLengthGranularity"),
        MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("Reserved")
    ).withName("_DEVICE_COPY_OFFLOAD_DESCRIPTOR");
}


