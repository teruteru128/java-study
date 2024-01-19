// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES {
 *     BOOLEAN IsAllowed;
 * };
 * }
 */
public class _POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES {

    public static MemoryLayout $LAYOUT() {
        return constants$303.const$1;
    }
    public static VarHandle IsAllowed$VH() {
        return constants$303.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN IsAllowed;
     * }
     */
    public static byte IsAllowed$get(MemorySegment seg) {
        return (byte)constants$303.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN IsAllowed;
     * }
     */
    public static void IsAllowed$set(MemorySegment seg, byte x) {
        constants$303.const$2.set(seg, x);
    }
    public static byte IsAllowed$get(MemorySegment seg, long index) {
        return (byte)constants$303.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void IsAllowed$set(MemorySegment seg, long index, byte x) {
        constants$303.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

