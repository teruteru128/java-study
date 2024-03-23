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
 * struct _SYSTEM_ALARM_CALLBACK_ACE {
 *     ACE_HEADER Header;
 *     ACCESS_MASK Mask;
 *     DWORD SidStart;
 * }
 * }
 */
public class _SYSTEM_ALARM_CALLBACK_ACE {

    _SYSTEM_ALARM_CALLBACK_ACE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _ACE_HEADER.layout().withName("Header"),
        Windows_h.C_LONG.withName("Mask"),
        Windows_h.C_LONG.withName("SidStart")
    ).withName("_SYSTEM_ALARM_CALLBACK_ACE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout Header$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Header"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ACE_HEADER Header
     * }
     */
    public static final GroupLayout Header$layout() {
        return Header$LAYOUT;
    }

    private static final long Header$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ACE_HEADER Header
     * }
     */
    public static final long Header$offset() {
        return Header$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ACE_HEADER Header
     * }
     */
    public static MemorySegment Header(MemorySegment struct) {
        return struct.asSlice(Header$OFFSET, Header$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ACE_HEADER Header
     * }
     */
    public static void Header(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Header$OFFSET, Header$LAYOUT.byteSize());
    }

    private static final OfInt Mask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ACCESS_MASK Mask
     * }
     */
    public static final OfInt Mask$layout() {
        return Mask$LAYOUT;
    }

    private static final long Mask$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ACCESS_MASK Mask
     * }
     */
    public static final long Mask$offset() {
        return Mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ACCESS_MASK Mask
     * }
     */
    public static int Mask(MemorySegment struct) {
        return struct.get(Mask$LAYOUT, Mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ACCESS_MASK Mask
     * }
     */
    public static void Mask(MemorySegment struct, int fieldValue) {
        struct.set(Mask$LAYOUT, Mask$OFFSET, fieldValue);
    }

    private static final OfInt SidStart$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SidStart"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SidStart
     * }
     */
    public static final OfInt SidStart$layout() {
        return SidStart$LAYOUT;
    }

    private static final long SidStart$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SidStart
     * }
     */
    public static final long SidStart$offset() {
        return SidStart$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SidStart
     * }
     */
    public static int SidStart(MemorySegment struct) {
        return struct.get(SidStart$LAYOUT, SidStart$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SidStart
     * }
     */
    public static void SidStart(MemorySegment struct, int fieldValue) {
        struct.set(SidStart$LAYOUT, SidStart$OFFSET, fieldValue);
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

