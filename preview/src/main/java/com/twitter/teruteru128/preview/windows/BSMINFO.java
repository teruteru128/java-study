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
 *     UINT cbSize;
 *     HDESK hdesk;
 *     HWND hwnd;
 *     LUID luid;
 * };
 * }
 */
public class BSMINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1189.const$3;
    }
    public static VarHandle cbSize$VH() {
        return constants$1189.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1189.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1189.const$4.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1189.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1189.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hdesk$VH() {
        return constants$1189.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HDESK hdesk;
     * }
     */
    public static MemorySegment hdesk$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1189.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HDESK hdesk;
     * }
     */
    public static void hdesk$set(MemorySegment seg, MemorySegment x) {
        constants$1189.const$5.set(seg, x);
    }
    public static MemorySegment hdesk$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1189.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void hdesk$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1189.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwnd$VH() {
        return constants$1190.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static MemorySegment hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1190.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static void hwnd$set(MemorySegment seg, MemorySegment x) {
        constants$1190.const$0.set(seg, x);
    }
    public static MemorySegment hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1190.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1190.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment luid$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


