// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCIEXYZ {
 *     FXPT2DOT30 ciexyzX;
 *     FXPT2DOT30 ciexyzY;
 *     FXPT2DOT30 ciexyzZ;
 * };
 * }
 */
public class tagCIEXYZ {

    public static MemoryLayout $LAYOUT() {
        return constants$891.const$0;
    }
    public static VarHandle ciexyzX$VH() {
        return constants$891.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FXPT2DOT30 ciexyzX;
     * }
     */
    public static int ciexyzX$get(MemorySegment seg) {
        return (int)constants$891.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FXPT2DOT30 ciexyzX;
     * }
     */
    public static void ciexyzX$set(MemorySegment seg, int x) {
        constants$891.const$1.set(seg, x);
    }
    public static int ciexyzX$get(MemorySegment seg, long index) {
        return (int)constants$891.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ciexyzX$set(MemorySegment seg, long index, int x) {
        constants$891.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ciexyzY$VH() {
        return constants$891.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FXPT2DOT30 ciexyzY;
     * }
     */
    public static int ciexyzY$get(MemorySegment seg) {
        return (int)constants$891.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FXPT2DOT30 ciexyzY;
     * }
     */
    public static void ciexyzY$set(MemorySegment seg, int x) {
        constants$891.const$2.set(seg, x);
    }
    public static int ciexyzY$get(MemorySegment seg, long index) {
        return (int)constants$891.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ciexyzY$set(MemorySegment seg, long index, int x) {
        constants$891.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ciexyzZ$VH() {
        return constants$891.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FXPT2DOT30 ciexyzZ;
     * }
     */
    public static int ciexyzZ$get(MemorySegment seg) {
        return (int)constants$891.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FXPT2DOT30 ciexyzZ;
     * }
     */
    public static void ciexyzZ$set(MemorySegment seg, int x) {
        constants$891.const$3.set(seg, x);
    }
    public static int ciexyzZ$get(MemorySegment seg, long index) {
        return (int)constants$891.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ciexyzZ$set(MemorySegment seg, long index, int x) {
        constants$891.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

