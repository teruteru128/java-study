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
 * struct _NUMA_NODE_RELATIONSHIP {
 *     DWORD NodeNumber;
 *     BYTE Reserved[18];
 *     WORD GroupCount;
 *     union {
 *         GROUP_AFFINITY GroupMask;
 *         GROUP_AFFINITY GroupMasks[1];
 *     };
 * }
 * }
 */
public class _NUMA_NODE_RELATIONSHIP {

    _NUMA_NODE_RELATIONSHIP() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("NodeNumber"),
        MemoryLayout.sequenceLayout(18, Windows_h.C_CHAR).withName("Reserved"),
        Windows_h.C_SHORT.withName("GroupCount"),
        MemoryLayout.unionLayout(
            _GROUP_AFFINITY.layout().withName("GroupMask"),
            MemoryLayout.sequenceLayout(1, _GROUP_AFFINITY.layout()).withName("GroupMasks")
        ).withName("$anon$13404:5")
    ).withName("_NUMA_NODE_RELATIONSHIP");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt NodeNumber$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NodeNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NodeNumber
     * }
     */
    public static final OfInt NodeNumber$layout() {
        return NodeNumber$LAYOUT;
    }

    private static final long NodeNumber$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NodeNumber
     * }
     */
    public static final long NodeNumber$offset() {
        return NodeNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NodeNumber
     * }
     */
    public static int NodeNumber(MemorySegment struct) {
        return struct.get(NodeNumber$LAYOUT, NodeNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NodeNumber
     * }
     */
    public static void NodeNumber(MemorySegment struct, int fieldValue) {
        struct.set(NodeNumber$LAYOUT, NodeNumber$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved[18]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved[18]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[18]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[18]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 18 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved[18]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[18]
     * }
     */
    public static byte Reserved(MemorySegment struct, long index0) {
        return (byte)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[18]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, byte fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfShort GroupCount$LAYOUT = (OfShort)$LAYOUT.select(groupElement("GroupCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD GroupCount
     * }
     */
    public static final OfShort GroupCount$layout() {
        return GroupCount$LAYOUT;
    }

    private static final long GroupCount$OFFSET = 22;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD GroupCount
     * }
     */
    public static final long GroupCount$offset() {
        return GroupCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD GroupCount
     * }
     */
    public static short GroupCount(MemorySegment struct) {
        return struct.get(GroupCount$LAYOUT, GroupCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD GroupCount
     * }
     */
    public static void GroupCount(MemorySegment struct, short fieldValue) {
        struct.set(GroupCount$LAYOUT, GroupCount$OFFSET, fieldValue);
    }

    private static final GroupLayout GroupMask$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$13404:5"), groupElement("GroupMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMask
     * }
     */
    public static final GroupLayout GroupMask$layout() {
        return GroupMask$LAYOUT;
    }

    private static final long GroupMask$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMask
     * }
     */
    public static final long GroupMask$offset() {
        return GroupMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMask
     * }
     */
    public static MemorySegment GroupMask(MemorySegment struct) {
        return struct.asSlice(GroupMask$OFFSET, GroupMask$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMask
     * }
     */
    public static void GroupMask(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, GroupMask$OFFSET, GroupMask$LAYOUT.byteSize());
    }

    private static final SequenceLayout GroupMasks$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("$anon$13404:5"), groupElement("GroupMasks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMasks[1]
     * }
     */
    public static final SequenceLayout GroupMasks$layout() {
        return GroupMasks$LAYOUT;
    }

    private static final long GroupMasks$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMasks[1]
     * }
     */
    public static final long GroupMasks$offset() {
        return GroupMasks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMasks[1]
     * }
     */
    public static MemorySegment GroupMasks(MemorySegment struct) {
        return struct.asSlice(GroupMasks$OFFSET, GroupMasks$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMasks[1]
     * }
     */
    public static void GroupMasks(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, GroupMasks$OFFSET, GroupMasks$LAYOUT.byteSize());
    }

    private static long[] GroupMasks$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMasks[1]
     * }
     */
    public static long[] GroupMasks$dimensions() {
        return GroupMasks$DIMS;
    }
    private static final MethodHandle GroupMasks$ELEM_HANDLE = GroupMasks$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMasks[1]
     * }
     */
    public static MemorySegment GroupMasks(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)GroupMasks$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * GROUP_AFFINITY GroupMasks[1]
     * }
     */
    public static void GroupMasks(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, GroupMasks(struct, index0), 0L, _GROUP_AFFINITY.layout().byteSize());
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

