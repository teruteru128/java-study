// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$399 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$399() {}
    static final VarHandle const$0 = constants$398.const$0.varHandle(MemoryLayout.PathElement.groupElement("Selection"));
    static final VarHandle const$1 = constants$398.const$0.varHandle(MemoryLayout.PathElement.groupElement("bReserved"));
    static final VarHandle const$2 = constants$398.const$0.varHandle(MemoryLayout.PathElement.groupElement("HighNumber"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(2).withName("crc"),
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("rgbReserved")
    ).withName("");
    static final VarHandle const$4 = constants$399.const$3.varHandle(MemoryLayout.PathElement.groupElement("crc"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            JAVA_INT.withByteAlignment(2).withName("VirtualAddress"),
            JAVA_INT.withByteAlignment(2).withName("RelocCount")
        ).withName("$anon$0"),
        JAVA_INT.withByteAlignment(2).withName("SymbolTableIndex"),
        JAVA_SHORT.withName("Type")
    ).withName("_IMAGE_RELOCATION");
}

