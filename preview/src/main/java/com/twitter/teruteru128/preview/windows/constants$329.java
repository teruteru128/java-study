// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$329 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$329() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("State"),
        JAVA_INT.withName("Latency"),
        JAVA_INT.withName("Speed"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("Processors")
    ).withName("");
    static final VarHandle const$1 = constants$329.const$0.varHandle(MemoryLayout.PathElement.groupElement("State"));
    static final VarHandle const$2 = constants$329.const$0.varHandle(MemoryLayout.PathElement.groupElement("Latency"));
    static final VarHandle const$3 = constants$329.const$0.varHandle(MemoryLayout.PathElement.groupElement("Speed"));
    static final VarHandle const$4 = constants$329.const$0.varHandle(MemoryLayout.PathElement.groupElement("Processors"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("NewState"),
        JAVA_INT.withName("OldState"),
        JAVA_LONG.withName("Processors")
    ).withName("");
}


