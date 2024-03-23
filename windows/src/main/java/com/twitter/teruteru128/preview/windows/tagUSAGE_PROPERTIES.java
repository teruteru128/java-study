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
 * struct tagUSAGE_PROPERTIES {
 *     USHORT level;
 *     USHORT page;
 *     USHORT usage;
 *     INT32 logicalMinimum;
 *     INT32 logicalMaximum;
 *     USHORT unit;
 *     USHORT exponent;
 *     BYTE count;
 *     INT32 physicalMinimum;
 *     INT32 physicalMaximum;
 * }
 * }
 */
public class tagUSAGE_PROPERTIES {

    tagUSAGE_PROPERTIES() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("level"),
        Windows_h.C_SHORT.withName("page"),
        Windows_h.C_SHORT.withName("usage"),
        MemoryLayout.paddingLayout(2),
        Windows_h.C_INT.withName("logicalMinimum"),
        Windows_h.C_INT.withName("logicalMaximum"),
        Windows_h.C_SHORT.withName("unit"),
        Windows_h.C_SHORT.withName("exponent"),
        Windows_h.C_CHAR.withName("count"),
        MemoryLayout.paddingLayout(3),
        Windows_h.C_INT.withName("physicalMinimum"),
        Windows_h.C_INT.withName("physicalMaximum")
    ).withName("tagUSAGE_PROPERTIES");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort level$LAYOUT = (OfShort)$LAYOUT.select(groupElement("level"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT level
     * }
     */
    public static final OfShort level$layout() {
        return level$LAYOUT;
    }

    private static final long level$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT level
     * }
     */
    public static final long level$offset() {
        return level$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT level
     * }
     */
    public static short level(MemorySegment struct) {
        return struct.get(level$LAYOUT, level$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT level
     * }
     */
    public static void level(MemorySegment struct, short fieldValue) {
        struct.set(level$LAYOUT, level$OFFSET, fieldValue);
    }

    private static final OfShort page$LAYOUT = (OfShort)$LAYOUT.select(groupElement("page"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT page
     * }
     */
    public static final OfShort page$layout() {
        return page$LAYOUT;
    }

    private static final long page$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT page
     * }
     */
    public static final long page$offset() {
        return page$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT page
     * }
     */
    public static short page(MemorySegment struct) {
        return struct.get(page$LAYOUT, page$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT page
     * }
     */
    public static void page(MemorySegment struct, short fieldValue) {
        struct.set(page$LAYOUT, page$OFFSET, fieldValue);
    }

    private static final OfShort usage$LAYOUT = (OfShort)$LAYOUT.select(groupElement("usage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT usage
     * }
     */
    public static final OfShort usage$layout() {
        return usage$LAYOUT;
    }

    private static final long usage$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT usage
     * }
     */
    public static final long usage$offset() {
        return usage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT usage
     * }
     */
    public static short usage(MemorySegment struct) {
        return struct.get(usage$LAYOUT, usage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT usage
     * }
     */
    public static void usage(MemorySegment struct, short fieldValue) {
        struct.set(usage$LAYOUT, usage$OFFSET, fieldValue);
    }

    private static final OfInt logicalMinimum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("logicalMinimum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT32 logicalMinimum
     * }
     */
    public static final OfInt logicalMinimum$layout() {
        return logicalMinimum$LAYOUT;
    }

    private static final long logicalMinimum$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT32 logicalMinimum
     * }
     */
    public static final long logicalMinimum$offset() {
        return logicalMinimum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT32 logicalMinimum
     * }
     */
    public static int logicalMinimum(MemorySegment struct) {
        return struct.get(logicalMinimum$LAYOUT, logicalMinimum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT32 logicalMinimum
     * }
     */
    public static void logicalMinimum(MemorySegment struct, int fieldValue) {
        struct.set(logicalMinimum$LAYOUT, logicalMinimum$OFFSET, fieldValue);
    }

    private static final OfInt logicalMaximum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("logicalMaximum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT32 logicalMaximum
     * }
     */
    public static final OfInt logicalMaximum$layout() {
        return logicalMaximum$LAYOUT;
    }

    private static final long logicalMaximum$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT32 logicalMaximum
     * }
     */
    public static final long logicalMaximum$offset() {
        return logicalMaximum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT32 logicalMaximum
     * }
     */
    public static int logicalMaximum(MemorySegment struct) {
        return struct.get(logicalMaximum$LAYOUT, logicalMaximum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT32 logicalMaximum
     * }
     */
    public static void logicalMaximum(MemorySegment struct, int fieldValue) {
        struct.set(logicalMaximum$LAYOUT, logicalMaximum$OFFSET, fieldValue);
    }

    private static final OfShort unit$LAYOUT = (OfShort)$LAYOUT.select(groupElement("unit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT unit
     * }
     */
    public static final OfShort unit$layout() {
        return unit$LAYOUT;
    }

    private static final long unit$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT unit
     * }
     */
    public static final long unit$offset() {
        return unit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT unit
     * }
     */
    public static short unit(MemorySegment struct) {
        return struct.get(unit$LAYOUT, unit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT unit
     * }
     */
    public static void unit(MemorySegment struct, short fieldValue) {
        struct.set(unit$LAYOUT, unit$OFFSET, fieldValue);
    }

    private static final OfShort exponent$LAYOUT = (OfShort)$LAYOUT.select(groupElement("exponent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT exponent
     * }
     */
    public static final OfShort exponent$layout() {
        return exponent$LAYOUT;
    }

    private static final long exponent$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT exponent
     * }
     */
    public static final long exponent$offset() {
        return exponent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT exponent
     * }
     */
    public static short exponent(MemorySegment struct) {
        return struct.get(exponent$LAYOUT, exponent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT exponent
     * }
     */
    public static void exponent(MemorySegment struct, short fieldValue) {
        struct.set(exponent$LAYOUT, exponent$OFFSET, fieldValue);
    }

    private static final OfByte count$LAYOUT = (OfByte)$LAYOUT.select(groupElement("count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE count
     * }
     */
    public static final OfByte count$layout() {
        return count$LAYOUT;
    }

    private static final long count$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE count
     * }
     */
    public static final long count$offset() {
        return count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE count
     * }
     */
    public static byte count(MemorySegment struct) {
        return struct.get(count$LAYOUT, count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE count
     * }
     */
    public static void count(MemorySegment struct, byte fieldValue) {
        struct.set(count$LAYOUT, count$OFFSET, fieldValue);
    }

    private static final OfInt physicalMinimum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("physicalMinimum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT32 physicalMinimum
     * }
     */
    public static final OfInt physicalMinimum$layout() {
        return physicalMinimum$LAYOUT;
    }

    private static final long physicalMinimum$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT32 physicalMinimum
     * }
     */
    public static final long physicalMinimum$offset() {
        return physicalMinimum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT32 physicalMinimum
     * }
     */
    public static int physicalMinimum(MemorySegment struct) {
        return struct.get(physicalMinimum$LAYOUT, physicalMinimum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT32 physicalMinimum
     * }
     */
    public static void physicalMinimum(MemorySegment struct, int fieldValue) {
        struct.set(physicalMinimum$LAYOUT, physicalMinimum$OFFSET, fieldValue);
    }

    private static final OfInt physicalMaximum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("physicalMaximum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT32 physicalMaximum
     * }
     */
    public static final OfInt physicalMaximum$layout() {
        return physicalMaximum$LAYOUT;
    }

    private static final long physicalMaximum$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT32 physicalMaximum
     * }
     */
    public static final long physicalMaximum$offset() {
        return physicalMaximum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT32 physicalMaximum
     * }
     */
    public static int physicalMaximum(MemorySegment struct) {
        return struct.get(physicalMaximum$LAYOUT, physicalMaximum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT32 physicalMaximum
     * }
     */
    public static void physicalMaximum(MemorySegment struct, int fieldValue) {
        struct.set(physicalMaximum$LAYOUT, physicalMaximum$OFFSET, fieldValue);
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

