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
 * struct _SHQUERYRBINFO {
 *     DWORD cbSize;
 *     long long i64Size;
 *     long long i64NumItems;
 * }
 * }
 */
public class _SHQUERYRBINFO {

    _SHQUERYRBINFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG_LONG.withName("i64Size"),
        Windows_h.C_LONG_LONG.withName("i64NumItems")
    ).withName("_SHQUERYRBINFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfLong i64Size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("i64Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long long i64Size
     * }
     */
    public static final OfLong i64Size$layout() {
        return i64Size$LAYOUT;
    }

    private static final long i64Size$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long long i64Size
     * }
     */
    public static final long i64Size$offset() {
        return i64Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long long i64Size
     * }
     */
    public static long i64Size(MemorySegment struct) {
        return struct.get(i64Size$LAYOUT, i64Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long long i64Size
     * }
     */
    public static void i64Size(MemorySegment struct, long fieldValue) {
        struct.set(i64Size$LAYOUT, i64Size$OFFSET, fieldValue);
    }

    private static final OfLong i64NumItems$LAYOUT = (OfLong)$LAYOUT.select(groupElement("i64NumItems"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long long i64NumItems
     * }
     */
    public static final OfLong i64NumItems$layout() {
        return i64NumItems$LAYOUT;
    }

    private static final long i64NumItems$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long long i64NumItems
     * }
     */
    public static final long i64NumItems$offset() {
        return i64NumItems$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long long i64NumItems
     * }
     */
    public static long i64NumItems(MemorySegment struct) {
        return struct.get(i64NumItems$LAYOUT, i64NumItems$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long long i64NumItems
     * }
     */
    public static void i64NumItems(MemorySegment struct, long fieldValue) {
        struct.set(i64NumItems$LAYOUT, i64NumItems$OFFSET, fieldValue);
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

