// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GENERIC_MAPPING {
 *     ACCESS_MASK GenericRead;
 *     ACCESS_MASK GenericWrite;
 *     ACCESS_MASK GenericExecute;
 *     ACCESS_MASK GenericAll;
 * };
 * }
 */
public class _GENERIC_MAPPING {

    public static MemoryLayout $LAYOUT() {
        return constants$139.const$2;
    }
    public static VarHandle GenericRead$VH() {
        return constants$139.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ACCESS_MASK GenericRead;
     * }
     */
    public static int GenericRead$get(MemorySegment seg) {
        return (int)constants$139.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ACCESS_MASK GenericRead;
     * }
     */
    public static void GenericRead$set(MemorySegment seg, int x) {
        constants$139.const$3.set(seg, x);
    }
    public static int GenericRead$get(MemorySegment seg, long index) {
        return (int)constants$139.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void GenericRead$set(MemorySegment seg, long index, int x) {
        constants$139.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle GenericWrite$VH() {
        return constants$139.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ACCESS_MASK GenericWrite;
     * }
     */
    public static int GenericWrite$get(MemorySegment seg) {
        return (int)constants$139.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ACCESS_MASK GenericWrite;
     * }
     */
    public static void GenericWrite$set(MemorySegment seg, int x) {
        constants$139.const$4.set(seg, x);
    }
    public static int GenericWrite$get(MemorySegment seg, long index) {
        return (int)constants$139.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void GenericWrite$set(MemorySegment seg, long index, int x) {
        constants$139.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle GenericExecute$VH() {
        return constants$139.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ACCESS_MASK GenericExecute;
     * }
     */
    public static int GenericExecute$get(MemorySegment seg) {
        return (int)constants$139.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ACCESS_MASK GenericExecute;
     * }
     */
    public static void GenericExecute$set(MemorySegment seg, int x) {
        constants$139.const$5.set(seg, x);
    }
    public static int GenericExecute$get(MemorySegment seg, long index) {
        return (int)constants$139.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void GenericExecute$set(MemorySegment seg, long index, int x) {
        constants$139.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle GenericAll$VH() {
        return constants$140.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ACCESS_MASK GenericAll;
     * }
     */
    public static int GenericAll$get(MemorySegment seg) {
        return (int)constants$140.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ACCESS_MASK GenericAll;
     * }
     */
    public static void GenericAll$set(MemorySegment seg, int x) {
        constants$140.const$0.set(seg, x);
    }
    public static int GenericAll$get(MemorySegment seg, long index) {
        return (int)constants$140.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void GenericAll$set(MemorySegment seg, long index, int x) {
        constants$140.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

