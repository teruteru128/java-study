// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCABSTR {
 *     ULONG cElems;
 *     BSTR* pElems;
 * };
 * }
 */
public class tagCABSTR {

    public static MemoryLayout $LAYOUT() {
        return constants$3589.const$0;
    }
    public static VarHandle cElems$VH() {
        return constants$3589.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cElems;
     * }
     */
    public static int cElems$get(MemorySegment seg) {
        return (int)constants$3589.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cElems;
     * }
     */
    public static void cElems$set(MemorySegment seg, int x) {
        constants$3589.const$1.set(seg, x);
    }
    public static int cElems$get(MemorySegment seg, long index) {
        return (int)constants$3589.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cElems$set(MemorySegment seg, long index, int x) {
        constants$3589.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pElems$VH() {
        return constants$3589.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BSTR* pElems;
     * }
     */
    public static MemorySegment pElems$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3589.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BSTR* pElems;
     * }
     */
    public static void pElems$set(MemorySegment seg, MemorySegment x) {
        constants$3589.const$2.set(seg, x);
    }
    public static MemorySegment pElems$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3589.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pElems$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3589.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


