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
 * struct _STORAGE_OFFLOAD_WRITE_OUTPUT {
 *     DWORD OffloadWriteFlags;
 *     DWORD Reserved;
 *     DWORDLONG LengthCopied;
 * }
 * }
 */
public class _STORAGE_OFFLOAD_WRITE_OUTPUT {

    _STORAGE_OFFLOAD_WRITE_OUTPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("OffloadWriteFlags"),
        Windows_h.C_LONG.withName("Reserved"),
        Windows_h.C_LONG_LONG.withName("LengthCopied")
    ).withName("_STORAGE_OFFLOAD_WRITE_OUTPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt OffloadWriteFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("OffloadWriteFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD OffloadWriteFlags
     * }
     */
    public static final OfInt OffloadWriteFlags$layout() {
        return OffloadWriteFlags$LAYOUT;
    }

    private static final long OffloadWriteFlags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD OffloadWriteFlags
     * }
     */
    public static final long OffloadWriteFlags$offset() {
        return OffloadWriteFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD OffloadWriteFlags
     * }
     */
    public static int OffloadWriteFlags(MemorySegment struct) {
        return struct.get(OffloadWriteFlags$LAYOUT, OffloadWriteFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD OffloadWriteFlags
     * }
     */
    public static void OffloadWriteFlags(MemorySegment struct, int fieldValue) {
        struct.set(OffloadWriteFlags$LAYOUT, OffloadWriteFlags$OFFSET, fieldValue);
    }

    private static final OfInt Reserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final OfInt Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static int Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, int fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final OfLong LengthCopied$LAYOUT = (OfLong)$LAYOUT.select(groupElement("LengthCopied"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG LengthCopied
     * }
     */
    public static final OfLong LengthCopied$layout() {
        return LengthCopied$LAYOUT;
    }

    private static final long LengthCopied$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG LengthCopied
     * }
     */
    public static final long LengthCopied$offset() {
        return LengthCopied$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG LengthCopied
     * }
     */
    public static long LengthCopied(MemorySegment struct) {
        return struct.get(LengthCopied$LAYOUT, LengthCopied$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG LengthCopied
     * }
     */
    public static void LengthCopied(MemorySegment struct, long fieldValue) {
        struct.set(LengthCopied$LAYOUT, LengthCopied$OFFSET, fieldValue);
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
