// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _lldiv_t {
 *     long long quot;
 *     long long rem;
 * };
 * }
 */
public class _lldiv_t {

    public static MemoryLayout $LAYOUT() {
        return constants$33.const$4;
    }
    public static VarHandle quot$VH() {
        return constants$33.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long quot;
     * }
     */
    public static long quot$get(MemorySegment seg) {
        return (long)constants$33.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long quot;
     * }
     */
    public static void quot$set(MemorySegment seg, long x) {
        constants$33.const$5.set(seg, x);
    }
    public static long quot$get(MemorySegment seg, long index) {
        return (long)constants$33.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void quot$set(MemorySegment seg, long index, long x) {
        constants$33.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rem$VH() {
        return constants$34.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long rem;
     * }
     */
    public static long rem$get(MemorySegment seg) {
        return (long)constants$34.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long rem;
     * }
     */
    public static void rem$set(MemorySegment seg, long x) {
        constants$34.const$0.set(seg, x);
    }
    public static long rem$get(MemorySegment seg, long index) {
        return (long)constants$34.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void rem$set(MemorySegment seg, long index, long x) {
        constants$34.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


