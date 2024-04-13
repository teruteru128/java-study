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
 * struct _NT_TIB {
 *     struct _EXCEPTION_REGISTRATION_RECORD *ExceptionList;
 *     PVOID StackBase;
 *     PVOID StackLimit;
 *     PVOID SubSystemTib;
 *     union {
 *         PVOID FiberData;
 *         DWORD Version;
 *     };
 *     PVOID ArbitraryUserPointer;
 *     struct _NT_TIB *Self;
 * }
 * }
 */
public class _NT_TIB {

    _NT_TIB() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("ExceptionList"),
        Windows_h.C_POINTER.withName("StackBase"),
        Windows_h.C_POINTER.withName("StackLimit"),
        Windows_h.C_POINTER.withName("SubSystemTib"),
        MemoryLayout.unionLayout(
            Windows_h.C_POINTER.withName("FiberData"),
            Windows_h.C_LONG.withName("Version")
        ).withName("$anon$12226:5"),
        Windows_h.C_POINTER.withName("ArbitraryUserPointer"),
        Windows_h.C_POINTER.withName("Self")
    ).withName("_NT_TIB");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout ExceptionList$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ExceptionList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _EXCEPTION_REGISTRATION_RECORD *ExceptionList
     * }
     */
    public static final AddressLayout ExceptionList$layout() {
        return ExceptionList$LAYOUT;
    }

    private static final long ExceptionList$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _EXCEPTION_REGISTRATION_RECORD *ExceptionList
     * }
     */
    public static final long ExceptionList$offset() {
        return ExceptionList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _EXCEPTION_REGISTRATION_RECORD *ExceptionList
     * }
     */
    public static MemorySegment ExceptionList(MemorySegment struct) {
        return struct.get(ExceptionList$LAYOUT, ExceptionList$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _EXCEPTION_REGISTRATION_RECORD *ExceptionList
     * }
     */
    public static void ExceptionList(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ExceptionList$LAYOUT, ExceptionList$OFFSET, fieldValue);
    }

    private static final AddressLayout StackBase$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("StackBase"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID StackBase
     * }
     */
    public static final AddressLayout StackBase$layout() {
        return StackBase$LAYOUT;
    }

    private static final long StackBase$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID StackBase
     * }
     */
    public static final long StackBase$offset() {
        return StackBase$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID StackBase
     * }
     */
    public static MemorySegment StackBase(MemorySegment struct) {
        return struct.get(StackBase$LAYOUT, StackBase$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID StackBase
     * }
     */
    public static void StackBase(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(StackBase$LAYOUT, StackBase$OFFSET, fieldValue);
    }

    private static final AddressLayout StackLimit$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("StackLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID StackLimit
     * }
     */
    public static final AddressLayout StackLimit$layout() {
        return StackLimit$LAYOUT;
    }

    private static final long StackLimit$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID StackLimit
     * }
     */
    public static final long StackLimit$offset() {
        return StackLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID StackLimit
     * }
     */
    public static MemorySegment StackLimit(MemorySegment struct) {
        return struct.get(StackLimit$LAYOUT, StackLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID StackLimit
     * }
     */
    public static void StackLimit(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(StackLimit$LAYOUT, StackLimit$OFFSET, fieldValue);
    }

    private static final AddressLayout SubSystemTib$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SubSystemTib"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID SubSystemTib
     * }
     */
    public static final AddressLayout SubSystemTib$layout() {
        return SubSystemTib$LAYOUT;
    }

    private static final long SubSystemTib$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID SubSystemTib
     * }
     */
    public static final long SubSystemTib$offset() {
        return SubSystemTib$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID SubSystemTib
     * }
     */
    public static MemorySegment SubSystemTib(MemorySegment struct) {
        return struct.get(SubSystemTib$LAYOUT, SubSystemTib$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID SubSystemTib
     * }
     */
    public static void SubSystemTib(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SubSystemTib$LAYOUT, SubSystemTib$OFFSET, fieldValue);
    }

    private static final AddressLayout FiberData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$12226:5"), groupElement("FiberData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID FiberData
     * }
     */
    public static final AddressLayout FiberData$layout() {
        return FiberData$LAYOUT;
    }

    private static final long FiberData$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID FiberData
     * }
     */
    public static final long FiberData$offset() {
        return FiberData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID FiberData
     * }
     */
    public static MemorySegment FiberData(MemorySegment struct) {
        return struct.get(FiberData$LAYOUT, FiberData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID FiberData
     * }
     */
    public static void FiberData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(FiberData$LAYOUT, FiberData$OFFSET, fieldValue);
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$12226:5"), groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final AddressLayout ArbitraryUserPointer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ArbitraryUserPointer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID ArbitraryUserPointer
     * }
     */
    public static final AddressLayout ArbitraryUserPointer$layout() {
        return ArbitraryUserPointer$LAYOUT;
    }

    private static final long ArbitraryUserPointer$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID ArbitraryUserPointer
     * }
     */
    public static final long ArbitraryUserPointer$offset() {
        return ArbitraryUserPointer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID ArbitraryUserPointer
     * }
     */
    public static MemorySegment ArbitraryUserPointer(MemorySegment struct) {
        return struct.get(ArbitraryUserPointer$LAYOUT, ArbitraryUserPointer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID ArbitraryUserPointer
     * }
     */
    public static void ArbitraryUserPointer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ArbitraryUserPointer$LAYOUT, ArbitraryUserPointer$OFFSET, fieldValue);
    }

    private static final AddressLayout Self$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Self"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _NT_TIB *Self
     * }
     */
    public static final AddressLayout Self$layout() {
        return Self$LAYOUT;
    }

    private static final long Self$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _NT_TIB *Self
     * }
     */
    public static final long Self$offset() {
        return Self$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _NT_TIB *Self
     * }
     */
    public static MemorySegment Self(MemorySegment struct) {
        return struct.get(Self$LAYOUT, Self$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _NT_TIB *Self
     * }
     */
    public static void Self(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Self$LAYOUT, Self$OFFSET, fieldValue);
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
