// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2448 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2448() {}
    static final VarHandle const$0 = constants$2447.const$5.varHandle(MemoryLayout.PathElement.groupElement("OffloadWriteFlags"));
    static final VarHandle const$1 = constants$2447.const$5.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    static final VarHandle const$2 = constants$2447.const$5.varHandle(MemoryLayout.PathElement.groupElement("LengthCopied"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("OutputVersion")
    ).withName("_DEVICE_DATA_SET_LBP_STATE_PARAMETERS");
    static final VarHandle const$4 = constants$2448.const$3.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$5 = constants$2448.const$3.varHandle(MemoryLayout.PathElement.groupElement("Size"));
}


