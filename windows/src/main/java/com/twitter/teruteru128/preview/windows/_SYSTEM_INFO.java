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
 * struct _SYSTEM_INFO {
 *     union {
 *         DWORD dwOemId;
 *         struct {
 *             WORD wProcessorArchitecture;
 *             WORD wReserved;
 *         };
 *     };
 *     DWORD dwPageSize;
 *     LPVOID lpMinimumApplicationAddress;
 *     LPVOID lpMaximumApplicationAddress;
 *     DWORD_PTR dwActiveProcessorMask;
 *     DWORD dwNumberOfProcessors;
 *     DWORD dwProcessorType;
 *     DWORD dwAllocationGranularity;
 *     WORD wProcessorLevel;
 *     WORD wProcessorRevision;
 * }
 * }
 */
public class _SYSTEM_INFO {

    _SYSTEM_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Windows_h.C_LONG.withName("dwOemId"),
            MemoryLayout.structLayout(
                Windows_h.C_SHORT.withName("wProcessorArchitecture"),
                Windows_h.C_SHORT.withName("wReserved")
            ).withName("$anon$50:9")
        ).withName("$anon$48:5"),
        Windows_h.C_LONG.withName("dwPageSize"),
        Windows_h.C_POINTER.withName("lpMinimumApplicationAddress"),
        Windows_h.C_POINTER.withName("lpMaximumApplicationAddress"),
        Windows_h.C_LONG_LONG.withName("dwActiveProcessorMask"),
        Windows_h.C_LONG.withName("dwNumberOfProcessors"),
        Windows_h.C_LONG.withName("dwProcessorType"),
        Windows_h.C_LONG.withName("dwAllocationGranularity"),
        Windows_h.C_SHORT.withName("wProcessorLevel"),
        Windows_h.C_SHORT.withName("wProcessorRevision")
    ).withName("_SYSTEM_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwOemId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$48:5"), groupElement("dwOemId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwOemId
     * }
     */
    public static final OfInt dwOemId$layout() {
        return dwOemId$LAYOUT;
    }

    private static final long dwOemId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwOemId
     * }
     */
    public static final long dwOemId$offset() {
        return dwOemId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwOemId
     * }
     */
    public static int dwOemId(MemorySegment struct) {
        return struct.get(dwOemId$LAYOUT, dwOemId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwOemId
     * }
     */
    public static void dwOemId(MemorySegment struct, int fieldValue) {
        struct.set(dwOemId$LAYOUT, dwOemId$OFFSET, fieldValue);
    }

    private static final OfShort wProcessorArchitecture$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$48:5"), groupElement("$anon$50:9"), groupElement("wProcessorArchitecture"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wProcessorArchitecture
     * }
     */
    public static final OfShort wProcessorArchitecture$layout() {
        return wProcessorArchitecture$LAYOUT;
    }

    private static final long wProcessorArchitecture$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wProcessorArchitecture
     * }
     */
    public static final long wProcessorArchitecture$offset() {
        return wProcessorArchitecture$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wProcessorArchitecture
     * }
     */
    public static short wProcessorArchitecture(MemorySegment struct) {
        return struct.get(wProcessorArchitecture$LAYOUT, wProcessorArchitecture$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wProcessorArchitecture
     * }
     */
    public static void wProcessorArchitecture(MemorySegment struct, short fieldValue) {
        struct.set(wProcessorArchitecture$LAYOUT, wProcessorArchitecture$OFFSET, fieldValue);
    }

    private static final OfShort wReserved$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$48:5"), groupElement("$anon$50:9"), groupElement("wReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wReserved
     * }
     */
    public static final OfShort wReserved$layout() {
        return wReserved$LAYOUT;
    }

    private static final long wReserved$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wReserved
     * }
     */
    public static final long wReserved$offset() {
        return wReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wReserved
     * }
     */
    public static short wReserved(MemorySegment struct) {
        return struct.get(wReserved$LAYOUT, wReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wReserved
     * }
     */
    public static void wReserved(MemorySegment struct, short fieldValue) {
        struct.set(wReserved$LAYOUT, wReserved$OFFSET, fieldValue);
    }

    private static final OfInt dwPageSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPageSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwPageSize
     * }
     */
    public static final OfInt dwPageSize$layout() {
        return dwPageSize$LAYOUT;
    }

    private static final long dwPageSize$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwPageSize
     * }
     */
    public static final long dwPageSize$offset() {
        return dwPageSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwPageSize
     * }
     */
    public static int dwPageSize(MemorySegment struct) {
        return struct.get(dwPageSize$LAYOUT, dwPageSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwPageSize
     * }
     */
    public static void dwPageSize(MemorySegment struct, int fieldValue) {
        struct.set(dwPageSize$LAYOUT, dwPageSize$OFFSET, fieldValue);
    }

    private static final AddressLayout lpMinimumApplicationAddress$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpMinimumApplicationAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID lpMinimumApplicationAddress
     * }
     */
    public static final AddressLayout lpMinimumApplicationAddress$layout() {
        return lpMinimumApplicationAddress$LAYOUT;
    }

    private static final long lpMinimumApplicationAddress$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID lpMinimumApplicationAddress
     * }
     */
    public static final long lpMinimumApplicationAddress$offset() {
        return lpMinimumApplicationAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID lpMinimumApplicationAddress
     * }
     */
    public static MemorySegment lpMinimumApplicationAddress(MemorySegment struct) {
        return struct.get(lpMinimumApplicationAddress$LAYOUT, lpMinimumApplicationAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID lpMinimumApplicationAddress
     * }
     */
    public static void lpMinimumApplicationAddress(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpMinimumApplicationAddress$LAYOUT, lpMinimumApplicationAddress$OFFSET, fieldValue);
    }

    private static final AddressLayout lpMaximumApplicationAddress$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpMaximumApplicationAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID lpMaximumApplicationAddress
     * }
     */
    public static final AddressLayout lpMaximumApplicationAddress$layout() {
        return lpMaximumApplicationAddress$LAYOUT;
    }

    private static final long lpMaximumApplicationAddress$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID lpMaximumApplicationAddress
     * }
     */
    public static final long lpMaximumApplicationAddress$offset() {
        return lpMaximumApplicationAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID lpMaximumApplicationAddress
     * }
     */
    public static MemorySegment lpMaximumApplicationAddress(MemorySegment struct) {
        return struct.get(lpMaximumApplicationAddress$LAYOUT, lpMaximumApplicationAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID lpMaximumApplicationAddress
     * }
     */
    public static void lpMaximumApplicationAddress(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpMaximumApplicationAddress$LAYOUT, lpMaximumApplicationAddress$OFFSET, fieldValue);
    }

    private static final OfLong dwActiveProcessorMask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwActiveProcessorMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD_PTR dwActiveProcessorMask
     * }
     */
    public static final OfLong dwActiveProcessorMask$layout() {
        return dwActiveProcessorMask$LAYOUT;
    }

    private static final long dwActiveProcessorMask$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD_PTR dwActiveProcessorMask
     * }
     */
    public static final long dwActiveProcessorMask$offset() {
        return dwActiveProcessorMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwActiveProcessorMask
     * }
     */
    public static long dwActiveProcessorMask(MemorySegment struct) {
        return struct.get(dwActiveProcessorMask$LAYOUT, dwActiveProcessorMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwActiveProcessorMask
     * }
     */
    public static void dwActiveProcessorMask(MemorySegment struct, long fieldValue) {
        struct.set(dwActiveProcessorMask$LAYOUT, dwActiveProcessorMask$OFFSET, fieldValue);
    }

    private static final OfInt dwNumberOfProcessors$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwNumberOfProcessors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwNumberOfProcessors
     * }
     */
    public static final OfInt dwNumberOfProcessors$layout() {
        return dwNumberOfProcessors$LAYOUT;
    }

    private static final long dwNumberOfProcessors$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwNumberOfProcessors
     * }
     */
    public static final long dwNumberOfProcessors$offset() {
        return dwNumberOfProcessors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwNumberOfProcessors
     * }
     */
    public static int dwNumberOfProcessors(MemorySegment struct) {
        return struct.get(dwNumberOfProcessors$LAYOUT, dwNumberOfProcessors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwNumberOfProcessors
     * }
     */
    public static void dwNumberOfProcessors(MemorySegment struct, int fieldValue) {
        struct.set(dwNumberOfProcessors$LAYOUT, dwNumberOfProcessors$OFFSET, fieldValue);
    }

    private static final OfInt dwProcessorType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwProcessorType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwProcessorType
     * }
     */
    public static final OfInt dwProcessorType$layout() {
        return dwProcessorType$LAYOUT;
    }

    private static final long dwProcessorType$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwProcessorType
     * }
     */
    public static final long dwProcessorType$offset() {
        return dwProcessorType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwProcessorType
     * }
     */
    public static int dwProcessorType(MemorySegment struct) {
        return struct.get(dwProcessorType$LAYOUT, dwProcessorType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwProcessorType
     * }
     */
    public static void dwProcessorType(MemorySegment struct, int fieldValue) {
        struct.set(dwProcessorType$LAYOUT, dwProcessorType$OFFSET, fieldValue);
    }

    private static final OfInt dwAllocationGranularity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwAllocationGranularity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwAllocationGranularity
     * }
     */
    public static final OfInt dwAllocationGranularity$layout() {
        return dwAllocationGranularity$LAYOUT;
    }

    private static final long dwAllocationGranularity$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwAllocationGranularity
     * }
     */
    public static final long dwAllocationGranularity$offset() {
        return dwAllocationGranularity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwAllocationGranularity
     * }
     */
    public static int dwAllocationGranularity(MemorySegment struct) {
        return struct.get(dwAllocationGranularity$LAYOUT, dwAllocationGranularity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwAllocationGranularity
     * }
     */
    public static void dwAllocationGranularity(MemorySegment struct, int fieldValue) {
        struct.set(dwAllocationGranularity$LAYOUT, dwAllocationGranularity$OFFSET, fieldValue);
    }

    private static final OfShort wProcessorLevel$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wProcessorLevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wProcessorLevel
     * }
     */
    public static final OfShort wProcessorLevel$layout() {
        return wProcessorLevel$LAYOUT;
    }

    private static final long wProcessorLevel$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wProcessorLevel
     * }
     */
    public static final long wProcessorLevel$offset() {
        return wProcessorLevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wProcessorLevel
     * }
     */
    public static short wProcessorLevel(MemorySegment struct) {
        return struct.get(wProcessorLevel$LAYOUT, wProcessorLevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wProcessorLevel
     * }
     */
    public static void wProcessorLevel(MemorySegment struct, short fieldValue) {
        struct.set(wProcessorLevel$LAYOUT, wProcessorLevel$OFFSET, fieldValue);
    }

    private static final OfShort wProcessorRevision$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wProcessorRevision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wProcessorRevision
     * }
     */
    public static final OfShort wProcessorRevision$layout() {
        return wProcessorRevision$LAYOUT;
    }

    private static final long wProcessorRevision$OFFSET = 46;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wProcessorRevision
     * }
     */
    public static final long wProcessorRevision$offset() {
        return wProcessorRevision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wProcessorRevision
     * }
     */
    public static short wProcessorRevision(MemorySegment struct) {
        return struct.get(wProcessorRevision$LAYOUT, wProcessorRevision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wProcessorRevision
     * }
     */
    public static void wProcessorRevision(MemorySegment struct, short fieldValue) {
        struct.set(wProcessorRevision$LAYOUT, wProcessorRevision$OFFSET, fieldValue);
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

