// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PSFEATURE_CUSTPAPER {
 *     LONG lOrientation;
 *     LONG lWidth;
 *     LONG lHeight;
 *     LONG lWidthOffset;
 *     LONG lHeightOffset;
 * };
 * }
 */
public class _PSFEATURE_CUSTPAPER {

    public static MemoryLayout $LAYOUT() {
        return constants$886.const$0;
    }
    public static VarHandle lOrientation$VH() {
        return constants$886.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG lOrientation;
     * }
     */
    public static int lOrientation$get(MemorySegment seg) {
        return (int)constants$886.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG lOrientation;
     * }
     */
    public static void lOrientation$set(MemorySegment seg, int x) {
        constants$886.const$1.set(seg, x);
    }
    public static int lOrientation$get(MemorySegment seg, long index) {
        return (int)constants$886.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lOrientation$set(MemorySegment seg, long index, int x) {
        constants$886.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lWidth$VH() {
        return constants$886.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG lWidth;
     * }
     */
    public static int lWidth$get(MemorySegment seg) {
        return (int)constants$886.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG lWidth;
     * }
     */
    public static void lWidth$set(MemorySegment seg, int x) {
        constants$886.const$2.set(seg, x);
    }
    public static int lWidth$get(MemorySegment seg, long index) {
        return (int)constants$886.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void lWidth$set(MemorySegment seg, long index, int x) {
        constants$886.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lHeight$VH() {
        return constants$886.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG lHeight;
     * }
     */
    public static int lHeight$get(MemorySegment seg) {
        return (int)constants$886.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG lHeight;
     * }
     */
    public static void lHeight$set(MemorySegment seg, int x) {
        constants$886.const$3.set(seg, x);
    }
    public static int lHeight$get(MemorySegment seg, long index) {
        return (int)constants$886.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void lHeight$set(MemorySegment seg, long index, int x) {
        constants$886.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lWidthOffset$VH() {
        return constants$886.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG lWidthOffset;
     * }
     */
    public static int lWidthOffset$get(MemorySegment seg) {
        return (int)constants$886.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG lWidthOffset;
     * }
     */
    public static void lWidthOffset$set(MemorySegment seg, int x) {
        constants$886.const$4.set(seg, x);
    }
    public static int lWidthOffset$get(MemorySegment seg, long index) {
        return (int)constants$886.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void lWidthOffset$set(MemorySegment seg, long index, int x) {
        constants$886.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lHeightOffset$VH() {
        return constants$886.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG lHeightOffset;
     * }
     */
    public static int lHeightOffset$get(MemorySegment seg) {
        return (int)constants$886.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG lHeightOffset;
     * }
     */
    public static void lHeightOffset$set(MemorySegment seg, int x) {
        constants$886.const$5.set(seg, x);
    }
    public static int lHeightOffset$get(MemorySegment seg, long index) {
        return (int)constants$886.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lHeightOffset$set(MemorySegment seg, long index, int x) {
        constants$886.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

