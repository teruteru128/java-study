// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$299 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$299() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("GUID_MIXED_REALITY_MODE", constants$27.const$0);
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("GUID_SPR_ACTIVE_SESSION_CHANGE", constants$27.const$0);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("PD_Size"),
        JAVA_INT.withName("PD_MostRecentPowerState"),
        JAVA_INT.withName("PD_Capabilities"),
        JAVA_INT.withName("PD_D1Latency"),
        JAVA_INT.withName("PD_D2Latency"),
        JAVA_INT.withName("PD_D3Latency"),
        MemoryLayout.sequenceLayout(7, JAVA_INT).withName("PD_PowerStateMapping"),
        JAVA_INT.withName("PD_DeepestSystemWake")
    ).withName("CM_Power_Data_s");
    static final VarHandle const$3 = constants$299.const$2.varHandle(MemoryLayout.PathElement.groupElement("PD_Size"));
    static final VarHandle const$4 = constants$299.const$2.varHandle(MemoryLayout.PathElement.groupElement("PD_MostRecentPowerState"));
    static final VarHandle const$5 = constants$299.const$2.varHandle(MemoryLayout.PathElement.groupElement("PD_Capabilities"));
}

