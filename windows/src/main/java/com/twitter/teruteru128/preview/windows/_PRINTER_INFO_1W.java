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
 * struct _PRINTER_INFO_1W {
 *     DWORD Flags;
 *     LPWSTR pDescription;
 *     LPWSTR pName;
 *     LPWSTR pComment;
 * }
 * }
 */
public class _PRINTER_INFO_1W {

    _PRINTER_INFO_1W() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Flags"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pDescription"),
        Windows_h.C_POINTER.withName("pName"),
        Windows_h.C_POINTER.withName("pComment")
    ).withName("_PRINTER_INFO_1W");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final AddressLayout pDescription$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDescription"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pDescription
     * }
     */
    public static final AddressLayout pDescription$layout() {
        return pDescription$LAYOUT;
    }

    private static final long pDescription$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pDescription
     * }
     */
    public static final long pDescription$offset() {
        return pDescription$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pDescription
     * }
     */
    public static MemorySegment pDescription(MemorySegment struct) {
        return struct.get(pDescription$LAYOUT, pDescription$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pDescription
     * }
     */
    public static void pDescription(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDescription$LAYOUT, pDescription$OFFSET, fieldValue);
    }

    private static final AddressLayout pName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pName
     * }
     */
    public static final AddressLayout pName$layout() {
        return pName$LAYOUT;
    }

    private static final long pName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pName
     * }
     */
    public static final long pName$offset() {
        return pName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pName
     * }
     */
    public static MemorySegment pName(MemorySegment struct) {
        return struct.get(pName$LAYOUT, pName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pName
     * }
     */
    public static void pName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pName$LAYOUT, pName$OFFSET, fieldValue);
    }

    private static final AddressLayout pComment$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pComment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pComment
     * }
     */
    public static final AddressLayout pComment$layout() {
        return pComment$LAYOUT;
    }

    private static final long pComment$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pComment
     * }
     */
    public static final long pComment$offset() {
        return pComment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pComment
     * }
     */
    public static MemorySegment pComment(MemorySegment struct) {
        return struct.get(pComment$LAYOUT, pComment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pComment
     * }
     */
    public static void pComment(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pComment$LAYOUT, pComment$OFFSET, fieldValue);
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

