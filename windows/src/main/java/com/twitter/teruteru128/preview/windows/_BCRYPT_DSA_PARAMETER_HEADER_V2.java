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
 * struct _BCRYPT_DSA_PARAMETER_HEADER_V2 {
 *     ULONG cbLength;
 *     ULONG dwMagic;
 *     ULONG cbKeyLength;
 *     HASHALGORITHM_ENUM hashAlgorithm;
 *     DSAFIPSVERSION_ENUM standardVersion;
 *     ULONG cbSeedLength;
 *     ULONG cbGroupSize;
 *     UCHAR Count[4];
 * }
 * }
 */
public class _BCRYPT_DSA_PARAMETER_HEADER_V2 {

    _BCRYPT_DSA_PARAMETER_HEADER_V2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbLength"),
        Windows_h.C_LONG.withName("dwMagic"),
        Windows_h.C_LONG.withName("cbKeyLength"),
        Windows_h.C_INT.withName("hashAlgorithm"),
        Windows_h.C_INT.withName("standardVersion"),
        Windows_h.C_LONG.withName("cbSeedLength"),
        Windows_h.C_LONG.withName("cbGroupSize"),
        MemoryLayout.sequenceLayout(4, Windows_h.C_CHAR).withName("Count")
    ).withName("_BCRYPT_DSA_PARAMETER_HEADER_V2");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbLength
     * }
     */
    public static final OfInt cbLength$layout() {
        return cbLength$LAYOUT;
    }

    private static final long cbLength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbLength
     * }
     */
    public static final long cbLength$offset() {
        return cbLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbLength
     * }
     */
    public static int cbLength(MemorySegment struct) {
        return struct.get(cbLength$LAYOUT, cbLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbLength
     * }
     */
    public static void cbLength(MemorySegment struct, int fieldValue) {
        struct.set(cbLength$LAYOUT, cbLength$OFFSET, fieldValue);
    }

    private static final OfInt dwMagic$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMagic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwMagic
     * }
     */
    public static final OfInt dwMagic$layout() {
        return dwMagic$LAYOUT;
    }

    private static final long dwMagic$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwMagic
     * }
     */
    public static final long dwMagic$offset() {
        return dwMagic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwMagic
     * }
     */
    public static int dwMagic(MemorySegment struct) {
        return struct.get(dwMagic$LAYOUT, dwMagic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwMagic
     * }
     */
    public static void dwMagic(MemorySegment struct, int fieldValue) {
        struct.set(dwMagic$LAYOUT, dwMagic$OFFSET, fieldValue);
    }

    private static final OfInt cbKeyLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbKeyLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbKeyLength
     * }
     */
    public static final OfInt cbKeyLength$layout() {
        return cbKeyLength$LAYOUT;
    }

    private static final long cbKeyLength$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbKeyLength
     * }
     */
    public static final long cbKeyLength$offset() {
        return cbKeyLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbKeyLength
     * }
     */
    public static int cbKeyLength(MemorySegment struct) {
        return struct.get(cbKeyLength$LAYOUT, cbKeyLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbKeyLength
     * }
     */
    public static void cbKeyLength(MemorySegment struct, int fieldValue) {
        struct.set(cbKeyLength$LAYOUT, cbKeyLength$OFFSET, fieldValue);
    }

    private static final OfInt hashAlgorithm$LAYOUT = (OfInt)$LAYOUT.select(groupElement("hashAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HASHALGORITHM_ENUM hashAlgorithm
     * }
     */
    public static final OfInt hashAlgorithm$layout() {
        return hashAlgorithm$LAYOUT;
    }

    private static final long hashAlgorithm$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HASHALGORITHM_ENUM hashAlgorithm
     * }
     */
    public static final long hashAlgorithm$offset() {
        return hashAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HASHALGORITHM_ENUM hashAlgorithm
     * }
     */
    public static int hashAlgorithm(MemorySegment struct) {
        return struct.get(hashAlgorithm$LAYOUT, hashAlgorithm$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HASHALGORITHM_ENUM hashAlgorithm
     * }
     */
    public static void hashAlgorithm(MemorySegment struct, int fieldValue) {
        struct.set(hashAlgorithm$LAYOUT, hashAlgorithm$OFFSET, fieldValue);
    }

    private static final OfInt standardVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("standardVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DSAFIPSVERSION_ENUM standardVersion
     * }
     */
    public static final OfInt standardVersion$layout() {
        return standardVersion$LAYOUT;
    }

    private static final long standardVersion$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DSAFIPSVERSION_ENUM standardVersion
     * }
     */
    public static final long standardVersion$offset() {
        return standardVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DSAFIPSVERSION_ENUM standardVersion
     * }
     */
    public static int standardVersion(MemorySegment struct) {
        return struct.get(standardVersion$LAYOUT, standardVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DSAFIPSVERSION_ENUM standardVersion
     * }
     */
    public static void standardVersion(MemorySegment struct, int fieldValue) {
        struct.set(standardVersion$LAYOUT, standardVersion$OFFSET, fieldValue);
    }

    private static final OfInt cbSeedLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSeedLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbSeedLength
     * }
     */
    public static final OfInt cbSeedLength$layout() {
        return cbSeedLength$LAYOUT;
    }

    private static final long cbSeedLength$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbSeedLength
     * }
     */
    public static final long cbSeedLength$offset() {
        return cbSeedLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbSeedLength
     * }
     */
    public static int cbSeedLength(MemorySegment struct) {
        return struct.get(cbSeedLength$LAYOUT, cbSeedLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbSeedLength
     * }
     */
    public static void cbSeedLength(MemorySegment struct, int fieldValue) {
        struct.set(cbSeedLength$LAYOUT, cbSeedLength$OFFSET, fieldValue);
    }

    private static final OfInt cbGroupSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbGroupSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbGroupSize
     * }
     */
    public static final OfInt cbGroupSize$layout() {
        return cbGroupSize$LAYOUT;
    }

    private static final long cbGroupSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbGroupSize
     * }
     */
    public static final long cbGroupSize$offset() {
        return cbGroupSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbGroupSize
     * }
     */
    public static int cbGroupSize(MemorySegment struct) {
        return struct.get(cbGroupSize$LAYOUT, cbGroupSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbGroupSize
     * }
     */
    public static void cbGroupSize(MemorySegment struct, int fieldValue) {
        struct.set(cbGroupSize$LAYOUT, cbGroupSize$OFFSET, fieldValue);
    }

    private static final SequenceLayout Count$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR Count[4]
     * }
     */
    public static final SequenceLayout Count$layout() {
        return Count$LAYOUT;
    }

    private static final long Count$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR Count[4]
     * }
     */
    public static final long Count$offset() {
        return Count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR Count[4]
     * }
     */
    public static MemorySegment Count(MemorySegment struct) {
        return struct.asSlice(Count$OFFSET, Count$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR Count[4]
     * }
     */
    public static void Count(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Count$OFFSET, Count$LAYOUT.byteSize());
    }

    private static long[] Count$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * UCHAR Count[4]
     * }
     */
    public static long[] Count$dimensions() {
        return Count$DIMS;
    }
    private static final VarHandle Count$ELEM_HANDLE = Count$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * UCHAR Count[4]
     * }
     */
    public static byte Count(MemorySegment struct, long index0) {
        return (byte)Count$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * UCHAR Count[4]
     * }
     */
    public static void Count(MemorySegment struct, long index0, byte fieldValue) {
        Count$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

