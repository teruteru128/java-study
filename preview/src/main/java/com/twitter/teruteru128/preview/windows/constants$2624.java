// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2624 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2624() {}
    static final VarHandle const$0 = constants$2623.const$4.varHandle(MemoryLayout.PathElement.groupElement("OtherExceptions"));
    static final VarHandle const$1 = constants$2623.const$4.varHandle(MemoryLayout.PathElement.groupElement("MftReads"));
    static final VarHandle const$2 = constants$2623.const$4.varHandle(MemoryLayout.PathElement.groupElement("MftReadBytes"));
    static final VarHandle const$3 = constants$2623.const$4.varHandle(MemoryLayout.PathElement.groupElement("MftWrites"));
    static final VarHandle const$4 = constants$2623.const$4.varHandle(MemoryLayout.PathElement.groupElement("MftWriteBytes"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("Write"),
        JAVA_INT.withName("Create"),
        JAVA_INT.withName("SetInfo"),
        JAVA_INT.withName("Flush")
    ).withName("");
}

