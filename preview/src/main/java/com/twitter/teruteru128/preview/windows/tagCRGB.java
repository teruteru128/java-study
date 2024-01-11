// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCRGB {
 *     BYTE bRed;
 *     BYTE bGreen;
 *     BYTE bBlue;
 *     BYTE bExtra;
 * };
 * }
 */
public class tagCRGB {

    public static MemoryLayout $LAYOUT() {
        return constants$1547.const$3;
    }
    public static VarHandle bRed$VH() {
        return constants$1547.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bRed;
     * }
     */
    public static byte bRed$get(MemorySegment seg) {
        return (byte)constants$1547.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bRed;
     * }
     */
    public static void bRed$set(MemorySegment seg, byte x) {
        constants$1547.const$4.set(seg, x);
    }
    public static byte bRed$get(MemorySegment seg, long index) {
        return (byte)constants$1547.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void bRed$set(MemorySegment seg, long index, byte x) {
        constants$1547.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bGreen$VH() {
        return constants$1547.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bGreen;
     * }
     */
    public static byte bGreen$get(MemorySegment seg) {
        return (byte)constants$1547.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bGreen;
     * }
     */
    public static void bGreen$set(MemorySegment seg, byte x) {
        constants$1547.const$5.set(seg, x);
    }
    public static byte bGreen$get(MemorySegment seg, long index) {
        return (byte)constants$1547.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bGreen$set(MemorySegment seg, long index, byte x) {
        constants$1547.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bBlue$VH() {
        return constants$1548.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bBlue;
     * }
     */
    public static byte bBlue$get(MemorySegment seg) {
        return (byte)constants$1548.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bBlue;
     * }
     */
    public static void bBlue$set(MemorySegment seg, byte x) {
        constants$1548.const$0.set(seg, x);
    }
    public static byte bBlue$get(MemorySegment seg, long index) {
        return (byte)constants$1548.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void bBlue$set(MemorySegment seg, long index, byte x) {
        constants$1548.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bExtra$VH() {
        return constants$1548.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bExtra;
     * }
     */
    public static byte bExtra$get(MemorySegment seg) {
        return (byte)constants$1548.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bExtra;
     * }
     */
    public static void bExtra$set(MemorySegment seg, byte x) {
        constants$1548.const$1.set(seg, x);
    }
    public static byte bExtra$get(MemorySegment seg, long index) {
        return (byte)constants$1548.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bExtra$set(MemorySegment seg, long index, byte x) {
        constants$1548.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

