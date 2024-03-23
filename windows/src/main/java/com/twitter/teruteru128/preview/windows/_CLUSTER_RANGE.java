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
 * struct _CLUSTER_RANGE {
 *     LARGE_INTEGER StartingCluster;
 *     LARGE_INTEGER ClusterCount;
 * }
 * }
 */
public class _CLUSTER_RANGE {

    _CLUSTER_RANGE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LARGE_INTEGER.layout().withName("StartingCluster"),
        _LARGE_INTEGER.layout().withName("ClusterCount")
    ).withName("_CLUSTER_RANGE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout StartingCluster$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("StartingCluster"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingCluster
     * }
     */
    public static final GroupLayout StartingCluster$layout() {
        return StartingCluster$LAYOUT;
    }

    private static final long StartingCluster$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingCluster
     * }
     */
    public static final long StartingCluster$offset() {
        return StartingCluster$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingCluster
     * }
     */
    public static MemorySegment StartingCluster(MemorySegment struct) {
        return struct.asSlice(StartingCluster$OFFSET, StartingCluster$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingCluster
     * }
     */
    public static void StartingCluster(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StartingCluster$OFFSET, StartingCluster$LAYOUT.byteSize());
    }

    private static final GroupLayout ClusterCount$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ClusterCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ClusterCount
     * }
     */
    public static final GroupLayout ClusterCount$layout() {
        return ClusterCount$LAYOUT;
    }

    private static final long ClusterCount$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ClusterCount
     * }
     */
    public static final long ClusterCount$offset() {
        return ClusterCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ClusterCount
     * }
     */
    public static MemorySegment ClusterCount(MemorySegment struct) {
        return struct.asSlice(ClusterCount$OFFSET, ClusterCount$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ClusterCount
     * }
     */
    public static void ClusterCount(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ClusterCount$OFFSET, ClusterCount$LAYOUT.byteSize());
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

