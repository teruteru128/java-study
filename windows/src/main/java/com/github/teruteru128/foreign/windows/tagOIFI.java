// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * struct tagOIFI {
 *     UINT cb;
 *     BOOL fMDIApp;
 *     HWND hwndFrame;
 *     HACCEL haccel;
 *     UINT cAccelEntries;
 * }
 * }
 */
public class tagOIFI {

    tagOIFI() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("cb"),
        Windows_h.C_INT.withName("fMDIApp"),
        Windows_h.C_POINTER.withName("hwndFrame"),
        Windows_h.C_POINTER.withName("haccel"),
        Windows_h.C_INT.withName("cAccelEntries"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagOIFI");

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
     * UINT cb
     * }
     */
    public static final OfInt cb$layout() {
        return cb$LAYOUT;
    }

    private static final long cb$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT cb
     * }
     */
    public static final long cb$offset() {
        return cb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT cb
     * }
     */
    public static int cb(MemorySegment struct) {
        return struct.get(cb$LAYOUT, cb$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT cb
     * }
     */
    public static void cb(MemorySegment struct, int fieldValue) {
        struct.set(cb$LAYOUT, cb$OFFSET, fieldValue);
    }

    private static final OfInt fMDIApp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fMDIApp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fMDIApp
     * }
     */
    public static final OfInt fMDIApp$layout() {
        return fMDIApp$LAYOUT;
    }

    private static final long fMDIApp$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fMDIApp
     * }
     */
    public static final long fMDIApp$offset() {
        return fMDIApp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fMDIApp
     * }
     */
    public static int fMDIApp(MemorySegment struct) {
        return struct.get(fMDIApp$LAYOUT, fMDIApp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fMDIApp
     * }
     */
    public static void fMDIApp(MemorySegment struct, int fieldValue) {
        struct.set(fMDIApp$LAYOUT, fMDIApp$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndFrame$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndFrame"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndFrame
     * }
     */
    public static final AddressLayout hwndFrame$layout() {
        return hwndFrame$LAYOUT;
    }

    private static final long hwndFrame$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndFrame
     * }
     */
    public static final long hwndFrame$offset() {
        return hwndFrame$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndFrame
     * }
     */
    public static MemorySegment hwndFrame(MemorySegment struct) {
        return struct.get(hwndFrame$LAYOUT, hwndFrame$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndFrame
     * }
     */
    public static void hwndFrame(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndFrame$LAYOUT, hwndFrame$OFFSET, fieldValue);
    }

    private static final AddressLayout haccel$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("haccel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HACCEL haccel
     * }
     */
    public static final AddressLayout haccel$layout() {
        return haccel$LAYOUT;
    }

    private static final long haccel$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HACCEL haccel
     * }
     */
    public static final long haccel$offset() {
        return haccel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HACCEL haccel
     * }
     */
    public static MemorySegment haccel(MemorySegment struct) {
        return struct.get(haccel$LAYOUT, haccel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HACCEL haccel
     * }
     */
    public static void haccel(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(haccel$LAYOUT, haccel$OFFSET, fieldValue);
    }

    private static final OfInt cAccelEntries$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cAccelEntries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT cAccelEntries
     * }
     */
    public static final OfInt cAccelEntries$layout() {
        return cAccelEntries$LAYOUT;
    }

    private static final long cAccelEntries$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT cAccelEntries
     * }
     */
    public static final long cAccelEntries$offset() {
        return cAccelEntries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT cAccelEntries
     * }
     */
    public static int cAccelEntries(MemorySegment struct) {
        return struct.get(cAccelEntries$LAYOUT, cAccelEntries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT cAccelEntries
     * }
     */
    public static void cAccelEntries(MemorySegment struct, int fieldValue) {
        struct.set(cAccelEntries$LAYOUT, cAccelEntries$OFFSET, fieldValue);
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
