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
 * struct _IMAGE_ROM_OPTIONAL_HEADER {
 *     WORD Magic;
 *     BYTE MajorLinkerVersion;
 *     BYTE MinorLinkerVersion;
 *     DWORD SizeOfCode;
 *     DWORD SizeOfInitializedData;
 *     DWORD SizeOfUninitializedData;
 *     DWORD AddressOfEntryPoint;
 *     DWORD BaseOfCode;
 *     DWORD BaseOfData;
 *     DWORD BaseOfBss;
 *     DWORD GprMask;
 *     DWORD CprMask[4];
 *     DWORD GpValue;
 * }
 * }
 */
public class _IMAGE_ROM_OPTIONAL_HEADER {

    _IMAGE_ROM_OPTIONAL_HEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("Magic"),
        Windows_h.C_CHAR.withName("MajorLinkerVersion"),
        Windows_h.C_CHAR.withName("MinorLinkerVersion"),
        Windows_h.C_LONG.withName("SizeOfCode"),
        Windows_h.C_LONG.withName("SizeOfInitializedData"),
        Windows_h.C_LONG.withName("SizeOfUninitializedData"),
        Windows_h.C_LONG.withName("AddressOfEntryPoint"),
        Windows_h.C_LONG.withName("BaseOfCode"),
        Windows_h.C_LONG.withName("BaseOfData"),
        Windows_h.C_LONG.withName("BaseOfBss"),
        Windows_h.C_LONG.withName("GprMask"),
        MemoryLayout.sequenceLayout(4, Windows_h.C_LONG).withName("CprMask"),
        Windows_h.C_LONG.withName("GpValue")
    ).withName("_IMAGE_ROM_OPTIONAL_HEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Magic$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Magic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Magic
     * }
     */
    public static final OfShort Magic$layout() {
        return Magic$LAYOUT;
    }

    private static final long Magic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Magic
     * }
     */
    public static final long Magic$offset() {
        return Magic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Magic
     * }
     */
    public static short Magic(MemorySegment struct) {
        return struct.get(Magic$LAYOUT, Magic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Magic
     * }
     */
    public static void Magic(MemorySegment struct, short fieldValue) {
        struct.set(Magic$LAYOUT, Magic$OFFSET, fieldValue);
    }

    private static final OfByte MajorLinkerVersion$LAYOUT = (OfByte)$LAYOUT.select(groupElement("MajorLinkerVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE MajorLinkerVersion
     * }
     */
    public static final OfByte MajorLinkerVersion$layout() {
        return MajorLinkerVersion$LAYOUT;
    }

    private static final long MajorLinkerVersion$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE MajorLinkerVersion
     * }
     */
    public static final long MajorLinkerVersion$offset() {
        return MajorLinkerVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE MajorLinkerVersion
     * }
     */
    public static byte MajorLinkerVersion(MemorySegment struct) {
        return struct.get(MajorLinkerVersion$LAYOUT, MajorLinkerVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE MajorLinkerVersion
     * }
     */
    public static void MajorLinkerVersion(MemorySegment struct, byte fieldValue) {
        struct.set(MajorLinkerVersion$LAYOUT, MajorLinkerVersion$OFFSET, fieldValue);
    }

    private static final OfByte MinorLinkerVersion$LAYOUT = (OfByte)$LAYOUT.select(groupElement("MinorLinkerVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE MinorLinkerVersion
     * }
     */
    public static final OfByte MinorLinkerVersion$layout() {
        return MinorLinkerVersion$LAYOUT;
    }

    private static final long MinorLinkerVersion$OFFSET = 3;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE MinorLinkerVersion
     * }
     */
    public static final long MinorLinkerVersion$offset() {
        return MinorLinkerVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE MinorLinkerVersion
     * }
     */
    public static byte MinorLinkerVersion(MemorySegment struct) {
        return struct.get(MinorLinkerVersion$LAYOUT, MinorLinkerVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE MinorLinkerVersion
     * }
     */
    public static void MinorLinkerVersion(MemorySegment struct, byte fieldValue) {
        struct.set(MinorLinkerVersion$LAYOUT, MinorLinkerVersion$OFFSET, fieldValue);
    }

    private static final OfInt SizeOfCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SizeOfCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SizeOfCode
     * }
     */
    public static final OfInt SizeOfCode$layout() {
        return SizeOfCode$LAYOUT;
    }

    private static final long SizeOfCode$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SizeOfCode
     * }
     */
    public static final long SizeOfCode$offset() {
        return SizeOfCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SizeOfCode
     * }
     */
    public static int SizeOfCode(MemorySegment struct) {
        return struct.get(SizeOfCode$LAYOUT, SizeOfCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SizeOfCode
     * }
     */
    public static void SizeOfCode(MemorySegment struct, int fieldValue) {
        struct.set(SizeOfCode$LAYOUT, SizeOfCode$OFFSET, fieldValue);
    }

    private static final OfInt SizeOfInitializedData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SizeOfInitializedData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SizeOfInitializedData
     * }
     */
    public static final OfInt SizeOfInitializedData$layout() {
        return SizeOfInitializedData$LAYOUT;
    }

    private static final long SizeOfInitializedData$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SizeOfInitializedData
     * }
     */
    public static final long SizeOfInitializedData$offset() {
        return SizeOfInitializedData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SizeOfInitializedData
     * }
     */
    public static int SizeOfInitializedData(MemorySegment struct) {
        return struct.get(SizeOfInitializedData$LAYOUT, SizeOfInitializedData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SizeOfInitializedData
     * }
     */
    public static void SizeOfInitializedData(MemorySegment struct, int fieldValue) {
        struct.set(SizeOfInitializedData$LAYOUT, SizeOfInitializedData$OFFSET, fieldValue);
    }

    private static final OfInt SizeOfUninitializedData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SizeOfUninitializedData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SizeOfUninitializedData
     * }
     */
    public static final OfInt SizeOfUninitializedData$layout() {
        return SizeOfUninitializedData$LAYOUT;
    }

    private static final long SizeOfUninitializedData$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SizeOfUninitializedData
     * }
     */
    public static final long SizeOfUninitializedData$offset() {
        return SizeOfUninitializedData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SizeOfUninitializedData
     * }
     */
    public static int SizeOfUninitializedData(MemorySegment struct) {
        return struct.get(SizeOfUninitializedData$LAYOUT, SizeOfUninitializedData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SizeOfUninitializedData
     * }
     */
    public static void SizeOfUninitializedData(MemorySegment struct, int fieldValue) {
        struct.set(SizeOfUninitializedData$LAYOUT, SizeOfUninitializedData$OFFSET, fieldValue);
    }

    private static final OfInt AddressOfEntryPoint$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AddressOfEntryPoint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AddressOfEntryPoint
     * }
     */
    public static final OfInt AddressOfEntryPoint$layout() {
        return AddressOfEntryPoint$LAYOUT;
    }

    private static final long AddressOfEntryPoint$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AddressOfEntryPoint
     * }
     */
    public static final long AddressOfEntryPoint$offset() {
        return AddressOfEntryPoint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AddressOfEntryPoint
     * }
     */
    public static int AddressOfEntryPoint(MemorySegment struct) {
        return struct.get(AddressOfEntryPoint$LAYOUT, AddressOfEntryPoint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AddressOfEntryPoint
     * }
     */
    public static void AddressOfEntryPoint(MemorySegment struct, int fieldValue) {
        struct.set(AddressOfEntryPoint$LAYOUT, AddressOfEntryPoint$OFFSET, fieldValue);
    }

    private static final OfInt BaseOfCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BaseOfCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BaseOfCode
     * }
     */
    public static final OfInt BaseOfCode$layout() {
        return BaseOfCode$LAYOUT;
    }

    private static final long BaseOfCode$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BaseOfCode
     * }
     */
    public static final long BaseOfCode$offset() {
        return BaseOfCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BaseOfCode
     * }
     */
    public static int BaseOfCode(MemorySegment struct) {
        return struct.get(BaseOfCode$LAYOUT, BaseOfCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BaseOfCode
     * }
     */
    public static void BaseOfCode(MemorySegment struct, int fieldValue) {
        struct.set(BaseOfCode$LAYOUT, BaseOfCode$OFFSET, fieldValue);
    }

    private static final OfInt BaseOfData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BaseOfData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BaseOfData
     * }
     */
    public static final OfInt BaseOfData$layout() {
        return BaseOfData$LAYOUT;
    }

    private static final long BaseOfData$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BaseOfData
     * }
     */
    public static final long BaseOfData$offset() {
        return BaseOfData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BaseOfData
     * }
     */
    public static int BaseOfData(MemorySegment struct) {
        return struct.get(BaseOfData$LAYOUT, BaseOfData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BaseOfData
     * }
     */
    public static void BaseOfData(MemorySegment struct, int fieldValue) {
        struct.set(BaseOfData$LAYOUT, BaseOfData$OFFSET, fieldValue);
    }

    private static final OfInt BaseOfBss$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BaseOfBss"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BaseOfBss
     * }
     */
    public static final OfInt BaseOfBss$layout() {
        return BaseOfBss$LAYOUT;
    }

    private static final long BaseOfBss$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BaseOfBss
     * }
     */
    public static final long BaseOfBss$offset() {
        return BaseOfBss$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BaseOfBss
     * }
     */
    public static int BaseOfBss(MemorySegment struct) {
        return struct.get(BaseOfBss$LAYOUT, BaseOfBss$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BaseOfBss
     * }
     */
    public static void BaseOfBss(MemorySegment struct, int fieldValue) {
        struct.set(BaseOfBss$LAYOUT, BaseOfBss$OFFSET, fieldValue);
    }

    private static final OfInt GprMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("GprMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD GprMask
     * }
     */
    public static final OfInt GprMask$layout() {
        return GprMask$LAYOUT;
    }

    private static final long GprMask$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD GprMask
     * }
     */
    public static final long GprMask$offset() {
        return GprMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD GprMask
     * }
     */
    public static int GprMask(MemorySegment struct) {
        return struct.get(GprMask$LAYOUT, GprMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD GprMask
     * }
     */
    public static void GprMask(MemorySegment struct, int fieldValue) {
        struct.set(GprMask$LAYOUT, GprMask$OFFSET, fieldValue);
    }

    private static final SequenceLayout CprMask$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("CprMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD CprMask[4]
     * }
     */
    public static final SequenceLayout CprMask$layout() {
        return CprMask$LAYOUT;
    }

    private static final long CprMask$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD CprMask[4]
     * }
     */
    public static final long CprMask$offset() {
        return CprMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD CprMask[4]
     * }
     */
    public static MemorySegment CprMask(MemorySegment struct) {
        return struct.asSlice(CprMask$OFFSET, CprMask$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD CprMask[4]
     * }
     */
    public static void CprMask(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CprMask$OFFSET, CprMask$LAYOUT.byteSize());
    }

    private static long[] CprMask$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD CprMask[4]
     * }
     */
    public static long[] CprMask$dimensions() {
        return CprMask$DIMS;
    }
    private static final VarHandle CprMask$ELEM_HANDLE = CprMask$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD CprMask[4]
     * }
     */
    public static int CprMask(MemorySegment struct, long index0) {
        return (int)CprMask$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD CprMask[4]
     * }
     */
    public static void CprMask(MemorySegment struct, long index0, int fieldValue) {
        CprMask$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt GpValue$LAYOUT = (OfInt)$LAYOUT.select(groupElement("GpValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD GpValue
     * }
     */
    public static final OfInt GpValue$layout() {
        return GpValue$LAYOUT;
    }

    private static final long GpValue$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD GpValue
     * }
     */
    public static final long GpValue$offset() {
        return GpValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD GpValue
     * }
     */
    public static int GpValue(MemorySegment struct) {
        return struct.get(GpValue$LAYOUT, GpValue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD GpValue
     * }
     */
    public static void GpValue(MemorySegment struct, int fieldValue) {
        struct.set(GpValue$LAYOUT, GpValue$OFFSET, fieldValue);
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

