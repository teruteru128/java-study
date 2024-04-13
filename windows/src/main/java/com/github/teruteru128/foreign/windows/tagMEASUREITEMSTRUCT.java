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
 * struct tagMEASUREITEMSTRUCT {
 *     UINT CtlType;
 *     UINT CtlID;
 *     UINT itemID;
 *     UINT itemWidth;
 *     UINT itemHeight;
 *     ULONG_PTR itemData;
 * }
 * }
 */
public class tagMEASUREITEMSTRUCT {

    tagMEASUREITEMSTRUCT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("CtlType"),
        Windows_h.C_INT.withName("CtlID"),
        Windows_h.C_INT.withName("itemID"),
        Windows_h.C_INT.withName("itemWidth"),
        Windows_h.C_INT.withName("itemHeight"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG_LONG.withName("itemData")
    ).withName("tagMEASUREITEMSTRUCT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt CtlType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CtlType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT CtlType
     * }
     */
    public static final OfInt CtlType$layout() {
        return CtlType$LAYOUT;
    }

    private static final long CtlType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT CtlType
     * }
     */
    public static final long CtlType$offset() {
        return CtlType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT CtlType
     * }
     */
    public static int CtlType(MemorySegment struct) {
        return struct.get(CtlType$LAYOUT, CtlType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT CtlType
     * }
     */
    public static void CtlType(MemorySegment struct, int fieldValue) {
        struct.set(CtlType$LAYOUT, CtlType$OFFSET, fieldValue);
    }

    private static final OfInt CtlID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CtlID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT CtlID
     * }
     */
    public static final OfInt CtlID$layout() {
        return CtlID$LAYOUT;
    }

    private static final long CtlID$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT CtlID
     * }
     */
    public static final long CtlID$offset() {
        return CtlID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT CtlID
     * }
     */
    public static int CtlID(MemorySegment struct) {
        return struct.get(CtlID$LAYOUT, CtlID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT CtlID
     * }
     */
    public static void CtlID(MemorySegment struct, int fieldValue) {
        struct.set(CtlID$LAYOUT, CtlID$OFFSET, fieldValue);
    }

    private static final OfInt itemID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("itemID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT itemID
     * }
     */
    public static final OfInt itemID$layout() {
        return itemID$LAYOUT;
    }

    private static final long itemID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT itemID
     * }
     */
    public static final long itemID$offset() {
        return itemID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT itemID
     * }
     */
    public static int itemID(MemorySegment struct) {
        return struct.get(itemID$LAYOUT, itemID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT itemID
     * }
     */
    public static void itemID(MemorySegment struct, int fieldValue) {
        struct.set(itemID$LAYOUT, itemID$OFFSET, fieldValue);
    }

    private static final OfInt itemWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("itemWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT itemWidth
     * }
     */
    public static final OfInt itemWidth$layout() {
        return itemWidth$LAYOUT;
    }

    private static final long itemWidth$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT itemWidth
     * }
     */
    public static final long itemWidth$offset() {
        return itemWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT itemWidth
     * }
     */
    public static int itemWidth(MemorySegment struct) {
        return struct.get(itemWidth$LAYOUT, itemWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT itemWidth
     * }
     */
    public static void itemWidth(MemorySegment struct, int fieldValue) {
        struct.set(itemWidth$LAYOUT, itemWidth$OFFSET, fieldValue);
    }

    private static final OfInt itemHeight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("itemHeight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT itemHeight
     * }
     */
    public static final OfInt itemHeight$layout() {
        return itemHeight$LAYOUT;
    }

    private static final long itemHeight$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT itemHeight
     * }
     */
    public static final long itemHeight$offset() {
        return itemHeight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT itemHeight
     * }
     */
    public static int itemHeight(MemorySegment struct) {
        return struct.get(itemHeight$LAYOUT, itemHeight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT itemHeight
     * }
     */
    public static void itemHeight(MemorySegment struct, int fieldValue) {
        struct.set(itemHeight$LAYOUT, itemHeight$OFFSET, fieldValue);
    }

    private static final OfLong itemData$LAYOUT = (OfLong)$LAYOUT.select(groupElement("itemData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR itemData
     * }
     */
    public static final OfLong itemData$layout() {
        return itemData$LAYOUT;
    }

    private static final long itemData$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR itemData
     * }
     */
    public static final long itemData$offset() {
        return itemData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR itemData
     * }
     */
    public static long itemData(MemorySegment struct) {
        return struct.get(itemData$LAYOUT, itemData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR itemData
     * }
     */
    public static void itemData(MemorySegment struct, long fieldValue) {
        struct.set(itemData$LAYOUT, itemData$OFFSET, fieldValue);
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
