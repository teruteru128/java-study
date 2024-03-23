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
 * struct _SCARD_T0_REQUEST {
 *     SCARD_IO_REQUEST ioRequest;
 *     BYTE bSw1;
 *     BYTE bSw2;
 *     union {
 *         SCARD_T0_COMMAND CmdBytes;
 *         BYTE rgbHeader[5];
 *     };
 * }
 * }
 */
public class _SCARD_T0_REQUEST {

    _SCARD_T0_REQUEST() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _SCARD_IO_REQUEST.layout().withName("ioRequest"),
        Windows_h.C_CHAR.withName("bSw1"),
        Windows_h.C_CHAR.withName("bSw2"),
        MemoryLayout.unionLayout(
            _SCARD_T0_COMMAND.layout().withName("CmdBytes"),
            MemoryLayout.sequenceLayout(5, Windows_h.C_CHAR).withName("rgbHeader")
        ).withName("$anon$297:5"),
        MemoryLayout.paddingLayout(1)
    ).withName("_SCARD_T0_REQUEST");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout ioRequest$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ioRequest"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SCARD_IO_REQUEST ioRequest
     * }
     */
    public static final GroupLayout ioRequest$layout() {
        return ioRequest$LAYOUT;
    }

    private static final long ioRequest$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SCARD_IO_REQUEST ioRequest
     * }
     */
    public static final long ioRequest$offset() {
        return ioRequest$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SCARD_IO_REQUEST ioRequest
     * }
     */
    public static MemorySegment ioRequest(MemorySegment struct) {
        return struct.asSlice(ioRequest$OFFSET, ioRequest$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SCARD_IO_REQUEST ioRequest
     * }
     */
    public static void ioRequest(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ioRequest$OFFSET, ioRequest$LAYOUT.byteSize());
    }

    private static final OfByte bSw1$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bSw1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE bSw1
     * }
     */
    public static final OfByte bSw1$layout() {
        return bSw1$LAYOUT;
    }

    private static final long bSw1$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE bSw1
     * }
     */
    public static final long bSw1$offset() {
        return bSw1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE bSw1
     * }
     */
    public static byte bSw1(MemorySegment struct) {
        return struct.get(bSw1$LAYOUT, bSw1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE bSw1
     * }
     */
    public static void bSw1(MemorySegment struct, byte fieldValue) {
        struct.set(bSw1$LAYOUT, bSw1$OFFSET, fieldValue);
    }

    private static final OfByte bSw2$LAYOUT = (OfByte)$LAYOUT.select(groupElement("bSw2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE bSw2
     * }
     */
    public static final OfByte bSw2$layout() {
        return bSw2$LAYOUT;
    }

    private static final long bSw2$OFFSET = 9;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE bSw2
     * }
     */
    public static final long bSw2$offset() {
        return bSw2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE bSw2
     * }
     */
    public static byte bSw2(MemorySegment struct) {
        return struct.get(bSw2$LAYOUT, bSw2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE bSw2
     * }
     */
    public static void bSw2(MemorySegment struct, byte fieldValue) {
        struct.set(bSw2$LAYOUT, bSw2$OFFSET, fieldValue);
    }

    private static final GroupLayout CmdBytes$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$297:5"), groupElement("CmdBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SCARD_T0_COMMAND CmdBytes
     * }
     */
    public static final GroupLayout CmdBytes$layout() {
        return CmdBytes$LAYOUT;
    }

    private static final long CmdBytes$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SCARD_T0_COMMAND CmdBytes
     * }
     */
    public static final long CmdBytes$offset() {
        return CmdBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SCARD_T0_COMMAND CmdBytes
     * }
     */
    public static MemorySegment CmdBytes(MemorySegment struct) {
        return struct.asSlice(CmdBytes$OFFSET, CmdBytes$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SCARD_T0_COMMAND CmdBytes
     * }
     */
    public static void CmdBytes(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CmdBytes$OFFSET, CmdBytes$LAYOUT.byteSize());
    }

    private static final SequenceLayout rgbHeader$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("$anon$297:5"), groupElement("rgbHeader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE rgbHeader[5]
     * }
     */
    public static final SequenceLayout rgbHeader$layout() {
        return rgbHeader$LAYOUT;
    }

    private static final long rgbHeader$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE rgbHeader[5]
     * }
     */
    public static final long rgbHeader$offset() {
        return rgbHeader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE rgbHeader[5]
     * }
     */
    public static MemorySegment rgbHeader(MemorySegment struct) {
        return struct.asSlice(rgbHeader$OFFSET, rgbHeader$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE rgbHeader[5]
     * }
     */
    public static void rgbHeader(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rgbHeader$OFFSET, rgbHeader$LAYOUT.byteSize());
    }

    private static long[] rgbHeader$DIMS = { 5 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE rgbHeader[5]
     * }
     */
    public static long[] rgbHeader$dimensions() {
        return rgbHeader$DIMS;
    }
    private static final VarHandle rgbHeader$ELEM_HANDLE = rgbHeader$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE rgbHeader[5]
     * }
     */
    public static byte rgbHeader(MemorySegment struct, long index0) {
        return (byte)rgbHeader$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE rgbHeader[5]
     * }
     */
    public static void rgbHeader(MemorySegment struct, long index0, byte fieldValue) {
        rgbHeader$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

