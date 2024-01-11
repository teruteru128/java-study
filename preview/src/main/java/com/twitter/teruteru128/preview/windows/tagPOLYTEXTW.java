// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagPOLYTEXTW {
 *     int x;
 *     int y;
 *     UINT n;
 *     LPCWSTR lpstr;
 *     UINT uiFlags;
 *     RECT rcl;
 *     int* pdx;
 * };
 * }
 */
public class tagPOLYTEXTW {

    public static MemoryLayout $LAYOUT() {
        return constants$981.const$0;
    }
    public static VarHandle x$VH() {
        return constants$981.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$981.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$981.const$1.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$981.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$981.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$981.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$981.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$981.const$2.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$981.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$981.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle n$VH() {
        return constants$981.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT n;
     * }
     */
    public static int n$get(MemorySegment seg) {
        return (int)constants$981.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT n;
     * }
     */
    public static void n$set(MemorySegment seg, int x) {
        constants$981.const$3.set(seg, x);
    }
    public static int n$get(MemorySegment seg, long index) {
        return (int)constants$981.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void n$set(MemorySegment seg, long index, int x) {
        constants$981.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpstr$VH() {
        return constants$981.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpstr;
     * }
     */
    public static MemorySegment lpstr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$981.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpstr;
     * }
     */
    public static void lpstr$set(MemorySegment seg, MemorySegment x) {
        constants$981.const$4.set(seg, x);
    }
    public static MemorySegment lpstr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$981.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$981.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle uiFlags$VH() {
        return constants$981.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT uiFlags;
     * }
     */
    public static int uiFlags$get(MemorySegment seg) {
        return (int)constants$981.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT uiFlags;
     * }
     */
    public static void uiFlags$set(MemorySegment seg, int x) {
        constants$981.const$5.set(seg, x);
    }
    public static int uiFlags$get(MemorySegment seg, long index) {
        return (int)constants$981.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void uiFlags$set(MemorySegment seg, long index, int x) {
        constants$981.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcl$slice(MemorySegment seg) {
        return seg.asSlice(28, 16);
    }
    public static VarHandle pdx$VH() {
        return constants$982.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int* pdx;
     * }
     */
    public static MemorySegment pdx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$982.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int* pdx;
     * }
     */
    public static void pdx$set(MemorySegment seg, MemorySegment x) {
        constants$982.const$0.set(seg, x);
    }
    public static MemorySegment pdx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$982.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pdx$set(MemorySegment seg, long index, MemorySegment x) {
        constants$982.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


