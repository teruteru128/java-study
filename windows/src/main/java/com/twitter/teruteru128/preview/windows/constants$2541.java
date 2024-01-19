// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2541 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2541() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("PartitionStyle"),
        MemoryLayout.paddingLayout(4),
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
        ).withName("StartingOffset"),
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
        ).withName("PartitionLength"),
        JAVA_INT.withName("PartitionNumber"),
        JAVA_BYTE.withName("RewritePartition"),
        JAVA_BYTE.withName("IsServicePartition"),
        MemoryLayout.paddingLayout(2),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_BYTE.withName("PartitionType"),
                JAVA_BYTE.withName("BootIndicator"),
                JAVA_BYTE.withName("RecognizedPartition"),
                MemoryLayout.paddingLayout(1),
                JAVA_INT.withName("HiddenSectors"),
                MemoryLayout.structLayout(
                    JAVA_INT.withName("Data1"),
                    JAVA_SHORT.withName("Data2"),
                    JAVA_SHORT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
                ).withName("PartitionId")
            ).withName("Mbr"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    JAVA_INT.withName("Data1"),
                    JAVA_SHORT.withName("Data2"),
                    JAVA_SHORT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
                ).withName("PartitionType"),
                MemoryLayout.structLayout(
                    JAVA_INT.withName("Data1"),
                    JAVA_SHORT.withName("Data2"),
                    JAVA_SHORT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
                ).withName("PartitionId"),
                JAVA_LONG.withName("Attributes"),
                MemoryLayout.sequenceLayout(36, JAVA_SHORT).withName("Name")
            ).withName("Gpt")
        ).withName("$anon$0")
    ).withName("_PARTITION_INFORMATION_EX");
    static final VarHandle const$1 = constants$2541.const$0.varHandle(MemoryLayout.PathElement.groupElement("PartitionStyle"));
    static final VarHandle const$2 = constants$2541.const$0.varHandle(MemoryLayout.PathElement.groupElement("PartitionNumber"));
    static final VarHandle const$3 = constants$2541.const$0.varHandle(MemoryLayout.PathElement.groupElement("RewritePartition"));
    static final VarHandle const$4 = constants$2541.const$0.varHandle(MemoryLayout.PathElement.groupElement("IsServicePartition"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("DiskId"),
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
        ).withName("StartingUsableOffset"),
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
        ).withName("UsableLength"),
        JAVA_INT.withName("MaxPartitionCount"),
        MemoryLayout.paddingLayout(4)
    ).withName("_DRIVE_LAYOUT_INFORMATION_GPT");
}

