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
 * struct _CRYPT_BIT_BLOB {
 *     DWORD cbData;
 *     BYTE *pbData;
 *     DWORD cUnusedBits;
 * }
 * }
 */
public class _CRYPT_BIT_BLOB {

    _CRYPT_BIT_BLOB() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbData"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pbData"),
        Windows_h.C_LONG.withName("cUnusedBits"),
        MemoryLayout.paddingLayout(4)
    ).withName("_CRYPT_BIT_BLOB");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static final OfInt cbData$layout() {
        return cbData$LAYOUT;
    }

    private static final long cbData$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static final long cbData$offset() {
        return cbData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static int cbData(MemorySegment struct) {
        return struct.get(cbData$LAYOUT, cbData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static void cbData(MemorySegment struct, int fieldValue) {
        struct.set(cbData$LAYOUT, cbData$OFFSET, fieldValue);
    }

    private static final AddressLayout pbData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE *pbData
     * }
     */
    public static final AddressLayout pbData$layout() {
        return pbData$LAYOUT;
    }

    private static final long pbData$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE *pbData
     * }
     */
    public static final long pbData$offset() {
        return pbData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE *pbData
     * }
     */
    public static MemorySegment pbData(MemorySegment struct) {
        return struct.get(pbData$LAYOUT, pbData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE *pbData
     * }
     */
    public static void pbData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbData$LAYOUT, pbData$OFFSET, fieldValue);
    }

    private static final OfInt cUnusedBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cUnusedBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cUnusedBits
     * }
     */
    public static final OfInt cUnusedBits$layout() {
        return cUnusedBits$LAYOUT;
    }

    private static final long cUnusedBits$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cUnusedBits
     * }
     */
    public static final long cUnusedBits$offset() {
        return cUnusedBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cUnusedBits
     * }
     */
    public static int cUnusedBits(MemorySegment struct) {
        return struct.get(cUnusedBits$LAYOUT, cUnusedBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cUnusedBits
     * }
     */
    public static void cUnusedBits(MemorySegment struct, int fieldValue) {
        struct.set(cUnusedBits$LAYOUT, cUnusedBits$OFFSET, fieldValue);
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
