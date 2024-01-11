// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_DIAGNOSTIC_REQUEST {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD Flags;
 *     STORAGE_DIAGNOSTIC_TARGET_TYPE TargetType;
 *     STORAGE_DIAGNOSTIC_LEVEL Level;
 * };
 * }
 */
public class _STORAGE_DIAGNOSTIC_REQUEST {

    public static MemoryLayout $LAYOUT() {
        return constants$2468.const$2;
    }
    public static VarHandle Version$VH() {
        return constants$2468.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2468.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2468.const$3.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2468.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2468.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$2468.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2468.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2468.const$4.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2468.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2468.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$2468.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$2468.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$2468.const$5.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$2468.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$2468.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TargetType$VH() {
        return constants$2469.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_DIAGNOSTIC_TARGET_TYPE TargetType;
     * }
     */
    public static int TargetType$get(MemorySegment seg) {
        return (int)constants$2469.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_DIAGNOSTIC_TARGET_TYPE TargetType;
     * }
     */
    public static void TargetType$set(MemorySegment seg, int x) {
        constants$2469.const$0.set(seg, x);
    }
    public static int TargetType$get(MemorySegment seg, long index) {
        return (int)constants$2469.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetType$set(MemorySegment seg, long index, int x) {
        constants$2469.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Level$VH() {
        return constants$2469.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_DIAGNOSTIC_LEVEL Level;
     * }
     */
    public static int Level$get(MemorySegment seg) {
        return (int)constants$2469.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_DIAGNOSTIC_LEVEL Level;
     * }
     */
    public static void Level$set(MemorySegment seg, int x) {
        constants$2469.const$1.set(seg, x);
    }
    public static int Level$get(MemorySegment seg, long index) {
        return (int)constants$2469.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Level$set(MemorySegment seg, long index, int x) {
        constants$2469.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


