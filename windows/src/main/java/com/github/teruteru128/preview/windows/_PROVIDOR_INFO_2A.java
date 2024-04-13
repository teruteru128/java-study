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
 * struct _PROVIDOR_INFO_2A {
 *     LPSTR pOrder;
 * }
 * }
 */
public class _PROVIDOR_INFO_2A {

    _PROVIDOR_INFO_2A() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("pOrder")
    ).withName("_PROVIDOR_INFO_2A");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pOrder$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pOrder"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pOrder
     * }
     */
    public static final AddressLayout pOrder$layout() {
        return pOrder$LAYOUT;
    }

    private static final long pOrder$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pOrder
     * }
     */
    public static final long pOrder$offset() {
        return pOrder$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pOrder
     * }
     */
    public static MemorySegment pOrder(MemorySegment struct) {
        return struct.get(pOrder$LAYOUT, pOrder$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pOrder
     * }
     */
    public static void pOrder(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pOrder$LAYOUT, pOrder$OFFSET, fieldValue);
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
