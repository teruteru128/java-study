// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _wireSAFEARR_BSTR {
 *     ULONG Size;
 *     wireBSTR* aBstr;
 * };
 * }
 */
public class _wireSAFEARR_BSTR {

    public static MemoryLayout $LAYOUT() {
        return constants$3409.const$4;
    }
    public static VarHandle Size$VH() {
        return constants$3409.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$3409.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$3409.const$5.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$3409.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$3409.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle aBstr$VH() {
        return constants$3410.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * wireBSTR* aBstr;
     * }
     */
    public static MemorySegment aBstr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3410.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * wireBSTR* aBstr;
     * }
     */
    public static void aBstr$set(MemorySegment seg, MemorySegment x) {
        constants$3410.const$0.set(seg, x);
    }
    public static MemorySegment aBstr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3410.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void aBstr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3410.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


