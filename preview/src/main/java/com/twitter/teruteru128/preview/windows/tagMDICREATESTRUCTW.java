// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMDICREATESTRUCTW {
 *     LPCWSTR szClass;
 *     LPCWSTR szTitle;
 *     HANDLE hOwner;
 *     int x;
 *     int y;
 *     int cx;
 *     int cy;
 *     DWORD style;
 *     LPARAM lParam;
 * };
 * }
 */
public class tagMDICREATESTRUCTW {

    public static MemoryLayout $LAYOUT() {
        return constants$1329.const$2;
    }
    public static VarHandle szClass$VH() {
        return constants$1329.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR szClass;
     * }
     */
    public static MemorySegment szClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1329.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR szClass;
     * }
     */
    public static void szClass$set(MemorySegment seg, MemorySegment x) {
        constants$1329.const$3.set(seg, x);
    }
    public static MemorySegment szClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1329.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void szClass$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1329.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle szTitle$VH() {
        return constants$1329.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR szTitle;
     * }
     */
    public static MemorySegment szTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1329.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR szTitle;
     * }
     */
    public static void szTitle$set(MemorySegment seg, MemorySegment x) {
        constants$1329.const$4.set(seg, x);
    }
    public static MemorySegment szTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1329.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void szTitle$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1329.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hOwner$VH() {
        return constants$1329.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE hOwner;
     * }
     */
    public static MemorySegment hOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1329.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE hOwner;
     * }
     */
    public static void hOwner$set(MemorySegment seg, MemorySegment x) {
        constants$1329.const$5.set(seg, x);
    }
    public static MemorySegment hOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1329.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void hOwner$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1329.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x$VH() {
        return constants$1330.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$1330.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$1330.const$0.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$1330.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$1330.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$1330.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$1330.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$1330.const$1.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$1330.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$1330.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cx$VH() {
        return constants$1330.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cx;
     * }
     */
    public static int cx$get(MemorySegment seg) {
        return (int)constants$1330.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cx;
     * }
     */
    public static void cx$set(MemorySegment seg, int x) {
        constants$1330.const$2.set(seg, x);
    }
    public static int cx$get(MemorySegment seg, long index) {
        return (int)constants$1330.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cx$set(MemorySegment seg, long index, int x) {
        constants$1330.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cy$VH() {
        return constants$1330.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cy;
     * }
     */
    public static int cy$get(MemorySegment seg) {
        return (int)constants$1330.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cy;
     * }
     */
    public static void cy$set(MemorySegment seg, int x) {
        constants$1330.const$3.set(seg, x);
    }
    public static int cy$get(MemorySegment seg, long index) {
        return (int)constants$1330.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cy$set(MemorySegment seg, long index, int x) {
        constants$1330.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle style$VH() {
        return constants$1330.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD style;
     * }
     */
    public static int style$get(MemorySegment seg) {
        return (int)constants$1330.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD style;
     * }
     */
    public static void style$set(MemorySegment seg, int x) {
        constants$1330.const$4.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)constants$1330.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        constants$1330.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lParam$VH() {
        return constants$1330.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPARAM lParam;
     * }
     */
    public static long lParam$get(MemorySegment seg) {
        return (long)constants$1330.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPARAM lParam;
     * }
     */
    public static void lParam$set(MemorySegment seg, long x) {
        constants$1330.const$5.set(seg, x);
    }
    public static long lParam$get(MemorySegment seg, long index) {
        return (long)constants$1330.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lParam$set(MemorySegment seg, long index, long x) {
        constants$1330.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


