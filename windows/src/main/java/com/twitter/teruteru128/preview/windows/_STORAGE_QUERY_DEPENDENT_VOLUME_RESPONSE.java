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
 * struct _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE {
 *     DWORD ResponseLevel;
 *     DWORD NumberEntries;
 *     union {
 *         STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY Lev1Depends[];
 *         STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY Lev2Depends[];
 *     };
 * }
 * }
 */
public class _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE {

    _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("ResponseLevel"),
        Windows_h.C_LONG.withName("NumberEntries"),
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(0, _STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY.layout()).withName("Lev1Depends"),
            MemoryLayout.sequenceLayout(0, _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.layout()).withName("Lev2Depends"),
            MemoryLayout.paddingLayout(4)
        ).withName("$anon$14118:5")
    ).withName("_STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ResponseLevel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ResponseLevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ResponseLevel
     * }
     */
    public static final OfInt ResponseLevel$layout() {
        return ResponseLevel$LAYOUT;
    }

    private static final long ResponseLevel$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ResponseLevel
     * }
     */
    public static final long ResponseLevel$offset() {
        return ResponseLevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ResponseLevel
     * }
     */
    public static int ResponseLevel(MemorySegment struct) {
        return struct.get(ResponseLevel$LAYOUT, ResponseLevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ResponseLevel
     * }
     */
    public static void ResponseLevel(MemorySegment struct, int fieldValue) {
        struct.set(ResponseLevel$LAYOUT, ResponseLevel$OFFSET, fieldValue);
    }

    private static final OfInt NumberEntries$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberEntries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberEntries
     * }
     */
    public static final OfInt NumberEntries$layout() {
        return NumberEntries$LAYOUT;
    }

    private static final long NumberEntries$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberEntries
     * }
     */
    public static final long NumberEntries$offset() {
        return NumberEntries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberEntries
     * }
     */
    public static int NumberEntries(MemorySegment struct) {
        return struct.get(NumberEntries$LAYOUT, NumberEntries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberEntries
     * }
     */
    public static void NumberEntries(MemorySegment struct, int fieldValue) {
        struct.set(NumberEntries$LAYOUT, NumberEntries$OFFSET, fieldValue);
    }

    private static final SequenceLayout Lev1Depends$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("$anon$14118:5"), groupElement("Lev1Depends"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY Lev1Depends[]
     * }
     */
    public static final SequenceLayout Lev1Depends$layout() {
        return Lev1Depends$LAYOUT;
    }

    private static final long Lev1Depends$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY Lev1Depends[]
     * }
     */
    public static final long Lev1Depends$offset() {
        return Lev1Depends$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY Lev1Depends[]
     * }
     */
    public static MemorySegment Lev1Depends(MemorySegment struct) {
        return struct.asSlice(Lev1Depends$OFFSET, Lev1Depends$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY Lev1Depends[]
     * }
     */
    public static void Lev1Depends(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Lev1Depends$OFFSET, Lev1Depends$LAYOUT.byteSize());
    }

    private static final SequenceLayout Lev2Depends$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("$anon$14118:5"), groupElement("Lev2Depends"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY Lev2Depends[]
     * }
     */
    public static final SequenceLayout Lev2Depends$layout() {
        return Lev2Depends$LAYOUT;
    }

    private static final long Lev2Depends$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY Lev2Depends[]
     * }
     */
    public static final long Lev2Depends$offset() {
        return Lev2Depends$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY Lev2Depends[]
     * }
     */
    public static MemorySegment Lev2Depends(MemorySegment struct) {
        return struct.asSlice(Lev2Depends$OFFSET, Lev2Depends$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY Lev2Depends[]
     * }
     */
    public static void Lev2Depends(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Lev2Depends$OFFSET, Lev2Depends$LAYOUT.byteSize());
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

