// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2712 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2712() {}
    static final VarHandle const$0 = constants$2711.const$5.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    static final VarHandle const$1 = constants$2711.const$5.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$2 = constants$2711.const$5.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    static final VarHandle const$3 = constants$2711.const$5.varHandle(MemoryLayout.PathElement.groupElement("Vdl"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("Length"),
        JAVA_SHORT.withName("Flags"),
        JAVA_INT.withName("ReparseDataSize"),
        JAVA_INT.withName("ReparseDataOffset")
    ).withName("_Reparse");
    static final VarHandle const$5 = constants$2712.const$4.varHandle(MemoryLayout.PathElement.groupElement("Length"));
}

