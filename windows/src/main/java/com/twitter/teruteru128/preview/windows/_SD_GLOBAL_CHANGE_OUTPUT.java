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
 * struct _SD_GLOBAL_CHANGE_OUTPUT {
 *     DWORD Flags;
 *     DWORD ChangeType;
 *     union {
 *         SD_CHANGE_MACHINE_SID_OUTPUT SdChange;
 *         SD_QUERY_STATS_OUTPUT SdQueryStats;
 *         SD_ENUM_SDS_OUTPUT SdEnumSds;
 *     };
 * }
 * }
 */
public class _SD_GLOBAL_CHANGE_OUTPUT {

    _SD_GLOBAL_CHANGE_OUTPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Flags"),
        Windows_h.C_LONG.withName("ChangeType"),
        MemoryLayout.unionLayout(
            _SD_CHANGE_MACHINE_SID_OUTPUT.layout().withName("SdChange"),
            _SD_QUERY_STATS_OUTPUT.layout().withName("SdQueryStats"),
            _SD_ENUM_SDS_OUTPUT.layout().withName("SdEnumSds")
        ).withName("$anon$14420:5")
    ).withName("_SD_GLOBAL_CHANGE_OUTPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfInt ChangeType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ChangeType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ChangeType
     * }
     */
    public static final OfInt ChangeType$layout() {
        return ChangeType$LAYOUT;
    }

    private static final long ChangeType$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ChangeType
     * }
     */
    public static final long ChangeType$offset() {
        return ChangeType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ChangeType
     * }
     */
    public static int ChangeType(MemorySegment struct) {
        return struct.get(ChangeType$LAYOUT, ChangeType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ChangeType
     * }
     */
    public static void ChangeType(MemorySegment struct, int fieldValue) {
        struct.set(ChangeType$LAYOUT, ChangeType$OFFSET, fieldValue);
    }

    private static final GroupLayout SdChange$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$14420:5"), groupElement("SdChange"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SD_CHANGE_MACHINE_SID_OUTPUT SdChange
     * }
     */
    public static final GroupLayout SdChange$layout() {
        return SdChange$LAYOUT;
    }

    private static final long SdChange$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SD_CHANGE_MACHINE_SID_OUTPUT SdChange
     * }
     */
    public static final long SdChange$offset() {
        return SdChange$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SD_CHANGE_MACHINE_SID_OUTPUT SdChange
     * }
     */
    public static MemorySegment SdChange(MemorySegment struct) {
        return struct.asSlice(SdChange$OFFSET, SdChange$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SD_CHANGE_MACHINE_SID_OUTPUT SdChange
     * }
     */
    public static void SdChange(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SdChange$OFFSET, SdChange$LAYOUT.byteSize());
    }

    private static final GroupLayout SdQueryStats$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$14420:5"), groupElement("SdQueryStats"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SD_QUERY_STATS_OUTPUT SdQueryStats
     * }
     */
    public static final GroupLayout SdQueryStats$layout() {
        return SdQueryStats$LAYOUT;
    }

    private static final long SdQueryStats$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SD_QUERY_STATS_OUTPUT SdQueryStats
     * }
     */
    public static final long SdQueryStats$offset() {
        return SdQueryStats$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SD_QUERY_STATS_OUTPUT SdQueryStats
     * }
     */
    public static MemorySegment SdQueryStats(MemorySegment struct) {
        return struct.asSlice(SdQueryStats$OFFSET, SdQueryStats$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SD_QUERY_STATS_OUTPUT SdQueryStats
     * }
     */
    public static void SdQueryStats(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SdQueryStats$OFFSET, SdQueryStats$LAYOUT.byteSize());
    }

    private static final GroupLayout SdEnumSds$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$14420:5"), groupElement("SdEnumSds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SD_ENUM_SDS_OUTPUT SdEnumSds
     * }
     */
    public static final GroupLayout SdEnumSds$layout() {
        return SdEnumSds$LAYOUT;
    }

    private static final long SdEnumSds$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SD_ENUM_SDS_OUTPUT SdEnumSds
     * }
     */
    public static final long SdEnumSds$offset() {
        return SdEnumSds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SD_ENUM_SDS_OUTPUT SdEnumSds
     * }
     */
    public static MemorySegment SdEnumSds(MemorySegment struct) {
        return struct.asSlice(SdEnumSds$OFFSET, SdEnumSds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SD_ENUM_SDS_OUTPUT SdEnumSds
     * }
     */
    public static void SdEnumSds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SdEnumSds$OFFSET, SdEnumSds$LAYOUT.byteSize());
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

