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
 * struct _SET_DAX_ALLOC_ALIGNMENT_HINT_INPUT {
 *     DWORD Flags;
 *     DWORD AlignmentShift;
 *     DWORDLONG FileOffsetToAlign;
 *     DWORD FallbackAlignmentShift;
 * }
 * }
 */
public class _SET_DAX_ALLOC_ALIGNMENT_HINT_INPUT {

    _SET_DAX_ALLOC_ALIGNMENT_HINT_INPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Flags"),
        Windows_h.C_LONG.withName("AlignmentShift"),
        Windows_h.C_LONG_LONG.withName("FileOffsetToAlign"),
        Windows_h.C_LONG.withName("FallbackAlignmentShift"),
        MemoryLayout.paddingLayout(4)
    ).withName("_SET_DAX_ALLOC_ALIGNMENT_HINT_INPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long Flags$OFFSET = 0;

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

    private static final OfInt AlignmentShift$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AlignmentShift"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AlignmentShift
     * }
     */
    public static final OfInt AlignmentShift$layout() {
        return AlignmentShift$LAYOUT;
    }

    private static final long AlignmentShift$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AlignmentShift
     * }
     */
    public static final long AlignmentShift$offset() {
        return AlignmentShift$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AlignmentShift
     * }
     */
    public static int AlignmentShift(MemorySegment struct) {
        return struct.get(AlignmentShift$LAYOUT, AlignmentShift$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AlignmentShift
     * }
     */
    public static void AlignmentShift(MemorySegment struct, int fieldValue) {
        struct.set(AlignmentShift$LAYOUT, AlignmentShift$OFFSET, fieldValue);
    }

    private static final OfLong FileOffsetToAlign$LAYOUT = (OfLong)$LAYOUT.select(groupElement("FileOffsetToAlign"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG FileOffsetToAlign
     * }
     */
    public static final OfLong FileOffsetToAlign$layout() {
        return FileOffsetToAlign$LAYOUT;
    }

    private static final long FileOffsetToAlign$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG FileOffsetToAlign
     * }
     */
    public static final long FileOffsetToAlign$offset() {
        return FileOffsetToAlign$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG FileOffsetToAlign
     * }
     */
    public static long FileOffsetToAlign(MemorySegment struct) {
        return struct.get(FileOffsetToAlign$LAYOUT, FileOffsetToAlign$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG FileOffsetToAlign
     * }
     */
    public static void FileOffsetToAlign(MemorySegment struct, long fieldValue) {
        struct.set(FileOffsetToAlign$LAYOUT, FileOffsetToAlign$OFFSET, fieldValue);
    }

    private static final OfInt FallbackAlignmentShift$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FallbackAlignmentShift"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FallbackAlignmentShift
     * }
     */
    public static final OfInt FallbackAlignmentShift$layout() {
        return FallbackAlignmentShift$LAYOUT;
    }

    private static final long FallbackAlignmentShift$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FallbackAlignmentShift
     * }
     */
    public static final long FallbackAlignmentShift$offset() {
        return FallbackAlignmentShift$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FallbackAlignmentShift
     * }
     */
    public static int FallbackAlignmentShift(MemorySegment struct) {
        return struct.get(FallbackAlignmentShift$LAYOUT, FallbackAlignmentShift$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FallbackAlignmentShift
     * }
     */
    public static void FallbackAlignmentShift(MemorySegment struct, int fieldValue) {
        struct.set(FallbackAlignmentShift$LAYOUT, FallbackAlignmentShift$OFFSET, fieldValue);
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

