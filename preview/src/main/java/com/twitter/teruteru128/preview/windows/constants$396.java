// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$396 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$396() {}
    static final VarHandle const$0 = constants$395.const$2.varHandle(MemoryLayout.PathElement.groupElement("CheckSum"));
    static final VarHandle const$1 = constants$395.const$2.varHandle(MemoryLayout.PathElement.groupElement("Number"));
    static final VarHandle const$2 = constants$395.const$2.varHandle(MemoryLayout.PathElement.groupElement("Selection"));
    static final VarHandle const$3 = constants$395.const$2.varHandle(MemoryLayout.PathElement.groupElement("bReserved"));
    static final VarHandle const$4 = constants$395.const$2.varHandle(MemoryLayout.PathElement.groupElement("HighNumber"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(2).withName("crc"),
        MemoryLayout.sequenceLayout(14, JAVA_BYTE).withName("rgbReserved")
    ).withName("");
}


