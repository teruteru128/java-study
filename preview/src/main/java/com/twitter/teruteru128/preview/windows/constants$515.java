// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$515 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$515() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("Type"),
        JAVA_INT.withName("Partition"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("u"),
            JAVA_LONG.withName("QuadPart")
        ).withName("Offset")
    ).withName("_TAPE_GET_POSITION");
    static final VarHandle const$1 = constants$515.const$0.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    static final VarHandle const$2 = constants$515.const$0.varHandle(MemoryLayout.PathElement.groupElement("Partition"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Method"),
        JAVA_INT.withName("Partition"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("u"),
            JAVA_LONG.withName("QuadPart")
        ).withName("Offset"),
        JAVA_BYTE.withName("Immediate"),
        MemoryLayout.paddingLayout(7)
    ).withName("_TAPE_SET_POSITION");
    static final VarHandle const$4 = constants$515.const$3.varHandle(MemoryLayout.PathElement.groupElement("Method"));
    static final VarHandle const$5 = constants$515.const$3.varHandle(MemoryLayout.PathElement.groupElement("Partition"));
}


