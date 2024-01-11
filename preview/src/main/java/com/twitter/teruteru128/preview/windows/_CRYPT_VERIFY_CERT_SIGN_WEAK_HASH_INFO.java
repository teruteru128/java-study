// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_VERIFY_CERT_SIGN_WEAK_HASH_INFO {
 *     DWORD cCNGHashAlgid;
 *     PCWSTR* rgpwszCNGHashAlgid;
 *     DWORD dwWeakIndex;
 * };
 * }
 */
public class _CRYPT_VERIFY_CERT_SIGN_WEAK_HASH_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2162.const$3;
    }
    public static VarHandle cCNGHashAlgid$VH() {
        return constants$2162.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cCNGHashAlgid;
     * }
     */
    public static int cCNGHashAlgid$get(MemorySegment seg) {
        return (int)constants$2162.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cCNGHashAlgid;
     * }
     */
    public static void cCNGHashAlgid$set(MemorySegment seg, int x) {
        constants$2162.const$4.set(seg, x);
    }
    public static int cCNGHashAlgid$get(MemorySegment seg, long index) {
        return (int)constants$2162.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cCNGHashAlgid$set(MemorySegment seg, long index, int x) {
        constants$2162.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgpwszCNGHashAlgid$VH() {
        return constants$2162.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCWSTR* rgpwszCNGHashAlgid;
     * }
     */
    public static MemorySegment rgpwszCNGHashAlgid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2162.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCWSTR* rgpwszCNGHashAlgid;
     * }
     */
    public static void rgpwszCNGHashAlgid$set(MemorySegment seg, MemorySegment x) {
        constants$2162.const$5.set(seg, x);
    }
    public static MemorySegment rgpwszCNGHashAlgid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2162.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpwszCNGHashAlgid$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2162.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwWeakIndex$VH() {
        return constants$2163.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwWeakIndex;
     * }
     */
    public static int dwWeakIndex$get(MemorySegment seg) {
        return (int)constants$2163.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwWeakIndex;
     * }
     */
    public static void dwWeakIndex$set(MemorySegment seg, int x) {
        constants$2163.const$0.set(seg, x);
    }
    public static int dwWeakIndex$get(MemorySegment seg, long index) {
        return (int)constants$2163.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwWeakIndex$set(MemorySegment seg, long index, int x) {
        constants$2163.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


