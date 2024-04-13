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
 * struct __NCRYPT_UI_POLICY {
 *     DWORD dwVersion;
 *     DWORD dwFlags;
 *     LPCWSTR pszCreationTitle;
 *     LPCWSTR pszFriendlyName;
 *     LPCWSTR pszDescription;
 * }
 * }
 */
public class __NCRYPT_UI_POLICY {

    __NCRYPT_UI_POLICY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwVersion"),
        Windows_h.C_LONG.withName("dwFlags"),
        Windows_h.C_POINTER.withName("pszCreationTitle"),
        Windows_h.C_POINTER.withName("pszFriendlyName"),
        Windows_h.C_POINTER.withName("pszDescription")
    ).withName("__NCRYPT_UI_POLICY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static final OfInt dwVersion$layout() {
        return dwVersion$LAYOUT;
    }

    private static final long dwVersion$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static final long dwVersion$offset() {
        return dwVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static int dwVersion(MemorySegment struct) {
        return struct.get(dwVersion$LAYOUT, dwVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static void dwVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwVersion$LAYOUT, dwVersion$OFFSET, fieldValue);
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

    private static final long dwFlags$OFFSET = 4;

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

    private static final AddressLayout pszCreationTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszCreationTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pszCreationTitle
     * }
     */
    public static final AddressLayout pszCreationTitle$layout() {
        return pszCreationTitle$LAYOUT;
    }

    private static final long pszCreationTitle$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pszCreationTitle
     * }
     */
    public static final long pszCreationTitle$offset() {
        return pszCreationTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pszCreationTitle
     * }
     */
    public static MemorySegment pszCreationTitle(MemorySegment struct) {
        return struct.get(pszCreationTitle$LAYOUT, pszCreationTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pszCreationTitle
     * }
     */
    public static void pszCreationTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszCreationTitle$LAYOUT, pszCreationTitle$OFFSET, fieldValue);
    }

    private static final AddressLayout pszFriendlyName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszFriendlyName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pszFriendlyName
     * }
     */
    public static final AddressLayout pszFriendlyName$layout() {
        return pszFriendlyName$LAYOUT;
    }

    private static final long pszFriendlyName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pszFriendlyName
     * }
     */
    public static final long pszFriendlyName$offset() {
        return pszFriendlyName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pszFriendlyName
     * }
     */
    public static MemorySegment pszFriendlyName(MemorySegment struct) {
        return struct.get(pszFriendlyName$LAYOUT, pszFriendlyName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pszFriendlyName
     * }
     */
    public static void pszFriendlyName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszFriendlyName$LAYOUT, pszFriendlyName$OFFSET, fieldValue);
    }

    private static final AddressLayout pszDescription$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszDescription"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pszDescription
     * }
     */
    public static final AddressLayout pszDescription$layout() {
        return pszDescription$LAYOUT;
    }

    private static final long pszDescription$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pszDescription
     * }
     */
    public static final long pszDescription$offset() {
        return pszDescription$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pszDescription
     * }
     */
    public static MemorySegment pszDescription(MemorySegment struct) {
        return struct.get(pszDescription$LAYOUT, pszDescription$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pszDescription
     * }
     */
    public static void pszDescription(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszDescription$LAYOUT, pszDescription$OFFSET, fieldValue);
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
