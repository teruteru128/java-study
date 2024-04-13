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
 * struct _JIT_DEBUG_INFO {
 *     DWORD dwSize;
 *     DWORD dwProcessorArchitecture;
 *     DWORD dwThreadID;
 *     DWORD dwReserved0;
 *     ULONG64 lpExceptionAddress;
 *     ULONG64 lpExceptionRecord;
 *     ULONG64 lpContextRecord;
 * }
 * }
 */
public class _JIT_DEBUG_INFO {

    _JIT_DEBUG_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwSize"),
        Windows_h.C_LONG.withName("dwProcessorArchitecture"),
        Windows_h.C_LONG.withName("dwThreadID"),
        Windows_h.C_LONG.withName("dwReserved0"),
        Windows_h.C_LONG_LONG.withName("lpExceptionAddress"),
        Windows_h.C_LONG_LONG.withName("lpExceptionRecord"),
        Windows_h.C_LONG_LONG.withName("lpContextRecord")
    ).withName("_JIT_DEBUG_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static final OfInt dwSize$layout() {
        return dwSize$LAYOUT;
    }

    private static final long dwSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static final long dwSize$offset() {
        return dwSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static int dwSize(MemorySegment struct) {
        return struct.get(dwSize$LAYOUT, dwSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static void dwSize(MemorySegment struct, int fieldValue) {
        struct.set(dwSize$LAYOUT, dwSize$OFFSET, fieldValue);
    }

    private static final OfInt dwProcessorArchitecture$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwProcessorArchitecture"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwProcessorArchitecture
     * }
     */
    public static final OfInt dwProcessorArchitecture$layout() {
        return dwProcessorArchitecture$LAYOUT;
    }

    private static final long dwProcessorArchitecture$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwProcessorArchitecture
     * }
     */
    public static final long dwProcessorArchitecture$offset() {
        return dwProcessorArchitecture$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwProcessorArchitecture
     * }
     */
    public static int dwProcessorArchitecture(MemorySegment struct) {
        return struct.get(dwProcessorArchitecture$LAYOUT, dwProcessorArchitecture$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwProcessorArchitecture
     * }
     */
    public static void dwProcessorArchitecture(MemorySegment struct, int fieldValue) {
        struct.set(dwProcessorArchitecture$LAYOUT, dwProcessorArchitecture$OFFSET, fieldValue);
    }

    private static final OfInt dwThreadID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwThreadID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwThreadID
     * }
     */
    public static final OfInt dwThreadID$layout() {
        return dwThreadID$LAYOUT;
    }

    private static final long dwThreadID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwThreadID
     * }
     */
    public static final long dwThreadID$offset() {
        return dwThreadID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwThreadID
     * }
     */
    public static int dwThreadID(MemorySegment struct) {
        return struct.get(dwThreadID$LAYOUT, dwThreadID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwThreadID
     * }
     */
    public static void dwThreadID(MemorySegment struct, int fieldValue) {
        struct.set(dwThreadID$LAYOUT, dwThreadID$OFFSET, fieldValue);
    }

    private static final OfInt dwReserved0$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwReserved0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwReserved0
     * }
     */
    public static final OfInt dwReserved0$layout() {
        return dwReserved0$LAYOUT;
    }

    private static final long dwReserved0$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwReserved0
     * }
     */
    public static final long dwReserved0$offset() {
        return dwReserved0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwReserved0
     * }
     */
    public static int dwReserved0(MemorySegment struct) {
        return struct.get(dwReserved0$LAYOUT, dwReserved0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwReserved0
     * }
     */
    public static void dwReserved0(MemorySegment struct, int fieldValue) {
        struct.set(dwReserved0$LAYOUT, dwReserved0$OFFSET, fieldValue);
    }

    private static final OfLong lpExceptionAddress$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lpExceptionAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG64 lpExceptionAddress
     * }
     */
    public static final OfLong lpExceptionAddress$layout() {
        return lpExceptionAddress$LAYOUT;
    }

    private static final long lpExceptionAddress$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG64 lpExceptionAddress
     * }
     */
    public static final long lpExceptionAddress$offset() {
        return lpExceptionAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG64 lpExceptionAddress
     * }
     */
    public static long lpExceptionAddress(MemorySegment struct) {
        return struct.get(lpExceptionAddress$LAYOUT, lpExceptionAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG64 lpExceptionAddress
     * }
     */
    public static void lpExceptionAddress(MemorySegment struct, long fieldValue) {
        struct.set(lpExceptionAddress$LAYOUT, lpExceptionAddress$OFFSET, fieldValue);
    }

    private static final OfLong lpExceptionRecord$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lpExceptionRecord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG64 lpExceptionRecord
     * }
     */
    public static final OfLong lpExceptionRecord$layout() {
        return lpExceptionRecord$LAYOUT;
    }

    private static final long lpExceptionRecord$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG64 lpExceptionRecord
     * }
     */
    public static final long lpExceptionRecord$offset() {
        return lpExceptionRecord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG64 lpExceptionRecord
     * }
     */
    public static long lpExceptionRecord(MemorySegment struct) {
        return struct.get(lpExceptionRecord$LAYOUT, lpExceptionRecord$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG64 lpExceptionRecord
     * }
     */
    public static void lpExceptionRecord(MemorySegment struct, long fieldValue) {
        struct.set(lpExceptionRecord$LAYOUT, lpExceptionRecord$OFFSET, fieldValue);
    }

    private static final OfLong lpContextRecord$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lpContextRecord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG64 lpContextRecord
     * }
     */
    public static final OfLong lpContextRecord$layout() {
        return lpContextRecord$LAYOUT;
    }

    private static final long lpContextRecord$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG64 lpContextRecord
     * }
     */
    public static final long lpContextRecord$offset() {
        return lpContextRecord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG64 lpContextRecord
     * }
     */
    public static long lpContextRecord(MemorySegment struct) {
        return struct.get(lpContextRecord$LAYOUT, lpContextRecord$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG64 lpContextRecord
     * }
     */
    public static void lpContextRecord(MemorySegment struct, long fieldValue) {
        struct.set(lpContextRecord$LAYOUT, lpContextRecord$OFFSET, fieldValue);
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
