// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$308 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$308() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("Latency"),
        JAVA_INT.withName("Power"),
        JAVA_INT.withName("TimeCheck"),
        JAVA_BYTE.withName("PromotePercent"),
        JAVA_BYTE.withName("DemotePercent"),
        JAVA_BYTE.withName("StateType"),
        JAVA_BYTE.withName("Reserved"),
        JAVA_INT.withName("StateFlags"),
        JAVA_INT.withName("Context"),
        JAVA_INT.withName("IdleHandler"),
        JAVA_INT.withName("Reserved1")
    ).withName("");
    static final VarHandle const$1 = constants$308.const$0.varHandle(MemoryLayout.PathElement.groupElement("Latency"));
    static final VarHandle const$2 = constants$308.const$0.varHandle(MemoryLayout.PathElement.groupElement("Power"));
    static final VarHandle const$3 = constants$308.const$0.varHandle(MemoryLayout.PathElement.groupElement("TimeCheck"));
    static final VarHandle const$4 = constants$308.const$0.varHandle(MemoryLayout.PathElement.groupElement("PromotePercent"));
    static final VarHandle const$5 = constants$308.const$0.varHandle(MemoryLayout.PathElement.groupElement("DemotePercent"));
}


