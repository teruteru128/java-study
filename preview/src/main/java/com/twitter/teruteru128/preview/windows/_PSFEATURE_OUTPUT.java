// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PSFEATURE_OUTPUT {
 *     BOOL bPageIndependent;
 *     BOOL bSetPageDevice;
 * };
 * }
 */
public class _PSFEATURE_OUTPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$885.const$3;
    }
    public static VarHandle bPageIndependent$VH() {
        return constants$885.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL bPageIndependent;
     * }
     */
    public static int bPageIndependent$get(MemorySegment seg) {
        return (int)constants$885.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL bPageIndependent;
     * }
     */
    public static void bPageIndependent$set(MemorySegment seg, int x) {
        constants$885.const$4.set(seg, x);
    }
    public static int bPageIndependent$get(MemorySegment seg, long index) {
        return (int)constants$885.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void bPageIndependent$set(MemorySegment seg, long index, int x) {
        constants$885.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bSetPageDevice$VH() {
        return constants$885.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL bSetPageDevice;
     * }
     */
    public static int bSetPageDevice$get(MemorySegment seg) {
        return (int)constants$885.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL bSetPageDevice;
     * }
     */
    public static void bSetPageDevice$set(MemorySegment seg, int x) {
        constants$885.const$5.set(seg, x);
    }
    public static int bSetPageDevice$get(MemorySegment seg, long index) {
        return (int)constants$885.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bSetPageDevice$set(MemorySegment seg, long index, int x) {
        constants$885.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


