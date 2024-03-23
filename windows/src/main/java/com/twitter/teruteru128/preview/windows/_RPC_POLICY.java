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
 * struct _RPC_POLICY {
 *     unsigned int Length;
 *     unsigned long EndpointFlags;
 *     unsigned long NICFlags;
 * }
 * }
 */
public class _RPC_POLICY {

    _RPC_POLICY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("Length"),
        Windows_h.C_LONG.withName("EndpointFlags"),
        Windows_h.C_LONG.withName("NICFlags")
    ).withName("_RPC_POLICY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Length$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int Length
     * }
     */
    public static final OfInt Length$layout() {
        return Length$LAYOUT;
    }

    private static final long Length$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int Length
     * }
     */
    public static final long Length$offset() {
        return Length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int Length
     * }
     */
    public static int Length(MemorySegment struct) {
        return struct.get(Length$LAYOUT, Length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int Length
     * }
     */
    public static void Length(MemorySegment struct, int fieldValue) {
        struct.set(Length$LAYOUT, Length$OFFSET, fieldValue);
    }

    private static final OfInt EndpointFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EndpointFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long EndpointFlags
     * }
     */
    public static final OfInt EndpointFlags$layout() {
        return EndpointFlags$LAYOUT;
    }

    private static final long EndpointFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long EndpointFlags
     * }
     */
    public static final long EndpointFlags$offset() {
        return EndpointFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long EndpointFlags
     * }
     */
    public static int EndpointFlags(MemorySegment struct) {
        return struct.get(EndpointFlags$LAYOUT, EndpointFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long EndpointFlags
     * }
     */
    public static void EndpointFlags(MemorySegment struct, int fieldValue) {
        struct.set(EndpointFlags$LAYOUT, EndpointFlags$OFFSET, fieldValue);
    }

    private static final OfInt NICFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NICFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long NICFlags
     * }
     */
    public static final OfInt NICFlags$layout() {
        return NICFlags$LAYOUT;
    }

    private static final long NICFlags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long NICFlags
     * }
     */
    public static final long NICFlags$offset() {
        return NICFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long NICFlags
     * }
     */
    public static int NICFlags(MemorySegment struct) {
        return struct.get(NICFlags$LAYOUT, NICFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long NICFlags
     * }
     */
    public static void NICFlags(MemorySegment struct, int fieldValue) {
        struct.set(NICFlags$LAYOUT, NICFlags$OFFSET, fieldValue);
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

