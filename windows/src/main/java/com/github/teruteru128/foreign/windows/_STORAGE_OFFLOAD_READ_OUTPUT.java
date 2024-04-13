// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * struct _STORAGE_OFFLOAD_READ_OUTPUT {
 *     DWORD OffloadReadFlags;
 *     DWORD Reserved;
 *     DWORDLONG LengthProtected;
 *     DWORD TokenLength;
 *     STORAGE_OFFLOAD_TOKEN Token;
 * }
 * }
 */
public class _STORAGE_OFFLOAD_READ_OUTPUT {

    _STORAGE_OFFLOAD_READ_OUTPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("OffloadReadFlags"),
        Windows_h.C_LONG.withName("Reserved"),
        Windows_h.C_LONG_LONG.withName("LengthProtected"),
        Windows_h.C_LONG.withName("TokenLength"),
        _STORAGE_OFFLOAD_TOKEN.layout().withName("Token"),
        MemoryLayout.paddingLayout(4)
    ).withName("_STORAGE_OFFLOAD_READ_OUTPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt OffloadReadFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("OffloadReadFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD OffloadReadFlags
     * }
     */
    public static final OfInt OffloadReadFlags$layout() {
        return OffloadReadFlags$LAYOUT;
    }

    private static final long OffloadReadFlags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD OffloadReadFlags
     * }
     */
    public static final long OffloadReadFlags$offset() {
        return OffloadReadFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD OffloadReadFlags
     * }
     */
    public static int OffloadReadFlags(MemorySegment struct) {
        return struct.get(OffloadReadFlags$LAYOUT, OffloadReadFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD OffloadReadFlags
     * }
     */
    public static void OffloadReadFlags(MemorySegment struct, int fieldValue) {
        struct.set(OffloadReadFlags$LAYOUT, OffloadReadFlags$OFFSET, fieldValue);
    }

    private static final OfInt Reserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final OfInt Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static int Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, int fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final OfLong LengthProtected$LAYOUT = (OfLong)$LAYOUT.select(groupElement("LengthProtected"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG LengthProtected
     * }
     */
    public static final OfLong LengthProtected$layout() {
        return LengthProtected$LAYOUT;
    }

    private static final long LengthProtected$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG LengthProtected
     * }
     */
    public static final long LengthProtected$offset() {
        return LengthProtected$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG LengthProtected
     * }
     */
    public static long LengthProtected(MemorySegment struct) {
        return struct.get(LengthProtected$LAYOUT, LengthProtected$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG LengthProtected
     * }
     */
    public static void LengthProtected(MemorySegment struct, long fieldValue) {
        struct.set(LengthProtected$LAYOUT, LengthProtected$OFFSET, fieldValue);
    }

    private static final OfInt TokenLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TokenLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TokenLength
     * }
     */
    public static final OfInt TokenLength$layout() {
        return TokenLength$LAYOUT;
    }

    private static final long TokenLength$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TokenLength
     * }
     */
    public static final long TokenLength$offset() {
        return TokenLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TokenLength
     * }
     */
    public static int TokenLength(MemorySegment struct) {
        return struct.get(TokenLength$LAYOUT, TokenLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TokenLength
     * }
     */
    public static void TokenLength(MemorySegment struct, int fieldValue) {
        struct.set(TokenLength$LAYOUT, TokenLength$OFFSET, fieldValue);
    }

    private static final GroupLayout Token$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Token"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_OFFLOAD_TOKEN Token
     * }
     */
    public static final GroupLayout Token$layout() {
        return Token$LAYOUT;
    }

    private static final long Token$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_OFFLOAD_TOKEN Token
     * }
     */
    public static final long Token$offset() {
        return Token$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_OFFLOAD_TOKEN Token
     * }
     */
    public static MemorySegment Token(MemorySegment struct) {
        return struct.asSlice(Token$OFFSET, Token$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_OFFLOAD_TOKEN Token
     * }
     */
    public static void Token(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Token$OFFSET, Token$LAYOUT.byteSize());
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
