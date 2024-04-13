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
 * struct tagCURSORSHAPE {
 *     int xHotSpot;
 *     int yHotSpot;
 *     int cx;
 *     int cy;
 *     int cbWidth;
 *     BYTE Planes;
 *     BYTE BitsPixel;
 * }
 * }
 */
public class tagCURSORSHAPE {

    tagCURSORSHAPE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("xHotSpot"),
        Windows_h.C_INT.withName("yHotSpot"),
        Windows_h.C_INT.withName("cx"),
        Windows_h.C_INT.withName("cy"),
        Windows_h.C_INT.withName("cbWidth"),
        Windows_h.C_CHAR.withName("Planes"),
        Windows_h.C_CHAR.withName("BitsPixel"),
        MemoryLayout.paddingLayout(2)
    ).withName("tagCURSORSHAPE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt xHotSpot$LAYOUT = (OfInt)$LAYOUT.select(groupElement("xHotSpot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int xHotSpot
     * }
     */
    public static final OfInt xHotSpot$layout() {
        return xHotSpot$LAYOUT;
    }

    private static final long xHotSpot$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int xHotSpot
     * }
     */
    public static final long xHotSpot$offset() {
        return xHotSpot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int xHotSpot
     * }
     */
    public static int xHotSpot(MemorySegment struct) {
        return struct.get(xHotSpot$LAYOUT, xHotSpot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int xHotSpot
     * }
     */
    public static void xHotSpot(MemorySegment struct, int fieldValue) {
        struct.set(xHotSpot$LAYOUT, xHotSpot$OFFSET, fieldValue);
    }

    private static final OfInt yHotSpot$LAYOUT = (OfInt)$LAYOUT.select(groupElement("yHotSpot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int yHotSpot
     * }
     */
    public static final OfInt yHotSpot$layout() {
        return yHotSpot$LAYOUT;
    }

    private static final long yHotSpot$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int yHotSpot
     * }
     */
    public static final long yHotSpot$offset() {
        return yHotSpot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int yHotSpot
     * }
     */
    public static int yHotSpot(MemorySegment struct) {
        return struct.get(yHotSpot$LAYOUT, yHotSpot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int yHotSpot
     * }
     */
    public static void yHotSpot(MemorySegment struct, int fieldValue) {
        struct.set(yHotSpot$LAYOUT, yHotSpot$OFFSET, fieldValue);
    }

    private static final OfInt cx$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static final OfInt cx$layout() {
        return cx$LAYOUT;
    }

    private static final long cx$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static final long cx$offset() {
        return cx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static int cx(MemorySegment struct) {
        return struct.get(cx$LAYOUT, cx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static void cx(MemorySegment struct, int fieldValue) {
        struct.set(cx$LAYOUT, cx$OFFSET, fieldValue);
    }

    private static final OfInt cy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static final OfInt cy$layout() {
        return cy$LAYOUT;
    }

    private static final long cy$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static final long cy$offset() {
        return cy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static int cy(MemorySegment struct) {
        return struct.get(cy$LAYOUT, cy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static void cy(MemorySegment struct, int fieldValue) {
        struct.set(cy$LAYOUT, cy$OFFSET, fieldValue);
    }

    private static final OfInt cbWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cbWidth
     * }
     */
    public static final OfInt cbWidth$layout() {
        return cbWidth$LAYOUT;
    }

    private static final long cbWidth$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cbWidth
     * }
     */
    public static final long cbWidth$offset() {
        return cbWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cbWidth
     * }
     */
    public static int cbWidth(MemorySegment struct) {
        return struct.get(cbWidth$LAYOUT, cbWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cbWidth
     * }
     */
    public static void cbWidth(MemorySegment struct, int fieldValue) {
        struct.set(cbWidth$LAYOUT, cbWidth$OFFSET, fieldValue);
    }

    private static final OfByte Planes$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Planes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Planes
     * }
     */
    public static final OfByte Planes$layout() {
        return Planes$LAYOUT;
    }

    private static final long Planes$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Planes
     * }
     */
    public static final long Planes$offset() {
        return Planes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Planes
     * }
     */
    public static byte Planes(MemorySegment struct) {
        return struct.get(Planes$LAYOUT, Planes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Planes
     * }
     */
    public static void Planes(MemorySegment struct, byte fieldValue) {
        struct.set(Planes$LAYOUT, Planes$OFFSET, fieldValue);
    }

    private static final OfByte BitsPixel$LAYOUT = (OfByte)$LAYOUT.select(groupElement("BitsPixel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE BitsPixel
     * }
     */
    public static final OfByte BitsPixel$layout() {
        return BitsPixel$LAYOUT;
    }

    private static final long BitsPixel$OFFSET = 21;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE BitsPixel
     * }
     */
    public static final long BitsPixel$offset() {
        return BitsPixel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE BitsPixel
     * }
     */
    public static byte BitsPixel(MemorySegment struct) {
        return struct.get(BitsPixel$LAYOUT, BitsPixel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE BitsPixel
     * }
     */
    public static void BitsPixel(MemorySegment struct, byte fieldValue) {
        struct.set(BitsPixel$LAYOUT, BitsPixel$OFFSET, fieldValue);
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
