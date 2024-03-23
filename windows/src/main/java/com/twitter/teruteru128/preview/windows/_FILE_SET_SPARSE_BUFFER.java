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
 * struct _FILE_SET_SPARSE_BUFFER {
 *     BOOLEAN SetSparse;
 * }
 * }
 */
public class _FILE_SET_SPARSE_BUFFER {

    _FILE_SET_SPARSE_BUFFER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_CHAR.withName("SetSparse")
    ).withName("_FILE_SET_SPARSE_BUFFER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte SetSparse$LAYOUT = (OfByte)$LAYOUT.select(groupElement("SetSparse"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN SetSparse
     * }
     */
    public static final OfByte SetSparse$layout() {
        return SetSparse$LAYOUT;
    }

    private static final long SetSparse$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN SetSparse
     * }
     */
    public static final long SetSparse$offset() {
        return SetSparse$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN SetSparse
     * }
     */
    public static byte SetSparse(MemorySegment struct) {
        return struct.get(SetSparse$LAYOUT, SetSparse$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN SetSparse
     * }
     */
    public static void SetSparse(MemorySegment struct, byte fieldValue) {
        struct.set(SetSparse$LAYOUT, SetSparse$OFFSET, fieldValue);
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

