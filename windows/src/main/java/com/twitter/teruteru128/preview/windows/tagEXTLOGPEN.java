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
 * struct tagEXTLOGPEN {
 *     DWORD elpPenStyle;
 *     DWORD elpWidth;
 *     UINT elpBrushStyle;
 *     COLORREF elpColor;
 *     ULONG_PTR elpHatch;
 *     DWORD elpNumEntries;
 *     DWORD elpStyleEntry[1];
 * }
 * }
 */
public class tagEXTLOGPEN {

    tagEXTLOGPEN() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("elpPenStyle"),
        Windows_h.C_LONG.withName("elpWidth"),
        Windows_h.C_INT.withName("elpBrushStyle"),
        Windows_h.C_LONG.withName("elpColor"),
        Windows_h.C_LONG_LONG.withName("elpHatch"),
        Windows_h.C_LONG.withName("elpNumEntries"),
        MemoryLayout.sequenceLayout(1, Windows_h.C_LONG).withName("elpStyleEntry")
    ).withName("tagEXTLOGPEN");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt elpPenStyle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("elpPenStyle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD elpPenStyle
     * }
     */
    public static final OfInt elpPenStyle$layout() {
        return elpPenStyle$LAYOUT;
    }

    private static final long elpPenStyle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD elpPenStyle
     * }
     */
    public static final long elpPenStyle$offset() {
        return elpPenStyle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD elpPenStyle
     * }
     */
    public static int elpPenStyle(MemorySegment struct) {
        return struct.get(elpPenStyle$LAYOUT, elpPenStyle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD elpPenStyle
     * }
     */
    public static void elpPenStyle(MemorySegment struct, int fieldValue) {
        struct.set(elpPenStyle$LAYOUT, elpPenStyle$OFFSET, fieldValue);
    }

    private static final OfInt elpWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("elpWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD elpWidth
     * }
     */
    public static final OfInt elpWidth$layout() {
        return elpWidth$LAYOUT;
    }

    private static final long elpWidth$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD elpWidth
     * }
     */
    public static final long elpWidth$offset() {
        return elpWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD elpWidth
     * }
     */
    public static int elpWidth(MemorySegment struct) {
        return struct.get(elpWidth$LAYOUT, elpWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD elpWidth
     * }
     */
    public static void elpWidth(MemorySegment struct, int fieldValue) {
        struct.set(elpWidth$LAYOUT, elpWidth$OFFSET, fieldValue);
    }

    private static final OfInt elpBrushStyle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("elpBrushStyle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT elpBrushStyle
     * }
     */
    public static final OfInt elpBrushStyle$layout() {
        return elpBrushStyle$LAYOUT;
    }

    private static final long elpBrushStyle$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT elpBrushStyle
     * }
     */
    public static final long elpBrushStyle$offset() {
        return elpBrushStyle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT elpBrushStyle
     * }
     */
    public static int elpBrushStyle(MemorySegment struct) {
        return struct.get(elpBrushStyle$LAYOUT, elpBrushStyle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT elpBrushStyle
     * }
     */
    public static void elpBrushStyle(MemorySegment struct, int fieldValue) {
        struct.set(elpBrushStyle$LAYOUT, elpBrushStyle$OFFSET, fieldValue);
    }

    private static final OfInt elpColor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("elpColor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * COLORREF elpColor
     * }
     */
    public static final OfInt elpColor$layout() {
        return elpColor$LAYOUT;
    }

    private static final long elpColor$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * COLORREF elpColor
     * }
     */
    public static final long elpColor$offset() {
        return elpColor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * COLORREF elpColor
     * }
     */
    public static int elpColor(MemorySegment struct) {
        return struct.get(elpColor$LAYOUT, elpColor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * COLORREF elpColor
     * }
     */
    public static void elpColor(MemorySegment struct, int fieldValue) {
        struct.set(elpColor$LAYOUT, elpColor$OFFSET, fieldValue);
    }

    private static final OfLong elpHatch$LAYOUT = (OfLong)$LAYOUT.select(groupElement("elpHatch"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR elpHatch
     * }
     */
    public static final OfLong elpHatch$layout() {
        return elpHatch$LAYOUT;
    }

    private static final long elpHatch$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR elpHatch
     * }
     */
    public static final long elpHatch$offset() {
        return elpHatch$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR elpHatch
     * }
     */
    public static long elpHatch(MemorySegment struct) {
        return struct.get(elpHatch$LAYOUT, elpHatch$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR elpHatch
     * }
     */
    public static void elpHatch(MemorySegment struct, long fieldValue) {
        struct.set(elpHatch$LAYOUT, elpHatch$OFFSET, fieldValue);
    }

    private static final OfInt elpNumEntries$LAYOUT = (OfInt)$LAYOUT.select(groupElement("elpNumEntries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD elpNumEntries
     * }
     */
    public static final OfInt elpNumEntries$layout() {
        return elpNumEntries$LAYOUT;
    }

    private static final long elpNumEntries$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD elpNumEntries
     * }
     */
    public static final long elpNumEntries$offset() {
        return elpNumEntries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD elpNumEntries
     * }
     */
    public static int elpNumEntries(MemorySegment struct) {
        return struct.get(elpNumEntries$LAYOUT, elpNumEntries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD elpNumEntries
     * }
     */
    public static void elpNumEntries(MemorySegment struct, int fieldValue) {
        struct.set(elpNumEntries$LAYOUT, elpNumEntries$OFFSET, fieldValue);
    }

    private static final SequenceLayout elpStyleEntry$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("elpStyleEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD elpStyleEntry[1]
     * }
     */
    public static final SequenceLayout elpStyleEntry$layout() {
        return elpStyleEntry$LAYOUT;
    }

    private static final long elpStyleEntry$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD elpStyleEntry[1]
     * }
     */
    public static final long elpStyleEntry$offset() {
        return elpStyleEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD elpStyleEntry[1]
     * }
     */
    public static MemorySegment elpStyleEntry(MemorySegment struct) {
        return struct.asSlice(elpStyleEntry$OFFSET, elpStyleEntry$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD elpStyleEntry[1]
     * }
     */
    public static void elpStyleEntry(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, elpStyleEntry$OFFSET, elpStyleEntry$LAYOUT.byteSize());
    }

    private static long[] elpStyleEntry$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD elpStyleEntry[1]
     * }
     */
    public static long[] elpStyleEntry$dimensions() {
        return elpStyleEntry$DIMS;
    }
    private static final VarHandle elpStyleEntry$ELEM_HANDLE = elpStyleEntry$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD elpStyleEntry[1]
     * }
     */
    public static int elpStyleEntry(MemorySegment struct, long index0) {
        return (int)elpStyleEntry$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD elpStyleEntry[1]
     * }
     */
    public static void elpStyleEntry(MemorySegment struct, long index0, int fieldValue) {
        elpStyleEntry$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

