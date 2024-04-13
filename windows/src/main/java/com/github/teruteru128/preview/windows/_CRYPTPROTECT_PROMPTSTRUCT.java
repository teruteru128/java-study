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
 * struct _CRYPTPROTECT_PROMPTSTRUCT {
 *     DWORD cbSize;
 *     DWORD dwPromptFlags;
 *     HWND hwndApp;
 *     LPCWSTR szPrompt;
 * }
 * }
 */
public class _CRYPTPROTECT_PROMPTSTRUCT {

    _CRYPTPROTECT_PROMPTSTRUCT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        Windows_h.C_LONG.withName("dwPromptFlags"),
        Windows_h.C_POINTER.withName("hwndApp"),
        Windows_h.C_POINTER.withName("szPrompt")
    ).withName("_CRYPTPROTECT_PROMPTSTRUCT");

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
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt dwPromptFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPromptFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwPromptFlags
     * }
     */
    public static final OfInt dwPromptFlags$layout() {
        return dwPromptFlags$LAYOUT;
    }

    private static final long dwPromptFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwPromptFlags
     * }
     */
    public static final long dwPromptFlags$offset() {
        return dwPromptFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwPromptFlags
     * }
     */
    public static int dwPromptFlags(MemorySegment struct) {
        return struct.get(dwPromptFlags$LAYOUT, dwPromptFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwPromptFlags
     * }
     */
    public static void dwPromptFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwPromptFlags$LAYOUT, dwPromptFlags$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndApp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndApp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndApp
     * }
     */
    public static final AddressLayout hwndApp$layout() {
        return hwndApp$LAYOUT;
    }

    private static final long hwndApp$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndApp
     * }
     */
    public static final long hwndApp$offset() {
        return hwndApp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndApp
     * }
     */
    public static MemorySegment hwndApp(MemorySegment struct) {
        return struct.get(hwndApp$LAYOUT, hwndApp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndApp
     * }
     */
    public static void hwndApp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndApp$LAYOUT, hwndApp$OFFSET, fieldValue);
    }

    private static final AddressLayout szPrompt$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("szPrompt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR szPrompt
     * }
     */
    public static final AddressLayout szPrompt$layout() {
        return szPrompt$LAYOUT;
    }

    private static final long szPrompt$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR szPrompt
     * }
     */
    public static final long szPrompt$offset() {
        return szPrompt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR szPrompt
     * }
     */
    public static MemorySegment szPrompt(MemorySegment struct) {
        return struct.get(szPrompt$LAYOUT, szPrompt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR szPrompt
     * }
     */
    public static void szPrompt(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(szPrompt$LAYOUT, szPrompt$OFFSET, fieldValue);
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
