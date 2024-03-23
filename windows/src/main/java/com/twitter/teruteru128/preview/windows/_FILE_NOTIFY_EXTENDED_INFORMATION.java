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
 * struct _FILE_NOTIFY_EXTENDED_INFORMATION {
 *     DWORD NextEntryOffset;
 *     DWORD Action;
 *     LARGE_INTEGER CreationTime;
 *     LARGE_INTEGER LastModificationTime;
 *     LARGE_INTEGER LastChangeTime;
 *     LARGE_INTEGER LastAccessTime;
 *     LARGE_INTEGER AllocatedLength;
 *     LARGE_INTEGER FileSize;
 *     DWORD FileAttributes;
 *     DWORD ReparsePointTag;
 *     LARGE_INTEGER FileId;
 *     LARGE_INTEGER ParentFileId;
 *     DWORD FileNameLength;
 *     WCHAR FileName[1];
 * }
 * }
 */
public class _FILE_NOTIFY_EXTENDED_INFORMATION {

    _FILE_NOTIFY_EXTENDED_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("NextEntryOffset"),
        Windows_h.C_LONG.withName("Action"),
        _LARGE_INTEGER.layout().withName("CreationTime"),
        _LARGE_INTEGER.layout().withName("LastModificationTime"),
        _LARGE_INTEGER.layout().withName("LastChangeTime"),
        _LARGE_INTEGER.layout().withName("LastAccessTime"),
        _LARGE_INTEGER.layout().withName("AllocatedLength"),
        _LARGE_INTEGER.layout().withName("FileSize"),
        Windows_h.C_LONG.withName("FileAttributes"),
        Windows_h.C_LONG.withName("ReparsePointTag"),
        _LARGE_INTEGER.layout().withName("FileId"),
        _LARGE_INTEGER.layout().withName("ParentFileId"),
        Windows_h.C_LONG.withName("FileNameLength"),
        MemoryLayout.sequenceLayout(1, Windows_h.C_SHORT).withName("FileName"),
        MemoryLayout.paddingLayout(2)
    ).withName("_FILE_NOTIFY_EXTENDED_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt NextEntryOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NextEntryOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NextEntryOffset
     * }
     */
    public static final OfInt NextEntryOffset$layout() {
        return NextEntryOffset$LAYOUT;
    }

    private static final long NextEntryOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NextEntryOffset
     * }
     */
    public static final long NextEntryOffset$offset() {
        return NextEntryOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NextEntryOffset
     * }
     */
    public static int NextEntryOffset(MemorySegment struct) {
        return struct.get(NextEntryOffset$LAYOUT, NextEntryOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NextEntryOffset
     * }
     */
    public static void NextEntryOffset(MemorySegment struct, int fieldValue) {
        struct.set(NextEntryOffset$LAYOUT, NextEntryOffset$OFFSET, fieldValue);
    }

    private static final OfInt Action$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Action"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Action
     * }
     */
    public static final OfInt Action$layout() {
        return Action$LAYOUT;
    }

    private static final long Action$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Action
     * }
     */
    public static final long Action$offset() {
        return Action$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Action
     * }
     */
    public static int Action(MemorySegment struct) {
        return struct.get(Action$LAYOUT, Action$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Action
     * }
     */
    public static void Action(MemorySegment struct, int fieldValue) {
        struct.set(Action$LAYOUT, Action$OFFSET, fieldValue);
    }

    private static final GroupLayout CreationTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("CreationTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER CreationTime
     * }
     */
    public static final GroupLayout CreationTime$layout() {
        return CreationTime$LAYOUT;
    }

    private static final long CreationTime$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER CreationTime
     * }
     */
    public static final long CreationTime$offset() {
        return CreationTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER CreationTime
     * }
     */
    public static MemorySegment CreationTime(MemorySegment struct) {
        return struct.asSlice(CreationTime$OFFSET, CreationTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER CreationTime
     * }
     */
    public static void CreationTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CreationTime$OFFSET, CreationTime$LAYOUT.byteSize());
    }

    private static final GroupLayout LastModificationTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("LastModificationTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastModificationTime
     * }
     */
    public static final GroupLayout LastModificationTime$layout() {
        return LastModificationTime$LAYOUT;
    }

    private static final long LastModificationTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastModificationTime
     * }
     */
    public static final long LastModificationTime$offset() {
        return LastModificationTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastModificationTime
     * }
     */
    public static MemorySegment LastModificationTime(MemorySegment struct) {
        return struct.asSlice(LastModificationTime$OFFSET, LastModificationTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastModificationTime
     * }
     */
    public static void LastModificationTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, LastModificationTime$OFFSET, LastModificationTime$LAYOUT.byteSize());
    }

    private static final GroupLayout LastChangeTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("LastChangeTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastChangeTime
     * }
     */
    public static final GroupLayout LastChangeTime$layout() {
        return LastChangeTime$LAYOUT;
    }

    private static final long LastChangeTime$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastChangeTime
     * }
     */
    public static final long LastChangeTime$offset() {
        return LastChangeTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastChangeTime
     * }
     */
    public static MemorySegment LastChangeTime(MemorySegment struct) {
        return struct.asSlice(LastChangeTime$OFFSET, LastChangeTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastChangeTime
     * }
     */
    public static void LastChangeTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, LastChangeTime$OFFSET, LastChangeTime$LAYOUT.byteSize());
    }

    private static final GroupLayout LastAccessTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("LastAccessTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastAccessTime
     * }
     */
    public static final GroupLayout LastAccessTime$layout() {
        return LastAccessTime$LAYOUT;
    }

    private static final long LastAccessTime$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastAccessTime
     * }
     */
    public static final long LastAccessTime$offset() {
        return LastAccessTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastAccessTime
     * }
     */
    public static MemorySegment LastAccessTime(MemorySegment struct) {
        return struct.asSlice(LastAccessTime$OFFSET, LastAccessTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER LastAccessTime
     * }
     */
    public static void LastAccessTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, LastAccessTime$OFFSET, LastAccessTime$LAYOUT.byteSize());
    }

    private static final GroupLayout AllocatedLength$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("AllocatedLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocatedLength
     * }
     */
    public static final GroupLayout AllocatedLength$layout() {
        return AllocatedLength$LAYOUT;
    }

    private static final long AllocatedLength$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocatedLength
     * }
     */
    public static final long AllocatedLength$offset() {
        return AllocatedLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocatedLength
     * }
     */
    public static MemorySegment AllocatedLength(MemorySegment struct) {
        return struct.asSlice(AllocatedLength$OFFSET, AllocatedLength$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocatedLength
     * }
     */
    public static void AllocatedLength(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AllocatedLength$OFFSET, AllocatedLength$LAYOUT.byteSize());
    }

    private static final GroupLayout FileSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("FileSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileSize
     * }
     */
    public static final GroupLayout FileSize$layout() {
        return FileSize$LAYOUT;
    }

    private static final long FileSize$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileSize
     * }
     */
    public static final long FileSize$offset() {
        return FileSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileSize
     * }
     */
    public static MemorySegment FileSize(MemorySegment struct) {
        return struct.asSlice(FileSize$OFFSET, FileSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileSize
     * }
     */
    public static void FileSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FileSize$OFFSET, FileSize$LAYOUT.byteSize());
    }

    private static final OfInt FileAttributes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FileAttributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FileAttributes
     * }
     */
    public static final OfInt FileAttributes$layout() {
        return FileAttributes$LAYOUT;
    }

    private static final long FileAttributes$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FileAttributes
     * }
     */
    public static final long FileAttributes$offset() {
        return FileAttributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FileAttributes
     * }
     */
    public static int FileAttributes(MemorySegment struct) {
        return struct.get(FileAttributes$LAYOUT, FileAttributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FileAttributes
     * }
     */
    public static void FileAttributes(MemorySegment struct, int fieldValue) {
        struct.set(FileAttributes$LAYOUT, FileAttributes$OFFSET, fieldValue);
    }

    private static final OfInt ReparsePointTag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ReparsePointTag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ReparsePointTag
     * }
     */
    public static final OfInt ReparsePointTag$layout() {
        return ReparsePointTag$LAYOUT;
    }

    private static final long ReparsePointTag$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ReparsePointTag
     * }
     */
    public static final long ReparsePointTag$offset() {
        return ReparsePointTag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ReparsePointTag
     * }
     */
    public static int ReparsePointTag(MemorySegment struct) {
        return struct.get(ReparsePointTag$LAYOUT, ReparsePointTag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ReparsePointTag
     * }
     */
    public static void ReparsePointTag(MemorySegment struct, int fieldValue) {
        struct.set(ReparsePointTag$LAYOUT, ReparsePointTag$OFFSET, fieldValue);
    }

    private static final GroupLayout FileId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("FileId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileId
     * }
     */
    public static final GroupLayout FileId$layout() {
        return FileId$LAYOUT;
    }

    private static final long FileId$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileId
     * }
     */
    public static final long FileId$offset() {
        return FileId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileId
     * }
     */
    public static MemorySegment FileId(MemorySegment struct) {
        return struct.asSlice(FileId$OFFSET, FileId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileId
     * }
     */
    public static void FileId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FileId$OFFSET, FileId$LAYOUT.byteSize());
    }

    private static final GroupLayout ParentFileId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ParentFileId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ParentFileId
     * }
     */
    public static final GroupLayout ParentFileId$layout() {
        return ParentFileId$LAYOUT;
    }

    private static final long ParentFileId$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ParentFileId
     * }
     */
    public static final long ParentFileId$offset() {
        return ParentFileId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ParentFileId
     * }
     */
    public static MemorySegment ParentFileId(MemorySegment struct) {
        return struct.asSlice(ParentFileId$OFFSET, ParentFileId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ParentFileId
     * }
     */
    public static void ParentFileId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ParentFileId$OFFSET, ParentFileId$LAYOUT.byteSize());
    }

    private static final OfInt FileNameLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FileNameLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FileNameLength
     * }
     */
    public static final OfInt FileNameLength$layout() {
        return FileNameLength$LAYOUT;
    }

    private static final long FileNameLength$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FileNameLength
     * }
     */
    public static final long FileNameLength$offset() {
        return FileNameLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FileNameLength
     * }
     */
    public static int FileNameLength(MemorySegment struct) {
        return struct.get(FileNameLength$LAYOUT, FileNameLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FileNameLength
     * }
     */
    public static void FileNameLength(MemorySegment struct, int fieldValue) {
        struct.set(FileNameLength$LAYOUT, FileNameLength$OFFSET, fieldValue);
    }

    private static final SequenceLayout FileName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FileName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static final SequenceLayout FileName$layout() {
        return FileName$LAYOUT;
    }

    private static final long FileName$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static final long FileName$offset() {
        return FileName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static MemorySegment FileName(MemorySegment struct) {
        return struct.asSlice(FileName$OFFSET, FileName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static void FileName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FileName$OFFSET, FileName$LAYOUT.byteSize());
    }

    private static long[] FileName$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static long[] FileName$dimensions() {
        return FileName$DIMS;
    }
    private static final VarHandle FileName$ELEM_HANDLE = FileName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static short FileName(MemorySegment struct, long index0) {
        return (short)FileName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static void FileName(MemorySegment struct, long index0, short fieldValue) {
        FileName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

