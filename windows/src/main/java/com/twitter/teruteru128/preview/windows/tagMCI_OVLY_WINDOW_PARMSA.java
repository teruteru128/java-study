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
 * struct tagMCI_OVLY_WINDOW_PARMSA {
 *     DWORD_PTR dwCallback;
 *     HWND hWnd;
 *     UINT nCmdShow;
 *     LPCSTR lpstrText;
 * }
 * }
 */
public class tagMCI_OVLY_WINDOW_PARMSA {

    tagMCI_OVLY_WINDOW_PARMSA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_LONG_LONG, 1).withName("dwCallback"),
        Windows_h.align(Windows_h.C_POINTER, 1).withName("hWnd"),
        Windows_h.align(Windows_h.C_INT, 1).withName("nCmdShow"),
        Windows_h.align(Windows_h.C_POINTER, 1).withName("lpstrText")
    ).withName("tagMCI_OVLY_WINDOW_PARMSA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong dwCallback$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static final OfLong dwCallback$layout() {
        return dwCallback$LAYOUT;
    }

    private static final long dwCallback$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static final long dwCallback$offset() {
        return dwCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static long dwCallback(MemorySegment struct) {
        return struct.get(dwCallback$LAYOUT, dwCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static void dwCallback(MemorySegment struct, long fieldValue) {
        struct.set(dwCallback$LAYOUT, dwCallback$OFFSET, fieldValue);
    }

    private static final AddressLayout hWnd$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hWnd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hWnd
     * }
     */
    public static final AddressLayout hWnd$layout() {
        return hWnd$LAYOUT;
    }

    private static final long hWnd$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hWnd
     * }
     */
    public static final long hWnd$offset() {
        return hWnd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hWnd
     * }
     */
    public static MemorySegment hWnd(MemorySegment struct) {
        return struct.get(hWnd$LAYOUT, hWnd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hWnd
     * }
     */
    public static void hWnd(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hWnd$LAYOUT, hWnd$OFFSET, fieldValue);
    }

    private static final OfInt nCmdShow$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nCmdShow"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT nCmdShow
     * }
     */
    public static final OfInt nCmdShow$layout() {
        return nCmdShow$LAYOUT;
    }

    private static final long nCmdShow$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT nCmdShow
     * }
     */
    public static final long nCmdShow$offset() {
        return nCmdShow$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT nCmdShow
     * }
     */
    public static int nCmdShow(MemorySegment struct) {
        return struct.get(nCmdShow$LAYOUT, nCmdShow$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT nCmdShow
     * }
     */
    public static void nCmdShow(MemorySegment struct, int fieldValue) {
        struct.set(nCmdShow$LAYOUT, nCmdShow$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrText$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrText"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpstrText
     * }
     */
    public static final AddressLayout lpstrText$layout() {
        return lpstrText$LAYOUT;
    }

    private static final long lpstrText$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpstrText
     * }
     */
    public static final long lpstrText$offset() {
        return lpstrText$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpstrText
     * }
     */
    public static MemorySegment lpstrText(MemorySegment struct) {
        return struct.get(lpstrText$LAYOUT, lpstrText$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpstrText
     * }
     */
    public static void lpstrText(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrText$LAYOUT, lpstrText$OFFSET, fieldValue);
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

