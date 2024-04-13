// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * struct _IMAGE_FUNCTION_ENTRY {
 *     DWORD StartingAddress;
 *     DWORD EndingAddress;
 *     DWORD EndOfPrologue;
 * }
 * }
 */
public class _IMAGE_FUNCTION_ENTRY {

    _IMAGE_FUNCTION_ENTRY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("StartingAddress"),
        Windows_h.C_LONG.withName("EndingAddress"),
        Windows_h.C_LONG.withName("EndOfPrologue")
    ).withName("_IMAGE_FUNCTION_ENTRY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt StartingAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("StartingAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD StartingAddress
     * }
     */
    public static final OfInt StartingAddress$layout() {
        return StartingAddress$LAYOUT;
    }

    private static final long StartingAddress$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD StartingAddress
     * }
     */
    public static final long StartingAddress$offset() {
        return StartingAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD StartingAddress
     * }
     */
    public static int StartingAddress(MemorySegment struct) {
        return struct.get(StartingAddress$LAYOUT, StartingAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD StartingAddress
     * }
     */
    public static void StartingAddress(MemorySegment struct, int fieldValue) {
        struct.set(StartingAddress$LAYOUT, StartingAddress$OFFSET, fieldValue);
    }

    private static final OfInt EndingAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EndingAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD EndingAddress
     * }
     */
    public static final OfInt EndingAddress$layout() {
        return EndingAddress$LAYOUT;
    }

    private static final long EndingAddress$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD EndingAddress
     * }
     */
    public static final long EndingAddress$offset() {
        return EndingAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD EndingAddress
     * }
     */
    public static int EndingAddress(MemorySegment struct) {
        return struct.get(EndingAddress$LAYOUT, EndingAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD EndingAddress
     * }
     */
    public static void EndingAddress(MemorySegment struct, int fieldValue) {
        struct.set(EndingAddress$LAYOUT, EndingAddress$OFFSET, fieldValue);
    }

    private static final OfInt EndOfPrologue$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EndOfPrologue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD EndOfPrologue
     * }
     */
    public static final OfInt EndOfPrologue$layout() {
        return EndOfPrologue$LAYOUT;
    }

    private static final long EndOfPrologue$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD EndOfPrologue
     * }
     */
    public static final long EndOfPrologue$offset() {
        return EndOfPrologue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD EndOfPrologue
     * }
     */
    public static int EndOfPrologue(MemorySegment struct) {
        return struct.get(EndOfPrologue$LAYOUT, EndOfPrologue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD EndOfPrologue
     * }
     */
    public static void EndOfPrologue(MemorySegment struct, int fieldValue) {
        struct.set(EndOfPrologue$LAYOUT, EndOfPrologue$OFFSET, fieldValue);
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
