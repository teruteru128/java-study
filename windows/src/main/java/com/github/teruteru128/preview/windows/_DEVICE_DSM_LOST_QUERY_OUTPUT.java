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
 * struct _DEVICE_DSM_LOST_QUERY_OUTPUT {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORDLONG Alignment;
 *     DWORD NumberOfBits;
 *     DWORD BitMap[1];
 * }
 * }
 */
public class _DEVICE_DSM_LOST_QUERY_OUTPUT {

    _DEVICE_DSM_LOST_QUERY_OUTPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Version"),
        Windows_h.C_LONG.withName("Size"),
        Windows_h.C_LONG_LONG.withName("Alignment"),
        Windows_h.C_LONG.withName("NumberOfBits"),
        MemoryLayout.sequenceLayout(1, Windows_h.C_LONG).withName("BitMap")
    ).withName("_DEVICE_DSM_LOST_QUERY_OUTPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfLong Alignment$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Alignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG Alignment
     * }
     */
    public static final OfLong Alignment$layout() {
        return Alignment$LAYOUT;
    }

    private static final long Alignment$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG Alignment
     * }
     */
    public static final long Alignment$offset() {
        return Alignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG Alignment
     * }
     */
    public static long Alignment(MemorySegment struct) {
        return struct.get(Alignment$LAYOUT, Alignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG Alignment
     * }
     */
    public static void Alignment(MemorySegment struct, long fieldValue) {
        struct.set(Alignment$LAYOUT, Alignment$OFFSET, fieldValue);
    }

    private static final OfInt NumberOfBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfBits
     * }
     */
    public static final OfInt NumberOfBits$layout() {
        return NumberOfBits$LAYOUT;
    }

    private static final long NumberOfBits$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfBits
     * }
     */
    public static final long NumberOfBits$offset() {
        return NumberOfBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfBits
     * }
     */
    public static int NumberOfBits(MemorySegment struct) {
        return struct.get(NumberOfBits$LAYOUT, NumberOfBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfBits
     * }
     */
    public static void NumberOfBits(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfBits$LAYOUT, NumberOfBits$OFFSET, fieldValue);
    }

    private static final SequenceLayout BitMap$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("BitMap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BitMap[1]
     * }
     */
    public static final SequenceLayout BitMap$layout() {
        return BitMap$LAYOUT;
    }

    private static final long BitMap$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BitMap[1]
     * }
     */
    public static final long BitMap$offset() {
        return BitMap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BitMap[1]
     * }
     */
    public static MemorySegment BitMap(MemorySegment struct) {
        return struct.asSlice(BitMap$OFFSET, BitMap$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BitMap[1]
     * }
     */
    public static void BitMap(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, BitMap$OFFSET, BitMap$LAYOUT.byteSize());
    }

    private static long[] BitMap$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD BitMap[1]
     * }
     */
    public static long[] BitMap$dimensions() {
        return BitMap$DIMS;
    }
    private static final VarHandle BitMap$ELEM_HANDLE = BitMap$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD BitMap[1]
     * }
     */
    public static int BitMap(MemorySegment struct, long index0) {
        return (int)BitMap$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD BitMap[1]
     * }
     */
    public static void BitMap(MemorySegment struct, long index0, int fieldValue) {
        BitMap$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
