// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRSETICMPROFILE {
 *     EMR emr;
 *     DWORD dwFlags;
 *     DWORD cbName;
 *     DWORD cbData;
 *     BYTE Data[1];
 * };
 * }
 */
public class tagEMRSETICMPROFILE {

    public static MemoryLayout $LAYOUT() {
        return constants$1113.const$1;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle dwFlags$VH() {
        return constants$1113.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)constants$1113.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        constants$1113.const$2.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)constants$1113.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        constants$1113.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbName$VH() {
        return constants$1113.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbName;
     * }
     */
    public static int cbName$get(MemorySegment seg) {
        return (int)constants$1113.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbName;
     * }
     */
    public static void cbName$set(MemorySegment seg, int x) {
        constants$1113.const$3.set(seg, x);
    }
    public static int cbName$get(MemorySegment seg, long index) {
        return (int)constants$1113.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cbName$set(MemorySegment seg, long index, int x) {
        constants$1113.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbData$VH() {
        return constants$1113.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static int cbData$get(MemorySegment seg) {
        return (int)constants$1113.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static void cbData$set(MemorySegment seg, int x) {
        constants$1113.const$4.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)constants$1113.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        constants$1113.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(20, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


