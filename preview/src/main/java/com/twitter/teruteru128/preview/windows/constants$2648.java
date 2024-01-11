// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2648 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2648() {}
    static final VarHandle const$0 = constants$2646.const$5.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    static final VarHandle const$1 = constants$2646.const$5.varHandle(MemoryLayout.PathElement.groupElement("LoggingMode"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("BytesRequired"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("TailLsn"),
        JAVA_LONG.withName("CurrentLsn"),
        JAVA_LONG.withName("ArchiveTailLsn"),
        JAVA_LONG.withName("LogContainerSize"),
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
        ).withName("HighestVirtualClock"),
        JAVA_INT.withName("LogContainerCount"),
        JAVA_INT.withName("LogContainerCountMax"),
        JAVA_INT.withName("LogContainerCountMin"),
        JAVA_INT.withName("LogGrowthIncrement"),
        JAVA_INT.withName("LogAutoShrinkPercentage"),
        JAVA_INT.withName("Flags"),
        JAVA_SHORT.withName("LoggingMode"),
        JAVA_SHORT.withName("Reserved"),
        JAVA_INT.withName("RmState"),
        JAVA_LONG.withName("LogCapacity"),
        JAVA_LONG.withName("LogFree"),
        JAVA_LONG.withName("TopsSize"),
        JAVA_LONG.withName("TopsUsed"),
        JAVA_LONG.withName("TransactionCount"),
        JAVA_LONG.withName("OnePCCount"),
        JAVA_LONG.withName("TwoPCCount"),
        JAVA_LONG.withName("NumberLogFileFull"),
        JAVA_LONG.withName("OldestTransactionAge"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("RMName"),
        JAVA_INT.withName("TmLogPathOffset"),
        MemoryLayout.paddingLayout(4)
    ).withName("_TXFS_QUERY_RM_INFORMATION");
    static final VarHandle const$3 = constants$2648.const$2.varHandle(MemoryLayout.PathElement.groupElement("BytesRequired"));
    static final VarHandle const$4 = constants$2648.const$2.varHandle(MemoryLayout.PathElement.groupElement("TailLsn"));
    static final VarHandle const$5 = constants$2648.const$2.varHandle(MemoryLayout.PathElement.groupElement("CurrentLsn"));
}


