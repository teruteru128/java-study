// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$54 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$54() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "strnset",
        constants$28.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "strrev",
        constants$33.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "strset",
        constants$30.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "strupr",
        constants$33.const$3
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("Lineage"),
        JAVA_INT.withName("Uniquifier")
    ).withName("_OBJECTID");
    static final VarHandle const$5 = constants$54.const$4.varHandle(MemoryLayout.PathElement.groupElement("Uniquifier"));
}


