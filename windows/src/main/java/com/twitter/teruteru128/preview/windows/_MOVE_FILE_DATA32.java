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
 * struct _MOVE_FILE_DATA32 {
 *     UINT32 FileHandle;
 *     LARGE_INTEGER StartingVcn;
 *     LARGE_INTEGER StartingLcn;
 *     DWORD ClusterCount;
 * }
 * }
 */
public class _MOVE_FILE_DATA32 {

    _MOVE_FILE_DATA32() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("FileHandle"),
        MemoryLayout.paddingLayout(4),
        _LARGE_INTEGER.layout().withName("StartingVcn"),
        _LARGE_INTEGER.layout().withName("StartingLcn"),
        Windows_h.C_LONG.withName("ClusterCount"),
        MemoryLayout.paddingLayout(4)
    ).withName("_MOVE_FILE_DATA32");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt FileHandle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FileHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 FileHandle
     * }
     */
    public static final OfInt FileHandle$layout() {
        return FileHandle$LAYOUT;
    }

    private static final long FileHandle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 FileHandle
     * }
     */
    public static final long FileHandle$offset() {
        return FileHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 FileHandle
     * }
     */
    public static int FileHandle(MemorySegment struct) {
        return struct.get(FileHandle$LAYOUT, FileHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 FileHandle
     * }
     */
    public static void FileHandle(MemorySegment struct, int fieldValue) {
        struct.set(FileHandle$LAYOUT, FileHandle$OFFSET, fieldValue);
    }

    private static final GroupLayout StartingVcn$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("StartingVcn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingVcn
     * }
     */
    public static final GroupLayout StartingVcn$layout() {
        return StartingVcn$LAYOUT;
    }

    private static final long StartingVcn$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingVcn
     * }
     */
    public static final long StartingVcn$offset() {
        return StartingVcn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingVcn
     * }
     */
    public static MemorySegment StartingVcn(MemorySegment struct) {
        return struct.asSlice(StartingVcn$OFFSET, StartingVcn$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingVcn
     * }
     */
    public static void StartingVcn(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StartingVcn$OFFSET, StartingVcn$LAYOUT.byteSize());
    }

    private static final GroupLayout StartingLcn$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("StartingLcn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingLcn
     * }
     */
    public static final GroupLayout StartingLcn$layout() {
        return StartingLcn$LAYOUT;
    }

    private static final long StartingLcn$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingLcn
     * }
     */
    public static final long StartingLcn$offset() {
        return StartingLcn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingLcn
     * }
     */
    public static MemorySegment StartingLcn(MemorySegment struct) {
        return struct.asSlice(StartingLcn$OFFSET, StartingLcn$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingLcn
     * }
     */
    public static void StartingLcn(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StartingLcn$OFFSET, StartingLcn$LAYOUT.byteSize());
    }

    private static final OfInt ClusterCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ClusterCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ClusterCount
     * }
     */
    public static final OfInt ClusterCount$layout() {
        return ClusterCount$LAYOUT;
    }

    private static final long ClusterCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ClusterCount
     * }
     */
    public static final long ClusterCount$offset() {
        return ClusterCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ClusterCount
     * }
     */
    public static int ClusterCount(MemorySegment struct) {
        return struct.get(ClusterCount$LAYOUT, ClusterCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ClusterCount
     * }
     */
    public static void ClusterCount(MemorySegment struct, int fieldValue) {
        struct.set(ClusterCount$LAYOUT, ClusterCount$OFFSET, fieldValue);
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

