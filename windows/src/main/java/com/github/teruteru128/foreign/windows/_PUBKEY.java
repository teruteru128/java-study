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
 * struct _PUBKEY {
 *     DWORD magic;
 *     DWORD bitlen;
 * }
 * }
 */
public class _PUBKEY {

    _PUBKEY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("magic"),
        Windows_h.C_LONG.withName("bitlen")
    ).withName("_PUBKEY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt magic$LAYOUT = (OfInt)$LAYOUT.select(groupElement("magic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static final OfInt magic$layout() {
        return magic$LAYOUT;
    }

    private static final long magic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static final long magic$offset() {
        return magic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static int magic(MemorySegment struct) {
        return struct.get(magic$LAYOUT, magic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static void magic(MemorySegment struct, int fieldValue) {
        struct.set(magic$LAYOUT, magic$OFFSET, fieldValue);
    }

    private static final OfInt bitlen$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bitlen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD bitlen
     * }
     */
    public static final OfInt bitlen$layout() {
        return bitlen$LAYOUT;
    }

    private static final long bitlen$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD bitlen
     * }
     */
    public static final long bitlen$offset() {
        return bitlen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD bitlen
     * }
     */
    public static int bitlen(MemorySegment struct) {
        return struct.get(bitlen$LAYOUT, bitlen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD bitlen
     * }
     */
    public static void bitlen(MemorySegment struct, int fieldValue) {
        struct.set(bitlen$LAYOUT, bitlen$OFFSET, fieldValue);
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
