// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$934 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$934() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("peRed"),
        JAVA_BYTE.withName("peGreen"),
        JAVA_BYTE.withName("peBlue"),
        JAVA_BYTE.withName("peFlags")
    ).withName("tagPALETTEENTRY");
    static final VarHandle const$1 = constants$934.const$0.varHandle(MemoryLayout.PathElement.groupElement("peRed"));
    static final VarHandle const$2 = constants$934.const$0.varHandle(MemoryLayout.PathElement.groupElement("peGreen"));
    static final VarHandle const$3 = constants$934.const$0.varHandle(MemoryLayout.PathElement.groupElement("peBlue"));
    static final VarHandle const$4 = constants$934.const$0.varHandle(MemoryLayout.PathElement.groupElement("peFlags"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("palVersion"),
        JAVA_SHORT.withName("palNumEntries"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_BYTE.withName("peRed"),
            JAVA_BYTE.withName("peGreen"),
            JAVA_BYTE.withName("peBlue"),
            JAVA_BYTE.withName("peFlags")
        ).withName("tagPALETTEENTRY")).withName("palPalEntry")
    ).withName("tagLOGPALETTE");
}

