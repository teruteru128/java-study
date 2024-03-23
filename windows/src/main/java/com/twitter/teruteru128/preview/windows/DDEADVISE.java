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
 * struct {
 *     unsigned short reserved : 14;
 *     unsigned short fDeferUpd : 1;
 *     unsigned short fAckReq : 1;
 *     short cfFormat;
 * }
 * }
 */
public class DDEADVISE {

    DDEADVISE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(2),
        Windows_h.C_SHORT.withName("cfFormat")
    ).withName("$anon$79:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort cfFormat$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cfFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short cfFormat
     * }
     */
    public static final OfShort cfFormat$layout() {
        return cfFormat$LAYOUT;
    }

    private static final long cfFormat$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short cfFormat
     * }
     */
    public static final long cfFormat$offset() {
        return cfFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short cfFormat
     * }
     */
    public static short cfFormat(MemorySegment struct) {
        return struct.get(cfFormat$LAYOUT, cfFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short cfFormat
     * }
     */
    public static void cfFormat(MemorySegment struct, short fieldValue) {
        struct.set(cfFormat$LAYOUT, cfFormat$OFFSET, fieldValue);
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

