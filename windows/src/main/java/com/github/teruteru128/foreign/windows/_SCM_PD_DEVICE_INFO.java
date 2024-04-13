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
 * struct _SCM_PD_DEVICE_INFO {
 *     DWORD Version;
 *     DWORD Size;
 *     GUID DeviceGuid;
 *     DWORD UnsafeShutdownCount;
 *     DWORD64 PersistentMemorySizeInBytes;
 *     DWORD64 VolatileMemorySizeInBytes;
 *     DWORD64 TotalMemorySizeInBytes;
 *     DWORD SlotNumber;
 *     DWORD DeviceHandle;
 *     WORD PhysicalId;
 *     BYTE NumberOfFormatInterfaceCodes;
 *     WORD FormatInterfaceCodes[8];
 *     DWORD VendorId;
 *     DWORD ProductId;
 *     DWORD SubsystemDeviceId;
 *     DWORD SubsystemVendorId;
 *     BYTE ManufacturingLocation;
 *     BYTE ManufacturingWeek;
 *     BYTE ManufacturingYear;
 *     DWORD SerialNumber4Byte;
 *     DWORD SerialNumberLengthInChars;
 *     CHAR SerialNumber[1];
 * }
 * }
 */
public class _SCM_PD_DEVICE_INFO {

    _SCM_PD_DEVICE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Version"),
        Windows_h.C_LONG.withName("Size"),
        _GUID.layout().withName("DeviceGuid"),
        Windows_h.C_LONG.withName("UnsafeShutdownCount"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG_LONG.withName("PersistentMemorySizeInBytes"),
        Windows_h.C_LONG_LONG.withName("VolatileMemorySizeInBytes"),
        Windows_h.C_LONG_LONG.withName("TotalMemorySizeInBytes"),
        Windows_h.C_LONG.withName("SlotNumber"),
        Windows_h.C_LONG.withName("DeviceHandle"),
        Windows_h.C_SHORT.withName("PhysicalId"),
        Windows_h.C_CHAR.withName("NumberOfFormatInterfaceCodes"),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.sequenceLayout(8, Windows_h.C_SHORT).withName("FormatInterfaceCodes"),
        Windows_h.C_LONG.withName("VendorId"),
        Windows_h.C_LONG.withName("ProductId"),
        Windows_h.C_LONG.withName("SubsystemDeviceId"),
        Windows_h.C_LONG.withName("SubsystemVendorId"),
        Windows_h.C_CHAR.withName("ManufacturingLocation"),
        Windows_h.C_CHAR.withName("ManufacturingWeek"),
        Windows_h.C_CHAR.withName("ManufacturingYear"),
        MemoryLayout.paddingLayout(1),
        Windows_h.C_LONG.withName("SerialNumber4Byte"),
        Windows_h.C_LONG.withName("SerialNumberLengthInChars"),
        MemoryLayout.sequenceLayout(1, Windows_h.C_CHAR).withName("SerialNumber"),
        MemoryLayout.paddingLayout(7)
    ).withName("_SCM_PD_DEVICE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

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

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final GroupLayout DeviceGuid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("DeviceGuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID DeviceGuid
     * }
     */
    public static final GroupLayout DeviceGuid$layout() {
        return DeviceGuid$LAYOUT;
    }

    private static final long DeviceGuid$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID DeviceGuid
     * }
     */
    public static final long DeviceGuid$offset() {
        return DeviceGuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID DeviceGuid
     * }
     */
    public static MemorySegment DeviceGuid(MemorySegment struct) {
        return struct.asSlice(DeviceGuid$OFFSET, DeviceGuid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID DeviceGuid
     * }
     */
    public static void DeviceGuid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, DeviceGuid$OFFSET, DeviceGuid$LAYOUT.byteSize());
    }

    private static final OfInt UnsafeShutdownCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("UnsafeShutdownCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD UnsafeShutdownCount
     * }
     */
    public static final OfInt UnsafeShutdownCount$layout() {
        return UnsafeShutdownCount$LAYOUT;
    }

    private static final long UnsafeShutdownCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD UnsafeShutdownCount
     * }
     */
    public static final long UnsafeShutdownCount$offset() {
        return UnsafeShutdownCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD UnsafeShutdownCount
     * }
     */
    public static int UnsafeShutdownCount(MemorySegment struct) {
        return struct.get(UnsafeShutdownCount$LAYOUT, UnsafeShutdownCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD UnsafeShutdownCount
     * }
     */
    public static void UnsafeShutdownCount(MemorySegment struct, int fieldValue) {
        struct.set(UnsafeShutdownCount$LAYOUT, UnsafeShutdownCount$OFFSET, fieldValue);
    }

    private static final OfLong PersistentMemorySizeInBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("PersistentMemorySizeInBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 PersistentMemorySizeInBytes
     * }
     */
    public static final OfLong PersistentMemorySizeInBytes$layout() {
        return PersistentMemorySizeInBytes$LAYOUT;
    }

    private static final long PersistentMemorySizeInBytes$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 PersistentMemorySizeInBytes
     * }
     */
    public static final long PersistentMemorySizeInBytes$offset() {
        return PersistentMemorySizeInBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 PersistentMemorySizeInBytes
     * }
     */
    public static long PersistentMemorySizeInBytes(MemorySegment struct) {
        return struct.get(PersistentMemorySizeInBytes$LAYOUT, PersistentMemorySizeInBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 PersistentMemorySizeInBytes
     * }
     */
    public static void PersistentMemorySizeInBytes(MemorySegment struct, long fieldValue) {
        struct.set(PersistentMemorySizeInBytes$LAYOUT, PersistentMemorySizeInBytes$OFFSET, fieldValue);
    }

    private static final OfLong VolatileMemorySizeInBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("VolatileMemorySizeInBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 VolatileMemorySizeInBytes
     * }
     */
    public static final OfLong VolatileMemorySizeInBytes$layout() {
        return VolatileMemorySizeInBytes$LAYOUT;
    }

    private static final long VolatileMemorySizeInBytes$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 VolatileMemorySizeInBytes
     * }
     */
    public static final long VolatileMemorySizeInBytes$offset() {
        return VolatileMemorySizeInBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 VolatileMemorySizeInBytes
     * }
     */
    public static long VolatileMemorySizeInBytes(MemorySegment struct) {
        return struct.get(VolatileMemorySizeInBytes$LAYOUT, VolatileMemorySizeInBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 VolatileMemorySizeInBytes
     * }
     */
    public static void VolatileMemorySizeInBytes(MemorySegment struct, long fieldValue) {
        struct.set(VolatileMemorySizeInBytes$LAYOUT, VolatileMemorySizeInBytes$OFFSET, fieldValue);
    }

    private static final OfLong TotalMemorySizeInBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TotalMemorySizeInBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 TotalMemorySizeInBytes
     * }
     */
    public static final OfLong TotalMemorySizeInBytes$layout() {
        return TotalMemorySizeInBytes$LAYOUT;
    }

    private static final long TotalMemorySizeInBytes$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 TotalMemorySizeInBytes
     * }
     */
    public static final long TotalMemorySizeInBytes$offset() {
        return TotalMemorySizeInBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 TotalMemorySizeInBytes
     * }
     */
    public static long TotalMemorySizeInBytes(MemorySegment struct) {
        return struct.get(TotalMemorySizeInBytes$LAYOUT, TotalMemorySizeInBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 TotalMemorySizeInBytes
     * }
     */
    public static void TotalMemorySizeInBytes(MemorySegment struct, long fieldValue) {
        struct.set(TotalMemorySizeInBytes$LAYOUT, TotalMemorySizeInBytes$OFFSET, fieldValue);
    }

    private static final OfInt SlotNumber$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SlotNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SlotNumber
     * }
     */
    public static final OfInt SlotNumber$layout() {
        return SlotNumber$LAYOUT;
    }

    private static final long SlotNumber$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SlotNumber
     * }
     */
    public static final long SlotNumber$offset() {
        return SlotNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SlotNumber
     * }
     */
    public static int SlotNumber(MemorySegment struct) {
        return struct.get(SlotNumber$LAYOUT, SlotNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SlotNumber
     * }
     */
    public static void SlotNumber(MemorySegment struct, int fieldValue) {
        struct.set(SlotNumber$LAYOUT, SlotNumber$OFFSET, fieldValue);
    }

    private static final OfInt DeviceHandle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DeviceHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DeviceHandle
     * }
     */
    public static final OfInt DeviceHandle$layout() {
        return DeviceHandle$LAYOUT;
    }

    private static final long DeviceHandle$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DeviceHandle
     * }
     */
    public static final long DeviceHandle$offset() {
        return DeviceHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DeviceHandle
     * }
     */
    public static int DeviceHandle(MemorySegment struct) {
        return struct.get(DeviceHandle$LAYOUT, DeviceHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DeviceHandle
     * }
     */
    public static void DeviceHandle(MemorySegment struct, int fieldValue) {
        struct.set(DeviceHandle$LAYOUT, DeviceHandle$OFFSET, fieldValue);
    }

    private static final OfShort PhysicalId$LAYOUT = (OfShort)$LAYOUT.select(groupElement("PhysicalId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD PhysicalId
     * }
     */
    public static final OfShort PhysicalId$layout() {
        return PhysicalId$LAYOUT;
    }

    private static final long PhysicalId$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD PhysicalId
     * }
     */
    public static final long PhysicalId$offset() {
        return PhysicalId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD PhysicalId
     * }
     */
    public static short PhysicalId(MemorySegment struct) {
        return struct.get(PhysicalId$LAYOUT, PhysicalId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD PhysicalId
     * }
     */
    public static void PhysicalId(MemorySegment struct, short fieldValue) {
        struct.set(PhysicalId$LAYOUT, PhysicalId$OFFSET, fieldValue);
    }

    private static final OfByte NumberOfFormatInterfaceCodes$LAYOUT = (OfByte)$LAYOUT.select(groupElement("NumberOfFormatInterfaceCodes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE NumberOfFormatInterfaceCodes
     * }
     */
    public static final OfByte NumberOfFormatInterfaceCodes$layout() {
        return NumberOfFormatInterfaceCodes$LAYOUT;
    }

    private static final long NumberOfFormatInterfaceCodes$OFFSET = 66;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE NumberOfFormatInterfaceCodes
     * }
     */
    public static final long NumberOfFormatInterfaceCodes$offset() {
        return NumberOfFormatInterfaceCodes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE NumberOfFormatInterfaceCodes
     * }
     */
    public static byte NumberOfFormatInterfaceCodes(MemorySegment struct) {
        return struct.get(NumberOfFormatInterfaceCodes$LAYOUT, NumberOfFormatInterfaceCodes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE NumberOfFormatInterfaceCodes
     * }
     */
    public static void NumberOfFormatInterfaceCodes(MemorySegment struct, byte fieldValue) {
        struct.set(NumberOfFormatInterfaceCodes$LAYOUT, NumberOfFormatInterfaceCodes$OFFSET, fieldValue);
    }

    private static final SequenceLayout FormatInterfaceCodes$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FormatInterfaceCodes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD FormatInterfaceCodes[8]
     * }
     */
    public static final SequenceLayout FormatInterfaceCodes$layout() {
        return FormatInterfaceCodes$LAYOUT;
    }

    private static final long FormatInterfaceCodes$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD FormatInterfaceCodes[8]
     * }
     */
    public static final long FormatInterfaceCodes$offset() {
        return FormatInterfaceCodes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD FormatInterfaceCodes[8]
     * }
     */
    public static MemorySegment FormatInterfaceCodes(MemorySegment struct) {
        return struct.asSlice(FormatInterfaceCodes$OFFSET, FormatInterfaceCodes$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD FormatInterfaceCodes[8]
     * }
     */
    public static void FormatInterfaceCodes(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FormatInterfaceCodes$OFFSET, FormatInterfaceCodes$LAYOUT.byteSize());
    }

    private static long[] FormatInterfaceCodes$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WORD FormatInterfaceCodes[8]
     * }
     */
    public static long[] FormatInterfaceCodes$dimensions() {
        return FormatInterfaceCodes$DIMS;
    }
    private static final VarHandle FormatInterfaceCodes$ELEM_HANDLE = FormatInterfaceCodes$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WORD FormatInterfaceCodes[8]
     * }
     */
    public static short FormatInterfaceCodes(MemorySegment struct, long index0) {
        return (short)FormatInterfaceCodes$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WORD FormatInterfaceCodes[8]
     * }
     */
    public static void FormatInterfaceCodes(MemorySegment struct, long index0, short fieldValue) {
        FormatInterfaceCodes$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt VendorId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("VendorId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD VendorId
     * }
     */
    public static final OfInt VendorId$layout() {
        return VendorId$LAYOUT;
    }

    private static final long VendorId$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD VendorId
     * }
     */
    public static final long VendorId$offset() {
        return VendorId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD VendorId
     * }
     */
    public static int VendorId(MemorySegment struct) {
        return struct.get(VendorId$LAYOUT, VendorId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD VendorId
     * }
     */
    public static void VendorId(MemorySegment struct, int fieldValue) {
        struct.set(VendorId$LAYOUT, VendorId$OFFSET, fieldValue);
    }

    private static final OfInt ProductId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ProductId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ProductId
     * }
     */
    public static final OfInt ProductId$layout() {
        return ProductId$LAYOUT;
    }

    private static final long ProductId$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ProductId
     * }
     */
    public static final long ProductId$offset() {
        return ProductId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ProductId
     * }
     */
    public static int ProductId(MemorySegment struct) {
        return struct.get(ProductId$LAYOUT, ProductId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ProductId
     * }
     */
    public static void ProductId(MemorySegment struct, int fieldValue) {
        struct.set(ProductId$LAYOUT, ProductId$OFFSET, fieldValue);
    }

    private static final OfInt SubsystemDeviceId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SubsystemDeviceId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SubsystemDeviceId
     * }
     */
    public static final OfInt SubsystemDeviceId$layout() {
        return SubsystemDeviceId$LAYOUT;
    }

    private static final long SubsystemDeviceId$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SubsystemDeviceId
     * }
     */
    public static final long SubsystemDeviceId$offset() {
        return SubsystemDeviceId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SubsystemDeviceId
     * }
     */
    public static int SubsystemDeviceId(MemorySegment struct) {
        return struct.get(SubsystemDeviceId$LAYOUT, SubsystemDeviceId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SubsystemDeviceId
     * }
     */
    public static void SubsystemDeviceId(MemorySegment struct, int fieldValue) {
        struct.set(SubsystemDeviceId$LAYOUT, SubsystemDeviceId$OFFSET, fieldValue);
    }

    private static final OfInt SubsystemVendorId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SubsystemVendorId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SubsystemVendorId
     * }
     */
    public static final OfInt SubsystemVendorId$layout() {
        return SubsystemVendorId$LAYOUT;
    }

    private static final long SubsystemVendorId$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SubsystemVendorId
     * }
     */
    public static final long SubsystemVendorId$offset() {
        return SubsystemVendorId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SubsystemVendorId
     * }
     */
    public static int SubsystemVendorId(MemorySegment struct) {
        return struct.get(SubsystemVendorId$LAYOUT, SubsystemVendorId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SubsystemVendorId
     * }
     */
    public static void SubsystemVendorId(MemorySegment struct, int fieldValue) {
        struct.set(SubsystemVendorId$LAYOUT, SubsystemVendorId$OFFSET, fieldValue);
    }

    private static final OfByte ManufacturingLocation$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ManufacturingLocation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ManufacturingLocation
     * }
     */
    public static final OfByte ManufacturingLocation$layout() {
        return ManufacturingLocation$LAYOUT;
    }

    private static final long ManufacturingLocation$OFFSET = 100;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ManufacturingLocation
     * }
     */
    public static final long ManufacturingLocation$offset() {
        return ManufacturingLocation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ManufacturingLocation
     * }
     */
    public static byte ManufacturingLocation(MemorySegment struct) {
        return struct.get(ManufacturingLocation$LAYOUT, ManufacturingLocation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ManufacturingLocation
     * }
     */
    public static void ManufacturingLocation(MemorySegment struct, byte fieldValue) {
        struct.set(ManufacturingLocation$LAYOUT, ManufacturingLocation$OFFSET, fieldValue);
    }

    private static final OfByte ManufacturingWeek$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ManufacturingWeek"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ManufacturingWeek
     * }
     */
    public static final OfByte ManufacturingWeek$layout() {
        return ManufacturingWeek$LAYOUT;
    }

    private static final long ManufacturingWeek$OFFSET = 101;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ManufacturingWeek
     * }
     */
    public static final long ManufacturingWeek$offset() {
        return ManufacturingWeek$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ManufacturingWeek
     * }
     */
    public static byte ManufacturingWeek(MemorySegment struct) {
        return struct.get(ManufacturingWeek$LAYOUT, ManufacturingWeek$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ManufacturingWeek
     * }
     */
    public static void ManufacturingWeek(MemorySegment struct, byte fieldValue) {
        struct.set(ManufacturingWeek$LAYOUT, ManufacturingWeek$OFFSET, fieldValue);
    }

    private static final OfByte ManufacturingYear$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ManufacturingYear"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ManufacturingYear
     * }
     */
    public static final OfByte ManufacturingYear$layout() {
        return ManufacturingYear$LAYOUT;
    }

    private static final long ManufacturingYear$OFFSET = 102;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ManufacturingYear
     * }
     */
    public static final long ManufacturingYear$offset() {
        return ManufacturingYear$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ManufacturingYear
     * }
     */
    public static byte ManufacturingYear(MemorySegment struct) {
        return struct.get(ManufacturingYear$LAYOUT, ManufacturingYear$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ManufacturingYear
     * }
     */
    public static void ManufacturingYear(MemorySegment struct, byte fieldValue) {
        struct.set(ManufacturingYear$LAYOUT, ManufacturingYear$OFFSET, fieldValue);
    }

    private static final OfInt SerialNumber4Byte$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SerialNumber4Byte"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SerialNumber4Byte
     * }
     */
    public static final OfInt SerialNumber4Byte$layout() {
        return SerialNumber4Byte$LAYOUT;
    }

    private static final long SerialNumber4Byte$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SerialNumber4Byte
     * }
     */
    public static final long SerialNumber4Byte$offset() {
        return SerialNumber4Byte$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SerialNumber4Byte
     * }
     */
    public static int SerialNumber4Byte(MemorySegment struct) {
        return struct.get(SerialNumber4Byte$LAYOUT, SerialNumber4Byte$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SerialNumber4Byte
     * }
     */
    public static void SerialNumber4Byte(MemorySegment struct, int fieldValue) {
        struct.set(SerialNumber4Byte$LAYOUT, SerialNumber4Byte$OFFSET, fieldValue);
    }

    private static final OfInt SerialNumberLengthInChars$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SerialNumberLengthInChars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SerialNumberLengthInChars
     * }
     */
    public static final OfInt SerialNumberLengthInChars$layout() {
        return SerialNumberLengthInChars$LAYOUT;
    }

    private static final long SerialNumberLengthInChars$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SerialNumberLengthInChars
     * }
     */
    public static final long SerialNumberLengthInChars$offset() {
        return SerialNumberLengthInChars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SerialNumberLengthInChars
     * }
     */
    public static int SerialNumberLengthInChars(MemorySegment struct) {
        return struct.get(SerialNumberLengthInChars$LAYOUT, SerialNumberLengthInChars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SerialNumberLengthInChars
     * }
     */
    public static void SerialNumberLengthInChars(MemorySegment struct, int fieldValue) {
        struct.set(SerialNumberLengthInChars$LAYOUT, SerialNumberLengthInChars$OFFSET, fieldValue);
    }

    private static final SequenceLayout SerialNumber$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("SerialNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR SerialNumber[1]
     * }
     */
    public static final SequenceLayout SerialNumber$layout() {
        return SerialNumber$LAYOUT;
    }

    private static final long SerialNumber$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR SerialNumber[1]
     * }
     */
    public static final long SerialNumber$offset() {
        return SerialNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR SerialNumber[1]
     * }
     */
    public static MemorySegment SerialNumber(MemorySegment struct) {
        return struct.asSlice(SerialNumber$OFFSET, SerialNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR SerialNumber[1]
     * }
     */
    public static void SerialNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SerialNumber$OFFSET, SerialNumber$LAYOUT.byteSize());
    }

    private static long[] SerialNumber$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR SerialNumber[1]
     * }
     */
    public static long[] SerialNumber$dimensions() {
        return SerialNumber$DIMS;
    }
    private static final VarHandle SerialNumber$ELEM_HANDLE = SerialNumber$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR SerialNumber[1]
     * }
     */
    public static byte SerialNumber(MemorySegment struct, long index0) {
        return (byte)SerialNumber$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR SerialNumber[1]
     * }
     */
    public static void SerialNumber(MemorySegment struct, long index0, byte fieldValue) {
        SerialNumber$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
