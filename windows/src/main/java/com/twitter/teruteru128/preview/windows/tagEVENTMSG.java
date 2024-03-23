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
 * struct tagEVENTMSG {
 *     UINT message;
 *     UINT paramL;
 *     UINT paramH;
 *     DWORD time;
 *     HWND hwnd;
 * }
 * }
 */
public class tagEVENTMSG {

    tagEVENTMSG() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("message"),
        Windows_h.C_INT.withName("paramL"),
        Windows_h.C_INT.withName("paramH"),
        Windows_h.C_LONG.withName("time"),
        Windows_h.C_POINTER.withName("hwnd")
    ).withName("tagEVENTMSG");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt message$LAYOUT = (OfInt)$LAYOUT.select(groupElement("message"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT message
     * }
     */
    public static final OfInt message$layout() {
        return message$LAYOUT;
    }

    private static final long message$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT message
     * }
     */
    public static final long message$offset() {
        return message$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT message
     * }
     */
    public static int message(MemorySegment struct) {
        return struct.get(message$LAYOUT, message$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT message
     * }
     */
    public static void message(MemorySegment struct, int fieldValue) {
        struct.set(message$LAYOUT, message$OFFSET, fieldValue);
    }

    private static final OfInt paramL$LAYOUT = (OfInt)$LAYOUT.select(groupElement("paramL"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT paramL
     * }
     */
    public static final OfInt paramL$layout() {
        return paramL$LAYOUT;
    }

    private static final long paramL$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT paramL
     * }
     */
    public static final long paramL$offset() {
        return paramL$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT paramL
     * }
     */
    public static int paramL(MemorySegment struct) {
        return struct.get(paramL$LAYOUT, paramL$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT paramL
     * }
     */
    public static void paramL(MemorySegment struct, int fieldValue) {
        struct.set(paramL$LAYOUT, paramL$OFFSET, fieldValue);
    }

    private static final OfInt paramH$LAYOUT = (OfInt)$LAYOUT.select(groupElement("paramH"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT paramH
     * }
     */
    public static final OfInt paramH$layout() {
        return paramH$LAYOUT;
    }

    private static final long paramH$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT paramH
     * }
     */
    public static final long paramH$offset() {
        return paramH$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT paramH
     * }
     */
    public static int paramH(MemorySegment struct) {
        return struct.get(paramH$LAYOUT, paramH$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT paramH
     * }
     */
    public static void paramH(MemorySegment struct, int fieldValue) {
        struct.set(paramH$LAYOUT, paramH$OFFSET, fieldValue);
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

    private static final AddressLayout hwnd$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwnd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static final AddressLayout hwnd$layout() {
        return hwnd$LAYOUT;
    }

    private static final long hwnd$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static final long hwnd$offset() {
        return hwnd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static MemorySegment hwnd(MemorySegment struct) {
        return struct.get(hwnd$LAYOUT, hwnd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static void hwnd(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwnd$LAYOUT, hwnd$OFFSET, fieldValue);
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

