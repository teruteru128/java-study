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
 *     cl_long s[8];
 *     struct {
 *         cl_long x;
 *         cl_long y;
 *         cl_long z;
 *         cl_long w;
 *     };
 *     struct {
 *         cl_long s0;
 *         cl_long s1;
 *         cl_long s2;
 *         cl_long s3;
 *         cl_long s4;
 *         cl_long s5;
 *         cl_long s6;
 *         cl_long s7;
 *     };
 *     struct {
 *         cl_long4 lo;
 *         cl_long4 hi;
 *     };
 *     __cl_long2 v2[4];
 * };
 * }
 */
public class cl_long8 {

    public static MemoryLayout $LAYOUT() {
        return constants$135.const$0;
    }
    public static MemorySegment s$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    public static VarHandle x$VH() {
        return constants$135.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long x;
     * }
     */
    public static long x$get(MemorySegment seg) {
        return (long)constants$135.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long x;
     * }
     */
    public static void x$set(MemorySegment seg, long x) {
        constants$135.const$1.set(seg, x);
    }
    public static long x$get(MemorySegment seg, long index) {
        return (long)constants$135.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, long x) {
        constants$135.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$135.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long y;
     * }
     */
    public static long y$get(MemorySegment seg) {
        return (long)constants$135.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long y;
     * }
     */
    public static void y$set(MemorySegment seg, long x) {
        constants$135.const$2.set(seg, x);
    }
    public static long y$get(MemorySegment seg, long index) {
        return (long)constants$135.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, long x) {
        constants$135.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle z$VH() {
        return constants$135.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long z;
     * }
     */
    public static long z$get(MemorySegment seg) {
        return (long)constants$135.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long z;
     * }
     */
    public static void z$set(MemorySegment seg, long x) {
        constants$135.const$3.set(seg, x);
    }
    public static long z$get(MemorySegment seg, long index) {
        return (long)constants$135.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void z$set(MemorySegment seg, long index, long x) {
        constants$135.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle w$VH() {
        return constants$135.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long w;
     * }
     */
    public static long w$get(MemorySegment seg) {
        return (long)constants$135.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long w;
     * }
     */
    public static void w$set(MemorySegment seg, long x) {
        constants$135.const$4.set(seg, x);
    }
    public static long w$get(MemorySegment seg, long index) {
        return (long)constants$135.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void w$set(MemorySegment seg, long index, long x) {
        constants$135.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s0$VH() {
        return constants$135.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long s0;
     * }
     */
    public static long s0$get(MemorySegment seg) {
        return (long)constants$135.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long s0;
     * }
     */
    public static void s0$set(MemorySegment seg, long x) {
        constants$135.const$5.set(seg, x);
    }
    public static long s0$get(MemorySegment seg, long index) {
        return (long)constants$135.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void s0$set(MemorySegment seg, long index, long x) {
        constants$135.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s1$VH() {
        return constants$136.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long s1;
     * }
     */
    public static long s1$get(MemorySegment seg) {
        return (long)constants$136.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long s1;
     * }
     */
    public static void s1$set(MemorySegment seg, long x) {
        constants$136.const$0.set(seg, x);
    }
    public static long s1$get(MemorySegment seg, long index) {
        return (long)constants$136.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void s1$set(MemorySegment seg, long index, long x) {
        constants$136.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s2$VH() {
        return constants$136.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long s2;
     * }
     */
    public static long s2$get(MemorySegment seg) {
        return (long)constants$136.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long s2;
     * }
     */
    public static void s2$set(MemorySegment seg, long x) {
        constants$136.const$1.set(seg, x);
    }
    public static long s2$get(MemorySegment seg, long index) {
        return (long)constants$136.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void s2$set(MemorySegment seg, long index, long x) {
        constants$136.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s3$VH() {
        return constants$136.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long s3;
     * }
     */
    public static long s3$get(MemorySegment seg) {
        return (long)constants$136.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long s3;
     * }
     */
    public static void s3$set(MemorySegment seg, long x) {
        constants$136.const$2.set(seg, x);
    }
    public static long s3$get(MemorySegment seg, long index) {
        return (long)constants$136.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void s3$set(MemorySegment seg, long index, long x) {
        constants$136.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s4$VH() {
        return constants$136.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long s4;
     * }
     */
    public static long s4$get(MemorySegment seg) {
        return (long)constants$136.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long s4;
     * }
     */
    public static void s4$set(MemorySegment seg, long x) {
        constants$136.const$3.set(seg, x);
    }
    public static long s4$get(MemorySegment seg, long index) {
        return (long)constants$136.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void s4$set(MemorySegment seg, long index, long x) {
        constants$136.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s5$VH() {
        return constants$136.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long s5;
     * }
     */
    public static long s5$get(MemorySegment seg) {
        return (long)constants$136.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long s5;
     * }
     */
    public static void s5$set(MemorySegment seg, long x) {
        constants$136.const$4.set(seg, x);
    }
    public static long s5$get(MemorySegment seg, long index) {
        return (long)constants$136.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void s5$set(MemorySegment seg, long index, long x) {
        constants$136.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s6$VH() {
        return constants$136.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long s6;
     * }
     */
    public static long s6$get(MemorySegment seg) {
        return (long)constants$136.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long s6;
     * }
     */
    public static void s6$set(MemorySegment seg, long x) {
        constants$136.const$5.set(seg, x);
    }
    public static long s6$get(MemorySegment seg, long index) {
        return (long)constants$136.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void s6$set(MemorySegment seg, long index, long x) {
        constants$136.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s7$VH() {
        return constants$137.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_long s7;
     * }
     */
    public static long s7$get(MemorySegment seg) {
        return (long)constants$137.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_long s7;
     * }
     */
    public static void s7$set(MemorySegment seg, long x) {
        constants$137.const$0.set(seg, x);
    }
    public static long s7$get(MemorySegment seg, long index) {
        return (long)constants$137.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void s7$set(MemorySegment seg, long index, long x) {
        constants$137.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lo$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static MemorySegment hi$slice(MemorySegment seg) {
        return seg.asSlice(32, 32);
    }
    public static MemorySegment v2$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


