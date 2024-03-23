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
 * struct _CFG_CALL_TARGET_INFO {
 *     ULONG_PTR Offset;
 *     ULONG_PTR Flags;
 * }
 * }
 */
public class _CFG_CALL_TARGET_INFO {

    _CFG_CALL_TARGET_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG_LONG.withName("Offset"),
        Windows_h.C_LONG_LONG.withName("Flags")
    ).withName("_CFG_CALL_TARGET_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong Offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR Offset
     * }
     */
    public static final OfLong Offset$layout() {
        return Offset$LAYOUT;
    }

    private static final long Offset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR Offset
     * }
     */
    public static final long Offset$offset() {
        return Offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR Offset
     * }
     */
    public static long Offset(MemorySegment struct) {
        return struct.get(Offset$LAYOUT, Offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR Offset
     * }
     */
    public static void Offset(MemorySegment struct, long fieldValue) {
        struct.set(Offset$LAYOUT, Offset$OFFSET, fieldValue);
    }

    private static final OfLong Flags$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR Flags
     * }
     */
    public static final OfLong Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR Flags
     * }
     */
    public static long Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR Flags
     * }
     */
    public static void Flags(MemorySegment struct, long fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
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

