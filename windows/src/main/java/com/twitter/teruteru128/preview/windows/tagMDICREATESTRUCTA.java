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
 * struct tagMDICREATESTRUCTA {
 *     LPCSTR szClass;
 *     LPCSTR szTitle;
 *     HANDLE hOwner;
 *     int x;
 *     int y;
 *     int cx;
 *     int cy;
 *     DWORD style;
 *     LPARAM lParam;
 * }
 * }
 */
public class tagMDICREATESTRUCTA {

    tagMDICREATESTRUCTA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("szClass"),
        Windows_h.C_POINTER.withName("szTitle"),
        Windows_h.C_POINTER.withName("hOwner"),
        Windows_h.C_INT.withName("x"),
        Windows_h.C_INT.withName("y"),
        Windows_h.C_INT.withName("cx"),
        Windows_h.C_INT.withName("cy"),
        Windows_h.C_LONG.withName("style"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG_LONG.withName("lParam")
    ).withName("tagMDICREATESTRUCTA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout szClass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("szClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR szClass
     * }
     */
    public static final AddressLayout szClass$layout() {
        return szClass$LAYOUT;
    }

    private static final long szClass$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR szClass
     * }
     */
    public static final long szClass$offset() {
        return szClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR szClass
     * }
     */
    public static MemorySegment szClass(MemorySegment struct) {
        return struct.get(szClass$LAYOUT, szClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR szClass
     * }
     */
    public static void szClass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(szClass$LAYOUT, szClass$OFFSET, fieldValue);
    }

    private static final AddressLayout szTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("szTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR szTitle
     * }
     */
    public static final AddressLayout szTitle$layout() {
        return szTitle$LAYOUT;
    }

    private static final long szTitle$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR szTitle
     * }
     */
    public static final long szTitle$offset() {
        return szTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR szTitle
     * }
     */
    public static MemorySegment szTitle(MemorySegment struct) {
        return struct.get(szTitle$LAYOUT, szTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR szTitle
     * }
     */
    public static void szTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(szTitle$LAYOUT, szTitle$OFFSET, fieldValue);
    }

    private static final AddressLayout hOwner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hOwner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hOwner
     * }
     */
    public static final AddressLayout hOwner$layout() {
        return hOwner$LAYOUT;
    }

    private static final long hOwner$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hOwner
     * }
     */
    public static final long hOwner$offset() {
        return hOwner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hOwner
     * }
     */
    public static MemorySegment hOwner(MemorySegment struct) {
        return struct.get(hOwner$LAYOUT, hOwner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hOwner
     * }
     */
    public static void hOwner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hOwner$LAYOUT, hOwner$OFFSET, fieldValue);
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfInt cx$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static final OfInt cx$layout() {
        return cx$LAYOUT;
    }

    private static final long cx$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static final long cx$offset() {
        return cx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static int cx(MemorySegment struct) {
        return struct.get(cx$LAYOUT, cx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static void cx(MemorySegment struct, int fieldValue) {
        struct.set(cx$LAYOUT, cx$OFFSET, fieldValue);
    }

    private static final OfInt cy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static final OfInt cy$layout() {
        return cy$LAYOUT;
    }

    private static final long cy$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static final long cy$offset() {
        return cy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static int cy(MemorySegment struct) {
        return struct.get(cy$LAYOUT, cy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static void cy(MemorySegment struct, int fieldValue) {
        struct.set(cy$LAYOUT, cy$OFFSET, fieldValue);
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

    private static final long style$OFFSET = 40;

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

    private static final OfLong lParam$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lParam"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static final OfLong lParam$layout() {
        return lParam$LAYOUT;
    }

    private static final long lParam$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static final long lParam$offset() {
        return lParam$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static long lParam(MemorySegment struct) {
        return struct.get(lParam$LAYOUT, lParam$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static void lParam(MemorySegment struct, long fieldValue) {
        struct.set(lParam$LAYOUT, lParam$OFFSET, fieldValue);
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

