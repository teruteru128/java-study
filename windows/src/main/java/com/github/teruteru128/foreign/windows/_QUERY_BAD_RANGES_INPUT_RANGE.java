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
 * struct _QUERY_BAD_RANGES_INPUT_RANGE {
 *     DWORDLONG StartOffset;
 *     DWORDLONG LengthInBytes;
 * }
 * }
 */
public class _QUERY_BAD_RANGES_INPUT_RANGE {

    _QUERY_BAD_RANGES_INPUT_RANGE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG_LONG.withName("StartOffset"),
        Windows_h.C_LONG_LONG.withName("LengthInBytes")
    ).withName("_QUERY_BAD_RANGES_INPUT_RANGE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong StartOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("StartOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG StartOffset
     * }
     */
    public static final OfLong StartOffset$layout() {
        return StartOffset$LAYOUT;
    }

    private static final long StartOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG StartOffset
     * }
     */
    public static final long StartOffset$offset() {
        return StartOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG StartOffset
     * }
     */
    public static long StartOffset(MemorySegment struct) {
        return struct.get(StartOffset$LAYOUT, StartOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG StartOffset
     * }
     */
    public static void StartOffset(MemorySegment struct, long fieldValue) {
        struct.set(StartOffset$LAYOUT, StartOffset$OFFSET, fieldValue);
    }

    private static final OfLong LengthInBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("LengthInBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG LengthInBytes
     * }
     */
    public static final OfLong LengthInBytes$layout() {
        return LengthInBytes$LAYOUT;
    }

    private static final long LengthInBytes$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG LengthInBytes
     * }
     */
    public static final long LengthInBytes$offset() {
        return LengthInBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG LengthInBytes
     * }
     */
    public static long LengthInBytes(MemorySegment struct) {
        return struct.get(LengthInBytes$LAYOUT, LengthInBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG LengthInBytes
     * }
     */
    public static void LengthInBytes(MemorySegment struct, long fieldValue) {
        struct.set(LengthInBytes$LAYOUT, LengthInBytes$OFFSET, fieldValue);
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
