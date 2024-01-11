// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SYSTEM_POOL_ZEROING_INFORMATION {
 *     BOOLEAN PoolZeroingSupportPresent;
 * };
 * }
 */
public class _SYSTEM_POOL_ZEROING_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$237.const$3;
    }
    public static VarHandle PoolZeroingSupportPresent$VH() {
        return constants$237.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN PoolZeroingSupportPresent;
     * }
     */
    public static byte PoolZeroingSupportPresent$get(MemorySegment seg) {
        return (byte)constants$237.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN PoolZeroingSupportPresent;
     * }
     */
    public static void PoolZeroingSupportPresent$set(MemorySegment seg, byte x) {
        constants$237.const$4.set(seg, x);
    }
    public static byte PoolZeroingSupportPresent$get(MemorySegment seg, long index) {
        return (byte)constants$237.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void PoolZeroingSupportPresent$set(MemorySegment seg, long index, byte x) {
        constants$237.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


