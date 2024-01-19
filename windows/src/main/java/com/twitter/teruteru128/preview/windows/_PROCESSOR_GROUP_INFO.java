// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROCESSOR_GROUP_INFO {
 *     BYTE MaximumProcessorCount;
 *     BYTE ActiveProcessorCount;
 *     BYTE Reserved[38];
 *     KAFFINITY ActiveProcessorMask;
 * };
 * }
 */
public class _PROCESSOR_GROUP_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$233.const$2;
    }
    public static VarHandle MaximumProcessorCount$VH() {
        return constants$233.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE MaximumProcessorCount;
     * }
     */
    public static byte MaximumProcessorCount$get(MemorySegment seg) {
        return (byte)constants$233.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE MaximumProcessorCount;
     * }
     */
    public static void MaximumProcessorCount$set(MemorySegment seg, byte x) {
        constants$233.const$3.set(seg, x);
    }
    public static byte MaximumProcessorCount$get(MemorySegment seg, long index) {
        return (byte)constants$233.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void MaximumProcessorCount$set(MemorySegment seg, long index, byte x) {
        constants$233.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ActiveProcessorCount$VH() {
        return constants$233.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE ActiveProcessorCount;
     * }
     */
    public static byte ActiveProcessorCount$get(MemorySegment seg) {
        return (byte)constants$233.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE ActiveProcessorCount;
     * }
     */
    public static void ActiveProcessorCount$set(MemorySegment seg, byte x) {
        constants$233.const$4.set(seg, x);
    }
    public static byte ActiveProcessorCount$get(MemorySegment seg, long index) {
        return (byte)constants$233.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ActiveProcessorCount$set(MemorySegment seg, long index, byte x) {
        constants$233.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(2, 38);
    }
    public static VarHandle ActiveProcessorMask$VH() {
        return constants$233.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * KAFFINITY ActiveProcessorMask;
     * }
     */
    public static long ActiveProcessorMask$get(MemorySegment seg) {
        return (long)constants$233.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * KAFFINITY ActiveProcessorMask;
     * }
     */
    public static void ActiveProcessorMask$set(MemorySegment seg, long x) {
        constants$233.const$5.set(seg, x);
    }
    public static long ActiveProcessorMask$get(MemorySegment seg, long index) {
        return (long)constants$233.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ActiveProcessorMask$set(MemorySegment seg, long index, long x) {
        constants$233.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

