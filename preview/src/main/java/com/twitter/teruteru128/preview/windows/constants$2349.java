// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2349 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2349() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("data"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagRemHBITMAP");
    static final VarHandle const$1 = constants$2349.const$0.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("data"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagRemHPALETTE");
    static final VarHandle const$3 = constants$2349.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("data"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagRemBRUSH");
    static final VarHandle const$5 = constants$2349.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
}


