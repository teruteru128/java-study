// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$871 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$871() {}
    static final VarHandle const$0 = constants$870.const$3.varHandle(MemoryLayout.PathElement.groupElement("FileAttributes"));
    static final VarHandle const$1 = constants$870.const$3.varHandle(MemoryLayout.PathElement.groupElement("FileNameLength"));
    static final VarHandle const$2 = constants$870.const$3.varHandle(MemoryLayout.PathElement.groupElement("EaSize"));
    static final VarHandle const$3 = constants$870.const$3.varHandle(MemoryLayout.PathElement.groupElement("ShortNameLength"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("NextEntryOffset"),
        JAVA_INT.withName("FileIndex"),
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
        ).withName("CreationTime"),
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
        ).withName("LastAccessTime"),
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
        ).withName("LastWriteTime"),
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
        ).withName("ChangeTime"),
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
        ).withName("EndOfFile"),
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
        ).withName("AllocationSize"),
        JAVA_INT.withName("FileAttributes"),
        JAVA_INT.withName("FileNameLength"),
        JAVA_INT.withName("EaSize"),
        MemoryLayout.sequenceLayout(1, JAVA_SHORT).withName("FileName"),
        MemoryLayout.paddingLayout(2)
    ).withName("_FILE_FULL_DIR_INFO");
    static final VarHandle const$5 = constants$871.const$4.varHandle(MemoryLayout.PathElement.groupElement("NextEntryOffset"));
}


