// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMDINEXTMENU {
 *     HMENU hmenuIn;
 *     HMENU hmenuNext;
 *     HWND hwndNext;
 * };
 * }
 */
public class tagMDINEXTMENU {

    public static MemoryLayout $LAYOUT() {
        return constants$1167.const$0;
    }
    public static VarHandle hmenuIn$VH() {
        return constants$1167.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HMENU hmenuIn;
     * }
     */
    public static MemorySegment hmenuIn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1167.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HMENU hmenuIn;
     * }
     */
    public static void hmenuIn$set(MemorySegment seg, MemorySegment x) {
        constants$1167.const$1.set(seg, x);
    }
    public static MemorySegment hmenuIn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1167.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void hmenuIn$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1167.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hmenuNext$VH() {
        return constants$1167.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HMENU hmenuNext;
     * }
     */
    public static MemorySegment hmenuNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1167.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HMENU hmenuNext;
     * }
     */
    public static void hmenuNext$set(MemorySegment seg, MemorySegment x) {
        constants$1167.const$2.set(seg, x);
    }
    public static MemorySegment hmenuNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1167.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void hmenuNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1167.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwndNext$VH() {
        return constants$1167.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndNext;
     * }
     */
    public static MemorySegment hwndNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1167.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndNext;
     * }
     */
    public static void hwndNext$set(MemorySegment seg, MemorySegment x) {
        constants$1167.const$3.set(seg, x);
    }
    public static MemorySegment hwndNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1167.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1167.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

