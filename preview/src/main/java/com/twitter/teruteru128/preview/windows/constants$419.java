// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$419 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$419() {}
    static final VarHandle const$0 = constants$418.const$4.varHandle(MemoryLayout.PathElement.groupElement("BaseRelocSize"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("HeaderSize"),
        JAVA_INT.withByteAlignment(1).withName("FixupInfoSize"),
        JAVA_INT.withByteAlignment(1).withName("Symbol"),
        JAVA_INT.withByteAlignment(1).withName("SymbolGroup"),
        JAVA_INT.withByteAlignment(1).withName("Flags")
    ).withName("_IMAGE_DYNAMIC_RELOCATION32_V2");
    static final VarHandle const$2 = constants$419.const$1.varHandle(MemoryLayout.PathElement.groupElement("HeaderSize"));
    static final VarHandle const$3 = constants$419.const$1.varHandle(MemoryLayout.PathElement.groupElement("FixupInfoSize"));
    static final VarHandle const$4 = constants$419.const$1.varHandle(MemoryLayout.PathElement.groupElement("Symbol"));
    static final VarHandle const$5 = constants$419.const$1.varHandle(MemoryLayout.PathElement.groupElement("SymbolGroup"));
}


