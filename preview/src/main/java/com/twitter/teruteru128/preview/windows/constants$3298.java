// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3298 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3298() {}
    static final VarHandle const$0 = constants$3297.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("tymed"),
        JAVA_INT.withName("dwHandleType"),
        JAVA_INT.withName("pData"),
        JAVA_INT.withName("pUnkForRelease"),
        JAVA_INT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("data"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagRemSTGMEDIUM");
    static final VarHandle const$2 = constants$3298.const$1.varHandle(MemoryLayout.PathElement.groupElement("tymed"));
    static final VarHandle const$3 = constants$3298.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwHandleType"));
    static final VarHandle const$4 = constants$3298.const$1.varHandle(MemoryLayout.PathElement.groupElement("pData"));
    static final VarHandle const$5 = constants$3298.const$1.varHandle(MemoryLayout.PathElement.groupElement("pUnkForRelease"));
}


