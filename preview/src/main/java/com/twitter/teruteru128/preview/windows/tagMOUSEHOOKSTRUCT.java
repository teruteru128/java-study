// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMOUSEHOOKSTRUCT {
 *     POINT pt;
 *     HWND hwnd;
 *     UINT wHitTestCode;
 *     ULONG_PTR dwExtraInfo;
 * };
 * }
 */
public class tagMOUSEHOOKSTRUCT {

    public static MemoryLayout $LAYOUT() {
        return constants$1146.const$3;
    }
    public static MemorySegment pt$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle hwnd$VH() {
        return constants$1146.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static MemorySegment hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1146.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static void hwnd$set(MemorySegment seg, MemorySegment x) {
        constants$1146.const$4.set(seg, x);
    }
    public static MemorySegment hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1146.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1146.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wHitTestCode$VH() {
        return constants$1146.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wHitTestCode;
     * }
     */
    public static int wHitTestCode$get(MemorySegment seg) {
        return (int)constants$1146.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wHitTestCode;
     * }
     */
    public static void wHitTestCode$set(MemorySegment seg, int x) {
        constants$1146.const$5.set(seg, x);
    }
    public static int wHitTestCode$get(MemorySegment seg, long index) {
        return (int)constants$1146.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void wHitTestCode$set(MemorySegment seg, long index, int x) {
        constants$1146.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwExtraInfo$VH() {
        return constants$1147.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR dwExtraInfo;
     * }
     */
    public static long dwExtraInfo$get(MemorySegment seg) {
        return (long)constants$1147.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR dwExtraInfo;
     * }
     */
    public static void dwExtraInfo$set(MemorySegment seg, long x) {
        constants$1147.const$0.set(seg, x);
    }
    public static long dwExtraInfo$get(MemorySegment seg, long index) {
        return (long)constants$1147.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtraInfo$set(MemorySegment seg, long index, long x) {
        constants$1147.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


