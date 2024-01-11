// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_CSP_PROVIDER {
 *     DWORD dwKeySpec;
 *     LPWSTR pwszProviderName;
 *     CRYPT_BIT_BLOB Signature;
 * };
 * }
 */
public class _CRYPT_CSP_PROVIDER {

    public static MemoryLayout $LAYOUT() {
        return constants$2020.const$3;
    }
    public static VarHandle dwKeySpec$VH() {
        return constants$2020.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwKeySpec;
     * }
     */
    public static int dwKeySpec$get(MemorySegment seg) {
        return (int)constants$2020.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwKeySpec;
     * }
     */
    public static void dwKeySpec$set(MemorySegment seg, int x) {
        constants$2020.const$4.set(seg, x);
    }
    public static int dwKeySpec$get(MemorySegment seg, long index) {
        return (int)constants$2020.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeySpec$set(MemorySegment seg, long index, int x) {
        constants$2020.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pwszProviderName$VH() {
        return constants$2020.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pwszProviderName;
     * }
     */
    public static MemorySegment pwszProviderName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2020.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pwszProviderName;
     * }
     */
    public static void pwszProviderName$set(MemorySegment seg, MemorySegment x) {
        constants$2020.const$5.set(seg, x);
    }
    public static MemorySegment pwszProviderName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2020.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszProviderName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2020.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Signature$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


