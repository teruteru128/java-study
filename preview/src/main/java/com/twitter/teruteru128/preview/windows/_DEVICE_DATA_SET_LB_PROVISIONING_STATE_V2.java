// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_DATA_SET_LB_PROVISIONING_STATE_V2 {
 *     DWORD Size;
 *     DWORD Version;
 *     DWORDLONG SlabSizeInBytes;
 *     DWORDLONG SlabOffsetDeltaInBytes;
 *     DWORD SlabAllocationBitMapBitCount;
 *     DWORD SlabAllocationBitMapLength;
 *     DWORD SlabAllocationBitMap[1];
 * };
 * }
 */
public class _DEVICE_DATA_SET_LB_PROVISIONING_STATE_V2 {

    public static MemoryLayout $LAYOUT() {
        return constants$2450.const$3;
    }
    public static VarHandle Size$VH() {
        return constants$2450.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2450.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2450.const$4.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2450.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2450.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Version$VH() {
        return constants$2450.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2450.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2450.const$5.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2450.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2450.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SlabSizeInBytes$VH() {
        return constants$2451.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG SlabSizeInBytes;
     * }
     */
    public static long SlabSizeInBytes$get(MemorySegment seg) {
        return (long)constants$2451.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG SlabSizeInBytes;
     * }
     */
    public static void SlabSizeInBytes$set(MemorySegment seg, long x) {
        constants$2451.const$0.set(seg, x);
    }
    public static long SlabSizeInBytes$get(MemorySegment seg, long index) {
        return (long)constants$2451.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SlabSizeInBytes$set(MemorySegment seg, long index, long x) {
        constants$2451.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SlabOffsetDeltaInBytes$VH() {
        return constants$2451.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG SlabOffsetDeltaInBytes;
     * }
     */
    public static long SlabOffsetDeltaInBytes$get(MemorySegment seg) {
        return (long)constants$2451.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG SlabOffsetDeltaInBytes;
     * }
     */
    public static void SlabOffsetDeltaInBytes$set(MemorySegment seg, long x) {
        constants$2451.const$1.set(seg, x);
    }
    public static long SlabOffsetDeltaInBytes$get(MemorySegment seg, long index) {
        return (long)constants$2451.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void SlabOffsetDeltaInBytes$set(MemorySegment seg, long index, long x) {
        constants$2451.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SlabAllocationBitMapBitCount$VH() {
        return constants$2451.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SlabAllocationBitMapBitCount;
     * }
     */
    public static int SlabAllocationBitMapBitCount$get(MemorySegment seg) {
        return (int)constants$2451.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SlabAllocationBitMapBitCount;
     * }
     */
    public static void SlabAllocationBitMapBitCount$set(MemorySegment seg, int x) {
        constants$2451.const$2.set(seg, x);
    }
    public static int SlabAllocationBitMapBitCount$get(MemorySegment seg, long index) {
        return (int)constants$2451.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SlabAllocationBitMapBitCount$set(MemorySegment seg, long index, int x) {
        constants$2451.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SlabAllocationBitMapLength$VH() {
        return constants$2451.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SlabAllocationBitMapLength;
     * }
     */
    public static int SlabAllocationBitMapLength$get(MemorySegment seg) {
        return (int)constants$2451.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SlabAllocationBitMapLength;
     * }
     */
    public static void SlabAllocationBitMapLength$set(MemorySegment seg, int x) {
        constants$2451.const$3.set(seg, x);
    }
    public static int SlabAllocationBitMapLength$get(MemorySegment seg, long index) {
        return (int)constants$2451.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SlabAllocationBitMapLength$set(MemorySegment seg, long index, int x) {
        constants$2451.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SlabAllocationBitMap$slice(MemorySegment seg) {
        return seg.asSlice(32, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


