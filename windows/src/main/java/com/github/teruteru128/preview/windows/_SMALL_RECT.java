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
 * struct _SMALL_RECT {
 *     SHORT Left;
 *     SHORT Top;
 *     SHORT Right;
 *     SHORT Bottom;
 * }
 * }
 */
public class _SMALL_RECT {

    _SMALL_RECT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("Left"),
        Windows_h.C_SHORT.withName("Top"),
        Windows_h.C_SHORT.withName("Right"),
        Windows_h.C_SHORT.withName("Bottom")
    ).withName("_SMALL_RECT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Left$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Left"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SHORT Left
     * }
     */
    public static final OfShort Left$layout() {
        return Left$LAYOUT;
    }

    private static final long Left$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SHORT Left
     * }
     */
    public static final long Left$offset() {
        return Left$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SHORT Left
     * }
     */
    public static short Left(MemorySegment struct) {
        return struct.get(Left$LAYOUT, Left$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SHORT Left
     * }
     */
    public static void Left(MemorySegment struct, short fieldValue) {
        struct.set(Left$LAYOUT, Left$OFFSET, fieldValue);
    }

    private static final OfShort Top$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Top"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SHORT Top
     * }
     */
    public static final OfShort Top$layout() {
        return Top$LAYOUT;
    }

    private static final long Top$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SHORT Top
     * }
     */
    public static final long Top$offset() {
        return Top$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SHORT Top
     * }
     */
    public static short Top(MemorySegment struct) {
        return struct.get(Top$LAYOUT, Top$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SHORT Top
     * }
     */
    public static void Top(MemorySegment struct, short fieldValue) {
        struct.set(Top$LAYOUT, Top$OFFSET, fieldValue);
    }

    private static final OfShort Right$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Right"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SHORT Right
     * }
     */
    public static final OfShort Right$layout() {
        return Right$LAYOUT;
    }

    private static final long Right$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SHORT Right
     * }
     */
    public static final long Right$offset() {
        return Right$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SHORT Right
     * }
     */
    public static short Right(MemorySegment struct) {
        return struct.get(Right$LAYOUT, Right$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SHORT Right
     * }
     */
    public static void Right(MemorySegment struct, short fieldValue) {
        struct.set(Right$LAYOUT, Right$OFFSET, fieldValue);
    }

    private static final OfShort Bottom$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Bottom"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SHORT Bottom
     * }
     */
    public static final OfShort Bottom$layout() {
        return Bottom$LAYOUT;
    }

    private static final long Bottom$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SHORT Bottom
     * }
     */
    public static final long Bottom$offset() {
        return Bottom$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SHORT Bottom
     * }
     */
    public static short Bottom(MemorySegment struct) {
        return struct.get(Bottom$LAYOUT, Bottom$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SHORT Bottom
     * }
     */
    public static void Bottom(MemorySegment struct, short fieldValue) {
        struct.set(Bottom$LAYOUT, Bottom$OFFSET, fieldValue);
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
