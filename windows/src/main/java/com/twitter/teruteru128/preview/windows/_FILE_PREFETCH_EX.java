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
 * struct _FILE_PREFETCH_EX {
 *     DWORD Type;
 *     DWORD Count;
 *     PVOID Context;
 *     DWORDLONG Prefetch[1];
 * }
 * }
 */
public class _FILE_PREFETCH_EX {

    _FILE_PREFETCH_EX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Type"),
        Windows_h.C_LONG.withName("Count"),
        Windows_h.C_POINTER.withName("Context"),
        MemoryLayout.sequenceLayout(1, Windows_h.C_LONG_LONG).withName("Prefetch")
    ).withName("_FILE_PREFETCH_EX");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static final OfInt Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static int Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static void Type(MemorySegment struct, int fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    private static final OfInt Count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final OfInt Count$layout() {
        return Count$LAYOUT;
    }

    private static final long Count$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final long Count$offset() {
        return Count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static int Count(MemorySegment struct) {
        return struct.get(Count$LAYOUT, Count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static void Count(MemorySegment struct, int fieldValue) {
        struct.set(Count$LAYOUT, Count$OFFSET, fieldValue);
    }

    private static final AddressLayout Context$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Context"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID Context
     * }
     */
    public static final AddressLayout Context$layout() {
        return Context$LAYOUT;
    }

    private static final long Context$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID Context
     * }
     */
    public static final long Context$offset() {
        return Context$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID Context
     * }
     */
    public static MemorySegment Context(MemorySegment struct) {
        return struct.get(Context$LAYOUT, Context$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID Context
     * }
     */
    public static void Context(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Context$LAYOUT, Context$OFFSET, fieldValue);
    }

    private static final SequenceLayout Prefetch$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Prefetch"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG Prefetch[1]
     * }
     */
    public static final SequenceLayout Prefetch$layout() {
        return Prefetch$LAYOUT;
    }

    private static final long Prefetch$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG Prefetch[1]
     * }
     */
    public static final long Prefetch$offset() {
        return Prefetch$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG Prefetch[1]
     * }
     */
    public static MemorySegment Prefetch(MemorySegment struct) {
        return struct.asSlice(Prefetch$OFFSET, Prefetch$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG Prefetch[1]
     * }
     */
    public static void Prefetch(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Prefetch$OFFSET, Prefetch$LAYOUT.byteSize());
    }

    private static long[] Prefetch$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORDLONG Prefetch[1]
     * }
     */
    public static long[] Prefetch$dimensions() {
        return Prefetch$DIMS;
    }
    private static final VarHandle Prefetch$ELEM_HANDLE = Prefetch$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORDLONG Prefetch[1]
     * }
     */
    public static long Prefetch(MemorySegment struct, long index0) {
        return (long)Prefetch$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORDLONG Prefetch[1]
     * }
     */
    public static void Prefetch(MemorySegment struct, long index0, long fieldValue) {
        Prefetch$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

