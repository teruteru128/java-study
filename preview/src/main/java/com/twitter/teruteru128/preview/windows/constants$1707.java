// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1707 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1707() {}
    static final VarHandle const$0 = constants$1702.const$5.varHandle(MemoryLayout.PathElement.groupElement("max_sess_pkt_size"));
    static final VarHandle const$1 = constants$1702.const$5.varHandle(MemoryLayout.PathElement.groupElement("name_count"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("name"),
        JAVA_BYTE.withName("name_num"),
        JAVA_BYTE.withName("name_flags")
    ).withName("_NAME_BUFFER");
    static final VarHandle const$3 = constants$1707.const$2.varHandle(MemoryLayout.PathElement.groupElement("name_num"));
    static final VarHandle const$4 = constants$1707.const$2.varHandle(MemoryLayout.PathElement.groupElement("name_flags"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("sess_name"),
        JAVA_BYTE.withName("num_sess"),
        JAVA_BYTE.withName("rcv_dg_outstanding"),
        JAVA_BYTE.withName("rcv_any_outstanding")
    ).withName("_SESSION_HEADER");
}


