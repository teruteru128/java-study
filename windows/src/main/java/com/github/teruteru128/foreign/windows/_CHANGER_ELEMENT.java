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
 * struct _CHANGER_ELEMENT {
 *     ELEMENT_TYPE ElementType;
 *     DWORD ElementAddress;
 * }
 * }
 */
public class _CHANGER_ELEMENT {

    _CHANGER_ELEMENT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("ElementType"),
        Windows_h.C_LONG.withName("ElementAddress")
    ).withName("_CHANGER_ELEMENT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ElementType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ElementType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ELEMENT_TYPE ElementType
     * }
     */
    public static final OfInt ElementType$layout() {
        return ElementType$LAYOUT;
    }

    private static final long ElementType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ELEMENT_TYPE ElementType
     * }
     */
    public static final long ElementType$offset() {
        return ElementType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ELEMENT_TYPE ElementType
     * }
     */
    public static int ElementType(MemorySegment struct) {
        return struct.get(ElementType$LAYOUT, ElementType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ELEMENT_TYPE ElementType
     * }
     */
    public static void ElementType(MemorySegment struct, int fieldValue) {
        struct.set(ElementType$LAYOUT, ElementType$OFFSET, fieldValue);
    }

    private static final OfInt ElementAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ElementAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ElementAddress
     * }
     */
    public static final OfInt ElementAddress$layout() {
        return ElementAddress$LAYOUT;
    }

    private static final long ElementAddress$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ElementAddress
     * }
     */
    public static final long ElementAddress$offset() {
        return ElementAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ElementAddress
     * }
     */
    public static int ElementAddress(MemorySegment struct) {
        return struct.get(ElementAddress$LAYOUT, ElementAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ElementAddress
     * }
     */
    public static void ElementAddress(MemorySegment struct, int fieldValue) {
        struct.set(ElementAddress$LAYOUT, ElementAddress$OFFSET, fieldValue);
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
