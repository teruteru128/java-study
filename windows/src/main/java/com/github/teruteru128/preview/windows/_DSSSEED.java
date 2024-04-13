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
 * struct _DSSSEED {
 *     DWORD counter;
 *     BYTE seed[20];
 * }
 * }
 */
public class _DSSSEED {

    _DSSSEED() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("counter"),
        MemoryLayout.sequenceLayout(20, Windows_h.C_CHAR).withName("seed")
    ).withName("_DSSSEED");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt counter$LAYOUT = (OfInt)$LAYOUT.select(groupElement("counter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD counter
     * }
     */
    public static final OfInt counter$layout() {
        return counter$LAYOUT;
    }

    private static final long counter$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD counter
     * }
     */
    public static final long counter$offset() {
        return counter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD counter
     * }
     */
    public static int counter(MemorySegment struct) {
        return struct.get(counter$LAYOUT, counter$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD counter
     * }
     */
    public static void counter(MemorySegment struct, int fieldValue) {
        struct.set(counter$LAYOUT, counter$OFFSET, fieldValue);
    }

    private static final SequenceLayout seed$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("seed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE seed[20]
     * }
     */
    public static final SequenceLayout seed$layout() {
        return seed$LAYOUT;
    }

    private static final long seed$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE seed[20]
     * }
     */
    public static final long seed$offset() {
        return seed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE seed[20]
     * }
     */
    public static MemorySegment seed(MemorySegment struct) {
        return struct.asSlice(seed$OFFSET, seed$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE seed[20]
     * }
     */
    public static void seed(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, seed$OFFSET, seed$LAYOUT.byteSize());
    }

    private static long[] seed$DIMS = { 20 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE seed[20]
     * }
     */
    public static long[] seed$dimensions() {
        return seed$DIMS;
    }
    private static final VarHandle seed$ELEM_HANDLE = seed$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE seed[20]
     * }
     */
    public static byte seed(MemorySegment struct, long index0) {
        return (byte)seed$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE seed[20]
     * }
     */
    public static void seed(MemorySegment struct, long index0, byte fieldValue) {
        seed$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
