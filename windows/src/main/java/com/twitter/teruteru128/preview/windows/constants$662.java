// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$662 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$662() {}
    static final VarHandle const$0 = constants$660.const$1.varHandle(MemoryLayout.PathElement.groupElement("wProcessorLevel"));
    static final VarHandle const$1 = constants$660.const$1.varHandle(MemoryLayout.PathElement.groupElement("wProcessorRevision"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwLength"),
        JAVA_INT.withName("dwMemoryLoad"),
        JAVA_LONG.withName("ullTotalPhys"),
        JAVA_LONG.withName("ullAvailPhys"),
        JAVA_LONG.withName("ullTotalPageFile"),
        JAVA_LONG.withName("ullAvailPageFile"),
        JAVA_LONG.withName("ullTotalVirtual"),
        JAVA_LONG.withName("ullAvailVirtual"),
        JAVA_LONG.withName("ullAvailExtendedVirtual")
    ).withName("_MEMORYSTATUSEX");
    static final VarHandle const$3 = constants$662.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwLength"));
    static final VarHandle const$4 = constants$662.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwMemoryLoad"));
    static final VarHandle const$5 = constants$662.const$2.varHandle(MemoryLayout.PathElement.groupElement("ullTotalPhys"));
}

