// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$148 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$148() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("AceType"),
            JAVA_BYTE.withName("AceFlags"),
            JAVA_SHORT.withName("AceSize")
        ).withName("Header"),
        JAVA_INT.withName("Mask"),
        JAVA_INT.withName("SidStart")
    ).withName("_SYSTEM_ACCESS_FILTER_ACE");
    static final VarHandle const$1 = constants$148.const$0.varHandle(MemoryLayout.PathElement.groupElement("Mask"));
    static final VarHandle const$2 = constants$148.const$0.varHandle(MemoryLayout.PathElement.groupElement("SidStart"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("AceType"),
            JAVA_BYTE.withName("AceFlags"),
            JAVA_SHORT.withName("AceSize")
        ).withName("Header"),
        JAVA_INT.withName("Mask"),
        JAVA_INT.withName("Flags"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("ObjectType"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("InheritedObjectType"),
        JAVA_INT.withName("SidStart")
    ).withName("_ACCESS_ALLOWED_OBJECT_ACE");
    static final VarHandle const$4 = constants$148.const$3.varHandle(MemoryLayout.PathElement.groupElement("Mask"));
    static final VarHandle const$5 = constants$148.const$3.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
}


