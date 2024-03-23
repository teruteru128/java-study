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
 * struct STORAGE_BREAK_RESERVATION_REQUEST {
 *     DWORD Length;
 *     BYTE _unused;
 *     BYTE PathId;
 *     BYTE TargetId;
 *     BYTE Lun;
 * }
 * }
 */
public class STORAGE_BREAK_RESERVATION_REQUEST {

    STORAGE_BREAK_RESERVATION_REQUEST() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Length"),
        Windows_h.C_CHAR.withName("_unused"),
        Windows_h.C_CHAR.withName("PathId"),
        Windows_h.C_CHAR.withName("TargetId"),
        Windows_h.C_CHAR.withName("Lun")
    ).withName("STORAGE_BREAK_RESERVATION_REQUEST");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Length$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static final OfInt Length$layout() {
        return Length$LAYOUT;
    }

    private static final long Length$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static final long Length$offset() {
        return Length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static int Length(MemorySegment struct) {
        return struct.get(Length$LAYOUT, Length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static void Length(MemorySegment struct, int fieldValue) {
        struct.set(Length$LAYOUT, Length$OFFSET, fieldValue);
    }

    private static final OfByte _unused$LAYOUT = (OfByte)$LAYOUT.select(groupElement("_unused"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE _unused
     * }
     */
    public static final OfByte _unused$layout() {
        return _unused$LAYOUT;
    }

    private static final long _unused$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE _unused
     * }
     */
    public static final long _unused$offset() {
        return _unused$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE _unused
     * }
     */
    public static byte _unused(MemorySegment struct) {
        return struct.get(_unused$LAYOUT, _unused$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE _unused
     * }
     */
    public static void _unused(MemorySegment struct, byte fieldValue) {
        struct.set(_unused$LAYOUT, _unused$OFFSET, fieldValue);
    }

    private static final OfByte PathId$LAYOUT = (OfByte)$LAYOUT.select(groupElement("PathId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE PathId
     * }
     */
    public static final OfByte PathId$layout() {
        return PathId$LAYOUT;
    }

    private static final long PathId$OFFSET = 5;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE PathId
     * }
     */
    public static final long PathId$offset() {
        return PathId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE PathId
     * }
     */
    public static byte PathId(MemorySegment struct) {
        return struct.get(PathId$LAYOUT, PathId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE PathId
     * }
     */
    public static void PathId(MemorySegment struct, byte fieldValue) {
        struct.set(PathId$LAYOUT, PathId$OFFSET, fieldValue);
    }

    private static final OfByte TargetId$LAYOUT = (OfByte)$LAYOUT.select(groupElement("TargetId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE TargetId
     * }
     */
    public static final OfByte TargetId$layout() {
        return TargetId$LAYOUT;
    }

    private static final long TargetId$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE TargetId
     * }
     */
    public static final long TargetId$offset() {
        return TargetId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE TargetId
     * }
     */
    public static byte TargetId(MemorySegment struct) {
        return struct.get(TargetId$LAYOUT, TargetId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE TargetId
     * }
     */
    public static void TargetId(MemorySegment struct, byte fieldValue) {
        struct.set(TargetId$LAYOUT, TargetId$OFFSET, fieldValue);
    }

    private static final OfByte Lun$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Lun"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Lun
     * }
     */
    public static final OfByte Lun$layout() {
        return Lun$LAYOUT;
    }

    private static final long Lun$OFFSET = 7;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Lun
     * }
     */
    public static final long Lun$offset() {
        return Lun$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Lun
     * }
     */
    public static byte Lun(MemorySegment struct) {
        return struct.get(Lun$LAYOUT, Lun$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Lun
     * }
     */
    public static void Lun(MemorySegment struct, byte fieldValue) {
        struct.set(Lun$LAYOUT, Lun$OFFSET, fieldValue);
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

