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
 * struct tagAUDIODESCRIPTION {
 *     UINT cbSize;
 *     BOOL Enabled;
 *     LCID Locale;
 * }
 * }
 */
public class tagAUDIODESCRIPTION {

    tagAUDIODESCRIPTION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("cbSize"),
        Windows_h.C_INT.withName("Enabled"),
        Windows_h.C_LONG.withName("Locale")
    ).withName("tagAUDIODESCRIPTION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt Enabled$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Enabled"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL Enabled
     * }
     */
    public static final OfInt Enabled$layout() {
        return Enabled$LAYOUT;
    }

    private static final long Enabled$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL Enabled
     * }
     */
    public static final long Enabled$offset() {
        return Enabled$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL Enabled
     * }
     */
    public static int Enabled(MemorySegment struct) {
        return struct.get(Enabled$LAYOUT, Enabled$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL Enabled
     * }
     */
    public static void Enabled(MemorySegment struct, int fieldValue) {
        struct.set(Enabled$LAYOUT, Enabled$OFFSET, fieldValue);
    }

    private static final OfInt Locale$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Locale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LCID Locale
     * }
     */
    public static final OfInt Locale$layout() {
        return Locale$LAYOUT;
    }

    private static final long Locale$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LCID Locale
     * }
     */
    public static final long Locale$offset() {
        return Locale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LCID Locale
     * }
     */
    public static int Locale(MemorySegment struct) {
        return struct.get(Locale$LAYOUT, Locale$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LCID Locale
     * }
     */
    public static void Locale(MemorySegment struct, int fieldValue) {
        struct.set(Locale$LAYOUT, Locale$OFFSET, fieldValue);
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

