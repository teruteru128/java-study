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
 * struct _FS_BPIO_OUTPUT {
 *     FS_BPIO_OPERATIONS Operation;
 *     FS_BPIO_OUTFLAGS OutFlags;
 *     DWORDLONG Reserved1;
 *     DWORDLONG Reserved2;
 *     union {
 *         FS_BPIO_RESULTS Enable;
 *         FS_BPIO_RESULTS Query;
 *         FS_BPIO_RESULTS VolumeStackResume;
 *         FS_BPIO_RESULTS StreamResume;
 *         FS_BPIO_INFO GetInfo;
 *     };
 * }
 * }
 */
public class _FS_BPIO_OUTPUT {

    _FS_BPIO_OUTPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("Operation"),
        Windows_h.C_INT.withName("OutFlags"),
        Windows_h.C_LONG_LONG.withName("Reserved1"),
        Windows_h.C_LONG_LONG.withName("Reserved2"),
        MemoryLayout.unionLayout(
            _FS_BPIO_RESULTS.layout().withName("Enable"),
            _FS_BPIO_RESULTS.layout().withName("Query"),
            _FS_BPIO_RESULTS.layout().withName("VolumeStackResume"),
            _FS_BPIO_RESULTS.layout().withName("StreamResume"),
            _FS_BPIO_INFO.layout().withName("GetInfo")
        ).withName("$anon$17062:5")
    ).withName("_FS_BPIO_OUTPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Operation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Operation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FS_BPIO_OPERATIONS Operation
     * }
     */
    public static final OfInt Operation$layout() {
        return Operation$LAYOUT;
    }

    private static final long Operation$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FS_BPIO_OPERATIONS Operation
     * }
     */
    public static final long Operation$offset() {
        return Operation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FS_BPIO_OPERATIONS Operation
     * }
     */
    public static int Operation(MemorySegment struct) {
        return struct.get(Operation$LAYOUT, Operation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FS_BPIO_OPERATIONS Operation
     * }
     */
    public static void Operation(MemorySegment struct, int fieldValue) {
        struct.set(Operation$LAYOUT, Operation$OFFSET, fieldValue);
    }

    private static final OfInt OutFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("OutFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FS_BPIO_OUTFLAGS OutFlags
     * }
     */
    public static final OfInt OutFlags$layout() {
        return OutFlags$LAYOUT;
    }

    private static final long OutFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FS_BPIO_OUTFLAGS OutFlags
     * }
     */
    public static final long OutFlags$offset() {
        return OutFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FS_BPIO_OUTFLAGS OutFlags
     * }
     */
    public static int OutFlags(MemorySegment struct) {
        return struct.get(OutFlags$LAYOUT, OutFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FS_BPIO_OUTFLAGS OutFlags
     * }
     */
    public static void OutFlags(MemorySegment struct, int fieldValue) {
        struct.set(OutFlags$LAYOUT, OutFlags$OFFSET, fieldValue);
    }

    private static final OfLong Reserved1$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG Reserved1
     * }
     */
    public static final OfLong Reserved1$layout() {
        return Reserved1$LAYOUT;
    }

    private static final long Reserved1$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG Reserved1
     * }
     */
    public static final long Reserved1$offset() {
        return Reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG Reserved1
     * }
     */
    public static long Reserved1(MemorySegment struct) {
        return struct.get(Reserved1$LAYOUT, Reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG Reserved1
     * }
     */
    public static void Reserved1(MemorySegment struct, long fieldValue) {
        struct.set(Reserved1$LAYOUT, Reserved1$OFFSET, fieldValue);
    }

    private static final OfLong Reserved2$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG Reserved2
     * }
     */
    public static final OfLong Reserved2$layout() {
        return Reserved2$LAYOUT;
    }

    private static final long Reserved2$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG Reserved2
     * }
     */
    public static final long Reserved2$offset() {
        return Reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG Reserved2
     * }
     */
    public static long Reserved2(MemorySegment struct) {
        return struct.get(Reserved2$LAYOUT, Reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG Reserved2
     * }
     */
    public static void Reserved2(MemorySegment struct, long fieldValue) {
        struct.set(Reserved2$LAYOUT, Reserved2$OFFSET, fieldValue);
    }

    private static final GroupLayout Enable$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$17062:5"), groupElement("Enable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS Enable
     * }
     */
    public static final GroupLayout Enable$layout() {
        return Enable$LAYOUT;
    }

    private static final long Enable$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS Enable
     * }
     */
    public static final long Enable$offset() {
        return Enable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS Enable
     * }
     */
    public static MemorySegment Enable(MemorySegment struct) {
        return struct.asSlice(Enable$OFFSET, Enable$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS Enable
     * }
     */
    public static void Enable(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Enable$OFFSET, Enable$LAYOUT.byteSize());
    }

    private static final GroupLayout Query$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$17062:5"), groupElement("Query"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS Query
     * }
     */
    public static final GroupLayout Query$layout() {
        return Query$LAYOUT;
    }

    private static final long Query$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS Query
     * }
     */
    public static final long Query$offset() {
        return Query$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS Query
     * }
     */
    public static MemorySegment Query(MemorySegment struct) {
        return struct.asSlice(Query$OFFSET, Query$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS Query
     * }
     */
    public static void Query(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Query$OFFSET, Query$LAYOUT.byteSize());
    }

    private static final GroupLayout VolumeStackResume$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$17062:5"), groupElement("VolumeStackResume"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS VolumeStackResume
     * }
     */
    public static final GroupLayout VolumeStackResume$layout() {
        return VolumeStackResume$LAYOUT;
    }

    private static final long VolumeStackResume$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS VolumeStackResume
     * }
     */
    public static final long VolumeStackResume$offset() {
        return VolumeStackResume$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS VolumeStackResume
     * }
     */
    public static MemorySegment VolumeStackResume(MemorySegment struct) {
        return struct.asSlice(VolumeStackResume$OFFSET, VolumeStackResume$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS VolumeStackResume
     * }
     */
    public static void VolumeStackResume(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, VolumeStackResume$OFFSET, VolumeStackResume$LAYOUT.byteSize());
    }

    private static final GroupLayout StreamResume$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$17062:5"), groupElement("StreamResume"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS StreamResume
     * }
     */
    public static final GroupLayout StreamResume$layout() {
        return StreamResume$LAYOUT;
    }

    private static final long StreamResume$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS StreamResume
     * }
     */
    public static final long StreamResume$offset() {
        return StreamResume$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS StreamResume
     * }
     */
    public static MemorySegment StreamResume(MemorySegment struct) {
        return struct.asSlice(StreamResume$OFFSET, StreamResume$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FS_BPIO_RESULTS StreamResume
     * }
     */
    public static void StreamResume(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StreamResume$OFFSET, StreamResume$LAYOUT.byteSize());
    }

    private static final GroupLayout GetInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$17062:5"), groupElement("GetInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FS_BPIO_INFO GetInfo
     * }
     */
    public static final GroupLayout GetInfo$layout() {
        return GetInfo$LAYOUT;
    }

    private static final long GetInfo$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FS_BPIO_INFO GetInfo
     * }
     */
    public static final long GetInfo$offset() {
        return GetInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FS_BPIO_INFO GetInfo
     * }
     */
    public static MemorySegment GetInfo(MemorySegment struct) {
        return struct.asSlice(GetInfo$OFFSET, GetInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FS_BPIO_INFO GetInfo
     * }
     */
    public static void GetInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, GetInfo$OFFSET, GetInfo$LAYOUT.byteSize());
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

