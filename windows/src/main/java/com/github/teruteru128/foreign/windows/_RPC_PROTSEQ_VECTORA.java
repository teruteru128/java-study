// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * struct _RPC_PROTSEQ_VECTORA {
 *     unsigned int Count;
 *     unsigned char *Protseq[1];
 * }
 * }
 */
public class _RPC_PROTSEQ_VECTORA {

    _RPC_PROTSEQ_VECTORA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("Count"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(1, Windows_h.C_POINTER).withName("Protseq")
    ).withName("_RPC_PROTSEQ_VECTORA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int Count
     * }
     */
    public static final OfInt Count$layout() {
        return Count$LAYOUT;
    }

    private static final long Count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int Count
     * }
     */
    public static final long Count$offset() {
        return Count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int Count
     * }
     */
    public static int Count(MemorySegment struct) {
        return struct.get(Count$LAYOUT, Count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int Count
     * }
     */
    public static void Count(MemorySegment struct, int fieldValue) {
        struct.set(Count$LAYOUT, Count$OFFSET, fieldValue);
    }

    private static final SequenceLayout Protseq$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Protseq"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char *Protseq[1]
     * }
     */
    public static final SequenceLayout Protseq$layout() {
        return Protseq$LAYOUT;
    }

    private static final long Protseq$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char *Protseq[1]
     * }
     */
    public static final long Protseq$offset() {
        return Protseq$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char *Protseq[1]
     * }
     */
    public static MemorySegment Protseq(MemorySegment struct) {
        return struct.asSlice(Protseq$OFFSET, Protseq$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char *Protseq[1]
     * }
     */
    public static void Protseq(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Protseq$OFFSET, Protseq$LAYOUT.byteSize());
    }

    private static long[] Protseq$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char *Protseq[1]
     * }
     */
    public static long[] Protseq$dimensions() {
        return Protseq$DIMS;
    }
    private static final VarHandle Protseq$ELEM_HANDLE = Protseq$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char *Protseq[1]
     * }
     */
    public static MemorySegment Protseq(MemorySegment struct, long index0) {
        return (MemorySegment)Protseq$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char *Protseq[1]
     * }
     */
    public static void Protseq(MemorySegment struct, long index0, MemorySegment fieldValue) {
        Protseq$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
