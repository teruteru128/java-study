// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_PROVIDERS {
 *     ULONG cProviders;
 *     PWSTR* rgpszProviders;
 * };
 * }
 */
public class _CRYPT_PROVIDERS {

    public static MemoryLayout $LAYOUT() {
        return constants$1967.const$4;
    }
    public static VarHandle cProviders$VH() {
        return constants$1967.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cProviders;
     * }
     */
    public static int cProviders$get(MemorySegment seg) {
        return (int)constants$1967.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cProviders;
     * }
     */
    public static void cProviders$set(MemorySegment seg, int x) {
        constants$1967.const$5.set(seg, x);
    }
    public static int cProviders$get(MemorySegment seg, long index) {
        return (int)constants$1967.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cProviders$set(MemorySegment seg, long index, int x) {
        constants$1967.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgpszProviders$VH() {
        return constants$1968.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PWSTR* rgpszProviders;
     * }
     */
    public static MemorySegment rgpszProviders$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1968.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PWSTR* rgpszProviders;
     * }
     */
    public static void rgpszProviders$set(MemorySegment seg, MemorySegment x) {
        constants$1968.const$0.set(seg, x);
    }
    public static MemorySegment rgpszProviders$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1968.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszProviders$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1968.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


