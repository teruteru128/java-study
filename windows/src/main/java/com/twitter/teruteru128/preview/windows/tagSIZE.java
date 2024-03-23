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
 * struct tagSIZE {
 *     LONG cx;
 *     LONG cy;
 * }
 * }
 */
public class tagSIZE {

    tagSIZE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cx"),
        Windows_h.C_LONG.withName("cy")
    ).withName("tagSIZE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cx$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG cx
     * }
     */
    public static final OfInt cx$layout() {
        return cx$LAYOUT;
    }

    private static final long cx$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG cx
     * }
     */
    public static final long cx$offset() {
        return cx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG cx
     * }
     */
    public static int cx(MemorySegment struct) {
        return struct.get(cx$LAYOUT, cx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG cx
     * }
     */
    public static void cx(MemorySegment struct, int fieldValue) {
        struct.set(cx$LAYOUT, cx$OFFSET, fieldValue);
    }

    private static final OfInt cy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG cy
     * }
     */
    public static final OfInt cy$layout() {
        return cy$LAYOUT;
    }

    private static final long cy$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG cy
     * }
     */
    public static final long cy$offset() {
        return cy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG cy
     * }
     */
    public static int cy(MemorySegment struct) {
        return struct.get(cy$LAYOUT, cy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG cy
     * }
     */
    public static void cy(MemorySegment struct, int fieldValue) {
        struct.set(cy$LAYOUT, cy$OFFSET, fieldValue);
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

