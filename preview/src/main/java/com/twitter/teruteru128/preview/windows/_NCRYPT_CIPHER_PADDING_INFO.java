// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NCRYPT_CIPHER_PADDING_INFO {
 *     ULONG cbSize;
 *     DWORD dwFlags;
 *     PUCHAR pbIV;
 *     ULONG cbIV;
 *     PUCHAR pbOtherInfo;
 *     ULONG cbOtherInfo;
 * };
 * }
 */
public class _NCRYPT_CIPHER_PADDING_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1978.const$4;
    }
    public static VarHandle cbSize$VH() {
        return constants$1978.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1978.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1978.const$5.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1978.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1978.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwFlags$VH() {
        return constants$1979.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)constants$1979.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        constants$1979.const$0.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)constants$1979.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        constants$1979.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbIV$VH() {
        return constants$1979.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbIV;
     * }
     */
    public static MemorySegment pbIV$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1979.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbIV;
     * }
     */
    public static void pbIV$set(MemorySegment seg, MemorySegment x) {
        constants$1979.const$1.set(seg, x);
    }
    public static MemorySegment pbIV$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1979.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pbIV$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1979.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbIV$VH() {
        return constants$1979.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbIV;
     * }
     */
    public static int cbIV$get(MemorySegment seg) {
        return (int)constants$1979.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbIV;
     * }
     */
    public static void cbIV$set(MemorySegment seg, int x) {
        constants$1979.const$2.set(seg, x);
    }
    public static int cbIV$get(MemorySegment seg, long index) {
        return (int)constants$1979.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cbIV$set(MemorySegment seg, long index, int x) {
        constants$1979.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbOtherInfo$VH() {
        return constants$1979.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbOtherInfo;
     * }
     */
    public static MemorySegment pbOtherInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1979.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbOtherInfo;
     * }
     */
    public static void pbOtherInfo$set(MemorySegment seg, MemorySegment x) {
        constants$1979.const$3.set(seg, x);
    }
    public static MemorySegment pbOtherInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1979.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pbOtherInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1979.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbOtherInfo$VH() {
        return constants$1979.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbOtherInfo;
     * }
     */
    public static int cbOtherInfo$get(MemorySegment seg) {
        return (int)constants$1979.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbOtherInfo;
     * }
     */
    public static void cbOtherInfo$set(MemorySegment seg, int x) {
        constants$1979.const$4.set(seg, x);
    }
    public static int cbOtherInfo$get(MemorySegment seg, long index) {
        return (int)constants$1979.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbOtherInfo$set(MemorySegment seg, long index, int x) {
        constants$1979.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

