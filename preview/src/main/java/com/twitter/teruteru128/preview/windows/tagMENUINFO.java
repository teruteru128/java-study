// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMENUINFO {
 *     DWORD cbSize;
 *     DWORD fMask;
 *     DWORD dwStyle;
 *     UINT cyMax;
 *     HBRUSH hbrBack;
 *     DWORD dwContextHelpID;
 *     ULONG_PTR dwMenuData;
 * };
 * }
 */
public class tagMENUINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1264.const$1;
    }
    public static VarHandle cbSize$VH() {
        return constants$1264.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1264.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1264.const$2.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1264.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1264.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fMask$VH() {
        return constants$1264.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD fMask;
     * }
     */
    public static int fMask$get(MemorySegment seg) {
        return (int)constants$1264.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD fMask;
     * }
     */
    public static void fMask$set(MemorySegment seg, int x) {
        constants$1264.const$3.set(seg, x);
    }
    public static int fMask$get(MemorySegment seg, long index) {
        return (int)constants$1264.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void fMask$set(MemorySegment seg, long index, int x) {
        constants$1264.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwStyle$VH() {
        return constants$1264.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwStyle;
     * }
     */
    public static int dwStyle$get(MemorySegment seg) {
        return (int)constants$1264.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwStyle;
     * }
     */
    public static void dwStyle$set(MemorySegment seg, int x) {
        constants$1264.const$4.set(seg, x);
    }
    public static int dwStyle$get(MemorySegment seg, long index) {
        return (int)constants$1264.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStyle$set(MemorySegment seg, long index, int x) {
        constants$1264.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cyMax$VH() {
        return constants$1264.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cyMax;
     * }
     */
    public static int cyMax$get(MemorySegment seg) {
        return (int)constants$1264.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cyMax;
     * }
     */
    public static void cyMax$set(MemorySegment seg, int x) {
        constants$1264.const$5.set(seg, x);
    }
    public static int cyMax$get(MemorySegment seg, long index) {
        return (int)constants$1264.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cyMax$set(MemorySegment seg, long index, int x) {
        constants$1264.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hbrBack$VH() {
        return constants$1265.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HBRUSH hbrBack;
     * }
     */
    public static MemorySegment hbrBack$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1265.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HBRUSH hbrBack;
     * }
     */
    public static void hbrBack$set(MemorySegment seg, MemorySegment x) {
        constants$1265.const$0.set(seg, x);
    }
    public static MemorySegment hbrBack$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1265.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void hbrBack$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1265.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwContextHelpID$VH() {
        return constants$1265.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwContextHelpID;
     * }
     */
    public static int dwContextHelpID$get(MemorySegment seg) {
        return (int)constants$1265.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwContextHelpID;
     * }
     */
    public static void dwContextHelpID$set(MemorySegment seg, int x) {
        constants$1265.const$1.set(seg, x);
    }
    public static int dwContextHelpID$get(MemorySegment seg, long index) {
        return (int)constants$1265.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwContextHelpID$set(MemorySegment seg, long index, int x) {
        constants$1265.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwMenuData$VH() {
        return constants$1265.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR dwMenuData;
     * }
     */
    public static long dwMenuData$get(MemorySegment seg) {
        return (long)constants$1265.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR dwMenuData;
     * }
     */
    public static void dwMenuData$set(MemorySegment seg, long x) {
        constants$1265.const$2.set(seg, x);
    }
    public static long dwMenuData$get(MemorySegment seg, long index) {
        return (long)constants$1265.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMenuData$set(MemorySegment seg, long index, long x) {
        constants$1265.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


