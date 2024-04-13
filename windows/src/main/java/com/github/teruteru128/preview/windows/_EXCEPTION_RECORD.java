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
 * struct _EXCEPTION_RECORD {
 *     DWORD ExceptionCode;
 *     DWORD ExceptionFlags;
 *     struct _EXCEPTION_RECORD *ExceptionRecord;
 *     PVOID ExceptionAddress;
 *     DWORD NumberParameters;
 *     ULONG_PTR ExceptionInformation[15];
 * }
 * }
 */
public class _EXCEPTION_RECORD {

    _EXCEPTION_RECORD() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("ExceptionCode"),
        Windows_h.C_LONG.withName("ExceptionFlags"),
        Windows_h.C_POINTER.withName("ExceptionRecord"),
        Windows_h.C_POINTER.withName("ExceptionAddress"),
        Windows_h.C_LONG.withName("NumberParameters"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(15, Windows_h.C_LONG_LONG).withName("ExceptionInformation")
    ).withName("_EXCEPTION_RECORD");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ExceptionCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ExceptionCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ExceptionCode
     * }
     */
    public static final OfInt ExceptionCode$layout() {
        return ExceptionCode$LAYOUT;
    }

    private static final long ExceptionCode$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ExceptionCode
     * }
     */
    public static final long ExceptionCode$offset() {
        return ExceptionCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ExceptionCode
     * }
     */
    public static int ExceptionCode(MemorySegment struct) {
        return struct.get(ExceptionCode$LAYOUT, ExceptionCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ExceptionCode
     * }
     */
    public static void ExceptionCode(MemorySegment struct, int fieldValue) {
        struct.set(ExceptionCode$LAYOUT, ExceptionCode$OFFSET, fieldValue);
    }

    private static final OfInt ExceptionFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ExceptionFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ExceptionFlags
     * }
     */
    public static final OfInt ExceptionFlags$layout() {
        return ExceptionFlags$LAYOUT;
    }

    private static final long ExceptionFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ExceptionFlags
     * }
     */
    public static final long ExceptionFlags$offset() {
        return ExceptionFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ExceptionFlags
     * }
     */
    public static int ExceptionFlags(MemorySegment struct) {
        return struct.get(ExceptionFlags$LAYOUT, ExceptionFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ExceptionFlags
     * }
     */
    public static void ExceptionFlags(MemorySegment struct, int fieldValue) {
        struct.set(ExceptionFlags$LAYOUT, ExceptionFlags$OFFSET, fieldValue);
    }

    private static final AddressLayout ExceptionRecord$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ExceptionRecord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _EXCEPTION_RECORD *ExceptionRecord
     * }
     */
    public static final AddressLayout ExceptionRecord$layout() {
        return ExceptionRecord$LAYOUT;
    }

    private static final long ExceptionRecord$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _EXCEPTION_RECORD *ExceptionRecord
     * }
     */
    public static final long ExceptionRecord$offset() {
        return ExceptionRecord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _EXCEPTION_RECORD *ExceptionRecord
     * }
     */
    public static MemorySegment ExceptionRecord(MemorySegment struct) {
        return struct.get(ExceptionRecord$LAYOUT, ExceptionRecord$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _EXCEPTION_RECORD *ExceptionRecord
     * }
     */
    public static void ExceptionRecord(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ExceptionRecord$LAYOUT, ExceptionRecord$OFFSET, fieldValue);
    }

    private static final AddressLayout ExceptionAddress$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ExceptionAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID ExceptionAddress
     * }
     */
    public static final AddressLayout ExceptionAddress$layout() {
        return ExceptionAddress$LAYOUT;
    }

    private static final long ExceptionAddress$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID ExceptionAddress
     * }
     */
    public static final long ExceptionAddress$offset() {
        return ExceptionAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID ExceptionAddress
     * }
     */
    public static MemorySegment ExceptionAddress(MemorySegment struct) {
        return struct.get(ExceptionAddress$LAYOUT, ExceptionAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID ExceptionAddress
     * }
     */
    public static void ExceptionAddress(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ExceptionAddress$LAYOUT, ExceptionAddress$OFFSET, fieldValue);
    }

    private static final OfInt NumberParameters$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberParameters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberParameters
     * }
     */
    public static final OfInt NumberParameters$layout() {
        return NumberParameters$LAYOUT;
    }

    private static final long NumberParameters$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberParameters
     * }
     */
    public static final long NumberParameters$offset() {
        return NumberParameters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberParameters
     * }
     */
    public static int NumberParameters(MemorySegment struct) {
        return struct.get(NumberParameters$LAYOUT, NumberParameters$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberParameters
     * }
     */
    public static void NumberParameters(MemorySegment struct, int fieldValue) {
        struct.set(NumberParameters$LAYOUT, NumberParameters$OFFSET, fieldValue);
    }

    private static final SequenceLayout ExceptionInformation$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ExceptionInformation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR ExceptionInformation[15]
     * }
     */
    public static final SequenceLayout ExceptionInformation$layout() {
        return ExceptionInformation$LAYOUT;
    }

    private static final long ExceptionInformation$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR ExceptionInformation[15]
     * }
     */
    public static final long ExceptionInformation$offset() {
        return ExceptionInformation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR ExceptionInformation[15]
     * }
     */
    public static MemorySegment ExceptionInformation(MemorySegment struct) {
        return struct.asSlice(ExceptionInformation$OFFSET, ExceptionInformation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR ExceptionInformation[15]
     * }
     */
    public static void ExceptionInformation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ExceptionInformation$OFFSET, ExceptionInformation$LAYOUT.byteSize());
    }

    private static long[] ExceptionInformation$DIMS = { 15 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * ULONG_PTR ExceptionInformation[15]
     * }
     */
    public static long[] ExceptionInformation$dimensions() {
        return ExceptionInformation$DIMS;
    }
    private static final VarHandle ExceptionInformation$ELEM_HANDLE = ExceptionInformation$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * ULONG_PTR ExceptionInformation[15]
     * }
     */
    public static long ExceptionInformation(MemorySegment struct, long index0) {
        return (long)ExceptionInformation$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * ULONG_PTR ExceptionInformation[15]
     * }
     */
    public static void ExceptionInformation(MemorySegment struct, long index0, long fieldValue) {
        ExceptionInformation$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
