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
 * struct _MEM_ADDRESS_REQUIREMENTS {
 *     PVOID LowestStartingAddress;
 *     PVOID HighestEndingAddress;
 *     SIZE_T Alignment;
 * }
 * }
 */
public class _MEM_ADDRESS_REQUIREMENTS {

    _MEM_ADDRESS_REQUIREMENTS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("LowestStartingAddress"),
        Windows_h.C_POINTER.withName("HighestEndingAddress"),
        Windows_h.C_LONG_LONG.withName("Alignment")
    ).withName("_MEM_ADDRESS_REQUIREMENTS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout LowestStartingAddress$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("LowestStartingAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID LowestStartingAddress
     * }
     */
    public static final AddressLayout LowestStartingAddress$layout() {
        return LowestStartingAddress$LAYOUT;
    }

    private static final long LowestStartingAddress$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID LowestStartingAddress
     * }
     */
    public static final long LowestStartingAddress$offset() {
        return LowestStartingAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID LowestStartingAddress
     * }
     */
    public static MemorySegment LowestStartingAddress(MemorySegment struct) {
        return struct.get(LowestStartingAddress$LAYOUT, LowestStartingAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID LowestStartingAddress
     * }
     */
    public static void LowestStartingAddress(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(LowestStartingAddress$LAYOUT, LowestStartingAddress$OFFSET, fieldValue);
    }

    private static final AddressLayout HighestEndingAddress$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("HighestEndingAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID HighestEndingAddress
     * }
     */
    public static final AddressLayout HighestEndingAddress$layout() {
        return HighestEndingAddress$LAYOUT;
    }

    private static final long HighestEndingAddress$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID HighestEndingAddress
     * }
     */
    public static final long HighestEndingAddress$offset() {
        return HighestEndingAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID HighestEndingAddress
     * }
     */
    public static MemorySegment HighestEndingAddress(MemorySegment struct) {
        return struct.get(HighestEndingAddress$LAYOUT, HighestEndingAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID HighestEndingAddress
     * }
     */
    public static void HighestEndingAddress(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(HighestEndingAddress$LAYOUT, HighestEndingAddress$OFFSET, fieldValue);
    }

    private static final OfLong Alignment$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Alignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T Alignment
     * }
     */
    public static final OfLong Alignment$layout() {
        return Alignment$LAYOUT;
    }

    private static final long Alignment$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T Alignment
     * }
     */
    public static final long Alignment$offset() {
        return Alignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T Alignment
     * }
     */
    public static long Alignment(MemorySegment struct) {
        return struct.get(Alignment$LAYOUT, Alignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T Alignment
     * }
     */
    public static void Alignment(MemorySegment struct, long fieldValue) {
        struct.set(Alignment$LAYOUT, Alignment$OFFSET, fieldValue);
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
