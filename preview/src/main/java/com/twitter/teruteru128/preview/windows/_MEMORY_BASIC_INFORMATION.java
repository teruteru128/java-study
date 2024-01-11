// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MEMORY_BASIC_INFORMATION {
 *     PVOID BaseAddress;
 *     PVOID AllocationBase;
 *     DWORD AllocationProtect;
 *     WORD PartitionId;
 *     SIZE_T RegionSize;
 *     DWORD State;
 *     DWORD Protect;
 *     DWORD Type;
 * };
 * }
 */
public class _MEMORY_BASIC_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$240.const$5;
    }
    public static VarHandle BaseAddress$VH() {
        return constants$241.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID BaseAddress;
     * }
     */
    public static MemorySegment BaseAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$241.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID BaseAddress;
     * }
     */
    public static void BaseAddress$set(MemorySegment seg, MemorySegment x) {
        constants$241.const$0.set(seg, x);
    }
    public static MemorySegment BaseAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$241.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseAddress$set(MemorySegment seg, long index, MemorySegment x) {
        constants$241.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AllocationBase$VH() {
        return constants$241.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID AllocationBase;
     * }
     */
    public static MemorySegment AllocationBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$241.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID AllocationBase;
     * }
     */
    public static void AllocationBase$set(MemorySegment seg, MemorySegment x) {
        constants$241.const$1.set(seg, x);
    }
    public static MemorySegment AllocationBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$241.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void AllocationBase$set(MemorySegment seg, long index, MemorySegment x) {
        constants$241.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AllocationProtect$VH() {
        return constants$241.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AllocationProtect;
     * }
     */
    public static int AllocationProtect$get(MemorySegment seg) {
        return (int)constants$241.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AllocationProtect;
     * }
     */
    public static void AllocationProtect$set(MemorySegment seg, int x) {
        constants$241.const$2.set(seg, x);
    }
    public static int AllocationProtect$get(MemorySegment seg, long index) {
        return (int)constants$241.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void AllocationProtect$set(MemorySegment seg, long index, int x) {
        constants$241.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PartitionId$VH() {
        return constants$241.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD PartitionId;
     * }
     */
    public static short PartitionId$get(MemorySegment seg) {
        return (short)constants$241.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD PartitionId;
     * }
     */
    public static void PartitionId$set(MemorySegment seg, short x) {
        constants$241.const$3.set(seg, x);
    }
    public static short PartitionId$get(MemorySegment seg, long index) {
        return (short)constants$241.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionId$set(MemorySegment seg, long index, short x) {
        constants$241.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle RegionSize$VH() {
        return constants$241.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T RegionSize;
     * }
     */
    public static long RegionSize$get(MemorySegment seg) {
        return (long)constants$241.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T RegionSize;
     * }
     */
    public static void RegionSize$set(MemorySegment seg, long x) {
        constants$241.const$4.set(seg, x);
    }
    public static long RegionSize$get(MemorySegment seg, long index) {
        return (long)constants$241.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void RegionSize$set(MemorySegment seg, long index, long x) {
        constants$241.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle State$VH() {
        return constants$241.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD State;
     * }
     */
    public static int State$get(MemorySegment seg) {
        return (int)constants$241.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD State;
     * }
     */
    public static void State$set(MemorySegment seg, int x) {
        constants$241.const$5.set(seg, x);
    }
    public static int State$get(MemorySegment seg, long index) {
        return (int)constants$241.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void State$set(MemorySegment seg, long index, int x) {
        constants$241.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Protect$VH() {
        return constants$242.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Protect;
     * }
     */
    public static int Protect$get(MemorySegment seg) {
        return (int)constants$242.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Protect;
     * }
     */
    public static void Protect$set(MemorySegment seg, int x) {
        constants$242.const$0.set(seg, x);
    }
    public static int Protect$get(MemorySegment seg, long index) {
        return (int)constants$242.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Protect$set(MemorySegment seg, long index, int x) {
        constants$242.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Type$VH() {
        return constants$242.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)constants$242.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        constants$242.const$1.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)constants$242.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        constants$242.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


