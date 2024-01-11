// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROCESS_MEMORY_EXHAUSTION_INFO {
 *     USHORT Version;
 *     USHORT Reserved;
 *     PROCESS_MEMORY_EXHAUSTION_TYPE Type;
 *     ULONG_PTR Value;
 * };
 * }
 */
public class _PROCESS_MEMORY_EXHAUSTION_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$654.const$4;
    }
    public static VarHandle Version$VH() {
        return constants$654.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT Version;
     * }
     */
    public static short Version$get(MemorySegment seg) {
        return (short)constants$654.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT Version;
     * }
     */
    public static void Version$set(MemorySegment seg, short x) {
        constants$654.const$5.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)constants$654.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        constants$654.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$655.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT Reserved;
     * }
     */
    public static short Reserved$get(MemorySegment seg) {
        return (short)constants$655.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, short x) {
        constants$655.const$0.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)constants$655.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        constants$655.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Type$VH() {
        return constants$655.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PROCESS_MEMORY_EXHAUSTION_TYPE Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)constants$655.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PROCESS_MEMORY_EXHAUSTION_TYPE Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        constants$655.const$1.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)constants$655.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        constants$655.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Value$VH() {
        return constants$655.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR Value;
     * }
     */
    public static long Value$get(MemorySegment seg) {
        return (long)constants$655.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR Value;
     * }
     */
    public static void Value$set(MemorySegment seg, long x) {
        constants$655.const$2.set(seg, x);
    }
    public static long Value$get(MemorySegment seg, long index) {
        return (long)constants$655.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Value$set(MemorySegment seg, long index, long x) {
        constants$655.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

