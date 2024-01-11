// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FSCTL_OFFLOAD_READ_OUTPUT {
 *     DWORD Size;
 *     DWORD Flags;
 *     DWORDLONG TransferLength;
 *     BYTE Token[512];
 * };
 * }
 */
public class _FSCTL_OFFLOAD_READ_OUTPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$2701.const$5;
    }
    public static VarHandle Size$VH() {
        return constants$2702.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2702.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2702.const$0.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2702.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2702.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$2702.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$2702.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$2702.const$1.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$2702.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$2702.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TransferLength$VH() {
        return constants$2702.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG TransferLength;
     * }
     */
    public static long TransferLength$get(MemorySegment seg) {
        return (long)constants$2702.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG TransferLength;
     * }
     */
    public static void TransferLength$set(MemorySegment seg, long x) {
        constants$2702.const$2.set(seg, x);
    }
    public static long TransferLength$get(MemorySegment seg, long index) {
        return (long)constants$2702.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void TransferLength$set(MemorySegment seg, long index, long x) {
        constants$2702.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Token$slice(MemorySegment seg) {
        return seg.asSlice(16, 512);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


