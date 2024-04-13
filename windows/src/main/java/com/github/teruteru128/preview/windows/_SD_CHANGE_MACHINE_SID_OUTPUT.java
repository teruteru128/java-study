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
 * struct _SD_CHANGE_MACHINE_SID_OUTPUT {
 *     DWORDLONG NumSDChangedSuccess;
 *     DWORDLONG NumSDChangedFail;
 *     DWORDLONG NumSDUnused;
 *     DWORDLONG NumSDTotal;
 *     DWORDLONG NumMftSDChangedSuccess;
 *     DWORDLONG NumMftSDChangedFail;
 *     DWORDLONG NumMftSDTotal;
 * }
 * }
 */
public class _SD_CHANGE_MACHINE_SID_OUTPUT {

    _SD_CHANGE_MACHINE_SID_OUTPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG_LONG.withName("NumSDChangedSuccess"),
        Windows_h.C_LONG_LONG.withName("NumSDChangedFail"),
        Windows_h.C_LONG_LONG.withName("NumSDUnused"),
        Windows_h.C_LONG_LONG.withName("NumSDTotal"),
        Windows_h.C_LONG_LONG.withName("NumMftSDChangedSuccess"),
        Windows_h.C_LONG_LONG.withName("NumMftSDChangedFail"),
        Windows_h.C_LONG_LONG.withName("NumMftSDTotal")
    ).withName("_SD_CHANGE_MACHINE_SID_OUTPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong NumSDChangedSuccess$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumSDChangedSuccess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDChangedSuccess
     * }
     */
    public static final OfLong NumSDChangedSuccess$layout() {
        return NumSDChangedSuccess$LAYOUT;
    }

    private static final long NumSDChangedSuccess$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDChangedSuccess
     * }
     */
    public static final long NumSDChangedSuccess$offset() {
        return NumSDChangedSuccess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDChangedSuccess
     * }
     */
    public static long NumSDChangedSuccess(MemorySegment struct) {
        return struct.get(NumSDChangedSuccess$LAYOUT, NumSDChangedSuccess$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDChangedSuccess
     * }
     */
    public static void NumSDChangedSuccess(MemorySegment struct, long fieldValue) {
        struct.set(NumSDChangedSuccess$LAYOUT, NumSDChangedSuccess$OFFSET, fieldValue);
    }

    private static final OfLong NumSDChangedFail$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumSDChangedFail"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDChangedFail
     * }
     */
    public static final OfLong NumSDChangedFail$layout() {
        return NumSDChangedFail$LAYOUT;
    }

    private static final long NumSDChangedFail$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDChangedFail
     * }
     */
    public static final long NumSDChangedFail$offset() {
        return NumSDChangedFail$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDChangedFail
     * }
     */
    public static long NumSDChangedFail(MemorySegment struct) {
        return struct.get(NumSDChangedFail$LAYOUT, NumSDChangedFail$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDChangedFail
     * }
     */
    public static void NumSDChangedFail(MemorySegment struct, long fieldValue) {
        struct.set(NumSDChangedFail$LAYOUT, NumSDChangedFail$OFFSET, fieldValue);
    }

    private static final OfLong NumSDUnused$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumSDUnused"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDUnused
     * }
     */
    public static final OfLong NumSDUnused$layout() {
        return NumSDUnused$LAYOUT;
    }

    private static final long NumSDUnused$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDUnused
     * }
     */
    public static final long NumSDUnused$offset() {
        return NumSDUnused$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDUnused
     * }
     */
    public static long NumSDUnused(MemorySegment struct) {
        return struct.get(NumSDUnused$LAYOUT, NumSDUnused$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDUnused
     * }
     */
    public static void NumSDUnused(MemorySegment struct, long fieldValue) {
        struct.set(NumSDUnused$LAYOUT, NumSDUnused$OFFSET, fieldValue);
    }

    private static final OfLong NumSDTotal$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumSDTotal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDTotal
     * }
     */
    public static final OfLong NumSDTotal$layout() {
        return NumSDTotal$LAYOUT;
    }

    private static final long NumSDTotal$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDTotal
     * }
     */
    public static final long NumSDTotal$offset() {
        return NumSDTotal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDTotal
     * }
     */
    public static long NumSDTotal(MemorySegment struct) {
        return struct.get(NumSDTotal$LAYOUT, NumSDTotal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG NumSDTotal
     * }
     */
    public static void NumSDTotal(MemorySegment struct, long fieldValue) {
        struct.set(NumSDTotal$LAYOUT, NumSDTotal$OFFSET, fieldValue);
    }

    private static final OfLong NumMftSDChangedSuccess$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumMftSDChangedSuccess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDChangedSuccess
     * }
     */
    public static final OfLong NumMftSDChangedSuccess$layout() {
        return NumMftSDChangedSuccess$LAYOUT;
    }

    private static final long NumMftSDChangedSuccess$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDChangedSuccess
     * }
     */
    public static final long NumMftSDChangedSuccess$offset() {
        return NumMftSDChangedSuccess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDChangedSuccess
     * }
     */
    public static long NumMftSDChangedSuccess(MemorySegment struct) {
        return struct.get(NumMftSDChangedSuccess$LAYOUT, NumMftSDChangedSuccess$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDChangedSuccess
     * }
     */
    public static void NumMftSDChangedSuccess(MemorySegment struct, long fieldValue) {
        struct.set(NumMftSDChangedSuccess$LAYOUT, NumMftSDChangedSuccess$OFFSET, fieldValue);
    }

    private static final OfLong NumMftSDChangedFail$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumMftSDChangedFail"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDChangedFail
     * }
     */
    public static final OfLong NumMftSDChangedFail$layout() {
        return NumMftSDChangedFail$LAYOUT;
    }

    private static final long NumMftSDChangedFail$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDChangedFail
     * }
     */
    public static final long NumMftSDChangedFail$offset() {
        return NumMftSDChangedFail$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDChangedFail
     * }
     */
    public static long NumMftSDChangedFail(MemorySegment struct) {
        return struct.get(NumMftSDChangedFail$LAYOUT, NumMftSDChangedFail$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDChangedFail
     * }
     */
    public static void NumMftSDChangedFail(MemorySegment struct, long fieldValue) {
        struct.set(NumMftSDChangedFail$LAYOUT, NumMftSDChangedFail$OFFSET, fieldValue);
    }

    private static final OfLong NumMftSDTotal$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumMftSDTotal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDTotal
     * }
     */
    public static final OfLong NumMftSDTotal$layout() {
        return NumMftSDTotal$LAYOUT;
    }

    private static final long NumMftSDTotal$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDTotal
     * }
     */
    public static final long NumMftSDTotal$offset() {
        return NumMftSDTotal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDTotal
     * }
     */
    public static long NumMftSDTotal(MemorySegment struct) {
        return struct.get(NumMftSDTotal$LAYOUT, NumMftSDTotal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG NumMftSDTotal
     * }
     */
    public static void NumMftSDTotal(MemorySegment struct, long fieldValue) {
        struct.set(NumMftSDTotal$LAYOUT, NumMftSDTotal$OFFSET, fieldValue);
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
