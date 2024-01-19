// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_URL_ARRAY {
 *     DWORD cUrl;
 *     LPWSTR* rgwszUrl;
 * };
 * }
 */
public class _CRYPT_URL_ARRAY {

    public static MemoryLayout $LAYOUT() {
        return constants$2199.const$1;
    }
    public static VarHandle cUrl$VH() {
        return constants$2199.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cUrl;
     * }
     */
    public static int cUrl$get(MemorySegment seg) {
        return (int)constants$2199.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cUrl;
     * }
     */
    public static void cUrl$set(MemorySegment seg, int x) {
        constants$2199.const$2.set(seg, x);
    }
    public static int cUrl$get(MemorySegment seg, long index) {
        return (int)constants$2199.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cUrl$set(MemorySegment seg, long index, int x) {
        constants$2199.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgwszUrl$VH() {
        return constants$2199.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR* rgwszUrl;
     * }
     */
    public static MemorySegment rgwszUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2199.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR* rgwszUrl;
     * }
     */
    public static void rgwszUrl$set(MemorySegment seg, MemorySegment x) {
        constants$2199.const$3.set(seg, x);
    }
    public static MemorySegment rgwszUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2199.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void rgwszUrl$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2199.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

