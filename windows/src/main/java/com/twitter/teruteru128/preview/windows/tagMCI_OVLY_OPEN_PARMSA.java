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
 * struct tagMCI_OVLY_OPEN_PARMSA {
 *     DWORD_PTR dwCallback;
 *     MCIDEVICEID wDeviceID;
 *     LPCSTR lpstrDeviceType;
 *     LPCSTR lpstrElementName;
 *     LPCSTR lpstrAlias;
 *     DWORD dwStyle;
 *     HWND hWndParent;
 * }
 * }
 */
public class tagMCI_OVLY_OPEN_PARMSA {

    tagMCI_OVLY_OPEN_PARMSA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_LONG_LONG, 1).withName("dwCallback"),
        Windows_h.align(Windows_h.C_INT, 1).withName("wDeviceID"),
        Windows_h.align(Windows_h.C_POINTER, 1).withName("lpstrDeviceType"),
        Windows_h.align(Windows_h.C_POINTER, 1).withName("lpstrElementName"),
        Windows_h.align(Windows_h.C_POINTER, 1).withName("lpstrAlias"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwStyle"),
        Windows_h.align(Windows_h.C_POINTER, 1).withName("hWndParent")
    ).withName("tagMCI_OVLY_OPEN_PARMSA");

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

    private static final OfInt wDeviceID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wDeviceID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MCIDEVICEID wDeviceID
     * }
     */
    public static final OfInt wDeviceID$layout() {
        return wDeviceID$LAYOUT;
    }

    private static final long wDeviceID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MCIDEVICEID wDeviceID
     * }
     */
    public static final long wDeviceID$offset() {
        return wDeviceID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MCIDEVICEID wDeviceID
     * }
     */
    public static int wDeviceID(MemorySegment struct) {
        return struct.get(wDeviceID$LAYOUT, wDeviceID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MCIDEVICEID wDeviceID
     * }
     */
    public static void wDeviceID(MemorySegment struct, int fieldValue) {
        struct.set(wDeviceID$LAYOUT, wDeviceID$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrDeviceType$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrDeviceType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpstrDeviceType
     * }
     */
    public static final AddressLayout lpstrDeviceType$layout() {
        return lpstrDeviceType$LAYOUT;
    }

    private static final long lpstrDeviceType$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpstrDeviceType
     * }
     */
    public static final long lpstrDeviceType$offset() {
        return lpstrDeviceType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpstrDeviceType
     * }
     */
    public static MemorySegment lpstrDeviceType(MemorySegment struct) {
        return struct.get(lpstrDeviceType$LAYOUT, lpstrDeviceType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpstrDeviceType
     * }
     */
    public static void lpstrDeviceType(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrDeviceType$LAYOUT, lpstrDeviceType$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrElementName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrElementName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpstrElementName
     * }
     */
    public static final AddressLayout lpstrElementName$layout() {
        return lpstrElementName$LAYOUT;
    }

    private static final long lpstrElementName$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpstrElementName
     * }
     */
    public static final long lpstrElementName$offset() {
        return lpstrElementName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpstrElementName
     * }
     */
    public static MemorySegment lpstrElementName(MemorySegment struct) {
        return struct.get(lpstrElementName$LAYOUT, lpstrElementName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpstrElementName
     * }
     */
    public static void lpstrElementName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrElementName$LAYOUT, lpstrElementName$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrAlias$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrAlias"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpstrAlias
     * }
     */
    public static final AddressLayout lpstrAlias$layout() {
        return lpstrAlias$LAYOUT;
    }

    private static final long lpstrAlias$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpstrAlias
     * }
     */
    public static final long lpstrAlias$offset() {
        return lpstrAlias$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpstrAlias
     * }
     */
    public static MemorySegment lpstrAlias(MemorySegment struct) {
        return struct.get(lpstrAlias$LAYOUT, lpstrAlias$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpstrAlias
     * }
     */
    public static void lpstrAlias(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrAlias$LAYOUT, lpstrAlias$OFFSET, fieldValue);
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

    private static final long dwStyle$OFFSET = 36;

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

    private static final AddressLayout hWndParent$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hWndParent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hWndParent
     * }
     */
    public static final AddressLayout hWndParent$layout() {
        return hWndParent$LAYOUT;
    }

    private static final long hWndParent$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hWndParent
     * }
     */
    public static final long hWndParent$offset() {
        return hWndParent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hWndParent
     * }
     */
    public static MemorySegment hWndParent(MemorySegment struct) {
        return struct.get(hWndParent$LAYOUT, hWndParent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hWndParent
     * }
     */
    public static void hWndParent(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hWndParent$LAYOUT, hWndParent$OFFSET, fieldValue);
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

