// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2657 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2657() {}
    static final VarHandle const$0 = constants$2656.const$1.varHandle(MemoryLayout.PathElement.groupElement("Reserved2"));
    static final VarHandle const$1 = constants$2656.const$1.varHandle(MemoryLayout.PathElement.groupElement("Reserved3"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("KtmTransaction"),
        JAVA_LONG.withName("NumberOfFiles"),
        JAVA_LONG.withName("BufferSizeRequired"),
        JAVA_LONG.withName("Offset")
    ).withName("_TXFS_LIST_TRANSACTION_LOCKED_FILES");
    static final VarHandle const$3 = constants$2657.const$2.varHandle(MemoryLayout.PathElement.groupElement("NumberOfFiles"));
    static final VarHandle const$4 = constants$2657.const$2.varHandle(MemoryLayout.PathElement.groupElement("BufferSizeRequired"));
    static final VarHandle const$5 = constants$2657.const$2.varHandle(MemoryLayout.PathElement.groupElement("Offset"));
}


