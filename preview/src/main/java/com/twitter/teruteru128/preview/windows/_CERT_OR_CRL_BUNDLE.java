// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_OR_CRL_BUNDLE {
 *     DWORD cItem;
 *     PCERT_OR_CRL_BLOB rgItem;
 * };
 * }
 */
public class _CERT_OR_CRL_BUNDLE {

    public static MemoryLayout $LAYOUT() {
        return constants$2015.const$2;
    }
    public static VarHandle cItem$VH() {
        return constants$2015.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cItem;
     * }
     */
    public static int cItem$get(MemorySegment seg) {
        return (int)constants$2015.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cItem;
     * }
     */
    public static void cItem$set(MemorySegment seg, int x) {
        constants$2015.const$3.set(seg, x);
    }
    public static int cItem$get(MemorySegment seg, long index) {
        return (int)constants$2015.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cItem$set(MemorySegment seg, long index, int x) {
        constants$2015.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgItem$VH() {
        return constants$2015.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_OR_CRL_BLOB rgItem;
     * }
     */
    public static MemorySegment rgItem$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2015.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_OR_CRL_BLOB rgItem;
     * }
     */
    public static void rgItem$set(MemorySegment seg, MemorySegment x) {
        constants$2015.const$4.set(seg, x);
    }
    public static MemorySegment rgItem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2015.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void rgItem$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2015.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


