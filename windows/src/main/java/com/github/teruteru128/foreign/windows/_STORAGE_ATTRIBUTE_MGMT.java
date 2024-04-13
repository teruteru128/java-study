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
 * struct _STORAGE_ATTRIBUTE_MGMT {
 *     DWORD Version;
 *     DWORD Size;
 *     STORAGE_ATTRIBUTE_MGMT_ACTION Action;
 *     DWORD Attribute;
 * }
 * }
 */
public class _STORAGE_ATTRIBUTE_MGMT {

    _STORAGE_ATTRIBUTE_MGMT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Version"),
        Windows_h.C_LONG.withName("Size"),
        Windows_h.C_INT.withName("Action"),
        Windows_h.C_LONG.withName("Attribute")
    ).withName("_STORAGE_ATTRIBUTE_MGMT");

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

    private static final OfInt Action$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Action"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_ATTRIBUTE_MGMT_ACTION Action
     * }
     */
    public static final OfInt Action$layout() {
        return Action$LAYOUT;
    }

    private static final long Action$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_ATTRIBUTE_MGMT_ACTION Action
     * }
     */
    public static final long Action$offset() {
        return Action$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_ATTRIBUTE_MGMT_ACTION Action
     * }
     */
    public static int Action(MemorySegment struct) {
        return struct.get(Action$LAYOUT, Action$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_ATTRIBUTE_MGMT_ACTION Action
     * }
     */
    public static void Action(MemorySegment struct, int fieldValue) {
        struct.set(Action$LAYOUT, Action$OFFSET, fieldValue);
    }

    private static final OfInt Attribute$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Attribute"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Attribute
     * }
     */
    public static final OfInt Attribute$layout() {
        return Attribute$LAYOUT;
    }

    private static final long Attribute$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Attribute
     * }
     */
    public static final long Attribute$offset() {
        return Attribute$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Attribute
     * }
     */
    public static int Attribute(MemorySegment struct) {
        return struct.get(Attribute$LAYOUT, Attribute$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Attribute
     * }
     */
    public static void Attribute(MemorySegment struct, int fieldValue) {
        struct.set(Attribute$LAYOUT, Attribute$OFFSET, fieldValue);
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
