// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO {
 *     ULONG cbSize;
 *     ULONG dwInfoVersion;
 *     PUCHAR pbNonce;
 *     ULONG cbNonce;
 *     PUCHAR pbAuthData;
 *     ULONG cbAuthData;
 *     PUCHAR pbTag;
 *     ULONG cbTag;
 *     PUCHAR pbMacContext;
 *     ULONG cbMacContext;
 *     ULONG cbAAD;
 *     ULONGLONG cbData;
 *     ULONG dwFlags;
 * };
 * }
 */
public class _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1941.const$5;
    }
    public static VarHandle cbSize$VH() {
        return constants$1942.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1942.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1942.const$0.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1942.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1942.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwInfoVersion$VH() {
        return constants$1942.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwInfoVersion;
     * }
     */
    public static int dwInfoVersion$get(MemorySegment seg) {
        return (int)constants$1942.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwInfoVersion;
     * }
     */
    public static void dwInfoVersion$set(MemorySegment seg, int x) {
        constants$1942.const$1.set(seg, x);
    }
    public static int dwInfoVersion$get(MemorySegment seg, long index) {
        return (int)constants$1942.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInfoVersion$set(MemorySegment seg, long index, int x) {
        constants$1942.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbNonce$VH() {
        return constants$1942.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbNonce;
     * }
     */
    public static MemorySegment pbNonce$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1942.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbNonce;
     * }
     */
    public static void pbNonce$set(MemorySegment seg, MemorySegment x) {
        constants$1942.const$2.set(seg, x);
    }
    public static MemorySegment pbNonce$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1942.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pbNonce$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1942.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbNonce$VH() {
        return constants$1942.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbNonce;
     * }
     */
    public static int cbNonce$get(MemorySegment seg) {
        return (int)constants$1942.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbNonce;
     * }
     */
    public static void cbNonce$set(MemorySegment seg, int x) {
        constants$1942.const$3.set(seg, x);
    }
    public static int cbNonce$get(MemorySegment seg, long index) {
        return (int)constants$1942.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cbNonce$set(MemorySegment seg, long index, int x) {
        constants$1942.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbAuthData$VH() {
        return constants$1942.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbAuthData;
     * }
     */
    public static MemorySegment pbAuthData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1942.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbAuthData;
     * }
     */
    public static void pbAuthData$set(MemorySegment seg, MemorySegment x) {
        constants$1942.const$4.set(seg, x);
    }
    public static MemorySegment pbAuthData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1942.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pbAuthData$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1942.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbAuthData$VH() {
        return constants$1942.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbAuthData;
     * }
     */
    public static int cbAuthData$get(MemorySegment seg) {
        return (int)constants$1942.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbAuthData;
     * }
     */
    public static void cbAuthData$set(MemorySegment seg, int x) {
        constants$1942.const$5.set(seg, x);
    }
    public static int cbAuthData$get(MemorySegment seg, long index) {
        return (int)constants$1942.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAuthData$set(MemorySegment seg, long index, int x) {
        constants$1942.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbTag$VH() {
        return constants$1943.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbTag;
     * }
     */
    public static MemorySegment pbTag$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1943.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbTag;
     * }
     */
    public static void pbTag$set(MemorySegment seg, MemorySegment x) {
        constants$1943.const$0.set(seg, x);
    }
    public static MemorySegment pbTag$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1943.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pbTag$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1943.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbTag$VH() {
        return constants$1943.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbTag;
     * }
     */
    public static int cbTag$get(MemorySegment seg) {
        return (int)constants$1943.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbTag;
     * }
     */
    public static void cbTag$set(MemorySegment seg, int x) {
        constants$1943.const$1.set(seg, x);
    }
    public static int cbTag$get(MemorySegment seg, long index) {
        return (int)constants$1943.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbTag$set(MemorySegment seg, long index, int x) {
        constants$1943.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbMacContext$VH() {
        return constants$1943.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbMacContext;
     * }
     */
    public static MemorySegment pbMacContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1943.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbMacContext;
     * }
     */
    public static void pbMacContext$set(MemorySegment seg, MemorySegment x) {
        constants$1943.const$2.set(seg, x);
    }
    public static MemorySegment pbMacContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1943.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pbMacContext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1943.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbMacContext$VH() {
        return constants$1943.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbMacContext;
     * }
     */
    public static int cbMacContext$get(MemorySegment seg) {
        return (int)constants$1943.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbMacContext;
     * }
     */
    public static void cbMacContext$set(MemorySegment seg, int x) {
        constants$1943.const$3.set(seg, x);
    }
    public static int cbMacContext$get(MemorySegment seg, long index) {
        return (int)constants$1943.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cbMacContext$set(MemorySegment seg, long index, int x) {
        constants$1943.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbAAD$VH() {
        return constants$1943.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbAAD;
     * }
     */
    public static int cbAAD$get(MemorySegment seg) {
        return (int)constants$1943.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbAAD;
     * }
     */
    public static void cbAAD$set(MemorySegment seg, int x) {
        constants$1943.const$4.set(seg, x);
    }
    public static int cbAAD$get(MemorySegment seg, long index) {
        return (int)constants$1943.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAAD$set(MemorySegment seg, long index, int x) {
        constants$1943.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbData$VH() {
        return constants$1943.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG cbData;
     * }
     */
    public static long cbData$get(MemorySegment seg) {
        return (long)constants$1943.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG cbData;
     * }
     */
    public static void cbData$set(MemorySegment seg, long x) {
        constants$1943.const$5.set(seg, x);
    }
    public static long cbData$get(MemorySegment seg, long index) {
        return (long)constants$1943.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, long x) {
        constants$1943.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwFlags$VH() {
        return constants$1944.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)constants$1944.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        constants$1944.const$0.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)constants$1944.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        constants$1944.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


