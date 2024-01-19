// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CPS_URLS {
 *     LPWSTR pszURL;
 *     CRYPT_ALGORITHM_IDENTIFIER* pAlgorithm;
 *     CRYPT_DATA_BLOB* pDigest;
 * };
 * }
 */
public class _CPS_URLS {

    public static MemoryLayout $LAYOUT() {
        return constants$2032.const$2;
    }
    public static VarHandle pszURL$VH() {
        return constants$2032.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszURL;
     * }
     */
    public static MemorySegment pszURL$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2032.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszURL;
     * }
     */
    public static void pszURL$set(MemorySegment seg, MemorySegment x) {
        constants$2032.const$3.set(seg, x);
    }
    public static MemorySegment pszURL$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2032.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pszURL$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2032.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pAlgorithm$VH() {
        return constants$2032.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * CRYPT_ALGORITHM_IDENTIFIER* pAlgorithm;
     * }
     */
    public static MemorySegment pAlgorithm$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2032.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * CRYPT_ALGORITHM_IDENTIFIER* pAlgorithm;
     * }
     */
    public static void pAlgorithm$set(MemorySegment seg, MemorySegment x) {
        constants$2032.const$4.set(seg, x);
    }
    public static MemorySegment pAlgorithm$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2032.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pAlgorithm$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2032.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDigest$VH() {
        return constants$2032.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * CRYPT_DATA_BLOB* pDigest;
     * }
     */
    public static MemorySegment pDigest$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2032.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * CRYPT_DATA_BLOB* pDigest;
     * }
     */
    public static void pDigest$set(MemorySegment seg, MemorySegment x) {
        constants$2032.const$5.set(seg, x);
    }
    public static MemorySegment pDigest$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2032.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pDigest$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2032.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

