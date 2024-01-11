// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RECTL {
 *     LONG left;
 *     LONG top;
 *     LONG right;
 *     LONG bottom;
 * };
 * }
 */
public class _RECTL {

    public static MemoryLayout $LAYOUT() {
        return constants$547.const$2;
    }
    public static VarHandle left$VH() {
        return constants$547.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG left;
     * }
     */
    public static int left$get(MemorySegment seg) {
        return (int)constants$547.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG left;
     * }
     */
    public static void left$set(MemorySegment seg, int x) {
        constants$547.const$3.set(seg, x);
    }
    public static int left$get(MemorySegment seg, long index) {
        return (int)constants$547.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void left$set(MemorySegment seg, long index, int x) {
        constants$547.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle top$VH() {
        return constants$547.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG top;
     * }
     */
    public static int top$get(MemorySegment seg) {
        return (int)constants$547.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG top;
     * }
     */
    public static void top$set(MemorySegment seg, int x) {
        constants$547.const$4.set(seg, x);
    }
    public static int top$get(MemorySegment seg, long index) {
        return (int)constants$547.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void top$set(MemorySegment seg, long index, int x) {
        constants$547.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle right$VH() {
        return constants$547.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG right;
     * }
     */
    public static int right$get(MemorySegment seg) {
        return (int)constants$547.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG right;
     * }
     */
    public static void right$set(MemorySegment seg, int x) {
        constants$547.const$5.set(seg, x);
    }
    public static int right$get(MemorySegment seg, long index) {
        return (int)constants$547.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void right$set(MemorySegment seg, long index, int x) {
        constants$547.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bottom$VH() {
        return constants$548.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bottom;
     * }
     */
    public static int bottom$get(MemorySegment seg) {
        return (int)constants$548.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bottom;
     * }
     */
    public static void bottom$set(MemorySegment seg, int x) {
        constants$548.const$0.set(seg, x);
    }
    public static int bottom$get(MemorySegment seg, long index) {
        return (int)constants$548.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void bottom$set(MemorySegment seg, long index, int x) {
        constants$548.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


