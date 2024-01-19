// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRFRAMERGN {
 *     EMR emr;
 *     RECTL rclBounds;
 *     DWORD cbRgnData;
 *     DWORD ihBrush;
 *     SIZEL szlStroke;
 *     BYTE RgnData[1];
 * };
 * }
 */
public class tagEMRFRAMERGN {

    public static MemoryLayout $LAYOUT() {
        return constants$1086.const$1;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static VarHandle cbRgnData$VH() {
        return constants$1086.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbRgnData;
     * }
     */
    public static int cbRgnData$get(MemorySegment seg) {
        return (int)constants$1086.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbRgnData;
     * }
     */
    public static void cbRgnData$set(MemorySegment seg, int x) {
        constants$1086.const$2.set(seg, x);
    }
    public static int cbRgnData$get(MemorySegment seg, long index) {
        return (int)constants$1086.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cbRgnData$set(MemorySegment seg, long index, int x) {
        constants$1086.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ihBrush$VH() {
        return constants$1086.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ihBrush;
     * }
     */
    public static int ihBrush$get(MemorySegment seg) {
        return (int)constants$1086.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ihBrush;
     * }
     */
    public static void ihBrush$set(MemorySegment seg, int x) {
        constants$1086.const$3.set(seg, x);
    }
    public static int ihBrush$get(MemorySegment seg, long index) {
        return (int)constants$1086.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ihBrush$set(MemorySegment seg, long index, int x) {
        constants$1086.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szlStroke$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment RgnData$slice(MemorySegment seg) {
        return seg.asSlice(40, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

