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
 * struct tagEMRCREATEMONOBRUSH {
 *     EMR emr;
 *     DWORD ihBrush;
 *     DWORD iUsage;
 *     DWORD offBmi;
 *     DWORD cbBmi;
 *     DWORD offBits;
 *     DWORD cbBits;
 * }
 * }
 */
public class tagEMRCREATEMONOBRUSH {

    tagEMRCREATEMONOBRUSH() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        Windows_h.C_LONG.withName("ihBrush"),
        Windows_h.C_LONG.withName("iUsage"),
        Windows_h.C_LONG.withName("offBmi"),
        Windows_h.C_LONG.withName("cbBmi"),
        Windows_h.C_LONG.withName("offBits"),
        Windows_h.C_LONG.withName("cbBits")
    ).withName("tagEMRCREATEMONOBRUSH");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout emr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("emr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final GroupLayout emr$layout() {
        return emr$LAYOUT;
    }

    private static final long emr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final long emr$offset() {
        return emr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static MemorySegment emr(MemorySegment struct) {
        return struct.asSlice(emr$OFFSET, emr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static void emr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emr$OFFSET, emr$LAYOUT.byteSize());
    }

    private static final OfInt ihBrush$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ihBrush"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static final OfInt ihBrush$layout() {
        return ihBrush$LAYOUT;
    }

    private static final long ihBrush$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static final long ihBrush$offset() {
        return ihBrush$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static int ihBrush(MemorySegment struct) {
        return struct.get(ihBrush$LAYOUT, ihBrush$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static void ihBrush(MemorySegment struct, int fieldValue) {
        struct.set(ihBrush$LAYOUT, ihBrush$OFFSET, fieldValue);
    }

    private static final OfInt iUsage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iUsage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD iUsage
     * }
     */
    public static final OfInt iUsage$layout() {
        return iUsage$LAYOUT;
    }

    private static final long iUsage$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD iUsage
     * }
     */
    public static final long iUsage$offset() {
        return iUsage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD iUsage
     * }
     */
    public static int iUsage(MemorySegment struct) {
        return struct.get(iUsage$LAYOUT, iUsage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD iUsage
     * }
     */
    public static void iUsage(MemorySegment struct, int fieldValue) {
        struct.set(iUsage$LAYOUT, iUsage$OFFSET, fieldValue);
    }

    private static final OfInt offBmi$LAYOUT = (OfInt)$LAYOUT.select(groupElement("offBmi"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD offBmi
     * }
     */
    public static final OfInt offBmi$layout() {
        return offBmi$LAYOUT;
    }

    private static final long offBmi$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD offBmi
     * }
     */
    public static final long offBmi$offset() {
        return offBmi$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD offBmi
     * }
     */
    public static int offBmi(MemorySegment struct) {
        return struct.get(offBmi$LAYOUT, offBmi$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD offBmi
     * }
     */
    public static void offBmi(MemorySegment struct, int fieldValue) {
        struct.set(offBmi$LAYOUT, offBmi$OFFSET, fieldValue);
    }

    private static final OfInt cbBmi$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbBmi"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbBmi
     * }
     */
    public static final OfInt cbBmi$layout() {
        return cbBmi$LAYOUT;
    }

    private static final long cbBmi$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbBmi
     * }
     */
    public static final long cbBmi$offset() {
        return cbBmi$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbBmi
     * }
     */
    public static int cbBmi(MemorySegment struct) {
        return struct.get(cbBmi$LAYOUT, cbBmi$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbBmi
     * }
     */
    public static void cbBmi(MemorySegment struct, int fieldValue) {
        struct.set(cbBmi$LAYOUT, cbBmi$OFFSET, fieldValue);
    }

    private static final OfInt offBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("offBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD offBits
     * }
     */
    public static final OfInt offBits$layout() {
        return offBits$LAYOUT;
    }

    private static final long offBits$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD offBits
     * }
     */
    public static final long offBits$offset() {
        return offBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD offBits
     * }
     */
    public static int offBits(MemorySegment struct) {
        return struct.get(offBits$LAYOUT, offBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD offBits
     * }
     */
    public static void offBits(MemorySegment struct, int fieldValue) {
        struct.set(offBits$LAYOUT, offBits$OFFSET, fieldValue);
    }

    private static final OfInt cbBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbBits
     * }
     */
    public static final OfInt cbBits$layout() {
        return cbBits$LAYOUT;
    }

    private static final long cbBits$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbBits
     * }
     */
    public static final long cbBits$offset() {
        return cbBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbBits
     * }
     */
    public static int cbBits(MemorySegment struct) {
        return struct.get(cbBits$LAYOUT, cbBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbBits
     * }
     */
    public static void cbBits(MemorySegment struct, int fieldValue) {
        struct.set(cbBits$LAYOUT, cbBits$OFFSET, fieldValue);
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

