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
 * struct tagTouchPredictionParameters {
 *     UINT cbSize;
 *     UINT dwLatency;
 *     UINT dwSampleTime;
 *     UINT bUseHWTimeStamp;
 * }
 * }
 */
public class tagTouchPredictionParameters {

    tagTouchPredictionParameters() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("cbSize"),
        Windows_h.C_INT.withName("dwLatency"),
        Windows_h.C_INT.withName("dwSampleTime"),
        Windows_h.C_INT.withName("bUseHWTimeStamp")
    ).withName("tagTouchPredictionParameters");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt dwLatency$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwLatency"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT dwLatency
     * }
     */
    public static final OfInt dwLatency$layout() {
        return dwLatency$LAYOUT;
    }

    private static final long dwLatency$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT dwLatency
     * }
     */
    public static final long dwLatency$offset() {
        return dwLatency$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT dwLatency
     * }
     */
    public static int dwLatency(MemorySegment struct) {
        return struct.get(dwLatency$LAYOUT, dwLatency$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT dwLatency
     * }
     */
    public static void dwLatency(MemorySegment struct, int fieldValue) {
        struct.set(dwLatency$LAYOUT, dwLatency$OFFSET, fieldValue);
    }

    private static final OfInt dwSampleTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSampleTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT dwSampleTime
     * }
     */
    public static final OfInt dwSampleTime$layout() {
        return dwSampleTime$LAYOUT;
    }

    private static final long dwSampleTime$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT dwSampleTime
     * }
     */
    public static final long dwSampleTime$offset() {
        return dwSampleTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT dwSampleTime
     * }
     */
    public static int dwSampleTime(MemorySegment struct) {
        return struct.get(dwSampleTime$LAYOUT, dwSampleTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT dwSampleTime
     * }
     */
    public static void dwSampleTime(MemorySegment struct, int fieldValue) {
        struct.set(dwSampleTime$LAYOUT, dwSampleTime$OFFSET, fieldValue);
    }

    private static final OfInt bUseHWTimeStamp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bUseHWTimeStamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT bUseHWTimeStamp
     * }
     */
    public static final OfInt bUseHWTimeStamp$layout() {
        return bUseHWTimeStamp$LAYOUT;
    }

    private static final long bUseHWTimeStamp$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT bUseHWTimeStamp
     * }
     */
    public static final long bUseHWTimeStamp$offset() {
        return bUseHWTimeStamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT bUseHWTimeStamp
     * }
     */
    public static int bUseHWTimeStamp(MemorySegment struct) {
        return struct.get(bUseHWTimeStamp$LAYOUT, bUseHWTimeStamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT bUseHWTimeStamp
     * }
     */
    public static void bUseHWTimeStamp(MemorySegment struct, int fieldValue) {
        struct.set(bUseHWTimeStamp$LAYOUT, bUseHWTimeStamp$OFFSET, fieldValue);
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

