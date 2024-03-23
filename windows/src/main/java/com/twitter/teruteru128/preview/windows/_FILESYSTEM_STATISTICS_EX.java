// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _FILESYSTEM_STATISTICS_EX {
 *     WORD FileSystemType;
 *     WORD Version;
 *     DWORD SizeOfCompleteStructure;
 *     DWORDLONG UserFileReads;
 *     DWORDLONG UserFileReadBytes;
 *     DWORDLONG UserDiskReads;
 *     DWORDLONG UserFileWrites;
 *     DWORDLONG UserFileWriteBytes;
 *     DWORDLONG UserDiskWrites;
 *     DWORDLONG MetaDataReads;
 *     DWORDLONG MetaDataReadBytes;
 *     DWORDLONG MetaDataDiskReads;
 *     DWORDLONG MetaDataWrites;
 *     DWORDLONG MetaDataWriteBytes;
 *     DWORDLONG MetaDataDiskWrites;
 * }
 * }
 */
public class _FILESYSTEM_STATISTICS_EX {

    _FILESYSTEM_STATISTICS_EX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("FileSystemType"),
        Windows_h.C_SHORT.withName("Version"),
        Windows_h.C_LONG.withName("SizeOfCompleteStructure"),
        Windows_h.C_LONG_LONG.withName("UserFileReads"),
        Windows_h.C_LONG_LONG.withName("UserFileReadBytes"),
        Windows_h.C_LONG_LONG.withName("UserDiskReads"),
        Windows_h.C_LONG_LONG.withName("UserFileWrites"),
        Windows_h.C_LONG_LONG.withName("UserFileWriteBytes"),
        Windows_h.C_LONG_LONG.withName("UserDiskWrites"),
        Windows_h.C_LONG_LONG.withName("MetaDataReads"),
        Windows_h.C_LONG_LONG.withName("MetaDataReadBytes"),
        Windows_h.C_LONG_LONG.withName("MetaDataDiskReads"),
        Windows_h.C_LONG_LONG.withName("MetaDataWrites"),
        Windows_h.C_LONG_LONG.withName("MetaDataWriteBytes"),
        Windows_h.C_LONG_LONG.withName("MetaDataDiskWrites")
    ).withName("_FILESYSTEM_STATISTICS_EX");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort FileSystemType$LAYOUT = (OfShort)$LAYOUT.select(groupElement("FileSystemType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD FileSystemType
     * }
     */
    public static final OfShort FileSystemType$layout() {
        return FileSystemType$LAYOUT;
    }

    private static final long FileSystemType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD FileSystemType
     * }
     */
    public static final long FileSystemType$offset() {
        return FileSystemType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD FileSystemType
     * }
     */
    public static short FileSystemType(MemorySegment struct) {
        return struct.get(FileSystemType$LAYOUT, FileSystemType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD FileSystemType
     * }
     */
    public static void FileSystemType(MemorySegment struct, short fieldValue) {
        struct.set(FileSystemType$LAYOUT, FileSystemType$OFFSET, fieldValue);
    }

    private static final OfShort Version$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static final OfShort Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static short Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static void Version(MemorySegment struct, short fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt SizeOfCompleteStructure$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SizeOfCompleteStructure"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SizeOfCompleteStructure
     * }
     */
    public static final OfInt SizeOfCompleteStructure$layout() {
        return SizeOfCompleteStructure$LAYOUT;
    }

    private static final long SizeOfCompleteStructure$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SizeOfCompleteStructure
     * }
     */
    public static final long SizeOfCompleteStructure$offset() {
        return SizeOfCompleteStructure$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SizeOfCompleteStructure
     * }
     */
    public static int SizeOfCompleteStructure(MemorySegment struct) {
        return struct.get(SizeOfCompleteStructure$LAYOUT, SizeOfCompleteStructure$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SizeOfCompleteStructure
     * }
     */
    public static void SizeOfCompleteStructure(MemorySegment struct, int fieldValue) {
        struct.set(SizeOfCompleteStructure$LAYOUT, SizeOfCompleteStructure$OFFSET, fieldValue);
    }

    private static final OfLong UserFileReads$LAYOUT = (OfLong)$LAYOUT.select(groupElement("UserFileReads"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileReads
     * }
     */
    public static final OfLong UserFileReads$layout() {
        return UserFileReads$LAYOUT;
    }

    private static final long UserFileReads$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileReads
     * }
     */
    public static final long UserFileReads$offset() {
        return UserFileReads$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileReads
     * }
     */
    public static long UserFileReads(MemorySegment struct) {
        return struct.get(UserFileReads$LAYOUT, UserFileReads$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileReads
     * }
     */
    public static void UserFileReads(MemorySegment struct, long fieldValue) {
        struct.set(UserFileReads$LAYOUT, UserFileReads$OFFSET, fieldValue);
    }

    private static final OfLong UserFileReadBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("UserFileReadBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileReadBytes
     * }
     */
    public static final OfLong UserFileReadBytes$layout() {
        return UserFileReadBytes$LAYOUT;
    }

    private static final long UserFileReadBytes$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileReadBytes
     * }
     */
    public static final long UserFileReadBytes$offset() {
        return UserFileReadBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileReadBytes
     * }
     */
    public static long UserFileReadBytes(MemorySegment struct) {
        return struct.get(UserFileReadBytes$LAYOUT, UserFileReadBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileReadBytes
     * }
     */
    public static void UserFileReadBytes(MemorySegment struct, long fieldValue) {
        struct.set(UserFileReadBytes$LAYOUT, UserFileReadBytes$OFFSET, fieldValue);
    }

    private static final OfLong UserDiskReads$LAYOUT = (OfLong)$LAYOUT.select(groupElement("UserDiskReads"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG UserDiskReads
     * }
     */
    public static final OfLong UserDiskReads$layout() {
        return UserDiskReads$LAYOUT;
    }

    private static final long UserDiskReads$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG UserDiskReads
     * }
     */
    public static final long UserDiskReads$offset() {
        return UserDiskReads$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG UserDiskReads
     * }
     */
    public static long UserDiskReads(MemorySegment struct) {
        return struct.get(UserDiskReads$LAYOUT, UserDiskReads$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG UserDiskReads
     * }
     */
    public static void UserDiskReads(MemorySegment struct, long fieldValue) {
        struct.set(UserDiskReads$LAYOUT, UserDiskReads$OFFSET, fieldValue);
    }

    private static final OfLong UserFileWrites$LAYOUT = (OfLong)$LAYOUT.select(groupElement("UserFileWrites"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileWrites
     * }
     */
    public static final OfLong UserFileWrites$layout() {
        return UserFileWrites$LAYOUT;
    }

    private static final long UserFileWrites$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileWrites
     * }
     */
    public static final long UserFileWrites$offset() {
        return UserFileWrites$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileWrites
     * }
     */
    public static long UserFileWrites(MemorySegment struct) {
        return struct.get(UserFileWrites$LAYOUT, UserFileWrites$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileWrites
     * }
     */
    public static void UserFileWrites(MemorySegment struct, long fieldValue) {
        struct.set(UserFileWrites$LAYOUT, UserFileWrites$OFFSET, fieldValue);
    }

    private static final OfLong UserFileWriteBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("UserFileWriteBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileWriteBytes
     * }
     */
    public static final OfLong UserFileWriteBytes$layout() {
        return UserFileWriteBytes$LAYOUT;
    }

    private static final long UserFileWriteBytes$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileWriteBytes
     * }
     */
    public static final long UserFileWriteBytes$offset() {
        return UserFileWriteBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileWriteBytes
     * }
     */
    public static long UserFileWriteBytes(MemorySegment struct) {
        return struct.get(UserFileWriteBytes$LAYOUT, UserFileWriteBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG UserFileWriteBytes
     * }
     */
    public static void UserFileWriteBytes(MemorySegment struct, long fieldValue) {
        struct.set(UserFileWriteBytes$LAYOUT, UserFileWriteBytes$OFFSET, fieldValue);
    }

    private static final OfLong UserDiskWrites$LAYOUT = (OfLong)$LAYOUT.select(groupElement("UserDiskWrites"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG UserDiskWrites
     * }
     */
    public static final OfLong UserDiskWrites$layout() {
        return UserDiskWrites$LAYOUT;
    }

    private static final long UserDiskWrites$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG UserDiskWrites
     * }
     */
    public static final long UserDiskWrites$offset() {
        return UserDiskWrites$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG UserDiskWrites
     * }
     */
    public static long UserDiskWrites(MemorySegment struct) {
        return struct.get(UserDiskWrites$LAYOUT, UserDiskWrites$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG UserDiskWrites
     * }
     */
    public static void UserDiskWrites(MemorySegment struct, long fieldValue) {
        struct.set(UserDiskWrites$LAYOUT, UserDiskWrites$OFFSET, fieldValue);
    }

    private static final OfLong MetaDataReads$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MetaDataReads"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataReads
     * }
     */
    public static final OfLong MetaDataReads$layout() {
        return MetaDataReads$LAYOUT;
    }

    private static final long MetaDataReads$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataReads
     * }
     */
    public static final long MetaDataReads$offset() {
        return MetaDataReads$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataReads
     * }
     */
    public static long MetaDataReads(MemorySegment struct) {
        return struct.get(MetaDataReads$LAYOUT, MetaDataReads$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataReads
     * }
     */
    public static void MetaDataReads(MemorySegment struct, long fieldValue) {
        struct.set(MetaDataReads$LAYOUT, MetaDataReads$OFFSET, fieldValue);
    }

    private static final OfLong MetaDataReadBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MetaDataReadBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataReadBytes
     * }
     */
    public static final OfLong MetaDataReadBytes$layout() {
        return MetaDataReadBytes$LAYOUT;
    }

    private static final long MetaDataReadBytes$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataReadBytes
     * }
     */
    public static final long MetaDataReadBytes$offset() {
        return MetaDataReadBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataReadBytes
     * }
     */
    public static long MetaDataReadBytes(MemorySegment struct) {
        return struct.get(MetaDataReadBytes$LAYOUT, MetaDataReadBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataReadBytes
     * }
     */
    public static void MetaDataReadBytes(MemorySegment struct, long fieldValue) {
        struct.set(MetaDataReadBytes$LAYOUT, MetaDataReadBytes$OFFSET, fieldValue);
    }

    private static final OfLong MetaDataDiskReads$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MetaDataDiskReads"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataDiskReads
     * }
     */
    public static final OfLong MetaDataDiskReads$layout() {
        return MetaDataDiskReads$LAYOUT;
    }

    private static final long MetaDataDiskReads$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataDiskReads
     * }
     */
    public static final long MetaDataDiskReads$offset() {
        return MetaDataDiskReads$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataDiskReads
     * }
     */
    public static long MetaDataDiskReads(MemorySegment struct) {
        return struct.get(MetaDataDiskReads$LAYOUT, MetaDataDiskReads$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataDiskReads
     * }
     */
    public static void MetaDataDiskReads(MemorySegment struct, long fieldValue) {
        struct.set(MetaDataDiskReads$LAYOUT, MetaDataDiskReads$OFFSET, fieldValue);
    }

    private static final OfLong MetaDataWrites$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MetaDataWrites"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataWrites
     * }
     */
    public static final OfLong MetaDataWrites$layout() {
        return MetaDataWrites$LAYOUT;
    }

    private static final long MetaDataWrites$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataWrites
     * }
     */
    public static final long MetaDataWrites$offset() {
        return MetaDataWrites$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataWrites
     * }
     */
    public static long MetaDataWrites(MemorySegment struct) {
        return struct.get(MetaDataWrites$LAYOUT, MetaDataWrites$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataWrites
     * }
     */
    public static void MetaDataWrites(MemorySegment struct, long fieldValue) {
        struct.set(MetaDataWrites$LAYOUT, MetaDataWrites$OFFSET, fieldValue);
    }

    private static final OfLong MetaDataWriteBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MetaDataWriteBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataWriteBytes
     * }
     */
    public static final OfLong MetaDataWriteBytes$layout() {
        return MetaDataWriteBytes$LAYOUT;
    }

    private static final long MetaDataWriteBytes$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataWriteBytes
     * }
     */
    public static final long MetaDataWriteBytes$offset() {
        return MetaDataWriteBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataWriteBytes
     * }
     */
    public static long MetaDataWriteBytes(MemorySegment struct) {
        return struct.get(MetaDataWriteBytes$LAYOUT, MetaDataWriteBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataWriteBytes
     * }
     */
    public static void MetaDataWriteBytes(MemorySegment struct, long fieldValue) {
        struct.set(MetaDataWriteBytes$LAYOUT, MetaDataWriteBytes$OFFSET, fieldValue);
    }

    private static final OfLong MetaDataDiskWrites$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MetaDataDiskWrites"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataDiskWrites
     * }
     */
    public static final OfLong MetaDataDiskWrites$layout() {
        return MetaDataDiskWrites$LAYOUT;
    }

    private static final long MetaDataDiskWrites$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataDiskWrites
     * }
     */
    public static final long MetaDataDiskWrites$offset() {
        return MetaDataDiskWrites$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataDiskWrites
     * }
     */
    public static long MetaDataDiskWrites(MemorySegment struct) {
        return struct.get(MetaDataDiskWrites$LAYOUT, MetaDataDiskWrites$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG MetaDataDiskWrites
     * }
     */
    public static void MetaDataDiskWrites(MemorySegment struct, long fieldValue) {
        struct.set(MetaDataDiskWrites$LAYOUT, MetaDataDiskWrites$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

