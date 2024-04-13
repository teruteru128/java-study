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
 * struct _SYSTEM_CPU_SET_INFORMATION {
 *     DWORD Size;
 *     CPU_SET_INFORMATION_TYPE Type;
 *     union {
 *         struct {
 *             DWORD Id;
 *             WORD Group;
 *             BYTE LogicalProcessorIndex;
 *             BYTE CoreIndex;
 *             BYTE LastLevelCacheIndex;
 *             BYTE NumaNodeIndex;
 *             BYTE EfficiencyClass;
 *             union {
 *                 BYTE AllFlags;
 *                 struct {
 *                     BYTE Parked : 1;
 *                     BYTE Allocated : 1;
 *                     BYTE AllocatedToTargetProcess : 1;
 *                     BYTE RealTime : 1;
 *                     BYTE ReservedFlags : 4;
 *                 };
 *             };
 *             union {
 *                 DWORD Reserved;
 *                 BYTE SchedulingClass;
 *             };
 *             DWORD64 AllocationTag;
 *         } CpuSet;
 *     };
 * }
 * }
 */
public class _SYSTEM_CPU_SET_INFORMATION {

    _SYSTEM_CPU_SET_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Size"),
        Windows_h.C_INT.withName("Type"),
        MemoryLayout.unionLayout(
            _SYSTEM_CPU_SET_INFORMATION.CpuSet.layout().withName("CpuSet")
        ).withName("$anon$13460:5")
    ).withName("_SYSTEM_CPU_SET_INFORMATION");

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

    private static final OfInt Type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CPU_SET_INFORMATION_TYPE Type
     * }
     */
    public static final OfInt Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CPU_SET_INFORMATION_TYPE Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CPU_SET_INFORMATION_TYPE Type
     * }
     */
    public static int Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CPU_SET_INFORMATION_TYPE Type
     * }
     */
    public static void Type(MemorySegment struct, int fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     DWORD Id;
     *     WORD Group;
     *     BYTE LogicalProcessorIndex;
     *     BYTE CoreIndex;
     *     BYTE LastLevelCacheIndex;
     *     BYTE NumaNodeIndex;
     *     BYTE EfficiencyClass;
     *     union {
     *         BYTE AllFlags;
     *         struct {
     *             BYTE Parked : 1;
     *             BYTE Allocated : 1;
     *             BYTE AllocatedToTargetProcess : 1;
     *             BYTE RealTime : 1;
     *             BYTE ReservedFlags : 4;
     *         };
     *     };
     *     union {
     *         DWORD Reserved;
     *         BYTE SchedulingClass;
     *     };
     *     DWORD64 AllocationTag;
     * }
     * }
     */
    public static class CpuSet {

        CpuSet() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            Windows_h.C_LONG.withName("Id"),
            Windows_h.C_SHORT.withName("Group"),
            Windows_h.C_CHAR.withName("LogicalProcessorIndex"),
            Windows_h.C_CHAR.withName("CoreIndex"),
            Windows_h.C_CHAR.withName("LastLevelCacheIndex"),
            Windows_h.C_CHAR.withName("NumaNodeIndex"),
            Windows_h.C_CHAR.withName("EfficiencyClass"),
            MemoryLayout.unionLayout(
                Windows_h.C_CHAR.withName("AllFlags"),
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1)
                ).withName("$anon$13477:17")
            ).withName("$anon$13469:13"),
            MemoryLayout.unionLayout(
                Windows_h.C_LONG.withName("Reserved"),
                Windows_h.C_CHAR.withName("SchedulingClass")
            ).withName("$anon$13486:13"),
            Windows_h.C_LONG_LONG.withName("AllocationTag")
        ).withName("$anon$13461:9");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt Id$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Id"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD Id
         * }
         */
        public static final OfInt Id$layout() {
            return Id$LAYOUT;
        }

        private static final long Id$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD Id
         * }
         */
        public static final long Id$offset() {
            return Id$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD Id
         * }
         */
        public static int Id(MemorySegment struct) {
            return struct.get(Id$LAYOUT, Id$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD Id
         * }
         */
        public static void Id(MemorySegment struct, int fieldValue) {
            struct.set(Id$LAYOUT, Id$OFFSET, fieldValue);
        }

        private static final OfShort Group$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Group"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * WORD Group
         * }
         */
        public static final OfShort Group$layout() {
            return Group$LAYOUT;
        }

        private static final long Group$OFFSET = 4;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * WORD Group
         * }
         */
        public static final long Group$offset() {
            return Group$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * WORD Group
         * }
         */
        public static short Group(MemorySegment struct) {
            return struct.get(Group$LAYOUT, Group$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * WORD Group
         * }
         */
        public static void Group(MemorySegment struct, short fieldValue) {
            struct.set(Group$LAYOUT, Group$OFFSET, fieldValue);
        }

        private static final OfByte LogicalProcessorIndex$LAYOUT = (OfByte)$LAYOUT.select(groupElement("LogicalProcessorIndex"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE LogicalProcessorIndex
         * }
         */
        public static final OfByte LogicalProcessorIndex$layout() {
            return LogicalProcessorIndex$LAYOUT;
        }

        private static final long LogicalProcessorIndex$OFFSET = 6;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE LogicalProcessorIndex
         * }
         */
        public static final long LogicalProcessorIndex$offset() {
            return LogicalProcessorIndex$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE LogicalProcessorIndex
         * }
         */
        public static byte LogicalProcessorIndex(MemorySegment struct) {
            return struct.get(LogicalProcessorIndex$LAYOUT, LogicalProcessorIndex$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE LogicalProcessorIndex
         * }
         */
        public static void LogicalProcessorIndex(MemorySegment struct, byte fieldValue) {
            struct.set(LogicalProcessorIndex$LAYOUT, LogicalProcessorIndex$OFFSET, fieldValue);
        }

        private static final OfByte CoreIndex$LAYOUT = (OfByte)$LAYOUT.select(groupElement("CoreIndex"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE CoreIndex
         * }
         */
        public static final OfByte CoreIndex$layout() {
            return CoreIndex$LAYOUT;
        }

        private static final long CoreIndex$OFFSET = 7;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE CoreIndex
         * }
         */
        public static final long CoreIndex$offset() {
            return CoreIndex$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE CoreIndex
         * }
         */
        public static byte CoreIndex(MemorySegment struct) {
            return struct.get(CoreIndex$LAYOUT, CoreIndex$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE CoreIndex
         * }
         */
        public static void CoreIndex(MemorySegment struct, byte fieldValue) {
            struct.set(CoreIndex$LAYOUT, CoreIndex$OFFSET, fieldValue);
        }

        private static final OfByte LastLevelCacheIndex$LAYOUT = (OfByte)$LAYOUT.select(groupElement("LastLevelCacheIndex"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE LastLevelCacheIndex
         * }
         */
        public static final OfByte LastLevelCacheIndex$layout() {
            return LastLevelCacheIndex$LAYOUT;
        }

        private static final long LastLevelCacheIndex$OFFSET = 8;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE LastLevelCacheIndex
         * }
         */
        public static final long LastLevelCacheIndex$offset() {
            return LastLevelCacheIndex$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE LastLevelCacheIndex
         * }
         */
        public static byte LastLevelCacheIndex(MemorySegment struct) {
            return struct.get(LastLevelCacheIndex$LAYOUT, LastLevelCacheIndex$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE LastLevelCacheIndex
         * }
         */
        public static void LastLevelCacheIndex(MemorySegment struct, byte fieldValue) {
            struct.set(LastLevelCacheIndex$LAYOUT, LastLevelCacheIndex$OFFSET, fieldValue);
        }

        private static final OfByte NumaNodeIndex$LAYOUT = (OfByte)$LAYOUT.select(groupElement("NumaNodeIndex"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE NumaNodeIndex
         * }
         */
        public static final OfByte NumaNodeIndex$layout() {
            return NumaNodeIndex$LAYOUT;
        }

        private static final long NumaNodeIndex$OFFSET = 9;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE NumaNodeIndex
         * }
         */
        public static final long NumaNodeIndex$offset() {
            return NumaNodeIndex$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE NumaNodeIndex
         * }
         */
        public static byte NumaNodeIndex(MemorySegment struct) {
            return struct.get(NumaNodeIndex$LAYOUT, NumaNodeIndex$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE NumaNodeIndex
         * }
         */
        public static void NumaNodeIndex(MemorySegment struct, byte fieldValue) {
            struct.set(NumaNodeIndex$LAYOUT, NumaNodeIndex$OFFSET, fieldValue);
        }

        private static final OfByte EfficiencyClass$LAYOUT = (OfByte)$LAYOUT.select(groupElement("EfficiencyClass"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE EfficiencyClass
         * }
         */
        public static final OfByte EfficiencyClass$layout() {
            return EfficiencyClass$LAYOUT;
        }

        private static final long EfficiencyClass$OFFSET = 10;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE EfficiencyClass
         * }
         */
        public static final long EfficiencyClass$offset() {
            return EfficiencyClass$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE EfficiencyClass
         * }
         */
        public static byte EfficiencyClass(MemorySegment struct) {
            return struct.get(EfficiencyClass$LAYOUT, EfficiencyClass$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE EfficiencyClass
         * }
         */
        public static void EfficiencyClass(MemorySegment struct, byte fieldValue) {
            struct.set(EfficiencyClass$LAYOUT, EfficiencyClass$OFFSET, fieldValue);
        }

        private static final OfByte AllFlags$LAYOUT = (OfByte)$LAYOUT.select(groupElement("$anon$13469:13"), groupElement("AllFlags"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE AllFlags
         * }
         */
        public static final OfByte AllFlags$layout() {
            return AllFlags$LAYOUT;
        }

        private static final long AllFlags$OFFSET = 11;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE AllFlags
         * }
         */
        public static final long AllFlags$offset() {
            return AllFlags$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE AllFlags
         * }
         */
        public static byte AllFlags(MemorySegment struct) {
            return struct.get(AllFlags$LAYOUT, AllFlags$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE AllFlags
         * }
         */
        public static void AllFlags(MemorySegment struct, byte fieldValue) {
            struct.set(AllFlags$LAYOUT, AllFlags$OFFSET, fieldValue);
        }

        private static final OfInt Reserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$13486:13"), groupElement("Reserved"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD Reserved
         * }
         */
        public static final OfInt Reserved$layout() {
            return Reserved$LAYOUT;
        }

        private static final long Reserved$OFFSET = 12;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD Reserved
         * }
         */
        public static final long Reserved$offset() {
            return Reserved$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD Reserved
         * }
         */
        public static int Reserved(MemorySegment struct) {
            return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD Reserved
         * }
         */
        public static void Reserved(MemorySegment struct, int fieldValue) {
            struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
        }

        private static final OfByte SchedulingClass$LAYOUT = (OfByte)$LAYOUT.select(groupElement("$anon$13486:13"), groupElement("SchedulingClass"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE SchedulingClass
         * }
         */
        public static final OfByte SchedulingClass$layout() {
            return SchedulingClass$LAYOUT;
        }

        private static final long SchedulingClass$OFFSET = 12;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE SchedulingClass
         * }
         */
        public static final long SchedulingClass$offset() {
            return SchedulingClass$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE SchedulingClass
         * }
         */
        public static byte SchedulingClass(MemorySegment struct) {
            return struct.get(SchedulingClass$LAYOUT, SchedulingClass$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE SchedulingClass
         * }
         */
        public static void SchedulingClass(MemorySegment struct, byte fieldValue) {
            struct.set(SchedulingClass$LAYOUT, SchedulingClass$OFFSET, fieldValue);
        }

        private static final OfLong AllocationTag$LAYOUT = (OfLong)$LAYOUT.select(groupElement("AllocationTag"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD64 AllocationTag
         * }
         */
        public static final OfLong AllocationTag$layout() {
            return AllocationTag$LAYOUT;
        }

        private static final long AllocationTag$OFFSET = 16;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD64 AllocationTag
         * }
         */
        public static final long AllocationTag$offset() {
            return AllocationTag$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD64 AllocationTag
         * }
         */
        public static long AllocationTag(MemorySegment struct) {
            return struct.get(AllocationTag$LAYOUT, AllocationTag$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD64 AllocationTag
         * }
         */
        public static void AllocationTag(MemorySegment struct, long fieldValue) {
            struct.set(AllocationTag$LAYOUT, AllocationTag$OFFSET, fieldValue);
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

    private static final GroupLayout CpuSet$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$13460:5"), groupElement("CpuSet"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD Id;
     *     WORD Group;
     *     BYTE LogicalProcessorIndex;
     *     BYTE CoreIndex;
     *     BYTE LastLevelCacheIndex;
     *     BYTE NumaNodeIndex;
     *     BYTE EfficiencyClass;
     *     union {
     *         BYTE AllFlags;
     *         struct {
     *             BYTE Parked : 1;
     *             BYTE Allocated : 1;
     *             BYTE AllocatedToTargetProcess : 1;
     *             BYTE RealTime : 1;
     *             BYTE ReservedFlags : 4;
     *         };
     *     };
     *     union {
     *         DWORD Reserved;
     *         BYTE SchedulingClass;
     *     };
     *     DWORD64 AllocationTag;
     * } CpuSet
     * }
     */
    public static final GroupLayout CpuSet$layout() {
        return CpuSet$LAYOUT;
    }

    private static final long CpuSet$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD Id;
     *     WORD Group;
     *     BYTE LogicalProcessorIndex;
     *     BYTE CoreIndex;
     *     BYTE LastLevelCacheIndex;
     *     BYTE NumaNodeIndex;
     *     BYTE EfficiencyClass;
     *     union {
     *         BYTE AllFlags;
     *         struct {
     *             BYTE Parked : 1;
     *             BYTE Allocated : 1;
     *             BYTE AllocatedToTargetProcess : 1;
     *             BYTE RealTime : 1;
     *             BYTE ReservedFlags : 4;
     *         };
     *     };
     *     union {
     *         DWORD Reserved;
     *         BYTE SchedulingClass;
     *     };
     *     DWORD64 AllocationTag;
     * } CpuSet
     * }
     */
    public static final long CpuSet$offset() {
        return CpuSet$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD Id;
     *     WORD Group;
     *     BYTE LogicalProcessorIndex;
     *     BYTE CoreIndex;
     *     BYTE LastLevelCacheIndex;
     *     BYTE NumaNodeIndex;
     *     BYTE EfficiencyClass;
     *     union {
     *         BYTE AllFlags;
     *         struct {
     *             BYTE Parked : 1;
     *             BYTE Allocated : 1;
     *             BYTE AllocatedToTargetProcess : 1;
     *             BYTE RealTime : 1;
     *             BYTE ReservedFlags : 4;
     *         };
     *     };
     *     union {
     *         DWORD Reserved;
     *         BYTE SchedulingClass;
     *     };
     *     DWORD64 AllocationTag;
     * } CpuSet
     * }
     */
    public static MemorySegment CpuSet(MemorySegment struct) {
        return struct.asSlice(CpuSet$OFFSET, CpuSet$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD Id;
     *     WORD Group;
     *     BYTE LogicalProcessorIndex;
     *     BYTE CoreIndex;
     *     BYTE LastLevelCacheIndex;
     *     BYTE NumaNodeIndex;
     *     BYTE EfficiencyClass;
     *     union {
     *         BYTE AllFlags;
     *         struct {
     *             BYTE Parked : 1;
     *             BYTE Allocated : 1;
     *             BYTE AllocatedToTargetProcess : 1;
     *             BYTE RealTime : 1;
     *             BYTE ReservedFlags : 4;
     *         };
     *     };
     *     union {
     *         DWORD Reserved;
     *         BYTE SchedulingClass;
     *     };
     *     DWORD64 AllocationTag;
     * } CpuSet
     * }
     */
    public static void CpuSet(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CpuSet$OFFSET, CpuSet$LAYOUT.byteSize());
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
