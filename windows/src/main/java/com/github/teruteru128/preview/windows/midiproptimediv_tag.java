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
 * struct midiproptimediv_tag {
 *     DWORD cbStruct;
 *     DWORD dwTimeDiv;
 * }
 * }
 */
public class midiproptimediv_tag {

    midiproptimediv_tag() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_LONG, 1).withName("cbStruct"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwTimeDiv")
    ).withName("midiproptimediv_tag");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbStruct$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbStruct"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbStruct
     * }
     */
    public static final OfInt cbStruct$layout() {
        return cbStruct$LAYOUT;
    }

    private static final long cbStruct$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbStruct
     * }
     */
    public static final long cbStruct$offset() {
        return cbStruct$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbStruct
     * }
     */
    public static int cbStruct(MemorySegment struct) {
        return struct.get(cbStruct$LAYOUT, cbStruct$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbStruct
     * }
     */
    public static void cbStruct(MemorySegment struct, int fieldValue) {
        struct.set(cbStruct$LAYOUT, cbStruct$OFFSET, fieldValue);
    }

    private static final OfInt dwTimeDiv$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwTimeDiv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwTimeDiv
     * }
     */
    public static final OfInt dwTimeDiv$layout() {
        return dwTimeDiv$LAYOUT;
    }

    private static final long dwTimeDiv$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwTimeDiv
     * }
     */
    public static final long dwTimeDiv$offset() {
        return dwTimeDiv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwTimeDiv
     * }
     */
    public static int dwTimeDiv(MemorySegment struct) {
        return struct.get(dwTimeDiv$LAYOUT, dwTimeDiv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwTimeDiv
     * }
     */
    public static void dwTimeDiv(MemorySegment struct, int fieldValue) {
        struct.set(dwTimeDiv$LAYOUT, dwTimeDiv$OFFSET, fieldValue);
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
