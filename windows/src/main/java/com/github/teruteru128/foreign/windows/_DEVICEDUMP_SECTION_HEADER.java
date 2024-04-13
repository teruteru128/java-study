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
 * struct _DEVICEDUMP_SECTION_HEADER {
 *     GUID guidDeviceDataId;
 *     BYTE sOrganizationID[16];
 *     DWORD dwFirmwareRevision;
 *     BYTE sModelNumber[32];
 *     BYTE szDeviceManufacturingID[32];
 *     DWORD dwFlags;
 *     DWORD bRestrictedPrivateDataVersion;
 *     DWORD dwFirmwareIssueId;
 *     BYTE szIssueDescriptionString[132];
 * }
 * }
 */
public class _DEVICEDUMP_SECTION_HEADER {

    _DEVICEDUMP_SECTION_HEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(_GUID.layout(), 1).withName("guidDeviceDataId"),
        MemoryLayout.sequenceLayout(16, Windows_h.C_CHAR).withName("sOrganizationID"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwFirmwareRevision"),
        MemoryLayout.sequenceLayout(32, Windows_h.C_CHAR).withName("sModelNumber"),
        MemoryLayout.sequenceLayout(32, Windows_h.C_CHAR).withName("szDeviceManufacturingID"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwFlags"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("bRestrictedPrivateDataVersion"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwFirmwareIssueId"),
        MemoryLayout.sequenceLayout(132, Windows_h.C_CHAR).withName("szIssueDescriptionString")
    ).withName("_DEVICEDUMP_SECTION_HEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout guidDeviceDataId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("guidDeviceDataId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID guidDeviceDataId
     * }
     */
    public static final GroupLayout guidDeviceDataId$layout() {
        return guidDeviceDataId$LAYOUT;
    }

    private static final long guidDeviceDataId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID guidDeviceDataId
     * }
     */
    public static final long guidDeviceDataId$offset() {
        return guidDeviceDataId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID guidDeviceDataId
     * }
     */
    public static MemorySegment guidDeviceDataId(MemorySegment struct) {
        return struct.asSlice(guidDeviceDataId$OFFSET, guidDeviceDataId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID guidDeviceDataId
     * }
     */
    public static void guidDeviceDataId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, guidDeviceDataId$OFFSET, guidDeviceDataId$LAYOUT.byteSize());
    }

    private static final SequenceLayout sOrganizationID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("sOrganizationID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE sOrganizationID[16]
     * }
     */
    public static final SequenceLayout sOrganizationID$layout() {
        return sOrganizationID$LAYOUT;
    }

    private static final long sOrganizationID$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE sOrganizationID[16]
     * }
     */
    public static final long sOrganizationID$offset() {
        return sOrganizationID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE sOrganizationID[16]
     * }
     */
    public static MemorySegment sOrganizationID(MemorySegment struct) {
        return struct.asSlice(sOrganizationID$OFFSET, sOrganizationID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE sOrganizationID[16]
     * }
     */
    public static void sOrganizationID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sOrganizationID$OFFSET, sOrganizationID$LAYOUT.byteSize());
    }

    private static long[] sOrganizationID$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE sOrganizationID[16]
     * }
     */
    public static long[] sOrganizationID$dimensions() {
        return sOrganizationID$DIMS;
    }
    private static final VarHandle sOrganizationID$ELEM_HANDLE = sOrganizationID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE sOrganizationID[16]
     * }
     */
    public static byte sOrganizationID(MemorySegment struct, long index0) {
        return (byte)sOrganizationID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE sOrganizationID[16]
     * }
     */
    public static void sOrganizationID(MemorySegment struct, long index0, byte fieldValue) {
        sOrganizationID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt dwFirmwareRevision$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFirmwareRevision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFirmwareRevision
     * }
     */
    public static final OfInt dwFirmwareRevision$layout() {
        return dwFirmwareRevision$LAYOUT;
    }

    private static final long dwFirmwareRevision$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFirmwareRevision
     * }
     */
    public static final long dwFirmwareRevision$offset() {
        return dwFirmwareRevision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFirmwareRevision
     * }
     */
    public static int dwFirmwareRevision(MemorySegment struct) {
        return struct.get(dwFirmwareRevision$LAYOUT, dwFirmwareRevision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFirmwareRevision
     * }
     */
    public static void dwFirmwareRevision(MemorySegment struct, int fieldValue) {
        struct.set(dwFirmwareRevision$LAYOUT, dwFirmwareRevision$OFFSET, fieldValue);
    }

    private static final SequenceLayout sModelNumber$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("sModelNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE sModelNumber[32]
     * }
     */
    public static final SequenceLayout sModelNumber$layout() {
        return sModelNumber$LAYOUT;
    }

    private static final long sModelNumber$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE sModelNumber[32]
     * }
     */
    public static final long sModelNumber$offset() {
        return sModelNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE sModelNumber[32]
     * }
     */
    public static MemorySegment sModelNumber(MemorySegment struct) {
        return struct.asSlice(sModelNumber$OFFSET, sModelNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE sModelNumber[32]
     * }
     */
    public static void sModelNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sModelNumber$OFFSET, sModelNumber$LAYOUT.byteSize());
    }

    private static long[] sModelNumber$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE sModelNumber[32]
     * }
     */
    public static long[] sModelNumber$dimensions() {
        return sModelNumber$DIMS;
    }
    private static final VarHandle sModelNumber$ELEM_HANDLE = sModelNumber$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE sModelNumber[32]
     * }
     */
    public static byte sModelNumber(MemorySegment struct, long index0) {
        return (byte)sModelNumber$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE sModelNumber[32]
     * }
     */
    public static void sModelNumber(MemorySegment struct, long index0, byte fieldValue) {
        sModelNumber$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout szDeviceManufacturingID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szDeviceManufacturingID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE szDeviceManufacturingID[32]
     * }
     */
    public static final SequenceLayout szDeviceManufacturingID$layout() {
        return szDeviceManufacturingID$LAYOUT;
    }

    private static final long szDeviceManufacturingID$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE szDeviceManufacturingID[32]
     * }
     */
    public static final long szDeviceManufacturingID$offset() {
        return szDeviceManufacturingID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE szDeviceManufacturingID[32]
     * }
     */
    public static MemorySegment szDeviceManufacturingID(MemorySegment struct) {
        return struct.asSlice(szDeviceManufacturingID$OFFSET, szDeviceManufacturingID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE szDeviceManufacturingID[32]
     * }
     */
    public static void szDeviceManufacturingID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szDeviceManufacturingID$OFFSET, szDeviceManufacturingID$LAYOUT.byteSize());
    }

    private static long[] szDeviceManufacturingID$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE szDeviceManufacturingID[32]
     * }
     */
    public static long[] szDeviceManufacturingID$dimensions() {
        return szDeviceManufacturingID$DIMS;
    }
    private static final VarHandle szDeviceManufacturingID$ELEM_HANDLE = szDeviceManufacturingID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE szDeviceManufacturingID[32]
     * }
     */
    public static byte szDeviceManufacturingID(MemorySegment struct, long index0) {
        return (byte)szDeviceManufacturingID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE szDeviceManufacturingID[32]
     * }
     */
    public static void szDeviceManufacturingID(MemorySegment struct, long index0, byte fieldValue) {
        szDeviceManufacturingID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 100;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
    }

    private static final OfInt bRestrictedPrivateDataVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bRestrictedPrivateDataVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD bRestrictedPrivateDataVersion
     * }
     */
    public static final OfInt bRestrictedPrivateDataVersion$layout() {
        return bRestrictedPrivateDataVersion$LAYOUT;
    }

    private static final long bRestrictedPrivateDataVersion$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD bRestrictedPrivateDataVersion
     * }
     */
    public static final long bRestrictedPrivateDataVersion$offset() {
        return bRestrictedPrivateDataVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD bRestrictedPrivateDataVersion
     * }
     */
    public static int bRestrictedPrivateDataVersion(MemorySegment struct) {
        return struct.get(bRestrictedPrivateDataVersion$LAYOUT, bRestrictedPrivateDataVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD bRestrictedPrivateDataVersion
     * }
     */
    public static void bRestrictedPrivateDataVersion(MemorySegment struct, int fieldValue) {
        struct.set(bRestrictedPrivateDataVersion$LAYOUT, bRestrictedPrivateDataVersion$OFFSET, fieldValue);
    }

    private static final OfInt dwFirmwareIssueId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFirmwareIssueId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFirmwareIssueId
     * }
     */
    public static final OfInt dwFirmwareIssueId$layout() {
        return dwFirmwareIssueId$LAYOUT;
    }

    private static final long dwFirmwareIssueId$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFirmwareIssueId
     * }
     */
    public static final long dwFirmwareIssueId$offset() {
        return dwFirmwareIssueId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFirmwareIssueId
     * }
     */
    public static int dwFirmwareIssueId(MemorySegment struct) {
        return struct.get(dwFirmwareIssueId$LAYOUT, dwFirmwareIssueId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFirmwareIssueId
     * }
     */
    public static void dwFirmwareIssueId(MemorySegment struct, int fieldValue) {
        struct.set(dwFirmwareIssueId$LAYOUT, dwFirmwareIssueId$OFFSET, fieldValue);
    }

    private static final SequenceLayout szIssueDescriptionString$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szIssueDescriptionString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE szIssueDescriptionString[132]
     * }
     */
    public static final SequenceLayout szIssueDescriptionString$layout() {
        return szIssueDescriptionString$LAYOUT;
    }

    private static final long szIssueDescriptionString$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE szIssueDescriptionString[132]
     * }
     */
    public static final long szIssueDescriptionString$offset() {
        return szIssueDescriptionString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE szIssueDescriptionString[132]
     * }
     */
    public static MemorySegment szIssueDescriptionString(MemorySegment struct) {
        return struct.asSlice(szIssueDescriptionString$OFFSET, szIssueDescriptionString$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE szIssueDescriptionString[132]
     * }
     */
    public static void szIssueDescriptionString(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szIssueDescriptionString$OFFSET, szIssueDescriptionString$LAYOUT.byteSize());
    }

    private static long[] szIssueDescriptionString$DIMS = { 132 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE szIssueDescriptionString[132]
     * }
     */
    public static long[] szIssueDescriptionString$dimensions() {
        return szIssueDescriptionString$DIMS;
    }
    private static final VarHandle szIssueDescriptionString$ELEM_HANDLE = szIssueDescriptionString$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE szIssueDescriptionString[132]
     * }
     */
    public static byte szIssueDescriptionString(MemorySegment struct, long index0) {
        return (byte)szIssueDescriptionString$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE szIssueDescriptionString[132]
     * }
     */
    public static void szIssueDescriptionString(MemorySegment struct, long index0, byte fieldValue) {
        szIssueDescriptionString$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
