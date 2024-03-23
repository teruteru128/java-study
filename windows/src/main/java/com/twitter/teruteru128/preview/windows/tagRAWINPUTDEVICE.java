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
 * struct tagRAWINPUTDEVICE {
 *     USHORT usUsagePage;
 *     USHORT usUsage;
 *     DWORD dwFlags;
 *     HWND hwndTarget;
 * }
 * }
 */
public class tagRAWINPUTDEVICE {

    tagRAWINPUTDEVICE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("usUsagePage"),
        Windows_h.C_SHORT.withName("usUsage"),
        Windows_h.C_LONG.withName("dwFlags"),
        Windows_h.C_POINTER.withName("hwndTarget")
    ).withName("tagRAWINPUTDEVICE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort usUsagePage$LAYOUT = (OfShort)$LAYOUT.select(groupElement("usUsagePage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT usUsagePage
     * }
     */
    public static final OfShort usUsagePage$layout() {
        return usUsagePage$LAYOUT;
    }

    private static final long usUsagePage$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT usUsagePage
     * }
     */
    public static final long usUsagePage$offset() {
        return usUsagePage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT usUsagePage
     * }
     */
    public static short usUsagePage(MemorySegment struct) {
        return struct.get(usUsagePage$LAYOUT, usUsagePage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT usUsagePage
     * }
     */
    public static void usUsagePage(MemorySegment struct, short fieldValue) {
        struct.set(usUsagePage$LAYOUT, usUsagePage$OFFSET, fieldValue);
    }

    private static final OfShort usUsage$LAYOUT = (OfShort)$LAYOUT.select(groupElement("usUsage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT usUsage
     * }
     */
    public static final OfShort usUsage$layout() {
        return usUsage$LAYOUT;
    }

    private static final long usUsage$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT usUsage
     * }
     */
    public static final long usUsage$offset() {
        return usUsage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT usUsage
     * }
     */
    public static short usUsage(MemorySegment struct) {
        return struct.get(usUsage$LAYOUT, usUsage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT usUsage
     * }
     */
    public static void usUsage(MemorySegment struct, short fieldValue) {
        struct.set(usUsage$LAYOUT, usUsage$OFFSET, fieldValue);
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

    private static final AddressLayout hwndTarget$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndTarget"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static final AddressLayout hwndTarget$layout() {
        return hwndTarget$LAYOUT;
    }

    private static final long hwndTarget$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static final long hwndTarget$offset() {
        return hwndTarget$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static MemorySegment hwndTarget(MemorySegment struct) {
        return struct.get(hwndTarget$LAYOUT, hwndTarget$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static void hwndTarget(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndTarget$LAYOUT, hwndTarget$OFFSET, fieldValue);
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

