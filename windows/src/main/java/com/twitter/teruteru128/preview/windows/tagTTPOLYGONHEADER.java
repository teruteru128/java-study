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
 * struct tagTTPOLYGONHEADER {
 *     DWORD cb;
 *     DWORD dwType;
 *     POINTFX pfxStart;
 * }
 * }
 */
public class tagTTPOLYGONHEADER {

    tagTTPOLYGONHEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cb"),
        Windows_h.C_LONG.withName("dwType"),
        tagPOINTFX.layout().withName("pfxStart")
    ).withName("tagTTPOLYGONHEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cb$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cb"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static final OfInt cb$layout() {
        return cb$LAYOUT;
    }

    private static final long cb$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static final long cb$offset() {
        return cb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static int cb(MemorySegment struct) {
        return struct.get(cb$LAYOUT, cb$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static void cb(MemorySegment struct, int fieldValue) {
        struct.set(cb$LAYOUT, cb$OFFSET, fieldValue);
    }

    private static final OfInt dwType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static final OfInt dwType$layout() {
        return dwType$LAYOUT;
    }

    private static final long dwType$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static final long dwType$offset() {
        return dwType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static int dwType(MemorySegment struct) {
        return struct.get(dwType$LAYOUT, dwType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static void dwType(MemorySegment struct, int fieldValue) {
        struct.set(dwType$LAYOUT, dwType$OFFSET, fieldValue);
    }

    private static final GroupLayout pfxStart$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pfxStart"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTFX pfxStart
     * }
     */
    public static final GroupLayout pfxStart$layout() {
        return pfxStart$LAYOUT;
    }

    private static final long pfxStart$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTFX pfxStart
     * }
     */
    public static final long pfxStart$offset() {
        return pfxStart$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTFX pfxStart
     * }
     */
    public static MemorySegment pfxStart(MemorySegment struct) {
        return struct.asSlice(pfxStart$OFFSET, pfxStart$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTFX pfxStart
     * }
     */
    public static void pfxStart(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pfxStart$OFFSET, pfxStart$LAYOUT.byteSize());
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

