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
 * struct _RTL_CRITICAL_SECTION {
 *     PRTL_CRITICAL_SECTION_DEBUG DebugInfo;
 *     LONG LockCount;
 *     LONG RecursionCount;
 *     HANDLE OwningThread;
 *     HANDLE LockSemaphore;
 *     ULONG_PTR SpinCount;
 * }
 * }
 */
public class _RTL_CRITICAL_SECTION {

    _RTL_CRITICAL_SECTION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("DebugInfo"),
        Windows_h.C_LONG.withName("LockCount"),
        Windows_h.C_LONG.withName("RecursionCount"),
        Windows_h.C_POINTER.withName("OwningThread"),
        Windows_h.C_POINTER.withName("LockSemaphore"),
        Windows_h.C_LONG_LONG.withName("SpinCount")
    ).withName("_RTL_CRITICAL_SECTION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout DebugInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("DebugInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PRTL_CRITICAL_SECTION_DEBUG DebugInfo
     * }
     */
    public static final AddressLayout DebugInfo$layout() {
        return DebugInfo$LAYOUT;
    }

    private static final long DebugInfo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PRTL_CRITICAL_SECTION_DEBUG DebugInfo
     * }
     */
    public static final long DebugInfo$offset() {
        return DebugInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PRTL_CRITICAL_SECTION_DEBUG DebugInfo
     * }
     */
    public static MemorySegment DebugInfo(MemorySegment struct) {
        return struct.get(DebugInfo$LAYOUT, DebugInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PRTL_CRITICAL_SECTION_DEBUG DebugInfo
     * }
     */
    public static void DebugInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(DebugInfo$LAYOUT, DebugInfo$OFFSET, fieldValue);
    }

    private static final OfInt LockCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LockCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG LockCount
     * }
     */
    public static final OfInt LockCount$layout() {
        return LockCount$LAYOUT;
    }

    private static final long LockCount$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG LockCount
     * }
     */
    public static final long LockCount$offset() {
        return LockCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG LockCount
     * }
     */
    public static int LockCount(MemorySegment struct) {
        return struct.get(LockCount$LAYOUT, LockCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG LockCount
     * }
     */
    public static void LockCount(MemorySegment struct, int fieldValue) {
        struct.set(LockCount$LAYOUT, LockCount$OFFSET, fieldValue);
    }

    private static final OfInt RecursionCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("RecursionCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG RecursionCount
     * }
     */
    public static final OfInt RecursionCount$layout() {
        return RecursionCount$LAYOUT;
    }

    private static final long RecursionCount$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG RecursionCount
     * }
     */
    public static final long RecursionCount$offset() {
        return RecursionCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG RecursionCount
     * }
     */
    public static int RecursionCount(MemorySegment struct) {
        return struct.get(RecursionCount$LAYOUT, RecursionCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG RecursionCount
     * }
     */
    public static void RecursionCount(MemorySegment struct, int fieldValue) {
        struct.set(RecursionCount$LAYOUT, RecursionCount$OFFSET, fieldValue);
    }

    private static final AddressLayout OwningThread$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("OwningThread"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE OwningThread
     * }
     */
    public static final AddressLayout OwningThread$layout() {
        return OwningThread$LAYOUT;
    }

    private static final long OwningThread$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE OwningThread
     * }
     */
    public static final long OwningThread$offset() {
        return OwningThread$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE OwningThread
     * }
     */
    public static MemorySegment OwningThread(MemorySegment struct) {
        return struct.get(OwningThread$LAYOUT, OwningThread$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE OwningThread
     * }
     */
    public static void OwningThread(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(OwningThread$LAYOUT, OwningThread$OFFSET, fieldValue);
    }

    private static final AddressLayout LockSemaphore$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("LockSemaphore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE LockSemaphore
     * }
     */
    public static final AddressLayout LockSemaphore$layout() {
        return LockSemaphore$LAYOUT;
    }

    private static final long LockSemaphore$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE LockSemaphore
     * }
     */
    public static final long LockSemaphore$offset() {
        return LockSemaphore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE LockSemaphore
     * }
     */
    public static MemorySegment LockSemaphore(MemorySegment struct) {
        return struct.get(LockSemaphore$LAYOUT, LockSemaphore$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE LockSemaphore
     * }
     */
    public static void LockSemaphore(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(LockSemaphore$LAYOUT, LockSemaphore$OFFSET, fieldValue);
    }

    private static final OfLong SpinCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("SpinCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR SpinCount
     * }
     */
    public static final OfLong SpinCount$layout() {
        return SpinCount$LAYOUT;
    }

    private static final long SpinCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR SpinCount
     * }
     */
    public static final long SpinCount$offset() {
        return SpinCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR SpinCount
     * }
     */
    public static long SpinCount(MemorySegment struct) {
        return struct.get(SpinCount$LAYOUT, SpinCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR SpinCount
     * }
     */
    public static void SpinCount(MemorySegment struct, long fieldValue) {
        struct.set(SpinCount$LAYOUT, SpinCount$OFFSET, fieldValue);
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

