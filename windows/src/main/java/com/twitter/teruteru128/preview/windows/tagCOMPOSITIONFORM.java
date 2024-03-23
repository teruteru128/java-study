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
 * struct tagCOMPOSITIONFORM {
 *     DWORD dwStyle;
 *     POINT ptCurrentPos;
 *     RECT rcArea;
 * }
 * }
 */
public class tagCOMPOSITIONFORM {

    tagCOMPOSITIONFORM() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwStyle"),
        tagPOINT.layout().withName("ptCurrentPos"),
        tagRECT.layout().withName("rcArea")
    ).withName("tagCOMPOSITIONFORM");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwStyle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwStyle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwStyle
     * }
     */
    public static final OfInt dwStyle$layout() {
        return dwStyle$LAYOUT;
    }

    private static final long dwStyle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwStyle
     * }
     */
    public static final long dwStyle$offset() {
        return dwStyle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwStyle
     * }
     */
    public static int dwStyle(MemorySegment struct) {
        return struct.get(dwStyle$LAYOUT, dwStyle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwStyle
     * }
     */
    public static void dwStyle(MemorySegment struct, int fieldValue) {
        struct.set(dwStyle$LAYOUT, dwStyle$OFFSET, fieldValue);
    }

    private static final GroupLayout ptCurrentPos$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ptCurrentPos"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINT ptCurrentPos
     * }
     */
    public static final GroupLayout ptCurrentPos$layout() {
        return ptCurrentPos$LAYOUT;
    }

    private static final long ptCurrentPos$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINT ptCurrentPos
     * }
     */
    public static final long ptCurrentPos$offset() {
        return ptCurrentPos$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINT ptCurrentPos
     * }
     */
    public static MemorySegment ptCurrentPos(MemorySegment struct) {
        return struct.asSlice(ptCurrentPos$OFFSET, ptCurrentPos$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINT ptCurrentPos
     * }
     */
    public static void ptCurrentPos(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ptCurrentPos$OFFSET, ptCurrentPos$LAYOUT.byteSize());
    }

    private static final GroupLayout rcArea$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rcArea"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECT rcArea
     * }
     */
    public static final GroupLayout rcArea$layout() {
        return rcArea$LAYOUT;
    }

    private static final long rcArea$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECT rcArea
     * }
     */
    public static final long rcArea$offset() {
        return rcArea$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECT rcArea
     * }
     */
    public static MemorySegment rcArea(MemorySegment struct) {
        return struct.asSlice(rcArea$OFFSET, rcArea$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECT rcArea
     * }
     */
    public static void rcArea(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rcArea$OFFSET, rcArea$LAYOUT.byteSize());
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

