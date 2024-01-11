// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     INT cDig;
 *     ULONG dwInFlags;
 *     ULONG dwOutFlags;
 *     INT cchUsed;
 *     INT nBaseShift;
 *     INT nPwr10;
 * };
 * }
 */
public class NUMPARSE {

    public static MemoryLayout $LAYOUT() {
        return constants$4380.const$2;
    }
    public static VarHandle cDig$VH() {
        return constants$4380.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT cDig;
     * }
     */
    public static int cDig$get(MemorySegment seg) {
        return (int)constants$4380.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT cDig;
     * }
     */
    public static void cDig$set(MemorySegment seg, int x) {
        constants$4380.const$3.set(seg, x);
    }
    public static int cDig$get(MemorySegment seg, long index) {
        return (int)constants$4380.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cDig$set(MemorySegment seg, long index, int x) {
        constants$4380.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwInFlags$VH() {
        return constants$4380.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwInFlags;
     * }
     */
    public static int dwInFlags$get(MemorySegment seg) {
        return (int)constants$4380.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwInFlags;
     * }
     */
    public static void dwInFlags$set(MemorySegment seg, int x) {
        constants$4380.const$4.set(seg, x);
    }
    public static int dwInFlags$get(MemorySegment seg, long index) {
        return (int)constants$4380.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInFlags$set(MemorySegment seg, long index, int x) {
        constants$4380.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwOutFlags$VH() {
        return constants$4380.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwOutFlags;
     * }
     */
    public static int dwOutFlags$get(MemorySegment seg) {
        return (int)constants$4380.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwOutFlags;
     * }
     */
    public static void dwOutFlags$set(MemorySegment seg, int x) {
        constants$4380.const$5.set(seg, x);
    }
    public static int dwOutFlags$get(MemorySegment seg, long index) {
        return (int)constants$4380.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOutFlags$set(MemorySegment seg, long index, int x) {
        constants$4380.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cchUsed$VH() {
        return constants$4381.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT cchUsed;
     * }
     */
    public static int cchUsed$get(MemorySegment seg) {
        return (int)constants$4381.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT cchUsed;
     * }
     */
    public static void cchUsed$set(MemorySegment seg, int x) {
        constants$4381.const$0.set(seg, x);
    }
    public static int cchUsed$get(MemorySegment seg, long index) {
        return (int)constants$4381.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cchUsed$set(MemorySegment seg, long index, int x) {
        constants$4381.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nBaseShift$VH() {
        return constants$4381.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT nBaseShift;
     * }
     */
    public static int nBaseShift$get(MemorySegment seg) {
        return (int)constants$4381.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT nBaseShift;
     * }
     */
    public static void nBaseShift$set(MemorySegment seg, int x) {
        constants$4381.const$1.set(seg, x);
    }
    public static int nBaseShift$get(MemorySegment seg, long index) {
        return (int)constants$4381.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void nBaseShift$set(MemorySegment seg, long index, int x) {
        constants$4381.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nPwr10$VH() {
        return constants$4381.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT nPwr10;
     * }
     */
    public static int nPwr10$get(MemorySegment seg) {
        return (int)constants$4381.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT nPwr10;
     * }
     */
    public static void nPwr10$set(MemorySegment seg, int x) {
        constants$4381.const$2.set(seg, x);
    }
    public static int nPwr10$get(MemorySegment seg, long index) {
        return (int)constants$4381.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void nPwr10$set(MemorySegment seg, long index, int x) {
        constants$4381.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

