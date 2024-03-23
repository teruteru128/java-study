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
 * struct _OSVERSIONINFOEXA {
 *     DWORD dwOSVersionInfoSize;
 *     DWORD dwMajorVersion;
 *     DWORD dwMinorVersion;
 *     DWORD dwBuildNumber;
 *     DWORD dwPlatformId;
 *     CHAR szCSDVersion[128];
 *     WORD wServicePackMajor;
 *     WORD wServicePackMinor;
 *     WORD wSuiteMask;
 *     BYTE wProductType;
 *     BYTE wReserved;
 * }
 * }
 */
public class _OSVERSIONINFOEXA {

    _OSVERSIONINFOEXA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwOSVersionInfoSize"),
        Windows_h.C_LONG.withName("dwMajorVersion"),
        Windows_h.C_LONG.withName("dwMinorVersion"),
        Windows_h.C_LONG.withName("dwBuildNumber"),
        Windows_h.C_LONG.withName("dwPlatformId"),
        MemoryLayout.sequenceLayout(128, Windows_h.C_CHAR).withName("szCSDVersion"),
        Windows_h.C_SHORT.withName("wServicePackMajor"),
        Windows_h.C_SHORT.withName("wServicePackMinor"),
        Windows_h.C_SHORT.withName("wSuiteMask"),
        Windows_h.C_CHAR.withName("wProductType"),
        Windows_h.C_CHAR.withName("wReserved")
    ).withName("_OSVERSIONINFOEXA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwOSVersionInfoSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOSVersionInfoSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwOSVersionInfoSize
     * }
     */
    public static final OfInt dwOSVersionInfoSize$layout() {
        return dwOSVersionInfoSize$LAYOUT;
    }

    private static final long dwOSVersionInfoSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwOSVersionInfoSize
     * }
     */
    public static final long dwOSVersionInfoSize$offset() {
        return dwOSVersionInfoSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwOSVersionInfoSize
     * }
     */
    public static int dwOSVersionInfoSize(MemorySegment struct) {
        return struct.get(dwOSVersionInfoSize$LAYOUT, dwOSVersionInfoSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwOSVersionInfoSize
     * }
     */
    public static void dwOSVersionInfoSize(MemorySegment struct, int fieldValue) {
        struct.set(dwOSVersionInfoSize$LAYOUT, dwOSVersionInfoSize$OFFSET, fieldValue);
    }

    private static final OfInt dwMajorVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMajorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMajorVersion
     * }
     */
    public static final OfInt dwMajorVersion$layout() {
        return dwMajorVersion$LAYOUT;
    }

    private static final long dwMajorVersion$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMajorVersion
     * }
     */
    public static final long dwMajorVersion$offset() {
        return dwMajorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMajorVersion
     * }
     */
    public static int dwMajorVersion(MemorySegment struct) {
        return struct.get(dwMajorVersion$LAYOUT, dwMajorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMajorVersion
     * }
     */
    public static void dwMajorVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwMajorVersion$LAYOUT, dwMajorVersion$OFFSET, fieldValue);
    }

    private static final OfInt dwMinorVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMinorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMinorVersion
     * }
     */
    public static final OfInt dwMinorVersion$layout() {
        return dwMinorVersion$LAYOUT;
    }

    private static final long dwMinorVersion$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMinorVersion
     * }
     */
    public static final long dwMinorVersion$offset() {
        return dwMinorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMinorVersion
     * }
     */
    public static int dwMinorVersion(MemorySegment struct) {
        return struct.get(dwMinorVersion$LAYOUT, dwMinorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMinorVersion
     * }
     */
    public static void dwMinorVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwMinorVersion$LAYOUT, dwMinorVersion$OFFSET, fieldValue);
    }

    private static final OfInt dwBuildNumber$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwBuildNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwBuildNumber
     * }
     */
    public static final OfInt dwBuildNumber$layout() {
        return dwBuildNumber$LAYOUT;
    }

    private static final long dwBuildNumber$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwBuildNumber
     * }
     */
    public static final long dwBuildNumber$offset() {
        return dwBuildNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwBuildNumber
     * }
     */
    public static int dwBuildNumber(MemorySegment struct) {
        return struct.get(dwBuildNumber$LAYOUT, dwBuildNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwBuildNumber
     * }
     */
    public static void dwBuildNumber(MemorySegment struct, int fieldValue) {
        struct.set(dwBuildNumber$LAYOUT, dwBuildNumber$OFFSET, fieldValue);
    }

    private static final OfInt dwPlatformId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPlatformId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwPlatformId
     * }
     */
    public static final OfInt dwPlatformId$layout() {
        return dwPlatformId$LAYOUT;
    }

    private static final long dwPlatformId$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwPlatformId
     * }
     */
    public static final long dwPlatformId$offset() {
        return dwPlatformId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwPlatformId
     * }
     */
    public static int dwPlatformId(MemorySegment struct) {
        return struct.get(dwPlatformId$LAYOUT, dwPlatformId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwPlatformId
     * }
     */
    public static void dwPlatformId(MemorySegment struct, int fieldValue) {
        struct.set(dwPlatformId$LAYOUT, dwPlatformId$OFFSET, fieldValue);
    }

    private static final SequenceLayout szCSDVersion$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szCSDVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR szCSDVersion[128]
     * }
     */
    public static final SequenceLayout szCSDVersion$layout() {
        return szCSDVersion$LAYOUT;
    }

    private static final long szCSDVersion$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR szCSDVersion[128]
     * }
     */
    public static final long szCSDVersion$offset() {
        return szCSDVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR szCSDVersion[128]
     * }
     */
    public static MemorySegment szCSDVersion(MemorySegment struct) {
        return struct.asSlice(szCSDVersion$OFFSET, szCSDVersion$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR szCSDVersion[128]
     * }
     */
    public static void szCSDVersion(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szCSDVersion$OFFSET, szCSDVersion$LAYOUT.byteSize());
    }

    private static long[] szCSDVersion$DIMS = { 128 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR szCSDVersion[128]
     * }
     */
    public static long[] szCSDVersion$dimensions() {
        return szCSDVersion$DIMS;
    }
    private static final VarHandle szCSDVersion$ELEM_HANDLE = szCSDVersion$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR szCSDVersion[128]
     * }
     */
    public static byte szCSDVersion(MemorySegment struct, long index0) {
        return (byte)szCSDVersion$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR szCSDVersion[128]
     * }
     */
    public static void szCSDVersion(MemorySegment struct, long index0, byte fieldValue) {
        szCSDVersion$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfShort wServicePackMajor$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wServicePackMajor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wServicePackMajor
     * }
     */
    public static final OfShort wServicePackMajor$layout() {
        return wServicePackMajor$LAYOUT;
    }

    private static final long wServicePackMajor$OFFSET = 148;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wServicePackMajor
     * }
     */
    public static final long wServicePackMajor$offset() {
        return wServicePackMajor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wServicePackMajor
     * }
     */
    public static short wServicePackMajor(MemorySegment struct) {
        return struct.get(wServicePackMajor$LAYOUT, wServicePackMajor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wServicePackMajor
     * }
     */
    public static void wServicePackMajor(MemorySegment struct, short fieldValue) {
        struct.set(wServicePackMajor$LAYOUT, wServicePackMajor$OFFSET, fieldValue);
    }

    private static final OfShort wServicePackMinor$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wServicePackMinor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wServicePackMinor
     * }
     */
    public static final OfShort wServicePackMinor$layout() {
        return wServicePackMinor$LAYOUT;
    }

    private static final long wServicePackMinor$OFFSET = 150;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wServicePackMinor
     * }
     */
    public static final long wServicePackMinor$offset() {
        return wServicePackMinor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wServicePackMinor
     * }
     */
    public static short wServicePackMinor(MemorySegment struct) {
        return struct.get(wServicePackMinor$LAYOUT, wServicePackMinor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wServicePackMinor
     * }
     */
    public static void wServicePackMinor(MemorySegment struct, short fieldValue) {
        struct.set(wServicePackMinor$LAYOUT, wServicePackMinor$OFFSET, fieldValue);
    }

    private static final OfShort wSuiteMask$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wSuiteMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wSuiteMask
     * }
     */
    public static final OfShort wSuiteMask$layout() {
        return wSuiteMask$LAYOUT;
    }

    private static final long wSuiteMask$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wSuiteMask
     * }
     */
    public static final long wSuiteMask$offset() {
        return wSuiteMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wSuiteMask
     * }
     */
    public static short wSuiteMask(MemorySegment struct) {
        return struct.get(wSuiteMask$LAYOUT, wSuiteMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wSuiteMask
     * }
     */
    public static void wSuiteMask(MemorySegment struct, short fieldValue) {
        struct.set(wSuiteMask$LAYOUT, wSuiteMask$OFFSET, fieldValue);
    }

    private static final OfByte wProductType$LAYOUT = (OfByte)$LAYOUT.select(groupElement("wProductType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE wProductType
     * }
     */
    public static final OfByte wProductType$layout() {
        return wProductType$LAYOUT;
    }

    private static final long wProductType$OFFSET = 154;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE wProductType
     * }
     */
    public static final long wProductType$offset() {
        return wProductType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE wProductType
     * }
     */
    public static byte wProductType(MemorySegment struct) {
        return struct.get(wProductType$LAYOUT, wProductType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE wProductType
     * }
     */
    public static void wProductType(MemorySegment struct, byte fieldValue) {
        struct.set(wProductType$LAYOUT, wProductType$OFFSET, fieldValue);
    }

    private static final OfByte wReserved$LAYOUT = (OfByte)$LAYOUT.select(groupElement("wReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE wReserved
     * }
     */
    public static final OfByte wReserved$layout() {
        return wReserved$LAYOUT;
    }

    private static final long wReserved$OFFSET = 155;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE wReserved
     * }
     */
    public static final long wReserved$offset() {
        return wReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE wReserved
     * }
     */
    public static byte wReserved(MemorySegment struct) {
        return struct.get(wReserved$LAYOUT, wReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE wReserved
     * }
     */
    public static void wReserved(MemorySegment struct, byte fieldValue) {
        struct.set(wReserved$LAYOUT, wReserved$OFFSET, fieldValue);
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

