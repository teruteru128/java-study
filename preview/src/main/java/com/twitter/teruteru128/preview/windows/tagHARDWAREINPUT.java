// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagHARDWAREINPUT {
 *     DWORD uMsg;
 *     WORD wParamL;
 *     WORD wParamH;
 * };
 * }
 */
public class tagHARDWAREINPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$1231.const$0;
    }
    public static VarHandle uMsg$VH() {
        return constants$1231.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD uMsg;
     * }
     */
    public static int uMsg$get(MemorySegment seg) {
        return (int)constants$1231.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD uMsg;
     * }
     */
    public static void uMsg$set(MemorySegment seg, int x) {
        constants$1231.const$1.set(seg, x);
    }
    public static int uMsg$get(MemorySegment seg, long index) {
        return (int)constants$1231.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void uMsg$set(MemorySegment seg, long index, int x) {
        constants$1231.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wParamL$VH() {
        return constants$1231.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wParamL;
     * }
     */
    public static short wParamL$get(MemorySegment seg) {
        return (short)constants$1231.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wParamL;
     * }
     */
    public static void wParamL$set(MemorySegment seg, short x) {
        constants$1231.const$2.set(seg, x);
    }
    public static short wParamL$get(MemorySegment seg, long index) {
        return (short)constants$1231.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void wParamL$set(MemorySegment seg, long index, short x) {
        constants$1231.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wParamH$VH() {
        return constants$1231.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wParamH;
     * }
     */
    public static short wParamH$get(MemorySegment seg) {
        return (short)constants$1231.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wParamH;
     * }
     */
    public static void wParamH$set(MemorySegment seg, short x) {
        constants$1231.const$3.set(seg, x);
    }
    public static short wParamH$get(MemorySegment seg, long index) {
        return (short)constants$1231.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void wParamH$set(MemorySegment seg, long index, short x) {
        constants$1231.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


