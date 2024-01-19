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
 *     cl_ulong s[4];
 *     struct {
 *         cl_ulong x;
 *         cl_ulong y;
 *         cl_ulong z;
 *         cl_ulong w;
 *     };
 *     struct {
 *         cl_ulong s0;
 *         cl_ulong s1;
 *         cl_ulong s2;
 *         cl_ulong s3;
 *     };
 *     struct {
 *         cl_ulong2 lo;
 *         cl_ulong2 hi;
 *     };
 *     __cl_ulong2 v2[2];
 * };
 * }
 */
public class cl_ulong4 {

    public static MemoryLayout $LAYOUT() {
        return constants$133.const$3;
    }
    public static MemorySegment s$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static VarHandle x$VH() {
        return constants$143.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_ulong x;
     * }
     */
    public static long x$get(MemorySegment seg) {
        return (long)constants$143.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_ulong x;
     * }
     */
    public static void x$set(MemorySegment seg, long x) {
        constants$143.const$4.set(seg, x);
    }
    public static long x$get(MemorySegment seg, long index) {
        return (long)constants$143.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, long x) {
        constants$143.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$143.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_ulong y;
     * }
     */
    public static long y$get(MemorySegment seg) {
        return (long)constants$143.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_ulong y;
     * }
     */
    public static void y$set(MemorySegment seg, long x) {
        constants$143.const$5.set(seg, x);
    }
    public static long y$get(MemorySegment seg, long index) {
        return (long)constants$143.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, long x) {
        constants$143.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle z$VH() {
        return constants$144.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_ulong z;
     * }
     */
    public static long z$get(MemorySegment seg) {
        return (long)constants$144.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_ulong z;
     * }
     */
    public static void z$set(MemorySegment seg, long x) {
        constants$144.const$0.set(seg, x);
    }
    public static long z$get(MemorySegment seg, long index) {
        return (long)constants$144.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void z$set(MemorySegment seg, long index, long x) {
        constants$144.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle w$VH() {
        return constants$144.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_ulong w;
     * }
     */
    public static long w$get(MemorySegment seg) {
        return (long)constants$144.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_ulong w;
     * }
     */
    public static void w$set(MemorySegment seg, long x) {
        constants$144.const$1.set(seg, x);
    }
    public static long w$get(MemorySegment seg, long index) {
        return (long)constants$144.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void w$set(MemorySegment seg, long index, long x) {
        constants$144.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s0$VH() {
        return constants$144.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_ulong s0;
     * }
     */
    public static long s0$get(MemorySegment seg) {
        return (long)constants$144.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_ulong s0;
     * }
     */
    public static void s0$set(MemorySegment seg, long x) {
        constants$144.const$2.set(seg, x);
    }
    public static long s0$get(MemorySegment seg, long index) {
        return (long)constants$144.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void s0$set(MemorySegment seg, long index, long x) {
        constants$144.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s1$VH() {
        return constants$144.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_ulong s1;
     * }
     */
    public static long s1$get(MemorySegment seg) {
        return (long)constants$144.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_ulong s1;
     * }
     */
    public static void s1$set(MemorySegment seg, long x) {
        constants$144.const$3.set(seg, x);
    }
    public static long s1$get(MemorySegment seg, long index) {
        return (long)constants$144.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void s1$set(MemorySegment seg, long index, long x) {
        constants$144.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s2$VH() {
        return constants$144.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_ulong s2;
     * }
     */
    public static long s2$get(MemorySegment seg) {
        return (long)constants$144.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_ulong s2;
     * }
     */
    public static void s2$set(MemorySegment seg, long x) {
        constants$144.const$4.set(seg, x);
    }
    public static long s2$get(MemorySegment seg, long index) {
        return (long)constants$144.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void s2$set(MemorySegment seg, long index, long x) {
        constants$144.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s3$VH() {
        return constants$144.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_ulong s3;
     * }
     */
    public static long s3$get(MemorySegment seg) {
        return (long)constants$144.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_ulong s3;
     * }
     */
    public static void s3$set(MemorySegment seg, long x) {
        constants$144.const$5.set(seg, x);
    }
    public static long s3$get(MemorySegment seg, long index) {
        return (long)constants$144.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void s3$set(MemorySegment seg, long index, long x) {
        constants$144.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lo$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment hi$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment v2$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

