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
 * struct _STARTUPINFOW {
 *     DWORD cb;
 *     LPWSTR lpReserved;
 *     LPWSTR lpDesktop;
 *     LPWSTR lpTitle;
 *     DWORD dwX;
 *     DWORD dwY;
 *     DWORD dwXSize;
 *     DWORD dwYSize;
 *     DWORD dwXCountChars;
 *     DWORD dwYCountChars;
 *     DWORD dwFillAttribute;
 *     DWORD dwFlags;
 *     WORD wShowWindow;
 *     WORD cbReserved2;
 *     LPBYTE lpReserved2;
 *     HANDLE hStdInput;
 *     HANDLE hStdOutput;
 *     HANDLE hStdError;
 * }
 * }
 */
public class _STARTUPINFOW {

    _STARTUPINFOW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cb"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpReserved"),
        Windows_h.C_POINTER.withName("lpDesktop"),
        Windows_h.C_POINTER.withName("lpTitle"),
        Windows_h.C_LONG.withName("dwX"),
        Windows_h.C_LONG.withName("dwY"),
        Windows_h.C_LONG.withName("dwXSize"),
        Windows_h.C_LONG.withName("dwYSize"),
        Windows_h.C_LONG.withName("dwXCountChars"),
        Windows_h.C_LONG.withName("dwYCountChars"),
        Windows_h.C_LONG.withName("dwFillAttribute"),
        Windows_h.C_LONG.withName("dwFlags"),
        Windows_h.C_SHORT.withName("wShowWindow"),
        Windows_h.C_SHORT.withName("cbReserved2"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpReserved2"),
        Windows_h.C_POINTER.withName("hStdInput"),
        Windows_h.C_POINTER.withName("hStdOutput"),
        Windows_h.C_POINTER.withName("hStdError")
    ).withName("_STARTUPINFOW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cb$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cb"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static final OfInt cb$layout() {
        return cb$LAYOUT;
    }

    private static final long cb$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static final long cb$offset() {
        return cb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static int cb(MemorySegment struct) {
        return struct.get(cb$LAYOUT, cb$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static void cb(MemorySegment struct, int fieldValue) {
        struct.set(cb$LAYOUT, cb$OFFSET, fieldValue);
    }

    private static final AddressLayout lpReserved$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpReserved
     * }
     */
    public static final AddressLayout lpReserved$layout() {
        return lpReserved$LAYOUT;
    }

    private static final long lpReserved$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpReserved
     * }
     */
    public static final long lpReserved$offset() {
        return lpReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpReserved
     * }
     */
    public static MemorySegment lpReserved(MemorySegment struct) {
        return struct.get(lpReserved$LAYOUT, lpReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpReserved
     * }
     */
    public static void lpReserved(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpReserved$LAYOUT, lpReserved$OFFSET, fieldValue);
    }

    private static final AddressLayout lpDesktop$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpDesktop"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpDesktop
     * }
     */
    public static final AddressLayout lpDesktop$layout() {
        return lpDesktop$LAYOUT;
    }

    private static final long lpDesktop$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpDesktop
     * }
     */
    public static final long lpDesktop$offset() {
        return lpDesktop$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpDesktop
     * }
     */
    public static MemorySegment lpDesktop(MemorySegment struct) {
        return struct.get(lpDesktop$LAYOUT, lpDesktop$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpDesktop
     * }
     */
    public static void lpDesktop(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpDesktop$LAYOUT, lpDesktop$OFFSET, fieldValue);
    }

    private static final AddressLayout lpTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpTitle
     * }
     */
    public static final AddressLayout lpTitle$layout() {
        return lpTitle$LAYOUT;
    }

    private static final long lpTitle$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpTitle
     * }
     */
    public static final long lpTitle$offset() {
        return lpTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpTitle
     * }
     */
    public static MemorySegment lpTitle(MemorySegment struct) {
        return struct.get(lpTitle$LAYOUT, lpTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpTitle
     * }
     */
    public static void lpTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpTitle$LAYOUT, lpTitle$OFFSET, fieldValue);
    }

    private static final OfInt dwX$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwX
     * }
     */
    public static final OfInt dwX$layout() {
        return dwX$LAYOUT;
    }

    private static final long dwX$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwX
     * }
     */
    public static final long dwX$offset() {
        return dwX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwX
     * }
     */
    public static int dwX(MemorySegment struct) {
        return struct.get(dwX$LAYOUT, dwX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwX
     * }
     */
    public static void dwX(MemorySegment struct, int fieldValue) {
        struct.set(dwX$LAYOUT, dwX$OFFSET, fieldValue);
    }

    private static final OfInt dwY$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwY
     * }
     */
    public static final OfInt dwY$layout() {
        return dwY$LAYOUT;
    }

    private static final long dwY$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwY
     * }
     */
    public static final long dwY$offset() {
        return dwY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwY
     * }
     */
    public static int dwY(MemorySegment struct) {
        return struct.get(dwY$LAYOUT, dwY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwY
     * }
     */
    public static void dwY(MemorySegment struct, int fieldValue) {
        struct.set(dwY$LAYOUT, dwY$OFFSET, fieldValue);
    }

    private static final OfInt dwXSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwXSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwXSize
     * }
     */
    public static final OfInt dwXSize$layout() {
        return dwXSize$LAYOUT;
    }

    private static final long dwXSize$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwXSize
     * }
     */
    public static final long dwXSize$offset() {
        return dwXSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwXSize
     * }
     */
    public static int dwXSize(MemorySegment struct) {
        return struct.get(dwXSize$LAYOUT, dwXSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwXSize
     * }
     */
    public static void dwXSize(MemorySegment struct, int fieldValue) {
        struct.set(dwXSize$LAYOUT, dwXSize$OFFSET, fieldValue);
    }

    private static final OfInt dwYSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwYSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwYSize
     * }
     */
    public static final OfInt dwYSize$layout() {
        return dwYSize$LAYOUT;
    }

    private static final long dwYSize$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwYSize
     * }
     */
    public static final long dwYSize$offset() {
        return dwYSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwYSize
     * }
     */
    public static int dwYSize(MemorySegment struct) {
        return struct.get(dwYSize$LAYOUT, dwYSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwYSize
     * }
     */
    public static void dwYSize(MemorySegment struct, int fieldValue) {
        struct.set(dwYSize$LAYOUT, dwYSize$OFFSET, fieldValue);
    }

    private static final OfInt dwXCountChars$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwXCountChars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwXCountChars
     * }
     */
    public static final OfInt dwXCountChars$layout() {
        return dwXCountChars$LAYOUT;
    }

    private static final long dwXCountChars$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwXCountChars
     * }
     */
    public static final long dwXCountChars$offset() {
        return dwXCountChars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwXCountChars
     * }
     */
    public static int dwXCountChars(MemorySegment struct) {
        return struct.get(dwXCountChars$LAYOUT, dwXCountChars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwXCountChars
     * }
     */
    public static void dwXCountChars(MemorySegment struct, int fieldValue) {
        struct.set(dwXCountChars$LAYOUT, dwXCountChars$OFFSET, fieldValue);
    }

    private static final OfInt dwYCountChars$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwYCountChars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwYCountChars
     * }
     */
    public static final OfInt dwYCountChars$layout() {
        return dwYCountChars$LAYOUT;
    }

    private static final long dwYCountChars$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwYCountChars
     * }
     */
    public static final long dwYCountChars$offset() {
        return dwYCountChars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwYCountChars
     * }
     */
    public static int dwYCountChars(MemorySegment struct) {
        return struct.get(dwYCountChars$LAYOUT, dwYCountChars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwYCountChars
     * }
     */
    public static void dwYCountChars(MemorySegment struct, int fieldValue) {
        struct.set(dwYCountChars$LAYOUT, dwYCountChars$OFFSET, fieldValue);
    }

    private static final OfInt dwFillAttribute$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFillAttribute"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFillAttribute
     * }
     */
    public static final OfInt dwFillAttribute$layout() {
        return dwFillAttribute$LAYOUT;
    }

    private static final long dwFillAttribute$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFillAttribute
     * }
     */
    public static final long dwFillAttribute$offset() {
        return dwFillAttribute$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFillAttribute
     * }
     */
    public static int dwFillAttribute(MemorySegment struct) {
        return struct.get(dwFillAttribute$LAYOUT, dwFillAttribute$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFillAttribute
     * }
     */
    public static void dwFillAttribute(MemorySegment struct, int fieldValue) {
        struct.set(dwFillAttribute$LAYOUT, dwFillAttribute$OFFSET, fieldValue);
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

    private static final long dwFlags$OFFSET = 60;

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

    private static final OfShort wShowWindow$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wShowWindow"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wShowWindow
     * }
     */
    public static final OfShort wShowWindow$layout() {
        return wShowWindow$LAYOUT;
    }

    private static final long wShowWindow$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wShowWindow
     * }
     */
    public static final long wShowWindow$offset() {
        return wShowWindow$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wShowWindow
     * }
     */
    public static short wShowWindow(MemorySegment struct) {
        return struct.get(wShowWindow$LAYOUT, wShowWindow$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wShowWindow
     * }
     */
    public static void wShowWindow(MemorySegment struct, short fieldValue) {
        struct.set(wShowWindow$LAYOUT, wShowWindow$OFFSET, fieldValue);
    }

    private static final OfShort cbReserved2$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cbReserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD cbReserved2
     * }
     */
    public static final OfShort cbReserved2$layout() {
        return cbReserved2$LAYOUT;
    }

    private static final long cbReserved2$OFFSET = 66;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD cbReserved2
     * }
     */
    public static final long cbReserved2$offset() {
        return cbReserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD cbReserved2
     * }
     */
    public static short cbReserved2(MemorySegment struct) {
        return struct.get(cbReserved2$LAYOUT, cbReserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD cbReserved2
     * }
     */
    public static void cbReserved2(MemorySegment struct, short fieldValue) {
        struct.set(cbReserved2$LAYOUT, cbReserved2$OFFSET, fieldValue);
    }

    private static final AddressLayout lpReserved2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpReserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPBYTE lpReserved2
     * }
     */
    public static final AddressLayout lpReserved2$layout() {
        return lpReserved2$LAYOUT;
    }

    private static final long lpReserved2$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPBYTE lpReserved2
     * }
     */
    public static final long lpReserved2$offset() {
        return lpReserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPBYTE lpReserved2
     * }
     */
    public static MemorySegment lpReserved2(MemorySegment struct) {
        return struct.get(lpReserved2$LAYOUT, lpReserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPBYTE lpReserved2
     * }
     */
    public static void lpReserved2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpReserved2$LAYOUT, lpReserved2$OFFSET, fieldValue);
    }

    private static final AddressLayout hStdInput$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hStdInput"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hStdInput
     * }
     */
    public static final AddressLayout hStdInput$layout() {
        return hStdInput$LAYOUT;
    }

    private static final long hStdInput$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hStdInput
     * }
     */
    public static final long hStdInput$offset() {
        return hStdInput$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hStdInput
     * }
     */
    public static MemorySegment hStdInput(MemorySegment struct) {
        return struct.get(hStdInput$LAYOUT, hStdInput$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hStdInput
     * }
     */
    public static void hStdInput(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hStdInput$LAYOUT, hStdInput$OFFSET, fieldValue);
    }

    private static final AddressLayout hStdOutput$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hStdOutput"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hStdOutput
     * }
     */
    public static final AddressLayout hStdOutput$layout() {
        return hStdOutput$LAYOUT;
    }

    private static final long hStdOutput$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hStdOutput
     * }
     */
    public static final long hStdOutput$offset() {
        return hStdOutput$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hStdOutput
     * }
     */
    public static MemorySegment hStdOutput(MemorySegment struct) {
        return struct.get(hStdOutput$LAYOUT, hStdOutput$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hStdOutput
     * }
     */
    public static void hStdOutput(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hStdOutput$LAYOUT, hStdOutput$OFFSET, fieldValue);
    }

    private static final AddressLayout hStdError$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hStdError"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hStdError
     * }
     */
    public static final AddressLayout hStdError$layout() {
        return hStdError$LAYOUT;
    }

    private static final long hStdError$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hStdError
     * }
     */
    public static final long hStdError$offset() {
        return hStdError$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hStdError
     * }
     */
    public static MemorySegment hStdError(MemorySegment struct) {
        return struct.get(hStdError$LAYOUT, hStdError$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hStdError
     * }
     */
    public static void hStdError(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hStdError$LAYOUT, hStdError$OFFSET, fieldValue);
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

