// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NCRYPT_KEY_ATTEST_PADDING_INFO {
 *     ULONG magic;
 *     PUCHAR pbKeyBlob;
 *     ULONG cbKeyBlob;
 *     PUCHAR pbKeyAuth;
 *     ULONG cbKeyAuth;
 * };
 * }
 */
public class _NCRYPT_KEY_ATTEST_PADDING_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1980.const$2;
    }
    public static VarHandle magic$VH() {
        return constants$1980.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG magic;
     * }
     */
    public static int magic$get(MemorySegment seg) {
        return (int)constants$1980.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG magic;
     * }
     */
    public static void magic$set(MemorySegment seg, int x) {
        constants$1980.const$3.set(seg, x);
    }
    public static int magic$get(MemorySegment seg, long index) {
        return (int)constants$1980.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void magic$set(MemorySegment seg, long index, int x) {
        constants$1980.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbKeyBlob$VH() {
        return constants$1980.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbKeyBlob;
     * }
     */
    public static MemorySegment pbKeyBlob$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1980.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbKeyBlob;
     * }
     */
    public static void pbKeyBlob$set(MemorySegment seg, MemorySegment x) {
        constants$1980.const$4.set(seg, x);
    }
    public static MemorySegment pbKeyBlob$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1980.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pbKeyBlob$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1980.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbKeyBlob$VH() {
        return constants$1980.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbKeyBlob;
     * }
     */
    public static int cbKeyBlob$get(MemorySegment seg) {
        return (int)constants$1980.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbKeyBlob;
     * }
     */
    public static void cbKeyBlob$set(MemorySegment seg, int x) {
        constants$1980.const$5.set(seg, x);
    }
    public static int cbKeyBlob$get(MemorySegment seg, long index) {
        return (int)constants$1980.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbKeyBlob$set(MemorySegment seg, long index, int x) {
        constants$1980.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbKeyAuth$VH() {
        return constants$1981.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbKeyAuth;
     * }
     */
    public static MemorySegment pbKeyAuth$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1981.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbKeyAuth;
     * }
     */
    public static void pbKeyAuth$set(MemorySegment seg, MemorySegment x) {
        constants$1981.const$0.set(seg, x);
    }
    public static MemorySegment pbKeyAuth$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1981.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pbKeyAuth$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1981.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbKeyAuth$VH() {
        return constants$1981.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbKeyAuth;
     * }
     */
    public static int cbKeyAuth$get(MemorySegment seg) {
        return (int)constants$1981.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbKeyAuth;
     * }
     */
    public static void cbKeyAuth$set(MemorySegment seg, int x) {
        constants$1981.const$1.set(seg, x);
    }
    public static int cbKeyAuth$get(MemorySegment seg, long index) {
        return (int)constants$1981.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbKeyAuth$set(MemorySegment seg, long index, int x) {
        constants$1981.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

