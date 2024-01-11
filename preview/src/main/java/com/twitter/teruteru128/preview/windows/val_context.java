// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct val_context {
 *     int valuelen;
 *     LPVOID value_context;
 *     LPVOID val_buff_ptr;
 * };
 * }
 */
public class val_context {

    public static MemoryLayout $LAYOUT() {
        return constants$1480.const$1;
    }
    public static VarHandle valuelen$VH() {
        return constants$1480.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int valuelen;
     * }
     */
    public static int valuelen$get(MemorySegment seg) {
        return (int)constants$1480.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int valuelen;
     * }
     */
    public static void valuelen$set(MemorySegment seg, int x) {
        constants$1480.const$2.set(seg, x);
    }
    public static int valuelen$get(MemorySegment seg, long index) {
        return (int)constants$1480.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void valuelen$set(MemorySegment seg, long index, int x) {
        constants$1480.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle value_context$VH() {
        return constants$1480.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID value_context;
     * }
     */
    public static MemorySegment value_context$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1480.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID value_context;
     * }
     */
    public static void value_context$set(MemorySegment seg, MemorySegment x) {
        constants$1480.const$3.set(seg, x);
    }
    public static MemorySegment value_context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1480.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void value_context$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1480.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle val_buff_ptr$VH() {
        return constants$1480.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID val_buff_ptr;
     * }
     */
    public static MemorySegment val_buff_ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1480.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID val_buff_ptr;
     * }
     */
    public static void val_buff_ptr$set(MemorySegment seg, MemorySegment x) {
        constants$1480.const$4.set(seg, x);
    }
    public static MemorySegment val_buff_ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1480.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void val_buff_ptr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1480.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


