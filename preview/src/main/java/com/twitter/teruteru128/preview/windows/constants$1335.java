// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1335 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1335() {}
    static final VarHandle const$0 = constants$1334.const$3.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final VarHandle const$1 = constants$1334.const$3.varHandle(MemoryLayout.PathElement.groupElement("dx"));
    static final VarHandle const$2 = constants$1334.const$3.varHandle(MemoryLayout.PathElement.groupElement("dy"));
    static final VarHandle const$3 = constants$1334.const$3.varHandle(MemoryLayout.PathElement.groupElement("wMax"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("wStructSize"),
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y"),
        JAVA_INT.withName("dx"),
        JAVA_INT.withName("dy"),
        JAVA_INT.withName("wMax"),
        MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("rgchMember")
    ).withName("tagHELPWININFOW");
    static final VarHandle const$5 = constants$1335.const$4.varHandle(MemoryLayout.PathElement.groupElement("wStructSize"));
}


