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
 * struct _STORAGE_PHYSICAL_NODE_DATA {
 *     DWORD NodeId;
 *     DWORD AdapterCount;
 *     DWORD AdapterDataLength;
 *     DWORD AdapterDataOffset;
 *     DWORD DeviceCount;
 *     DWORD DeviceDataLength;
 *     DWORD DeviceDataOffset;
 *     DWORD Reserved[3];
 * }
 * }
 */
public class _STORAGE_PHYSICAL_NODE_DATA {

    _STORAGE_PHYSICAL_NODE_DATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("NodeId"),
        Windows_h.C_LONG.withName("AdapterCount"),
        Windows_h.C_LONG.withName("AdapterDataLength"),
        Windows_h.C_LONG.withName("AdapterDataOffset"),
        Windows_h.C_LONG.withName("DeviceCount"),
        Windows_h.C_LONG.withName("DeviceDataLength"),
        Windows_h.C_LONG.withName("DeviceDataOffset"),
        MemoryLayout.sequenceLayout(3, Windows_h.C_LONG).withName("Reserved")
    ).withName("_STORAGE_PHYSICAL_NODE_DATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt NodeId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NodeId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NodeId
     * }
     */
    public static final OfInt NodeId$layout() {
        return NodeId$LAYOUT;
    }

    private static final long NodeId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NodeId
     * }
     */
    public static final long NodeId$offset() {
        return NodeId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NodeId
     * }
     */
    public static int NodeId(MemorySegment struct) {
        return struct.get(NodeId$LAYOUT, NodeId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NodeId
     * }
     */
    public static void NodeId(MemorySegment struct, int fieldValue) {
        struct.set(NodeId$LAYOUT, NodeId$OFFSET, fieldValue);
    }

    private static final OfInt AdapterCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AdapterCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AdapterCount
     * }
     */
    public static final OfInt AdapterCount$layout() {
        return AdapterCount$LAYOUT;
    }

    private static final long AdapterCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AdapterCount
     * }
     */
    public static final long AdapterCount$offset() {
        return AdapterCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AdapterCount
     * }
     */
    public static int AdapterCount(MemorySegment struct) {
        return struct.get(AdapterCount$LAYOUT, AdapterCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AdapterCount
     * }
     */
    public static void AdapterCount(MemorySegment struct, int fieldValue) {
        struct.set(AdapterCount$LAYOUT, AdapterCount$OFFSET, fieldValue);
    }

    private static final OfInt AdapterDataLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AdapterDataLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AdapterDataLength
     * }
     */
    public static final OfInt AdapterDataLength$layout() {
        return AdapterDataLength$LAYOUT;
    }

    private static final long AdapterDataLength$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AdapterDataLength
     * }
     */
    public static final long AdapterDataLength$offset() {
        return AdapterDataLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AdapterDataLength
     * }
     */
    public static int AdapterDataLength(MemorySegment struct) {
        return struct.get(AdapterDataLength$LAYOUT, AdapterDataLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AdapterDataLength
     * }
     */
    public static void AdapterDataLength(MemorySegment struct, int fieldValue) {
        struct.set(AdapterDataLength$LAYOUT, AdapterDataLength$OFFSET, fieldValue);
    }

    private static final OfInt AdapterDataOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AdapterDataOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AdapterDataOffset
     * }
     */
    public static final OfInt AdapterDataOffset$layout() {
        return AdapterDataOffset$LAYOUT;
    }

    private static final long AdapterDataOffset$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AdapterDataOffset
     * }
     */
    public static final long AdapterDataOffset$offset() {
        return AdapterDataOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AdapterDataOffset
     * }
     */
    public static int AdapterDataOffset(MemorySegment struct) {
        return struct.get(AdapterDataOffset$LAYOUT, AdapterDataOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AdapterDataOffset
     * }
     */
    public static void AdapterDataOffset(MemorySegment struct, int fieldValue) {
        struct.set(AdapterDataOffset$LAYOUT, AdapterDataOffset$OFFSET, fieldValue);
    }

    private static final OfInt DeviceCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DeviceCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DeviceCount
     * }
     */
    public static final OfInt DeviceCount$layout() {
        return DeviceCount$LAYOUT;
    }

    private static final long DeviceCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DeviceCount
     * }
     */
    public static final long DeviceCount$offset() {
        return DeviceCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DeviceCount
     * }
     */
    public static int DeviceCount(MemorySegment struct) {
        return struct.get(DeviceCount$LAYOUT, DeviceCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DeviceCount
     * }
     */
    public static void DeviceCount(MemorySegment struct, int fieldValue) {
        struct.set(DeviceCount$LAYOUT, DeviceCount$OFFSET, fieldValue);
    }

    private static final OfInt DeviceDataLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DeviceDataLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DeviceDataLength
     * }
     */
    public static final OfInt DeviceDataLength$layout() {
        return DeviceDataLength$LAYOUT;
    }

    private static final long DeviceDataLength$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DeviceDataLength
     * }
     */
    public static final long DeviceDataLength$offset() {
        return DeviceDataLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DeviceDataLength
     * }
     */
    public static int DeviceDataLength(MemorySegment struct) {
        return struct.get(DeviceDataLength$LAYOUT, DeviceDataLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DeviceDataLength
     * }
     */
    public static void DeviceDataLength(MemorySegment struct, int fieldValue) {
        struct.set(DeviceDataLength$LAYOUT, DeviceDataLength$OFFSET, fieldValue);
    }

    private static final OfInt DeviceDataOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DeviceDataOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DeviceDataOffset
     * }
     */
    public static final OfInt DeviceDataOffset$layout() {
        return DeviceDataOffset$LAYOUT;
    }

    private static final long DeviceDataOffset$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DeviceDataOffset
     * }
     */
    public static final long DeviceDataOffset$offset() {
        return DeviceDataOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DeviceDataOffset
     * }
     */
    public static int DeviceDataOffset(MemorySegment struct) {
        return struct.get(DeviceDataOffset$LAYOUT, DeviceDataOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DeviceDataOffset
     * }
     */
    public static void DeviceDataOffset(MemorySegment struct, int fieldValue) {
        struct.set(DeviceDataOffset$LAYOUT, DeviceDataOffset$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved[3]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved[3]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved[3]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved[3]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD Reserved[3]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD Reserved[3]
     * }
     */
    public static int Reserved(MemorySegment struct, long index0) {
        return (int)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD Reserved[3]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, int fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

