// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_HASHED_URL {
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     CRYPT_HASH_BLOB Hash;
 *     LPWSTR pwszUrl;
 * };
 * }
 */
public class _CERT_HASHED_URL {

    public static MemoryLayout $LAYOUT() {
        return constants$2056.const$3;
    }
    public static MemorySegment HashAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static MemorySegment Hash$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static VarHandle pwszUrl$VH() {
        return constants$2056.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pwszUrl;
     * }
     */
    public static MemorySegment pwszUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2056.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pwszUrl;
     * }
     */
    public static void pwszUrl$set(MemorySegment seg, MemorySegment x) {
        constants$2056.const$4.set(seg, x);
    }
    public static MemorySegment pwszUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2056.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszUrl$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2056.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


