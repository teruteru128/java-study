// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union {
 *     cl_uint s[4];
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
 *     };
 *     struct {
 *         cl_uint2 lo;
 *         cl_uint2 hi;
 *     };
 *     __cl_uint2 v2[2];
 *     __cl_uint4 v4;
 * };
 * }
 */
public class cl_uint4 {

    public static MemoryLayout $LAYOUT() {
        return constants$113.const$3;
    }
    public static MemorySegment s$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static VarHandle x$VH() {
        return constants$123.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_uint x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$123.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_uint x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$123.const$4.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$123.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$123.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$123.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_uint y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$123.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_uint y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$123.const$5.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$123.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$123.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle z$VH() {
        return constants$124.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_uint z;
     * }
     */
    public static int z$get(MemorySegment seg) {
        return (int)constants$124.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_uint z;
     * }
     */
    public static void z$set(MemorySegment seg, int x) {
        constants$124.const$0.set(seg, x);
    }
    public static int z$get(MemorySegment seg, long index) {
        return (int)constants$124.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void z$set(MemorySegment seg, long index, int x) {
        constants$124.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle w$VH() {
        return constants$124.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_uint w;
     * }
     */
    public static int w$get(MemorySegment seg) {
        return (int)constants$124.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_uint w;
     * }
     */
    public static void w$set(MemorySegment seg, int x) {
        constants$124.const$1.set(seg, x);
    }
    public static int w$get(MemorySegment seg, long index) {
        return (int)constants$124.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void w$set(MemorySegment seg, long index, int x) {
        constants$124.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s0$VH() {
        return constants$124.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_uint s0;
     * }
     */
    public static int s0$get(MemorySegment seg) {
        return (int)constants$124.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_uint s0;
     * }
     */
    public static void s0$set(MemorySegment seg, int x) {
        constants$124.const$2.set(seg, x);
    }
    public static int s0$get(MemorySegment seg, long index) {
        return (int)constants$124.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void s0$set(MemorySegment seg, long index, int x) {
        constants$124.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s1$VH() {
        return constants$124.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_uint s1;
     * }
     */
    public static int s1$get(MemorySegment seg) {
        return (int)constants$124.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_uint s1;
     * }
     */
    public static void s1$set(MemorySegment seg, int x) {
        constants$124.const$3.set(seg, x);
    }
    public static int s1$get(MemorySegment seg, long index) {
        return (int)constants$124.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void s1$set(MemorySegment seg, long index, int x) {
        constants$124.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s2$VH() {
        return constants$124.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_uint s2;
     * }
     */
    public static int s2$get(MemorySegment seg) {
        return (int)constants$124.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_uint s2;
     * }
     */
    public static void s2$set(MemorySegment seg, int x) {
        constants$124.const$4.set(seg, x);
    }
    public static int s2$get(MemorySegment seg, long index) {
        return (int)constants$124.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void s2$set(MemorySegment seg, long index, int x) {
        constants$124.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s3$VH() {
        return constants$124.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_uint s3;
     * }
     */
    public static int s3$get(MemorySegment seg) {
        return (int)constants$124.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_uint s3;
     * }
     */
    public static void s3$set(MemorySegment seg, int x) {
        constants$124.const$5.set(seg, x);
    }
    public static int s3$get(MemorySegment seg, long index) {
        return (int)constants$124.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void s3$set(MemorySegment seg, long index, int x) {
        constants$124.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lo$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment hi$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment v2$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment v4$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

