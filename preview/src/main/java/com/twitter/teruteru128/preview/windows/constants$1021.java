// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1021 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1021() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("wcLow"),
        JAVA_SHORT.withName("cGlyphs")
    ).withName("tagWCRANGE");
    static final VarHandle const$1 = constants$1021.const$0.varHandle(MemoryLayout.PathElement.groupElement("wcLow"));
    static final VarHandle const$2 = constants$1021.const$0.varHandle(MemoryLayout.PathElement.groupElement("cGlyphs"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbThis"),
        JAVA_INT.withName("flAccel"),
        JAVA_INT.withName("cGlyphsSupported"),
        JAVA_INT.withName("cRanges"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_SHORT.withName("wcLow"),
            JAVA_SHORT.withName("cGlyphs")
        ).withName("tagWCRANGE")).withName("ranges")
    ).withName("tagGLYPHSET");
    static final VarHandle const$4 = constants$1021.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbThis"));
    static final VarHandle const$5 = constants$1021.const$3.varHandle(MemoryLayout.PathElement.groupElement("flAccel"));
}


