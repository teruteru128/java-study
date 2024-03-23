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
 * struct _GLYPHMETRICSFLOAT {
 *     FLOAT gmfBlackBoxX;
 *     FLOAT gmfBlackBoxY;
 *     POINTFLOAT gmfptGlyphOrigin;
 *     FLOAT gmfCellIncX;
 *     FLOAT gmfCellIncY;
 * }
 * }
 */
public class _GLYPHMETRICSFLOAT {

    _GLYPHMETRICSFLOAT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_FLOAT.withName("gmfBlackBoxX"),
        Windows_h.C_FLOAT.withName("gmfBlackBoxY"),
        _POINTFLOAT.layout().withName("gmfptGlyphOrigin"),
        Windows_h.C_FLOAT.withName("gmfCellIncX"),
        Windows_h.C_FLOAT.withName("gmfCellIncY")
    ).withName("_GLYPHMETRICSFLOAT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat gmfBlackBoxX$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("gmfBlackBoxX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FLOAT gmfBlackBoxX
     * }
     */
    public static final OfFloat gmfBlackBoxX$layout() {
        return gmfBlackBoxX$LAYOUT;
    }

    private static final long gmfBlackBoxX$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FLOAT gmfBlackBoxX
     * }
     */
    public static final long gmfBlackBoxX$offset() {
        return gmfBlackBoxX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FLOAT gmfBlackBoxX
     * }
     */
    public static float gmfBlackBoxX(MemorySegment struct) {
        return struct.get(gmfBlackBoxX$LAYOUT, gmfBlackBoxX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FLOAT gmfBlackBoxX
     * }
     */
    public static void gmfBlackBoxX(MemorySegment struct, float fieldValue) {
        struct.set(gmfBlackBoxX$LAYOUT, gmfBlackBoxX$OFFSET, fieldValue);
    }

    private static final OfFloat gmfBlackBoxY$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("gmfBlackBoxY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FLOAT gmfBlackBoxY
     * }
     */
    public static final OfFloat gmfBlackBoxY$layout() {
        return gmfBlackBoxY$LAYOUT;
    }

    private static final long gmfBlackBoxY$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FLOAT gmfBlackBoxY
     * }
     */
    public static final long gmfBlackBoxY$offset() {
        return gmfBlackBoxY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FLOAT gmfBlackBoxY
     * }
     */
    public static float gmfBlackBoxY(MemorySegment struct) {
        return struct.get(gmfBlackBoxY$LAYOUT, gmfBlackBoxY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FLOAT gmfBlackBoxY
     * }
     */
    public static void gmfBlackBoxY(MemorySegment struct, float fieldValue) {
        struct.set(gmfBlackBoxY$LAYOUT, gmfBlackBoxY$OFFSET, fieldValue);
    }

    private static final GroupLayout gmfptGlyphOrigin$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("gmfptGlyphOrigin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTFLOAT gmfptGlyphOrigin
     * }
     */
    public static final GroupLayout gmfptGlyphOrigin$layout() {
        return gmfptGlyphOrigin$LAYOUT;
    }

    private static final long gmfptGlyphOrigin$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTFLOAT gmfptGlyphOrigin
     * }
     */
    public static final long gmfptGlyphOrigin$offset() {
        return gmfptGlyphOrigin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTFLOAT gmfptGlyphOrigin
     * }
     */
    public static MemorySegment gmfptGlyphOrigin(MemorySegment struct) {
        return struct.asSlice(gmfptGlyphOrigin$OFFSET, gmfptGlyphOrigin$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTFLOAT gmfptGlyphOrigin
     * }
     */
    public static void gmfptGlyphOrigin(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, gmfptGlyphOrigin$OFFSET, gmfptGlyphOrigin$LAYOUT.byteSize());
    }

    private static final OfFloat gmfCellIncX$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("gmfCellIncX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FLOAT gmfCellIncX
     * }
     */
    public static final OfFloat gmfCellIncX$layout() {
        return gmfCellIncX$LAYOUT;
    }

    private static final long gmfCellIncX$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FLOAT gmfCellIncX
     * }
     */
    public static final long gmfCellIncX$offset() {
        return gmfCellIncX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FLOAT gmfCellIncX
     * }
     */
    public static float gmfCellIncX(MemorySegment struct) {
        return struct.get(gmfCellIncX$LAYOUT, gmfCellIncX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FLOAT gmfCellIncX
     * }
     */
    public static void gmfCellIncX(MemorySegment struct, float fieldValue) {
        struct.set(gmfCellIncX$LAYOUT, gmfCellIncX$OFFSET, fieldValue);
    }

    private static final OfFloat gmfCellIncY$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("gmfCellIncY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FLOAT gmfCellIncY
     * }
     */
    public static final OfFloat gmfCellIncY$layout() {
        return gmfCellIncY$LAYOUT;
    }

    private static final long gmfCellIncY$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FLOAT gmfCellIncY
     * }
     */
    public static final long gmfCellIncY$offset() {
        return gmfCellIncY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FLOAT gmfCellIncY
     * }
     */
    public static float gmfCellIncY(MemorySegment struct) {
        return struct.get(gmfCellIncY$LAYOUT, gmfCellIncY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FLOAT gmfCellIncY
     * }
     */
    public static void gmfCellIncY(MemorySegment struct, float fieldValue) {
        struct.set(gmfCellIncY$LAYOUT, gmfCellIncY$OFFSET, fieldValue);
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

