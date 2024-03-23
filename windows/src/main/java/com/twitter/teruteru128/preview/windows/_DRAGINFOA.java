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
 * struct _DRAGINFOA {
 *     UINT uSize;
 *     POINT pt;
 *     BOOL fNC;
 *     PZZSTR lpFileList;
 *     DWORD grfKeyState;
 * }
 * }
 */
public class _DRAGINFOA {

    _DRAGINFOA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("uSize"),
        tagPOINT.layout().withName("pt"),
        Windows_h.C_INT.withName("fNC"),
        Windows_h.C_POINTER.withName("lpFileList"),
        Windows_h.C_LONG.withName("grfKeyState"),
        MemoryLayout.paddingLayout(4)
    ).withName("_DRAGINFOA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt uSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("uSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT uSize
     * }
     */
    public static final OfInt uSize$layout() {
        return uSize$LAYOUT;
    }

    private static final long uSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT uSize
     * }
     */
    public static final long uSize$offset() {
        return uSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT uSize
     * }
     */
    public static int uSize(MemorySegment struct) {
        return struct.get(uSize$LAYOUT, uSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT uSize
     * }
     */
    public static void uSize(MemorySegment struct, int fieldValue) {
        struct.set(uSize$LAYOUT, uSize$OFFSET, fieldValue);
    }

    private static final GroupLayout pt$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINT pt
     * }
     */
    public static final GroupLayout pt$layout() {
        return pt$LAYOUT;
    }

    private static final long pt$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINT pt
     * }
     */
    public static final long pt$offset() {
        return pt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINT pt
     * }
     */
    public static MemorySegment pt(MemorySegment struct) {
        return struct.asSlice(pt$OFFSET, pt$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINT pt
     * }
     */
    public static void pt(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pt$OFFSET, pt$LAYOUT.byteSize());
    }

    private static final OfInt fNC$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fNC"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fNC
     * }
     */
    public static final OfInt fNC$layout() {
        return fNC$LAYOUT;
    }

    private static final long fNC$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fNC
     * }
     */
    public static final long fNC$offset() {
        return fNC$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fNC
     * }
     */
    public static int fNC(MemorySegment struct) {
        return struct.get(fNC$LAYOUT, fNC$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fNC
     * }
     */
    public static void fNC(MemorySegment struct, int fieldValue) {
        struct.set(fNC$LAYOUT, fNC$OFFSET, fieldValue);
    }

    private static final AddressLayout lpFileList$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpFileList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PZZSTR lpFileList
     * }
     */
    public static final AddressLayout lpFileList$layout() {
        return lpFileList$LAYOUT;
    }

    private static final long lpFileList$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PZZSTR lpFileList
     * }
     */
    public static final long lpFileList$offset() {
        return lpFileList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PZZSTR lpFileList
     * }
     */
    public static MemorySegment lpFileList(MemorySegment struct) {
        return struct.get(lpFileList$LAYOUT, lpFileList$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PZZSTR lpFileList
     * }
     */
    public static void lpFileList(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpFileList$LAYOUT, lpFileList$OFFSET, fieldValue);
    }

    private static final OfInt grfKeyState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("grfKeyState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD grfKeyState
     * }
     */
    public static final OfInt grfKeyState$layout() {
        return grfKeyState$LAYOUT;
    }

    private static final long grfKeyState$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD grfKeyState
     * }
     */
    public static final long grfKeyState$offset() {
        return grfKeyState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD grfKeyState
     * }
     */
    public static int grfKeyState(MemorySegment struct) {
        return struct.get(grfKeyState$LAYOUT, grfKeyState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD grfKeyState
     * }
     */
    public static void grfKeyState(MemorySegment struct, int fieldValue) {
        struct.set(grfKeyState$LAYOUT, grfKeyState$OFFSET, fieldValue);
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

