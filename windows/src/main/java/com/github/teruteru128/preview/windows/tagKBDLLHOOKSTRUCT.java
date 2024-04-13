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
 * struct tagKBDLLHOOKSTRUCT {
 *     DWORD vkCode;
 *     DWORD scanCode;
 *     DWORD flags;
 *     DWORD time;
 *     ULONG_PTR dwExtraInfo;
 * }
 * }
 */
public class tagKBDLLHOOKSTRUCT {

    tagKBDLLHOOKSTRUCT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("vkCode"),
        Windows_h.C_LONG.withName("scanCode"),
        Windows_h.C_LONG.withName("flags"),
        Windows_h.C_LONG.withName("time"),
        Windows_h.C_LONG_LONG.withName("dwExtraInfo")
    ).withName("tagKBDLLHOOKSTRUCT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt vkCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("vkCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD vkCode
     * }
     */
    public static final OfInt vkCode$layout() {
        return vkCode$LAYOUT;
    }

    private static final long vkCode$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD vkCode
     * }
     */
    public static final long vkCode$offset() {
        return vkCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD vkCode
     * }
     */
    public static int vkCode(MemorySegment struct) {
        return struct.get(vkCode$LAYOUT, vkCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD vkCode
     * }
     */
    public static void vkCode(MemorySegment struct, int fieldValue) {
        struct.set(vkCode$LAYOUT, vkCode$OFFSET, fieldValue);
    }

    private static final OfInt scanCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("scanCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD scanCode
     * }
     */
    public static final OfInt scanCode$layout() {
        return scanCode$LAYOUT;
    }

    private static final long scanCode$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD scanCode
     * }
     */
    public static final long scanCode$offset() {
        return scanCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD scanCode
     * }
     */
    public static int scanCode(MemorySegment struct) {
        return struct.get(scanCode$LAYOUT, scanCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD scanCode
     * }
     */
    public static void scanCode(MemorySegment struct, int fieldValue) {
        struct.set(scanCode$LAYOUT, scanCode$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
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

    private static final long time$OFFSET = 12;

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
