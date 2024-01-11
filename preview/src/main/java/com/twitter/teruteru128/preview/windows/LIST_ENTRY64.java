// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct LIST_ENTRY64 {
 *     ULONGLONG Flink;
 *     ULONGLONG Blink;
 * };
 * }
 */
public class LIST_ENTRY64 {

    public static MemoryLayout $LAYOUT() {
        return constants$26.const$3;
    }
    public static VarHandle Flink$VH() {
        return constants$26.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG Flink;
     * }
     */
    public static long Flink$get(MemorySegment seg) {
        return (long)constants$26.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG Flink;
     * }
     */
    public static void Flink$set(MemorySegment seg, long x) {
        constants$26.const$4.set(seg, x);
    }
    public static long Flink$get(MemorySegment seg, long index) {
        return (long)constants$26.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Flink$set(MemorySegment seg, long index, long x) {
        constants$26.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Blink$VH() {
        return constants$26.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG Blink;
     * }
     */
    public static long Blink$get(MemorySegment seg) {
        return (long)constants$26.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG Blink;
     * }
     */
    public static void Blink$set(MemorySegment seg, long x) {
        constants$26.const$5.set(seg, x);
    }
    public static long Blink$get(MemorySegment seg, long index) {
        return (long)constants$26.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Blink$set(MemorySegment seg, long index, long x) {
        constants$26.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

