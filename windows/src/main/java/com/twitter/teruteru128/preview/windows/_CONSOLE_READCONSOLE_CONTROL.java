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
 * struct _CONSOLE_READCONSOLE_CONTROL {
 *     ULONG nLength;
 *     ULONG nInitialChars;
 *     ULONG dwCtrlWakeupMask;
 *     ULONG dwControlKeyState;
 * }
 * }
 */
public class _CONSOLE_READCONSOLE_CONTROL {

    _CONSOLE_READCONSOLE_CONTROL() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("nLength"),
        Windows_h.C_LONG.withName("nInitialChars"),
        Windows_h.C_LONG.withName("dwCtrlWakeupMask"),
        Windows_h.C_LONG.withName("dwControlKeyState")
    ).withName("_CONSOLE_READCONSOLE_CONTROL");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt nLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG nLength
     * }
     */
    public static final OfInt nLength$layout() {
        return nLength$LAYOUT;
    }

    private static final long nLength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG nLength
     * }
     */
    public static final long nLength$offset() {
        return nLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG nLength
     * }
     */
    public static int nLength(MemorySegment struct) {
        return struct.get(nLength$LAYOUT, nLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG nLength
     * }
     */
    public static void nLength(MemorySegment struct, int fieldValue) {
        struct.set(nLength$LAYOUT, nLength$OFFSET, fieldValue);
    }

    private static final OfInt nInitialChars$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nInitialChars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG nInitialChars
     * }
     */
    public static final OfInt nInitialChars$layout() {
        return nInitialChars$LAYOUT;
    }

    private static final long nInitialChars$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG nInitialChars
     * }
     */
    public static final long nInitialChars$offset() {
        return nInitialChars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG nInitialChars
     * }
     */
    public static int nInitialChars(MemorySegment struct) {
        return struct.get(nInitialChars$LAYOUT, nInitialChars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG nInitialChars
     * }
     */
    public static void nInitialChars(MemorySegment struct, int fieldValue) {
        struct.set(nInitialChars$LAYOUT, nInitialChars$OFFSET, fieldValue);
    }

    private static final OfInt dwCtrlWakeupMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCtrlWakeupMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwCtrlWakeupMask
     * }
     */
    public static final OfInt dwCtrlWakeupMask$layout() {
        return dwCtrlWakeupMask$LAYOUT;
    }

    private static final long dwCtrlWakeupMask$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwCtrlWakeupMask
     * }
     */
    public static final long dwCtrlWakeupMask$offset() {
        return dwCtrlWakeupMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwCtrlWakeupMask
     * }
     */
    public static int dwCtrlWakeupMask(MemorySegment struct) {
        return struct.get(dwCtrlWakeupMask$LAYOUT, dwCtrlWakeupMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwCtrlWakeupMask
     * }
     */
    public static void dwCtrlWakeupMask(MemorySegment struct, int fieldValue) {
        struct.set(dwCtrlWakeupMask$LAYOUT, dwCtrlWakeupMask$OFFSET, fieldValue);
    }

    private static final OfInt dwControlKeyState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwControlKeyState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwControlKeyState
     * }
     */
    public static final OfInt dwControlKeyState$layout() {
        return dwControlKeyState$LAYOUT;
    }

    private static final long dwControlKeyState$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwControlKeyState
     * }
     */
    public static final long dwControlKeyState$offset() {
        return dwControlKeyState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwControlKeyState
     * }
     */
    public static int dwControlKeyState(MemorySegment struct) {
        return struct.get(dwControlKeyState$LAYOUT, dwControlKeyState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwControlKeyState
     * }
     */
    public static void dwControlKeyState(MemorySegment struct, int fieldValue) {
        struct.set(dwControlKeyState$LAYOUT, dwControlKeyState$OFFSET, fieldValue);
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

