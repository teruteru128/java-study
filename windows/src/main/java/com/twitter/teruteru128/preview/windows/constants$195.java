// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$195 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$195() {}
    static final VarHandle const$0 = constants$193.const$4.varHandle(MemoryLayout.PathElement.groupElement("Reserved3"));
    static final VarHandle const$1 = constants$193.const$4.varHandle(MemoryLayout.PathElement.groupElement("Reserved4"));
    static final VarHandle const$2 = constants$193.const$4.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_LONG.withName("ReadOperationCount"),
        JAVA_LONG.withName("WriteOperationCount"),
        JAVA_LONG.withName("OtherOperationCount"),
        JAVA_LONG.withName("ReadTransferCount"),
        JAVA_LONG.withName("WriteTransferCount"),
        JAVA_LONG.withName("OtherTransferCount")
    ).withName("_IO_COUNTERS");
    static final VarHandle const$4 = constants$195.const$3.varHandle(MemoryLayout.PathElement.groupElement("ReadOperationCount"));
    static final VarHandle const$5 = constants$195.const$3.varHandle(MemoryLayout.PathElement.groupElement("WriteOperationCount"));
}

