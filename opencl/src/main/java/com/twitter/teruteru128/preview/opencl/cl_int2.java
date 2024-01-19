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
 *     cl_int s[2];
 *     struct {
 *         cl_int x;
 *         cl_int y;
 *     };
 *     struct {
 *         cl_int s0;
 *         cl_int s1;
 *     };
 *     struct {
 *         cl_int lo;
 *         cl_int hi;
 *     };
 *     __cl_int2 v2;
 * };
 * }
 */
public class cl_int2 {

    public static MemoryLayout $LAYOUT() {
        return constants$112.const$2;
    }
    public static MemorySegment s$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle x$VH() {
        return constants$112.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$112.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$112.const$3.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$112.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$112.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$112.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$112.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$112.const$4.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$112.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$112.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s0$VH() {
        return constants$112.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_int s0;
     * }
     */
    public static int s0$get(MemorySegment seg) {
        return (int)constants$112.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_int s0;
     * }
     */
    public static void s0$set(MemorySegment seg, int x) {
        constants$112.const$5.set(seg, x);
    }
    public static int s0$get(MemorySegment seg, long index) {
        return (int)constants$112.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void s0$set(MemorySegment seg, long index, int x) {
        constants$112.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s1$VH() {
        return constants$113.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_int s1;
     * }
     */
    public static int s1$get(MemorySegment seg) {
        return (int)constants$113.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_int s1;
     * }
     */
    public static void s1$set(MemorySegment seg, int x) {
        constants$113.const$0.set(seg, x);
    }
    public static int s1$get(MemorySegment seg, long index) {
        return (int)constants$113.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void s1$set(MemorySegment seg, long index, int x) {
        constants$113.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lo$VH() {
        return constants$113.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_int lo;
     * }
     */
    public static int lo$get(MemorySegment seg) {
        return (int)constants$113.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_int lo;
     * }
     */
    public static void lo$set(MemorySegment seg, int x) {
        constants$113.const$1.set(seg, x);
    }
    public static int lo$get(MemorySegment seg, long index) {
        return (int)constants$113.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lo$set(MemorySegment seg, long index, int x) {
        constants$113.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hi$VH() {
        return constants$113.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_int hi;
     * }
     */
    public static int hi$get(MemorySegment seg) {
        return (int)constants$113.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_int hi;
     * }
     */
    public static void hi$set(MemorySegment seg, int x) {
        constants$113.const$2.set(seg, x);
    }
    public static int hi$get(MemorySegment seg, long index) {
        return (int)constants$113.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void hi$set(MemorySegment seg, long index, int x) {
        constants$113.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment v2$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

