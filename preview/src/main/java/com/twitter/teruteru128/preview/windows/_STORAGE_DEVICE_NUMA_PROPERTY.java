// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_DEVICE_NUMA_PROPERTY {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD NumaNode;
 * };
 * }
 */
public class _STORAGE_DEVICE_NUMA_PROPERTY {

    public static MemoryLayout $LAYOUT() {
        return constants$2435.const$3;
    }
    public static VarHandle Version$VH() {
        return constants$2435.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2435.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2435.const$4.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2435.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2435.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$2435.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2435.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2435.const$5.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2435.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2435.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumaNode$VH() {
        return constants$2436.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumaNode;
     * }
     */
    public static int NumaNode$get(MemorySegment seg) {
        return (int)constants$2436.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumaNode;
     * }
     */
    public static void NumaNode$set(MemorySegment seg, int x) {
        constants$2436.const$0.set(seg, x);
    }
    public static int NumaNode$get(MemorySegment seg, long index) {
        return (int)constants$2436.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void NumaNode$set(MemorySegment seg, long index, int x) {
        constants$2436.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


