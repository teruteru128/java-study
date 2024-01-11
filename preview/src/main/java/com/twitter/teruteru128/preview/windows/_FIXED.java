// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FIXED {
 *     WORD fract;
 *     short value;
 * };
 * }
 */
public class _FIXED {

    public static MemoryLayout $LAYOUT() {
        return constants$982.const$1;
    }
    public static VarHandle fract$VH() {
        return constants$982.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD fract;
     * }
     */
    public static short fract$get(MemorySegment seg) {
        return (short)constants$982.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD fract;
     * }
     */
    public static void fract$set(MemorySegment seg, short x) {
        constants$982.const$2.set(seg, x);
    }
    public static short fract$get(MemorySegment seg, long index) {
        return (short)constants$982.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void fract$set(MemorySegment seg, long index, short x) {
        constants$982.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle value$VH() {
        return constants$982.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short value;
     * }
     */
    public static short value$get(MemorySegment seg) {
        return (short)constants$982.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short value;
     * }
     */
    public static void value$set(MemorySegment seg, short x) {
        constants$982.const$3.set(seg, x);
    }
    public static short value$get(MemorySegment seg, long index) {
        return (short)constants$982.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, short x) {
        constants$982.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

