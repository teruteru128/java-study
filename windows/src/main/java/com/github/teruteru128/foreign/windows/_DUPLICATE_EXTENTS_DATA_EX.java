// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * struct _DUPLICATE_EXTENTS_DATA_EX {
 *     SIZE_T Size;
 *     HANDLE FileHandle;
 *     LARGE_INTEGER SourceFileOffset;
 *     LARGE_INTEGER TargetFileOffset;
 *     LARGE_INTEGER ByteCount;
 *     DWORD Flags;
 * }
 * }
 */
public class _DUPLICATE_EXTENTS_DATA_EX {

    _DUPLICATE_EXTENTS_DATA_EX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG_LONG.withName("Size"),
        Windows_h.C_POINTER.withName("FileHandle"),
        _LARGE_INTEGER.layout().withName("SourceFileOffset"),
        _LARGE_INTEGER.layout().withName("TargetFileOffset"),
        _LARGE_INTEGER.layout().withName("ByteCount"),
        Windows_h.C_LONG.withName("Flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("_DUPLICATE_EXTENTS_DATA_EX");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong Size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T Size
     * }
     */
    public static final OfLong Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T Size
     * }
     */
    public static long Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T Size
     * }
     */
    public static void Size(MemorySegment struct, long fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final AddressLayout FileHandle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("FileHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE FileHandle
     * }
     */
    public static final AddressLayout FileHandle$layout() {
        return FileHandle$LAYOUT;
    }

    private static final long FileHandle$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE FileHandle
     * }
     */
    public static final long FileHandle$offset() {
        return FileHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE FileHandle
     * }
     */
    public static MemorySegment FileHandle(MemorySegment struct) {
        return struct.get(FileHandle$LAYOUT, FileHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE FileHandle
     * }
     */
    public static void FileHandle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(FileHandle$LAYOUT, FileHandle$OFFSET, fieldValue);
    }

    private static final GroupLayout SourceFileOffset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SourceFileOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER SourceFileOffset
     * }
     */
    public static final GroupLayout SourceFileOffset$layout() {
        return SourceFileOffset$LAYOUT;
    }

    private static final long SourceFileOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER SourceFileOffset
     * }
     */
    public static final long SourceFileOffset$offset() {
        return SourceFileOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER SourceFileOffset
     * }
     */
    public static MemorySegment SourceFileOffset(MemorySegment struct) {
        return struct.asSlice(SourceFileOffset$OFFSET, SourceFileOffset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER SourceFileOffset
     * }
     */
    public static void SourceFileOffset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SourceFileOffset$OFFSET, SourceFileOffset$LAYOUT.byteSize());
    }

    private static final GroupLayout TargetFileOffset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TargetFileOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TargetFileOffset
     * }
     */
    public static final GroupLayout TargetFileOffset$layout() {
        return TargetFileOffset$LAYOUT;
    }

    private static final long TargetFileOffset$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TargetFileOffset
     * }
     */
    public static final long TargetFileOffset$offset() {
        return TargetFileOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TargetFileOffset
     * }
     */
    public static MemorySegment TargetFileOffset(MemorySegment struct) {
        return struct.asSlice(TargetFileOffset$OFFSET, TargetFileOffset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TargetFileOffset
     * }
     */
    public static void TargetFileOffset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TargetFileOffset$OFFSET, TargetFileOffset$LAYOUT.byteSize());
    }

    private static final GroupLayout ByteCount$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ByteCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ByteCount
     * }
     */
    public static final GroupLayout ByteCount$layout() {
        return ByteCount$LAYOUT;
    }

    private static final long ByteCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ByteCount
     * }
     */
    public static final long ByteCount$offset() {
        return ByteCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ByteCount
     * }
     */
    public static MemorySegment ByteCount(MemorySegment struct) {
        return struct.asSlice(ByteCount$OFFSET, ByteCount$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ByteCount
     * }
     */
    public static void ByteCount(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ByteCount$OFFSET, ByteCount$LAYOUT.byteSize());
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
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
