// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$418 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$418() {}
    static final VarHandle const$0 = constants$417.const$4.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("Symbol"),
        JAVA_INT.withByteAlignment(1).withName("BaseRelocSize")
    ).withName("_IMAGE_DYNAMIC_RELOCATION32");
    static final VarHandle const$2 = constants$418.const$1.varHandle(MemoryLayout.PathElement.groupElement("Symbol"));
    static final VarHandle const$3 = constants$418.const$1.varHandle(MemoryLayout.PathElement.groupElement("BaseRelocSize"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_LONG.withByteAlignment(1).withName("Symbol"),
        JAVA_INT.withByteAlignment(1).withName("BaseRelocSize")
    ).withName("_IMAGE_DYNAMIC_RELOCATION64");
    static final VarHandle const$5 = constants$418.const$4.varHandle(MemoryLayout.PathElement.groupElement("Symbol"));
}

