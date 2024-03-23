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
 * struct _TP_POOL_STACK_INFORMATION {
 *     SIZE_T StackReserve;
 *     SIZE_T StackCommit;
 * }
 * }
 */
public class _TP_POOL_STACK_INFORMATION {

    _TP_POOL_STACK_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG_LONG.withName("StackReserve"),
        Windows_h.C_LONG_LONG.withName("StackCommit")
    ).withName("_TP_POOL_STACK_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong StackReserve$LAYOUT = (OfLong)$LAYOUT.select(groupElement("StackReserve"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T StackReserve
     * }
     */
    public static final OfLong StackReserve$layout() {
        return StackReserve$LAYOUT;
    }

    private static final long StackReserve$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T StackReserve
     * }
     */
    public static final long StackReserve$offset() {
        return StackReserve$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T StackReserve
     * }
     */
    public static long StackReserve(MemorySegment struct) {
        return struct.get(StackReserve$LAYOUT, StackReserve$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T StackReserve
     * }
     */
    public static void StackReserve(MemorySegment struct, long fieldValue) {
        struct.set(StackReserve$LAYOUT, StackReserve$OFFSET, fieldValue);
    }

    private static final OfLong StackCommit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("StackCommit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T StackCommit
     * }
     */
    public static final OfLong StackCommit$layout() {
        return StackCommit$LAYOUT;
    }

    private static final long StackCommit$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T StackCommit
     * }
     */
    public static final long StackCommit$offset() {
        return StackCommit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T StackCommit
     * }
     */
    public static long StackCommit(MemorySegment struct) {
        return struct.get(StackCommit$LAYOUT, StackCommit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T StackCommit
     * }
     */
    public static void StackCommit(MemorySegment struct, long fieldValue) {
        struct.set(StackCommit$LAYOUT, StackCommit$OFFSET, fieldValue);
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

