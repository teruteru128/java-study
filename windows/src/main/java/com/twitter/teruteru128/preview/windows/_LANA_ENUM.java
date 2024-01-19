// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _LANA_ENUM {
 *     UCHAR length;
 *     UCHAR lana[255];
 * };
 * }
 */
public class _LANA_ENUM {

    public static MemoryLayout $LAYOUT() {
        return constants$1709.const$3;
    }
    public static VarHandle length$VH() {
        return constants$1709.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR length;
     * }
     */
    public static byte length$get(MemorySegment seg) {
        return (byte)constants$1709.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR length;
     * }
     */
    public static void length$set(MemorySegment seg, byte x) {
        constants$1709.const$4.set(seg, x);
    }
    public static byte length$get(MemorySegment seg, long index) {
        return (byte)constants$1709.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, byte x) {
        constants$1709.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lana$slice(MemorySegment seg) {
        return seg.asSlice(1, 255);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

