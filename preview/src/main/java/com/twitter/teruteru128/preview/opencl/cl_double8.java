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
 *     cl_double s[8];
 *     struct {
 *         cl_double x;
 *         cl_double y;
 *         cl_double z;
 *         cl_double w;
 *     };
 *     struct {
 *         cl_double s0;
 *         cl_double s1;
 *         cl_double s2;
 *         cl_double s3;
 *         cl_double s4;
 *         cl_double s5;
 *         cl_double s6;
 *         cl_double s7;
 *     };
 *     struct {
 *         cl_double4 lo;
 *         cl_double4 hi;
 *     };
 *     __cl_double2 v2[4];
 * };
 * }
 */
public class cl_double8 {

    public static MemoryLayout $LAYOUT() {
        return constants$165.const$2;
    }
    public static MemorySegment s$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    public static VarHandle x$VH() {
        return constants$165.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double x;
     * }
     */
    public static double x$get(MemorySegment seg) {
        return (double)constants$165.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double x;
     * }
     */
    public static void x$set(MemorySegment seg, double x) {
        constants$165.const$3.set(seg, x);
    }
    public static double x$get(MemorySegment seg, long index) {
        return (double)constants$165.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, double x) {
        constants$165.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$165.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double y;
     * }
     */
    public static double y$get(MemorySegment seg) {
        return (double)constants$165.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double y;
     * }
     */
    public static void y$set(MemorySegment seg, double x) {
        constants$165.const$4.set(seg, x);
    }
    public static double y$get(MemorySegment seg, long index) {
        return (double)constants$165.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, double x) {
        constants$165.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle z$VH() {
        return constants$165.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double z;
     * }
     */
    public static double z$get(MemorySegment seg) {
        return (double)constants$165.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double z;
     * }
     */
    public static void z$set(MemorySegment seg, double x) {
        constants$165.const$5.set(seg, x);
    }
    public static double z$get(MemorySegment seg, long index) {
        return (double)constants$165.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void z$set(MemorySegment seg, long index, double x) {
        constants$165.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle w$VH() {
        return constants$166.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double w;
     * }
     */
    public static double w$get(MemorySegment seg) {
        return (double)constants$166.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double w;
     * }
     */
    public static void w$set(MemorySegment seg, double x) {
        constants$166.const$0.set(seg, x);
    }
    public static double w$get(MemorySegment seg, long index) {
        return (double)constants$166.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void w$set(MemorySegment seg, long index, double x) {
        constants$166.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s0$VH() {
        return constants$166.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double s0;
     * }
     */
    public static double s0$get(MemorySegment seg) {
        return (double)constants$166.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double s0;
     * }
     */
    public static void s0$set(MemorySegment seg, double x) {
        constants$166.const$1.set(seg, x);
    }
    public static double s0$get(MemorySegment seg, long index) {
        return (double)constants$166.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void s0$set(MemorySegment seg, long index, double x) {
        constants$166.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s1$VH() {
        return constants$166.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double s1;
     * }
     */
    public static double s1$get(MemorySegment seg) {
        return (double)constants$166.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double s1;
     * }
     */
    public static void s1$set(MemorySegment seg, double x) {
        constants$166.const$2.set(seg, x);
    }
    public static double s1$get(MemorySegment seg, long index) {
        return (double)constants$166.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void s1$set(MemorySegment seg, long index, double x) {
        constants$166.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s2$VH() {
        return constants$166.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double s2;
     * }
     */
    public static double s2$get(MemorySegment seg) {
        return (double)constants$166.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double s2;
     * }
     */
    public static void s2$set(MemorySegment seg, double x) {
        constants$166.const$3.set(seg, x);
    }
    public static double s2$get(MemorySegment seg, long index) {
        return (double)constants$166.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void s2$set(MemorySegment seg, long index, double x) {
        constants$166.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s3$VH() {
        return constants$166.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double s3;
     * }
     */
    public static double s3$get(MemorySegment seg) {
        return (double)constants$166.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double s3;
     * }
     */
    public static void s3$set(MemorySegment seg, double x) {
        constants$166.const$4.set(seg, x);
    }
    public static double s3$get(MemorySegment seg, long index) {
        return (double)constants$166.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void s3$set(MemorySegment seg, long index, double x) {
        constants$166.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s4$VH() {
        return constants$166.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double s4;
     * }
     */
    public static double s4$get(MemorySegment seg) {
        return (double)constants$166.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double s4;
     * }
     */
    public static void s4$set(MemorySegment seg, double x) {
        constants$166.const$5.set(seg, x);
    }
    public static double s4$get(MemorySegment seg, long index) {
        return (double)constants$166.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void s4$set(MemorySegment seg, long index, double x) {
        constants$166.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s5$VH() {
        return constants$167.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double s5;
     * }
     */
    public static double s5$get(MemorySegment seg) {
        return (double)constants$167.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double s5;
     * }
     */
    public static void s5$set(MemorySegment seg, double x) {
        constants$167.const$0.set(seg, x);
    }
    public static double s5$get(MemorySegment seg, long index) {
        return (double)constants$167.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void s5$set(MemorySegment seg, long index, double x) {
        constants$167.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s6$VH() {
        return constants$167.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double s6;
     * }
     */
    public static double s6$get(MemorySegment seg) {
        return (double)constants$167.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double s6;
     * }
     */
    public static void s6$set(MemorySegment seg, double x) {
        constants$167.const$1.set(seg, x);
    }
    public static double s6$get(MemorySegment seg, long index) {
        return (double)constants$167.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void s6$set(MemorySegment seg, long index, double x) {
        constants$167.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s7$VH() {
        return constants$167.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_double s7;
     * }
     */
    public static double s7$get(MemorySegment seg) {
        return (double)constants$167.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_double s7;
     * }
     */
    public static void s7$set(MemorySegment seg, double x) {
        constants$167.const$2.set(seg, x);
    }
    public static double s7$get(MemorySegment seg, long index) {
        return (double)constants$167.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void s7$set(MemorySegment seg, long index, double x) {
        constants$167.const$2.set(seg.asSlice(index*sizeof()), x);
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


