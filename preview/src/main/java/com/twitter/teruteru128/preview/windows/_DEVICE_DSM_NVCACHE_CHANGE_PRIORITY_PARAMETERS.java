// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS {
 *     DWORD Size;
 *     BYTE TargetPriority;
 *     BYTE Reserved[3];
 * };
 * }
 */
public class _DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS {

    public static MemoryLayout $LAYOUT() {
        return constants$2456.const$3;
    }
    public static VarHandle Size$VH() {
        return constants$2456.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2456.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2456.const$4.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2456.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2456.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TargetPriority$VH() {
        return constants$2456.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE TargetPriority;
     * }
     */
    public static byte TargetPriority$get(MemorySegment seg) {
        return (byte)constants$2456.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE TargetPriority;
     * }
     */
    public static void TargetPriority$set(MemorySegment seg, byte x) {
        constants$2456.const$5.set(seg, x);
    }
    public static byte TargetPriority$get(MemorySegment seg, long index) {
        return (byte)constants$2456.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetPriority$set(MemorySegment seg, long index, byte x) {
        constants$2456.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(5, 3);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


