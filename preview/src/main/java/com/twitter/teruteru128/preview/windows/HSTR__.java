// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct HSTR__ {
 *     int unused;
 * };
 * }
 */
public class HSTR__ {

    public static MemoryLayout $LAYOUT() {
        return constants$538.const$4;
    }
    public static VarHandle unused$VH() {
        return constants$538.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int unused;
     * }
     */
    public static int unused$get(MemorySegment seg) {
        return (int)constants$538.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int unused;
     * }
     */
    public static void unused$set(MemorySegment seg, int x) {
        constants$538.const$5.set(seg, x);
    }
    public static int unused$get(MemorySegment seg, long index) {
        return (int)constants$538.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void unused$set(MemorySegment seg, long index, int x) {
        constants$538.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

