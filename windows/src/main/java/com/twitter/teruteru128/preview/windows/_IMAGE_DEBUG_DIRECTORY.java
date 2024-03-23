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
 * struct _IMAGE_DEBUG_DIRECTORY {
 *     DWORD Characteristics;
 *     DWORD TimeDateStamp;
 *     WORD MajorVersion;
 *     WORD MinorVersion;
 *     DWORD Type;
 *     DWORD SizeOfData;
 *     DWORD AddressOfRawData;
 *     DWORD PointerToRawData;
 * }
 * }
 */
public class _IMAGE_DEBUG_DIRECTORY {

    _IMAGE_DEBUG_DIRECTORY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Characteristics"),
        Windows_h.C_LONG.withName("TimeDateStamp"),
        Windows_h.C_SHORT.withName("MajorVersion"),
        Windows_h.C_SHORT.withName("MinorVersion"),
        Windows_h.C_LONG.withName("Type"),
        Windows_h.C_LONG.withName("SizeOfData"),
        Windows_h.C_LONG.withName("AddressOfRawData"),
        Windows_h.C_LONG.withName("PointerToRawData")
    ).withName("_IMAGE_DEBUG_DIRECTORY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Characteristics$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Characteristics"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Characteristics
     * }
     */
    public static final OfInt Characteristics$layout() {
        return Characteristics$LAYOUT;
    }

    private static final long Characteristics$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Characteristics
     * }
     */
    public static final long Characteristics$offset() {
        return Characteristics$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Characteristics
     * }
     */
    public static int Characteristics(MemorySegment struct) {
        return struct.get(Characteristics$LAYOUT, Characteristics$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Characteristics
     * }
     */
    public static void Characteristics(MemorySegment struct, int fieldValue) {
        struct.set(Characteristics$LAYOUT, Characteristics$OFFSET, fieldValue);
    }

    private static final OfInt TimeDateStamp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TimeDateStamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static final OfInt TimeDateStamp$layout() {
        return TimeDateStamp$LAYOUT;
    }

    private static final long TimeDateStamp$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static final long TimeDateStamp$offset() {
        return TimeDateStamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static int TimeDateStamp(MemorySegment struct) {
        return struct.get(TimeDateStamp$LAYOUT, TimeDateStamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static void TimeDateStamp(MemorySegment struct, int fieldValue) {
        struct.set(TimeDateStamp$LAYOUT, TimeDateStamp$OFFSET, fieldValue);
    }

    private static final OfShort MajorVersion$LAYOUT = (OfShort)$LAYOUT.select(groupElement("MajorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD MajorVersion
     * }
     */
    public static final OfShort MajorVersion$layout() {
        return MajorVersion$LAYOUT;
    }

    private static final long MajorVersion$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD MajorVersion
     * }
     */
    public static final long MajorVersion$offset() {
        return MajorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD MajorVersion
     * }
     */
    public static short MajorVersion(MemorySegment struct) {
        return struct.get(MajorVersion$LAYOUT, MajorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD MajorVersion
     * }
     */
    public static void MajorVersion(MemorySegment struct, short fieldValue) {
        struct.set(MajorVersion$LAYOUT, MajorVersion$OFFSET, fieldValue);
    }

    private static final OfShort MinorVersion$LAYOUT = (OfShort)$LAYOUT.select(groupElement("MinorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD MinorVersion
     * }
     */
    public static final OfShort MinorVersion$layout() {
        return MinorVersion$LAYOUT;
    }

    private static final long MinorVersion$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD MinorVersion
     * }
     */
    public static final long MinorVersion$offset() {
        return MinorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD MinorVersion
     * }
     */
    public static short MinorVersion(MemorySegment struct) {
        return struct.get(MinorVersion$LAYOUT, MinorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD MinorVersion
     * }
     */
    public static void MinorVersion(MemorySegment struct, short fieldValue) {
        struct.set(MinorVersion$LAYOUT, MinorVersion$OFFSET, fieldValue);
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

    private static final long Type$OFFSET = 12;

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

    private static final OfInt SizeOfData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SizeOfData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SizeOfData
     * }
     */
    public static final OfInt SizeOfData$layout() {
        return SizeOfData$LAYOUT;
    }

    private static final long SizeOfData$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SizeOfData
     * }
     */
    public static final long SizeOfData$offset() {
        return SizeOfData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SizeOfData
     * }
     */
    public static int SizeOfData(MemorySegment struct) {
        return struct.get(SizeOfData$LAYOUT, SizeOfData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SizeOfData
     * }
     */
    public static void SizeOfData(MemorySegment struct, int fieldValue) {
        struct.set(SizeOfData$LAYOUT, SizeOfData$OFFSET, fieldValue);
    }

    private static final OfInt AddressOfRawData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AddressOfRawData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AddressOfRawData
     * }
     */
    public static final OfInt AddressOfRawData$layout() {
        return AddressOfRawData$LAYOUT;
    }

    private static final long AddressOfRawData$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AddressOfRawData
     * }
     */
    public static final long AddressOfRawData$offset() {
        return AddressOfRawData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AddressOfRawData
     * }
     */
    public static int AddressOfRawData(MemorySegment struct) {
        return struct.get(AddressOfRawData$LAYOUT, AddressOfRawData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AddressOfRawData
     * }
     */
    public static void AddressOfRawData(MemorySegment struct, int fieldValue) {
        struct.set(AddressOfRawData$LAYOUT, AddressOfRawData$OFFSET, fieldValue);
    }

    private static final OfInt PointerToRawData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PointerToRawData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PointerToRawData
     * }
     */
    public static final OfInt PointerToRawData$layout() {
        return PointerToRawData$LAYOUT;
    }

    private static final long PointerToRawData$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PointerToRawData
     * }
     */
    public static final long PointerToRawData$offset() {
        return PointerToRawData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PointerToRawData
     * }
     */
    public static int PointerToRawData(MemorySegment struct) {
        return struct.get(PointerToRawData$LAYOUT, PointerToRawData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PointerToRawData
     * }
     */
    public static void PointerToRawData(MemorySegment struct, int fieldValue) {
        struct.set(PointerToRawData$LAYOUT, PointerToRawData$OFFSET, fieldValue);
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

