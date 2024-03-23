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
 * struct tagEMREXTSELECTCLIPRGN {
 *     EMR emr;
 *     DWORD cbRgnData;
 *     DWORD iMode;
 *     BYTE RgnData[1];
 * }
 * }
 */
public class tagEMREXTSELECTCLIPRGN {

    tagEMREXTSELECTCLIPRGN() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        Windows_h.C_LONG.withName("cbRgnData"),
        Windows_h.C_LONG.withName("iMode"),
        MemoryLayout.sequenceLayout(1, Windows_h.C_CHAR).withName("RgnData"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagEMREXTSELECTCLIPRGN");

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

    private static final OfInt cbRgnData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbRgnData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbRgnData
     * }
     */
    public static final OfInt cbRgnData$layout() {
        return cbRgnData$LAYOUT;
    }

    private static final long cbRgnData$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbRgnData
     * }
     */
    public static final long cbRgnData$offset() {
        return cbRgnData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbRgnData
     * }
     */
    public static int cbRgnData(MemorySegment struct) {
        return struct.get(cbRgnData$LAYOUT, cbRgnData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbRgnData
     * }
     */
    public static void cbRgnData(MemorySegment struct, int fieldValue) {
        struct.set(cbRgnData$LAYOUT, cbRgnData$OFFSET, fieldValue);
    }

    private static final OfInt iMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD iMode
     * }
     */
    public static final OfInt iMode$layout() {
        return iMode$LAYOUT;
    }

    private static final long iMode$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD iMode
     * }
     */
    public static final long iMode$offset() {
        return iMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD iMode
     * }
     */
    public static int iMode(MemorySegment struct) {
        return struct.get(iMode$LAYOUT, iMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD iMode
     * }
     */
    public static void iMode(MemorySegment struct, int fieldValue) {
        struct.set(iMode$LAYOUT, iMode$OFFSET, fieldValue);
    }

    private static final SequenceLayout RgnData$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("RgnData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static final SequenceLayout RgnData$layout() {
        return RgnData$LAYOUT;
    }

    private static final long RgnData$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static final long RgnData$offset() {
        return RgnData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static MemorySegment RgnData(MemorySegment struct) {
        return struct.asSlice(RgnData$OFFSET, RgnData$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static void RgnData(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, RgnData$OFFSET, RgnData$LAYOUT.byteSize());
    }

    private static long[] RgnData$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static long[] RgnData$dimensions() {
        return RgnData$DIMS;
    }
    private static final VarHandle RgnData$ELEM_HANDLE = RgnData$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static byte RgnData(MemorySegment struct, long index0) {
        return (byte)RgnData$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static void RgnData(MemorySegment struct, long index0, byte fieldValue) {
        RgnData$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

