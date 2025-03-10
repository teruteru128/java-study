// Generated by jextract

package com.github.teruteru128.gmp;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     __mpz_struct _mp_num;
 *     __mpz_struct _mp_den;
 * }
 * }
 */
public class __mpq_struct {

    __mpq_struct() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        __mpz_struct.layout().withName("_mp_num"),
        __mpz_struct.layout().withName("_mp_den")
    ).withName("$anon$180:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout _mp_num$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("_mp_num"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __mpz_struct _mp_num
     * }
     */
    public static final GroupLayout _mp_num$layout() {
        return _mp_num$LAYOUT;
    }

    private static final long _mp_num$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __mpz_struct _mp_num
     * }
     */
    public static final long _mp_num$offset() {
        return _mp_num$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __mpz_struct _mp_num
     * }
     */
    public static MemorySegment _mp_num(MemorySegment struct) {
        return struct.asSlice(_mp_num$OFFSET, _mp_num$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __mpz_struct _mp_num
     * }
     */
    public static void _mp_num(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _mp_num$OFFSET, _mp_num$LAYOUT.byteSize());
    }

    private static final GroupLayout _mp_den$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("_mp_den"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __mpz_struct _mp_den
     * }
     */
    public static final GroupLayout _mp_den$layout() {
        return _mp_den$LAYOUT;
    }

    private static final long _mp_den$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __mpz_struct _mp_den
     * }
     */
    public static final long _mp_den$offset() {
        return _mp_den$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __mpz_struct _mp_den
     * }
     */
    public static MemorySegment _mp_den(MemorySegment struct) {
        return struct.asSlice(_mp_den$OFFSET, _mp_den$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __mpz_struct _mp_den
     * }
     */
    public static void _mp_den(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _mp_den$OFFSET, _mp_den$LAYOUT.byteSize());
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

