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
 * struct _JOBOBJECT_IO_ATTRIBUTION_INFORMATION {
 *     DWORD ControlFlags;
 *     JOBOBJECT_IO_ATTRIBUTION_STATS ReadStats;
 *     JOBOBJECT_IO_ATTRIBUTION_STATS WriteStats;
 * }
 * }
 */
public class _JOBOBJECT_IO_ATTRIBUTION_INFORMATION {

    _JOBOBJECT_IO_ATTRIBUTION_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("ControlFlags"),
        MemoryLayout.paddingLayout(4),
        _JOBOBJECT_IO_ATTRIBUTION_STATS.layout().withName("ReadStats"),
        _JOBOBJECT_IO_ATTRIBUTION_STATS.layout().withName("WriteStats")
    ).withName("_JOBOBJECT_IO_ATTRIBUTION_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ControlFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ControlFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ControlFlags
     * }
     */
    public static final OfInt ControlFlags$layout() {
        return ControlFlags$LAYOUT;
    }

    private static final long ControlFlags$OFFSET = 0;

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

    private static final GroupLayout ReadStats$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ReadStats"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_IO_ATTRIBUTION_STATS ReadStats
     * }
     */
    public static final GroupLayout ReadStats$layout() {
        return ReadStats$LAYOUT;
    }

    private static final long ReadStats$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_IO_ATTRIBUTION_STATS ReadStats
     * }
     */
    public static final long ReadStats$offset() {
        return ReadStats$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_IO_ATTRIBUTION_STATS ReadStats
     * }
     */
    public static MemorySegment ReadStats(MemorySegment struct) {
        return struct.asSlice(ReadStats$OFFSET, ReadStats$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_IO_ATTRIBUTION_STATS ReadStats
     * }
     */
    public static void ReadStats(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ReadStats$OFFSET, ReadStats$LAYOUT.byteSize());
    }

    private static final GroupLayout WriteStats$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("WriteStats"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_IO_ATTRIBUTION_STATS WriteStats
     * }
     */
    public static final GroupLayout WriteStats$layout() {
        return WriteStats$LAYOUT;
    }

    private static final long WriteStats$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_IO_ATTRIBUTION_STATS WriteStats
     * }
     */
    public static final long WriteStats$offset() {
        return WriteStats$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_IO_ATTRIBUTION_STATS WriteStats
     * }
     */
    public static MemorySegment WriteStats(MemorySegment struct) {
        return struct.asSlice(WriteStats$OFFSET, WriteStats$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_IO_ATTRIBUTION_STATS WriteStats
     * }
     */
    public static void WriteStats(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, WriteStats$OFFSET, WriteStats$LAYOUT.byteSize());
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

