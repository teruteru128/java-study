// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEVENTMSG {
 *     UINT message;
 *     UINT paramL;
 *     UINT paramH;
 *     DWORD time;
 *     HWND hwnd;
 * };
 * }
 */
public class tagEVENTMSG {

    public static MemoryLayout $LAYOUT() {
        return constants$1140.const$5;
    }
    public static VarHandle message$VH() {
        return constants$1141.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT message;
     * }
     */
    public static int message$get(MemorySegment seg) {
        return (int)constants$1141.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT message;
     * }
     */
    public static void message$set(MemorySegment seg, int x) {
        constants$1141.const$0.set(seg, x);
    }
    public static int message$get(MemorySegment seg, long index) {
        return (int)constants$1141.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void message$set(MemorySegment seg, long index, int x) {
        constants$1141.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle paramL$VH() {
        return constants$1141.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT paramL;
     * }
     */
    public static int paramL$get(MemorySegment seg) {
        return (int)constants$1141.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT paramL;
     * }
     */
    public static void paramL$set(MemorySegment seg, int x) {
        constants$1141.const$1.set(seg, x);
    }
    public static int paramL$get(MemorySegment seg, long index) {
        return (int)constants$1141.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void paramL$set(MemorySegment seg, long index, int x) {
        constants$1141.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle paramH$VH() {
        return constants$1141.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT paramH;
     * }
     */
    public static int paramH$get(MemorySegment seg) {
        return (int)constants$1141.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT paramH;
     * }
     */
    public static void paramH$set(MemorySegment seg, int x) {
        constants$1141.const$2.set(seg, x);
    }
    public static int paramH$get(MemorySegment seg, long index) {
        return (int)constants$1141.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void paramH$set(MemorySegment seg, long index, int x) {
        constants$1141.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle time$VH() {
        return constants$1141.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD time;
     * }
     */
    public static int time$get(MemorySegment seg) {
        return (int)constants$1141.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD time;
     * }
     */
    public static void time$set(MemorySegment seg, int x) {
        constants$1141.const$3.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)constants$1141.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        constants$1141.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwnd$VH() {
        return constants$1141.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static MemorySegment hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1141.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static void hwnd$set(MemorySegment seg, MemorySegment x) {
        constants$1141.const$4.set(seg, x);
    }
    public static MemorySegment hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1141.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1141.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


