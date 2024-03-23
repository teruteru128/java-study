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
 * struct _LUID_AND_ATTRIBUTES {
 *     LUID Luid;
 *     DWORD Attributes;
 * }
 * }
 */
public class _LUID_AND_ATTRIBUTES {

    _LUID_AND_ATTRIBUTES() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LUID.layout().withName("Luid"),
        Windows_h.C_LONG.withName("Attributes")
    ).withName("_LUID_AND_ATTRIBUTES");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout Luid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Luid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LUID Luid
     * }
     */
    public static final GroupLayout Luid$layout() {
        return Luid$LAYOUT;
    }

    private static final long Luid$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LUID Luid
     * }
     */
    public static final long Luid$offset() {
        return Luid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LUID Luid
     * }
     */
    public static MemorySegment Luid(MemorySegment struct) {
        return struct.asSlice(Luid$OFFSET, Luid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LUID Luid
     * }
     */
    public static void Luid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Luid$OFFSET, Luid$LAYOUT.byteSize());
    }

    private static final OfInt Attributes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Attributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static final OfInt Attributes$layout() {
        return Attributes$LAYOUT;
    }

    private static final long Attributes$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static final long Attributes$offset() {
        return Attributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static int Attributes(MemorySegment struct) {
        return struct.get(Attributes$LAYOUT, Attributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static void Attributes(MemorySegment struct, int fieldValue) {
        struct.set(Attributes$LAYOUT, Attributes$OFFSET, fieldValue);
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

