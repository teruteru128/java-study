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
 * struct _STORAGE_LB_PROVISIONING_MAP_RESOURCES {
 *     DWORD Size;
 *     DWORD Version;
 *     BYTE AvailableMappingResourcesValid : 1;
 *     BYTE UsedMappingResourcesValid : 1;
 *     BYTE Reserved0 : 6;
 *     BYTE Reserved1[3];
 *     BYTE AvailableMappingResourcesScope : 2;
 *     BYTE UsedMappingResourcesScope : 2;
 *     BYTE Reserved2 : 4;
 *     BYTE Reserved3[3];
 *     DWORDLONG AvailableMappingResources;
 *     DWORDLONG UsedMappingResources;
 * }
 * }
 */
public class _STORAGE_LB_PROVISIONING_MAP_RESOURCES {

    _STORAGE_LB_PROVISIONING_MAP_RESOURCES() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Size"),
        Windows_h.C_LONG.withName("Version"),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.sequenceLayout(3, Windows_h.C_CHAR).withName("Reserved1"),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.sequenceLayout(3, Windows_h.C_CHAR).withName("Reserved3"),
        Windows_h.C_LONG_LONG.withName("AvailableMappingResources"),
        Windows_h.C_LONG_LONG.withName("UsedMappingResources")
    ).withName("_STORAGE_LB_PROVISIONING_MAP_RESOURCES");

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

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static final SequenceLayout Reserved1$layout() {
        return Reserved1$LAYOUT;
    }

    private static final long Reserved1$OFFSET = 9;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static final long Reserved1$offset() {
        return Reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static MemorySegment Reserved1(MemorySegment struct) {
        return struct.asSlice(Reserved1$OFFSET, Reserved1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static void Reserved1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved1$OFFSET, Reserved1$LAYOUT.byteSize());
    }

    private static long[] Reserved1$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static long[] Reserved1$dimensions() {
        return Reserved1$DIMS;
    }
    private static final VarHandle Reserved1$ELEM_HANDLE = Reserved1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static byte Reserved1(MemorySegment struct, long index0) {
        return (byte)Reserved1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[3]
     * }
     */
    public static void Reserved1(MemorySegment struct, long index0, byte fieldValue) {
        Reserved1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout Reserved3$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved3[3]
     * }
     */
    public static final SequenceLayout Reserved3$layout() {
        return Reserved3$LAYOUT;
    }

    private static final long Reserved3$OFFSET = 13;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved3[3]
     * }
     */
    public static final long Reserved3$offset() {
        return Reserved3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved3[3]
     * }
     */
    public static MemorySegment Reserved3(MemorySegment struct) {
        return struct.asSlice(Reserved3$OFFSET, Reserved3$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved3[3]
     * }
     */
    public static void Reserved3(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved3$OFFSET, Reserved3$LAYOUT.byteSize());
    }

    private static long[] Reserved3$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved3[3]
     * }
     */
    public static long[] Reserved3$dimensions() {
        return Reserved3$DIMS;
    }
    private static final VarHandle Reserved3$ELEM_HANDLE = Reserved3$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved3[3]
     * }
     */
    public static byte Reserved3(MemorySegment struct, long index0) {
        return (byte)Reserved3$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved3[3]
     * }
     */
    public static void Reserved3(MemorySegment struct, long index0, byte fieldValue) {
        Reserved3$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong AvailableMappingResources$LAYOUT = (OfLong)$LAYOUT.select(groupElement("AvailableMappingResources"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG AvailableMappingResources
     * }
     */
    public static final OfLong AvailableMappingResources$layout() {
        return AvailableMappingResources$LAYOUT;
    }

    private static final long AvailableMappingResources$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG AvailableMappingResources
     * }
     */
    public static final long AvailableMappingResources$offset() {
        return AvailableMappingResources$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG AvailableMappingResources
     * }
     */
    public static long AvailableMappingResources(MemorySegment struct) {
        return struct.get(AvailableMappingResources$LAYOUT, AvailableMappingResources$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG AvailableMappingResources
     * }
     */
    public static void AvailableMappingResources(MemorySegment struct, long fieldValue) {
        struct.set(AvailableMappingResources$LAYOUT, AvailableMappingResources$OFFSET, fieldValue);
    }

    private static final OfLong UsedMappingResources$LAYOUT = (OfLong)$LAYOUT.select(groupElement("UsedMappingResources"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG UsedMappingResources
     * }
     */
    public static final OfLong UsedMappingResources$layout() {
        return UsedMappingResources$LAYOUT;
    }

    private static final long UsedMappingResources$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG UsedMappingResources
     * }
     */
    public static final long UsedMappingResources$offset() {
        return UsedMappingResources$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG UsedMappingResources
     * }
     */
    public static long UsedMappingResources(MemorySegment struct) {
        return struct.get(UsedMappingResources$LAYOUT, UsedMappingResources$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG UsedMappingResources
     * }
     */
    public static void UsedMappingResources(MemorySegment struct, long fieldValue) {
        struct.set(UsedMappingResources$LAYOUT, UsedMappingResources$OFFSET, fieldValue);
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

