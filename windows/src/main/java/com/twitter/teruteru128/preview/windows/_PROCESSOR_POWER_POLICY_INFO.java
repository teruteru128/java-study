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
 * struct _PROCESSOR_POWER_POLICY_INFO {
 *     DWORD TimeCheck;
 *     DWORD DemoteLimit;
 *     DWORD PromoteLimit;
 *     BYTE DemotePercent;
 *     BYTE PromotePercent;
 *     BYTE Spare[2];
 *     DWORD AllowDemotion : 1;
 *     DWORD AllowPromotion : 1;
 *     DWORD Reserved : 30;
 * }
 * }
 */
public class _PROCESSOR_POWER_POLICY_INFO {

    _PROCESSOR_POWER_POLICY_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("TimeCheck"),
        Windows_h.C_LONG.withName("DemoteLimit"),
        Windows_h.C_LONG.withName("PromoteLimit"),
        Windows_h.C_CHAR.withName("DemotePercent"),
        Windows_h.C_CHAR.withName("PromotePercent"),
        MemoryLayout.sequenceLayout(2, Windows_h.C_CHAR).withName("Spare"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PROCESSOR_POWER_POLICY_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt TimeCheck$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TimeCheck"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static final OfInt TimeCheck$layout() {
        return TimeCheck$LAYOUT;
    }

    private static final long TimeCheck$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static final long TimeCheck$offset() {
        return TimeCheck$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static int TimeCheck(MemorySegment struct) {
        return struct.get(TimeCheck$LAYOUT, TimeCheck$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static void TimeCheck(MemorySegment struct, int fieldValue) {
        struct.set(TimeCheck$LAYOUT, TimeCheck$OFFSET, fieldValue);
    }

    private static final OfInt DemoteLimit$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DemoteLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DemoteLimit
     * }
     */
    public static final OfInt DemoteLimit$layout() {
        return DemoteLimit$LAYOUT;
    }

    private static final long DemoteLimit$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DemoteLimit
     * }
     */
    public static final long DemoteLimit$offset() {
        return DemoteLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DemoteLimit
     * }
     */
    public static int DemoteLimit(MemorySegment struct) {
        return struct.get(DemoteLimit$LAYOUT, DemoteLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DemoteLimit
     * }
     */
    public static void DemoteLimit(MemorySegment struct, int fieldValue) {
        struct.set(DemoteLimit$LAYOUT, DemoteLimit$OFFSET, fieldValue);
    }

    private static final OfInt PromoteLimit$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PromoteLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PromoteLimit
     * }
     */
    public static final OfInt PromoteLimit$layout() {
        return PromoteLimit$LAYOUT;
    }

    private static final long PromoteLimit$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PromoteLimit
     * }
     */
    public static final long PromoteLimit$offset() {
        return PromoteLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PromoteLimit
     * }
     */
    public static int PromoteLimit(MemorySegment struct) {
        return struct.get(PromoteLimit$LAYOUT, PromoteLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PromoteLimit
     * }
     */
    public static void PromoteLimit(MemorySegment struct, int fieldValue) {
        struct.set(PromoteLimit$LAYOUT, PromoteLimit$OFFSET, fieldValue);
    }

    private static final OfByte DemotePercent$LAYOUT = (OfByte)$LAYOUT.select(groupElement("DemotePercent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE DemotePercent
     * }
     */
    public static final OfByte DemotePercent$layout() {
        return DemotePercent$LAYOUT;
    }

    private static final long DemotePercent$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE DemotePercent
     * }
     */
    public static final long DemotePercent$offset() {
        return DemotePercent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE DemotePercent
     * }
     */
    public static byte DemotePercent(MemorySegment struct) {
        return struct.get(DemotePercent$LAYOUT, DemotePercent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE DemotePercent
     * }
     */
    public static void DemotePercent(MemorySegment struct, byte fieldValue) {
        struct.set(DemotePercent$LAYOUT, DemotePercent$OFFSET, fieldValue);
    }

    private static final OfByte PromotePercent$LAYOUT = (OfByte)$LAYOUT.select(groupElement("PromotePercent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE PromotePercent
     * }
     */
    public static final OfByte PromotePercent$layout() {
        return PromotePercent$LAYOUT;
    }

    private static final long PromotePercent$OFFSET = 13;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE PromotePercent
     * }
     */
    public static final long PromotePercent$offset() {
        return PromotePercent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE PromotePercent
     * }
     */
    public static byte PromotePercent(MemorySegment struct) {
        return struct.get(PromotePercent$LAYOUT, PromotePercent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE PromotePercent
     * }
     */
    public static void PromotePercent(MemorySegment struct, byte fieldValue) {
        struct.set(PromotePercent$LAYOUT, PromotePercent$OFFSET, fieldValue);
    }

    private static final SequenceLayout Spare$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Spare"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Spare[2]
     * }
     */
    public static final SequenceLayout Spare$layout() {
        return Spare$LAYOUT;
    }

    private static final long Spare$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Spare[2]
     * }
     */
    public static final long Spare$offset() {
        return Spare$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Spare[2]
     * }
     */
    public static MemorySegment Spare(MemorySegment struct) {
        return struct.asSlice(Spare$OFFSET, Spare$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Spare[2]
     * }
     */
    public static void Spare(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Spare$OFFSET, Spare$LAYOUT.byteSize());
    }

    private static long[] Spare$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Spare[2]
     * }
     */
    public static long[] Spare$dimensions() {
        return Spare$DIMS;
    }
    private static final VarHandle Spare$ELEM_HANDLE = Spare$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Spare[2]
     * }
     */
    public static byte Spare(MemorySegment struct, long index0) {
        return (byte)Spare$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Spare[2]
     * }
     */
    public static void Spare(MemorySegment struct, long index0, byte fieldValue) {
        Spare$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

