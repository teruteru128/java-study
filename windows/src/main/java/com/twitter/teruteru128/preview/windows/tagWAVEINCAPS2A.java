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
 * struct tagWAVEINCAPS2A {
 *     WORD wMid;
 *     WORD wPid;
 *     MMVERSION vDriverVersion;
 *     CHAR szPname[32];
 *     DWORD dwFormats;
 *     WORD wChannels;
 *     WORD wReserved1;
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * }
 * }
 */
public class tagWAVEINCAPS2A {

    tagWAVEINCAPS2A() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wMid"),
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wPid"),
        Windows_h.align(Windows_h.C_INT, 1).withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, Windows_h.C_CHAR).withName("szPname"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwFormats"),
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wChannels"),
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wReserved1"),
        Windows_h.align(_GUID.layout(), 1).withName("ManufacturerGuid"),
        Windows_h.align(_GUID.layout(), 1).withName("ProductGuid"),
        Windows_h.align(_GUID.layout(), 1).withName("NameGuid")
    ).withName("tagWAVEINCAPS2A");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort wMid$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wMid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wMid
     * }
     */
    public static final OfShort wMid$layout() {
        return wMid$LAYOUT;
    }

    private static final long wMid$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wMid
     * }
     */
    public static final long wMid$offset() {
        return wMid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wMid
     * }
     */
    public static short wMid(MemorySegment struct) {
        return struct.get(wMid$LAYOUT, wMid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wMid
     * }
     */
    public static void wMid(MemorySegment struct, short fieldValue) {
        struct.set(wMid$LAYOUT, wMid$OFFSET, fieldValue);
    }

    private static final OfShort wPid$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wPid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wPid
     * }
     */
    public static final OfShort wPid$layout() {
        return wPid$LAYOUT;
    }

    private static final long wPid$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wPid
     * }
     */
    public static final long wPid$offset() {
        return wPid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wPid
     * }
     */
    public static short wPid(MemorySegment struct) {
        return struct.get(wPid$LAYOUT, wPid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wPid
     * }
     */
    public static void wPid(MemorySegment struct, short fieldValue) {
        struct.set(wPid$LAYOUT, wPid$OFFSET, fieldValue);
    }

    private static final OfInt vDriverVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("vDriverVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MMVERSION vDriverVersion
     * }
     */
    public static final OfInt vDriverVersion$layout() {
        return vDriverVersion$LAYOUT;
    }

    private static final long vDriverVersion$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MMVERSION vDriverVersion
     * }
     */
    public static final long vDriverVersion$offset() {
        return vDriverVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MMVERSION vDriverVersion
     * }
     */
    public static int vDriverVersion(MemorySegment struct) {
        return struct.get(vDriverVersion$LAYOUT, vDriverVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MMVERSION vDriverVersion
     * }
     */
    public static void vDriverVersion(MemorySegment struct, int fieldValue) {
        struct.set(vDriverVersion$LAYOUT, vDriverVersion$OFFSET, fieldValue);
    }

    private static final SequenceLayout szPname$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szPname"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR szPname[32]
     * }
     */
    public static final SequenceLayout szPname$layout() {
        return szPname$LAYOUT;
    }

    private static final long szPname$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR szPname[32]
     * }
     */
    public static final long szPname$offset() {
        return szPname$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR szPname[32]
     * }
     */
    public static MemorySegment szPname(MemorySegment struct) {
        return struct.asSlice(szPname$OFFSET, szPname$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR szPname[32]
     * }
     */
    public static void szPname(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szPname$OFFSET, szPname$LAYOUT.byteSize());
    }

    private static long[] szPname$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR szPname[32]
     * }
     */
    public static long[] szPname$dimensions() {
        return szPname$DIMS;
    }
    private static final VarHandle szPname$ELEM_HANDLE = szPname$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR szPname[32]
     * }
     */
    public static byte szPname(MemorySegment struct, long index0) {
        return (byte)szPname$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR szPname[32]
     * }
     */
    public static void szPname(MemorySegment struct, long index0, byte fieldValue) {
        szPname$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt dwFormats$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFormats"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFormats
     * }
     */
    public static final OfInt dwFormats$layout() {
        return dwFormats$LAYOUT;
    }

    private static final long dwFormats$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFormats
     * }
     */
    public static final long dwFormats$offset() {
        return dwFormats$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFormats
     * }
     */
    public static int dwFormats(MemorySegment struct) {
        return struct.get(dwFormats$LAYOUT, dwFormats$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFormats
     * }
     */
    public static void dwFormats(MemorySegment struct, int fieldValue) {
        struct.set(dwFormats$LAYOUT, dwFormats$OFFSET, fieldValue);
    }

    private static final OfShort wChannels$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wChannels"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wChannels
     * }
     */
    public static final OfShort wChannels$layout() {
        return wChannels$LAYOUT;
    }

    private static final long wChannels$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wChannels
     * }
     */
    public static final long wChannels$offset() {
        return wChannels$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wChannels
     * }
     */
    public static short wChannels(MemorySegment struct) {
        return struct.get(wChannels$LAYOUT, wChannels$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wChannels
     * }
     */
    public static void wChannels(MemorySegment struct, short fieldValue) {
        struct.set(wChannels$LAYOUT, wChannels$OFFSET, fieldValue);
    }

    private static final OfShort wReserved1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wReserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wReserved1
     * }
     */
    public static final OfShort wReserved1$layout() {
        return wReserved1$LAYOUT;
    }

    private static final long wReserved1$OFFSET = 46;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wReserved1
     * }
     */
    public static final long wReserved1$offset() {
        return wReserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wReserved1
     * }
     */
    public static short wReserved1(MemorySegment struct) {
        return struct.get(wReserved1$LAYOUT, wReserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wReserved1
     * }
     */
    public static void wReserved1(MemorySegment struct, short fieldValue) {
        struct.set(wReserved1$LAYOUT, wReserved1$OFFSET, fieldValue);
    }

    private static final GroupLayout ManufacturerGuid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ManufacturerGuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID ManufacturerGuid
     * }
     */
    public static final GroupLayout ManufacturerGuid$layout() {
        return ManufacturerGuid$LAYOUT;
    }

    private static final long ManufacturerGuid$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID ManufacturerGuid
     * }
     */
    public static final long ManufacturerGuid$offset() {
        return ManufacturerGuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID ManufacturerGuid
     * }
     */
    public static MemorySegment ManufacturerGuid(MemorySegment struct) {
        return struct.asSlice(ManufacturerGuid$OFFSET, ManufacturerGuid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID ManufacturerGuid
     * }
     */
    public static void ManufacturerGuid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ManufacturerGuid$OFFSET, ManufacturerGuid$LAYOUT.byteSize());
    }

    private static final GroupLayout ProductGuid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ProductGuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID ProductGuid
     * }
     */
    public static final GroupLayout ProductGuid$layout() {
        return ProductGuid$LAYOUT;
    }

    private static final long ProductGuid$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID ProductGuid
     * }
     */
    public static final long ProductGuid$offset() {
        return ProductGuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID ProductGuid
     * }
     */
    public static MemorySegment ProductGuid(MemorySegment struct) {
        return struct.asSlice(ProductGuid$OFFSET, ProductGuid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID ProductGuid
     * }
     */
    public static void ProductGuid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ProductGuid$OFFSET, ProductGuid$LAYOUT.byteSize());
    }

    private static final GroupLayout NameGuid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("NameGuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID NameGuid
     * }
     */
    public static final GroupLayout NameGuid$layout() {
        return NameGuid$LAYOUT;
    }

    private static final long NameGuid$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID NameGuid
     * }
     */
    public static final long NameGuid$offset() {
        return NameGuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID NameGuid
     * }
     */
    public static MemorySegment NameGuid(MemorySegment struct) {
        return struct.asSlice(NameGuid$OFFSET, NameGuid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID NameGuid
     * }
     */
    public static void NameGuid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, NameGuid$OFFSET, NameGuid$LAYOUT.byteSize());
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

