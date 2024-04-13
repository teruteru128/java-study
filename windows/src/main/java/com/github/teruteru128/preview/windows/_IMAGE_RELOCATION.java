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
 * struct _IMAGE_RELOCATION {
 *     union {
 *         DWORD VirtualAddress;
 *         DWORD RelocCount;
 *     };
 *     DWORD SymbolTableIndex;
 *     WORD Type;
 * }
 * }
 */
public class _IMAGE_RELOCATION {

    _IMAGE_RELOCATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Windows_h.align(Windows_h.C_LONG, 2).withName("VirtualAddress"),
            Windows_h.align(Windows_h.C_LONG, 2).withName("RelocCount")
        ).withName("$anon$18780:5"),
        Windows_h.align(Windows_h.C_LONG, 2).withName("SymbolTableIndex"),
        Windows_h.C_SHORT.withName("Type")
    ).withName("_IMAGE_RELOCATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt VirtualAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$18780:5"), groupElement("VirtualAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD VirtualAddress
     * }
     */
    public static final OfInt VirtualAddress$layout() {
        return VirtualAddress$LAYOUT;
    }

    private static final long VirtualAddress$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD VirtualAddress
     * }
     */
    public static final long VirtualAddress$offset() {
        return VirtualAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD VirtualAddress
     * }
     */
    public static int VirtualAddress(MemorySegment struct) {
        return struct.get(VirtualAddress$LAYOUT, VirtualAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD VirtualAddress
     * }
     */
    public static void VirtualAddress(MemorySegment struct, int fieldValue) {
        struct.set(VirtualAddress$LAYOUT, VirtualAddress$OFFSET, fieldValue);
    }

    private static final OfInt RelocCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$18780:5"), groupElement("RelocCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD RelocCount
     * }
     */
    public static final OfInt RelocCount$layout() {
        return RelocCount$LAYOUT;
    }

    private static final long RelocCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD RelocCount
     * }
     */
    public static final long RelocCount$offset() {
        return RelocCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD RelocCount
     * }
     */
    public static int RelocCount(MemorySegment struct) {
        return struct.get(RelocCount$LAYOUT, RelocCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD RelocCount
     * }
     */
    public static void RelocCount(MemorySegment struct, int fieldValue) {
        struct.set(RelocCount$LAYOUT, RelocCount$OFFSET, fieldValue);
    }

    private static final OfInt SymbolTableIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SymbolTableIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SymbolTableIndex
     * }
     */
    public static final OfInt SymbolTableIndex$layout() {
        return SymbolTableIndex$LAYOUT;
    }

    private static final long SymbolTableIndex$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SymbolTableIndex
     * }
     */
    public static final long SymbolTableIndex$offset() {
        return SymbolTableIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SymbolTableIndex
     * }
     */
    public static int SymbolTableIndex(MemorySegment struct) {
        return struct.get(SymbolTableIndex$LAYOUT, SymbolTableIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SymbolTableIndex
     * }
     */
    public static void SymbolTableIndex(MemorySegment struct, int fieldValue) {
        struct.set(SymbolTableIndex$LAYOUT, SymbolTableIndex$OFFSET, fieldValue);
    }

    private static final OfShort Type$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static final OfShort Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static short Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static void Type(MemorySegment struct, short fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
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
