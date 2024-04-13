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
 * struct tagKEYBDINPUT {
 *     WORD wVk;
 *     WORD wScan;
 *     DWORD dwFlags;
 *     DWORD time;
 *     ULONG_PTR dwExtraInfo;
 * }
 * }
 */
public class tagKEYBDINPUT {

    tagKEYBDINPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("wVk"),
        Windows_h.C_SHORT.withName("wScan"),
        Windows_h.C_LONG.withName("dwFlags"),
        Windows_h.C_LONG.withName("time"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG_LONG.withName("dwExtraInfo")
    ).withName("tagKEYBDINPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort wVk$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wVk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wVk
     * }
     */
    public static final OfShort wVk$layout() {
        return wVk$LAYOUT;
    }

    private static final long wVk$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wVk
     * }
     */
    public static final long wVk$offset() {
        return wVk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wVk
     * }
     */
    public static short wVk(MemorySegment struct) {
        return struct.get(wVk$LAYOUT, wVk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wVk
     * }
     */
    public static void wVk(MemorySegment struct, short fieldValue) {
        struct.set(wVk$LAYOUT, wVk$OFFSET, fieldValue);
    }

    private static final OfShort wScan$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wScan"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wScan
     * }
     */
    public static final OfShort wScan$layout() {
        return wScan$LAYOUT;
    }

    private static final long wScan$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wScan
     * }
     */
    public static final long wScan$offset() {
        return wScan$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wScan
     * }
     */
    public static short wScan(MemorySegment struct) {
        return struct.get(wScan$LAYOUT, wScan$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wScan
     * }
     */
    public static void wScan(MemorySegment struct, short fieldValue) {
        struct.set(wScan$LAYOUT, wScan$OFFSET, fieldValue);
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

    private static final OfInt time$LAYOUT = (OfInt)$LAYOUT.select(groupElement("time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD time
     * }
     */
    public static final OfInt time$layout() {
        return time$LAYOUT;
    }

    private static final long time$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD time
     * }
     */
    public static final long time$offset() {
        return time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD time
     * }
     */
    public static int time(MemorySegment struct) {
        return struct.get(time$LAYOUT, time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD time
     * }
     */
    public static void time(MemorySegment struct, int fieldValue) {
        struct.set(time$LAYOUT, time$OFFSET, fieldValue);
    }

    private static final OfLong dwExtraInfo$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwExtraInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static final OfLong dwExtraInfo$layout() {
        return dwExtraInfo$LAYOUT;
    }

    private static final long dwExtraInfo$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static final long dwExtraInfo$offset() {
        return dwExtraInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static long dwExtraInfo(MemorySegment struct) {
        return struct.get(dwExtraInfo$LAYOUT, dwExtraInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static void dwExtraInfo(MemorySegment struct, long fieldValue) {
        struct.set(dwExtraInfo$LAYOUT, dwExtraInfo$OFFSET, fieldValue);
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
