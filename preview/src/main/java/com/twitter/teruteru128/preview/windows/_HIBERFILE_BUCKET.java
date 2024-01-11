// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _HIBERFILE_BUCKET {
 *     DWORD64 MaxPhysicalMemory;
 *     DWORD PhysicalMemoryPercent[3];
 * };
 * }
 */
public class _HIBERFILE_BUCKET {

    public static MemoryLayout $LAYOUT() {
        return constants$342.const$5;
    }
    public static VarHandle MaxPhysicalMemory$VH() {
        return constants$343.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 MaxPhysicalMemory;
     * }
     */
    public static long MaxPhysicalMemory$get(MemorySegment seg) {
        return (long)constants$343.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 MaxPhysicalMemory;
     * }
     */
    public static void MaxPhysicalMemory$set(MemorySegment seg, long x) {
        constants$343.const$0.set(seg, x);
    }
    public static long MaxPhysicalMemory$get(MemorySegment seg, long index) {
        return (long)constants$343.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxPhysicalMemory$set(MemorySegment seg, long index, long x) {
        constants$343.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PhysicalMemoryPercent$slice(MemorySegment seg) {
        return seg.asSlice(8, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

