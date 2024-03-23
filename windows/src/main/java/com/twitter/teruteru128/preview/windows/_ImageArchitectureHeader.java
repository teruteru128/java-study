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
 * struct _ImageArchitectureHeader {
 *     unsigned int AmaskValue : 1;
 *     int : 7;
 *     unsigned int AmaskShift : 8;
 *     int : 16;
 *     DWORD FirstEntryRVA;
 * }
 * }
 */
public class _ImageArchitectureHeader {

    _ImageArchitectureHeader() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG.withName("FirstEntryRVA")
    ).withName("_ImageArchitectureHeader");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt FirstEntryRVA$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FirstEntryRVA"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FirstEntryRVA
     * }
     */
    public static final OfInt FirstEntryRVA$layout() {
        return FirstEntryRVA$LAYOUT;
    }

    private static final long FirstEntryRVA$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FirstEntryRVA
     * }
     */
    public static final long FirstEntryRVA$offset() {
        return FirstEntryRVA$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FirstEntryRVA
     * }
     */
    public static int FirstEntryRVA(MemorySegment struct) {
        return struct.get(FirstEntryRVA$LAYOUT, FirstEntryRVA$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FirstEntryRVA
     * }
     */
    public static void FirstEntryRVA(MemorySegment struct, int fieldValue) {
        struct.set(FirstEntryRVA$LAYOUT, FirstEntryRVA$OFFSET, fieldValue);
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

