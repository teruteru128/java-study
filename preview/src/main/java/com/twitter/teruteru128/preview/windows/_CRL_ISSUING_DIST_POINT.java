// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRL_ISSUING_DIST_POINT {
 *     CRL_DIST_POINT_NAME DistPointName;
 *     BOOL fOnlyContainsUserCerts;
 *     BOOL fOnlyContainsCACerts;
 *     CRYPT_BIT_BLOB OnlySomeReasonFlags;
 *     BOOL fIndirectCRL;
 * };
 * }
 */
public class _CRL_ISSUING_DIST_POINT {

    public static MemoryLayout $LAYOUT() {
        return constants$2040.const$1;
    }
    public static MemorySegment DistPointName$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static VarHandle fOnlyContainsUserCerts$VH() {
        return constants$2040.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fOnlyContainsUserCerts;
     * }
     */
    public static int fOnlyContainsUserCerts$get(MemorySegment seg) {
        return (int)constants$2040.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fOnlyContainsUserCerts;
     * }
     */
    public static void fOnlyContainsUserCerts$set(MemorySegment seg, int x) {
        constants$2040.const$2.set(seg, x);
    }
    public static int fOnlyContainsUserCerts$get(MemorySegment seg, long index) {
        return (int)constants$2040.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void fOnlyContainsUserCerts$set(MemorySegment seg, long index, int x) {
        constants$2040.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fOnlyContainsCACerts$VH() {
        return constants$2040.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fOnlyContainsCACerts;
     * }
     */
    public static int fOnlyContainsCACerts$get(MemorySegment seg) {
        return (int)constants$2040.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fOnlyContainsCACerts;
     * }
     */
    public static void fOnlyContainsCACerts$set(MemorySegment seg, int x) {
        constants$2040.const$3.set(seg, x);
    }
    public static int fOnlyContainsCACerts$get(MemorySegment seg, long index) {
        return (int)constants$2040.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void fOnlyContainsCACerts$set(MemorySegment seg, long index, int x) {
        constants$2040.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment OnlySomeReasonFlags$slice(MemorySegment seg) {
        return seg.asSlice(32, 24);
    }
    public static VarHandle fIndirectCRL$VH() {
        return constants$2040.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fIndirectCRL;
     * }
     */
    public static int fIndirectCRL$get(MemorySegment seg) {
        return (int)constants$2040.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fIndirectCRL;
     * }
     */
    public static void fIndirectCRL$set(MemorySegment seg, int x) {
        constants$2040.const$4.set(seg, x);
    }
    public static int fIndirectCRL$get(MemorySegment seg, long index) {
        return (int)constants$2040.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void fIndirectCRL$set(MemorySegment seg, long index, int x) {
        constants$2040.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

