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
 * struct _TAPE_SET_POSITION {
 *     DWORD Method;
 *     DWORD Partition;
 *     LARGE_INTEGER Offset;
 *     BOOLEAN Immediate;
 * }
 * }
 */
public class _TAPE_SET_POSITION {

    _TAPE_SET_POSITION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Method"),
        Windows_h.C_LONG.withName("Partition"),
        _LARGE_INTEGER.layout().withName("Offset"),
        Windows_h.C_CHAR.withName("Immediate"),
        MemoryLayout.paddingLayout(7)
    ).withName("_TAPE_SET_POSITION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Method$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Method"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Method
     * }
     */
    public static final OfInt Method$layout() {
        return Method$LAYOUT;
    }

    private static final long Method$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Method
     * }
     */
    public static final long Method$offset() {
        return Method$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Method
     * }
     */
    public static int Method(MemorySegment struct) {
        return struct.get(Method$LAYOUT, Method$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Method
     * }
     */
    public static void Method(MemorySegment struct, int fieldValue) {
        struct.set(Method$LAYOUT, Method$OFFSET, fieldValue);
    }

    private static final OfInt Partition$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Partition"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Partition
     * }
     */
    public static final OfInt Partition$layout() {
        return Partition$LAYOUT;
    }

    private static final long Partition$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Partition
     * }
     */
    public static final long Partition$offset() {
        return Partition$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Partition
     * }
     */
    public static int Partition(MemorySegment struct) {
        return struct.get(Partition$LAYOUT, Partition$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Partition
     * }
     */
    public static void Partition(MemorySegment struct, int fieldValue) {
        struct.set(Partition$LAYOUT, Partition$OFFSET, fieldValue);
    }

    private static final GroupLayout Offset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Offset
     * }
     */
    public static final GroupLayout Offset$layout() {
        return Offset$LAYOUT;
    }

    private static final long Offset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Offset
     * }
     */
    public static final long Offset$offset() {
        return Offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Offset
     * }
     */
    public static MemorySegment Offset(MemorySegment struct) {
        return struct.asSlice(Offset$OFFSET, Offset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Offset
     * }
     */
    public static void Offset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Offset$OFFSET, Offset$LAYOUT.byteSize());
    }

    private static final OfByte Immediate$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Immediate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN Immediate
     * }
     */
    public static final OfByte Immediate$layout() {
        return Immediate$LAYOUT;
    }

    private static final long Immediate$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN Immediate
     * }
     */
    public static final long Immediate$offset() {
        return Immediate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN Immediate
     * }
     */
    public static byte Immediate(MemorySegment struct) {
        return struct.get(Immediate$LAYOUT, Immediate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN Immediate
     * }
     */
    public static void Immediate(MemorySegment struct, byte fieldValue) {
        struct.set(Immediate$LAYOUT, Immediate$OFFSET, fieldValue);
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

