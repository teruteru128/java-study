// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2509 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2509() {}
    static final VarHandle const$0 = constants$2508.const$2.varHandle(MemoryLayout.PathElement.groupElement("QueryType"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_BYTE.withName("RuntimeFwActivationSupported"),
        MemoryLayout.paddingLayout(3),
        JAVA_INT.withName("FirmwareActivationState"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(4)
        ).withName("FirmwareActivationCapability"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("EstimatedFirmwareActivationTimeInUSecs"),
        JAVA_LONG.withName("EstimatedProcessorAccessQuiesceTimeInUSecs"),
        JAVA_LONG.withName("EstimatedIOAccessQuiesceTimeInUSecs"),
        JAVA_LONG.withName("PlatformSupportedMaxIOAccessQuiesceTimeInUSecs")
    ).withName("_SCM_BUS_RUNTIME_FW_ACTIVATION_INFO");
    static final VarHandle const$2 = constants$2509.const$1.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$3 = constants$2509.const$1.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$4 = constants$2509.const$1.varHandle(MemoryLayout.PathElement.groupElement("RuntimeFwActivationSupported"));
    static final VarHandle const$5 = constants$2509.const$1.varHandle(MemoryLayout.PathElement.groupElement("FirmwareActivationState"));
}


