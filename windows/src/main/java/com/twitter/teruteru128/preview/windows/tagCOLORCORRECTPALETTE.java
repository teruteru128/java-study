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
 * struct tagCOLORCORRECTPALETTE {
 *     EMR emr;
 *     DWORD ihPalette;
 *     DWORD nFirstEntry;
 *     DWORD nPalEntries;
 *     DWORD nReserved;
 * }
 * }
 */
public class tagCOLORCORRECTPALETTE {

    tagCOLORCORRECTPALETTE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        Windows_h.C_LONG.withName("ihPalette"),
        Windows_h.C_LONG.withName("nFirstEntry"),
        Windows_h.C_LONG.withName("nPalEntries"),
        Windows_h.C_LONG.withName("nReserved")
    ).withName("tagCOLORCORRECTPALETTE");

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

    private static final OfInt ihPalette$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ihPalette"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ihPalette
     * }
     */
    public static final OfInt ihPalette$layout() {
        return ihPalette$LAYOUT;
    }

    private static final long ihPalette$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ihPalette
     * }
     */
    public static final long ihPalette$offset() {
        return ihPalette$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ihPalette
     * }
     */
    public static int ihPalette(MemorySegment struct) {
        return struct.get(ihPalette$LAYOUT, ihPalette$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ihPalette
     * }
     */
    public static void ihPalette(MemorySegment struct, int fieldValue) {
        struct.set(ihPalette$LAYOUT, ihPalette$OFFSET, fieldValue);
    }

    private static final OfInt nFirstEntry$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nFirstEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nFirstEntry
     * }
     */
    public static final OfInt nFirstEntry$layout() {
        return nFirstEntry$LAYOUT;
    }

    private static final long nFirstEntry$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nFirstEntry
     * }
     */
    public static final long nFirstEntry$offset() {
        return nFirstEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nFirstEntry
     * }
     */
    public static int nFirstEntry(MemorySegment struct) {
        return struct.get(nFirstEntry$LAYOUT, nFirstEntry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nFirstEntry
     * }
     */
    public static void nFirstEntry(MemorySegment struct, int fieldValue) {
        struct.set(nFirstEntry$LAYOUT, nFirstEntry$OFFSET, fieldValue);
    }

    private static final OfInt nPalEntries$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nPalEntries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nPalEntries
     * }
     */
    public static final OfInt nPalEntries$layout() {
        return nPalEntries$LAYOUT;
    }

    private static final long nPalEntries$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nPalEntries
     * }
     */
    public static final long nPalEntries$offset() {
        return nPalEntries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nPalEntries
     * }
     */
    public static int nPalEntries(MemorySegment struct) {
        return struct.get(nPalEntries$LAYOUT, nPalEntries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nPalEntries
     * }
     */
    public static void nPalEntries(MemorySegment struct, int fieldValue) {
        struct.set(nPalEntries$LAYOUT, nPalEntries$OFFSET, fieldValue);
    }

    private static final OfInt nReserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nReserved
     * }
     */
    public static final OfInt nReserved$layout() {
        return nReserved$LAYOUT;
    }

    private static final long nReserved$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nReserved
     * }
     */
    public static final long nReserved$offset() {
        return nReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nReserved
     * }
     */
    public static int nReserved(MemorySegment struct) {
        return struct.get(nReserved$LAYOUT, nReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nReserved
     * }
     */
    public static void nReserved(MemorySegment struct, int fieldValue) {
        struct.set(nReserved$LAYOUT, nReserved$OFFSET, fieldValue);
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

