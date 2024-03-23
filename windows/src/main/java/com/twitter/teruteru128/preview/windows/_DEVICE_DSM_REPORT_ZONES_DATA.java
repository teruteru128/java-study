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
 * struct _DEVICE_DSM_REPORT_ZONES_DATA {
 *     DWORD Size;
 *     DWORD ZoneCount;
 *     STORAGE_ZONES_ATTRIBUTES Attributes;
 *     DWORD Reserved0;
 *     STORAGE_ZONE_DESCRIPTOR ZoneDescriptors[1];
 * }
 * }
 */
public class _DEVICE_DSM_REPORT_ZONES_DATA {

    _DEVICE_DSM_REPORT_ZONES_DATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Size"),
        Windows_h.C_LONG.withName("ZoneCount"),
        Windows_h.C_INT.withName("Attributes"),
        Windows_h.C_LONG.withName("Reserved0"),
        MemoryLayout.sequenceLayout(1, _STORAGE_ZONE_DESCRIPTOR.layout()).withName("ZoneDescriptors")
    ).withName("_DEVICE_DSM_REPORT_ZONES_DATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfInt ZoneCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ZoneCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ZoneCount
     * }
     */
    public static final OfInt ZoneCount$layout() {
        return ZoneCount$LAYOUT;
    }

    private static final long ZoneCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ZoneCount
     * }
     */
    public static final long ZoneCount$offset() {
        return ZoneCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ZoneCount
     * }
     */
    public static int ZoneCount(MemorySegment struct) {
        return struct.get(ZoneCount$LAYOUT, ZoneCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ZoneCount
     * }
     */
    public static void ZoneCount(MemorySegment struct, int fieldValue) {
        struct.set(ZoneCount$LAYOUT, ZoneCount$OFFSET, fieldValue);
    }

    private static final OfInt Attributes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Attributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_ZONES_ATTRIBUTES Attributes
     * }
     */
    public static final OfInt Attributes$layout() {
        return Attributes$LAYOUT;
    }

    private static final long Attributes$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_ZONES_ATTRIBUTES Attributes
     * }
     */
    public static final long Attributes$offset() {
        return Attributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_ZONES_ATTRIBUTES Attributes
     * }
     */
    public static int Attributes(MemorySegment struct) {
        return struct.get(Attributes$LAYOUT, Attributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_ZONES_ATTRIBUTES Attributes
     * }
     */
    public static void Attributes(MemorySegment struct, int fieldValue) {
        struct.set(Attributes$LAYOUT, Attributes$OFFSET, fieldValue);
    }

    private static final OfInt Reserved0$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved0
     * }
     */
    public static final OfInt Reserved0$layout() {
        return Reserved0$LAYOUT;
    }

    private static final long Reserved0$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved0
     * }
     */
    public static final long Reserved0$offset() {
        return Reserved0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved0
     * }
     */
    public static int Reserved0(MemorySegment struct) {
        return struct.get(Reserved0$LAYOUT, Reserved0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved0
     * }
     */
    public static void Reserved0(MemorySegment struct, int fieldValue) {
        struct.set(Reserved0$LAYOUT, Reserved0$OFFSET, fieldValue);
    }

    private static final SequenceLayout ZoneDescriptors$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ZoneDescriptors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_ZONE_DESCRIPTOR ZoneDescriptors[1]
     * }
     */
    public static final SequenceLayout ZoneDescriptors$layout() {
        return ZoneDescriptors$LAYOUT;
    }

    private static final long ZoneDescriptors$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_ZONE_DESCRIPTOR ZoneDescriptors[1]
     * }
     */
    public static final long ZoneDescriptors$offset() {
        return ZoneDescriptors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_ZONE_DESCRIPTOR ZoneDescriptors[1]
     * }
     */
    public static MemorySegment ZoneDescriptors(MemorySegment struct) {
        return struct.asSlice(ZoneDescriptors$OFFSET, ZoneDescriptors$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_ZONE_DESCRIPTOR ZoneDescriptors[1]
     * }
     */
    public static void ZoneDescriptors(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ZoneDescriptors$OFFSET, ZoneDescriptors$LAYOUT.byteSize());
    }

    private static long[] ZoneDescriptors$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * STORAGE_ZONE_DESCRIPTOR ZoneDescriptors[1]
     * }
     */
    public static long[] ZoneDescriptors$dimensions() {
        return ZoneDescriptors$DIMS;
    }
    private static final MethodHandle ZoneDescriptors$ELEM_HANDLE = ZoneDescriptors$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * STORAGE_ZONE_DESCRIPTOR ZoneDescriptors[1]
     * }
     */
    public static MemorySegment ZoneDescriptors(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)ZoneDescriptors$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * STORAGE_ZONE_DESCRIPTOR ZoneDescriptors[1]
     * }
     */
    public static void ZoneDescriptors(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, ZoneDescriptors(struct, index0), 0L, _STORAGE_ZONE_DESCRIPTOR.layout().byteSize());
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

