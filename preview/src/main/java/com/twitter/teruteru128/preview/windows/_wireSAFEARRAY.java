// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _wireSAFEARRAY {
 *     USHORT cDims;
 *     USHORT fFeatures;
 *     ULONG cbElements;
 *     ULONG cLocks;
 *     SAFEARRAYUNION uArrayStructs;
 *     SAFEARRAYBOUND rgsabound[1];
 * };
 * }
 */
public class _wireSAFEARRAY {

    public static MemoryLayout $LAYOUT() {
        return constants$3413.const$1;
    }
    public static VarHandle cDims$VH() {
        return constants$3413.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT cDims;
     * }
     */
    public static short cDims$get(MemorySegment seg) {
        return (short)constants$3413.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT cDims;
     * }
     */
    public static void cDims$set(MemorySegment seg, short x) {
        constants$3413.const$2.set(seg, x);
    }
    public static short cDims$get(MemorySegment seg, long index) {
        return (short)constants$3413.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cDims$set(MemorySegment seg, long index, short x) {
        constants$3413.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fFeatures$VH() {
        return constants$3413.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT fFeatures;
     * }
     */
    public static short fFeatures$get(MemorySegment seg) {
        return (short)constants$3413.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT fFeatures;
     * }
     */
    public static void fFeatures$set(MemorySegment seg, short x) {
        constants$3413.const$3.set(seg, x);
    }
    public static short fFeatures$get(MemorySegment seg, long index) {
        return (short)constants$3413.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void fFeatures$set(MemorySegment seg, long index, short x) {
        constants$3413.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbElements$VH() {
        return constants$3413.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbElements;
     * }
     */
    public static int cbElements$get(MemorySegment seg) {
        return (int)constants$3413.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbElements;
     * }
     */
    public static void cbElements$set(MemorySegment seg, int x) {
        constants$3413.const$4.set(seg, x);
    }
    public static int cbElements$get(MemorySegment seg, long index) {
        return (int)constants$3413.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbElements$set(MemorySegment seg, long index, int x) {
        constants$3413.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cLocks$VH() {
        return constants$3413.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cLocks;
     * }
     */
    public static int cLocks$get(MemorySegment seg) {
        return (int)constants$3413.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cLocks;
     * }
     */
    public static void cLocks$set(MemorySegment seg, int x) {
        constants$3413.const$5.set(seg, x);
    }
    public static int cLocks$get(MemorySegment seg, long index) {
        return (int)constants$3413.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cLocks$set(MemorySegment seg, long index, int x) {
        constants$3413.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment uArrayStructs$slice(MemorySegment seg) {
        return seg.asSlice(16, 40);
    }
    public static MemorySegment rgsabound$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

