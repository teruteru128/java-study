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
 * struct _BCRYPT_RSAKEY_BLOB {
 *     ULONG Magic;
 *     ULONG BitLength;
 *     ULONG cbPublicExp;
 *     ULONG cbModulus;
 *     ULONG cbPrime1;
 *     ULONG cbPrime2;
 * }
 * }
 */
public class _BCRYPT_RSAKEY_BLOB {

    _BCRYPT_RSAKEY_BLOB() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Magic"),
        Windows_h.C_LONG.withName("BitLength"),
        Windows_h.C_LONG.withName("cbPublicExp"),
        Windows_h.C_LONG.withName("cbModulus"),
        Windows_h.C_LONG.withName("cbPrime1"),
        Windows_h.C_LONG.withName("cbPrime2")
    ).withName("_BCRYPT_RSAKEY_BLOB");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Magic$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Magic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG Magic
     * }
     */
    public static final OfInt Magic$layout() {
        return Magic$LAYOUT;
    }

    private static final long Magic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG Magic
     * }
     */
    public static final long Magic$offset() {
        return Magic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG Magic
     * }
     */
    public static int Magic(MemorySegment struct) {
        return struct.get(Magic$LAYOUT, Magic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG Magic
     * }
     */
    public static void Magic(MemorySegment struct, int fieldValue) {
        struct.set(Magic$LAYOUT, Magic$OFFSET, fieldValue);
    }

    private static final OfInt BitLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BitLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG BitLength
     * }
     */
    public static final OfInt BitLength$layout() {
        return BitLength$LAYOUT;
    }

    private static final long BitLength$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG BitLength
     * }
     */
    public static final long BitLength$offset() {
        return BitLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG BitLength
     * }
     */
    public static int BitLength(MemorySegment struct) {
        return struct.get(BitLength$LAYOUT, BitLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG BitLength
     * }
     */
    public static void BitLength(MemorySegment struct, int fieldValue) {
        struct.set(BitLength$LAYOUT, BitLength$OFFSET, fieldValue);
    }

    private static final OfInt cbPublicExp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbPublicExp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbPublicExp
     * }
     */
    public static final OfInt cbPublicExp$layout() {
        return cbPublicExp$LAYOUT;
    }

    private static final long cbPublicExp$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbPublicExp
     * }
     */
    public static final long cbPublicExp$offset() {
        return cbPublicExp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbPublicExp
     * }
     */
    public static int cbPublicExp(MemorySegment struct) {
        return struct.get(cbPublicExp$LAYOUT, cbPublicExp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbPublicExp
     * }
     */
    public static void cbPublicExp(MemorySegment struct, int fieldValue) {
        struct.set(cbPublicExp$LAYOUT, cbPublicExp$OFFSET, fieldValue);
    }

    private static final OfInt cbModulus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbModulus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbModulus
     * }
     */
    public static final OfInt cbModulus$layout() {
        return cbModulus$LAYOUT;
    }

    private static final long cbModulus$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbModulus
     * }
     */
    public static final long cbModulus$offset() {
        return cbModulus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbModulus
     * }
     */
    public static int cbModulus(MemorySegment struct) {
        return struct.get(cbModulus$LAYOUT, cbModulus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbModulus
     * }
     */
    public static void cbModulus(MemorySegment struct, int fieldValue) {
        struct.set(cbModulus$LAYOUT, cbModulus$OFFSET, fieldValue);
    }

    private static final OfInt cbPrime1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbPrime1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbPrime1
     * }
     */
    public static final OfInt cbPrime1$layout() {
        return cbPrime1$LAYOUT;
    }

    private static final long cbPrime1$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbPrime1
     * }
     */
    public static final long cbPrime1$offset() {
        return cbPrime1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbPrime1
     * }
     */
    public static int cbPrime1(MemorySegment struct) {
        return struct.get(cbPrime1$LAYOUT, cbPrime1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbPrime1
     * }
     */
    public static void cbPrime1(MemorySegment struct, int fieldValue) {
        struct.set(cbPrime1$LAYOUT, cbPrime1$OFFSET, fieldValue);
    }

    private static final OfInt cbPrime2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbPrime2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbPrime2
     * }
     */
    public static final OfInt cbPrime2$layout() {
        return cbPrime2$LAYOUT;
    }

    private static final long cbPrime2$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbPrime2
     * }
     */
    public static final long cbPrime2$offset() {
        return cbPrime2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbPrime2
     * }
     */
    public static int cbPrime2(MemorySegment struct) {
        return struct.get(cbPrime2$LAYOUT, cbPrime2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbPrime2
     * }
     */
    public static void cbPrime2(MemorySegment struct, int fieldValue) {
        struct.set(cbPrime2$LAYOUT, cbPrime2$OFFSET, fieldValue);
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

