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
 *     cl_char s[2];
 *     struct {
 *         cl_char x;
 *         cl_char y;
 *     };
 *     struct {
 *         cl_char s0;
 *         cl_char s1;
 *     };
 *     struct {
 *         cl_char lo;
 *         cl_char hi;
 *     };
 * };
 * }
 */
public class cl_char2 {

    public static MemoryLayout $LAYOUT() {
        return constants$62.const$1;
    }
    public static MemorySegment s$slice(MemorySegment seg) {
        return seg.asSlice(0, 2);
    }
    public static VarHandle x$VH() {
        return constants$62.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_char x;
     * }
     */
    public static byte x$get(MemorySegment seg) {
        return (byte)constants$62.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_char x;
     * }
     */
    public static void x$set(MemorySegment seg, byte x) {
        constants$62.const$2.set(seg, x);
    }
    public static byte x$get(MemorySegment seg, long index) {
        return (byte)constants$62.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, byte x) {
        constants$62.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$62.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_char y;
     * }
     */
    public static byte y$get(MemorySegment seg) {
        return (byte)constants$62.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_char y;
     * }
     */
    public static void y$set(MemorySegment seg, byte x) {
        constants$62.const$3.set(seg, x);
    }
    public static byte y$get(MemorySegment seg, long index) {
        return (byte)constants$62.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, byte x) {
        constants$62.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s0$VH() {
        return constants$62.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_char s0;
     * }
     */
    public static byte s0$get(MemorySegment seg) {
        return (byte)constants$62.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_char s0;
     * }
     */
    public static void s0$set(MemorySegment seg, byte x) {
        constants$62.const$4.set(seg, x);
    }
    public static byte s0$get(MemorySegment seg, long index) {
        return (byte)constants$62.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void s0$set(MemorySegment seg, long index, byte x) {
        constants$62.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle s1$VH() {
        return constants$62.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_char s1;
     * }
     */
    public static byte s1$get(MemorySegment seg) {
        return (byte)constants$62.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_char s1;
     * }
     */
    public static void s1$set(MemorySegment seg, byte x) {
        constants$62.const$5.set(seg, x);
    }
    public static byte s1$get(MemorySegment seg, long index) {
        return (byte)constants$62.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void s1$set(MemorySegment seg, long index, byte x) {
        constants$62.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lo$VH() {
        return constants$63.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_char lo;
     * }
     */
    public static byte lo$get(MemorySegment seg) {
        return (byte)constants$63.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_char lo;
     * }
     */
    public static void lo$set(MemorySegment seg, byte x) {
        constants$63.const$0.set(seg, x);
    }
    public static byte lo$get(MemorySegment seg, long index) {
        return (byte)constants$63.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lo$set(MemorySegment seg, long index, byte x) {
        constants$63.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hi$VH() {
        return constants$63.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_char hi;
     * }
     */
    public static byte hi$get(MemorySegment seg) {
        return (byte)constants$63.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_char hi;
     * }
     */
    public static void hi$set(MemorySegment seg, byte x) {
        constants$63.const$1.set(seg, x);
    }
    public static byte hi$get(MemorySegment seg, long index) {
        return (byte)constants$63.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void hi$set(MemorySegment seg, long index, byte x) {
        constants$63.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


