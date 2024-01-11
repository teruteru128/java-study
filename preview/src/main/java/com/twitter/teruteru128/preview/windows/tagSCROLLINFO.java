// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagSCROLLINFO {
 *     UINT cbSize;
 *     UINT fMask;
 *     int nMin;
 *     int nMax;
 *     UINT nPage;
 *     int nPos;
 *     int nTrackPos;
 * };
 * }
 */
public class tagSCROLLINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1326.const$0;
    }
    public static VarHandle cbSize$VH() {
        return constants$1326.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1326.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1326.const$1.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1326.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1326.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fMask$VH() {
        return constants$1326.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT fMask;
     * }
     */
    public static int fMask$get(MemorySegment seg) {
        return (int)constants$1326.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT fMask;
     * }
     */
    public static void fMask$set(MemorySegment seg, int x) {
        constants$1326.const$2.set(seg, x);
    }
    public static int fMask$get(MemorySegment seg, long index) {
        return (int)constants$1326.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void fMask$set(MemorySegment seg, long index, int x) {
        constants$1326.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nMin$VH() {
        return constants$1326.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nMin;
     * }
     */
    public static int nMin$get(MemorySegment seg) {
        return (int)constants$1326.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nMin;
     * }
     */
    public static void nMin$set(MemorySegment seg, int x) {
        constants$1326.const$3.set(seg, x);
    }
    public static int nMin$get(MemorySegment seg, long index) {
        return (int)constants$1326.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void nMin$set(MemorySegment seg, long index, int x) {
        constants$1326.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nMax$VH() {
        return constants$1326.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nMax;
     * }
     */
    public static int nMax$get(MemorySegment seg) {
        return (int)constants$1326.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nMax;
     * }
     */
    public static void nMax$set(MemorySegment seg, int x) {
        constants$1326.const$4.set(seg, x);
    }
    public static int nMax$get(MemorySegment seg, long index) {
        return (int)constants$1326.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void nMax$set(MemorySegment seg, long index, int x) {
        constants$1326.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nPage$VH() {
        return constants$1326.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT nPage;
     * }
     */
    public static int nPage$get(MemorySegment seg) {
        return (int)constants$1326.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT nPage;
     * }
     */
    public static void nPage$set(MemorySegment seg, int x) {
        constants$1326.const$5.set(seg, x);
    }
    public static int nPage$get(MemorySegment seg, long index) {
        return (int)constants$1326.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void nPage$set(MemorySegment seg, long index, int x) {
        constants$1326.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nPos$VH() {
        return constants$1327.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nPos;
     * }
     */
    public static int nPos$get(MemorySegment seg) {
        return (int)constants$1327.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nPos;
     * }
     */
    public static void nPos$set(MemorySegment seg, int x) {
        constants$1327.const$0.set(seg, x);
    }
    public static int nPos$get(MemorySegment seg, long index) {
        return (int)constants$1327.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void nPos$set(MemorySegment seg, long index, int x) {
        constants$1327.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nTrackPos$VH() {
        return constants$1327.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nTrackPos;
     * }
     */
    public static int nTrackPos$get(MemorySegment seg) {
        return (int)constants$1327.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nTrackPos;
     * }
     */
    public static void nTrackPos$set(MemorySegment seg, int x) {
        constants$1327.const$1.set(seg, x);
    }
    public static int nTrackPos$get(MemorySegment seg, long index) {
        return (int)constants$1327.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void nTrackPos$set(MemorySegment seg, long index, int x) {
        constants$1327.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


