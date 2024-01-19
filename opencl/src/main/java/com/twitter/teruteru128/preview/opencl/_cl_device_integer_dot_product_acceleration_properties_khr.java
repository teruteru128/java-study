// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _cl_device_integer_dot_product_acceleration_properties_khr {
 *     cl_bool signed_accelerated;
 *     cl_bool unsigned_accelerated;
 *     cl_bool mixed_signedness_accelerated;
 *     cl_bool accumulating_saturating_signed_accelerated;
 *     cl_bool accumulating_saturating_unsigned_accelerated;
 *     cl_bool accumulating_saturating_mixed_signedness_accelerated;
 * };
 * }
 */
public class _cl_device_integer_dot_product_acceleration_properties_khr {

    public static MemoryLayout $LAYOUT() {
        return constants$235.const$4;
    }
    public static VarHandle signed_accelerated$VH() {
        return constants$235.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_bool signed_accelerated;
     * }
     */
    public static int signed_accelerated$get(MemorySegment seg) {
        return (int)constants$235.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_bool signed_accelerated;
     * }
     */
    public static void signed_accelerated$set(MemorySegment seg, int x) {
        constants$235.const$5.set(seg, x);
    }
    public static int signed_accelerated$get(MemorySegment seg, long index) {
        return (int)constants$235.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void signed_accelerated$set(MemorySegment seg, long index, int x) {
        constants$235.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle unsigned_accelerated$VH() {
        return constants$236.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_bool unsigned_accelerated;
     * }
     */
    public static int unsigned_accelerated$get(MemorySegment seg) {
        return (int)constants$236.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_bool unsigned_accelerated;
     * }
     */
    public static void unsigned_accelerated$set(MemorySegment seg, int x) {
        constants$236.const$0.set(seg, x);
    }
    public static int unsigned_accelerated$get(MemorySegment seg, long index) {
        return (int)constants$236.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void unsigned_accelerated$set(MemorySegment seg, long index, int x) {
        constants$236.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mixed_signedness_accelerated$VH() {
        return constants$236.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_bool mixed_signedness_accelerated;
     * }
     */
    public static int mixed_signedness_accelerated$get(MemorySegment seg) {
        return (int)constants$236.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_bool mixed_signedness_accelerated;
     * }
     */
    public static void mixed_signedness_accelerated$set(MemorySegment seg, int x) {
        constants$236.const$1.set(seg, x);
    }
    public static int mixed_signedness_accelerated$get(MemorySegment seg, long index) {
        return (int)constants$236.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void mixed_signedness_accelerated$set(MemorySegment seg, long index, int x) {
        constants$236.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accumulating_saturating_signed_accelerated$VH() {
        return constants$236.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_bool accumulating_saturating_signed_accelerated;
     * }
     */
    public static int accumulating_saturating_signed_accelerated$get(MemorySegment seg) {
        return (int)constants$236.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_bool accumulating_saturating_signed_accelerated;
     * }
     */
    public static void accumulating_saturating_signed_accelerated$set(MemorySegment seg, int x) {
        constants$236.const$2.set(seg, x);
    }
    public static int accumulating_saturating_signed_accelerated$get(MemorySegment seg, long index) {
        return (int)constants$236.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void accumulating_saturating_signed_accelerated$set(MemorySegment seg, long index, int x) {
        constants$236.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accumulating_saturating_unsigned_accelerated$VH() {
        return constants$236.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_bool accumulating_saturating_unsigned_accelerated;
     * }
     */
    public static int accumulating_saturating_unsigned_accelerated$get(MemorySegment seg) {
        return (int)constants$236.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_bool accumulating_saturating_unsigned_accelerated;
     * }
     */
    public static void accumulating_saturating_unsigned_accelerated$set(MemorySegment seg, int x) {
        constants$236.const$3.set(seg, x);
    }
    public static int accumulating_saturating_unsigned_accelerated$get(MemorySegment seg, long index) {
        return (int)constants$236.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void accumulating_saturating_unsigned_accelerated$set(MemorySegment seg, long index, int x) {
        constants$236.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accumulating_saturating_mixed_signedness_accelerated$VH() {
        return constants$236.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_bool accumulating_saturating_mixed_signedness_accelerated;
     * }
     */
    public static int accumulating_saturating_mixed_signedness_accelerated$get(MemorySegment seg) {
        return (int)constants$236.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_bool accumulating_saturating_mixed_signedness_accelerated;
     * }
     */
    public static void accumulating_saturating_mixed_signedness_accelerated$set(MemorySegment seg, int x) {
        constants$236.const$4.set(seg, x);
    }
    public static int accumulating_saturating_mixed_signedness_accelerated$get(MemorySegment seg, long index) {
        return (int)constants$236.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void accumulating_saturating_mixed_signedness_accelerated$set(MemorySegment seg, long index, int x) {
        constants$236.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

