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
 * struct wavehdr_tag {
 *     LPSTR lpData;
 *     DWORD dwBufferLength;
 *     DWORD dwBytesRecorded;
 *     DWORD_PTR dwUser;
 *     DWORD dwFlags;
 *     DWORD dwLoops;
 *     struct wavehdr_tag *lpNext;
 *     DWORD_PTR reserved;
 * }
 * }
 */
public class wavehdr_tag {

    wavehdr_tag() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_POINTER, 1).withName("lpData"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwBufferLength"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwBytesRecorded"),
        Windows_h.align(Windows_h.C_LONG_LONG, 1).withName("dwUser"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwFlags"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwLoops"),
        Windows_h.align(Windows_h.C_POINTER, 1).withName("lpNext"),
        Windows_h.align(Windows_h.C_LONG_LONG, 1).withName("reserved")
    ).withName("wavehdr_tag");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout lpData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR lpData
     * }
     */
    public static final AddressLayout lpData$layout() {
        return lpData$LAYOUT;
    }

    private static final long lpData$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR lpData
     * }
     */
    public static final long lpData$offset() {
        return lpData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR lpData
     * }
     */
    public static MemorySegment lpData(MemorySegment struct) {
        return struct.get(lpData$LAYOUT, lpData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR lpData
     * }
     */
    public static void lpData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpData$LAYOUT, lpData$OFFSET, fieldValue);
    }

    private static final OfInt dwBufferLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwBufferLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwBufferLength
     * }
     */
    public static final OfInt dwBufferLength$layout() {
        return dwBufferLength$LAYOUT;
    }

    private static final long dwBufferLength$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwBufferLength
     * }
     */
    public static final long dwBufferLength$offset() {
        return dwBufferLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwBufferLength
     * }
     */
    public static int dwBufferLength(MemorySegment struct) {
        return struct.get(dwBufferLength$LAYOUT, dwBufferLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwBufferLength
     * }
     */
    public static void dwBufferLength(MemorySegment struct, int fieldValue) {
        struct.set(dwBufferLength$LAYOUT, dwBufferLength$OFFSET, fieldValue);
    }

    private static final OfInt dwBytesRecorded$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwBytesRecorded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwBytesRecorded
     * }
     */
    public static final OfInt dwBytesRecorded$layout() {
        return dwBytesRecorded$LAYOUT;
    }

    private static final long dwBytesRecorded$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwBytesRecorded
     * }
     */
    public static final long dwBytesRecorded$offset() {
        return dwBytesRecorded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwBytesRecorded
     * }
     */
    public static int dwBytesRecorded(MemorySegment struct) {
        return struct.get(dwBytesRecorded$LAYOUT, dwBytesRecorded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwBytesRecorded
     * }
     */
    public static void dwBytesRecorded(MemorySegment struct, int fieldValue) {
        struct.set(dwBytesRecorded$LAYOUT, dwBytesRecorded$OFFSET, fieldValue);
    }

    private static final OfLong dwUser$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwUser"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD_PTR dwUser
     * }
     */
    public static final OfLong dwUser$layout() {
        return dwUser$LAYOUT;
    }

    private static final long dwUser$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD_PTR dwUser
     * }
     */
    public static final long dwUser$offset() {
        return dwUser$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwUser
     * }
     */
    public static long dwUser(MemorySegment struct) {
        return struct.get(dwUser$LAYOUT, dwUser$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwUser
     * }
     */
    public static void dwUser(MemorySegment struct, long fieldValue) {
        struct.set(dwUser$LAYOUT, dwUser$OFFSET, fieldValue);
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

    private static final long dwFlags$OFFSET = 24;

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

    private static final OfInt dwLoops$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwLoops"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwLoops
     * }
     */
    public static final OfInt dwLoops$layout() {
        return dwLoops$LAYOUT;
    }

    private static final long dwLoops$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwLoops
     * }
     */
    public static final long dwLoops$offset() {
        return dwLoops$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwLoops
     * }
     */
    public static int dwLoops(MemorySegment struct) {
        return struct.get(dwLoops$LAYOUT, dwLoops$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwLoops
     * }
     */
    public static void dwLoops(MemorySegment struct, int fieldValue) {
        struct.set(dwLoops$LAYOUT, dwLoops$OFFSET, fieldValue);
    }

    private static final AddressLayout lpNext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpNext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wavehdr_tag *lpNext
     * }
     */
    public static final AddressLayout lpNext$layout() {
        return lpNext$LAYOUT;
    }

    private static final long lpNext$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wavehdr_tag *lpNext
     * }
     */
    public static final long lpNext$offset() {
        return lpNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wavehdr_tag *lpNext
     * }
     */
    public static MemorySegment lpNext(MemorySegment struct) {
        return struct.get(lpNext$LAYOUT, lpNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wavehdr_tag *lpNext
     * }
     */
    public static void lpNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpNext$LAYOUT, lpNext$OFFSET, fieldValue);
    }

    private static final OfLong reserved$LAYOUT = (OfLong)$LAYOUT.select(groupElement("reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD_PTR reserved
     * }
     */
    public static final OfLong reserved$layout() {
        return reserved$LAYOUT;
    }

    private static final long reserved$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD_PTR reserved
     * }
     */
    public static final long reserved$offset() {
        return reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD_PTR reserved
     * }
     */
    public static long reserved(MemorySegment struct) {
        return struct.get(reserved$LAYOUT, reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD_PTR reserved
     * }
     */
    public static void reserved(MemorySegment struct, long fieldValue) {
        struct.set(reserved$LAYOUT, reserved$OFFSET, fieldValue);
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

