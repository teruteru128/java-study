// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$393 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$393() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(2).withName("TagIndex"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("Linenumber"),
                JAVA_SHORT.withName("Size")
            ).withName("LnSz"),
            JAVA_INT.withByteAlignment(2).withName("TotalSize")
        ).withName("Misc"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withByteAlignment(2).withName("PointerToLinenumber"),
                JAVA_INT.withByteAlignment(2).withName("PointerToNextFunction")
            ).withName("Function"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(4, JAVA_SHORT).withName("Dimension")
            ).withName("Array")
        ).withName("FcnAry"),
        JAVA_SHORT.withName("TvIndex")
    ).withName("");
    static final VarHandle const$1 = constants$393.const$0.varHandle(MemoryLayout.PathElement.groupElement("TagIndex"));
    static final UnionLayout const$2 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("Linenumber"),
            JAVA_SHORT.withName("Size")
        ).withName("LnSz"),
        JAVA_INT.withByteAlignment(2).withName("TotalSize")
    ).withName("");
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("Linenumber"),
        JAVA_SHORT.withName("Size")
    ).withName("");
    static final VarHandle const$4 = constants$393.const$3.varHandle(MemoryLayout.PathElement.groupElement("Linenumber"));
    static final VarHandle const$5 = constants$393.const$3.varHandle(MemoryLayout.PathElement.groupElement("Size"));
}

