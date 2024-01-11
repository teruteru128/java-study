// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     double x;
 * };
 * }
 */
public class _CRT_DOUBLE {

    public static MemoryLayout $LAYOUT() {
        return constants$2978.const$1;
    }
    public static VarHandle x$VH() {
        return constants$2978.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x;
     * }
     */
    public static double x$get(MemorySegment seg) {
        return (double)constants$2978.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x;
     * }
     */
    public static void x$set(MemorySegment seg, double x) {
        constants$2978.const$2.set(seg, x);
    }
    public static double x$get(MemorySegment seg, long index) {
        return (double)constants$2978.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, double x) {
        constants$2978.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

