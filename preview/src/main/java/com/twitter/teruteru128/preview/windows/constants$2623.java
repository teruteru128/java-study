// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2623 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2623() {}
    static final VarHandle const$0 = constants$2621.const$0.varHandle(MemoryLayout.PathElement.groupElement("MetaDataDiskReads"));
    static final VarHandle const$1 = constants$2621.const$0.varHandle(MemoryLayout.PathElement.groupElement("MetaDataWrites"));
    static final VarHandle const$2 = constants$2621.const$0.varHandle(MemoryLayout.PathElement.groupElement("MetaDataWriteBytes"));
    static final VarHandle const$3 = constants$2621.const$0.varHandle(MemoryLayout.PathElement.groupElement("MetaDataDiskWrites"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("LogFileFullExceptions"),
        JAVA_INT.withName("OtherExceptions"),
        JAVA_LONG.withName("MftReads"),
        JAVA_LONG.withName("MftReadBytes"),
        JAVA_LONG.withName("MftWrites"),
        JAVA_LONG.withName("MftWriteBytes"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Write"),
            JAVA_INT.withName("Create"),
            JAVA_INT.withName("SetInfo"),
            JAVA_INT.withName("Flush")
        ).withName("MftWritesUserLevel"),
        JAVA_INT.withName("MftWritesFlushForLogFileFull"),
        JAVA_INT.withName("MftWritesLazyWriter"),
        JAVA_INT.withName("MftWritesUserRequest"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("Mft2Writes"),
        JAVA_LONG.withName("Mft2WriteBytes"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Write"),
            JAVA_INT.withName("Create"),
            JAVA_INT.withName("SetInfo"),
            JAVA_INT.withName("Flush")
        ).withName("Mft2WritesUserLevel"),
        JAVA_INT.withName("Mft2WritesFlushForLogFileFull"),
        JAVA_INT.withName("Mft2WritesLazyWriter"),
        JAVA_INT.withName("Mft2WritesUserRequest"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("RootIndexReads"),
        JAVA_LONG.withName("RootIndexReadBytes"),
        JAVA_LONG.withName("RootIndexWrites"),
        JAVA_LONG.withName("RootIndexWriteBytes"),
        JAVA_LONG.withName("BitmapReads"),
        JAVA_LONG.withName("BitmapReadBytes"),
        JAVA_LONG.withName("BitmapWrites"),
        JAVA_LONG.withName("BitmapWriteBytes"),
        JAVA_INT.withName("BitmapWritesFlushForLogFileFull"),
        JAVA_INT.withName("BitmapWritesLazyWriter"),
        JAVA_INT.withName("BitmapWritesUserRequest"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Write"),
            JAVA_INT.withName("Create"),
            JAVA_INT.withName("SetInfo"),
            JAVA_INT.withName("Flush")
        ).withName("BitmapWritesUserLevel"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("MftBitmapReads"),
        JAVA_LONG.withName("MftBitmapReadBytes"),
        JAVA_LONG.withName("MftBitmapWrites"),
        JAVA_LONG.withName("MftBitmapWriteBytes"),
        JAVA_INT.withName("MftBitmapWritesFlushForLogFileFull"),
        JAVA_INT.withName("MftBitmapWritesLazyWriter"),
        JAVA_INT.withName("MftBitmapWritesUserRequest"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Write"),
            JAVA_INT.withName("Create"),
            JAVA_INT.withName("SetInfo"),
            JAVA_INT.withName("Flush")
        ).withName("MftBitmapWritesUserLevel"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("UserIndexReads"),
        JAVA_LONG.withName("UserIndexReadBytes"),
        JAVA_LONG.withName("UserIndexWrites"),
        JAVA_LONG.withName("UserIndexWriteBytes"),
        JAVA_LONG.withName("LogFileReads"),
        JAVA_LONG.withName("LogFileReadBytes"),
        JAVA_LONG.withName("LogFileWrites"),
        JAVA_LONG.withName("LogFileWriteBytes"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Calls"),
            JAVA_INT.withName("RunsReturned"),
            JAVA_INT.withName("Hints"),
            JAVA_INT.withName("HintsHonored"),
            JAVA_INT.withName("Cache"),
            JAVA_INT.withName("CacheMiss"),
            JAVA_LONG.withName("Clusters"),
            JAVA_LONG.withName("HintsClusters"),
            JAVA_LONG.withName("CacheClusters"),
            JAVA_LONG.withName("CacheMissClusters")
        ).withName("Allocate"),
        JAVA_INT.withName("DiskResourcesExhausted"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("VolumeTrimCount"),
        JAVA_LONG.withName("VolumeTrimTime"),
        JAVA_LONG.withName("VolumeTrimByteCount"),
        JAVA_LONG.withName("FileLevelTrimCount"),
        JAVA_LONG.withName("FileLevelTrimTime"),
        JAVA_LONG.withName("FileLevelTrimByteCount"),
        JAVA_LONG.withName("VolumeTrimSkippedCount"),
        JAVA_LONG.withName("VolumeTrimSkippedByteCount"),
        JAVA_LONG.withName("NtfsFillStatInfoFromMftRecordCalledCount"),
        JAVA_LONG.withName("NtfsFillStatInfoFromMftRecordBailedBecauseOfAttributeListCount"),
        JAVA_LONG.withName("NtfsFillStatInfoFromMftRecordBailedBecauseOfNonResReparsePointCount")
    ).withName("_NTFS_STATISTICS_EX");
    static final VarHandle const$5 = constants$2623.const$4.varHandle(MemoryLayout.PathElement.groupElement("LogFileFullExceptions"));
}


