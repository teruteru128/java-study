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
 *     cl_half s[4];
 *     struct {
 *         cl_half x;
 *         cl_half y;
 *         cl_half z;
 *         cl_half w;
 *     };
 *     struct {
 *         cl_half s0;
 *         cl_half s1;
 *         cl_half s2;
 *         cl_half s3;
 *     };
 *     struct {
 *         cl_half2 lo;
 *         cl_half2 hi;
 *     };
 * }
 * }
 */
public class cl_half4 {

    cl_half4() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, opencl_h.C_SHORT).withName("s"),
        MemoryLayout.structLayout(
            opencl_h.C_SHORT.withName("x"),
            opencl_h.C_SHORT.withName("y"),
            opencl_h.C_SHORT.withName("z"),
            opencl_h.C_SHORT.withName("w")
        ).withName("$anon$875:24"),
        MemoryLayout.structLayout(
            opencl_h.C_SHORT.withName("s0"),
            opencl_h.C_SHORT.withName("s1"),
            opencl_h.C_SHORT.withName("s2"),
            opencl_h.C_SHORT.withName("s3")
        ).withName("$anon$876:24"),
        MemoryLayout.structLayout(
            cl_half2.layout().withName("lo"),
            cl_half2.layout().withName("hi")
        ).withName("$anon$877:24")
    ).withName("$anon$871:9");

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
     * cl_half s[4]
     * }
     */
    public static final SequenceLayout s$layout() {
        return s$LAYOUT;
    }

    private static final long s$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half s[4]
     * }
     */
    public static final long s$offset() {
        return s$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half s[4]
     * }
     */
    public static MemorySegment s(MemorySegment union) {
        return union.asSlice(s$OFFSET, s$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half s[4]
     * }
     */
    public static void s(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, s$OFFSET, s$LAYOUT.byteSize());
    }

    private static long[] s$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * cl_half s[4]
     * }
     */
    public static long[] s$dimensions() {
        return s$DIMS;
    }
    private static final VarHandle s$ELEM_HANDLE = s$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * cl_half s[4]
     * }
     */
    public static short s(MemorySegment union, long index0) {
        return (short)s$ELEM_HANDLE.get(union, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * cl_half s[4]
     * }
     */
    public static void s(MemorySegment union, long index0, short fieldValue) {
        s$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
    }

    private static final OfShort x$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$875:24"), groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_half x
     * }
     */
    public static final OfShort x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half x
     * }
     */
    public static short x(MemorySegment union) {
        return union.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half x
     * }
     */
    public static void x(MemorySegment union, short fieldValue) {
        union.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfShort y$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$875:24"), groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_half y
     * }
     */
    public static final OfShort y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half y
     * }
     */
    public static short y(MemorySegment union) {
        return union.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half y
     * }
     */
    public static void y(MemorySegment union, short fieldValue) {
        union.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfShort z$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$875:24"), groupElement("z"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_half z
     * }
     */
    public static final OfShort z$layout() {
        return z$LAYOUT;
    }

    private static final long z$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half z
     * }
     */
    public static final long z$offset() {
        return z$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half z
     * }
     */
    public static short z(MemorySegment union) {
        return union.get(z$LAYOUT, z$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half z
     * }
     */
    public static void z(MemorySegment union, short fieldValue) {
        union.set(z$LAYOUT, z$OFFSET, fieldValue);
    }

    private static final OfShort w$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$875:24"), groupElement("w"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_half w
     * }
     */
    public static final OfShort w$layout() {
        return w$LAYOUT;
    }

    private static final long w$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half w
     * }
     */
    public static final long w$offset() {
        return w$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half w
     * }
     */
    public static short w(MemorySegment union) {
        return union.get(w$LAYOUT, w$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half w
     * }
     */
    public static void w(MemorySegment union, short fieldValue) {
        union.set(w$LAYOUT, w$OFFSET, fieldValue);
    }

    private static final OfShort s0$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$876:24"), groupElement("s0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_half s0
     * }
     */
    public static final OfShort s0$layout() {
        return s0$LAYOUT;
    }

    private static final long s0$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half s0
     * }
     */
    public static final long s0$offset() {
        return s0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half s0
     * }
     */
    public static short s0(MemorySegment union) {
        return union.get(s0$LAYOUT, s0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half s0
     * }
     */
    public static void s0(MemorySegment union, short fieldValue) {
        union.set(s0$LAYOUT, s0$OFFSET, fieldValue);
    }

    private static final OfShort s1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$876:24"), groupElement("s1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_half s1
     * }
     */
    public static final OfShort s1$layout() {
        return s1$LAYOUT;
    }

    private static final long s1$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half s1
     * }
     */
    public static final long s1$offset() {
        return s1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half s1
     * }
     */
    public static short s1(MemorySegment union) {
        return union.get(s1$LAYOUT, s1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half s1
     * }
     */
    public static void s1(MemorySegment union, short fieldValue) {
        union.set(s1$LAYOUT, s1$OFFSET, fieldValue);
    }

    private static final OfShort s2$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$876:24"), groupElement("s2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_half s2
     * }
     */
    public static final OfShort s2$layout() {
        return s2$LAYOUT;
    }

    private static final long s2$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half s2
     * }
     */
    public static final long s2$offset() {
        return s2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half s2
     * }
     */
    public static short s2(MemorySegment union) {
        return union.get(s2$LAYOUT, s2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half s2
     * }
     */
    public static void s2(MemorySegment union, short fieldValue) {
        union.set(s2$LAYOUT, s2$OFFSET, fieldValue);
    }

    private static final OfShort s3$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$876:24"), groupElement("s3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_half s3
     * }
     */
    public static final OfShort s3$layout() {
        return s3$LAYOUT;
    }

    private static final long s3$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half s3
     * }
     */
    public static final long s3$offset() {
        return s3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half s3
     * }
     */
    public static short s3(MemorySegment union) {
        return union.get(s3$LAYOUT, s3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half s3
     * }
     */
    public static void s3(MemorySegment union, short fieldValue) {
        union.set(s3$LAYOUT, s3$OFFSET, fieldValue);
    }

    private static final GroupLayout lo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$877:24"), groupElement("lo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_half2 lo
     * }
     */
    public static final GroupLayout lo$layout() {
        return lo$LAYOUT;
    }

    private static final long lo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half2 lo
     * }
     */
    public static final long lo$offset() {
        return lo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half2 lo
     * }
     */
    public static MemorySegment lo(MemorySegment union) {
        return union.asSlice(lo$OFFSET, lo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half2 lo
     * }
     */
    public static void lo(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, lo$OFFSET, lo$LAYOUT.byteSize());
    }

    private static final GroupLayout hi$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$877:24"), groupElement("hi"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_half2 hi
     * }
     */
    public static final GroupLayout hi$layout() {
        return hi$LAYOUT;
    }

    private static final long hi$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_half2 hi
     * }
     */
    public static final long hi$offset() {
        return hi$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_half2 hi
     * }
     */
    public static MemorySegment hi(MemorySegment union) {
        return union.asSlice(hi$OFFSET, hi$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_half2 hi
     * }
     */
    public static void hi(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, hi$OFFSET, hi$LAYOUT.byteSize());
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

