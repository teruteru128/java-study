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
 * struct tagBITMAPINFO {
 *     BITMAPINFOHEADER bmiHeader;
 *     RGBQUAD bmiColors[1];
 * }
 * }
 */
public class tagBITMAPINFO {

    tagBITMAPINFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagBITMAPINFOHEADER.layout().withName("bmiHeader"),
        MemoryLayout.sequenceLayout(1, tagRGBQUAD.layout()).withName("bmiColors")
    ).withName("tagBITMAPINFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout bmiHeader$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("bmiHeader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BITMAPINFOHEADER bmiHeader
     * }
     */
    public static final GroupLayout bmiHeader$layout() {
        return bmiHeader$LAYOUT;
    }

    private static final long bmiHeader$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BITMAPINFOHEADER bmiHeader
     * }
     */
    public static final long bmiHeader$offset() {
        return bmiHeader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BITMAPINFOHEADER bmiHeader
     * }
     */
    public static MemorySegment bmiHeader(MemorySegment struct) {
        return struct.asSlice(bmiHeader$OFFSET, bmiHeader$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BITMAPINFOHEADER bmiHeader
     * }
     */
    public static void bmiHeader(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bmiHeader$OFFSET, bmiHeader$LAYOUT.byteSize());
    }

    private static final SequenceLayout bmiColors$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("bmiColors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RGBQUAD bmiColors[1]
     * }
     */
    public static final SequenceLayout bmiColors$layout() {
        return bmiColors$LAYOUT;
    }

    private static final long bmiColors$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RGBQUAD bmiColors[1]
     * }
     */
    public static final long bmiColors$offset() {
        return bmiColors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RGBQUAD bmiColors[1]
     * }
     */
    public static MemorySegment bmiColors(MemorySegment struct) {
        return struct.asSlice(bmiColors$OFFSET, bmiColors$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RGBQUAD bmiColors[1]
     * }
     */
    public static void bmiColors(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bmiColors$OFFSET, bmiColors$LAYOUT.byteSize());
    }

    private static long[] bmiColors$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * RGBQUAD bmiColors[1]
     * }
     */
    public static long[] bmiColors$dimensions() {
        return bmiColors$DIMS;
    }
    private static final MethodHandle bmiColors$ELEM_HANDLE = bmiColors$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * RGBQUAD bmiColors[1]
     * }
     */
    public static MemorySegment bmiColors(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)bmiColors$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * RGBQUAD bmiColors[1]
     * }
     */
    public static void bmiColors(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, bmiColors(struct, index0), 0L, tagRGBQUAD.layout().byteSize());
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

