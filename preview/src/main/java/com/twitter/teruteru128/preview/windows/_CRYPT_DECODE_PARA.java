// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_DECODE_PARA {
 *     DWORD cbSize;
 *     PFN_CRYPT_ALLOC pfnAlloc;
 *     PFN_CRYPT_FREE pfnFree;
 * };
 * }
 */
public class _CRYPT_DECODE_PARA {

    public static MemoryLayout $LAYOUT() {
        return constants$2022.const$5;
    }
    public static VarHandle cbSize$VH() {
        return constants$2023.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2023.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2023.const$0.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2023.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2023.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pfnAlloc$VH() {
        return constants$2023.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CRYPT_ALLOC pfnAlloc;
     * }
     */
    public static MemorySegment pfnAlloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2023.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CRYPT_ALLOC pfnAlloc;
     * }
     */
    public static void pfnAlloc$set(MemorySegment seg, MemorySegment x) {
        constants$2023.const$1.set(seg, x);
    }
    public static MemorySegment pfnAlloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2023.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnAlloc$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2023.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_ALLOC pfnAlloc(MemorySegment segment, Arena scope) {
        return PFN_CRYPT_ALLOC.ofAddress(pfnAlloc$get(segment), scope);
    }
    public static VarHandle pfnFree$VH() {
        return constants$2023.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CRYPT_FREE pfnFree;
     * }
     */
    public static MemorySegment pfnFree$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2023.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CRYPT_FREE pfnFree;
     * }
     */
    public static void pfnFree$set(MemorySegment seg, MemorySegment x) {
        constants$2023.const$2.set(seg, x);
    }
    public static MemorySegment pfnFree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2023.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2023.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_FREE pfnFree(MemorySegment segment, Arena scope) {
        return PFN_CRYPT_FREE.ofAddress(pfnFree$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


