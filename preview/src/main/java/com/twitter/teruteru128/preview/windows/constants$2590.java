// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2590 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2590() {}
    static final VarHandle const$0 = constants$2588.const$0.varHandle(MemoryLayout.PathElement.groupElement("FileNameOffset"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("RecordLength"),
        JAVA_SHORT.withName("MajorVersion"),
        JAVA_SHORT.withName("MinorVersion"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("Identifier")
        ).withName("FileReferenceNumber"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("Identifier")
        ).withName("ParentFileReferenceNumber"),
        JAVA_LONG.withName("Usn"),
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
        ).withName("TimeStamp"),
        JAVA_INT.withName("Reason"),
        JAVA_INT.withName("SourceInfo"),
        JAVA_INT.withName("SecurityId"),
        JAVA_INT.withName("FileAttributes"),
        JAVA_SHORT.withName("FileNameLength"),
        JAVA_SHORT.withName("FileNameOffset"),
        MemoryLayout.sequenceLayout(1, JAVA_SHORT).withName("FileName"),
        MemoryLayout.paddingLayout(2)
    ).withName("");
    static final VarHandle const$2 = constants$2590.const$1.varHandle(MemoryLayout.PathElement.groupElement("RecordLength"));
    static final VarHandle const$3 = constants$2590.const$1.varHandle(MemoryLayout.PathElement.groupElement("MajorVersion"));
    static final VarHandle const$4 = constants$2590.const$1.varHandle(MemoryLayout.PathElement.groupElement("MinorVersion"));
    static final VarHandle const$5 = constants$2590.const$1.varHandle(MemoryLayout.PathElement.groupElement("Usn"));
}


