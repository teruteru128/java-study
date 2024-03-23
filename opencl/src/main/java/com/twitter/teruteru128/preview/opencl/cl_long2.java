// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

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
 * union {
 *     cl_long s[2];
 *     struct {
 *         cl_long x;
 *         cl_long y;
 *     };
 *     struct {
 *         cl_long s0;
 *         cl_long s1;
 *     };
 *     struct {
 *         cl_long lo;
 *         cl_long hi;
 *     };
 *     __cl_long2 v2;
 * }
 * }
 */
public class cl_long2 {

    cl_long2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(2, opencl_h.C_LONG_LONG).withName("s"),
        MemoryLayout.structLayout(
            opencl_h.C_LONG_LONG.withName("x"),
            opencl_h.C_LONG_LONG.withName("y")
        ).withName("$anon$1085:23"),
        MemoryLayout.structLayout(
            opencl_h.C_LONG_LONG.withName("s0"),
            opencl_h.C_LONG_LONG.withName("s1")
        ).withName("$anon$1086:23"),
        MemoryLayout.structLayout(
            opencl_h.C_LONG_LONG.withName("lo"),
            opencl_h.C_LONG_LONG.withName("hi")
        ).withName("$anon$1087:23"),
        MemoryLayout.sequenceLayout(2, opencl_h.C_LONG_LONG).withName("v2")
    ).withName("$anon$1081:9");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout s$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("s"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_long s[2]
     * }
     */
    public static final SequenceLayout s$layout() {
        return s$LAYOUT;
    }

    private static final long s$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_long s[2]
     * }
     */
    public static final long s$offset() {
        return s$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_long s[2]
     * }
     */
    public static MemorySegment s(MemorySegment union) {
        return union.asSlice(s$OFFSET, s$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_long s[2]
     * }
     */
    public static void s(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, s$OFFSET, s$LAYOUT.byteSize());
    }

    private static long[] s$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * cl_long s[2]
     * }
     */
    public static long[] s$dimensions() {
        return s$DIMS;
    }
    private static final VarHandle s$ELEM_HANDLE = s$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * cl_long s[2]
     * }
     */
    public static long s(MemorySegment union, long index0) {
        return (long)s$ELEM_HANDLE.get(union, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * cl_long s[2]
     * }
     */
    public static void s(MemorySegment union, long index0, long fieldValue) {
        s$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
    }

    private static final OfLong x$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$1085:23"), groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_long x
     * }
     */
    public static final OfLong x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_long x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_long x
     * }
     */
    public static long x(MemorySegment union) {
        return union.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_long x
     * }
     */
    public static void x(MemorySegment union, long fieldValue) {
        union.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfLong y$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$1085:23"), groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_long y
     * }
     */
    public static final OfLong y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_long y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_long y
     * }
     */
    public static long y(MemorySegment union) {
        return union.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_long y
     * }
     */
    public static void y(MemorySegment union, long fieldValue) {
        union.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfLong s0$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$1086:23"), groupElement("s0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_long s0
     * }
     */
    public static final OfLong s0$layout() {
        return s0$LAYOUT;
    }

    private static final long s0$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_long s0
     * }
     */
    public static final long s0$offset() {
        return s0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_long s0
     * }
     */
    public static long s0(MemorySegment union) {
        return union.get(s0$LAYOUT, s0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_long s0
     * }
     */
    public static void s0(MemorySegment union, long fieldValue) {
        union.set(s0$LAYOUT, s0$OFFSET, fieldValue);
    }

    private static final OfLong s1$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$1086:23"), groupElement("s1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_long s1
     * }
     */
    public static final OfLong s1$layout() {
        return s1$LAYOUT;
    }

    private static final long s1$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_long s1
     * }
     */
    public static final long s1$offset() {
        return s1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_long s1
     * }
     */
    public static long s1(MemorySegment union) {
        return union.get(s1$LAYOUT, s1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_long s1
     * }
     */
    public static void s1(MemorySegment union, long fieldValue) {
        union.set(s1$LAYOUT, s1$OFFSET, fieldValue);
    }

    private static final OfLong lo$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$1087:23"), groupElement("lo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_long lo
     * }
     */
    public static final OfLong lo$layout() {
        return lo$LAYOUT;
    }

    private static final long lo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_long lo
     * }
     */
    public static final long lo$offset() {
        return lo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_long lo
     * }
     */
    public static long lo(MemorySegment union) {
        return union.get(lo$LAYOUT, lo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_long lo
     * }
     */
    public static void lo(MemorySegment union, long fieldValue) {
        union.set(lo$LAYOUT, lo$OFFSET, fieldValue);
    }

    private static final OfLong hi$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$1087:23"), groupElement("hi"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_long hi
     * }
     */
    public static final OfLong hi$layout() {
        return hi$LAYOUT;
    }

    private static final long hi$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_long hi
     * }
     */
    public static final long hi$offset() {
        return hi$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_long hi
     * }
     */
    public static long hi(MemorySegment union) {
        return union.get(hi$LAYOUT, hi$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_long hi
     * }
     */
    public static void hi(MemorySegment union, long fieldValue) {
        union.set(hi$LAYOUT, hi$OFFSET, fieldValue);
    }

    private static final SequenceLayout v2$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("v2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __cl_long2 v2
     * }
     */
    public static final SequenceLayout v2$layout() {
        return v2$LAYOUT;
    }

    private static final long v2$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __cl_long2 v2
     * }
     */
    public static final long v2$offset() {
        return v2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __cl_long2 v2
     * }
     */
    public static MemorySegment v2(MemorySegment union) {
        return union.asSlice(v2$OFFSET, v2$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __cl_long2 v2
     * }
     */
    public static void v2(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, v2$OFFSET, v2$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
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

