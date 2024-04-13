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
 * struct _GET_FILTER_FILE_IDENTIFIER_OUTPUT {
 *     WORD FilterFileIdentifierLength;
 *     BYTE FilterFileIdentifier[1];
 * }
 * }
 */
public class _GET_FILTER_FILE_IDENTIFIER_OUTPUT {

    _GET_FILTER_FILE_IDENTIFIER_OUTPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("FilterFileIdentifierLength"),
        MemoryLayout.sequenceLayout(1, Windows_h.C_CHAR).withName("FilterFileIdentifier"),
        MemoryLayout.paddingLayout(1)
    ).withName("_GET_FILTER_FILE_IDENTIFIER_OUTPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort FilterFileIdentifierLength$LAYOUT = (OfShort)$LAYOUT.select(groupElement("FilterFileIdentifierLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD FilterFileIdentifierLength
     * }
     */
    public static final OfShort FilterFileIdentifierLength$layout() {
        return FilterFileIdentifierLength$LAYOUT;
    }

    private static final long FilterFileIdentifierLength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD FilterFileIdentifierLength
     * }
     */
    public static final long FilterFileIdentifierLength$offset() {
        return FilterFileIdentifierLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD FilterFileIdentifierLength
     * }
     */
    public static short FilterFileIdentifierLength(MemorySegment struct) {
        return struct.get(FilterFileIdentifierLength$LAYOUT, FilterFileIdentifierLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD FilterFileIdentifierLength
     * }
     */
    public static void FilterFileIdentifierLength(MemorySegment struct, short fieldValue) {
        struct.set(FilterFileIdentifierLength$LAYOUT, FilterFileIdentifierLength$OFFSET, fieldValue);
    }

    private static final SequenceLayout FilterFileIdentifier$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FilterFileIdentifier"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE FilterFileIdentifier[1]
     * }
     */
    public static final SequenceLayout FilterFileIdentifier$layout() {
        return FilterFileIdentifier$LAYOUT;
    }

    private static final long FilterFileIdentifier$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE FilterFileIdentifier[1]
     * }
     */
    public static final long FilterFileIdentifier$offset() {
        return FilterFileIdentifier$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE FilterFileIdentifier[1]
     * }
     */
    public static MemorySegment FilterFileIdentifier(MemorySegment struct) {
        return struct.asSlice(FilterFileIdentifier$OFFSET, FilterFileIdentifier$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE FilterFileIdentifier[1]
     * }
     */
    public static void FilterFileIdentifier(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FilterFileIdentifier$OFFSET, FilterFileIdentifier$LAYOUT.byteSize());
    }

    private static long[] FilterFileIdentifier$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE FilterFileIdentifier[1]
     * }
     */
    public static long[] FilterFileIdentifier$dimensions() {
        return FilterFileIdentifier$DIMS;
    }
    private static final VarHandle FilterFileIdentifier$ELEM_HANDLE = FilterFileIdentifier$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE FilterFileIdentifier[1]
     * }
     */
    public static byte FilterFileIdentifier(MemorySegment struct, long index0) {
        return (byte)FilterFileIdentifier$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE FilterFileIdentifier[1]
     * }
     */
    public static void FilterFileIdentifier(MemorySegment struct, long index0, byte fieldValue) {
        FilterFileIdentifier$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
