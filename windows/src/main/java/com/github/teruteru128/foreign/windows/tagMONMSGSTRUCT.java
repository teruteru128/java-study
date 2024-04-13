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
 * struct tagMONMSGSTRUCT {
 *     UINT cb;
 *     HWND hwndTo;
 *     DWORD dwTime;
 *     HANDLE hTask;
 *     UINT wMsg;
 *     WPARAM wParam;
 *     LPARAM lParam;
 *     DDEML_MSG_HOOK_DATA dmhd;
 * }
 * }
 */
public class tagMONMSGSTRUCT {

    tagMONMSGSTRUCT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("cb"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hwndTo"),
        Windows_h.C_LONG.withName("dwTime"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hTask"),
        Windows_h.C_INT.withName("wMsg"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG_LONG.withName("wParam"),
        Windows_h.C_LONG_LONG.withName("lParam"),
        tagDDEML_MSG_HOOK_DATA.layout().withName("dmhd")
    ).withName("tagMONMSGSTRUCT");

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

    private static final AddressLayout hwndTo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndTo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndTo
     * }
     */
    public static final AddressLayout hwndTo$layout() {
        return hwndTo$LAYOUT;
    }

    private static final long hwndTo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndTo
     * }
     */
    public static final long hwndTo$offset() {
        return hwndTo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndTo
     * }
     */
    public static MemorySegment hwndTo(MemorySegment struct) {
        return struct.get(hwndTo$LAYOUT, hwndTo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndTo
     * }
     */
    public static void hwndTo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndTo$LAYOUT, hwndTo$OFFSET, fieldValue);
    }

    private static final OfInt dwTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static final OfInt dwTime$layout() {
        return dwTime$LAYOUT;
    }

    private static final long dwTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static final long dwTime$offset() {
        return dwTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static int dwTime(MemorySegment struct) {
        return struct.get(dwTime$LAYOUT, dwTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static void dwTime(MemorySegment struct, int fieldValue) {
        struct.set(dwTime$LAYOUT, dwTime$OFFSET, fieldValue);
    }

    private static final AddressLayout hTask$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hTask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hTask
     * }
     */
    public static final AddressLayout hTask$layout() {
        return hTask$LAYOUT;
    }

    private static final long hTask$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hTask
     * }
     */
    public static final long hTask$offset() {
        return hTask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hTask
     * }
     */
    public static MemorySegment hTask(MemorySegment struct) {
        return struct.get(hTask$LAYOUT, hTask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hTask
     * }
     */
    public static void hTask(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hTask$LAYOUT, hTask$OFFSET, fieldValue);
    }

    private static final OfInt wMsg$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wMsg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wMsg
     * }
     */
    public static final OfInt wMsg$layout() {
        return wMsg$LAYOUT;
    }

    private static final long wMsg$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wMsg
     * }
     */
    public static final long wMsg$offset() {
        return wMsg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wMsg
     * }
     */
    public static int wMsg(MemorySegment struct) {
        return struct.get(wMsg$LAYOUT, wMsg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wMsg
     * }
     */
    public static void wMsg(MemorySegment struct, int fieldValue) {
        struct.set(wMsg$LAYOUT, wMsg$OFFSET, fieldValue);
    }

    private static final OfLong wParam$LAYOUT = (OfLong)$LAYOUT.select(groupElement("wParam"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WPARAM wParam
     * }
     */
    public static final OfLong wParam$layout() {
        return wParam$LAYOUT;
    }

    private static final long wParam$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WPARAM wParam
     * }
     */
    public static final long wParam$offset() {
        return wParam$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WPARAM wParam
     * }
     */
    public static long wParam(MemorySegment struct) {
        return struct.get(wParam$LAYOUT, wParam$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WPARAM wParam
     * }
     */
    public static void wParam(MemorySegment struct, long fieldValue) {
        struct.set(wParam$LAYOUT, wParam$OFFSET, fieldValue);
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

    private static final GroupLayout dmhd$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("dmhd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DDEML_MSG_HOOK_DATA dmhd
     * }
     */
    public static final GroupLayout dmhd$layout() {
        return dmhd$LAYOUT;
    }

    private static final long dmhd$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DDEML_MSG_HOOK_DATA dmhd
     * }
     */
    public static final long dmhd$offset() {
        return dmhd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DDEML_MSG_HOOK_DATA dmhd
     * }
     */
    public static MemorySegment dmhd(MemorySegment struct) {
        return struct.asSlice(dmhd$OFFSET, dmhd$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DDEML_MSG_HOOK_DATA dmhd
     * }
     */
    public static void dmhd(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dmhd$OFFSET, dmhd$LAYOUT.byteSize());
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
