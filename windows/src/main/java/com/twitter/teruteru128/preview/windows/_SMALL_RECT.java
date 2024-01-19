// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SMALL_RECT {
 *     SHORT Left;
 *     SHORT Top;
 *     SHORT Right;
 *     SHORT Bottom;
 * };
 * }
 */
public class _SMALL_RECT {

    public static MemoryLayout $LAYOUT() {
        return constants$1448.const$1;
    }
    public static VarHandle Left$VH() {
        return constants$1448.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SHORT Left;
     * }
     */
    public static short Left$get(MemorySegment seg) {
        return (short)constants$1448.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SHORT Left;
     * }
     */
    public static void Left$set(MemorySegment seg, short x) {
        constants$1448.const$2.set(seg, x);
    }
    public static short Left$get(MemorySegment seg, long index) {
        return (short)constants$1448.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Left$set(MemorySegment seg, long index, short x) {
        constants$1448.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Top$VH() {
        return constants$1448.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SHORT Top;
     * }
     */
    public static short Top$get(MemorySegment seg) {
        return (short)constants$1448.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SHORT Top;
     * }
     */
    public static void Top$set(MemorySegment seg, short x) {
        constants$1448.const$3.set(seg, x);
    }
    public static short Top$get(MemorySegment seg, long index) {
        return (short)constants$1448.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Top$set(MemorySegment seg, long index, short x) {
        constants$1448.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Right$VH() {
        return constants$1448.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SHORT Right;
     * }
     */
    public static short Right$get(MemorySegment seg) {
        return (short)constants$1448.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SHORT Right;
     * }
     */
    public static void Right$set(MemorySegment seg, short x) {
        constants$1448.const$4.set(seg, x);
    }
    public static short Right$get(MemorySegment seg, long index) {
        return (short)constants$1448.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Right$set(MemorySegment seg, long index, short x) {
        constants$1448.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Bottom$VH() {
        return constants$1448.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SHORT Bottom;
     * }
     */
    public static short Bottom$get(MemorySegment seg) {
        return (short)constants$1448.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SHORT Bottom;
     * }
     */
    public static void Bottom$set(MemorySegment seg, short x) {
        constants$1448.const$5.set(seg, x);
    }
    public static short Bottom$get(MemorySegment seg, long index) {
        return (short)constants$1448.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Bottom$set(MemorySegment seg, long index, short x) {
        constants$1448.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

