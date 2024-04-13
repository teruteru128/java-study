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
 * struct tagTRACKMOUSEEVENT {
 *     DWORD cbSize;
 *     DWORD dwFlags;
 *     HWND hwndTrack;
 *     DWORD dwHoverTime;
 * }
 * }
 */
public class tagTRACKMOUSEEVENT {

    tagTRACKMOUSEEVENT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        Windows_h.C_LONG.withName("dwFlags"),
        Windows_h.C_POINTER.withName("hwndTrack"),
        Windows_h.C_LONG.withName("dwHoverTime"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagTRACKMOUSEEVENT");

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
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndTrack$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndTrack"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndTrack
     * }
     */
    public static final AddressLayout hwndTrack$layout() {
        return hwndTrack$LAYOUT;
    }

    private static final long hwndTrack$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndTrack
     * }
     */
    public static final long hwndTrack$offset() {
        return hwndTrack$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndTrack
     * }
     */
    public static MemorySegment hwndTrack(MemorySegment struct) {
        return struct.get(hwndTrack$LAYOUT, hwndTrack$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndTrack
     * }
     */
    public static void hwndTrack(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndTrack$LAYOUT, hwndTrack$OFFSET, fieldValue);
    }

    private static final OfInt dwHoverTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwHoverTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwHoverTime
     * }
     */
    public static final OfInt dwHoverTime$layout() {
        return dwHoverTime$LAYOUT;
    }

    private static final long dwHoverTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwHoverTime
     * }
     */
    public static final long dwHoverTime$offset() {
        return dwHoverTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwHoverTime
     * }
     */
    public static int dwHoverTime(MemorySegment struct) {
        return struct.get(dwHoverTime$LAYOUT, dwHoverTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwHoverTime
     * }
     */
    public static void dwHoverTime(MemorySegment struct, int fieldValue) {
        struct.set(dwHoverTime$LAYOUT, dwHoverTime$OFFSET, fieldValue);
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
