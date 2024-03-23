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
 * union _STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE {
 *     struct {
 *         DWORD RetainAsynEvent : 1;
 *         DWORD LogSpecificField : 4;
 *         DWORD Reserved : 27;
 *     };
 *     DWORD AsUlong;
 * }
 * }
 */
public class _STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE {

    _STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(4)
        ).withName("$anon$2288:5"),
        Windows_h.C_LONG.withName("AsUlong")
    ).withName("_STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt AsUlong$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AsUlong"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AsUlong
     * }
     */
    public static final OfInt AsUlong$layout() {
        return AsUlong$LAYOUT;
    }

    private static final long AsUlong$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AsUlong
     * }
     */
    public static final long AsUlong$offset() {
        return AsUlong$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AsUlong
     * }
     */
    public static int AsUlong(MemorySegment union) {
        return union.get(AsUlong$LAYOUT, AsUlong$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AsUlong
     * }
     */
    public static void AsUlong(MemorySegment union, int fieldValue) {
        union.set(AsUlong$LAYOUT, AsUlong$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
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

