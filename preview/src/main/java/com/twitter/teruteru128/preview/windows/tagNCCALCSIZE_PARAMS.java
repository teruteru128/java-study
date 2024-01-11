// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagNCCALCSIZE_PARAMS {
 *     RECT rgrc[3];
 *     PWINDOWPOS lppos;
 * };
 * }
 */
public class tagNCCALCSIZE_PARAMS {

    public static MemoryLayout $LAYOUT() {
        return constants$1169.const$4;
    }
    public static MemorySegment rgrc$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    public static VarHandle lppos$VH() {
        return constants$1169.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PWINDOWPOS lppos;
     * }
     */
    public static MemorySegment lppos$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1169.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PWINDOWPOS lppos;
     * }
     */
    public static void lppos$set(MemorySegment seg, MemorySegment x) {
        constants$1169.const$5.set(seg, x);
    }
    public static MemorySegment lppos$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1169.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lppos$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1169.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

