// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRNAMEDESCAPE {
 *     EMR emr;
 *     INT iEscape;
 *     INT cbDriver;
 *     INT cbEscData;
 *     BYTE EscData[1];
 * };
 * }
 */
public class tagEMRNAMEDESCAPE {

    public static MemoryLayout $LAYOUT() {
        return constants$1112.const$3;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle iEscape$VH() {
        return constants$1112.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT iEscape;
     * }
     */
    public static int iEscape$get(MemorySegment seg) {
        return (int)constants$1112.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT iEscape;
     * }
     */
    public static void iEscape$set(MemorySegment seg, int x) {
        constants$1112.const$4.set(seg, x);
    }
    public static int iEscape$get(MemorySegment seg, long index) {
        return (int)constants$1112.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void iEscape$set(MemorySegment seg, long index, int x) {
        constants$1112.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbDriver$VH() {
        return constants$1112.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT cbDriver;
     * }
     */
    public static int cbDriver$get(MemorySegment seg) {
        return (int)constants$1112.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT cbDriver;
     * }
     */
    public static void cbDriver$set(MemorySegment seg, int x) {
        constants$1112.const$5.set(seg, x);
    }
    public static int cbDriver$get(MemorySegment seg, long index) {
        return (int)constants$1112.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbDriver$set(MemorySegment seg, long index, int x) {
        constants$1112.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbEscData$VH() {
        return constants$1113.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT cbEscData;
     * }
     */
    public static int cbEscData$get(MemorySegment seg) {
        return (int)constants$1113.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT cbEscData;
     * }
     */
    public static void cbEscData$set(MemorySegment seg, int x) {
        constants$1113.const$0.set(seg, x);
    }
    public static int cbEscData$get(MemorySegment seg, long index) {
        return (int)constants$1113.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cbEscData$set(MemorySegment seg, long index, int x) {
        constants$1113.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment EscData$slice(MemorySegment seg) {
        return seg.asSlice(20, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


