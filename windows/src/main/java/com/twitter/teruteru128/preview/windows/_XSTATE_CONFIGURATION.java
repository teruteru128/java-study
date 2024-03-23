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
 * struct _XSTATE_CONFIGURATION {
 *     DWORD64 EnabledFeatures;
 *     DWORD64 EnabledVolatileFeatures;
 *     DWORD Size;
 *     union {
 *         DWORD ControlFlags;
 *         struct {
 *             DWORD OptimizedSave : 1;
 *             DWORD CompactionEnabled : 1;
 *             DWORD ExtendedFeatureDisable : 1;
 *         };
 *     };
 *     XSTATE_FEATURE Features[64];
 *     DWORD64 EnabledSupervisorFeatures;
 *     DWORD64 AlignedFeatures;
 *     DWORD AllFeatureSize;
 *     DWORD AllFeatures[64];
 *     DWORD64 EnabledUserVisibleSupervisorFeatures;
 *     DWORD64 ExtendedFeatureDisableFeatures;
 *     DWORD AllNonLargeFeatureSize;
 *     DWORD Spare;
 * }
 * }
 */
public class _XSTATE_CONFIGURATION {

    _XSTATE_CONFIGURATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG_LONG.withName("EnabledFeatures"),
        Windows_h.C_LONG_LONG.withName("EnabledVolatileFeatures"),
        Windows_h.C_LONG.withName("Size"),
        MemoryLayout.unionLayout(
            Windows_h.C_LONG.withName("ControlFlags"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$13768:9")
        ).withName("$anon$13766:5"),
        MemoryLayout.sequenceLayout(64, _XSTATE_FEATURE.layout()).withName("Features"),
        Windows_h.C_LONG_LONG.withName("EnabledSupervisorFeatures"),
        Windows_h.C_LONG_LONG.withName("AlignedFeatures"),
        Windows_h.C_LONG.withName("AllFeatureSize"),
        MemoryLayout.sequenceLayout(64, Windows_h.C_LONG).withName("AllFeatures"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG_LONG.withName("EnabledUserVisibleSupervisorFeatures"),
        Windows_h.C_LONG_LONG.withName("ExtendedFeatureDisableFeatures"),
        Windows_h.C_LONG.withName("AllNonLargeFeatureSize"),
        Windows_h.C_LONG.withName("Spare")
    ).withName("_XSTATE_CONFIGURATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong EnabledFeatures$LAYOUT = (OfLong)$LAYOUT.select(groupElement("EnabledFeatures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 EnabledFeatures
     * }
     */
    public static final OfLong EnabledFeatures$layout() {
        return EnabledFeatures$LAYOUT;
    }

    private static final long EnabledFeatures$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 EnabledFeatures
     * }
     */
    public static final long EnabledFeatures$offset() {
        return EnabledFeatures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 EnabledFeatures
     * }
     */
    public static long EnabledFeatures(MemorySegment struct) {
        return struct.get(EnabledFeatures$LAYOUT, EnabledFeatures$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 EnabledFeatures
     * }
     */
    public static void EnabledFeatures(MemorySegment struct, long fieldValue) {
        struct.set(EnabledFeatures$LAYOUT, EnabledFeatures$OFFSET, fieldValue);
    }

    private static final OfLong EnabledVolatileFeatures$LAYOUT = (OfLong)$LAYOUT.select(groupElement("EnabledVolatileFeatures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 EnabledVolatileFeatures
     * }
     */
    public static final OfLong EnabledVolatileFeatures$layout() {
        return EnabledVolatileFeatures$LAYOUT;
    }

    private static final long EnabledVolatileFeatures$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 EnabledVolatileFeatures
     * }
     */
    public static final long EnabledVolatileFeatures$offset() {
        return EnabledVolatileFeatures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 EnabledVolatileFeatures
     * }
     */
    public static long EnabledVolatileFeatures(MemorySegment struct) {
        return struct.get(EnabledVolatileFeatures$LAYOUT, EnabledVolatileFeatures$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 EnabledVolatileFeatures
     * }
     */
    public static void EnabledVolatileFeatures(MemorySegment struct, long fieldValue) {
        struct.set(EnabledVolatileFeatures$LAYOUT, EnabledVolatileFeatures$OFFSET, fieldValue);
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

    private static final long Size$OFFSET = 16;

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

    private static final OfInt ControlFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$13766:5"), groupElement("ControlFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ControlFlags
     * }
     */
    public static final OfInt ControlFlags$layout() {
        return ControlFlags$LAYOUT;
    }

    private static final long ControlFlags$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ControlFlags
     * }
     */
    public static final long ControlFlags$offset() {
        return ControlFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ControlFlags
     * }
     */
    public static int ControlFlags(MemorySegment struct) {
        return struct.get(ControlFlags$LAYOUT, ControlFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ControlFlags
     * }
     */
    public static void ControlFlags(MemorySegment struct, int fieldValue) {
        struct.set(ControlFlags$LAYOUT, ControlFlags$OFFSET, fieldValue);
    }

    private static final SequenceLayout Features$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Features"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XSTATE_FEATURE Features[64]
     * }
     */
    public static final SequenceLayout Features$layout() {
        return Features$LAYOUT;
    }

    private static final long Features$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XSTATE_FEATURE Features[64]
     * }
     */
    public static final long Features$offset() {
        return Features$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XSTATE_FEATURE Features[64]
     * }
     */
    public static MemorySegment Features(MemorySegment struct) {
        return struct.asSlice(Features$OFFSET, Features$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XSTATE_FEATURE Features[64]
     * }
     */
    public static void Features(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Features$OFFSET, Features$LAYOUT.byteSize());
    }

    private static long[] Features$DIMS = { 64 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * XSTATE_FEATURE Features[64]
     * }
     */
    public static long[] Features$dimensions() {
        return Features$DIMS;
    }
    private static final MethodHandle Features$ELEM_HANDLE = Features$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * XSTATE_FEATURE Features[64]
     * }
     */
    public static MemorySegment Features(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)Features$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * XSTATE_FEATURE Features[64]
     * }
     */
    public static void Features(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, Features(struct, index0), 0L, _XSTATE_FEATURE.layout().byteSize());
    }

    private static final OfLong EnabledSupervisorFeatures$LAYOUT = (OfLong)$LAYOUT.select(groupElement("EnabledSupervisorFeatures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 EnabledSupervisorFeatures
     * }
     */
    public static final OfLong EnabledSupervisorFeatures$layout() {
        return EnabledSupervisorFeatures$LAYOUT;
    }

    private static final long EnabledSupervisorFeatures$OFFSET = 536;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 EnabledSupervisorFeatures
     * }
     */
    public static final long EnabledSupervisorFeatures$offset() {
        return EnabledSupervisorFeatures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 EnabledSupervisorFeatures
     * }
     */
    public static long EnabledSupervisorFeatures(MemorySegment struct) {
        return struct.get(EnabledSupervisorFeatures$LAYOUT, EnabledSupervisorFeatures$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 EnabledSupervisorFeatures
     * }
     */
    public static void EnabledSupervisorFeatures(MemorySegment struct, long fieldValue) {
        struct.set(EnabledSupervisorFeatures$LAYOUT, EnabledSupervisorFeatures$OFFSET, fieldValue);
    }

    private static final OfLong AlignedFeatures$LAYOUT = (OfLong)$LAYOUT.select(groupElement("AlignedFeatures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 AlignedFeatures
     * }
     */
    public static final OfLong AlignedFeatures$layout() {
        return AlignedFeatures$LAYOUT;
    }

    private static final long AlignedFeatures$OFFSET = 544;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 AlignedFeatures
     * }
     */
    public static final long AlignedFeatures$offset() {
        return AlignedFeatures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 AlignedFeatures
     * }
     */
    public static long AlignedFeatures(MemorySegment struct) {
        return struct.get(AlignedFeatures$LAYOUT, AlignedFeatures$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 AlignedFeatures
     * }
     */
    public static void AlignedFeatures(MemorySegment struct, long fieldValue) {
        struct.set(AlignedFeatures$LAYOUT, AlignedFeatures$OFFSET, fieldValue);
    }

    private static final OfInt AllFeatureSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AllFeatureSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AllFeatureSize
     * }
     */
    public static final OfInt AllFeatureSize$layout() {
        return AllFeatureSize$LAYOUT;
    }

    private static final long AllFeatureSize$OFFSET = 552;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AllFeatureSize
     * }
     */
    public static final long AllFeatureSize$offset() {
        return AllFeatureSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AllFeatureSize
     * }
     */
    public static int AllFeatureSize(MemorySegment struct) {
        return struct.get(AllFeatureSize$LAYOUT, AllFeatureSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AllFeatureSize
     * }
     */
    public static void AllFeatureSize(MemorySegment struct, int fieldValue) {
        struct.set(AllFeatureSize$LAYOUT, AllFeatureSize$OFFSET, fieldValue);
    }

    private static final SequenceLayout AllFeatures$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("AllFeatures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AllFeatures[64]
     * }
     */
    public static final SequenceLayout AllFeatures$layout() {
        return AllFeatures$LAYOUT;
    }

    private static final long AllFeatures$OFFSET = 556;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AllFeatures[64]
     * }
     */
    public static final long AllFeatures$offset() {
        return AllFeatures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AllFeatures[64]
     * }
     */
    public static MemorySegment AllFeatures(MemorySegment struct) {
        return struct.asSlice(AllFeatures$OFFSET, AllFeatures$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AllFeatures[64]
     * }
     */
    public static void AllFeatures(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AllFeatures$OFFSET, AllFeatures$LAYOUT.byteSize());
    }

    private static long[] AllFeatures$DIMS = { 64 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD AllFeatures[64]
     * }
     */
    public static long[] AllFeatures$dimensions() {
        return AllFeatures$DIMS;
    }
    private static final VarHandle AllFeatures$ELEM_HANDLE = AllFeatures$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD AllFeatures[64]
     * }
     */
    public static int AllFeatures(MemorySegment struct, long index0) {
        return (int)AllFeatures$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD AllFeatures[64]
     * }
     */
    public static void AllFeatures(MemorySegment struct, long index0, int fieldValue) {
        AllFeatures$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong EnabledUserVisibleSupervisorFeatures$LAYOUT = (OfLong)$LAYOUT.select(groupElement("EnabledUserVisibleSupervisorFeatures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 EnabledUserVisibleSupervisorFeatures
     * }
     */
    public static final OfLong EnabledUserVisibleSupervisorFeatures$layout() {
        return EnabledUserVisibleSupervisorFeatures$LAYOUT;
    }

    private static final long EnabledUserVisibleSupervisorFeatures$OFFSET = 816;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 EnabledUserVisibleSupervisorFeatures
     * }
     */
    public static final long EnabledUserVisibleSupervisorFeatures$offset() {
        return EnabledUserVisibleSupervisorFeatures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 EnabledUserVisibleSupervisorFeatures
     * }
     */
    public static long EnabledUserVisibleSupervisorFeatures(MemorySegment struct) {
        return struct.get(EnabledUserVisibleSupervisorFeatures$LAYOUT, EnabledUserVisibleSupervisorFeatures$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 EnabledUserVisibleSupervisorFeatures
     * }
     */
    public static void EnabledUserVisibleSupervisorFeatures(MemorySegment struct, long fieldValue) {
        struct.set(EnabledUserVisibleSupervisorFeatures$LAYOUT, EnabledUserVisibleSupervisorFeatures$OFFSET, fieldValue);
    }

    private static final OfLong ExtendedFeatureDisableFeatures$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ExtendedFeatureDisableFeatures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 ExtendedFeatureDisableFeatures
     * }
     */
    public static final OfLong ExtendedFeatureDisableFeatures$layout() {
        return ExtendedFeatureDisableFeatures$LAYOUT;
    }

    private static final long ExtendedFeatureDisableFeatures$OFFSET = 824;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 ExtendedFeatureDisableFeatures
     * }
     */
    public static final long ExtendedFeatureDisableFeatures$offset() {
        return ExtendedFeatureDisableFeatures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 ExtendedFeatureDisableFeatures
     * }
     */
    public static long ExtendedFeatureDisableFeatures(MemorySegment struct) {
        return struct.get(ExtendedFeatureDisableFeatures$LAYOUT, ExtendedFeatureDisableFeatures$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 ExtendedFeatureDisableFeatures
     * }
     */
    public static void ExtendedFeatureDisableFeatures(MemorySegment struct, long fieldValue) {
        struct.set(ExtendedFeatureDisableFeatures$LAYOUT, ExtendedFeatureDisableFeatures$OFFSET, fieldValue);
    }

    private static final OfInt AllNonLargeFeatureSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AllNonLargeFeatureSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AllNonLargeFeatureSize
     * }
     */
    public static final OfInt AllNonLargeFeatureSize$layout() {
        return AllNonLargeFeatureSize$LAYOUT;
    }

    private static final long AllNonLargeFeatureSize$OFFSET = 832;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AllNonLargeFeatureSize
     * }
     */
    public static final long AllNonLargeFeatureSize$offset() {
        return AllNonLargeFeatureSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AllNonLargeFeatureSize
     * }
     */
    public static int AllNonLargeFeatureSize(MemorySegment struct) {
        return struct.get(AllNonLargeFeatureSize$LAYOUT, AllNonLargeFeatureSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AllNonLargeFeatureSize
     * }
     */
    public static void AllNonLargeFeatureSize(MemorySegment struct, int fieldValue) {
        struct.set(AllNonLargeFeatureSize$LAYOUT, AllNonLargeFeatureSize$OFFSET, fieldValue);
    }

    private static final OfInt Spare$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Spare"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Spare
     * }
     */
    public static final OfInt Spare$layout() {
        return Spare$LAYOUT;
    }

    private static final long Spare$OFFSET = 836;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Spare
     * }
     */
    public static final long Spare$offset() {
        return Spare$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Spare
     * }
     */
    public static int Spare(MemorySegment struct) {
        return struct.get(Spare$LAYOUT, Spare$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Spare
     * }
     */
    public static void Spare(MemorySegment struct, int fieldValue) {
        struct.set(Spare$LAYOUT, Spare$OFFSET, fieldValue);
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

