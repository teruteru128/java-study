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
 * struct tagEMRCREATEBRUSHINDIRECT {
 *     EMR emr;
 *     DWORD ihBrush;
 *     LOGBRUSH32 lb;
 * }
 * }
 */
public class tagEMRCREATEBRUSHINDIRECT {

    tagEMRCREATEBRUSHINDIRECT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        Windows_h.C_LONG.withName("ihBrush"),
        tagLOGBRUSH32.layout().withName("lb")
    ).withName("tagEMRCREATEBRUSHINDIRECT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout emr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("emr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final GroupLayout emr$layout() {
        return emr$LAYOUT;
    }

    private static final long emr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final long emr$offset() {
        return emr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static MemorySegment emr(MemorySegment struct) {
        return struct.asSlice(emr$OFFSET, emr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static void emr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emr$OFFSET, emr$LAYOUT.byteSize());
    }

    private static final OfInt ihBrush$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ihBrush"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static final OfInt ihBrush$layout() {
        return ihBrush$LAYOUT;
    }

    private static final long ihBrush$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static final long ihBrush$offset() {
        return ihBrush$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static int ihBrush(MemorySegment struct) {
        return struct.get(ihBrush$LAYOUT, ihBrush$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static void ihBrush(MemorySegment struct, int fieldValue) {
        struct.set(ihBrush$LAYOUT, ihBrush$OFFSET, fieldValue);
    }

    private static final GroupLayout lb$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lb"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LOGBRUSH32 lb
     * }
     */
    public static final GroupLayout lb$layout() {
        return lb$LAYOUT;
    }

    private static final long lb$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LOGBRUSH32 lb
     * }
     */
    public static final long lb$offset() {
        return lb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LOGBRUSH32 lb
     * }
     */
    public static MemorySegment lb(MemorySegment struct) {
        return struct.asSlice(lb$OFFSET, lb$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LOGBRUSH32 lb
     * }
     */
    public static void lb(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lb$OFFSET, lb$LAYOUT.byteSize());
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

