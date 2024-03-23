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
 * struct tagMIDIOUTCAPS2W {
 *     WORD wMid;
 *     WORD wPid;
 *     MMVERSION vDriverVersion;
 *     WCHAR szPname[32];
 *     WORD wTechnology;
 *     WORD wVoices;
 *     WORD wNotes;
 *     WORD wChannelMask;
 *     DWORD dwSupport;
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * }
 * }
 */
public class tagMIDIOUTCAPS2W {

    tagMIDIOUTCAPS2W() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wMid"),
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wPid"),
        Windows_h.align(Windows_h.C_INT, 1).withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, Windows_h.align(Windows_h.C_SHORT, 1)).withName("szPname"),
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wTechnology"),
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wVoices"),
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wNotes"),
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wChannelMask"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwSupport"),
        Windows_h.align(_GUID.layout(), 1).withName("ManufacturerGuid"),
        Windows_h.align(_GUID.layout(), 1).withName("ProductGuid"),
        Windows_h.align(_GUID.layout(), 1).withName("NameGuid")
    ).withName("tagMIDIOUTCAPS2W");

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
     * WCHAR szPname[32]
     * }
     */
    public static final SequenceLayout szPname$layout() {
        return szPname$LAYOUT;
    }

    private static final long szPname$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR szPname[32]
     * }
     */
    public static final long szPname$offset() {
        return szPname$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR szPname[32]
     * }
     */
    public static MemorySegment szPname(MemorySegment struct) {
        return struct.asSlice(szPname$OFFSET, szPname$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR szPname[32]
     * }
     */
    public static void szPname(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szPname$OFFSET, szPname$LAYOUT.byteSize());
    }

    private static long[] szPname$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR szPname[32]
     * }
     */
    public static long[] szPname$dimensions() {
        return szPname$DIMS;
    }
    private static final VarHandle szPname$ELEM_HANDLE = szPname$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR szPname[32]
     * }
     */
    public static short szPname(MemorySegment struct, long index0) {
        return (short)szPname$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR szPname[32]
     * }
     */
    public static void szPname(MemorySegment struct, long index0, short fieldValue) {
        szPname$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfShort wTechnology$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wTechnology"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wTechnology
     * }
     */
    public static final OfShort wTechnology$layout() {
        return wTechnology$LAYOUT;
    }

    private static final long wTechnology$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wTechnology
     * }
     */
    public static final long wTechnology$offset() {
        return wTechnology$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wTechnology
     * }
     */
    public static short wTechnology(MemorySegment struct) {
        return struct.get(wTechnology$LAYOUT, wTechnology$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wTechnology
     * }
     */
    public static void wTechnology(MemorySegment struct, short fieldValue) {
        struct.set(wTechnology$LAYOUT, wTechnology$OFFSET, fieldValue);
    }

    private static final OfShort wVoices$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wVoices"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wVoices
     * }
     */
    public static final OfShort wVoices$layout() {
        return wVoices$LAYOUT;
    }

    private static final long wVoices$OFFSET = 74;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wVoices
     * }
     */
    public static final long wVoices$offset() {
        return wVoices$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wVoices
     * }
     */
    public static short wVoices(MemorySegment struct) {
        return struct.get(wVoices$LAYOUT, wVoices$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wVoices
     * }
     */
    public static void wVoices(MemorySegment struct, short fieldValue) {
        struct.set(wVoices$LAYOUT, wVoices$OFFSET, fieldValue);
    }

    private static final OfShort wNotes$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wNotes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wNotes
     * }
     */
    public static final OfShort wNotes$layout() {
        return wNotes$LAYOUT;
    }

    private static final long wNotes$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wNotes
     * }
     */
    public static final long wNotes$offset() {
        return wNotes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wNotes
     * }
     */
    public static short wNotes(MemorySegment struct) {
        return struct.get(wNotes$LAYOUT, wNotes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wNotes
     * }
     */
    public static void wNotes(MemorySegment struct, short fieldValue) {
        struct.set(wNotes$LAYOUT, wNotes$OFFSET, fieldValue);
    }

    private static final OfShort wChannelMask$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wChannelMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wChannelMask
     * }
     */
    public static final OfShort wChannelMask$layout() {
        return wChannelMask$LAYOUT;
    }

    private static final long wChannelMask$OFFSET = 78;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wChannelMask
     * }
     */
    public static final long wChannelMask$offset() {
        return wChannelMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wChannelMask
     * }
     */
    public static short wChannelMask(MemorySegment struct) {
        return struct.get(wChannelMask$LAYOUT, wChannelMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wChannelMask
     * }
     */
    public static void wChannelMask(MemorySegment struct, short fieldValue) {
        struct.set(wChannelMask$LAYOUT, wChannelMask$OFFSET, fieldValue);
    }

    private static final OfInt dwSupport$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSupport"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSupport
     * }
     */
    public static final OfInt dwSupport$layout() {
        return dwSupport$LAYOUT;
    }

    private static final long dwSupport$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSupport
     * }
     */
    public static final long dwSupport$offset() {
        return dwSupport$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSupport
     * }
     */
    public static int dwSupport(MemorySegment struct) {
        return struct.get(dwSupport$LAYOUT, dwSupport$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSupport
     * }
     */
    public static void dwSupport(MemorySegment struct, int fieldValue) {
        struct.set(dwSupport$LAYOUT, dwSupport$OFFSET, fieldValue);
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

    private static final long ManufacturerGuid$OFFSET = 84;

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

    private static final long ProductGuid$OFFSET = 100;

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

    private static final long NameGuid$OFFSET = 116;

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

