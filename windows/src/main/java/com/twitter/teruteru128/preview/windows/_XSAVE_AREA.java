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
 * struct _XSAVE_AREA {
 *     XSAVE_FORMAT LegacyState;
 *     XSAVE_AREA_HEADER Header;
 * }
 * }
 */
public class _XSAVE_AREA {

    _XSAVE_AREA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _XSAVE_FORMAT.layout().withName("LegacyState"),
        _XSAVE_AREA_HEADER.layout().withName("Header")
    ).withName("_XSAVE_AREA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout LegacyState$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("LegacyState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XSAVE_FORMAT LegacyState
     * }
     */
    public static final GroupLayout LegacyState$layout() {
        return LegacyState$LAYOUT;
    }

    private static final long LegacyState$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XSAVE_FORMAT LegacyState
     * }
     */
    public static final long LegacyState$offset() {
        return LegacyState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XSAVE_FORMAT LegacyState
     * }
     */
    public static MemorySegment LegacyState(MemorySegment struct) {
        return struct.asSlice(LegacyState$OFFSET, LegacyState$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XSAVE_FORMAT LegacyState
     * }
     */
    public static void LegacyState(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, LegacyState$OFFSET, LegacyState$LAYOUT.byteSize());
    }

    private static final GroupLayout Header$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Header"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XSAVE_AREA_HEADER Header
     * }
     */
    public static final GroupLayout Header$layout() {
        return Header$LAYOUT;
    }

    private static final long Header$OFFSET = 512;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XSAVE_AREA_HEADER Header
     * }
     */
    public static final long Header$offset() {
        return Header$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XSAVE_AREA_HEADER Header
     * }
     */
    public static MemorySegment Header(MemorySegment struct) {
        return struct.asSlice(Header$OFFSET, Header$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XSAVE_AREA_HEADER Header
     * }
     */
    public static void Header(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Header$OFFSET, Header$LAYOUT.byteSize());
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

