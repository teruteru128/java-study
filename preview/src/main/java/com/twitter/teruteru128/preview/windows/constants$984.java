// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$984 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$984() {}
    static final VarHandle const$0 = constants$983.const$5.varHandle(MemoryLayout.PathElement.groupElement("wType"));
    static final VarHandle const$1 = constants$983.const$5.varHandle(MemoryLayout.PathElement.groupElement("cpfx"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("cb"),
        JAVA_INT.withName("dwType"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("fract"),
                JAVA_SHORT.withName("value")
            ).withName("x"),
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("fract"),
                JAVA_SHORT.withName("value")
            ).withName("y")
        ).withName("pfxStart")
    ).withName("tagTTPOLYGONHEADER");
    static final VarHandle const$3 = constants$984.const$2.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    static final VarHandle const$4 = constants$984.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("lStructSize"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("lpOutString"),
        RuntimeHelper.POINTER.withName("lpOrder"),
        RuntimeHelper.POINTER.withName("lpDx"),
        RuntimeHelper.POINTER.withName("lpCaretPos"),
        RuntimeHelper.POINTER.withName("lpClass"),
        RuntimeHelper.POINTER.withName("lpGlyphs"),
        JAVA_INT.withName("nGlyphs"),
        JAVA_INT.withName("nMaxFit")
    ).withName("tagGCP_RESULTSA");
}


