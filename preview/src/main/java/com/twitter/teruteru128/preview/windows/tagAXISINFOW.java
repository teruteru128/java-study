// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagAXISINFOW {
 *     LONG axMinValue;
 *     LONG axMaxValue;
 *     WCHAR axAxisName[16];
 * };
 * }
 */
public class tagAXISINFOW {

    public static MemoryLayout $LAYOUT() {
        return constants$1025.const$4;
    }
    public static VarHandle axMinValue$VH() {
        return constants$1025.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG axMinValue;
     * }
     */
    public static int axMinValue$get(MemorySegment seg) {
        return (int)constants$1025.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG axMinValue;
     * }
     */
    public static void axMinValue$set(MemorySegment seg, int x) {
        constants$1025.const$5.set(seg, x);
    }
    public static int axMinValue$get(MemorySegment seg, long index) {
        return (int)constants$1025.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void axMinValue$set(MemorySegment seg, long index, int x) {
        constants$1025.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle axMaxValue$VH() {
        return constants$1026.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG axMaxValue;
     * }
     */
    public static int axMaxValue$get(MemorySegment seg) {
        return (int)constants$1026.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG axMaxValue;
     * }
     */
    public static void axMaxValue$set(MemorySegment seg, int x) {
        constants$1026.const$0.set(seg, x);
    }
    public static int axMaxValue$get(MemorySegment seg, long index) {
        return (int)constants$1026.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void axMaxValue$set(MemorySegment seg, long index, int x) {
        constants$1026.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment axAxisName$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


