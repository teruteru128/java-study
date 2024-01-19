// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct timecaps_tag {
 *     UINT wPeriodMin;
 *     UINT wPeriodMax;
 * };
 * }
 */
public class timecaps_tag {

    public static MemoryLayout $LAYOUT() {
        return constants$1679.const$4;
    }
    public static VarHandle wPeriodMin$VH() {
        return constants$1679.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wPeriodMin;
     * }
     */
    public static int wPeriodMin$get(MemorySegment seg) {
        return (int)constants$1679.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wPeriodMin;
     * }
     */
    public static void wPeriodMin$set(MemorySegment seg, int x) {
        constants$1679.const$5.set(seg, x);
    }
    public static int wPeriodMin$get(MemorySegment seg, long index) {
        return (int)constants$1679.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void wPeriodMin$set(MemorySegment seg, long index, int x) {
        constants$1679.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wPeriodMax$VH() {
        return constants$1680.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wPeriodMax;
     * }
     */
    public static int wPeriodMax$get(MemorySegment seg) {
        return (int)constants$1680.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wPeriodMax;
     * }
     */
    public static void wPeriodMax$set(MemorySegment seg, int x) {
        constants$1680.const$0.set(seg, x);
    }
    public static int wPeriodMax$get(MemorySegment seg, long index) {
        return (int)constants$1680.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void wPeriodMax$set(MemorySegment seg, long index, int x) {
        constants$1680.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

