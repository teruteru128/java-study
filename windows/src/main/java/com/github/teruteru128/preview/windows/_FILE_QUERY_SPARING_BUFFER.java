// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * struct _FILE_QUERY_SPARING_BUFFER {
 *     DWORD SparingUnitBytes;
 *     BOOLEAN SoftwareSparing;
 *     DWORD TotalSpareBlocks;
 *     DWORD FreeSpareBlocks;
 * }
 * }
 */
public class _FILE_QUERY_SPARING_BUFFER {

    _FILE_QUERY_SPARING_BUFFER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("SparingUnitBytes"),
        Windows_h.C_CHAR.withName("SoftwareSparing"),
        MemoryLayout.paddingLayout(3),
        Windows_h.C_LONG.withName("TotalSpareBlocks"),
        Windows_h.C_LONG.withName("FreeSpareBlocks")
    ).withName("_FILE_QUERY_SPARING_BUFFER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt SparingUnitBytes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SparingUnitBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SparingUnitBytes
     * }
     */
    public static final OfInt SparingUnitBytes$layout() {
        return SparingUnitBytes$LAYOUT;
    }

    private static final long SparingUnitBytes$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SparingUnitBytes
     * }
     */
    public static final long SparingUnitBytes$offset() {
        return SparingUnitBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SparingUnitBytes
     * }
     */
    public static int SparingUnitBytes(MemorySegment struct) {
        return struct.get(SparingUnitBytes$LAYOUT, SparingUnitBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SparingUnitBytes
     * }
     */
    public static void SparingUnitBytes(MemorySegment struct, int fieldValue) {
        struct.set(SparingUnitBytes$LAYOUT, SparingUnitBytes$OFFSET, fieldValue);
    }

    private static final OfByte SoftwareSparing$LAYOUT = (OfByte)$LAYOUT.select(groupElement("SoftwareSparing"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN SoftwareSparing
     * }
     */
    public static final OfByte SoftwareSparing$layout() {
        return SoftwareSparing$LAYOUT;
    }

    private static final long SoftwareSparing$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN SoftwareSparing
     * }
     */
    public static final long SoftwareSparing$offset() {
        return SoftwareSparing$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN SoftwareSparing
     * }
     */
    public static byte SoftwareSparing(MemorySegment struct) {
        return struct.get(SoftwareSparing$LAYOUT, SoftwareSparing$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN SoftwareSparing
     * }
     */
    public static void SoftwareSparing(MemorySegment struct, byte fieldValue) {
        struct.set(SoftwareSparing$LAYOUT, SoftwareSparing$OFFSET, fieldValue);
    }

    private static final OfInt TotalSpareBlocks$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TotalSpareBlocks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TotalSpareBlocks
     * }
     */
    public static final OfInt TotalSpareBlocks$layout() {
        return TotalSpareBlocks$LAYOUT;
    }

    private static final long TotalSpareBlocks$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TotalSpareBlocks
     * }
     */
    public static final long TotalSpareBlocks$offset() {
        return TotalSpareBlocks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TotalSpareBlocks
     * }
     */
    public static int TotalSpareBlocks(MemorySegment struct) {
        return struct.get(TotalSpareBlocks$LAYOUT, TotalSpareBlocks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TotalSpareBlocks
     * }
     */
    public static void TotalSpareBlocks(MemorySegment struct, int fieldValue) {
        struct.set(TotalSpareBlocks$LAYOUT, TotalSpareBlocks$OFFSET, fieldValue);
    }

    private static final OfInt FreeSpareBlocks$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FreeSpareBlocks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FreeSpareBlocks
     * }
     */
    public static final OfInt FreeSpareBlocks$layout() {
        return FreeSpareBlocks$LAYOUT;
    }

    private static final long FreeSpareBlocks$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FreeSpareBlocks
     * }
     */
    public static final long FreeSpareBlocks$offset() {
        return FreeSpareBlocks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FreeSpareBlocks
     * }
     */
    public static int FreeSpareBlocks(MemorySegment struct) {
        return struct.get(FreeSpareBlocks$LAYOUT, FreeSpareBlocks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FreeSpareBlocks
     * }
     */
    public static void FreeSpareBlocks(MemorySegment struct, int fieldValue) {
        struct.set(FreeSpareBlocks$LAYOUT, FreeSpareBlocks$OFFSET, fieldValue);
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
