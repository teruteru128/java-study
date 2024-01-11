// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagPELARRAY {
 *     LONG paXCount;
 *     LONG paYCount;
 *     LONG paXExt;
 *     LONG paYExt;
 *     BYTE paRGBs;
 * };
 * }
 */
public class tagPELARRAY {

    public static MemoryLayout $LAYOUT() {
        return constants$928.const$5;
    }
    public static VarHandle paXCount$VH() {
        return constants$929.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG paXCount;
     * }
     */
    public static int paXCount$get(MemorySegment seg) {
        return (int)constants$929.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG paXCount;
     * }
     */
    public static void paXCount$set(MemorySegment seg, int x) {
        constants$929.const$0.set(seg, x);
    }
    public static int paXCount$get(MemorySegment seg, long index) {
        return (int)constants$929.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void paXCount$set(MemorySegment seg, long index, int x) {
        constants$929.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle paYCount$VH() {
        return constants$929.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG paYCount;
     * }
     */
    public static int paYCount$get(MemorySegment seg) {
        return (int)constants$929.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG paYCount;
     * }
     */
    public static void paYCount$set(MemorySegment seg, int x) {
        constants$929.const$1.set(seg, x);
    }
    public static int paYCount$get(MemorySegment seg, long index) {
        return (int)constants$929.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void paYCount$set(MemorySegment seg, long index, int x) {
        constants$929.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle paXExt$VH() {
        return constants$929.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG paXExt;
     * }
     */
    public static int paXExt$get(MemorySegment seg) {
        return (int)constants$929.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG paXExt;
     * }
     */
    public static void paXExt$set(MemorySegment seg, int x) {
        constants$929.const$2.set(seg, x);
    }
    public static int paXExt$get(MemorySegment seg, long index) {
        return (int)constants$929.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void paXExt$set(MemorySegment seg, long index, int x) {
        constants$929.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle paYExt$VH() {
        return constants$929.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG paYExt;
     * }
     */
    public static int paYExt$get(MemorySegment seg) {
        return (int)constants$929.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG paYExt;
     * }
     */
    public static void paYExt$set(MemorySegment seg, int x) {
        constants$929.const$3.set(seg, x);
    }
    public static int paYExt$get(MemorySegment seg, long index) {
        return (int)constants$929.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void paYExt$set(MemorySegment seg, long index, int x) {
        constants$929.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle paRGBs$VH() {
        return constants$929.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE paRGBs;
     * }
     */
    public static byte paRGBs$get(MemorySegment seg) {
        return (byte)constants$929.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE paRGBs;
     * }
     */
    public static void paRGBs$set(MemorySegment seg, byte x) {
        constants$929.const$4.set(seg, x);
    }
    public static byte paRGBs$get(MemorySegment seg, long index) {
        return (byte)constants$929.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void paRGBs$set(MemorySegment seg, long index, byte x) {
        constants$929.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


