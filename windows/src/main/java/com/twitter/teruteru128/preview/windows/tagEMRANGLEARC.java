// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRANGLEARC {
 *     EMR emr;
 *     POINTL ptlCenter;
 *     DWORD nRadius;
 *     FLOAT eStartAngle;
 *     FLOAT eSweepAngle;
 * };
 * }
 */
public class tagEMRANGLEARC {

    public static MemoryLayout $LAYOUT() {
        return constants$1082.const$2;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment ptlCenter$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static VarHandle nRadius$VH() {
        return constants$1082.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nRadius;
     * }
     */
    public static int nRadius$get(MemorySegment seg) {
        return (int)constants$1082.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nRadius;
     * }
     */
    public static void nRadius$set(MemorySegment seg, int x) {
        constants$1082.const$3.set(seg, x);
    }
    public static int nRadius$get(MemorySegment seg, long index) {
        return (int)constants$1082.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void nRadius$set(MemorySegment seg, long index, int x) {
        constants$1082.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle eStartAngle$VH() {
        return constants$1082.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FLOAT eStartAngle;
     * }
     */
    public static float eStartAngle$get(MemorySegment seg) {
        return (float)constants$1082.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FLOAT eStartAngle;
     * }
     */
    public static void eStartAngle$set(MemorySegment seg, float x) {
        constants$1082.const$4.set(seg, x);
    }
    public static float eStartAngle$get(MemorySegment seg, long index) {
        return (float)constants$1082.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void eStartAngle$set(MemorySegment seg, long index, float x) {
        constants$1082.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle eSweepAngle$VH() {
        return constants$1082.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FLOAT eSweepAngle;
     * }
     */
    public static float eSweepAngle$get(MemorySegment seg) {
        return (float)constants$1082.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FLOAT eSweepAngle;
     * }
     */
    public static void eSweepAngle$set(MemorySegment seg, float x) {
        constants$1082.const$5.set(seg, x);
    }
    public static float eSweepAngle$get(MemorySegment seg, long index) {
        return (float)constants$1082.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void eSweepAngle$set(MemorySegment seg, long index, float x) {
        constants$1082.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

