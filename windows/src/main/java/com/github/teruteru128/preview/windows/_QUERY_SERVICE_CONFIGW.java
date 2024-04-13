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
 * struct _QUERY_SERVICE_CONFIGW {
 *     DWORD dwServiceType;
 *     DWORD dwStartType;
 *     DWORD dwErrorControl;
 *     LPWSTR lpBinaryPathName;
 *     LPWSTR lpLoadOrderGroup;
 *     DWORD dwTagId;
 *     LPWSTR lpDependencies;
 *     LPWSTR lpServiceStartName;
 *     LPWSTR lpDisplayName;
 * }
 * }
 */
public class _QUERY_SERVICE_CONFIGW {

    _QUERY_SERVICE_CONFIGW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwServiceType"),
        Windows_h.C_LONG.withName("dwStartType"),
        Windows_h.C_LONG.withName("dwErrorControl"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpBinaryPathName"),
        Windows_h.C_POINTER.withName("lpLoadOrderGroup"),
        Windows_h.C_LONG.withName("dwTagId"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpDependencies"),
        Windows_h.C_POINTER.withName("lpServiceStartName"),
        Windows_h.C_POINTER.withName("lpDisplayName")
    ).withName("_QUERY_SERVICE_CONFIGW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwServiceType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwServiceType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwServiceType
     * }
     */
    public static final OfInt dwServiceType$layout() {
        return dwServiceType$LAYOUT;
    }

    private static final long dwServiceType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwServiceType
     * }
     */
    public static final long dwServiceType$offset() {
        return dwServiceType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwServiceType
     * }
     */
    public static int dwServiceType(MemorySegment struct) {
        return struct.get(dwServiceType$LAYOUT, dwServiceType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwServiceType
     * }
     */
    public static void dwServiceType(MemorySegment struct, int fieldValue) {
        struct.set(dwServiceType$LAYOUT, dwServiceType$OFFSET, fieldValue);
    }

    private static final OfInt dwStartType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwStartType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwStartType
     * }
     */
    public static final OfInt dwStartType$layout() {
        return dwStartType$LAYOUT;
    }

    private static final long dwStartType$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwStartType
     * }
     */
    public static final long dwStartType$offset() {
        return dwStartType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwStartType
     * }
     */
    public static int dwStartType(MemorySegment struct) {
        return struct.get(dwStartType$LAYOUT, dwStartType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwStartType
     * }
     */
    public static void dwStartType(MemorySegment struct, int fieldValue) {
        struct.set(dwStartType$LAYOUT, dwStartType$OFFSET, fieldValue);
    }

    private static final OfInt dwErrorControl$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwErrorControl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwErrorControl
     * }
     */
    public static final OfInt dwErrorControl$layout() {
        return dwErrorControl$LAYOUT;
    }

    private static final long dwErrorControl$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwErrorControl
     * }
     */
    public static final long dwErrorControl$offset() {
        return dwErrorControl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwErrorControl
     * }
     */
    public static int dwErrorControl(MemorySegment struct) {
        return struct.get(dwErrorControl$LAYOUT, dwErrorControl$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwErrorControl
     * }
     */
    public static void dwErrorControl(MemorySegment struct, int fieldValue) {
        struct.set(dwErrorControl$LAYOUT, dwErrorControl$OFFSET, fieldValue);
    }

    private static final AddressLayout lpBinaryPathName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpBinaryPathName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpBinaryPathName
     * }
     */
    public static final AddressLayout lpBinaryPathName$layout() {
        return lpBinaryPathName$LAYOUT;
    }

    private static final long lpBinaryPathName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpBinaryPathName
     * }
     */
    public static final long lpBinaryPathName$offset() {
        return lpBinaryPathName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpBinaryPathName
     * }
     */
    public static MemorySegment lpBinaryPathName(MemorySegment struct) {
        return struct.get(lpBinaryPathName$LAYOUT, lpBinaryPathName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpBinaryPathName
     * }
     */
    public static void lpBinaryPathName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpBinaryPathName$LAYOUT, lpBinaryPathName$OFFSET, fieldValue);
    }

    private static final AddressLayout lpLoadOrderGroup$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpLoadOrderGroup"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpLoadOrderGroup
     * }
     */
    public static final AddressLayout lpLoadOrderGroup$layout() {
        return lpLoadOrderGroup$LAYOUT;
    }

    private static final long lpLoadOrderGroup$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpLoadOrderGroup
     * }
     */
    public static final long lpLoadOrderGroup$offset() {
        return lpLoadOrderGroup$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpLoadOrderGroup
     * }
     */
    public static MemorySegment lpLoadOrderGroup(MemorySegment struct) {
        return struct.get(lpLoadOrderGroup$LAYOUT, lpLoadOrderGroup$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpLoadOrderGroup
     * }
     */
    public static void lpLoadOrderGroup(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpLoadOrderGroup$LAYOUT, lpLoadOrderGroup$OFFSET, fieldValue);
    }

    private static final OfInt dwTagId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwTagId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwTagId
     * }
     */
    public static final OfInt dwTagId$layout() {
        return dwTagId$LAYOUT;
    }

    private static final long dwTagId$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwTagId
     * }
     */
    public static final long dwTagId$offset() {
        return dwTagId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwTagId
     * }
     */
    public static int dwTagId(MemorySegment struct) {
        return struct.get(dwTagId$LAYOUT, dwTagId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwTagId
     * }
     */
    public static void dwTagId(MemorySegment struct, int fieldValue) {
        struct.set(dwTagId$LAYOUT, dwTagId$OFFSET, fieldValue);
    }

    private static final AddressLayout lpDependencies$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpDependencies"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpDependencies
     * }
     */
    public static final AddressLayout lpDependencies$layout() {
        return lpDependencies$LAYOUT;
    }

    private static final long lpDependencies$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpDependencies
     * }
     */
    public static final long lpDependencies$offset() {
        return lpDependencies$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpDependencies
     * }
     */
    public static MemorySegment lpDependencies(MemorySegment struct) {
        return struct.get(lpDependencies$LAYOUT, lpDependencies$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpDependencies
     * }
     */
    public static void lpDependencies(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpDependencies$LAYOUT, lpDependencies$OFFSET, fieldValue);
    }

    private static final AddressLayout lpServiceStartName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpServiceStartName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpServiceStartName
     * }
     */
    public static final AddressLayout lpServiceStartName$layout() {
        return lpServiceStartName$LAYOUT;
    }

    private static final long lpServiceStartName$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpServiceStartName
     * }
     */
    public static final long lpServiceStartName$offset() {
        return lpServiceStartName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpServiceStartName
     * }
     */
    public static MemorySegment lpServiceStartName(MemorySegment struct) {
        return struct.get(lpServiceStartName$LAYOUT, lpServiceStartName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpServiceStartName
     * }
     */
    public static void lpServiceStartName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpServiceStartName$LAYOUT, lpServiceStartName$OFFSET, fieldValue);
    }

    private static final AddressLayout lpDisplayName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpDisplayName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpDisplayName
     * }
     */
    public static final AddressLayout lpDisplayName$layout() {
        return lpDisplayName$LAYOUT;
    }

    private static final long lpDisplayName$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpDisplayName
     * }
     */
    public static final long lpDisplayName$offset() {
        return lpDisplayName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpDisplayName
     * }
     */
    public static MemorySegment lpDisplayName(MemorySegment struct) {
        return struct.get(lpDisplayName$LAYOUT, lpDisplayName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpDisplayName
     * }
     */
    public static void lpDisplayName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpDisplayName$LAYOUT, lpDisplayName$OFFSET, fieldValue);
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
