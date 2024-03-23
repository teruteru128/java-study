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
 * struct _SSL_ECCKEY_BLOB {
 *     ULONG dwCurveType;
 *     ULONG cbKey;
 * }
 * }
 */
public class _SSL_ECCKEY_BLOB {

    _SSL_ECCKEY_BLOB() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwCurveType"),
        Windows_h.C_LONG.withName("cbKey")
    ).withName("_SSL_ECCKEY_BLOB");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwCurveType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCurveType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwCurveType
     * }
     */
    public static final OfInt dwCurveType$layout() {
        return dwCurveType$LAYOUT;
    }

    private static final long dwCurveType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwCurveType
     * }
     */
    public static final long dwCurveType$offset() {
        return dwCurveType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwCurveType
     * }
     */
    public static int dwCurveType(MemorySegment struct) {
        return struct.get(dwCurveType$LAYOUT, dwCurveType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwCurveType
     * }
     */
    public static void dwCurveType(MemorySegment struct, int fieldValue) {
        struct.set(dwCurveType$LAYOUT, dwCurveType$OFFSET, fieldValue);
    }

    private static final OfInt cbKey$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbKey
     * }
     */
    public static final OfInt cbKey$layout() {
        return cbKey$LAYOUT;
    }

    private static final long cbKey$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbKey
     * }
     */
    public static final long cbKey$offset() {
        return cbKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbKey
     * }
     */
    public static int cbKey(MemorySegment struct) {
        return struct.get(cbKey$LAYOUT, cbKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbKey
     * }
     */
    public static void cbKey(MemorySegment struct, int fieldValue) {
        struct.set(cbKey$LAYOUT, cbKey$OFFSET, fieldValue);
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

