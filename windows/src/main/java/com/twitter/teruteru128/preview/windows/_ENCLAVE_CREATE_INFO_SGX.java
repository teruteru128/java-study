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
 * struct _ENCLAVE_CREATE_INFO_SGX {
 *     BYTE Secs[4096];
 * }
 * }
 */
public class _ENCLAVE_CREATE_INFO_SGX {

    _ENCLAVE_CREATE_INFO_SGX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4096, Windows_h.C_CHAR).withName("Secs")
    ).withName("_ENCLAVE_CREATE_INFO_SGX");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout Secs$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Secs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Secs[4096]
     * }
     */
    public static final SequenceLayout Secs$layout() {
        return Secs$LAYOUT;
    }

    private static final long Secs$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Secs[4096]
     * }
     */
    public static final long Secs$offset() {
        return Secs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Secs[4096]
     * }
     */
    public static MemorySegment Secs(MemorySegment struct) {
        return struct.asSlice(Secs$OFFSET, Secs$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Secs[4096]
     * }
     */
    public static void Secs(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Secs$OFFSET, Secs$LAYOUT.byteSize());
    }

    private static long[] Secs$DIMS = { 4096 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Secs[4096]
     * }
     */
    public static long[] Secs$dimensions() {
        return Secs$DIMS;
    }
    private static final VarHandle Secs$ELEM_HANDLE = Secs$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Secs[4096]
     * }
     */
    public static byte Secs(MemorySegment struct, long index0) {
        return (byte)Secs$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Secs[4096]
     * }
     */
    public static void Secs(MemorySegment struct, long index0, byte fieldValue) {
        Secs$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

