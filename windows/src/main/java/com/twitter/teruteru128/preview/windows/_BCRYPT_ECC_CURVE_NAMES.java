// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BCRYPT_ECC_CURVE_NAMES {
 *     ULONG dwEccCurveNames;
 *     LPWSTR* pEccCurveNames;
 * };
 * }
 */
public class _BCRYPT_ECC_CURVE_NAMES {

    public static MemoryLayout $LAYOUT() {
        return constants$1955.const$0;
    }
    public static VarHandle dwEccCurveNames$VH() {
        return constants$1955.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwEccCurveNames;
     * }
     */
    public static int dwEccCurveNames$get(MemorySegment seg) {
        return (int)constants$1955.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwEccCurveNames;
     * }
     */
    public static void dwEccCurveNames$set(MemorySegment seg, int x) {
        constants$1955.const$1.set(seg, x);
    }
    public static int dwEccCurveNames$get(MemorySegment seg, long index) {
        return (int)constants$1955.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEccCurveNames$set(MemorySegment seg, long index, int x) {
        constants$1955.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pEccCurveNames$VH() {
        return constants$1955.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR* pEccCurveNames;
     * }
     */
    public static MemorySegment pEccCurveNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1955.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR* pEccCurveNames;
     * }
     */
    public static void pEccCurveNames$set(MemorySegment seg, MemorySegment x) {
        constants$1955.const$2.set(seg, x);
    }
    public static MemorySegment pEccCurveNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1955.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pEccCurveNames$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1955.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

