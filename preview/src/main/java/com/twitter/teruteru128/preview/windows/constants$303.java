// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$303 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$303() {}
    static final VarHandle const$0 = constants$302.const$3.varHandle(MemoryLayout.PathElement.groupElement("Locked"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("IsAllowed")
    ).withName("_POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES");
    static final VarHandle const$2 = constants$303.const$1.varHandle(MemoryLayout.PathElement.groupElement("IsAllowed"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("CoalescingTimeout"),
        JAVA_INT.withName("IdleResiliencyPeriod")
    ).withName("_POWER_IDLE_RESILIENCY");
    static final VarHandle const$4 = constants$303.const$3.varHandle(MemoryLayout.PathElement.groupElement("CoalescingTimeout"));
    static final VarHandle const$5 = constants$303.const$3.varHandle(MemoryLayout.PathElement.groupElement("IdleResiliencyPeriod"));
}

