// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1040 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1040() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SetTextJustification",
        constants$67.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "UpdateColors",
        constants$18.const$5
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y"),
        JAVA_SHORT.withName("Red"),
        JAVA_SHORT.withName("Green"),
        JAVA_SHORT.withName("Blue"),
        JAVA_SHORT.withName("Alpha")
    ).withName("_TRIVERTEX");
    static final VarHandle const$3 = constants$1040.const$2.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$4 = constants$1040.const$2.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final VarHandle const$5 = constants$1040.const$2.varHandle(MemoryLayout.PathElement.groupElement("Red"));
}


