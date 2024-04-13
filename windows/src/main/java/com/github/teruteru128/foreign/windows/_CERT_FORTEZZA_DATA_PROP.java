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
 * struct _CERT_FORTEZZA_DATA_PROP {
 *     unsigned char SerialNumber[8];
 *     int CertIndex;
 *     unsigned char CertLabel[36];
 * }
 * }
 */
public class _CERT_FORTEZZA_DATA_PROP {

    _CERT_FORTEZZA_DATA_PROP() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(8, Windows_h.C_CHAR).withName("SerialNumber"),
        Windows_h.C_INT.withName("CertIndex"),
        MemoryLayout.sequenceLayout(36, Windows_h.C_CHAR).withName("CertLabel")
    ).withName("_CERT_FORTEZZA_DATA_PROP");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout SerialNumber$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("SerialNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char SerialNumber[8]
     * }
     */
    public static final SequenceLayout SerialNumber$layout() {
        return SerialNumber$LAYOUT;
    }

    private static final long SerialNumber$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char SerialNumber[8]
     * }
     */
    public static final long SerialNumber$offset() {
        return SerialNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char SerialNumber[8]
     * }
     */
    public static MemorySegment SerialNumber(MemorySegment struct) {
        return struct.asSlice(SerialNumber$OFFSET, SerialNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char SerialNumber[8]
     * }
     */
    public static void SerialNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SerialNumber$OFFSET, SerialNumber$LAYOUT.byteSize());
    }

    private static long[] SerialNumber$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char SerialNumber[8]
     * }
     */
    public static long[] SerialNumber$dimensions() {
        return SerialNumber$DIMS;
    }
    private static final VarHandle SerialNumber$ELEM_HANDLE = SerialNumber$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char SerialNumber[8]
     * }
     */
    public static byte SerialNumber(MemorySegment struct, long index0) {
        return (byte)SerialNumber$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char SerialNumber[8]
     * }
     */
    public static void SerialNumber(MemorySegment struct, long index0, byte fieldValue) {
        SerialNumber$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt CertIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CertIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int CertIndex
     * }
     */
    public static final OfInt CertIndex$layout() {
        return CertIndex$LAYOUT;
    }

    private static final long CertIndex$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int CertIndex
     * }
     */
    public static final long CertIndex$offset() {
        return CertIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int CertIndex
     * }
     */
    public static int CertIndex(MemorySegment struct) {
        return struct.get(CertIndex$LAYOUT, CertIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int CertIndex
     * }
     */
    public static void CertIndex(MemorySegment struct, int fieldValue) {
        struct.set(CertIndex$LAYOUT, CertIndex$OFFSET, fieldValue);
    }

    private static final SequenceLayout CertLabel$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("CertLabel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char CertLabel[36]
     * }
     */
    public static final SequenceLayout CertLabel$layout() {
        return CertLabel$LAYOUT;
    }

    private static final long CertLabel$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char CertLabel[36]
     * }
     */
    public static final long CertLabel$offset() {
        return CertLabel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char CertLabel[36]
     * }
     */
    public static MemorySegment CertLabel(MemorySegment struct) {
        return struct.asSlice(CertLabel$OFFSET, CertLabel$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char CertLabel[36]
     * }
     */
    public static void CertLabel(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CertLabel$OFFSET, CertLabel$LAYOUT.byteSize());
    }

    private static long[] CertLabel$DIMS = { 36 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char CertLabel[36]
     * }
     */
    public static long[] CertLabel$dimensions() {
        return CertLabel$DIMS;
    }
    private static final VarHandle CertLabel$ELEM_HANDLE = CertLabel$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char CertLabel[36]
     * }
     */
    public static byte CertLabel(MemorySegment struct, long index0) {
        return (byte)CertLabel$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char CertLabel[36]
     * }
     */
    public static void CertLabel(MemorySegment struct, long index0, byte fieldValue) {
        CertLabel$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
