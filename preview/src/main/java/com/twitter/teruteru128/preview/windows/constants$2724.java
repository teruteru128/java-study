// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2724 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2724() {}
    static final VarHandle const$0 = constants$2723.const$4.varHandle(MemoryLayout.PathElement.groupElement("StreamId"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("StreamId")
    ).withName("_STREAMS_QUERY_ID_OUTPUT_BUFFER");
    static final VarHandle const$2 = constants$2724.const$1.varHandle(MemoryLayout.PathElement.groupElement("StreamId"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_LONG.withName("StartOffset"),
        JAVA_LONG.withName("LengthInBytes")
    ).withName("_QUERY_BAD_RANGES_INPUT_RANGE");
    static final VarHandle const$4 = constants$2724.const$3.varHandle(MemoryLayout.PathElement.groupElement("StartOffset"));
    static final VarHandle const$5 = constants$2724.const$3.varHandle(MemoryLayout.PathElement.groupElement("LengthInBytes"));
}


