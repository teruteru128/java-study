// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2702 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2702() {}
    static final VarHandle const$0 = constants$2701.const$5.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$1 = constants$2701.const$5.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$2 = constants$2701.const$5.varHandle(MemoryLayout.PathElement.groupElement("TransferLength"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("Flags"),
        JAVA_LONG.withName("FileOffset"),
        JAVA_LONG.withName("CopyLength"),
        JAVA_LONG.withName("TransferOffset"),
        MemoryLayout.sequenceLayout(512, JAVA_BYTE).withName("Token")
    ).withName("_FSCTL_OFFLOAD_WRITE_INPUT");
    static final VarHandle const$4 = constants$2702.const$3.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$5 = constants$2702.const$3.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
}

