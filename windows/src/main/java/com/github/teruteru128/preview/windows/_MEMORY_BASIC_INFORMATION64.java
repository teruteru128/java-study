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
 * struct _MEMORY_BASIC_INFORMATION64 {
 *     ULONGLONG BaseAddress;
 *     ULONGLONG AllocationBase;
 *     DWORD AllocationProtect;
 *     DWORD __alignment1;
 *     ULONGLONG RegionSize;
 *     DWORD State;
 *     DWORD Protect;
 *     DWORD Type;
 *     DWORD __alignment2;
 * }
 * }
 */
public class _MEMORY_BASIC_INFORMATION64 {

    _MEMORY_BASIC_INFORMATION64() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG_LONG.withName("BaseAddress"),
        Windows_h.C_LONG_LONG.withName("AllocationBase"),
        Windows_h.C_LONG.withName("AllocationProtect"),
        Windows_h.C_LONG.withName("__alignment1"),
        Windows_h.C_LONG_LONG.withName("RegionSize"),
        Windows_h.C_LONG.withName("State"),
        Windows_h.C_LONG.withName("Protect"),
        Windows_h.C_LONG.withName("Type"),
        Windows_h.C_LONG.withName("__alignment2")
    ).withName("_MEMORY_BASIC_INFORMATION64");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong BaseAddress$LAYOUT = (OfLong)$LAYOUT.select(groupElement("BaseAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG BaseAddress
     * }
     */
    public static final OfLong BaseAddress$layout() {
        return BaseAddress$LAYOUT;
    }

    private static final long BaseAddress$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG BaseAddress
     * }
     */
    public static final long BaseAddress$offset() {
        return BaseAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG BaseAddress
     * }
     */
    public static long BaseAddress(MemorySegment struct) {
        return struct.get(BaseAddress$LAYOUT, BaseAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG BaseAddress
     * }
     */
    public static void BaseAddress(MemorySegment struct, long fieldValue) {
        struct.set(BaseAddress$LAYOUT, BaseAddress$OFFSET, fieldValue);
    }

    private static final OfLong AllocationBase$LAYOUT = (OfLong)$LAYOUT.select(groupElement("AllocationBase"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG AllocationBase
     * }
     */
    public static final OfLong AllocationBase$layout() {
        return AllocationBase$LAYOUT;
    }

    private static final long AllocationBase$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG AllocationBase
     * }
     */
    public static final long AllocationBase$offset() {
        return AllocationBase$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG AllocationBase
     * }
     */
    public static long AllocationBase(MemorySegment struct) {
        return struct.get(AllocationBase$LAYOUT, AllocationBase$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG AllocationBase
     * }
     */
    public static void AllocationBase(MemorySegment struct, long fieldValue) {
        struct.set(AllocationBase$LAYOUT, AllocationBase$OFFSET, fieldValue);
    }

    private static final OfInt AllocationProtect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AllocationProtect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AllocationProtect
     * }
     */
    public static final OfInt AllocationProtect$layout() {
        return AllocationProtect$LAYOUT;
    }

    private static final long AllocationProtect$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AllocationProtect
     * }
     */
    public static final long AllocationProtect$offset() {
        return AllocationProtect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AllocationProtect
     * }
     */
    public static int AllocationProtect(MemorySegment struct) {
        return struct.get(AllocationProtect$LAYOUT, AllocationProtect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AllocationProtect
     * }
     */
    public static void AllocationProtect(MemorySegment struct, int fieldValue) {
        struct.set(AllocationProtect$LAYOUT, AllocationProtect$OFFSET, fieldValue);
    }

    private static final OfInt __alignment1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__alignment1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD __alignment1
     * }
     */
    public static final OfInt __alignment1$layout() {
        return __alignment1$LAYOUT;
    }

    private static final long __alignment1$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD __alignment1
     * }
     */
    public static final long __alignment1$offset() {
        return __alignment1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD __alignment1
     * }
     */
    public static int __alignment1(MemorySegment struct) {
        return struct.get(__alignment1$LAYOUT, __alignment1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD __alignment1
     * }
     */
    public static void __alignment1(MemorySegment struct, int fieldValue) {
        struct.set(__alignment1$LAYOUT, __alignment1$OFFSET, fieldValue);
    }

    private static final OfLong RegionSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("RegionSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG RegionSize
     * }
     */
    public static final OfLong RegionSize$layout() {
        return RegionSize$LAYOUT;
    }

    private static final long RegionSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG RegionSize
     * }
     */
    public static final long RegionSize$offset() {
        return RegionSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG RegionSize
     * }
     */
    public static long RegionSize(MemorySegment struct) {
        return struct.get(RegionSize$LAYOUT, RegionSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG RegionSize
     * }
     */
    public static void RegionSize(MemorySegment struct, long fieldValue) {
        struct.set(RegionSize$LAYOUT, RegionSize$OFFSET, fieldValue);
    }

    private static final OfInt State$LAYOUT = (OfInt)$LAYOUT.select(groupElement("State"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD State
     * }
     */
    public static final OfInt State$layout() {
        return State$LAYOUT;
    }

    private static final long State$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD State
     * }
     */
    public static final long State$offset() {
        return State$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD State
     * }
     */
    public static int State(MemorySegment struct) {
        return struct.get(State$LAYOUT, State$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD State
     * }
     */
    public static void State(MemorySegment struct, int fieldValue) {
        struct.set(State$LAYOUT, State$OFFSET, fieldValue);
    }

    private static final OfInt Protect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Protect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Protect
     * }
     */
    public static final OfInt Protect$layout() {
        return Protect$LAYOUT;
    }

    private static final long Protect$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Protect
     * }
     */
    public static final long Protect$offset() {
        return Protect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Protect
     * }
     */
    public static int Protect(MemorySegment struct) {
        return struct.get(Protect$LAYOUT, Protect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Protect
     * }
     */
    public static void Protect(MemorySegment struct, int fieldValue) {
        struct.set(Protect$LAYOUT, Protect$OFFSET, fieldValue);
    }

    private static final OfInt Type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static final OfInt Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static int Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static void Type(MemorySegment struct, int fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    private static final OfInt __alignment2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__alignment2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD __alignment2
     * }
     */
    public static final OfInt __alignment2$layout() {
        return __alignment2$LAYOUT;
    }

    private static final long __alignment2$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD __alignment2
     * }
     */
    public static final long __alignment2$offset() {
        return __alignment2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD __alignment2
     * }
     */
    public static int __alignment2(MemorySegment struct) {
        return struct.get(__alignment2$LAYOUT, __alignment2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD __alignment2
     * }
     */
    public static void __alignment2(MemorySegment struct, int fieldValue) {
        struct.set(__alignment2$LAYOUT, __alignment2$OFFSET, fieldValue);
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
