// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DISK_EXTENT {
 *     DWORD DiskNumber;
 *     LARGE_INTEGER StartingOffset;
 *     LARGE_INTEGER ExtentLength;
 * };
 * }
 */
public class _DISK_EXTENT {

    public static MemoryLayout $LAYOUT() {
        return constants$2741.const$5;
    }
    public static VarHandle DiskNumber$VH() {
        return constants$2742.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DiskNumber;
     * }
     */
    public static int DiskNumber$get(MemorySegment seg) {
        return (int)constants$2742.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DiskNumber;
     * }
     */
    public static void DiskNumber$set(MemorySegment seg, int x) {
        constants$2742.const$0.set(seg, x);
    }
    public static int DiskNumber$get(MemorySegment seg, long index) {
        return (int)constants$2742.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void DiskNumber$set(MemorySegment seg, long index, int x) {
        constants$2742.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StartingOffset$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment ExtentLength$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


