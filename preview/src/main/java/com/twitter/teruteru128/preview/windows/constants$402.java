// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$402 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$402() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("Name"),
        MemoryLayout.sequenceLayout(12, JAVA_BYTE).withName("Date"),
        MemoryLayout.sequenceLayout(6, JAVA_BYTE).withName("UserID"),
        MemoryLayout.sequenceLayout(6, JAVA_BYTE).withName("GroupID"),
        MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Mode"),
        MemoryLayout.sequenceLayout(10, JAVA_BYTE).withName("Size"),
        MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("EndHeader")
    ).withName("_IMAGE_ARCHIVE_MEMBER_HEADER");
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Characteristics"),
        JAVA_INT.withName("TimeDateStamp"),
        JAVA_SHORT.withName("MajorVersion"),
        JAVA_SHORT.withName("MinorVersion"),
        JAVA_INT.withName("Name"),
        JAVA_INT.withName("Base"),
        JAVA_INT.withName("NumberOfFunctions"),
        JAVA_INT.withName("NumberOfNames"),
        JAVA_INT.withName("AddressOfFunctions"),
        JAVA_INT.withName("AddressOfNames"),
        JAVA_INT.withName("AddressOfNameOrdinals")
    ).withName("_IMAGE_EXPORT_DIRECTORY");
    static final VarHandle const$2 = constants$402.const$1.varHandle(MemoryLayout.PathElement.groupElement("Characteristics"));
    static final VarHandle const$3 = constants$402.const$1.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    static final VarHandle const$4 = constants$402.const$1.varHandle(MemoryLayout.PathElement.groupElement("MajorVersion"));
    static final VarHandle const$5 = constants$402.const$1.varHandle(MemoryLayout.PathElement.groupElement("MinorVersion"));
}

