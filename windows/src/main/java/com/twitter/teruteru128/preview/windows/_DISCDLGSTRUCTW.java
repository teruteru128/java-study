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
 * struct _DISCDLGSTRUCTW {
 *     DWORD cbStructure;
 *     HWND hwndOwner;
 *     LPWSTR lpLocalName;
 *     LPWSTR lpRemoteName;
 *     DWORD dwFlags;
 * }
 * }
 */
public class _DISCDLGSTRUCTW {

    _DISCDLGSTRUCTW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbStructure"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hwndOwner"),
        Windows_h.C_POINTER.withName("lpLocalName"),
        Windows_h.C_POINTER.withName("lpRemoteName"),
        Windows_h.C_LONG.withName("dwFlags"),
        MemoryLayout.paddingLayout(4)
    ).withName("_DISCDLGSTRUCTW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbStructure$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbStructure"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbStructure
     * }
     */
    public static final OfInt cbStructure$layout() {
        return cbStructure$LAYOUT;
    }

    private static final long cbStructure$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbStructure
     * }
     */
    public static final long cbStructure$offset() {
        return cbStructure$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbStructure
     * }
     */
    public static int cbStructure(MemorySegment struct) {
        return struct.get(cbStructure$LAYOUT, cbStructure$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbStructure
     * }
     */
    public static void cbStructure(MemorySegment struct, int fieldValue) {
        struct.set(cbStructure$LAYOUT, cbStructure$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndOwner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndOwner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static final AddressLayout hwndOwner$layout() {
        return hwndOwner$LAYOUT;
    }

    private static final long hwndOwner$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static final long hwndOwner$offset() {
        return hwndOwner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static MemorySegment hwndOwner(MemorySegment struct) {
        return struct.get(hwndOwner$LAYOUT, hwndOwner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static void hwndOwner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndOwner$LAYOUT, hwndOwner$OFFSET, fieldValue);
    }

    private static final AddressLayout lpLocalName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpLocalName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpLocalName
     * }
     */
    public static final AddressLayout lpLocalName$layout() {
        return lpLocalName$LAYOUT;
    }

    private static final long lpLocalName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpLocalName
     * }
     */
    public static final long lpLocalName$offset() {
        return lpLocalName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpLocalName
     * }
     */
    public static MemorySegment lpLocalName(MemorySegment struct) {
        return struct.get(lpLocalName$LAYOUT, lpLocalName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpLocalName
     * }
     */
    public static void lpLocalName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpLocalName$LAYOUT, lpLocalName$OFFSET, fieldValue);
    }

    private static final AddressLayout lpRemoteName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpRemoteName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpRemoteName
     * }
     */
    public static final AddressLayout lpRemoteName$layout() {
        return lpRemoteName$LAYOUT;
    }

    private static final long lpRemoteName$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpRemoteName
     * }
     */
    public static final long lpRemoteName$offset() {
        return lpRemoteName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpRemoteName
     * }
     */
    public static MemorySegment lpRemoteName(MemorySegment struct) {
        return struct.get(lpRemoteName$LAYOUT, lpRemoteName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpRemoteName
     * }
     */
    public static void lpRemoteName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpRemoteName$LAYOUT, lpRemoteName$OFFSET, fieldValue);
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

    private static final long dwFlags$OFFSET = 32;

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

