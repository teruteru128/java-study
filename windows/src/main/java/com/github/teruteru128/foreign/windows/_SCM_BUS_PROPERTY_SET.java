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
 * struct _SCM_BUS_PROPERTY_SET {
 *     DWORD Version;
 *     DWORD Size;
 *     SCM_BUS_PROPERTY_ID PropertyId;
 *     SCM_BUS_SET_TYPE SetType;
 *     BYTE AdditionalParameters[1];
 * }
 * }
 */
public class _SCM_BUS_PROPERTY_SET {

    _SCM_BUS_PROPERTY_SET() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Version"),
        Windows_h.C_LONG.withName("Size"),
        Windows_h.C_INT.withName("PropertyId"),
        Windows_h.C_INT.withName("SetType"),
        MemoryLayout.sequenceLayout(1, Windows_h.C_CHAR).withName("AdditionalParameters"),
        MemoryLayout.paddingLayout(3)
    ).withName("_SCM_BUS_PROPERTY_SET");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long Version$OFFSET = 0;

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

    private static final long Size$OFFSET = 4;

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

    private static final OfInt PropertyId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PropertyId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SCM_BUS_PROPERTY_ID PropertyId
     * }
     */
    public static final OfInt PropertyId$layout() {
        return PropertyId$LAYOUT;
    }

    private static final long PropertyId$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SCM_BUS_PROPERTY_ID PropertyId
     * }
     */
    public static final long PropertyId$offset() {
        return PropertyId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SCM_BUS_PROPERTY_ID PropertyId
     * }
     */
    public static int PropertyId(MemorySegment struct) {
        return struct.get(PropertyId$LAYOUT, PropertyId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SCM_BUS_PROPERTY_ID PropertyId
     * }
     */
    public static void PropertyId(MemorySegment struct, int fieldValue) {
        struct.set(PropertyId$LAYOUT, PropertyId$OFFSET, fieldValue);
    }

    private static final OfInt SetType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SetType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SCM_BUS_SET_TYPE SetType
     * }
     */
    public static final OfInt SetType$layout() {
        return SetType$LAYOUT;
    }

    private static final long SetType$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SCM_BUS_SET_TYPE SetType
     * }
     */
    public static final long SetType$offset() {
        return SetType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SCM_BUS_SET_TYPE SetType
     * }
     */
    public static int SetType(MemorySegment struct) {
        return struct.get(SetType$LAYOUT, SetType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SCM_BUS_SET_TYPE SetType
     * }
     */
    public static void SetType(MemorySegment struct, int fieldValue) {
        struct.set(SetType$LAYOUT, SetType$OFFSET, fieldValue);
    }

    private static final SequenceLayout AdditionalParameters$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("AdditionalParameters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE AdditionalParameters[1]
     * }
     */
    public static final SequenceLayout AdditionalParameters$layout() {
        return AdditionalParameters$LAYOUT;
    }

    private static final long AdditionalParameters$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE AdditionalParameters[1]
     * }
     */
    public static final long AdditionalParameters$offset() {
        return AdditionalParameters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE AdditionalParameters[1]
     * }
     */
    public static MemorySegment AdditionalParameters(MemorySegment struct) {
        return struct.asSlice(AdditionalParameters$OFFSET, AdditionalParameters$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE AdditionalParameters[1]
     * }
     */
    public static void AdditionalParameters(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AdditionalParameters$OFFSET, AdditionalParameters$LAYOUT.byteSize());
    }

    private static long[] AdditionalParameters$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE AdditionalParameters[1]
     * }
     */
    public static long[] AdditionalParameters$dimensions() {
        return AdditionalParameters$DIMS;
    }
    private static final VarHandle AdditionalParameters$ELEM_HANDLE = AdditionalParameters$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE AdditionalParameters[1]
     * }
     */
    public static byte AdditionalParameters(MemorySegment struct, long index0) {
        return (byte)AdditionalParameters$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE AdditionalParameters[1]
     * }
     */
    public static void AdditionalParameters(MemorySegment struct, long index0, byte fieldValue) {
        AdditionalParameters$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
