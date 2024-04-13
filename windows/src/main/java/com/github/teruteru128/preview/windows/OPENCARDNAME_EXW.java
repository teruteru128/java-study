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
 * struct {
 *     DWORD dwStructSize;
 *     SCARDCONTEXT hSCardContext;
 *     HWND hwndOwner;
 *     DWORD dwFlags;
 *     LPCWSTR lpstrTitle;
 *     LPCWSTR lpstrSearchDesc;
 *     HICON hIcon;
 *     POPENCARD_SEARCH_CRITERIAW pOpenCardSearchCriteria;
 *     LPOCNCONNPROCW lpfnConnect;
 *     LPVOID pvUserData;
 *     DWORD dwShareMode;
 *     DWORD dwPreferredProtocols;
 *     LPWSTR lpstrRdr;
 *     DWORD nMaxRdr;
 *     LPWSTR lpstrCard;
 *     DWORD nMaxCard;
 *     DWORD dwActiveProtocol;
 *     SCARDHANDLE hCardHandle;
 * }
 * }
 */
public class OPENCARDNAME_EXW {

    OPENCARDNAME_EXW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwStructSize"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG_LONG.withName("hSCardContext"),
        Windows_h.C_POINTER.withName("hwndOwner"),
        Windows_h.C_LONG.withName("dwFlags"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpstrTitle"),
        Windows_h.C_POINTER.withName("lpstrSearchDesc"),
        Windows_h.C_POINTER.withName("hIcon"),
        Windows_h.C_POINTER.withName("pOpenCardSearchCriteria"),
        Windows_h.C_POINTER.withName("lpfnConnect"),
        Windows_h.C_POINTER.withName("pvUserData"),
        Windows_h.C_LONG.withName("dwShareMode"),
        Windows_h.C_LONG.withName("dwPreferredProtocols"),
        Windows_h.C_POINTER.withName("lpstrRdr"),
        Windows_h.C_LONG.withName("nMaxRdr"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpstrCard"),
        Windows_h.C_LONG.withName("nMaxCard"),
        Windows_h.C_LONG.withName("dwActiveProtocol"),
        Windows_h.C_LONG_LONG.withName("hCardHandle")
    ).withName("$anon$972:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwStructSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwStructSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static final OfInt dwStructSize$layout() {
        return dwStructSize$LAYOUT;
    }

    private static final long dwStructSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static final long dwStructSize$offset() {
        return dwStructSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static int dwStructSize(MemorySegment struct) {
        return struct.get(dwStructSize$LAYOUT, dwStructSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static void dwStructSize(MemorySegment struct, int fieldValue) {
        struct.set(dwStructSize$LAYOUT, dwStructSize$OFFSET, fieldValue);
    }

    private static final OfLong hSCardContext$LAYOUT = (OfLong)$LAYOUT.select(groupElement("hSCardContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SCARDCONTEXT hSCardContext
     * }
     */
    public static final OfLong hSCardContext$layout() {
        return hSCardContext$LAYOUT;
    }

    private static final long hSCardContext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SCARDCONTEXT hSCardContext
     * }
     */
    public static final long hSCardContext$offset() {
        return hSCardContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SCARDCONTEXT hSCardContext
     * }
     */
    public static long hSCardContext(MemorySegment struct) {
        return struct.get(hSCardContext$LAYOUT, hSCardContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SCARDCONTEXT hSCardContext
     * }
     */
    public static void hSCardContext(MemorySegment struct, long fieldValue) {
        struct.set(hSCardContext$LAYOUT, hSCardContext$OFFSET, fieldValue);
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

    private static final long hwndOwner$OFFSET = 16;

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

    private static final long dwFlags$OFFSET = 24;

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

    private static final AddressLayout lpstrTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrTitle
     * }
     */
    public static final AddressLayout lpstrTitle$layout() {
        return lpstrTitle$LAYOUT;
    }

    private static final long lpstrTitle$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrTitle
     * }
     */
    public static final long lpstrTitle$offset() {
        return lpstrTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrTitle
     * }
     */
    public static MemorySegment lpstrTitle(MemorySegment struct) {
        return struct.get(lpstrTitle$LAYOUT, lpstrTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrTitle
     * }
     */
    public static void lpstrTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrTitle$LAYOUT, lpstrTitle$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrSearchDesc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrSearchDesc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrSearchDesc
     * }
     */
    public static final AddressLayout lpstrSearchDesc$layout() {
        return lpstrSearchDesc$LAYOUT;
    }

    private static final long lpstrSearchDesc$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrSearchDesc
     * }
     */
    public static final long lpstrSearchDesc$offset() {
        return lpstrSearchDesc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrSearchDesc
     * }
     */
    public static MemorySegment lpstrSearchDesc(MemorySegment struct) {
        return struct.get(lpstrSearchDesc$LAYOUT, lpstrSearchDesc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpstrSearchDesc
     * }
     */
    public static void lpstrSearchDesc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrSearchDesc$LAYOUT, lpstrSearchDesc$OFFSET, fieldValue);
    }

    private static final AddressLayout hIcon$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hIcon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HICON hIcon
     * }
     */
    public static final AddressLayout hIcon$layout() {
        return hIcon$LAYOUT;
    }

    private static final long hIcon$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HICON hIcon
     * }
     */
    public static final long hIcon$offset() {
        return hIcon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HICON hIcon
     * }
     */
    public static MemorySegment hIcon(MemorySegment struct) {
        return struct.get(hIcon$LAYOUT, hIcon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HICON hIcon
     * }
     */
    public static void hIcon(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hIcon$LAYOUT, hIcon$OFFSET, fieldValue);
    }

    private static final AddressLayout pOpenCardSearchCriteria$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pOpenCardSearchCriteria"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POPENCARD_SEARCH_CRITERIAW pOpenCardSearchCriteria
     * }
     */
    public static final AddressLayout pOpenCardSearchCriteria$layout() {
        return pOpenCardSearchCriteria$LAYOUT;
    }

    private static final long pOpenCardSearchCriteria$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POPENCARD_SEARCH_CRITERIAW pOpenCardSearchCriteria
     * }
     */
    public static final long pOpenCardSearchCriteria$offset() {
        return pOpenCardSearchCriteria$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POPENCARD_SEARCH_CRITERIAW pOpenCardSearchCriteria
     * }
     */
    public static MemorySegment pOpenCardSearchCriteria(MemorySegment struct) {
        return struct.get(pOpenCardSearchCriteria$LAYOUT, pOpenCardSearchCriteria$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POPENCARD_SEARCH_CRITERIAW pOpenCardSearchCriteria
     * }
     */
    public static void pOpenCardSearchCriteria(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pOpenCardSearchCriteria$LAYOUT, pOpenCardSearchCriteria$OFFSET, fieldValue);
    }

    private static final AddressLayout lpfnConnect$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpfnConnect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOCNCONNPROCW lpfnConnect
     * }
     */
    public static final AddressLayout lpfnConnect$layout() {
        return lpfnConnect$LAYOUT;
    }

    private static final long lpfnConnect$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOCNCONNPROCW lpfnConnect
     * }
     */
    public static final long lpfnConnect$offset() {
        return lpfnConnect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOCNCONNPROCW lpfnConnect
     * }
     */
    public static MemorySegment lpfnConnect(MemorySegment struct) {
        return struct.get(lpfnConnect$LAYOUT, lpfnConnect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOCNCONNPROCW lpfnConnect
     * }
     */
    public static void lpfnConnect(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpfnConnect$LAYOUT, lpfnConnect$OFFSET, fieldValue);
    }

    private static final AddressLayout pvUserData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvUserData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID pvUserData
     * }
     */
    public static final AddressLayout pvUserData$layout() {
        return pvUserData$LAYOUT;
    }

    private static final long pvUserData$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID pvUserData
     * }
     */
    public static final long pvUserData$offset() {
        return pvUserData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID pvUserData
     * }
     */
    public static MemorySegment pvUserData(MemorySegment struct) {
        return struct.get(pvUserData$LAYOUT, pvUserData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID pvUserData
     * }
     */
    public static void pvUserData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvUserData$LAYOUT, pvUserData$OFFSET, fieldValue);
    }

    private static final OfInt dwShareMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwShareMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwShareMode
     * }
     */
    public static final OfInt dwShareMode$layout() {
        return dwShareMode$LAYOUT;
    }

    private static final long dwShareMode$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwShareMode
     * }
     */
    public static final long dwShareMode$offset() {
        return dwShareMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwShareMode
     * }
     */
    public static int dwShareMode(MemorySegment struct) {
        return struct.get(dwShareMode$LAYOUT, dwShareMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwShareMode
     * }
     */
    public static void dwShareMode(MemorySegment struct, int fieldValue) {
        struct.set(dwShareMode$LAYOUT, dwShareMode$OFFSET, fieldValue);
    }

    private static final OfInt dwPreferredProtocols$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPreferredProtocols"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwPreferredProtocols
     * }
     */
    public static final OfInt dwPreferredProtocols$layout() {
        return dwPreferredProtocols$LAYOUT;
    }

    private static final long dwPreferredProtocols$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwPreferredProtocols
     * }
     */
    public static final long dwPreferredProtocols$offset() {
        return dwPreferredProtocols$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwPreferredProtocols
     * }
     */
    public static int dwPreferredProtocols(MemorySegment struct) {
        return struct.get(dwPreferredProtocols$LAYOUT, dwPreferredProtocols$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwPreferredProtocols
     * }
     */
    public static void dwPreferredProtocols(MemorySegment struct, int fieldValue) {
        struct.set(dwPreferredProtocols$LAYOUT, dwPreferredProtocols$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrRdr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrRdr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpstrRdr
     * }
     */
    public static final AddressLayout lpstrRdr$layout() {
        return lpstrRdr$LAYOUT;
    }

    private static final long lpstrRdr$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpstrRdr
     * }
     */
    public static final long lpstrRdr$offset() {
        return lpstrRdr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrRdr
     * }
     */
    public static MemorySegment lpstrRdr(MemorySegment struct) {
        return struct.get(lpstrRdr$LAYOUT, lpstrRdr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrRdr
     * }
     */
    public static void lpstrRdr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrRdr$LAYOUT, lpstrRdr$OFFSET, fieldValue);
    }

    private static final OfInt nMaxRdr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nMaxRdr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nMaxRdr
     * }
     */
    public static final OfInt nMaxRdr$layout() {
        return nMaxRdr$LAYOUT;
    }

    private static final long nMaxRdr$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nMaxRdr
     * }
     */
    public static final long nMaxRdr$offset() {
        return nMaxRdr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nMaxRdr
     * }
     */
    public static int nMaxRdr(MemorySegment struct) {
        return struct.get(nMaxRdr$LAYOUT, nMaxRdr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nMaxRdr
     * }
     */
    public static void nMaxRdr(MemorySegment struct, int fieldValue) {
        struct.set(nMaxRdr$LAYOUT, nMaxRdr$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstrCard$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstrCard"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCard
     * }
     */
    public static final AddressLayout lpstrCard$layout() {
        return lpstrCard$LAYOUT;
    }

    private static final long lpstrCard$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCard
     * }
     */
    public static final long lpstrCard$offset() {
        return lpstrCard$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCard
     * }
     */
    public static MemorySegment lpstrCard(MemorySegment struct) {
        return struct.get(lpstrCard$LAYOUT, lpstrCard$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpstrCard
     * }
     */
    public static void lpstrCard(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstrCard$LAYOUT, lpstrCard$OFFSET, fieldValue);
    }

    private static final OfInt nMaxCard$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nMaxCard"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nMaxCard
     * }
     */
    public static final OfInt nMaxCard$layout() {
        return nMaxCard$LAYOUT;
    }

    private static final long nMaxCard$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nMaxCard
     * }
     */
    public static final long nMaxCard$offset() {
        return nMaxCard$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nMaxCard
     * }
     */
    public static int nMaxCard(MemorySegment struct) {
        return struct.get(nMaxCard$LAYOUT, nMaxCard$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nMaxCard
     * }
     */
    public static void nMaxCard(MemorySegment struct, int fieldValue) {
        struct.set(nMaxCard$LAYOUT, nMaxCard$OFFSET, fieldValue);
    }

    private static final OfInt dwActiveProtocol$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwActiveProtocol"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwActiveProtocol
     * }
     */
    public static final OfInt dwActiveProtocol$layout() {
        return dwActiveProtocol$LAYOUT;
    }

    private static final long dwActiveProtocol$OFFSET = 116;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwActiveProtocol
     * }
     */
    public static final long dwActiveProtocol$offset() {
        return dwActiveProtocol$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwActiveProtocol
     * }
     */
    public static int dwActiveProtocol(MemorySegment struct) {
        return struct.get(dwActiveProtocol$LAYOUT, dwActiveProtocol$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwActiveProtocol
     * }
     */
    public static void dwActiveProtocol(MemorySegment struct, int fieldValue) {
        struct.set(dwActiveProtocol$LAYOUT, dwActiveProtocol$OFFSET, fieldValue);
    }

    private static final OfLong hCardHandle$LAYOUT = (OfLong)$LAYOUT.select(groupElement("hCardHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SCARDHANDLE hCardHandle
     * }
     */
    public static final OfLong hCardHandle$layout() {
        return hCardHandle$LAYOUT;
    }

    private static final long hCardHandle$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SCARDHANDLE hCardHandle
     * }
     */
    public static final long hCardHandle$offset() {
        return hCardHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SCARDHANDLE hCardHandle
     * }
     */
    public static long hCardHandle(MemorySegment struct) {
        return struct.get(hCardHandle$LAYOUT, hCardHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SCARDHANDLE hCardHandle
     * }
     */
    public static void hCardHandle(MemorySegment struct, long fieldValue) {
        struct.set(hCardHandle$LAYOUT, hCardHandle$OFFSET, fieldValue);
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
