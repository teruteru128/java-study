// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1642 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1642() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("dwVersion"),
        JAVA_INT.withByteAlignment(1).withName("dwMid"),
        JAVA_INT.withByteAlignment(1).withName("dwOEMVersion")
    ).withName("midistrmbuffver_tag");
    static final VarHandle const$1 = constants$1642.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final VarHandle const$2 = constants$1642.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwMid"));
    static final VarHandle const$3 = constants$1642.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwOEMVersion"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("cbStruct"),
        JAVA_INT.withByteAlignment(1).withName("dwTimeDiv")
    ).withName("midiproptimediv_tag");
    static final VarHandle const$5 = constants$1642.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbStruct"));
}


