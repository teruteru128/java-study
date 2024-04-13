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
 * struct _STORAGE_MEDIA_SERIAL_NUMBER_DATA {
 *     WORD Reserved;
 *     WORD SerialNumberLength;
 *     BYTE SerialNumber[0];
 * }
 * }
 */
public class _STORAGE_MEDIA_SERIAL_NUMBER_DATA {

    _STORAGE_MEDIA_SERIAL_NUMBER_DATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("Reserved"),
        Windows_h.C_SHORT.withName("SerialNumberLength"),
        MemoryLayout.sequenceLayout(0, Windows_h.C_CHAR).withName("SerialNumber")
    ).withName("_STORAGE_MEDIA_SERIAL_NUMBER_DATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Reserved$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final OfShort Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static short Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, short fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final OfShort SerialNumberLength$LAYOUT = (OfShort)$LAYOUT.select(groupElement("SerialNumberLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD SerialNumberLength
     * }
     */
    public static final OfShort SerialNumberLength$layout() {
        return SerialNumberLength$LAYOUT;
    }

    private static final long SerialNumberLength$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD SerialNumberLength
     * }
     */
    public static final long SerialNumberLength$offset() {
        return SerialNumberLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD SerialNumberLength
     * }
     */
    public static short SerialNumberLength(MemorySegment struct) {
        return struct.get(SerialNumberLength$LAYOUT, SerialNumberLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD SerialNumberLength
     * }
     */
    public static void SerialNumberLength(MemorySegment struct, short fieldValue) {
        struct.set(SerialNumberLength$LAYOUT, SerialNumberLength$OFFSET, fieldValue);
    }

    private static final SequenceLayout SerialNumber$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("SerialNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE SerialNumber[0]
     * }
     */
    public static final SequenceLayout SerialNumber$layout() {
        return SerialNumber$LAYOUT;
    }

    private static final long SerialNumber$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE SerialNumber[0]
     * }
     */
    public static final long SerialNumber$offset() {
        return SerialNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE SerialNumber[0]
     * }
     */
    public static MemorySegment SerialNumber(MemorySegment struct) {
        return struct.asSlice(SerialNumber$OFFSET, SerialNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE SerialNumber[0]
     * }
     */
    public static void SerialNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SerialNumber$OFFSET, SerialNumber$LAYOUT.byteSize());
    }

    private static long[] SerialNumber$DIMS = { 0 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE SerialNumber[0]
     * }
     */
    public static long[] SerialNumber$dimensions() {
        return SerialNumber$DIMS;
    }
    private static final VarHandle SerialNumber$ELEM_HANDLE = SerialNumber$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE SerialNumber[0]
     * }
     */
    public static byte SerialNumber(MemorySegment struct, long index0) {
        return (byte)SerialNumber$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE SerialNumber[0]
     * }
     */
    public static void SerialNumber(MemorySegment struct, long index0, byte fieldValue) {
        SerialNumber$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
