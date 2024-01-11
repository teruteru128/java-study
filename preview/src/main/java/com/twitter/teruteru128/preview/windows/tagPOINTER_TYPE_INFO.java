// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagPOINTER_TYPE_INFO {
 *     POINTER_INPUT_TYPE type;
 *     union {
 *         POINTER_TOUCH_INFO touchInfo;
 *         POINTER_PEN_INFO penInfo;
 *     };
 * };
 * }
 */
public class tagPOINTER_TYPE_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1241.const$3;
    }
    public static VarHandle type$VH() {
        return constants$1241.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * POINTER_INPUT_TYPE type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$1241.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * POINTER_INPUT_TYPE type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$1241.const$4.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$1241.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$1241.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment touchInfo$slice(MemorySegment seg) {
        return seg.asSlice(8, 144);
    }
    public static MemorySegment penInfo$slice(MemorySegment seg) {
        return seg.asSlice(8, 120);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


