// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1713 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1713() {}
    static final VarHandle const$0 = constants$1712.const$4.varHandle(MemoryLayout.PathElement.groupElement("VersMinor"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Count"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(1, RuntimeHelper.POINTER).withName("Protseq")
    ).withName("_RPC_PROTSEQ_VECTORA");
    static final VarHandle const$2 = constants$1713.const$1.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Count"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(1, RuntimeHelper.POINTER).withName("Protseq")
    ).withName("_RPC_PROTSEQ_VECTORW");
    static final VarHandle const$4 = constants$1713.const$3.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("Length"),
        JAVA_INT.withName("EndpointFlags"),
        JAVA_INT.withName("NICFlags")
    ).withName("_RPC_POLICY");
}


