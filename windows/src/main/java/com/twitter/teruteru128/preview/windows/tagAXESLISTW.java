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
 * struct tagAXESLISTW {
 *     DWORD axlReserved;
 *     DWORD axlNumAxes;
 *     AXISINFOW axlAxisInfo[16];
 * }
 * }
 */
public class tagAXESLISTW {

    tagAXESLISTW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("axlReserved"),
        Windows_h.C_LONG.withName("axlNumAxes"),
        MemoryLayout.sequenceLayout(16, tagAXISINFOW.layout()).withName("axlAxisInfo")
    ).withName("tagAXESLISTW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt axlReserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("axlReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD axlReserved
     * }
     */
    public static final OfInt axlReserved$layout() {
        return axlReserved$LAYOUT;
    }

    private static final long axlReserved$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD axlReserved
     * }
     */
    public static final long axlReserved$offset() {
        return axlReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD axlReserved
     * }
     */
    public static int axlReserved(MemorySegment struct) {
        return struct.get(axlReserved$LAYOUT, axlReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD axlReserved
     * }
     */
    public static void axlReserved(MemorySegment struct, int fieldValue) {
        struct.set(axlReserved$LAYOUT, axlReserved$OFFSET, fieldValue);
    }

    private static final OfInt axlNumAxes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("axlNumAxes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD axlNumAxes
     * }
     */
    public static final OfInt axlNumAxes$layout() {
        return axlNumAxes$LAYOUT;
    }

    private static final long axlNumAxes$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD axlNumAxes
     * }
     */
    public static final long axlNumAxes$offset() {
        return axlNumAxes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD axlNumAxes
     * }
     */
    public static int axlNumAxes(MemorySegment struct) {
        return struct.get(axlNumAxes$LAYOUT, axlNumAxes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD axlNumAxes
     * }
     */
    public static void axlNumAxes(MemorySegment struct, int fieldValue) {
        struct.set(axlNumAxes$LAYOUT, axlNumAxes$OFFSET, fieldValue);
    }

    private static final SequenceLayout axlAxisInfo$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("axlAxisInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AXISINFOW axlAxisInfo[16]
     * }
     */
    public static final SequenceLayout axlAxisInfo$layout() {
        return axlAxisInfo$LAYOUT;
    }

    private static final long axlAxisInfo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AXISINFOW axlAxisInfo[16]
     * }
     */
    public static final long axlAxisInfo$offset() {
        return axlAxisInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AXISINFOW axlAxisInfo[16]
     * }
     */
    public static MemorySegment axlAxisInfo(MemorySegment struct) {
        return struct.asSlice(axlAxisInfo$OFFSET, axlAxisInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AXISINFOW axlAxisInfo[16]
     * }
     */
    public static void axlAxisInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, axlAxisInfo$OFFSET, axlAxisInfo$LAYOUT.byteSize());
    }

    private static long[] axlAxisInfo$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * AXISINFOW axlAxisInfo[16]
     * }
     */
    public static long[] axlAxisInfo$dimensions() {
        return axlAxisInfo$DIMS;
    }
    private static final MethodHandle axlAxisInfo$ELEM_HANDLE = axlAxisInfo$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * AXISINFOW axlAxisInfo[16]
     * }
     */
    public static MemorySegment axlAxisInfo(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)axlAxisInfo$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * AXISINFOW axlAxisInfo[16]
     * }
     */
    public static void axlAxisInfo(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, axlAxisInfo(struct, index0), 0L, tagAXISINFOW.layout().byteSize());
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

