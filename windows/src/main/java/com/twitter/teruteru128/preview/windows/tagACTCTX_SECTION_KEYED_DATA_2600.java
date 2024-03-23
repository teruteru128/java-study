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
 * struct tagACTCTX_SECTION_KEYED_DATA_2600 {
 *     ULONG cbSize;
 *     ULONG ulDataFormatVersion;
 *     PVOID lpData;
 *     ULONG ulLength;
 *     PVOID lpSectionGlobalData;
 *     ULONG ulSectionGlobalDataLength;
 *     PVOID lpSectionBase;
 *     ULONG ulSectionTotalLength;
 *     HANDLE hActCtx;
 *     ULONG ulAssemblyRosterIndex;
 * }
 * }
 */
public class tagACTCTX_SECTION_KEYED_DATA_2600 {

    tagACTCTX_SECTION_KEYED_DATA_2600() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        Windows_h.C_LONG.withName("ulDataFormatVersion"),
        Windows_h.C_POINTER.withName("lpData"),
        Windows_h.C_LONG.withName("ulLength"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpSectionGlobalData"),
        Windows_h.C_LONG.withName("ulSectionGlobalDataLength"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpSectionBase"),
        Windows_h.C_LONG.withName("ulSectionTotalLength"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hActCtx"),
        Windows_h.C_LONG.withName("ulAssemblyRosterIndex"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagACTCTX_SECTION_KEYED_DATA_2600");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt ulDataFormatVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulDataFormatVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ulDataFormatVersion
     * }
     */
    public static final OfInt ulDataFormatVersion$layout() {
        return ulDataFormatVersion$LAYOUT;
    }

    private static final long ulDataFormatVersion$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ulDataFormatVersion
     * }
     */
    public static final long ulDataFormatVersion$offset() {
        return ulDataFormatVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ulDataFormatVersion
     * }
     */
    public static int ulDataFormatVersion(MemorySegment struct) {
        return struct.get(ulDataFormatVersion$LAYOUT, ulDataFormatVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ulDataFormatVersion
     * }
     */
    public static void ulDataFormatVersion(MemorySegment struct, int fieldValue) {
        struct.set(ulDataFormatVersion$LAYOUT, ulDataFormatVersion$OFFSET, fieldValue);
    }

    private static final AddressLayout lpData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID lpData
     * }
     */
    public static final AddressLayout lpData$layout() {
        return lpData$LAYOUT;
    }

    private static final long lpData$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID lpData
     * }
     */
    public static final long lpData$offset() {
        return lpData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID lpData
     * }
     */
    public static MemorySegment lpData(MemorySegment struct) {
        return struct.get(lpData$LAYOUT, lpData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID lpData
     * }
     */
    public static void lpData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpData$LAYOUT, lpData$OFFSET, fieldValue);
    }

    private static final OfInt ulLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ulLength
     * }
     */
    public static final OfInt ulLength$layout() {
        return ulLength$LAYOUT;
    }

    private static final long ulLength$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ulLength
     * }
     */
    public static final long ulLength$offset() {
        return ulLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ulLength
     * }
     */
    public static int ulLength(MemorySegment struct) {
        return struct.get(ulLength$LAYOUT, ulLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ulLength
     * }
     */
    public static void ulLength(MemorySegment struct, int fieldValue) {
        struct.set(ulLength$LAYOUT, ulLength$OFFSET, fieldValue);
    }

    private static final AddressLayout lpSectionGlobalData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpSectionGlobalData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID lpSectionGlobalData
     * }
     */
    public static final AddressLayout lpSectionGlobalData$layout() {
        return lpSectionGlobalData$LAYOUT;
    }

    private static final long lpSectionGlobalData$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID lpSectionGlobalData
     * }
     */
    public static final long lpSectionGlobalData$offset() {
        return lpSectionGlobalData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID lpSectionGlobalData
     * }
     */
    public static MemorySegment lpSectionGlobalData(MemorySegment struct) {
        return struct.get(lpSectionGlobalData$LAYOUT, lpSectionGlobalData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID lpSectionGlobalData
     * }
     */
    public static void lpSectionGlobalData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpSectionGlobalData$LAYOUT, lpSectionGlobalData$OFFSET, fieldValue);
    }

    private static final OfInt ulSectionGlobalDataLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulSectionGlobalDataLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ulSectionGlobalDataLength
     * }
     */
    public static final OfInt ulSectionGlobalDataLength$layout() {
        return ulSectionGlobalDataLength$LAYOUT;
    }

    private static final long ulSectionGlobalDataLength$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ulSectionGlobalDataLength
     * }
     */
    public static final long ulSectionGlobalDataLength$offset() {
        return ulSectionGlobalDataLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ulSectionGlobalDataLength
     * }
     */
    public static int ulSectionGlobalDataLength(MemorySegment struct) {
        return struct.get(ulSectionGlobalDataLength$LAYOUT, ulSectionGlobalDataLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ulSectionGlobalDataLength
     * }
     */
    public static void ulSectionGlobalDataLength(MemorySegment struct, int fieldValue) {
        struct.set(ulSectionGlobalDataLength$LAYOUT, ulSectionGlobalDataLength$OFFSET, fieldValue);
    }

    private static final AddressLayout lpSectionBase$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpSectionBase"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID lpSectionBase
     * }
     */
    public static final AddressLayout lpSectionBase$layout() {
        return lpSectionBase$LAYOUT;
    }

    private static final long lpSectionBase$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID lpSectionBase
     * }
     */
    public static final long lpSectionBase$offset() {
        return lpSectionBase$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID lpSectionBase
     * }
     */
    public static MemorySegment lpSectionBase(MemorySegment struct) {
        return struct.get(lpSectionBase$LAYOUT, lpSectionBase$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID lpSectionBase
     * }
     */
    public static void lpSectionBase(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpSectionBase$LAYOUT, lpSectionBase$OFFSET, fieldValue);
    }

    private static final OfInt ulSectionTotalLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulSectionTotalLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ulSectionTotalLength
     * }
     */
    public static final OfInt ulSectionTotalLength$layout() {
        return ulSectionTotalLength$LAYOUT;
    }

    private static final long ulSectionTotalLength$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ulSectionTotalLength
     * }
     */
    public static final long ulSectionTotalLength$offset() {
        return ulSectionTotalLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ulSectionTotalLength
     * }
     */
    public static int ulSectionTotalLength(MemorySegment struct) {
        return struct.get(ulSectionTotalLength$LAYOUT, ulSectionTotalLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ulSectionTotalLength
     * }
     */
    public static void ulSectionTotalLength(MemorySegment struct, int fieldValue) {
        struct.set(ulSectionTotalLength$LAYOUT, ulSectionTotalLength$OFFSET, fieldValue);
    }

    private static final AddressLayout hActCtx$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hActCtx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hActCtx
     * }
     */
    public static final AddressLayout hActCtx$layout() {
        return hActCtx$LAYOUT;
    }

    private static final long hActCtx$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hActCtx
     * }
     */
    public static final long hActCtx$offset() {
        return hActCtx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hActCtx
     * }
     */
    public static MemorySegment hActCtx(MemorySegment struct) {
        return struct.get(hActCtx$LAYOUT, hActCtx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hActCtx
     * }
     */
    public static void hActCtx(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hActCtx$LAYOUT, hActCtx$OFFSET, fieldValue);
    }

    private static final OfInt ulAssemblyRosterIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulAssemblyRosterIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ulAssemblyRosterIndex
     * }
     */
    public static final OfInt ulAssemblyRosterIndex$layout() {
        return ulAssemblyRosterIndex$LAYOUT;
    }

    private static final long ulAssemblyRosterIndex$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ulAssemblyRosterIndex
     * }
     */
    public static final long ulAssemblyRosterIndex$offset() {
        return ulAssemblyRosterIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ulAssemblyRosterIndex
     * }
     */
    public static int ulAssemblyRosterIndex(MemorySegment struct) {
        return struct.get(ulAssemblyRosterIndex$LAYOUT, ulAssemblyRosterIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ulAssemblyRosterIndex
     * }
     */
    public static void ulAssemblyRosterIndex(MemorySegment struct, int fieldValue) {
        struct.set(ulAssemblyRosterIndex$LAYOUT, ulAssemblyRosterIndex$OFFSET, fieldValue);
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

