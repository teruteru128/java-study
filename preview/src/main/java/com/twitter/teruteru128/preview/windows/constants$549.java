// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$549 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$549() {}
    static final VarHandle const$0 = constants$548.const$4.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cx"),
        JAVA_INT.withName("cy")
    ).withName("tagSIZE");
    static final VarHandle const$2 = constants$549.const$1.varHandle(MemoryLayout.PathElement.groupElement("cx"));
    static final VarHandle const$3 = constants$549.const$1.varHandle(MemoryLayout.PathElement.groupElement("cy"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("x"),
        JAVA_SHORT.withName("y")
    ).withName("tagPOINTS");
    static final VarHandle const$5 = constants$549.const$4.varHandle(MemoryLayout.PathElement.groupElement("x"));
}


