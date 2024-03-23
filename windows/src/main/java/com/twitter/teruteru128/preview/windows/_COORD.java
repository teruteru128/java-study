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
 * struct _COORD {
 *     SHORT X;
 *     SHORT Y;
 * }
 * }
 */
public class _COORD {

    _COORD() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("X"),
        Windows_h.C_SHORT.withName("Y")
    ).withName("_COORD");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort X$LAYOUT = (OfShort)$LAYOUT.select(groupElement("X"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SHORT X
     * }
     */
    public static final OfShort X$layout() {
        return X$LAYOUT;
    }

    private static final long X$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SHORT X
     * }
     */
    public static final long X$offset() {
        return X$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SHORT X
     * }
     */
    public static short X(MemorySegment struct) {
        return struct.get(X$LAYOUT, X$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SHORT X
     * }
     */
    public static void X(MemorySegment struct, short fieldValue) {
        struct.set(X$LAYOUT, X$OFFSET, fieldValue);
    }

    private static final OfShort Y$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SHORT Y
     * }
     */
    public static final OfShort Y$layout() {
        return Y$LAYOUT;
    }

    private static final long Y$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SHORT Y
     * }
     */
    public static final long Y$offset() {
        return Y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SHORT Y
     * }
     */
    public static short Y(MemorySegment struct) {
        return struct.get(Y$LAYOUT, Y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SHORT Y
     * }
     */
    public static void Y(MemorySegment struct, short fieldValue) {
        struct.set(Y$LAYOUT, Y$OFFSET, fieldValue);
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

