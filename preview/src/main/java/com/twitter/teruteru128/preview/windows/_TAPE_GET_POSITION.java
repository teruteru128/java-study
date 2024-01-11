// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TAPE_GET_POSITION {
 *     DWORD Type;
 *     DWORD Partition;
 *     LARGE_INTEGER Offset;
 * };
 * }
 */
public class _TAPE_GET_POSITION {

    public static MemoryLayout $LAYOUT() {
        return constants$515.const$0;
    }
    public static VarHandle Type$VH() {
        return constants$515.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)constants$515.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        constants$515.const$1.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)constants$515.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        constants$515.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Partition$VH() {
        return constants$515.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Partition;
     * }
     */
    public static int Partition$get(MemorySegment seg) {
        return (int)constants$515.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Partition;
     * }
     */
    public static void Partition$set(MemorySegment seg, int x) {
        constants$515.const$2.set(seg, x);
    }
    public static int Partition$get(MemorySegment seg, long index) {
        return (int)constants$515.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Partition$set(MemorySegment seg, long index, int x) {
        constants$515.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Offset$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


