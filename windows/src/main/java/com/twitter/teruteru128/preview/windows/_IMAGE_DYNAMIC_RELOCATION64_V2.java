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
 * struct _IMAGE_DYNAMIC_RELOCATION64_V2 {
 *     DWORD HeaderSize;
 *     DWORD FixupInfoSize;
 *     ULONGLONG Symbol;
 *     DWORD SymbolGroup;
 *     DWORD Flags;
 * }
 * }
 */
public class _IMAGE_DYNAMIC_RELOCATION64_V2 {

    _IMAGE_DYNAMIC_RELOCATION64_V2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_LONG, 1).withName("HeaderSize"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("FixupInfoSize"),
        Windows_h.align(Windows_h.C_LONG_LONG, 1).withName("Symbol"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("SymbolGroup"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("Flags")
    ).withName("_IMAGE_DYNAMIC_RELOCATION64_V2");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt HeaderSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("HeaderSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD HeaderSize
     * }
     */
    public static final OfInt HeaderSize$layout() {
        return HeaderSize$LAYOUT;
    }

    private static final long HeaderSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD HeaderSize
     * }
     */
    public static final long HeaderSize$offset() {
        return HeaderSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD HeaderSize
     * }
     */
    public static int HeaderSize(MemorySegment struct) {
        return struct.get(HeaderSize$LAYOUT, HeaderSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD HeaderSize
     * }
     */
    public static void HeaderSize(MemorySegment struct, int fieldValue) {
        struct.set(HeaderSize$LAYOUT, HeaderSize$OFFSET, fieldValue);
    }

    private static final OfInt FixupInfoSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FixupInfoSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FixupInfoSize
     * }
     */
    public static final OfInt FixupInfoSize$layout() {
        return FixupInfoSize$LAYOUT;
    }

    private static final long FixupInfoSize$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FixupInfoSize
     * }
     */
    public static final long FixupInfoSize$offset() {
        return FixupInfoSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FixupInfoSize
     * }
     */
    public static int FixupInfoSize(MemorySegment struct) {
        return struct.get(FixupInfoSize$LAYOUT, FixupInfoSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FixupInfoSize
     * }
     */
    public static void FixupInfoSize(MemorySegment struct, int fieldValue) {
        struct.set(FixupInfoSize$LAYOUT, FixupInfoSize$OFFSET, fieldValue);
    }

    private static final OfLong Symbol$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Symbol"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG Symbol
     * }
     */
    public static final OfLong Symbol$layout() {
        return Symbol$LAYOUT;
    }

    private static final long Symbol$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG Symbol
     * }
     */
    public static final long Symbol$offset() {
        return Symbol$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG Symbol
     * }
     */
    public static long Symbol(MemorySegment struct) {
        return struct.get(Symbol$LAYOUT, Symbol$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG Symbol
     * }
     */
    public static void Symbol(MemorySegment struct, long fieldValue) {
        struct.set(Symbol$LAYOUT, Symbol$OFFSET, fieldValue);
    }

    private static final OfInt SymbolGroup$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SymbolGroup"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SymbolGroup
     * }
     */
    public static final OfInt SymbolGroup$layout() {
        return SymbolGroup$LAYOUT;
    }

    private static final long SymbolGroup$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SymbolGroup
     * }
     */
    public static final long SymbolGroup$offset() {
        return SymbolGroup$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SymbolGroup
     * }
     */
    public static int SymbolGroup(MemorySegment struct) {
        return struct.get(SymbolGroup$LAYOUT, SymbolGroup$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SymbolGroup
     * }
     */
    public static void SymbolGroup(MemorySegment struct, int fieldValue) {
        struct.set(SymbolGroup$LAYOUT, SymbolGroup$OFFSET, fieldValue);
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

    private static final long Flags$OFFSET = 20;

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

