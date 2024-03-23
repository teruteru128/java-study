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
 *     cl_uint s[8];
 *     struct {
 *         cl_uint x;
 *         cl_uint y;
 *         cl_uint z;
 *         cl_uint w;
 *     };
 *     struct {
 *         cl_uint s0;
 *         cl_uint s1;
 *         cl_uint s2;
 *         cl_uint s3;
 *         cl_uint s4;
 *         cl_uint s5;
 *         cl_uint s6;
 *         cl_uint s7;
 *     };
 *     struct {
 *         cl_uint4 lo;
 *         cl_uint4 hi;
 *     };
 *     __cl_uint2 v2[4];
 *     __cl_uint4 v4[2];
 * }
 * }
 */
public class cl_uint8 {

    cl_uint8() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(8, opencl_h.C_INT).withName("s"),
        MemoryLayout.structLayout(
            opencl_h.C_INT.withName("x"),
            opencl_h.C_INT.withName("y"),
            opencl_h.C_INT.withName("z"),
            opencl_h.C_INT.withName("w")
        ).withName("$anon$1043:23"),
        MemoryLayout.structLayout(
            opencl_h.C_INT.withName("s0"),
            opencl_h.C_INT.withName("s1"),
            opencl_h.C_INT.withName("s2"),
            opencl_h.C_INT.withName("s3"),
            opencl_h.C_INT.withName("s4"),
            opencl_h.C_INT.withName("s5"),
            opencl_h.C_INT.withName("s6"),
            opencl_h.C_INT.withName("s7")
        ).withName("$anon$1044:23"),
        MemoryLayout.structLayout(
            cl_uint4.layout().withName("lo"),
            cl_uint4.layout().withName("hi")
        ).withName("$anon$1045:23"),
        MemoryLayout.sequenceLayout(4, MemoryLayout.sequenceLayout(1, opencl_h.C_LONG_LONG)).withName("v2"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(2, opencl_h.C_LONG_LONG)).withName("v4")
    ).withName("$anon$1039:9");

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
     * cl_uint s[8]
     * }
     */
    public static final SequenceLayout s$layout() {
        return s$LAYOUT;
    }

    private static final long s$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint s[8]
     * }
     */
    public static final long s$offset() {
        return s$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint s[8]
     * }
     */
    public static MemorySegment s(MemorySegment union) {
        return union.asSlice(s$OFFSET, s$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint s[8]
     * }
     */
    public static void s(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, s$OFFSET, s$LAYOUT.byteSize());
    }

    private static long[] s$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * cl_uint s[8]
     * }
     */
    public static long[] s$dimensions() {
        return s$DIMS;
    }
    private static final VarHandle s$ELEM_HANDLE = s$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * cl_uint s[8]
     * }
     */
    public static int s(MemorySegment union, long index0) {
        return (int)s$ELEM_HANDLE.get(union, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * cl_uint s[8]
     * }
     */
    public static void s(MemorySegment union, long index0, int fieldValue) {
        s$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1043:23"), groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint x
     * }
     */
    public static int x(MemorySegment union) {
        return union.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint x
     * }
     */
    public static void x(MemorySegment union, int fieldValue) {
        union.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1043:23"), groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint y
     * }
     */
    public static int y(MemorySegment union) {
        return union.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint y
     * }
     */
    public static void y(MemorySegment union, int fieldValue) {
        union.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfInt z$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1043:23"), groupElement("z"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint z
     * }
     */
    public static final OfInt z$layout() {
        return z$LAYOUT;
    }

    private static final long z$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint z
     * }
     */
    public static final long z$offset() {
        return z$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint z
     * }
     */
    public static int z(MemorySegment union) {
        return union.get(z$LAYOUT, z$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint z
     * }
     */
    public static void z(MemorySegment union, int fieldValue) {
        union.set(z$LAYOUT, z$OFFSET, fieldValue);
    }

    private static final OfInt w$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1043:23"), groupElement("w"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint w
     * }
     */
    public static final OfInt w$layout() {
        return w$LAYOUT;
    }

    private static final long w$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint w
     * }
     */
    public static final long w$offset() {
        return w$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint w
     * }
     */
    public static int w(MemorySegment union) {
        return union.get(w$LAYOUT, w$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint w
     * }
     */
    public static void w(MemorySegment union, int fieldValue) {
        union.set(w$LAYOUT, w$OFFSET, fieldValue);
    }

    private static final OfInt s0$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1044:23"), groupElement("s0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint s0
     * }
     */
    public static final OfInt s0$layout() {
        return s0$LAYOUT;
    }

    private static final long s0$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint s0
     * }
     */
    public static final long s0$offset() {
        return s0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint s0
     * }
     */
    public static int s0(MemorySegment union) {
        return union.get(s0$LAYOUT, s0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint s0
     * }
     */
    public static void s0(MemorySegment union, int fieldValue) {
        union.set(s0$LAYOUT, s0$OFFSET, fieldValue);
    }

    private static final OfInt s1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1044:23"), groupElement("s1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint s1
     * }
     */
    public static final OfInt s1$layout() {
        return s1$LAYOUT;
    }

    private static final long s1$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint s1
     * }
     */
    public static final long s1$offset() {
        return s1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint s1
     * }
     */
    public static int s1(MemorySegment union) {
        return union.get(s1$LAYOUT, s1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint s1
     * }
     */
    public static void s1(MemorySegment union, int fieldValue) {
        union.set(s1$LAYOUT, s1$OFFSET, fieldValue);
    }

    private static final OfInt s2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1044:23"), groupElement("s2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint s2
     * }
     */
    public static final OfInt s2$layout() {
        return s2$LAYOUT;
    }

    private static final long s2$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint s2
     * }
     */
    public static final long s2$offset() {
        return s2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint s2
     * }
     */
    public static int s2(MemorySegment union) {
        return union.get(s2$LAYOUT, s2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint s2
     * }
     */
    public static void s2(MemorySegment union, int fieldValue) {
        union.set(s2$LAYOUT, s2$OFFSET, fieldValue);
    }

    private static final OfInt s3$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1044:23"), groupElement("s3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint s3
     * }
     */
    public static final OfInt s3$layout() {
        return s3$LAYOUT;
    }

    private static final long s3$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint s3
     * }
     */
    public static final long s3$offset() {
        return s3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint s3
     * }
     */
    public static int s3(MemorySegment union) {
        return union.get(s3$LAYOUT, s3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint s3
     * }
     */
    public static void s3(MemorySegment union, int fieldValue) {
        union.set(s3$LAYOUT, s3$OFFSET, fieldValue);
    }

    private static final OfInt s4$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1044:23"), groupElement("s4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint s4
     * }
     */
    public static final OfInt s4$layout() {
        return s4$LAYOUT;
    }

    private static final long s4$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint s4
     * }
     */
    public static final long s4$offset() {
        return s4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint s4
     * }
     */
    public static int s4(MemorySegment union) {
        return union.get(s4$LAYOUT, s4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint s4
     * }
     */
    public static void s4(MemorySegment union, int fieldValue) {
        union.set(s4$LAYOUT, s4$OFFSET, fieldValue);
    }

    private static final OfInt s5$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1044:23"), groupElement("s5"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint s5
     * }
     */
    public static final OfInt s5$layout() {
        return s5$LAYOUT;
    }

    private static final long s5$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint s5
     * }
     */
    public static final long s5$offset() {
        return s5$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint s5
     * }
     */
    public static int s5(MemorySegment union) {
        return union.get(s5$LAYOUT, s5$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint s5
     * }
     */
    public static void s5(MemorySegment union, int fieldValue) {
        union.set(s5$LAYOUT, s5$OFFSET, fieldValue);
    }

    private static final OfInt s6$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1044:23"), groupElement("s6"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint s6
     * }
     */
    public static final OfInt s6$layout() {
        return s6$LAYOUT;
    }

    private static final long s6$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint s6
     * }
     */
    public static final long s6$offset() {
        return s6$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint s6
     * }
     */
    public static int s6(MemorySegment union) {
        return union.get(s6$LAYOUT, s6$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint s6
     * }
     */
    public static void s6(MemorySegment union, int fieldValue) {
        union.set(s6$LAYOUT, s6$OFFSET, fieldValue);
    }

    private static final OfInt s7$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1044:23"), groupElement("s7"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint s7
     * }
     */
    public static final OfInt s7$layout() {
        return s7$LAYOUT;
    }

    private static final long s7$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint s7
     * }
     */
    public static final long s7$offset() {
        return s7$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint s7
     * }
     */
    public static int s7(MemorySegment union) {
        return union.get(s7$LAYOUT, s7$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint s7
     * }
     */
    public static void s7(MemorySegment union, int fieldValue) {
        union.set(s7$LAYOUT, s7$OFFSET, fieldValue);
    }

    private static final GroupLayout lo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$1045:23"), groupElement("lo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint4 lo
     * }
     */
    public static final GroupLayout lo$layout() {
        return lo$LAYOUT;
    }

    private static final long lo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint4 lo
     * }
     */
    public static final long lo$offset() {
        return lo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint4 lo
     * }
     */
    public static MemorySegment lo(MemorySegment union) {
        return union.asSlice(lo$OFFSET, lo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint4 lo
     * }
     */
    public static void lo(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, lo$OFFSET, lo$LAYOUT.byteSize());
    }

    private static final GroupLayout hi$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$1045:23"), groupElement("hi"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint4 hi
     * }
     */
    public static final GroupLayout hi$layout() {
        return hi$LAYOUT;
    }

    private static final long hi$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint4 hi
     * }
     */
    public static final long hi$offset() {
        return hi$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint4 hi
     * }
     */
    public static MemorySegment hi(MemorySegment union) {
        return union.asSlice(hi$OFFSET, hi$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint4 hi
     * }
     */
    public static void hi(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, hi$OFFSET, hi$LAYOUT.byteSize());
    }

    private static final SequenceLayout v2$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("v2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __cl_uint2 v2[4]
     * }
     */
    public static final SequenceLayout v2$layout() {
        return v2$LAYOUT;
    }

    private static final long v2$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __cl_uint2 v2[4]
     * }
     */
    public static final long v2$offset() {
        return v2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __cl_uint2 v2[4]
     * }
     */
    public static MemorySegment v2(MemorySegment union) {
        return union.asSlice(v2$OFFSET, v2$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __cl_uint2 v2[4]
     * }
     */
    public static void v2(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, v2$OFFSET, v2$LAYOUT.byteSize());
    }

    private static long[] v2$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __cl_uint2 v2[4]
     * }
     */
    public static long[] v2$dimensions() {
        return v2$DIMS;
    }
    private static final VarHandle v2$ELEM_HANDLE = v2$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __cl_uint2 v2[4]
     * }
     */
    public static MemorySegment v2(MemorySegment union, long index0) {
        return (MemorySegment)v2$ELEM_HANDLE.get(union, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __cl_uint2 v2[4]
     * }
     */
    public static void v2(MemorySegment union, long index0, MemorySegment fieldValue) {
        v2$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
    }

    private static final SequenceLayout v4$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("v4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __cl_uint4 v4[2]
     * }
     */
    public static final SequenceLayout v4$layout() {
        return v4$LAYOUT;
    }

    private static final long v4$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __cl_uint4 v4[2]
     * }
     */
    public static final long v4$offset() {
        return v4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __cl_uint4 v4[2]
     * }
     */
    public static MemorySegment v4(MemorySegment union) {
        return union.asSlice(v4$OFFSET, v4$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __cl_uint4 v4[2]
     * }
     */
    public static void v4(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, v4$OFFSET, v4$LAYOUT.byteSize());
    }

    private static long[] v4$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __cl_uint4 v4[2]
     * }
     */
    public static long[] v4$dimensions() {
        return v4$DIMS;
    }
    private static final VarHandle v4$ELEM_HANDLE = v4$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __cl_uint4 v4[2]
     * }
     */
    public static MemorySegment v4(MemorySegment union, long index0) {
        return (MemorySegment)v4$ELEM_HANDLE.get(union, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __cl_uint4 v4[2]
     * }
     */
    public static void v4(MemorySegment union, long index0, MemorySegment fieldValue) {
        v4$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
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

