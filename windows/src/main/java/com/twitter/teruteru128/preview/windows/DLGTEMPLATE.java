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
 * struct {
 *     DWORD style;
 *     DWORD dwExtendedStyle;
 *     WORD cdit;
 *     short x;
 *     short y;
 *     short cx;
 *     short cy;
 * }
 * }
 */
public class DLGTEMPLATE {

    DLGTEMPLATE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_LONG, 2).withName("style"),
        Windows_h.align(Windows_h.C_LONG, 2).withName("dwExtendedStyle"),
        Windows_h.C_SHORT.withName("cdit"),
        Windows_h.C_SHORT.withName("x"),
        Windows_h.C_SHORT.withName("y"),
        Windows_h.C_SHORT.withName("cx"),
        Windows_h.C_SHORT.withName("cy")
    ).withName("$anon$4905:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt style$LAYOUT = (OfInt)$LAYOUT.select(groupElement("style"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD style
     * }
     */
    public static final OfInt style$layout() {
        return style$LAYOUT;
    }

    private static final long style$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD style
     * }
     */
    public static final long style$offset() {
        return style$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD style
     * }
     */
    public static int style(MemorySegment struct) {
        return struct.get(style$LAYOUT, style$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD style
     * }
     */
    public static void style(MemorySegment struct, int fieldValue) {
        struct.set(style$LAYOUT, style$OFFSET, fieldValue);
    }

    private static final OfInt dwExtendedStyle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwExtendedStyle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwExtendedStyle
     * }
     */
    public static final OfInt dwExtendedStyle$layout() {
        return dwExtendedStyle$LAYOUT;
    }

    private static final long dwExtendedStyle$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwExtendedStyle
     * }
     */
    public static final long dwExtendedStyle$offset() {
        return dwExtendedStyle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwExtendedStyle
     * }
     */
    public static int dwExtendedStyle(MemorySegment struct) {
        return struct.get(dwExtendedStyle$LAYOUT, dwExtendedStyle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwExtendedStyle
     * }
     */
    public static void dwExtendedStyle(MemorySegment struct, int fieldValue) {
        struct.set(dwExtendedStyle$LAYOUT, dwExtendedStyle$OFFSET, fieldValue);
    }

    private static final OfShort cdit$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cdit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD cdit
     * }
     */
    public static final OfShort cdit$layout() {
        return cdit$LAYOUT;
    }

    private static final long cdit$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD cdit
     * }
     */
    public static final long cdit$offset() {
        return cdit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD cdit
     * }
     */
    public static short cdit(MemorySegment struct) {
        return struct.get(cdit$LAYOUT, cdit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD cdit
     * }
     */
    public static void cdit(MemorySegment struct, short fieldValue) {
        struct.set(cdit$LAYOUT, cdit$OFFSET, fieldValue);
    }

    private static final OfShort x$LAYOUT = (OfShort)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short x
     * }
     */
    public static final OfShort x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short x
     * }
     */
    public static short x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short x
     * }
     */
    public static void x(MemorySegment struct, short fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfShort y$LAYOUT = (OfShort)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short y
     * }
     */
    public static final OfShort y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short y
     * }
     */
    public static short y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short y
     * }
     */
    public static void y(MemorySegment struct, short fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfShort cx$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short cx
     * }
     */
    public static final OfShort cx$layout() {
        return cx$LAYOUT;
    }

    private static final long cx$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short cx
     * }
     */
    public static final long cx$offset() {
        return cx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short cx
     * }
     */
    public static short cx(MemorySegment struct) {
        return struct.get(cx$LAYOUT, cx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short cx
     * }
     */
    public static void cx(MemorySegment struct, short fieldValue) {
        struct.set(cx$LAYOUT, cx$OFFSET, fieldValue);
    }

    private static final OfShort cy$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short cy
     * }
     */
    public static final OfShort cy$layout() {
        return cy$LAYOUT;
    }

    private static final long cy$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short cy
     * }
     */
    public static final long cy$offset() {
        return cy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short cy
     * }
     */
    public static short cy(MemorySegment struct) {
        return struct.get(cy$LAYOUT, cy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short cy
     * }
     */
    public static void cy(MemorySegment struct, short fieldValue) {
        struct.set(cy$LAYOUT, cy$OFFSET, fieldValue);
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

